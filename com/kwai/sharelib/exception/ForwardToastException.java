package com.kwai.sharelib.exception.ForwardToastException;
import wo7.a;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Exception;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public final class ForwardToastException extends RuntimeException implements a	// class@0016c1
{
    public final String toast;

    public void ForwardToastException(String p0,Exception p1){
       a.p(p1, "cause");
       super(p0, p1);
       this.toast = p0;
    }
    public String getToast(){
       return this.toast;
    }
}
