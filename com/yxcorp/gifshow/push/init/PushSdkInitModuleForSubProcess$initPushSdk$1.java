package com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$initPushSdk$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess;
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
import o56.a;
import android.content.IntentFilter;
import android.app.Application;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$initCore$1;
import java.lang.StringBuilder;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Intent;

public final class PushSdkInitModuleForSubProcess$initPushSdk$1 extends Lambda implements l	// class@0012ec
{
    public final PushConfig $pushConfig;
    public final PushSdkInitModuleForSubProcess this$0;

    public void PushSdkInitModuleForSubProcess$initPushSdk$1(PushSdkInitModuleForSubProcess p0,PushConfig p1){
       this.this$0 = p0;
       this.$pushConfig = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(p p0){
       Application b;
       if (PatchProxy.applyVoidOneRefs(p0, this, PushSdkInitModuleForSubProcess$initPushSdk$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       PushSdkInitModuleForSubProcess$initPushSdk$1 tthis$0 = this.this$0;
       PushSdkInitModuleForSubProcess$initPushSdk$1 t$pushConfig = this.$pushConfig;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoidTwoRefs(p0, t$pushConfig, tthis$0, PushSdkInitModuleForSubProcess.class, "5")) {
          String str = "KwaiPushSDK";
          if (b.a()) {
             PushLogcat.INSTANCE.i(str, "privacy is agreed...");
             b = a.B;
             a.o(b, "AppEnv.APP");
             p0.invoke(b, t$pushConfig);
          }else {
             PushLogcat.INSTANCE.i(str, "privacy is not agreed, waiting agree...");
             Application uApplication = a.b();
             a.o(uApplication, "AppEnv.getAppContext\(\)");
             a.b().registerReceiver(new PushSdkInitModuleForSubProcess$initCore$1(p0, t$pushConfig), new IntentFilter("com.android.action.AGREE_PRIVACY_PERMISSION"), uApplication.getPackageName()+".permission.AGREE_PRIVACY_PERMISSION", null);
          }
       }
       return;
    }
}
