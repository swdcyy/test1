package c.t.m.g.e$1;
import android.content.BroadcastReceiver;
import c.t.m.g.e;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import java.lang.Object;
import c.t.m.g.bt;
import java.lang.StringBuilder;
import android.os.Handler;
import c.t.m.g.bp;
import c.t.m.g.g;

public class e$1 extends BroadcastReceiver	// class@000c5e
{
    public final e a;

    public void e$1(e p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 != null && ("android.net.conn.CONNECTIVITY_CHANGE").equals(p1.getAction())) {
          boolean booleanExtra = p1.getBooleanExtra("noConnectivity", false);
          if (bt.a()) {
             bt.a("DC_Pro", "intent:"+p1+",");
          }
          if (!booleanExtra) {
             bp.a(e.a(this.a), 107, 2000);
             if (e.b(this.a) != null) {
                e.b(this.a).a(2000);
             }
          }
       }
    label_0057 :
       return;
    }
}
