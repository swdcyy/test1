package com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$initPushSdk$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess;
import com.kwai.android.dispatcher.PushConfig;
import java.lang.Object;
import msd.p;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import qe6.b;
import com.kwai.android.common.utils.PushLogcat;
import o6c.d;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import brd.t;
import t45.d;
import brd.z;
import o6c.e;
import erd.g;
import crd.b;
import android.content.IntentFilter;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$initCore$3;
import java.lang.StringBuilder;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Intent;

public final class PushSdkInitModuleForMainProcess$initPushSdk$1 extends Lambda implements l	// class@00164e
{
    public final PushConfig $pushConfig;
    public final PushSdkInitModuleForMainProcess this$0;

    public void PushSdkInitModuleForMainProcess$initPushSdk$1(PushSdkInitModuleForMainProcess p0,PushConfig p1){
       this.this$0 = p0;
       this.$pushConfig = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushSdkInitModuleForMainProcess$initPushSdk$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       PushSdkInitModuleForMainProcess$initPushSdk$1 tthis$0 = this.this$0;
       PushSdkInitModuleForMainProcess$initPushSdk$1 t$pushConfig = this.$pushConfig;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidTwoRefs(p0, t$pushConfig, tthis$0, PushSdkInitModuleForMainProcess.class, "6")) {
          String str = "KwaiPushSDK";
          if (b.a()) {
             PushLogcat.INSTANCE.i(str, "privacy is agreed...");
             e.f(new d(p0, t$pushConfig), "PushCoreInit", true, true);
             e.b().observeOn(d.a).subscribe(new e(p0, t$pushConfig));
          }else {
             PushLogcat.INSTANCE.i(str, "privacy is not agreed, waiting agree...");
             Application uApplication = a.b();
             a.o(uApplication, "AppEnv.getAppContext\(\)");
             a.b().registerReceiver(new PushSdkInitModuleForMainProcess$initCore$3(p0, t$pushConfig), new IntentFilter("com.android.action.AGREE_PRIVACY_PERMISSION"), uApplication.getPackageName()+".permission.AGREE_PRIVACY_PERMISSION", null);
          }
       }
       return;
    }
}
