package services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true)
public class RameshService {

    private static final Logger LOG = LoggerFactory.getLogger(RameshService.class);
    @Reference
    ArjunaService arjunaService;
    @Activate
    public void activate(){

        String R =arjunaService.Fruit();
        LOG.info("Ramesh service activate() exicution started");
        LOG.info("ramesh{}", R);
    }
    
    @Deactivate
    public void deActivate(){
        LOG.info("Ramesh Service deActive() exicution started");
    }
    
    @Modified
    public void modifier(){
        LOG.info("Ramesh Services modifier() exicution started");
    }

}
