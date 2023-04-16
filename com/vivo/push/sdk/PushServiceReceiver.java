package com.vivo.push.sdk.PushServiceReceiver;
import android.content.BroadcastReceiver;
import com.vivo.push.sdk.PushServiceReceiver$a;
import android.content.Context;
import android.content.Intent;
import com.vivo.push.util.ContextDelegate;
import java.lang.String;
import java.lang.Object;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Looper;
import java.lang.StringBuilder;
import com.vivo.push.util.p;
import java.lang.Runnable;

public class PushServiceReceiver extends BroadcastReceiver	// class@001098
{
    public static HandlerThread a;
    public static Handler b;
    public static PushServiceReceiver$a c;

    static {
       PushServiceReceiver.c = new PushServiceReceiver$a();
    }
    public void PushServiceReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       p0 = ContextDelegate.getContext(p0);
       String action = p1.getAction();
       if (!("android.net.conn.CONNECTIVITY_CHANGE").equals(action) && (("android.intent.action.ACTION_POWER_CONNECTED").equals(action) || ("android.intent.action.ACTION_POWER_DISCONNECTED").equals(action))) {
          if (PushServiceReceiver.a == null) {
             HandlerThread handlerThrea = new HandlerThread("PushServiceReceiver");
             PushServiceReceiver.a = handlerThrea;
             handlerThrea.start();
             PushServiceReceiver.b = new Handler(PushServiceReceiver.a.getLooper());
          }
          p.d("PushServiceReceiver", p0.getPackageName()+": start PushSerevice for by "+action+"  ; handler : "+PushServiceReceiver.b);
          PushServiceReceiver$a.a(PushServiceReceiver.c, p0, action);
          PushServiceReceiver.b.removeCallbacks(PushServiceReceiver.c);
          PushServiceReceiver.b.postDelayed(PushServiceReceiver.c, 2000);
       }
       return;
    }
}
