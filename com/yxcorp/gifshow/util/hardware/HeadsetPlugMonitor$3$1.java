package com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor$3$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor$3;
import brd.v;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import java.lang.Boolean;
import brd.g;

public class HeadsetPlugMonitor$3$1 extends BroadcastReceiver	// class@001d3d
{
    public final v a;
    public final HeadsetPlugMonitor$3 b;

    public void HeadsetPlugMonitor$3$1(HeadsetPlugMonitor$3 p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       String action = p1.getAction();
       if (("android.intent.action.HEADSET_PLUG").equals(action) && p1.hasExtra("state")) {
          int i = 1;
          if (p1.getIntExtra("state", -1) != i) {
             i = 0;
          }
          if (this.b.c != null && !i) {
             i = i | HeadsetPlugMonitor.a();
          }
          this.a.onNext(Boolean.valueOf(i));
       }else if(("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED").equals(action)){
          this.a.onNext(Boolean.valueOf(HeadsetPlugMonitor.a()));
       }
       return;
    }
}
