package com.kuaishou.growth.pendant.model.PendantScaleAnimProperty;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantScaleAnimProperty$a;
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

public final class PendantScaleAnimProperty implements Serializable	// class@00067f
{
    public final float keyFrameFraction;
    public final float keyFrameValue;
    public static final PendantScaleAnimProperty$a Companion;
    public static final long serialVersionUID;

    static {
       PendantScaleAnimProperty.Companion = new PendantScaleAnimProperty$a(null);
    }
    public void PendantScaleAnimProperty(float p0,float p1){
       super();
       this.keyFrameFraction = p0;
       this.keyFrameValue = p1;
    }
    public static PendantScaleAnimProperty copy$default(PendantScaleAnimProperty p0,float p1,float p2,int p3,Object p4){
       PendantScaleAnimProperty keyFrameFrac;
       PendantScaleAnimProperty keyFrameValu;
       if (p3 & 0x01) {
          keyFrameFrac = p0.keyFrameFraction;
       }
       if (p3 & 0x02) {
          keyFrameValu = p0.keyFrameValue;
       }
       return p0.copy(keyFrameFrac, keyFrameValu);
    }
    public final float component1(){
       return this.keyFrameFraction;
    }
    public final float component2(){
       return this.keyFrameValue;
    }
    public final PendantScaleAnimProperty copy(float p0,float p1){
       if (PatchProxy.isSupport(PendantScaleAnimProperty.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, PendantScaleAnimProperty.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PendantScaleAnimProperty(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantScaleAnimProperty.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PendantScaleAnimProperty && (!Float.compare(this.keyFrameFraction, p0.keyFrameFraction) && !Float.compare(this.keyFrameValue, p0.keyFrameValue)))) {
          return true;
       }
       return false;
    }
    public final float getKeyFrameFraction(){
       return this.keyFrameFraction;
    }
    public final float getKeyFrameValue(){
       return this.keyFrameValue;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PendantScaleAnimProperty.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((Float.floatToIntBits(this.keyFrameFraction) * 31) + Float.floatToIntBits(this.keyFrameValue));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PendantScaleAnimProperty.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantScaleAnimProperty\(keyFrameFraction="+this.keyFrameFraction+", keyFrameValue="+this.keyFrameValue+"\)";
    }
}
