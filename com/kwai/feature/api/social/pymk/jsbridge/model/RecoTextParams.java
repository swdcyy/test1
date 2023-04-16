package com.kwai.feature.api.social.pymk.jsbridge.model.RecoTextParams;
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

public final class RecoTextParams implements Serializable	// class@0011b4
{
    public final List recTextInfos;

    public void RecoTextParams(List p0){
       super();
       this.recTextInfos = p0;
    }
    public static RecoTextParams copy$default(RecoTextParams p0,List p1,int p2,Object p3){
       RecoTextParams recTextInfos;
       if (p2 & 0x01) {
          recTextInfos = p0.recTextInfos;
       }
       return p0.copy(recTextInfos);
    }
    public final List component1(){
       return this.recTextInfos;
    }
    public final RecoTextParams copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoTextParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new RecoTextParams(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoTextParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof RecoTextParams && a.g(this.recTextInfos, p0.recTextInfos))) {
          return true;
       }
       return false;
    }
    public final List getRecTextInfos(){
       return this.recTextInfos;
    }
    public int hashCode(){
       RecoTextParams obj = PatchProxy.apply(null, this, RecoTextParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.recTextInfos;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, RecoTextParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "RecoTextParams\(recTextInfos="+this.recTextInfos+"\)";
    }
}
