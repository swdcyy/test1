package com.kuaishou.growth.pendant.model.PendantActiveParams;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantActiveParams$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PendantActiveParams implements Serializable	// class@000669
{
    public final String inactiveWidgetIconCdnUrl;
    public final long mHideProtectTime;
    public static final PendantActiveParams$a Companion;
    public static final long serialVersionUID;

    static {
       PendantActiveParams.Companion = new PendantActiveParams$a(null);
    }
    public void PendantActiveParams(String p0,long p1){
       super();
       this.inactiveWidgetIconCdnUrl = p0;
       this.mHideProtectTime = p1;
    }
    public static PendantActiveParams copy$default(PendantActiveParams p0,String p1,long p2,int p3,Object p4){
       PendantActiveParams inactiveWidg;
       PendantActiveParams mHideProtect;
       if (p3 & 0x01) {
          inactiveWidg = p0.inactiveWidgetIconCdnUrl;
       }
       if (p3 & 0x02) {
          mHideProtect = p0.mHideProtectTime;
       }
       return p0.copy(inactiveWidg, mHideProtect);
    }
    public final String component1(){
       return this.inactiveWidgetIconCdnUrl;
    }
    public final long component2(){
       return this.mHideProtectTime;
    }
    public final PendantActiveParams copy(String p0,long p1){
       if (PatchProxy.isSupport(PendantActiveParams.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, PendantActiveParams.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PendantActiveParams(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantActiveParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PendantActiveParams && (a.g(this.inactiveWidgetIconCdnUrl, p0.inactiveWidgetIconCdnUrl) && !this.mHideProtectTime - p0.mHideProtectTime))) {
          return true;
       }
       return false;
    }
    public final String getInactiveWidgetIconCdnUrl(){
       return this.inactiveWidgetIconCdnUrl;
    }
    public final long getMHideProtectTime(){
       return this.mHideProtectTime;
    }
    public int hashCode(){
       PendantActiveParams obj = PatchProxy.apply(null, this, PendantActiveParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.inactiveWidgetIconCdnUrl;
       int i = (obj != null)? obj.hashCode(): 0;
       PendantActiveParams tmHideProtec = this.mHideProtectTime;
       return ((i * 31) + (int)(tmHideProtec ^ (tmHideProtec >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PendantActiveParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantActiveParams\(inactiveWidgetIconCdnUrl="+this.inactiveWidgetIconCdnUrl+", mHideProtectTime="+this.mHideProtectTime+"\)";
    }
}
