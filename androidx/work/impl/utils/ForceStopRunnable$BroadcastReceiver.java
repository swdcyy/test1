package androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import android.content.BroadcastReceiver;
import java.lang.String;
import k3.h;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Throwable;
import androidx.work.impl.utils.ForceStopRunnable;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver	// class@000a92
{
    public static final String a;

    static {
       ForceStopRunnable$BroadcastReceiver.a = h.f("ForceStopRunnable$Rcvr");
    }
    public void ForceStopRunnable$BroadcastReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 != null && ("ACTION_FORCE_STOP_RESCHEDULE").equals(p1.getAction())) {
          Throwable[] throwableArr = new Throwable[0];
          h.c().g(ForceStopRunnable$BroadcastReceiver.a, "Rescheduling alarm that keeps track of force-stops.", throwableArr);
          ForceStopRunnable.e(p0);
       }
       return;
    }
}
