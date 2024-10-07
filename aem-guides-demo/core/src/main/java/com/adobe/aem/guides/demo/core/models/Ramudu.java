package com.adobe.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables =Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Ramudu {
   @ValueMapValue
   private String navigationurl;

   @ValueMapValue
   private String name;

   @ValueMapValue
   private String mobileicon;

   @ValueMapValue
   private String logopath;

   @ValueMapValue
   private String logolink;

   @ValueMapValue
   private String img;

   @ValueMapValue
   private String enableSwitch;

   @ValueMapValue
   private String desktopicon;

   @ValueMapValue
   private String country;

  public String getNavigationurl(){

    return navigationurl;
  }
  public String getName(){
    return name;

  }
  public String getMobileicon(){
    return mobileicon;
  }
  public String getLogopath(){
    return logopath;
  }
  public String getLogolink(){
    return logolink;
  }
  public String getImage(){
    return img;
  }
  public String getenableSwitch(){
    return enableSwitch;
  }
  public String getdesktopicon(){
    return desktopicon;
  }
  public String getcountry(){
    return country;
  }

}
