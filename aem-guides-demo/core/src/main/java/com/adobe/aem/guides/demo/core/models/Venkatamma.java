package com.adobe.aem.guides.demo.core.models;


import javax.inject.Inject;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables=Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Venkatamma {






@Inject

private String studentmarks;

@Inject
private String studentlastname;

@Inject
private String studentfirstname;

@Inject
private String studentbio;

@Inject
private String employeelastname;

@Inject
private String employeeid;

@Inject
private String employeefirstname;

@Inject
private String employeeemailid;

public String getRamesh(){
    return studentmarks;

}
public String getRamu(){
    return studentlastname;
}
public String getRamudu(){
    return studentfirstname;
}
public String getRani(){
    return studentbio;
}
public String getVenkatamma(){
    return employeelastname;
}
public String getApple(){
    return employeeid;
}
public String getIceApple(){
    return employeefirstname;
}
public String getCustradApple(){
   return  employeeemailid;
}

}


