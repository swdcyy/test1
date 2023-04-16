package com.kwai.framework.model.decompose.api.PartDescribeException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public final class PartDescribeException extends Exception	// class@001694
{

    public void PartDescribeException(String p0){
       a.p(p0, "msg");
       super(p0, null);
    }
    public void PartDescribeException(String p0,Throwable p1){
       a.p(p0, "msg");
       super(p0, p1);
    }
}
