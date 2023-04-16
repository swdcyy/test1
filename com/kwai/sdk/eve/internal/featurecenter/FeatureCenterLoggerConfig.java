package com.kwai.sdk.eve.internal.featurecenter.FeatureCenterLoggerConfig;
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

public final class FeatureCenterLoggerConfig	// class@0014e6
{
    public final float failRatio;
    public final float fileSpaceRatio;
    public final float successRatio;

    public void FeatureCenterLoggerConfig(){
       super(0, 0, 0, 7, null);
    }
    public void FeatureCenterLoggerConfig(float p0,float p1,float p2){
       super();
       this.successRatio = p0;
       this.failRatio = p1;
       this.fileSpaceRatio = p2;
    }
    public void FeatureCenterLoggerConfig(float p0,float p1,float p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = 0.01f;
       }
       if (p3 & 0x02) {
          p1 = 0.10f;
       }
       if (p3 & 0x04) {
          p2 = 0.10f;
       }
       super(p0, p1, p2);
       return;
    }
    public static FeatureCenterLoggerConfig copy$default(FeatureCenterLoggerConfig p0,float p1,float p2,float p3,int p4,Object p5){
       FeatureCenterLoggerConfig successRatio;
       FeatureCenterLoggerConfig uFeatureCent;
       FeatureCenterLoggerConfig fileSpaceRat;
       if (p4 & 0x01) {
          successRatio = p0.successRatio;
       }
       if (p4 & 0x02) {
          uFeatureCent = p0.failRatio;
       }
       if (p4 & 0x04) {
          fileSpaceRat = p0.fileSpaceRatio;
       }
       return p0.copy(successRatio, uFeatureCent, fileSpaceRat);
    }
    public final float component1(){
       return this.successRatio;
    }
    public final float component2(){
       return this.failRatio;
    }
    public final float component3(){
       return this.fileSpaceRatio;
    }
    public final FeatureCenterLoggerConfig copy(float p0,float p1,float p2){
       if (PatchProxy.isSupport(FeatureCenterLoggerConfig.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, FeatureCenterLoggerConfig.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new FeatureCenterLoggerConfig(p0, p1, p2);
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FeatureCenterLoggerConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof FeatureCenterLoggerConfig && (!Float.compare(this.successRatio, p0.successRatio) && (!Float.compare(this.failRatio, p0.failRatio) && !Float.compare(this.fileSpaceRatio, p0.fileSpaceRatio))))) {
          return true;
       }
       return false;
    }
    public final float getFailRatio(){
       return this.failRatio;
    }
    public final float getFileSpaceRatio(){
       return this.fileSpaceRatio;
    }
    public final float getSuccessRatio(){
       return this.successRatio;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, FeatureCenterLoggerConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((Float.floatToIntBits(this.successRatio) * 31) + Float.floatToIntBits(this.failRatio)) * 31) + Float.floatToIntBits(this.fileSpaceRatio));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FeatureCenterLoggerConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FeatureCenterLoggerConfig\(successRatio="+this.successRatio+", failRatio="+this.failRatio+", fileSpaceRatio="+this.fileSpaceRatio+"\)";
    }
}
