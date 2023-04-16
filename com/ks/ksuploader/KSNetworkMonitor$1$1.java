package com.ks.ksuploader.KSNetworkMonitor$1$1;
import java.lang.Thread;
import com.ks.ksuploader.KSNetworkMonitor$1;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.ks.ksuploader.KSNetworkMonitor;

public class KSNetworkMonitor$1$1 extends Thread	// class@000754
{
    public final KSNetworkMonitor$1 this$0;
    public final Context val$context;
    public final Intent val$intent;

    public void KSNetworkMonitor$1$1(KSNetworkMonitor$1 p0,Context p1,Intent p2){
       this.this$0 = p0;
       this.val$context = p1;
       this.val$intent = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, KSNetworkMonitor$1$1.class, "1")) {
          return;
       }
       KSNetworkMonitor.onNetworkChange(this.val$context, this.val$intent);
       return;
    }
}
