package com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public abstract class BasePlcException extends Exception	// class@001663
{

    public void BasePlcException(String p0){
       a.p(p0, "message");
       super(p0);
    }
    public void BasePlcException(String p0,Throwable p1){
       a.p(p0, "message");
       a.p(p1, "cause");
       super(p0, p1);
    }
}
