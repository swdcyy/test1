package com.kwai.middleware.leia.response.LeiaRequestException;
import java.io.IOException;
import java.lang.Throwable;
import okhttp3.Request;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class LeiaRequestException extends IOException	// class@000f33
{
    public final String expiresTime;
    public final int httpCode;
    public final Request request;

    public void LeiaRequestException(Throwable p0,Request p1,int p2,String p3){
       a.q(p0, "cause");
       super(p0);
       this.request = p1;
       this.httpCode = p2;
       this.expiresTime = p3;
    }
    public void LeiaRequestException(Throwable p0,Request p1,int p2,String p3,int p4,u p5){
       if (p4 & 0x04) {
          p2 = 0;
       }
       if (p4 & 0x08) {
          p3 = null;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public final String getExpiresTime(){
       return this.expiresTime;
    }
    public final int getHttpCode(){
       return this.httpCode;
    }
    public final Request getRequest(){
       return this.request;
    }
}
