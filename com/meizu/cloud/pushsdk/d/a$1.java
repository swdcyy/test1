package com.meizu.cloud.pushsdk.d.a$1;
import android.content.BroadcastReceiver;
import com.meizu.cloud.pushsdk.d.e.a;
import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushsdk.d.f.e;
import java.lang.Object;
import java.lang.String;
import com.meizu.cloud.pushsdk.d.f.c;

public final class a$1 extends BroadcastReceiver	// class@001500
{
    public final a a;

    public void a$1(a p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (e.a(p0)) {
          Object[] objArray = new Object[]{"online true"};
          c.a("QuickTracker", "restart track event: %s", objArray);
          this.a.a();
       }
       return;
    }
}
