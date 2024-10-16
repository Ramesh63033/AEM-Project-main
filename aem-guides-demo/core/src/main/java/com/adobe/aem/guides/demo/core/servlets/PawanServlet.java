package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class, enabled = true, immediate = true)
@SlingServletResourceTypes(resourceTypes = "demo/service/resource/type")
public class PawanServlet extends SlingAllMethodsServlet {
        
         @Override
         protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
                 throws ServletException, IOException {
                String  StudentName =request.getParameter("StudentName");
                String  StudentRollNumber=request.getParameter("StudentRollNumber");

                response.getWriter().write(StudentName);
                response.getWriter().write(StudentRollNumber);
         }
}
