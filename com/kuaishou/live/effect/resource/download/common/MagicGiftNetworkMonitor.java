package com.kuaishou.live.effect.resource.download.common.MagicGiftNetworkMonitor;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.p0;
import com.kuaishou.live.effect.resource.download.common.MagicGiftNetworkMonitor$a;

public class MagicGiftNetworkMonitor extends BroadcastReceiver	// class@001b2c
{
    public MagicGiftNetworkMonitor$a a;
    public static boolean b;

    public void MagicGiftNetworkMonitor(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicGiftNetworkMonitor.class, "1")) {
          return;
       }
       if ((p1.getAction()).equals("android.net.conn.CONNECTIVITY_CHANGE") && this.a != null) {
          boolean b = p0.F(p0);
          this.a.b(b);
          if (!b) {
             this.a.a(p0.A(p0));
          }
       }
       return;
    }
}
