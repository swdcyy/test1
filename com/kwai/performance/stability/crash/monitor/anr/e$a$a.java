package com.kwai.performance.stability.crash.monitor.anr.e$a$a;
import android.os.Handler;
import com.kwai.performance.stability.crash.monitor.anr.e$a;
import android.os.Looper;
import android.os.Message;

public class e$a$a extends Handler	// class@0011c6
{
    public final e$a a;

    public void e$a$a(e$a p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       super.handleMessage(p0);
       p0 = p0.what;
       int i = 1;
       if (p0 == 2) {
          e$a$a ta = this.a;
          ta.c = ta.c + i;
       }else if(p0 == i){
          p0.c = 0;
       }
       return;
    }
}
