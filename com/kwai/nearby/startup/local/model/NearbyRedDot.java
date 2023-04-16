package com.kwai.nearby.startup.local.model.NearbyRedDot;
import java.io.Serializable;
import com.kwai.nearby.startup.local.model.NearbyRedDot$a;
import nsd.u;
import com.kwai.nearby.startup.local.model.RedDotData;
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

public final class NearbyRedDot implements Serializable	// class@00102d
{
    public final RedDotData redDotData;
    public int redDotType;
    public static final NearbyRedDot$a Companion;
    public static final long serialVersionUID;

    static {
       NearbyRedDot.Companion = new NearbyRedDot$a(null);
    }
    public void NearbyRedDot(int p0,RedDotData p1){
       super();
       this.redDotType = p0;
       this.redDotData = p1;
    }
    public void NearbyRedDot(int p0,RedDotData p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = Integer.MAX_VALUE;
       }
       super(p0, p1);
       return;
    }
    public static NearbyRedDot copy$default(NearbyRedDot p0,int p1,RedDotData p2,int p3,Object p4){
       NearbyRedDot redDotType;
       NearbyRedDot redDotData;
       if (p3 & 0x01) {
          redDotType = p0.redDotType;
       }
       if (p3 & 0x02) {
          redDotData = p0.redDotData;
       }
       return p0.copy(redDotType, redDotData);
    }
    public final int component1(){
       return this.redDotType;
    }
    public final RedDotData component2(){
       return this.redDotData;
    }
    public final NearbyRedDot copy(int p0,RedDotData p1){
       if (PatchProxy.isSupport(NearbyRedDot.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, NearbyRedDot.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new NearbyRedDot(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NearbyRedDot.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof NearbyRedDot && (this.redDotType == p0.redDotType && a.g(this.redDotData, p0.redDotData)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, NearbyRedDot.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.redDotType * 31;
       NearbyRedDot tredDotData = this.redDotData;
       int i1 = (tredDotData != null)? tredDotData.hashCode(): 0;
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, NearbyRedDot.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NearbyRedDot\(redDotType="+this.redDotType+", redDotData="+this.redDotData+"\)";
    }
}
