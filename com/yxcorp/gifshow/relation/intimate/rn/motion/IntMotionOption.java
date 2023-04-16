package com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionOption;
import java.io.Serializable;
import java.lang.String;
import com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionInterpolation;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class IntMotionOption implements Serializable	// class@001924
{
    public String affineType;
    public IntMotionInterpolation interpolation;

    public void IntMotionOption(){
       super(null, null, 3, null);
    }
    public void IntMotionOption(String p0,IntMotionInterpolation p1){
       a.p(p0, "affineType");
       a.p(p1, "interpolation");
       super();
       this.affineType = p0;
       this.interpolation = p1;
    }
    public void IntMotionOption(String p0,IntMotionInterpolation p1,int p2,u p3){
       if (p2 & 0x01) {
          p0 = "default";
       }
       if (p2 & 0x02) {
          p1 = new IntMotionInterpolation(0, 0, 3, null);
       }
       super(p0, p1);
       return;
    }
    public static IntMotionOption copy$default(IntMotionOption p0,String p1,IntMotionInterpolation p2,int p3,Object p4){
       IntMotionOption affineType;
       IntMotionOption interpolatio;
       if (p3 & 0x01) {
          affineType = p0.affineType;
       }
       if (p3 & 0x02) {
          interpolatio = p0.interpolation;
       }
       return p0.copy(affineType, interpolatio);
    }
    public final String component1(){
       return this.affineType;
    }
    public final IntMotionInterpolation component2(){
       return this.interpolation;
    }
    public final IntMotionOption copy(String p0,IntMotionInterpolation p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IntMotionOption.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "affineType");
       a.p(p1, "interpolation");
       return new IntMotionOption(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IntMotionOption.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof IntMotionOption && (a.g(this.affineType, p0.affineType) && a.g(this.interpolation, p0.interpolation)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       IntMotionOption obj = PatchProxy.apply(null, this, IntMotionOption.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.affineType;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       IntMotionOption tinterpolati = this.interpolation;
       if (tinterpolati != null) {
          i = tinterpolati.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IntMotionOption.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "IntMotionOption\(affineType="+this.affineType+", interpolation="+this.interpolation+"\)";
    }
}
