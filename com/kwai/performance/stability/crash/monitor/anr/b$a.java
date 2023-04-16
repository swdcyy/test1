package com.kwai.performance.stability.crash.monitor.anr.b$a;
import android.os.Handler;
import com.kwai.performance.stability.crash.monitor.anr.b;
import android.os.Looper;
import android.os.Message;
import com.kwai.performance.stability.crash.monitor.anr.config.AnrMonitorConfig;
import vg7.a;

public class b$a extends Handler	// class@000dfa
{
    public final b a;

    public void b$a(b p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (p0.what == 0x2710) {
          a.g(this, p0.obj, this.a.j);
       }
       return;
    }
}
