package com.kwai.page.component.ComponentException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class ComponentException extends RuntimeException	// class@001038
{

    public void ComponentException(){
       super();
    }
    public void ComponentException(String p0){
       super(p0);
    }
    public void ComponentException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void ComponentException(Throwable p0){
       super(p0);
    }
}
