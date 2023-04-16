package com.yxcorp.gifshow.media.model.LiveCameraConfig$CameraUnitConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class LiveCameraConfig$CameraUnitConfig implements Serializable	// class@001d11
{
    public boolean mEnable;
    public static final long serialVersionUID = 0x7f3cfc537ef84778;

    public void LiveCameraConfig$CameraUnitConfig(){
       super();
       this.mEnable = false;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCameraConfig$CameraUnitConfig.class, "1");
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
       if (this.mEnable != p0.mEnable) {
          return false;
       }
       return true;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveCameraConfig$CameraUnitConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((super.hashCode() * 31) + this.mEnable);
    }
}
