package com.meizu.cloud.pushsdk.handler.a.f.a$1;
import android.content.BroadcastReceiver;
import com.meizu.cloud.pushsdk.handler.a.f.a;
import android.content.Context;
import android.content.Intent;
import java.lang.String;

public class a$1 extends BroadcastReceiver	// class@001556
{
    public final a a;

    public void a$1(a p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (!("android.intent.action.USER_PRESENT").equalsIgnoreCase(p1.getAction())) {
          return;
       }
       a.a(this.a);
       return;
    }
}
