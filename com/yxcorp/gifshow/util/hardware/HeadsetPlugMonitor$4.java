package com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor$4;
import android.content.BroadcastReceiver;
import brd.v;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import brd.g;

public class HeadsetPlugMonitor$4 extends BroadcastReceiver	// class@001d3f
{
    public final v a;

    public void HeadsetPlugMonitor$4(v p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (("android.media.AUDIO_BECOMING_NOISY").equals(p1.getAction())) {
          this.a.onNext(Boolean.TRUE);
       }
       return;
    }
}
