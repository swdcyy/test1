package com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor$a;
import erd.a;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public class HeadsetPlugMonitor$a implements a	// class@001d40
{
    public final Context b;
    public final AtomicReference c;

    public void HeadsetPlugMonitor$a(Context p0,AtomicReference p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       UniversalReceiver.f(this.b, this.c.get());
    }
}
