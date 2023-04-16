package com.kwai.emotionsdk.core.exception.BaseException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public class BaseException extends Exception	// class@000d95
{

    public void BaseException(){
       super();
    }
    public void BaseException(String p0){
       a.p(p0, "message");
       super(p0);
    }
    public void BaseException(String p0,Throwable p1){
       a.p(p0, "message");
       a.p(p1, "cause");
       super(p0, p1);
    }
    public void BaseException(Throwable p0){
       a.p(p0, "cause");
       super(p0);
    }
}
