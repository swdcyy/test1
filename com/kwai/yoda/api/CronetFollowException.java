package com.kwai.yoda.api.CronetFollowException;
import java.lang.RuntimeException;
import okhttp3.Response$Builder;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;

public final class CronetFollowException extends RuntimeException	// class@00116b
{
    public final Response$Builder priorResponse;

    public void CronetFollowException(Response$Builder p0){
       a.q(p0, "priorResponse");
       super("follow-up", null);
       this.priorResponse = p0;
    }
    public final Response$Builder getPriorResponse(){
       return this.priorResponse;
    }
}
