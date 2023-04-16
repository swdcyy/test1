package com.kwai.corona.startup.model.DanmakuForceSwitch;
import java.io.Serializable;
import com.kwai.corona.startup.model.DanmakuForceSwitch$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;

public final class DanmakuForceSwitch implements Serializable	// class@000cf4
{
    public final int forceSwitch;
    public final int version;
    public static final DanmakuForceSwitch$a Companion;

    static {
       DanmakuForceSwitch.Companion = new DanmakuForceSwitch$a(null);
    }
    public void DanmakuForceSwitch(int p0,int p1){
       super();
       this.forceSwitch = p0;
       this.version = p1;
    }
    public static DanmakuForceSwitch copy$default(DanmakuForceSwitch p0,int p1,int p2,int p3,Object p4){
       DanmakuForceSwitch forceSwitch;
       DanmakuForceSwitch version;
       if (p3 & 0x01) {
          forceSwitch = p0.forceSwitch;
       }
       if (p3 & 0x02) {
          version = p0.version;
       }
       return p0.copy(forceSwitch, version);
    }
    public final int component1(){
       return this.forceSwitch;
    }
    public final int component2(){
       return this.version;
    }
    public final DanmakuForceSwitch copy(int p0,int p1){
       if (PatchProxy.isSupport(DanmakuForceSwitch.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DanmakuForceSwitch.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new DanmakuForceSwitch(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof DanmakuForceSwitch && (this.forceSwitch == p0.forceSwitch && this.version == p0.version))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, DanmakuForceSwitch.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.forceSwitch * 31) + this.version);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DanmakuForceSwitch.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DanmakuForceSwitch\(forceSwitch="+this.forceSwitch+", version="+this.version+"\)";
    }
}
