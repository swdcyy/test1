package com.yxcorp.gifshow.media.model.LiveCameraConfig$ShowPageConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class LiveCameraConfig$ShowPageConfig implements Serializable	// class@001d12
{
    public int mCameraStreamTypeForBackCamera;
    public int mCameraStreamTypeForFrontCamera;
    public static final long serialVersionUID = 0x2e2f755098ef641c;

    public void LiveCameraConfig$ShowPageConfig(){
       super();
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCameraConfig$ShowPageConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       if (!super.equals(p0)) {
          return false;
       }
       if (this.mCameraStreamTypeForFrontCamera != p0.mCameraStreamTypeForFrontCamera) {
          return false;
       }
       if (this.mCameraStreamTypeForBackCamera != p0.mCameraStreamTypeForBackCamera) {
          return false;
       }
       return true;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveCameraConfig$ShowPageConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((((super.hashCode() * 31) + this.mCameraStreamTypeForFrontCamera) * 31) + this.mCameraStreamTypeForBackCamera);
    }
}
