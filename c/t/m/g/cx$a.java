package c.t.m.g.cx$a;
import android.os.Handler;
import c.t.m.g.cx;
import android.os.Looper;
import c.t.m.g.cx$1;
import android.os.Message;
import c.t.m.g.df;
import java.lang.String;
import c.t.m.g.ed;
import c.t.m.g.ce;
import android.telephony.TelephonyManager;
import java.util.List;
import c.t.m.g.dy;
import android.telephony.CellLocation;
import android.telephony.SignalStrength;
import c.t.m.g.bp;

public final class cx$a extends Handler	// class@000c2d
{
    public final cx a;
    public boolean b;

    public void cx$a(cx p0,Looper p1){
       this.a = p0;
       super(p1);
       this.b = false;
       this.b = false;
    }
    public void cx$a(cx p0,Looper p1,cx$1 p2){
       super(p0, p1);
    }
    public void a(){
       this.b = true;
    }
    public void handleMessage(Message p0){
       if (this.a.a == null) {
          return;
       }
       if (cx.a(this.a) == null || !cx.a(this.a).a(3000)) {
          if (cx.b(this.a).b() != null) {
             ed.a("TxNewCellProvider", "timer notify");
             df uodf = df.a(cx.b(this.a), dy.b(cx.b(this.a)));
             if (!uodf.a()) {
                ed.a("TxNewCellProvider", "time get cell is null");
                uodf = df.a(cx.b(this.a), dy.a(cx.b(this.a)), cx.c(this.a));
                if (uodf == null || !uodf.a()) {
                   ed.a("TxNewCellProvider", "time get celllocation is null or cellinfo not valid");
                }
             }
             cx.a(this.a, uodf, 2);
          }else {
             ed.a("TxNewCellProvider", "mcellinfo is null or isFresh");
          }
       }else {
          ed.a("TxNewCellProvider", "mTencentCellinfo is not null && is fresh");
       }
       byte[] uobyteArray = cx.d(this.a);
       _monitor_enter(uobyteArray);
       if (cx.e(this.a) != null && this.b == null) {
          bp.a(cx.e(this.a), 0, 0x7530);
       }
       _monitor_exit(uobyteArray);
       return;
    }
}
