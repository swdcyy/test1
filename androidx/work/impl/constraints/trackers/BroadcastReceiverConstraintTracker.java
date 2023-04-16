package androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import s3.c;
import java.lang.String;
import k3.h;
import android.content.Context;
import x3.a;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.Throwable;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;

public abstract class BroadcastReceiverConstraintTracker extends c	// class@000a85
{
    public final BroadcastReceiver g;
    public static final String h;

    static {
       BroadcastReceiverConstraintTracker.h = h.f("BrdcstRcvrCnstrntTrckr");
    }
    public void BroadcastReceiverConstraintTracker(Context p0,a p1){
       super(p0, p1);
       this.g = new BroadcastReceiverConstraintTracker$1(this);
    }
    public void e(){
       Object[] objArray = new Object[]{this.getClass().getSimpleName()};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(BroadcastReceiverConstraintTracker.h, String.format("%s: registering receiver", objArray), throwableArr);
       this.b.registerReceiver(this.g, this.g());
    }
    public void f(){
       Object[] objArray = new Object[]{this.getClass().getSimpleName()};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(BroadcastReceiverConstraintTracker.h, String.format("%s: unregistering receiver", objArray), throwableArr);
       this.b.unregisterReceiver(this.g);
    }
    public abstract IntentFilter g();
    public abstract void h(Context p0,Intent p1);
}
