package com.kuaishou.commercial.splash.SplashException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class SplashException extends RuntimeException	// class@00157f
{

    public void SplashException(String p0){
       super(p0);
    }
    public void SplashException(String p0,Throwable p1){
       super(p0, p1);
    }
}
