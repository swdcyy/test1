package com.kwai.middleware.azeroth.net.response.AzerothApiError;
import com.kwai.middleware.leia.response.LeiaApiError;
import com.kwai.middleware.azeroth.net.response.AzerothApiError$a;
import nsd.u;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Throwable;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class AzerothApiError extends LeiaApiError	// class@000f0c
{
    public static final AzerothApiError$a Companion;

    static {
       AzerothApiError.Companion = new AzerothApiError$a(null);
    }
    public void AzerothApiError(){
       super(null, 0, null, 0, null, null, null, 127, null);
    }
    public void AzerothApiError(String p0,int p1,String p2,int p3,String p4,JsonObject p5,Throwable p6){
       a.q(p0, "errorType");
       a.q(p2, "httpMessage");
       a.q(p4, "resultMessage");
       super(p0, p1, p2, p3, p4, p5, p6);
    }
    public void AzerothApiError(String p0,int p1,String p2,int p3,String p4,JsonObject p5,Throwable p6,int p7,u p8){
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
    public static final AzerothApiError fromLeia(LeiaApiError p0){
       return AzerothApiError.Companion.a(p0);
    }
}
