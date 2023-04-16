package com.kwai.feature.api.social.pymk.jsbridge.model.PymkRecoResult;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PymkRecoResult implements Serializable	// class@0011b3
{
    public final List recoResponse;

    public void PymkRecoResult(List p0){
       super();
       this.recoResponse = p0;
    }
    public static PymkRecoResult copy$default(PymkRecoResult p0,List p1,int p2,Object p3){
       PymkRecoResult recoResponse;
       if (p2 & 0x01) {
          recoResponse = p0.recoResponse;
       }
       return p0.copy(recoResponse);
    }
    public final List component1(){
       return this.recoResponse;
    }
    public final PymkRecoResult copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PymkRecoResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PymkRecoResult(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PymkRecoResult.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PymkRecoResult && a.g(this.recoResponse, p0.recoResponse))) {
          return true;
       }
       return false;
    }
    public final List getRecoResponse(){
       return this.recoResponse;
    }
    public int hashCode(){
       PymkRecoResult obj = PatchProxy.apply(null, this, PymkRecoResult.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.recoResponse;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PymkRecoResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PymkRecoResult\(recoResponse="+this.recoResponse+"\)";
    }
}
