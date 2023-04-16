package com.kwai.kxb.update.log.KxbException;
import java.lang.RuntimeException;
import com.kwai.kxb.update.log.KxbExceptionCode;
import java.lang.String;
import java.lang.Throwable;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.lang.Enum;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mu6.e;

public final class KxbException extends RuntimeException	// class@000808
{
    public final KxbExceptionCode code;
    public e rawResponse;

    public void KxbException(){
       super(null, null, null, 7, null);
    }
    public void KxbException(KxbExceptionCode p0,String p1,Throwable p2){
       a.p(p0, "code");
       a.p(p1, "message");
       StringBuilder str = (!p1.length())? 1: null;
       p1 = (str)? p0.name(): p0+", "+p1;
       super(p1, p2);
       this.code = p0;
       return;
    }
    public void KxbException(KxbExceptionCode p0,String p1,Throwable p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = KxbExceptionCode.UNKNOWN;
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
    public final KxbExceptionCode getCode(){
       return this.code;
    }
    public String getMessage(){
       String obj = PatchProxy.apply(null, this, KxbException.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.getCause() == null)? super.getMessage(): super.getMessage()+", "+this.getCause().getMessage();
       return obj;
    }
    public final e getRawResponse(){
       return this.rawResponse;
    }
    public final void setRawResponse(e p0){
       this.rawResponse = p0;
    }
}
