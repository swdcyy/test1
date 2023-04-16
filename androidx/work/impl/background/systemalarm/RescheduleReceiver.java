package androidx.work.impl.background.systemalarm.RescheduleReceiver;
import android.content.BroadcastReceiver;
import java.lang.String;
import k3.h;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Throwable;
import android.os.Build$VERSION;
import l3.i;
import ig6.c;
import android.content.BroadcastReceiver$PendingResult;
import androidx.work.impl.background.systemalarm.a;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;

public class RescheduleReceiver extends BroadcastReceiver	// class@000a78
{
    public static final String a;

    static {
       RescheduleReceiver.a = h.f("RescheduleReceiver");
    }
    public void RescheduleReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       Object[] objArray = new Object[]{p1};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(RescheduleReceiver.a, String.format("Received intent %s", objArray), throwableArr);
       if (Build$VERSION.SDK_INT >= 23) {
          try{
             c.b(p0).N(this.goAsync());
          }catch(java.lang.IllegalStateException e0){
             Throwable[] throwableArr1 = new Throwable[0];
             h.c().b(RescheduleReceiver.a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate\(\) or an Application#onCreate\(\).", throwableArr1);
          }
       }else {
          a.e(p0, a.e(p0));
       }
    }
}
