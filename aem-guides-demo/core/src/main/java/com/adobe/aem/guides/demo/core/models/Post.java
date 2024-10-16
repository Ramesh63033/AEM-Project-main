package com.adobe.aem.guides.demo.core.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
//@Model: The @Model is used to convert the noraml java class into the sling model 
//adaptables: which is an parameters, and which is used to specific the what type of the model
//adaptable: which is an sourceobjcet , and which is ued to convert the instance of the model object 
//Resource.class: which is used to represent the node form the java content repository, and it's contain the properties and childResources
public class Post {
    
    @ValueMapValue
    private String text;

    @ValueMapValue//which is used to inject the specific propertie from the content node 
    private String img;

   

    public String getText(){
        return text;
    }
    public String getImg(){
        return img;
    }
    
    @SlingObject
    private SlingHttpServletRequest request;

    @SlingObject
    private ResourceResolver resolver;

    @SlingObject
    private Resource resource;

    @SlingObject
    private Page page;
    

    @PostConstruct  //whenever we want to use same logics inside the @Post Construct, the postconstruct method will be inject the data by default
    public void init(){
        resolver =request.getResourceResolver();//whihc is a predefined method in AEM, which is mostly usedo to access and interact with resource in a java content repository
        resource =resolver.getResource(img);//getResource: which is used to retreive the resource from the reposiroy and assign to the resouce 
        page =resource.adaptTo(Page.class);// adpatTo(Page.class): which is used to convet the one type of the object into the another type of the object if the conversion passioable 
    }

    public List<String> getRamesh(){
        
        List<String> R =new ArrayList<String>();
        Iterator<Page> itr = page.listChildren();//the iteratore method is used to retreice the emlement in forword direction

       while (itr.hasNext()) {// which is mostly used to iterator more elements int the collecton 
            R.add(itr.next().getName());// next(): which is used to return the next elements in iteratore
       }
       return R;


    }


   

    
   
}
