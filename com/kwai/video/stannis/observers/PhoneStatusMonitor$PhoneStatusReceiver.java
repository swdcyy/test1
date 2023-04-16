package com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusReceiver;
import android.content.BroadcastReceiver;
import com.kwai.video.stannis.observers.PhoneStatusMonitor;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.observers.PhoneStatusMonitor$PhoneStatusReceiver$1;
import java.lang.Runnable;
import android.os.Handler;

public class PhoneStatusMonitor$PhoneStatusReceiver extends BroadcastReceiver	// class@000c5e
{
    public final PhoneStatusMonitor this$0;

    public void PhoneStatusMonitor$PhoneStatusReceiver(PhoneStatusMonitor p0){
       this.this$0 = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PhoneStatusMonitor$PhoneStatusReceiver.class, "1")) {
          return;
       }
       if ((p1.getAction()).equals("android.intent.action.NEW_OUTGOING_CALL")) {
          Log.i("PhoneStatusMonitor", "onReceive NEW_OUTGOING_CALL");
       }else {
          Log.i("PhoneStatusMonitor", "onReceive PHONE_STATE");
          PhoneStatusMonitor mPhoneStatus = this.this$0.mPhoneStatusLock;
          _monitor_enter(mPhoneStatus);
          PhoneStatusMonitor mPhoneStatus1 = this.this$0.mPhoneStatusHandler;
          if (mPhoneStatus1 != null) {
             mPhoneStatus1.post(new PhoneStatusMonitor$PhoneStatusReceiver$1(this));
          }
          _monitor_exit(mPhoneStatus);
       }
       return;
    }
}
