package c.t.m.g.p;
import c.t.m.g.ax;
import c.t.m.g.aq;
import android.content.Context;
import java.lang.IllegalStateException;
import java.lang.String;
import c.t.m.g.be;
import c.t.m.g.r;
import c.t.m.g.q;
import c.t.m.g.p$1;
import java.lang.Thread;
import java.lang.NullPointerException;
import java.util.HashMap;
import c.t.m.g.bt;
import android.os.Handler;
import c.t.m.g.bp;
import c.t.m.g.bn;
import java.lang.Throwable;
import c.t.m.g.p$a;
import java.lang.Runnable;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.StringBuilder;

public class p extends ax	// class@000ca2
{
    public boolean c;
    public aq f;
    public Handler g;
    public static p d;
    public static Context e;

    public void p(){
       super();
       this.c = true;
       this.f = aq.a;
       Context e = p.e;
       if (e != null && e.getApplicationContext() != null) {
          return;
       }
       throw new IllegalStateException("Please invoke initial\(context,...\) first when app started!");
    }
    public static long a(p p0){
       return p0.i();
    }
    public static void a(Context p0,String p1,String p2){
       if (p0 == null || p0.getApplicationContext() == null) {
          throw new NullPointerException("context cannot be null!");
       }
       p0 = p0.getApplicationContext();
       p.e = p0;
       be.a(p0);
       r.a(p1);
       q.a(p1, p2);
       new p$1("th_loc_tmp").start();
       return;
    }
    public static void a(String p0){
       q.a(p0);
    }
    public static void a(HashMap p0){
       q.a(p0);
    }
    public static void b(p p0){
       p0.h();
    }
    public static aq c(p p0){
       return p0.f;
    }
    public static synchronized p c(){
       _monitor_enter(p.class);
       if (p.d == null) {
          _monitor_enter(p.class);
          if (p.d == null) {
             p.d = new p();
          }
          _monitor_exit(p.class);
       }
       _monitor_exit(p.class);
       return p.d;
    }
    public static boolean d(p p0){
       return p0.c;
    }
    public void a(){
       q.a().c();
       bt.a("TxCC", "shutdown:pull immediately");
       bp.b(this.g);
       this.a(0);
       bn.a("th_loc_task_t_consume", 100);
       this.g = null;
       return;
    }
    public final void a(long p0){
       p tg = this.g;
       p$a uoa = new p$a(this);
       if (p0 < 0) {
          p0 = 0;
       }
       bp.a(tg, uoa, p0);
       return;
    }
    public String b(){
       return "TxCC";
    }
    public int d(){
       this.g = new Handler(bn.a("th_loc_task_t_consume").getLooper());
       this.a(5000);
       return 0;
    }
    public final void h(){
       int i = q.a().b("cc_version");
       long l = (i == -1)? 0xa4cb80: this.i();
       bt.a("TxCC", "schedule : locVer["+i+"],delayTime["+l+"]");
       this.a(l);
       return;
    }
    public final long i(){
       long l = q.a().c("cc_req_interval");
       int i = 0x5265c00;
       if (l - i > 0) {
          l = i;
       }
       if (l - 0x1b7740 < 0) {
          l = 0x1b7740;
       }
       return l;
    }
}
