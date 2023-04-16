package com.kwai.yoda.hybrid.NetworkConnectChangedReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.azeroth.Azeroth2;
import android.os.SystemClock;
import com.kwai.yoda.Yoda;
import gz7.i;
import java.util.Objects;
import hy7.p;
import java.lang.Runnable;
import am8.d;

public class NetworkConnectChangedReceiver extends BroadcastReceiver	// class@00127a
{
    public long a;

    public void NetworkConnectChangedReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NetworkConnectChangedReceiver.class, "1")) {
          return;
       }
       if (("android.net.wifi.STATE_CHANGE").equals(p1.getAction()) && (Azeroth2.B.t() && (SystemClock.elapsedRealtime() - this.a) - 5000 > 0)) {
          this.a = SystemClock.elapsedRealtime();
          i offlinePacka = Yoda.get().getOfflinePackageHandler();
          if (offlinePacka == null) {
             return;
          }else {
             Objects.requireNonNull(offlinePacka);
             d.d(new p(offlinePacka), "handleNetworkChanged", 3);
          }
       }
       return;
    }
}
