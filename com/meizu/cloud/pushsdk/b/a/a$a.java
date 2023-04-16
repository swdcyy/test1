package com.meizu.cloud.pushsdk.b.a.a$a;
import android.content.BroadcastReceiver;
import com.meizu.cloud.pushsdk.b.a.a;
import com.meizu.cloud.pushsdk.b.a.a$1;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.Runnable;

public class a$a extends BroadcastReceiver	// class@001498
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a$a(a p0,a$1 p1){
       super(p0);
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 != null && (p1.getAction()).equals("alarm.util")) {
          DebugLogger.i("AlarmUtils", "on receive delayed task, keyword: "+a.a(this.a));
          a.a(this.a, true);
          a.b(this.a);
          a.c(this.a).run();
       }
       return;
    }
}
