package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class, enabled = true, immediate = true)
@SlingServletPaths(value = "/bin/service/getfullName")
public class Demo1Servlet extends SlingAllMethodsServlet{

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
            String fname=request.getParameter("fname");
            String lname=request.getParameter("lname");
            String fullName= fname + " " +lname;

            response.setContentType("plain/type");
            response.getWriter().write(fullName);

           
    }
    @Override
    protected void doPut(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
            response.getWriter().write("msg is coming from doput()");
    }
    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
            response.getWriter().write("msg if coming from dopost()");
    }
    @Override
    protected void doDelete(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
           response.getWriter().write("msg is coming from the doDelete()");
    }
    

}
