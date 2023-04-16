package c.t.m.g.cr$a;
import android.os.Handler;
import c.t.m.g.cr;
import android.os.Looper;
import c.t.m.g.cr$1;
import android.os.Message;
import c.t.m.g.ce;
import android.telephony.CellLocation;
import c.t.m.g.dy;

public final class cr$a extends Handler	// class@000c1e
{
    public final cr a;
    public boolean b;

    public void cr$a(cr p0,Looper p1){
       this.a = p0;
       super(p1);
       this.b = false;
       this.b = false;
    }
    public void cr$a(cr p0,Looper p1,cr$1 p2){
       super(p0, p1);
    }
    public void a(){
       this.b = true;
    }
    public void handleMessage(Message p0){
       super.handleMessage(p0);
       if (this.a.a == null) {
          return;
       }
       byte[] uobyteArray = cr.a(this.a);
       _monitor_enter(uobyteArray);
       if (cr.b(this.a) != null && this.b == null) {
          this.sendEmptyMessageDelayed(0, 0x7530);
       }
       _monitor_exit(uobyteArray);
       cr.a(this.a, dy.a(cr.c(this.a)));
       return;
    }
}
