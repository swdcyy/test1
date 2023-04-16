package com.yxcorp.experiment.logger.LogEventHelper$1;
import android.content.BroadcastReceiver;
import com.yxcorp.experiment.logger.a;
import android.content.Context;
import android.content.Intent;
import zu8.k;
import java.lang.Runnable;
import f97.a;

public class LogEventHelper$1 extends BroadcastReceiver	// class@0011e7
{
    public final a a;
    public static final int b;

    public void LogEventHelper$1(a p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (!this.a.b()) {
          return;
       }
       a.a(new k(this, p1));
       return;
    }
}
