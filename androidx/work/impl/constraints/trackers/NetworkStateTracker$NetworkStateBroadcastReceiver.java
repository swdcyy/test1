package androidx.work.impl.constraints.trackers.NetworkStateTracker$NetworkStateBroadcastReceiver;
import android.content.BroadcastReceiver;
import androidx.work.impl.constraints.trackers.NetworkStateTracker;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import k3.h;
import java.lang.Throwable;
import q3.b;
import s3.c;

public class NetworkStateTracker$NetworkStateBroadcastReceiver extends BroadcastReceiver	// class@000a86
{
    public final NetworkStateTracker a;

    public void NetworkStateTracker$NetworkStateBroadcastReceiver(NetworkStateTracker p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 == null || (p1.getAction() != null && (p1.getAction()).equals("android.net.conn.CONNECTIVITY_CHANGE"))) {
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(NetworkStateTracker.j, "Network broadcast received", throwableArr);
          NetworkStateTracker$NetworkStateBroadcastReceiver ta = this.a;
          ta.d(ta.g());
       }
    label_002c :
       return;
    }
}
