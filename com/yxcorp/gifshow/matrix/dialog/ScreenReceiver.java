package com.yxcorp.gifshow.matrix.dialog.ScreenReceiver;
import android.content.BroadcastReceiver;
import java.lang.Runnable;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class ScreenReceiver extends BroadcastReceiver	// class@001ce0
{
    public Runnable a;

    public void ScreenReceiver(Runnable p0){
       super();
       this.a = p0;
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScreenReceiver.class, "1")) {
          return;
       }
       String action = (p1 != null)? p1.getAction(): null;
       if (a.g("android.intent.action.USER_PRESENT", action)) {
          ScreenReceiver ta = this.a;
          if (ta != null) {
             ta.run();
          }
          if (p0 != null) {
             UniversalReceiver.f(p0, this);
          }
       }
       return;
    }
}
