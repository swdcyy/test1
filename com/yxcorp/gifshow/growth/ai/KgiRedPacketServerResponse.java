package com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse$Companion;
import nsd.u;
import com.yxcorp.gifshow.growth.ai.KgiRedPacketServerResponse$Companion$KgiRedPacketResponse;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class KgiRedPacketServerResponse implements Serializable	// class@0012ee
{
    public final KgiRedPacketServerResponse$Companion$KgiRedPacketResponse dialog;
    public final int result;
    public static final KgiRedPacketServerResponse$Companion Companion;
    public static final long serialVersionUID;

    static {
       KgiRedPacketServerResponse.Companion = new KgiRedPacketServerResponse$Companion(null);
    }
    public void KgiRedPacketServerResponse(int p0,KgiRedPacketServerResponse$Companion$KgiRedPacketResponse p1){
       super();
       this.result = p0;
       this.dialog = p1;
    }
    public static KgiRedPacketServerResponse copy$default(KgiRedPacketServerResponse p0,int p1,KgiRedPacketServerResponse$Companion$KgiRedPacketResponse p2,int p3,Object p4){
       KgiRedPacketServerResponse result;
       KgiRedPacketServerResponse dialog;
       if (p3 & 0x01) {
          result = p0.result;
       }
       if (p3 & 0x02) {
          dialog = p0.dialog;
       }
       return p0.copy(result, dialog);
    }
    public final int component1(){
       return this.result;
    }
    public final KgiRedPacketServerResponse$Companion$KgiRedPacketResponse component2(){
       return this.dialog;
    }
    public final KgiRedPacketServerResponse copy(int p0,KgiRedPacketServerResponse$Companion$KgiRedPacketResponse p1){
       if (PatchProxy.isSupport(KgiRedPacketServerResponse.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, KgiRedPacketServerResponse.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new KgiRedPacketServerResponse(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KgiRedPacketServerResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof KgiRedPacketServerResponse && (this.result == p0.result && a.g(this.dialog, p0.dialog)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, KgiRedPacketServerResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.result * 31;
       KgiRedPacketServerResponse tdialog = this.dialog;
       int i1 = (tdialog != null)? tdialog.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KgiRedPacketServerResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KgiRedPacketServerResponse\(result="+this.result+", dialog="+this.dialog+"\)";
    }
}
