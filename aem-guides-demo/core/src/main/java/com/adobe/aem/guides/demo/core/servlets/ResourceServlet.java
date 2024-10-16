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
@SlingServletResourceTypes(resourceTypes="demo/ramesh/surge")
public class ResourceServlet extends SlingAllMethodsServlet{
     @Override
     protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
             throws ServletException, IOException {
            String FirstName=request.getParameter("FirstName");
            String  LastName =request.getParameter("LastName");
            
            String fullName= FirstName+ " " +LastName;

            response.getWriter().write(fullName);
     }

}
