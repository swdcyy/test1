package c.t.m.g.cw;
import android.content.BroadcastReceiver;
import c.t.m.g.ce;
import android.content.Context;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import android.os.Handler;
import android.content.IntentFilter;
import java.lang.String;
import android.content.Intent;
import c.t.m.g.ed;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.Object;
import c.t.m.g.ee;

public class cw extends BroadcastReceiver	// class@000c2b
{
    public final ce a;
    public boolean b;

    public void cw(ce p0){
       super();
       this.a = p0;
    }
    public void a(){
       if (this.b == null) {
          return;
       }
       this.b = false;
       try{
          UniversalReceiver.f(this.a.a, this);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void a(Handler p0){
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.b(p0);
       return;
    }
    public final void b(Handler p0){
       if (p0 != null) {
          try{
             this.a.a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, p0);
          }catch(java.lang.Exception e4){
             if (ed.a) {
                ed.a("TxNetworkStateMonitor", "listenNetworkState: failed", e4);
             }
          }
       }
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 == null) {
          return;
       }
       try{
          if (p1.getBooleanExtra("noConnectivity", false)) {
             this.a.b(Integer.valueOf(-1));
          }else if(ee.d(p0)){
             this.a.b(Integer.valueOf(1));
          }else {
             this.a.b(Integer.valueOf(false));
          }
       }catch(java.lang.Exception e3){
          if (ed.a) {
             ed.a("TxNetworkStateMonitor", "listenNetworkState: Exception", e3);
          }
       }
       return;
    }
}
