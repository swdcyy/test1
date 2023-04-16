package com.kwai.sdk.eve.internal.api.EveNetStateException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class EveNetStateException extends Exception	// class@001468
{
    public final int errorCode;
    public final String errorMsg;

    public void EveNetStateException(int p0,String p1){
       a.p(p1, "errorMsg");
       super(p1);
       this.errorCode = p0;
       this.errorMsg = p1;
    }
    public static EveNetStateException copy$default(EveNetStateException p0,int p1,String p2,int p3,Object p4){
       EveNetStateException errorCode;
       EveNetStateException errorMsg;
       if (p3 & 0x01) {
          errorCode = p0.errorCode;
       }
       if (p3 & 0x02) {
          errorMsg = p0.errorMsg;
       }
       return p0.copy(errorCode, errorMsg);
    }
    public final int component1(){
       return this.errorCode;
    }
    public final String component2(){
       return this.errorMsg;
    }
    public final EveNetStateException copy(int p0,String p1){
       if (PatchProxy.isSupport(EveNetStateException.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, EveNetStateException.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "errorMsg");
       return new EveNetStateException(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveNetStateException.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof EveNetStateException && (this.errorCode == p0.errorCode && a.g(this.errorMsg, p0.errorMsg)))) {
          return true;
       }
       return false;
    }
    public final int getErrorCode(){
       return this.errorCode;
    }
    public final String getErrorMsg(){
       return this.errorMsg;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, EveNetStateException.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.errorCode * 31;
       EveNetStateException terrorMsg = this.errorMsg;
       int i1 = (terrorMsg != null)? terrorMsg.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EveNetStateException.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "EveNetStateException\(errorCode="+this.errorCode+", errorMsg="+this.errorMsg+"\)";
    }
}
