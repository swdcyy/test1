package com.kwai.performance.stability.crash.monitor.anr.async.b$a;
import android.os.HandlerThread;
import com.kwai.performance.stability.crash.monitor.anr.async.b;
import java.lang.String;
import java.lang.Runnable;
import android.os.Handler;
import android.os.Looper;
import com.kwai.performance.stability.crash.monitor.anr.config.AsyncScheduleConfig;

public class b$a extends HandlerThread	// class@0011a6
{
    public final Runnable b;
    public final b c;

    public void b$a(b p0,String p1,Runnable p2){
       this.c = p0;
       this.b = p2;
       super(p1);
    }
    public void onLooperPrepared(){
       this.c.f = new Handler(this.getLooper());
       b$a tc = this.c;
       b f = tc.f;
       b$a tb = this.b;
       AsyncScheduleConfig tempCheckDel = tc.b.tempCheckDelayTime;
       long l = (tempCheckDel != -1)? (long)tempCheckDel: 2000;
       f.postDelayed(tb, l);
       return;
    }
}
