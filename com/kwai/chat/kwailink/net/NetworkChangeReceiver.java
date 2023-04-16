package com.kwai.chat.kwailink.net.NetworkChangeReceiver;
import android.content.BroadcastReceiver;
import java.util.concurrent.ScheduledExecutorService;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g85.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.content.Context;
import com.kwai.chat.kwailink.base.b;
import android.content.IntentFilter;
import android.content.Intent;
import com.kwai.chat.kwailink.utils.AndroidUtils;
import w75.a;
import java.lang.Runnable;

public class NetworkChangeReceiver extends BroadcastReceiver	// class@000a60
{
    public static NetworkChangeReceiver a;
    public static ScheduledExecutorService b;

    public void NetworkChangeReceiver(){
       super();
    }
    public static ScheduledExecutorService a(){
       NetworkChangeReceiver obj = PatchProxy.apply(null, null, NetworkChangeReceiver.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (NetworkChangeReceiver.b == null) {
          obj = NetworkChangeReceiver.class;
          _monitor_enter(obj);
          if (NetworkChangeReceiver.b == null) {
             NetworkChangeReceiver.b = Executors.newSingleThreadScheduledExecutor(new a("NetworkChangeReceiver"));
          }
          _monitor_exit(obj);
       }
       return NetworkChangeReceiver.b;
    }
    public static void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, NetworkChangeReceiver.class, "3")) {
          return;
       }
       Context uContext = b.b();
       NetworkChangeReceiver networkChang = PatchProxy.apply(objArray, objArray, NetworkChangeReceiver.class, "2");
       if (networkChang != PatchProxyResult.class) {
       }else if(NetworkChangeReceiver.a == null){
          networkChang = NetworkChangeReceiver.class;
          _monitor_enter(networkChang);
          if (NetworkChangeReceiver.a == null) {
             NetworkChangeReceiver.a = new NetworkChangeReceiver();
          }
          _monitor_exit(networkChang);
       }
       networkChang = NetworkChangeReceiver.a;
       AndroidUtils.registerReceiverWithoutException(uContext, networkChang, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
       return;
    }
    public final void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NetworkChangeReceiver.class, "4")) {
          return;
       }
       NetworkChangeReceiver.a().execute(new a(p1));
       return;
    }
}
