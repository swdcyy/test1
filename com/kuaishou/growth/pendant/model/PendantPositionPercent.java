package com.kuaishou.growth.pendant.model.PendantPositionPercent;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.PendantPositionPercent$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class PendantPositionPercent implements Serializable	// class@00067a
{
    public int mSide;
    public float mYPercent;
    public static final PendantPositionPercent$a Companion;
    public static final long serialVersionUID;

    static {
       PendantPositionPercent.Companion = new PendantPositionPercent$a(null);
    }
    public void PendantPositionPercent(int p0,float p1){
       super();
       this.mSide = p0;
       this.mYPercent = p1;
    }
    public static PendantPositionPercent copy$default(PendantPositionPercent p0,int p1,float p2,int p3,Object p4){
       PendantPositionPercent mSide;
       PendantPositionPercent mYPercent;
       if (p3 & 0x01) {
          mSide = p0.mSide;
       }
       if (p3 & 0x02) {
          mYPercent = p0.mYPercent;
       }
       return p0.copy(mSide, mYPercent);
    }
    public final int component1(){
       return this.mSide;
    }
    public final float component2(){
       return this.mYPercent;
    }
    public final PendantPositionPercent copy(int p0,float p1){
       if (PatchProxy.isSupport(PendantPositionPercent.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, PendantPositionPercent.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PendantPositionPercent(p0, p1);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PendantPositionPercent.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof PendantPositionPercent && (this.mSide == p0.mSide && !Float.compare(this.mYPercent, p0.mYPercent)))) {
          return true;
       }
       return false;
    }
    public final int getMSide(){
       return this.mSide;
    }
    public final float getMYPercent(){
       return this.mYPercent;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, PendantPositionPercent.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.mSide * 31) + Float.floatToIntBits(this.mYPercent));
    }
    public final void setMSide(int p0){
       this.mSide = p0;
    }
    public final void setMYPercent(float p0){
       this.mYPercent = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PendantPositionPercent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PendantPositionPercent\(mSide="+this.mSide+", mYPercent="+this.mYPercent+"\)";
    }
}
