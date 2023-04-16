package com.kwai.framework.model.decompose.api.ParseException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public final class ParseException extends Exception	// class@001693
{

    public void ParseException(String p0){
       a.p(p0, "msg");
       super(p0, null);
    }
    public void ParseException(String p0,Throwable p1){
       a.p(p0, "msg");
       super(p0, p1);
    }
}
