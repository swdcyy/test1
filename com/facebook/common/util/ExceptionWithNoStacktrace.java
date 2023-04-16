package com.facebook.common.util.ExceptionWithNoStacktrace;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;

public class ExceptionWithNoStacktrace extends Exception	// class@001071
{

    public void ExceptionWithNoStacktrace(String p0){
       super(p0);
    }
    public synchronized Throwable fillInStackTrace(){
       return this;
    }
}
