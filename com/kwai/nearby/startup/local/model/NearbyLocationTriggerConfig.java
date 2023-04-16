package com.kwai.nearby.startup.local.model.NearbyLocationTriggerConfig;
import java.io.Serializable;
import com.kwai.nearby.startup.local.model.NearbyLocationTriggerConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NearbyLocationTriggerConfig implements Serializable	// class@001026
{
    public final int x;
    public static final NearbyLocationTriggerConfig$a Companion;
    public static final long serialVersionUID;

    static {
       NearbyLocationTriggerConfig.Companion = new NearbyLocationTriggerConfig$a(null);
    }
    public void NearbyLocationTriggerConfig(int p0){
       super();
       this.x = p0;
    }
    public static NearbyLocationTriggerConfig copy$default(NearbyLocationTriggerConfig p0,int p1,int p2,Object p3){
       NearbyLocationTriggerConfig x;
       if (p2 & 0x01) {
          x = p0.x;
       }
       return p0.copy(x);
    }
    public final int component1(){
       return this.x;
    }
    public final NearbyLocationTriggerConfig copy(int p0){
       if (PatchProxy.isSupport(NearbyLocationTriggerConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NearbyLocationTriggerConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new NearbyLocationTriggerConfig(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof NearbyLocationTriggerConfig && this.x == p0.x)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, NearbyLocationTriggerConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.x;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyLocationTriggerConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyLocationTriggerConfig\(x="+this.x+"\)";
    }
}
