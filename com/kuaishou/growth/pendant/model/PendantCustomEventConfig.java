package com.kuaishou.growth.pendant.model.PendantCustomEventConfig;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantCustomEventConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class PendantCustomEventConfig implements Serializable	// class@000672
{
    public final boolean disablePendantAsyncInflateCustomEvent;
    public static final PendantCustomEventConfig$a Companion;
    public static final long serialVersionUID;

    static {
       PendantCustomEventConfig.Companion = new PendantCustomEventConfig$a(null);
    }
    public void PendantCustomEventConfig(){
       super(false, 1, null);
    }
    public void PendantCustomEventConfig(boolean p0){
       super();
       this.disablePendantAsyncInflateCustomEvent = p0;
    }
    public void PendantCustomEventConfig(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public static PendantCustomEventConfig copy$default(PendantCustomEventConfig p0,boolean p1,int p2,Object p3){
       PendantCustomEventConfig disablePenda;
       if (p2 & 0x01) {
          disablePenda = p0.disablePendantAsyncInflateCustomEvent;
       }
       return p0.copy(disablePenda);
    }
    public final boolean component1(){
       return this.disablePendantAsyncInflateCustomEvent;
    }
    public final PendantCustomEventConfig copy(boolean p0){
       if (PatchProxy.isSupport(PendantCustomEventConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, PendantCustomEventConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PendantCustomEventConfig(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof PendantCustomEventConfig && this.disablePendantAsyncInflateCustomEvent == p0.disablePendantAsyncInflateCustomEvent)) {
          return true;
       }
       return false;
    }
    public final boolean getDisablePendantAsyncInflateCustomEvent(){
       return this.disablePendantAsyncInflateCustomEvent;
    }
    public int hashCode(){
       PendantCustomEventConfig tdisablePend = this.disablePendantAsyncInflateCustomEvent;
       if (tdisablePend != null) {
          tdisablePend = 1;
       }
       return tdisablePend;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PendantCustomEventConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantCustomEventConfig\(disablePendantAsyncInflateCustomEvent="+this.disablePendantAsyncInflateCustomEvent+"\)";
    }
}
