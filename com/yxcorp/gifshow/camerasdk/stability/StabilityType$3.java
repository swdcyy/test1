package com.yxcorp.gifshow.camerasdk.stability.StabilityType$3;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType$1;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.s6;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.kwai.camerasdk.models.DaenerysCaptureStabilizationMode;
import com.yxcorp.gifshow.media.model.CameraUnitConfig;
import java.lang.Boolean;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.camerasdk.models.CameraApiVersion;
import android.content.Context;
import com.kwai.camerasdk.videoCapture.CameraController;

public final class StabilityType$3 extends StabilityType	// class@001049
{

    public void StabilityType$3(String p0,int p1){
       super(p0, p1, null);
    }
    public int getClickToastResId(){
       Object obj = PatchProxy.apply(null, this, StabilityType$3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (StabilityType.enableMagicFaceRename())? 0x7f104ee2: 0x7f104ee1;
       return i;
    }
    public int getLabelImageResId(){
       Object obj = PatchProxy.apply(null, this, StabilityType$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (s6.m())? 0x7f081c11: 0x7f081bdd;
       return i;
    }
    public DaenerysCaptureStabilizationMode getStabilityMode(CameraPageConfig p0){
       return DaenerysCaptureStabilizationMode.kStabilizationModeSuperEIS;
    }
    public String getStrForLog(){
       return "on";
    }
    public boolean isStabilityOn(){
       return true;
    }
    public boolean isValidWithConfig(CameraUnitConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StabilityType$3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.isEisEnable() && (p0.mSupportSuperEis != null && CameraController.supportSuperStabilization(a.a().a(), CameraApiVersion.kAndroidCameraUnit)))? true: false;
       return b;
    }
    public StabilityType move(){
       return StabilityType.SUPER_PRO;
    }
}
