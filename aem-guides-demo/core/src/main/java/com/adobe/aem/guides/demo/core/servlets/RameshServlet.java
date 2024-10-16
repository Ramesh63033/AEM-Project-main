package com.adobe.aem.guides.demo.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;

@Component(service = Servlet.class, enabled = true, immediate = true )
@SlingServletPaths(value = "/libs/ramesh/sling/servlet")
public class RameshServlet extends SlingAllMethodsServlet {

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
             response.getWriter().write("Konidala Pawan Kalyan[3] (born Konidala Kalyan Kumar;[8] 2 September 1971)[2] is an Indian politician, actor and philanthropist serving as the 10th Deputy Chief Minister of Andhra Pradesh since June 2024. He is also the Minister of Panchayat Raj, Rural Development and Rural Water Supply; Environment, Forests, Science and Technology in the Government of Andhra Pradesh and an MLA representing the Pitapuram constituency.[3] He is the founder and president of the Janasena Party.\r\n" + //
                                  "\r\n" + //
                                  "As an actor, Kalyan is known for his distinctive style and mannerisms in Telugu cinema. He enjoys a huge fanbase across the Telugu states, often described as \"unfathomable,\" \"fiercely loyal,\" and akin to a \"cult following.\"[12] He is among the highest-paid actors in Indian cinema and has been featured in Forbes India's Celebrity 100 list multiple times since 2012.[13][18] He is the recipient of a Filmfare Award and a SIIMA Award among other accolades.\r\n" + //
                                  "\r\n" + //
                                  "Kalyan made his acting debut in the 1996 film Akkada Ammayi Ikkada Abbayi. Then, he had a streak of six consecutive hits, among which Tholi Prema (1998), Thammudu (1999), Badri (2000), and Kushi (2001) became back-to-back blockbusters. These films established Kalyan as a youth icon with a massive following distinct from his elder brother Chiranjeevi's fanbase.[9][11] In 2001, he became the first ever South Indian brand ambassador for Pepsi.[22] Kalyan later faced a slump, yet his popularity kept soaring despite the flops.[24] He made a comeback with Jalsa (2008), the highest-grossing Telugu film of that year, and continued with hits like Gabbar Singh (2012), Attarintiki Daredi (2013), Gopala Gopala (2015), and Bheemla Nayak (2022). He received the Filmfare Award for Best Actor for Gabbar Singh. Both Kushi and Attarintiki Daredi held the record for the highest-grossing Telugu film of its era.[25]\r\n" + //
                                  "\r\n" + //
                                  "Kalyan holds a black belt in Karate.[26] In 1997, he was awarded the title \"Pawan\" by the Isshin-ryū Karate Association after a public martial arts demonstration.[27] He practices various martial arts, which he regularly showcases in his films both as a performer and an action choreographer. He is known as \"Power Star\" among his fans and the media.[28] Kalyan is also recognized for his extensive philanthropic work, supporting various social causes.[29] He has offered financial assistance to both individuals and organizations in need. In 2007, he established the charity Common Man Protection Force.[32]");
    }
   
    

}
