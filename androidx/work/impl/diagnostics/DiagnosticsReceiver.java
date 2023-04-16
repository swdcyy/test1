package androidx.work.impl.diagnostics.DiagnosticsReceiver;
import android.content.BroadcastReceiver;
import java.lang.String;
import k3.h;
import android.content.Context;
import android.content.Intent;
import java.lang.Throwable;
import k3.m;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.lang.Class;
import androidx.work.b;
import androidx.work.e;
import k3.i;

public class DiagnosticsReceiver extends BroadcastReceiver	// class@000a89
{
    public static final String a;

    static {
       DiagnosticsReceiver.a = h.f("DiagnosticsRcvr");
    }
    public void DiagnosticsReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 == null) {
          return;
       }
       h oh = h.c();
       String a = DiagnosticsReceiver.a;
       Throwable[] throwableArr = new Throwable[0];
       try{
          oh.a(a, "Requesting diagnostics", throwableArr);
          m.l(p0).h(b.d(DiagnosticsWorker.class));
       }catch(java.lang.IllegalStateException e5){
          throwableArr = new Throwable[]{e5};
          h.c().b(DiagnosticsReceiver.a, "WorkManager is not initialized", throwableArr);
       }
       return;
    }
}
