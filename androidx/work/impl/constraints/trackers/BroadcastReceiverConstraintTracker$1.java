package androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$1;
import android.content.BroadcastReceiver;
import androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker;
import android.content.Context;
import android.content.Intent;

public class BroadcastReceiverConstraintTracker$1 extends BroadcastReceiver	// class@000a84
{
    public final BroadcastReceiverConstraintTracker a;

    public void BroadcastReceiverConstraintTracker$1(BroadcastReceiverConstraintTracker p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 != null) {
          this.a.h(p0, p1);
       }
       return;
    }
}
