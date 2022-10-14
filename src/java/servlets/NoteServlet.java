package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String verify = request.getParameter("edit");
         
         BufferedReader line = new BufferedReader(new FileReader(new File(getServletContext().getRealPath("/WEB-INF/note.txt"))));
         
         String title = line.readLine();
         String content = line.readLine();
         
         Note view = new Note(title, content);
         
         request.setAttribute("view", view);
         
         //to verify which file to open
         if(verify == null)
         {
             getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
             return;
         }
         else
         {
             getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
             return;
         }
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter(getServletContext().getRealPath("/WEB-INF/note.txt"))));
        
        String title = request.getParameter("Title");
        String content = request.getParameter("Content");
        
        Note view = new Note(title, content);
        
        print.write(view.getTitle());
        print.write("/n" + view.getContent());
        
        request.setAttribute("view", view);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;       
    }

}
