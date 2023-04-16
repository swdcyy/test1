package com.kuaishou.live.common.core.basic.resource.controlfiles.LiveExpiredControlFileTypes;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveExpiredControlFileTypes implements Serializable	// class@000ec3
{
    public final List expiredTypeList;

    public void LiveExpiredControlFileTypes(List p0){
       a.p(p0, "expiredTypeList");
       super();
       this.expiredTypeList = p0;
    }
    public static LiveExpiredControlFileTypes copy$default(LiveExpiredControlFileTypes p0,List p1,int p2,Object p3){
       LiveExpiredControlFileTypes expiredTypeL;
       if (p2 & 0x01) {
          expiredTypeL = p0.expiredTypeList;
       }
       return p0.copy(expiredTypeL);
    }
    public final List component1(){
       return this.expiredTypeList;
    }
    public final LiveExpiredControlFileTypes copy(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveExpiredControlFileTypes.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "expiredTypeList");
       return new LiveExpiredControlFileTypes(p0);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveExpiredControlFileTypes.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiveExpiredControlFileTypes && a.g(this.expiredTypeList, p0.expiredTypeList))) {
          return true;
       }
       return false;
    }
    public final List getExpiredTypeList(){
       return this.expiredTypeList;
    }
    public int hashCode(){
       LiveExpiredControlFileTypes obj = PatchProxy.apply(null, this, LiveExpiredControlFileTypes.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.expiredTypeList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveExpiredControlFileTypes.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveExpiredControlFileTypes\(expiredTypeList="+this.expiredTypeList+"\)";
    }
}
