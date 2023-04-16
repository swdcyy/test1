package com.kwai.yoda.YodaError;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class YodaError extends Exception	// class@001163
{
    public final String errorType;
    public final String msg;

    public void YodaError(){
       super(null, null, null, 7, null);
    }
    public void YodaError(String p0,String p1,Throwable p2){
       a.q(p0, "errorType");
       a.q(p1, "msg");
       super(p2);
       this.errorType = p0;
       this.msg = p1;
    }
    public void YodaError(String p0,String p1,Throwable p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = "UNKNOWN";
       }
       if (p3 & 0x02) {
          p1 = "";
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public final String getErrorType(){
       return this.errorType;
    }
    public String getMessage(){
       Object obj = PatchProxy.apply(null, this, YodaError.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.toString();
    }
    public final String getMsg(){
       return this.msg;
    }
    public final String toResultType(){
       YodaError obj = PatchProxy.apply(null, this, YodaError.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.errorType;
       String str = "ACTION_ERROR";
       switch (obj.hashCode()){
           case 0xa67d75b2:
             if (obj.equals("PARAMETER_ERROR")) {
                str = "PARAMETER_ERROR";
             }else {
             label_0075 :
                str = "ERROR";
             }
             break;
           case 0xcb8ee077:
             if (obj.equals("NETWORK_ERROR")) {
                str = "NETWORK_ERROR";
             }else {
                goto label_0075 ;
             }
             break;
           case 0xcb9664b1:
             if (obj.equals("UNZIP_ERROR")) {
                str = "UNZIP_ERROR";
             }else {
                goto label_0075 ;
             }
             break;
           case 0xeb50a711:
             if (obj.equals("PATCH_ERROR")) {
                str = "PATCH_ERROR";
             }else {
                goto label_0075 ;
             }
             break;
           case 0xeeb56f71:
             if (obj.equals("DOWNLOAD_ERROR")) {
                str = "DOWNLOAD_ERROR";
             }else {
                goto label_0075 ;
             }
             break;
           case 0x119f309a:
             if (obj.equals("STATE_ERROR")) {
                str = "STATE_ERROR";
             }else {
                goto label_0075 ;
             }
             break;
           case 0x12e54e16:
             if (obj.equals("NO_CHANGED")) {
                str = "NO_CHANGE";
             }else {
                goto label_0075 ;
             }
             break;
           case 0x2e44ae9f:
             if (!obj.equals(str)) {
                goto label_0075 ;
             }
             break;
           case 0x760d227a:
             if (obj.equals("CANCEL")) {
                str = "USER_CANCEL";
             }else {
                goto label_0075 ;
             }
             break;
           default:
             goto label_0075 ;
       }
       return str;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, YodaError.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "YodaError ["+this.errorType+"] - "+this.msg+" - "+this.getCause();
    }
}
