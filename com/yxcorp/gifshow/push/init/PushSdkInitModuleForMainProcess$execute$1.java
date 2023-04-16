package com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$execute$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.os.Build$VERSION;

public final class PushSdkInitModuleForMainProcess$execute$1 extends BroadcastReceiver	// class@00164c
{
    public final PushSdkInitModuleForMainProcess a;

    public void PushSdkInitModuleForMainProcess$execute$1(PushSdkInitModuleForMainProcess p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PushSdkInitModuleForMainProcess$execute$1.class, "1")) {
          return;
       }
       UniversalReceiver.f(a.b(), this);
       if (Build$VERSION.SDK_INT >= 33) {
          this.a.q0();
       }
       return;
    }
}
