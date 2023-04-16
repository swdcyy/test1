package com.kwai.feature.api.social.common.jsbridge.model.FaceDetectResult;
import java.io.Serializable;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class FaceDetectResult implements Serializable	// class@0010c1
{
    public final boolean detectPassed;

    public void FaceDetectResult(){
       super(false, 1, null);
    }
    public void FaceDetectResult(boolean p0){
       super();
       this.detectPassed = p0;
    }
    public void FaceDetectResult(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       super(p0);
       return;
    }
    public static FaceDetectResult copy$default(FaceDetectResult p0,boolean p1,int p2,Object p3){
       FaceDetectResult detectPassed;
       if (p2 & 0x01) {
          detectPassed = p0.detectPassed;
       }
       return p0.copy(detectPassed);
    }
    public final boolean component1(){
       return this.detectPassed;
    }
    public final FaceDetectResult copy(boolean p0){
       if (PatchProxy.isSupport(FaceDetectResult.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, FaceDetectResult.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new FaceDetectResult(p0);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof FaceDetectResult && this.detectPassed == p0.detectPassed)) {
          return true;
       }
       return false;
    }
    public final boolean getDetectPassed(){
       return this.detectPassed;
    }
    public int hashCode(){
       FaceDetectResult tdetectPasse = this.detectPassed;
       if (tdetectPasse != null) {
          tdetectPasse = 1;
       }
       return tdetectPasse;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, FaceDetectResult.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FaceDetectResult\(detectPassed="+this.detectPassed+"\)";
    }
}
