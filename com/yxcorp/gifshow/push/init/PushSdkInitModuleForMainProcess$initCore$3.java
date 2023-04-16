package com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$initCore$3;
import android.content.BroadcastReceiver;
import msd.p;
import com.kwai.android.dispatcher.PushConfig;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.android.common.utils.PushLogcat;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$a;

public final class PushSdkInitModuleForMainProcess$initCore$3 extends BroadcastReceiver	// class@00164d
{
    public final p a;
    public final PushConfig b;

    public void PushSdkInitModuleForMainProcess$initCore$3(p p0,PushConfig p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PushSdkInitModuleForMainProcess$initCore$3.class, "1")) {
          return;
       }
       UniversalReceiver.f(a.b(), this);
       PushLogcat.INSTANCE.i("KwaiPushSDK", "privacy is agree...");
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       this.a.invoke(b, this.b);
       PushSdkInitModuleForMainProcess.s.b(true);
       return;
    }
}
