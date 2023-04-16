package com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$initCore$1;
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

public final class PushSdkInitModuleForSubProcess$initCore$1 extends BroadcastReceiver	// class@0012eb
{
    public final p a;
    public final PushConfig b;

    public void PushSdkInitModuleForSubProcess$initCore$1(p p0,PushConfig p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PushSdkInitModuleForSubProcess$initCore$1.class, "1")) {
          return;
       }
       UniversalReceiver.f(a.b(), this);
       PushLogcat.INSTANCE.i("KwaiPushSDK", "privacy is agree...");
       Application b = a.B;
       a.o(b, "AppEnv.APP");
       this.a.invoke(b, this.b);
       return;
    }
}
