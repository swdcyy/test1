package com.kwai.robust.RobustException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class RobustException extends RuntimeException	// class@001407
{

    public void RobustException(){
       super();
    }
    public void RobustException(String p0){
       super(p0);
    }
    public void RobustException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void RobustException(Throwable p0){
       super(p0);
    }
}
