package com.yxcorp.gifshow.detail.util.RegisterSysHomeButtonClickReceiverThread;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.detail.util.RegisterSysHomeButtonClickReceiverThread$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class RegisterSysHomeButtonClickReceiverThread implements Runnable	// class@001a29
{
    public final WeakReference b;
    public final BroadcastReceiver c;
    public boolean d;
    public boolean e;

    public void RegisterSysHomeButtonClickReceiverThread(Activity p0){
       super();
       this.b = new WeakReference(p0);
       this.c = new RegisterSysHomeButtonClickReceiverThread$1(this);
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, RegisterSysHomeButtonClickReceiverThread.class, "1")) {
          return;
       }
       Activity uActivity = this.b.get();
       if (this.d != null || uActivity == null) {
          return;
       }
       RegisterSysHomeButtonClickReceiverThread tc = this.c;
       _monitor_enter(tc);
       if (this.d == null) {
          UniversalReceiver.e(uActivity, this.c, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
          this.e = true;
       }
       _monitor_exit(tc);
       return;
    }
}
