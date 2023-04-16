package androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import android.content.BroadcastReceiver;
import java.lang.String;
import k3.h;
import android.content.Context;
import android.content.Intent;
import android.content.ComponentName;
import java.lang.Class;
import java.lang.Object;
import java.lang.Throwable;
import android.content.BroadcastReceiver$PendingResult;
import l3.i;
import ig6.c;
import x3.a;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a;
import java.lang.Runnable;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver	// class@000a77
{
    public static final String a;

    static {
       ConstraintProxyUpdateReceiver.a = h.f("ConstrntProxyUpdtRecvr");
    }
    public void ConstraintProxyUpdateReceiver(){
       super();
    }
    public static Intent a(Context p0,boolean p1,boolean p2,boolean p3,boolean p4){
       Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
       intent.setComponent(new ComponentName(p0, ConstraintProxyUpdateReceiver.class));
       intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", p1).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", p2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", p3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", p4);
       return intent;
    }
    public void onReceive(Context p0,Intent p1){
       String action = (p1 != null)? p1.getAction(): null;
       if (!("androidx.work.impl.background.systemalarm.UpdateProxies").equals(action)) {
          Object[] objArray = new Object[]{action};
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(ConstraintProxyUpdateReceiver.a, String.format("Ignoring unknown action %s", objArray), throwableArr);
       }else {
          c.b(p0).J().d(new ConstraintProxyUpdateReceiver$a(this, p1, p0, this.goAsync()));
       }
       return;
    }
}
