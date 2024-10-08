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

@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Gloabal {

   @ValueMapValue
   private String path;

   @SlingObject
   private SlingHttpServletRequest request;

   @SlingObject
   private ResourceResolver resolver;

   @SlingObject
   private Resource resource;

   @SlingObject
   private Page page;
   
   @PostConstruct
   public void init(){
      resolver=request.getResourceResolver();
      resource =resolver.getResource(path);
      page = resource.adaptTo(Page.class);
   }
   public List getChildPages(){
       List<String> list=new ArrayList<String>();
       Iterator<Page> itr=page.listChildren();
       while(itr.hasNext()){
            list.add("Page Path: " +itr.next().getPath());
            list.add("Page Names:" +itr.next().getName());
       }
       return list;
   }

}
