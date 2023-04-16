package com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor$3;
import io.reactivex.g;
import java.util.concurrent.atomic.AtomicReference;
import android.content.Context;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor$3$1;
import android.content.IntentFilter;
import java.lang.String;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class HeadsetPlugMonitor$3 implements g	// class@001d3e
{
    public final AtomicReference b;
    public final boolean c;
    public final Context d;

    public void HeadsetPlugMonitor$3(AtomicReference p0,boolean p1,Context p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void subscribe(v p0){
       this.b.set(new HeadsetPlugMonitor$3$1(this, p0));
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.HEADSET_PLUG");
       if (this.c != null) {
          intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
       }
       UniversalReceiver.e(this.d, this.b.get(), intentFilter);
       return;
    }
}
