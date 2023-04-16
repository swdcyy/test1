package com.kwai.middleware.leia.response.LeiaApiError;
import java.io.IOException;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public class LeiaApiError extends IOException	// class@000f32
{
    public final String errorType;
    public final int httpCode;
    public final String httpMessage;
    public final JsonObject responseBody;
    public final int resultCode;
    public final String resultMessage;

    public void LeiaApiError(){
       super(null, 0, null, 0, null, null, null, 127, null);
    }
    public void LeiaApiError(String p0,int p1,String p2,int p3,String p4,JsonObject p5,Throwable p6){
       a.q(p0, "errorType");
       a.q(p2, "httpMessage");
       a.q(p4, "resultMessage");
       super(p6);
       this.errorType = p0;
       this.httpCode = p1;
       this.httpMessage = p2;
       this.resultCode = p3;
       this.resultMessage = p4;
       this.responseBody = p5;
    }
    public void LeiaApiError(String p0,int p1,String p2,int p3,String p4,JsonObject p5,Throwable p6,int p7,u p8){
       if (p7 & 0x01) {
          p0 = "UNKNOWN";
       }
       int i = 0;
       int i1 = (p7 & 0x02)? 0: p1;
       String str = "";
       String str1 = (p7 & 0x04)? str: p2;
       if (!(p7 & 0x08)) {
          i = p3;
       }
       if (!(p7 & 0x10)) {
          str = p4;
       }
       p2 = null;
       int i2 = (p7 & 0x20)? p2: p5;
       int i3 = (p7 & 0x40)? p2: p6;
       super(p0, i1, str1, i, str, i2, i3);
       return;
    }
    public String getMessage(){
       return this.toString();
    }
    public String toString(){
       StringBuilder str;
       LeiaApiError terrorType = this.errorType;
       switch (terrorType.hashCode()){
           case 0xfdfa:
             if (terrorType.equals("API")) {
                str = "AzerothApiError [Business Api Error: "+this.resultCode+"]: "+this.resultMessage;
             }else {
             label_0084 :
                str = "AzerothApiError [Unknown Error]";
             }
             break;
           case 0x220088:
             if (terrorType.equals("HTTP")) {
                str = "AzerothApiError [Http Error: "+this.httpCode+"]: "+this.httpMessage;
             }else {
                goto label_0084 ;
             }
             break;
           case 0x1a5d0441:
             if (terrorType.equals("RESPONSE")) {
             label_001e :
                str = "AzerothApiError [Request or Response Error]: ";
                Throwable cause = this.getCause();
                String message = (cause != null)? cause.getMessage(): null;
                str = str+message;
             }else {
                goto label_0084 ;
             }
             break;
           case 0x6c1a7e6f:
             if (terrorType.equals("REQUEST")) {
                goto label_001e ;
             }else {
                goto label_0084 ;
             }
             break;
           default:
             goto label_0084 ;
       }
       return str;
    }
}
