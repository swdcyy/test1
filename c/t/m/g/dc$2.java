package c.t.m.g.dc$2;
import java.lang.Runnable;
import c.t.m.g.dc;
import java.lang.Object;
import android.content.IntentFilter;
import java.lang.String;
import android.os.Handler;
import c.t.m.g.ce;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import c.t.m.g.ed;
import java.lang.Throwable;

public class dc$2 implements Runnable	// class@000c3b
{
    public final dc a;

    public void dc$2(dc p0){
       this.a = p0;
       super();
    }
    public void run(){
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
       String str = "android.net.wifi.SCAN_RESULTS";
       try{
          intentFilter.addAction(str);
          if (dc.c(this.a) != null) {
             dc$2 ta = this.a;
             dc.d(this.a).a.registerReceiver(ta, intentFilter, null, dc.c(ta));
          }else {
             UniversalReceiver.e(dc.d(this.a).a, this.a, intentFilter);
          }
       }catch(java.lang.Exception e0){
          if (ed.a) {
             ed.a("TxWifiProvider", "listenWifiState: failed", e0);
          }
       }
       return;
    }
}
