package c.t.m.g.cx$b;
import android.telephony.PhoneStateListener;
import c.t.m.g.cx;
import c.t.m.g.ce;
import android.telephony.TelephonyManager;
import c.t.m.g.cd;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;
import c.t.m.g.ed;
import java.util.List;
import c.t.m.g.df;
import android.telephony.CellLocation;
import java.lang.Thread;
import android.telephony.SignalStrength;
import android.telephony.ServiceState;

public final class cx$b extends PhoneStateListener	// class@000c2e
{
    public final cx a;

    public void cx$b(cx p0){
       this.a = p0;
       super();
       this.a(1297);
    }
    public void a(){
       this.a(0);
    }
    public final void a(int p0){
       cx.b(this.a).b().listen(this, p0);
       cd.c().a("cell", "lCS");
       return;
    }
    public void onCellInfoChanged(List p0){
       if (p0 == null || !p0.size()) {
          ed.a("TxNewCellProvider", "onCellInfoChanged: null");
       }
       cx.a(this.a, df.a(cx.b(this.a), p0), 0);
       return;
    }
    public void onCellLocationChanged(CellLocation p0){
       if (ed.a) {
          ed.a("TxNewCellProvider", "CellLocationThreadName = "+Thread.currentThread().getName());
       }
       super.onCellLocationChanged(p0);
       cx.a(this.a, df.a(cx.b(this.a), p0, cx.c(this.a)), 1);
       return;
    }
    public void onServiceStateChanged(ServiceState p0){
       super.onServiceStateChanged(p0);
       if (p0 == null) {
          return;
       }
       ServiceState serviceState = cx.f(this.a);
       if (serviceState == null || serviceState.getState() != p0.getState()) {
          cx.a(this.a, p0);
          cx.g(this.a);
       }
       return;
    }
    public void onSignalStrengthsChanged(SignalStrength p0){
       super.onSignalStrengthsChanged(p0);
       cx.a(this.a, p0);
    }
}
