package com.kwai.page.component.state.StateException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class StateException extends RuntimeException	// class@001042
{

    public void StateException(String p0){
       super(p0);
    }
    public void StateException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void StateException(Throwable p0){
       super(p0);
    }
}
