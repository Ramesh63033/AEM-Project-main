package com.adobe.aem.guides.demo.core.servlets;



import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;


@Component(service = Servlet.class, enabled = true, immediate = true)
@SlingServletResourceTypes(
    resourceTypes = "demo/components/page", // Replace with your actual resource type
    methods = "GET",
    extensions = "txt"
)
public class PavanServlet extends SlingSafeMethodsServlet{
        
          @Override
          protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
                  throws ServletException, IOException {
                  response.getWriter().write("\"llu Arjun (born 8 April 1982) is an Indian actor who works in Telugu cinema. One of the highest-paid actors in Indian cinema,[1] Allu Arjun has been featured in Forbes India's Celebrity 100 list since 2014.[2] He is a recipient of several awards including a National Film Award, six Filmfare Awards, and three Nandi Awards.[3] He is regarded as one of the finest dancers in Indian cinema.[4] He is popularly referred to as \\\"Stylish Star\\\" and \\\"Icon Star\\\".[5]\\r\\n" + //
                                                    "\" + //\r\n" + //
                                                    "                                          \"\\r\\n" + //
                                                    "\" + //\r\n" + //
                                                    "                                          \"Allu Arjun made his debut with Gangotri in 2003. He rose to prominence starring in Sukumar's cult classic Arya (2004) for which he earned a Nandi Special Jury Award.[6] He consolidated his reputation with the action films Bunny (2005) and Desamuduru (2007). In 2008, he starred in the romantic drama Parugu for which he won his first Filmfare Award for Best Actor – Telugu.[7]\\r\\n" + //
                                                    "\" + //\r\n" + //
                                                    "                                          \"\\r\\n" + //
                                                    "\" + //\r\n" + //
                                                    "                                          \"Allu Arjun went on to star in notable films such as Arya 2 (2009), Vedam (2010), Julayi (2012), Race Gurram (2014), S/O Satyamurthy (2015), Rudhramadevi (2015), Sarrainodu (2016), DJ: Duvvada Jagannadham (2017), Ala Vaikunthapurramuloo (2020) and Pushpa: The Rise (2021). His performances as a lower-class cable operator in Vedam and as a carefree street smart man in Race Gurram won him two Filmfare Awards for Best Actor – Telugu. He also won the Filmfare Award for Best Supporting Actor for his portrayal of prince Gona Ganna Reddy in Rudhramadevi. He received high acclaim for his performance in Pushpa: The Rise, which emerged as the highest-grossing Indian film in 2021 and ranks among the highest-grossing Telugu films of all time. The film also earned him his first National Film Award for Best Actor, and fourth Filmfare Award for Best Actor – Telugu.\");");
          }
        
}
