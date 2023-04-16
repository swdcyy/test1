package com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionInterpolation;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class IntMotionInterpolation implements Serializable	// class@001921
{
    public float coefficient;
    public float offset;

    public void IntMotionInterpolation(){
       super(0, 0, 3, null);
    }
    public void IntMotionInterpolation(float p0,float p1){
       super();
       this.coefficient = p0;
       this.offset = p1;
    }
    public void IntMotionInterpolation(float p0,float p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = 0;
       }
       if (p2 & 0x02) {
          p1 = 0;
       }
       super(p0, p1);
       return;
    }
    public static IntMotionInterpolation copy$default(IntMotionInterpolation p0,float p1,float p2,int p3,Object p4){
       IntMotionInterpolation coefficient;
       IntMotionInterpolation offset;
       if (p3 & 0x01) {
          coefficient = p0.coefficient;
       }
       if (p3 & 0x02) {
          offset = p0.offset;
       }
       return p0.copy(coefficient, offset);
    }
    public final float component1(){
       return this.coefficient;
    }
    public final float component2(){
       return this.offset;
    }
    public final IntMotionInterpolation copy(float p0,float p1){
       if (PatchProxy.isSupport(IntMotionInterpolation.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, IntMotionInterpolation.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new IntMotionInterpolation(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IntMotionInterpolation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof IntMotionInterpolation && (!Float.compare(this.coefficient, p0.coefficient) && !Float.compare(this.offset, p0.offset)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, IntMotionInterpolation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((Float.floatToIntBits(this.coefficient) * 31) + Float.floatToIntBits(this.offset));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IntMotionInterpolation.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "IntMotionInterpolation\(coefficient="+this.coefficient+", offset="+this.offset+"\)";
    }
}
