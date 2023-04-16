package com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionInterval;
import java.io.Serializable;
import java.lang.String;
import java.lang.Float;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class IntMotionInterval implements Serializable	// class@001922
{
    public String axis;
    public Float max;
    public Float min;

    public void IntMotionInterval(){
       super(null, null, null, 7, null);
    }
    public void IntMotionInterval(String p0,Float p1,Float p2){
       a.p(p0, "axis");
       super();
       this.axis = p0;
       this.min = p1;
       this.max = p2;
    }
    public void IntMotionInterval(String p0,Float p1,Float p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = "default";
       }
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = null;
       }
       super(p0, p1, p2);
       return;
    }
    public static IntMotionInterval copy$default(IntMotionInterval p0,String p1,Float p2,Float p3,int p4,Object p5){
       IntMotionInterval axis;
       IntMotionInterval min;
       IntMotionInterval max;
       if (p4 & 0x01) {
          axis = p0.axis;
       }
       if (p4 & 0x02) {
          min = p0.min;
       }
       if (p4 & 0x04) {
          max = p0.max;
       }
       return p0.copy(axis, min, max);
    }
    public final String component1(){
       return this.axis;
    }
    public final Float component2(){
       return this.min;
    }
    public final Float component3(){
       return this.max;
    }
    public final IntMotionInterval copy(String p0,Float p1,Float p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, IntMotionInterval.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "axis");
       return new IntMotionInterval(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IntMotionInterval.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof IntMotionInterval && (a.g(this.axis, p0.axis) && (a.g(this.min, p0.min) && a.g(this.max, p0.max))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       IntMotionInterval obj = PatchProxy.apply(null, this, IntMotionInterval.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.axis;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       IntMotionInterval tmin = this.min;
       int i2 = (tmin != null)? tmin.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tmin = this.max;
       if (tmin != null) {
          i = tmin.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IntMotionInterval.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "IntMotionInterval\(axis="+this.axis+", min="+this.min+", max="+this.max+"\)";
    }
}
