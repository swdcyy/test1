package com.ks.ksuploader.KSNetworkMonitor$1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.ks.ksuploader.KSNetworkMonitor$1$1;
import java.lang.Thread;

public final class KSNetworkMonitor$1 extends BroadcastReceiver	// class@000755
{

    public void KSNetworkMonitor$1(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSNetworkMonitor$1.class, "1")) {
          return;
       }
       new KSNetworkMonitor$1$1(this, p0, p1).start();
       return;
    }
}
