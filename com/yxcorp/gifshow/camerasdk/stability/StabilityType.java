package com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import java.lang.Enum;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType$1;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType$2;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType$3;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType$4;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.framework.abtest.f;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.kwai.camerasdk.models.DaenerysCaptureStabilizationMode;
import qi9.g1;
import com.yxcorp.gifshow.media.model.CameraConfig;
import java.lang.Number;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;

public abstract class StabilityType extends Enum	// class@00104b
{
    public static final StabilityType[] $VALUES;
    public static final StabilityType DISABLED;
    public static final StabilityType OFF;
    public static final StabilityType SUPER;
    public static final StabilityType SUPER_PRO;
    public static final StabilityType TYPE_DEFAULT;

    static {
       StabilityType$1 u1 = new StabilityType$1("DISABLED", 0);
       StabilityType.DISABLED = u1;
       StabilityType$2 u2 = new StabilityType$2("OFF", 1);
       StabilityType.OFF = u2;
       StabilityType$3 u3 = new StabilityType$3("SUPER", 2);
       StabilityType.SUPER = u3;
       StabilityType$4 u4 = new StabilityType$4("SUPER_PRO", 3);
       StabilityType.SUPER_PRO = u4;
       StabilityType[] stabilityTyp = new StabilityType[]{u1,u2,u3,u4};
       StabilityType.$VALUES = stabilityTyp;
       StabilityType.TYPE_DEFAULT = u2;
    }
    public void StabilityType(String p0,int p1){
       super(p0, p1);
    }
    public void StabilityType(String p0,int p1,StabilityType$1 p2){
       super(p0, p1);
    }
    public static boolean enableMagicFaceRename(){
       Object obj = PatchProxy.apply(null, null, StabilityType.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.d("magicFaceRename");
    }
    public static String getStabilityTypeLog(StabilityType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StabilityType.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return StabilityType.DISABLED.getStrForLog();
       }
       return p0.getStrForLog();
    }
    public static StabilityType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StabilityType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(StabilityType.class, p0);
    }
    public static StabilityType[] values(){
       Object obj = PatchProxy.apply(null, null, StabilityType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return StabilityType.$VALUES.clone();
    }
    public abstract int getClickToastResId();
    public final DaenerysCaptureStabilizationMode getDefaultStabilityModeFromConfig(CameraPageConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StabilityType.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g1.e(p0.mCaptureStabilizationModeForBackCamera);
    }
    public String getDisableReason(){
       return null;
    }
    public abstract int getLabelImageResId();
    public int getLabelResId(){
       return 0x7f104ee0;
    }
    public int getRecorderFps(CameraConfig p0){
       int hardwareReco;
       EncodeConfig obj = PatchProxy.applyOneRefs(p0, this, StabilityType.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = b.c();
       if (this.isStabilityOn() && obj.isUseHardwareEncode()) {
          p0 = p0.mHardwareRecordFpsForHighFrameRate;
          if (p0 > null) {
             return p0;
          }else {
             return 60;
          }
       }else if(obj.isUseHardwareEncode()){
          hardwareReco = obj.getHardwareRecordFps();
       }else {
          hardwareReco = obj.getSoftwareRecordFps();
       }
       return hardwareReco;
    }
    public int getRenderFps(){
       Object obj = PatchProxy.apply(null, this, StabilityType.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.isStabilityOn())? 60: 30;
       return i;
    }
    public DaenerysCaptureStabilizationMode getStabilityMode(CameraPageConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StabilityType.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getDefaultStabilityModeFromConfig(p0);
    }
    public abstract String getStrForLog();
    public boolean isDisabled(){
       return false;
    }
    public boolean isStabilityOn(){
       return false;
    }
    public abstract boolean isValidWithConfig(CameraUnitConfig p0);
    public abstract StabilityType move();
    public void reset(){
    }
    public void setDisableByBeauty(boolean p0){
    }
    public void setDisableByBody(boolean p0){
    }
    public void setDisableByFrontCamera(boolean p0){
    }
    public void setDisableByLowlightBoost(boolean p0){
    }
    public void setDisableByMagic(boolean p0){
    }
    public void setDisableByMakeup(boolean p0){
    }
    public void setDisableByWide(boolean p0){
    }
    public boolean shouldDisableFlash(){
       return false;
    }
}
