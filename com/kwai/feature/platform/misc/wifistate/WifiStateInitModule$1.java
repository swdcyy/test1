package com.kwai.feature.platform.misc.wifistate.WifiStateInitModule$1;
import android.content.BroadcastReceiver;
import com.kwai.feature.platform.misc.wifistate.WifiStateInitModule;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s06.d;
import java.lang.Runnable;
import android.os.Handler;

public class WifiStateInitModule$1 extends BroadcastReceiver	// class@0012c1
{
    public final WifiStateInitModule a;
    public static final int b;

    public void WifiStateInitModule$1(WifiStateInitModule p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WifiStateInitModule$1.class, "1")) {
          return;
       }
       this.a.q.post(new d(this));
       return;
    }
}
