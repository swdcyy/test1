package com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionSmoothness;
import java.io.Serializable;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class IntMotionSmoothness implements Serializable	// class@001925
{
    public float current;
    public float hysterisis;
    public float previous;

    public void IntMotionSmoothness(float p0,float p1,float p2){
       super();
       this.hysterisis = p0;
       this.previous = p1;
       this.current = p2;
    }
    public void IntMotionSmoothness(float p0,float p1,float p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = 0;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static IntMotionSmoothness copy$default(IntMotionSmoothness p0,float p1,float p2,float p3,int p4,Object p5){
       IntMotionSmoothness hysterisis;
       IntMotionSmoothness previous;
       IntMotionSmoothness current;
       if (p4 & 0x01) {
          hysterisis = p0.hysterisis;
       }
       if (p4 & 0x02) {
          previous = p0.previous;
       }
       if (p4 & 0x04) {
          current = p0.current;
       }
       return p0.copy(hysterisis, previous, current);
    }
    public final float component1(){
       return this.hysterisis;
    }
    public final float component2(){
       return this.previous;
    }
    public final float component3(){
       return this.current;
    }
    public final IntMotionSmoothness copy(float p0,float p1,float p2){
       if (PatchProxy.isSupport(IntMotionSmoothness.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, IntMotionSmoothness.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new IntMotionSmoothness(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IntMotionSmoothness.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof IntMotionSmoothness && (!Float.compare(this.hysterisis, p0.hysterisis) && (!Float.compare(this.previous, p0.previous) && !Float.compare(this.current, p0.current))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, IntMotionSmoothness.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((Float.floatToIntBits(this.hysterisis) * 31) + Float.floatToIntBits(this.previous)) * 31) + Float.floatToIntBits(this.current));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IntMotionSmoothness.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "IntMotionSmoothness\(hysterisis="+this.hysterisis+", previous="+this.previous+", current="+this.current+"\)";
    }
}
