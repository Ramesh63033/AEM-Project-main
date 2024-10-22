package services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = ArjunaService.class)
public class ArjunaService {
  
     private static final Logger LOG =LoggerFactory.getLogger(ArjunaService.class);
     
     @Activate
     public void activate(){
        LOG.info("Arjuna services activate() exicution started");
     }
     @Deactivate
     public void deActivate(){
        LOG.info("Arjuna Service deActive() exicution started");
     }
     @Modified
     public void Update(){
        LOG.info("Arjuna Service update() exicution started");
     }
     public String Fruit(){

        return "Data is coming from the Fruit()";
     }
}
