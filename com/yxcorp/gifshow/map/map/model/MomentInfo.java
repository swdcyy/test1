package com.yxcorp.gifshow.map.map.model.MomentInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class MomentInfo	// class@001c9a
{
    public final String momentId;
    public final String momentType;

    public void MomentInfo(){
       a.p("", "momentId");
       a.p("", "momentType");
       super();
       this.momentId = "";
       this.momentType = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof MomentInfo && (a.g(this.momentId, p0.momentId) && a.g(this.momentType, p0.momentType)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       MomentInfo obj = PatchProxy.apply(null, this, MomentInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.momentId;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       MomentInfo tmomentType = this.momentType;
       if (tmomentType != null) {
          i = tmomentType.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MomentInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MomentInfo\(momentId="+this.momentId+", momentType="+this.momentType+"\)";
    }
}
