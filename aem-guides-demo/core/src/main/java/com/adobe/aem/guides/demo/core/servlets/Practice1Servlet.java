package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;

import org.osgi.service.component.annotations.Component;

@Component(service =Servlet.class, enabled = true, immediate = true)
@SlingServletPaths(value  = "demo/service/practie/getFullName")
public class Practice1Servlet extends SlingAllMethodsServlet {

      @Override
      protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
              throws ServletException, IOException {
              String fname =request.getParameter("fname");
              String flname=request.getParameter("flname");

              String fullName=fname + " " +flname;
              
              response.setContentType("plain/type");
              response.getWriter().write(fullName);
      }
}
