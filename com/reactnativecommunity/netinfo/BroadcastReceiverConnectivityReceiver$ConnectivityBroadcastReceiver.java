package com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver$ConnectivityBroadcastReceiver;
import android.content.BroadcastReceiver;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;

public class BroadcastReceiverConnectivityReceiver$ConnectivityBroadcastReceiver extends BroadcastReceiver	// class@000b64
{
    public boolean a;
    public final BroadcastReceiverConnectivityReceiver b;

    public void BroadcastReceiverConnectivityReceiver$ConnectivityBroadcastReceiver(BroadcastReceiverConnectivityReceiver p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public void a(boolean p0){
       this.a = p0;
    }
    public void onReceive(Context p0,Intent p1){
       String action = p1.getAction();
       if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
          this.b.h();
       }
       return;
    }
}
