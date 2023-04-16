package com.yxcorp.gifshow.media.model.LiveCameraConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.media.model.LiveCameraConfig$CameraUnitConfig;
import com.yxcorp.gifshow.media.model.LiveCameraConfig$ShowPageConfig;
import java.lang.Number;

public class LiveCameraConfig implements Serializable	// class@001d13
{
    public int mCameraApiVersion;
    public LiveCameraConfig$CameraUnitConfig mCameraUnitConfig;
    public boolean mEnableCameraKit;
    public boolean mEnableCameraVivoApi;
    public boolean mEnableRecordingHint;
    public LiveCameraConfig$ShowPageConfig mShowPageConfig;
    public static final long serialVersionUID = 0xcdcd971f56a400fb;

    public void LiveCameraConfig(){
       super();
       this.mEnableCameraKit = false;
       this.mEnableCameraVivoApi = false;
       this.mEnableRecordingHint = false;
       this.mCameraApiVersion = -1;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveCameraConfig.class, "1");
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
       if (this.mEnableCameraKit != p0.mEnableCameraKit) {
          return false;
       }
       if (this.mEnableCameraVivoApi != p0.mEnableCameraVivoApi) {
          return false;
       }
       if (this.mEnableRecordingHint != p0.mEnableRecordingHint) {
          return false;
       }
       LiveCameraConfig tmCameraUnit = this.mCameraUnitConfig;
       if (tmCameraUnit != null) {
          if (!tmCameraUnit.equals(p0.mCameraUnitConfig)) {
          label_0054 :
             return false;
          }
       }else if(p0.mCameraUnitConfig != null){
          goto label_0054 ;
       }
       tmCameraUnit = this.mShowPageConfig;
       p0 = p0.mShowPageConfig;
       if (tmCameraUnit != null) {
          if (!tmCameraUnit.equals(p0)) {
          label_0064 :
             return false;
          }
       }else if(p0 != null){
          goto label_0064 ;
       }
       return true;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveCameraConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = ((((super.hashCode() * 31) + this.mEnableCameraKit) * 31) + this.mEnableCameraVivoApi) * 31;
       LiveCameraConfig tmCameraUnit = this.mCameraUnitConfig;
       int i1 = 0;
       int i2 = (tmCameraUnit != null)? tmCameraUnit.hashCode(): 0;
       i = (((i + i2) * 31) + this.mEnableRecordingHint) * 31;
       tmCameraUnit = this.mShowPageConfig;
       if (tmCameraUnit != null) {
          i1 = tmCameraUnit.hashCode();
       }
       return (i + i1);
    }
    public boolean isCameraUnitEnabled(){
       LiveCameraConfig tmCameraUnit = this.mCameraUnitConfig;
       boolean b = (tmCameraUnit != null && tmCameraUnit.mEnable != null)? true: false;
       return b;
    }
}
