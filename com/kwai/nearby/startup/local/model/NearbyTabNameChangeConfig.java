package com.kwai.nearby.startup.local.model.NearbyTabNameChangeConfig;
import java.io.Serializable;
import com.kwai.nearby.startup.local.model.NearbyTabNameChangeConfig$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class NearbyTabNameChangeConfig implements Serializable	// class@00102f
{
    public final int intervalDays;
    public static final NearbyTabNameChangeConfig$a Companion;
    public static final long serialVersionUID;

    static {
       NearbyTabNameChangeConfig.Companion = new NearbyTabNameChangeConfig$a(null);
    }
    public void NearbyTabNameChangeConfig(int p0){
       super();
       this.intervalDays = p0;
    }
    public static NearbyTabNameChangeConfig copy$default(NearbyTabNameChangeConfig p0,int p1,int p2,Object p3){
       NearbyTabNameChangeConfig intervalDays;
       if (p2 & 0x01) {
          intervalDays = p0.intervalDays;
       }
       return p0.copy(intervalDays);
    }
    public final int component1(){
       return this.intervalDays;
    }
    public final NearbyTabNameChangeConfig copy(int p0){
       if (PatchProxy.isSupport(NearbyTabNameChangeConfig.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NearbyTabNameChangeConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new NearbyTabNameChangeConfig(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof NearbyTabNameChangeConfig && this.intervalDays == p0.intervalDays)) {
          return true;
       }
       return false;
    }
    public final int getIntervalDays(){
       return this.intervalDays;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, NearbyTabNameChangeConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.intervalDays;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyTabNameChangeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyTabNameChangeConfig\(intervalDays="+this.intervalDays+"\)";
    }
}
