package com.yxcorp.gifshow.init.module.UploaderKitInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import c76.b;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import o56.a;
import xf6.h;
import com.kwai.video.ksuploaderkit.KSUploaderKitNetManager$ServerEnvType;
import com.kwai.video.ksuploaderkit.KSUploaderKitNetManager;

public final class UploaderKitInitModule extends a	// class@0019aa
{

    public void UploaderKitInitModule(){
       super();
    }
    public boolean H7(){
       Object obj = PatchProxy.applyWithListener(null, this, UploaderKitInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(UploaderKitInitModule.class, "2");
       return (b.b() ^ 0x01);
    }
    public int f0(){
       return 2;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, UploaderKitInitModule.class, "1")) {
          return;
       }
       KSUploaderKitLog.i("UploaderKitInitModule", "execute");
       if (a.d()) {
          if (h.r()) {
             KSUploaderKitNetManager.setServerEnvType(KSUploaderKitNetManager$ServerEnvType.STAGING);
          }else {
             KSUploaderKitNetManager.setServerEnvType(KSUploaderKitNetManager$ServerEnvType.RELEASE);
          }
       }
       PatchProxy.onMethodExit(UploaderKitInitModule.class, "1");
       return;
    }
}
