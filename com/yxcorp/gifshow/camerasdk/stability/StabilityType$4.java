package com.yxcorp.gifshow.camerasdk.stability.StabilityType$4;
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

public final class StabilityType$4 extends StabilityType	// class@00104a
{

    public void StabilityType$4(String p0,int p1){
       super(p0, p1, null);
    }
    public int getClickToastResId(){
       return 0x7f104ee5;
    }
    public int getLabelImageResId(){
       Object obj = PatchProxy.apply(null, this, StabilityType$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (s6.m())? 0x7f081bdb: 0x7f081bda;
       return i;
    }
    public int getLabelResId(){
       return 0x7f104ee4;
    }
    public DaenerysCaptureStabilizationMode getStabilityMode(CameraPageConfig p0){
       return DaenerysCaptureStabilizationMode.kStabilizationModeProSuperEIS;
    }
    public String getStrForLog(){
       return "pro";
    }
    public boolean isStabilityOn(){
       return true;
    }
    public boolean isValidWithConfig(CameraUnitConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StabilityType$4.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.isEisEnable() && (p0.mSupportSuperEisPro != null && CameraController.supportProSuperStabilization(a.a().a(), CameraApiVersion.kAndroidCameraUnit)))? true: false;
       return b;
    }
    public StabilityType move(){
       return StabilityType.OFF;
    }
    public boolean shouldDisableFlash(){
       return true;
    }
}
