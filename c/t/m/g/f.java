package c.t.m.g.f;
import c.t.m.g.av;
import c.t.m.g.f$a;
import c.t.m.g.f$1;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Looper;
import android.os.Handler;
import c.t.m.g.bp;
import java.lang.String;
import android.os.HandlerThread;
import c.t.m.g.bn;
import android.location.Location;
import c.t.m.g.ay;
import c.t.m.g.j;
import c.t.m.g.a;
import c.t.m.g.by;
import java.util.Locale;
import java.lang.Object;
import c.t.m.g.cb;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Float;
import java.lang.Long;
import android.os.Message;
import java.lang.Runnable;

public class f extends av	// class@000c86
{
    public Handler c;
    public f$a d;
    public StringBuilder e;
    public AtomicInteger f;

    public void f(){
       super();
       this.c = null;
       this.d = new f$a(null);
       this.e = "";
       this.f = new AtomicInteger(0);
    }
    public int a(Looper p0){
       bp.a(this.d(), 1001, 5000);
       this.c = new Handler(bn.a("th_loc_task_t_consume").getLooper());
       (this.e).setLength(0);
       this.f.set(0);
       return 0;
    }
    public void a(){
       (this.e).setLength(0);
       this.f.set(0);
       this.d.a("", 0);
       this.c = null;
       bn.b("th_loc_task_t_consume");
    }
    public void a(int p0,Location p1){
       String str;
       ay uoay = this;
       ay b = uoay.b;
       _monitor_enter(b);
       int i = 0;
       if ((uoay.e).length() > 5120) {
          (uoay.e).setLength(i);
          uoay.f.set(i);
       }
       char c = 10;
       if ((uoay.e).length() > 0) {
          str = uoay.e+c;
       }
       a j = j.j;
       str = (by.a(j.a()))? "null": "loc_"+j.a();
       Object[] objArray = new Object[19];
       objArray[i] = cb.d();
       objArray[1] = Integer.valueOf(12);
       objArray[2] = Integer.valueOf(p0);
       objArray[3] = Double.valueOf(p1.getLatitude());
       objArray[4] = Double.valueOf(p1.getLongitude());
       objArray[5] = Double.valueOf(p1.getAltitude());
       objArray[6] = Float.valueOf(p1.getAccuracy());
       objArray[7] = Float.valueOf(p1.getBearing());
       objArray[8] = Float.valueOf(p1.getSpeed());
       objArray[9] = Long.valueOf((p1.getTime() / 1000));
       objArray[c] = Integer.valueOf(2);
       objArray[11] = Integer.valueOf(i);
       objArray[12] = Integer.valueOf(2);
       objArray[13] = Integer.valueOf(2);
       objArray[14] = Integer.valueOf(1);
       objArray[15] = Integer.valueOf(i);
       objArray[16] = "null";
       objArray[17] = str;
       objArray[18] = "null";
       uoay.e+String.format(Locale.ENGLISH, "%s,%d,%d,%.6f,%.6f,%.3f,%.3f,%.3f,%.3f,%d,%d,%d,%d,%d,%d,%d,%s,%s,%s", objArray);
       uoay.f.getAndAdd(1);
       _monitor_exit(b);
       return;
    }
    public void a(Message p0){
       int i = 1001;
       if (p0.what != i) {
       }else {
          bp.b(this.d(), i);
          bp.a(this.d(), i, 5000);
          int i1 = this.f.get();
          ay tb = this.b;
          _monitor_enter(tb);
          String str = this.e;
          (this.e).setLength(0);
          this.f.set(0);
          _monitor_exit(tb);
          if (str.length() > 0 && this.c != null) {
             this.d.a(str, i1);
             bp.a(this.c, this.d);
          }
       }
       return;
    }
    public String b(){
       return "GpsNaviPro";
    }
}
