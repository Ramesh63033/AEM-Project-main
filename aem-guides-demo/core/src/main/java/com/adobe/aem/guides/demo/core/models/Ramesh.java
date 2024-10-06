package com.adobe.aem.guides.demo.core.models;

import java.util.Date;

import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;





@Model(adaptables = {Resource.class,SlingHttpServletRequest.class},defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Ramesh implements Ramesh1{

    @ValueMapValue

    @Default(values = "I phone 15 pro")
    @Named(value = "sling:resourceType")
    private String srt;
    @ValueMapValue
    private String img;
    @ValueMapValue
    private int num;
    @ValueMapValue
    @Required
    private String descrption;
    @ValueMapValue
    private Date date;

    @ScriptVariable
    Page currentPage;

   


    @Override
    public Date getDate() {
        // TODO Auto-generated method stub
        return date;
    }
    @Override
    public String getDescrption() {
        // TODO Auto-generated method stub
        return descrption;
    }
    @Override
    public String getImg() {
        // TODO Auto-generated method stub
        return img;
    }
    @Override
    public int getNum() {
        // TODO Auto-generated method stub
        return num;
    }
    @Override
    public String getTextfield() {
        // TODO Auto-generated method stub
        return srt;
    }
    @Override
    public String getPageTitle() {
        // TODO Auto-generated method stub
        return currentPage.getPageTitle();
    }
   

}
