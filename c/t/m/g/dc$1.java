package c.t.m.g.dc$1;
import java.lang.Runnable;
import c.t.m.g.dc;
import java.lang.Object;
import c.t.m.g.ed;
import java.lang.StringBuilder;
import java.lang.String;

public class dc$1 implements Runnable	// class@000c3a
{
    public final dc a;

    public void dc$1(dc p0){
       this.a = p0;
       super();
    }
    public void run(){
       boolean b = dc.a(this.a);
       if (dc.b(this.a) > 0) {
          dc$1 ta = this.a;
          ta.b(dc.b(ta));
       }
       if (ed.a) {
          ed.a("TxWifiProvider", "schedule scan. interval:"+dc.b(this.a)+", success:"+b);
       }
       return;
    }
}
