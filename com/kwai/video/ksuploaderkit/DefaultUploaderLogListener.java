package com.kwai.video.ksuploaderkit.DefaultUploaderLogListener;
import com.ks.ksuploader.KSUploaderLogListener;
import java.lang.Object;
import com.ks.ksuploader.KSUploaderLogLevel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import kotlin.jvm.internal.a;
import com.kwai.video.ksuploaderkit.DefaultUploaderLogListener$WhenMappings;
import java.lang.Enum;
import com.yxcorp.gifshow.init.module.KSUploaderKitLogInit;
import com.yxcorp.gifshow.init.module.KSUploaderKitLogInit$Companion;
import q87.c;

public final class DefaultUploaderLogListener implements KSUploaderLogListener	// class@000955
{

    public void DefaultUploaderLogListener(){
       super();
    }
    public void onLog(KSUploaderLogLevel p0,String p1,long p2){
       Object[] objArray;
       if (PatchProxy.isSupport(DefaultUploaderLogListener.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, DefaultUploaderLogListener.class, "1")) {
          return;
       }
       a.p(p0, "logLevel");
       a.p(p1, "log");
       int i = DefaultUploaderLogListener$WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                objArray = new Object[0];
                KSUploaderKitLogInit.c.a().w("RickonLog", p1, objArray);
             }else {
                objArray = new Object[0];
                KSUploaderKitLogInit.c.a().t("RickonLog", p1, objArray);
             }
          }else {
             objArray = new Object[0];
             KSUploaderKitLogInit.c.a().A("RickonLog", p1, objArray);
          }
       }else {
          objArray = new Object[0];
          KSUploaderKitLogInit.c.a().s("RickonLog", p1, objArray);
       }
       return;
    }
}
