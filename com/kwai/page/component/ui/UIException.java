package com.kwai.page.component.ui.UIException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class UIException extends RuntimeException	// class@001044
{

    public void UIException(){
       super();
    }
    public void UIException(String p0){
       super(p0);
    }
    public void UIException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void UIException(Throwable p0){
       super(p0);
    }
}
