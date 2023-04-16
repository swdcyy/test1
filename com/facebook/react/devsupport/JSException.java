package com.facebook.react.devsupport.JSException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class JSException extends Exception	// class@00125c
{
    public final String mStack;

    public void JSException(String p0,String p1){
       super(p0);
       this.mStack = p1;
    }
    public void JSException(String p0,String p1,Throwable p2){
       super(p0, p2);
       this.mStack = p1;
    }
    public String getStack(){
       return this.mStack;
    }
}
