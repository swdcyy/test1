package l3.d;
import l3.b;
import t3.a;
import java.lang.String;
import k3.h;
import android.content.Context;
import k3.a;
import x3.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import l3.j;
import java.lang.Throwable;
import k3.d;
import java.util.Map;
import android.os.PowerManager$WakeLock;
import v3.m;
import android.content.Intent;
import androidx.work.impl.foreground.a;
import androidx.core.content.ContextCompat;
import java.lang.Class;
import java.lang.Boolean;
import java.util.Iterator;
import java.util.Set;
import androidx.work.WorkerParameters$a;
import l3.j$c;
import xk.d;
import l3.d$a;
import java.util.concurrent.Executor;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.lang.Runnable;
import v3.i;
import androidx.work.impl.foreground.SystemForegroundService;

public class d implements b, a	// class@002501
{
    public PowerManager$WakeLock b;
    public Context c;
    public a d;
    public a e;
    public WorkDatabase f;
    public Map g;
    public Map h;
    public List i;
    public Set j;
    public final List k;
    public final Object l;
    public static final String m;

    static {
       d.m = h.f("Processor");
    }
    public void d(Context p0,a p1,a p2,WorkDatabase p3,List p4){
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.h = new HashMap();
       this.g = new HashMap();
       this.i = p4;
       this.j = new HashSet();
       this.k = new ArrayList();
       this.b = null;
       this.l = new Object();
    }
    public static boolean e(String p0,j p1){
       int i = 1;
       int i1 = 0;
       if (p1 != null) {
          p1.d();
          Object[] objArray = new Object[i];
          objArray[i1] = p0;
          Throwable[] throwableArr = new Throwable[i1];
          h.c().a(d.m, String.format("WorkerWrapper interrupted for %s", objArray), throwableArr);
          return i;
       }else {
          Object[] objArray1 = new Object[i];
          objArray1[i1] = p0;
          Throwable[] throwableArr1 = new Throwable[i1];
          h.c().a(d.m, String.format("WorkerWrapper could not be found for %s", objArray1), throwableArr1);
          return i1;
       }
    }
    public void a(String p0,d p1){
       d tl = this.l;
       _monitor_enter(tl);
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[0];
       h.c().d(d.m, String.format("Moving WorkSpec \(%s\) to the foreground", objArray), throwableArr);
       j oj = this.h.remove(p0);
       if (oj != null) {
          if (this.b == null) {
             PowerManager$WakeLock wakeLock = m.b(this.c, "ProcessorForegroundLck");
             this.b = wakeLock;
             wakeLock.acquire();
          }
          this.g.put(p0, oj);
          ContextCompat.startForegroundService(this.c, a.f(this.c, p0, p1));
       }
       _monitor_exit(tl);
       return;
    }
    public void b(String p0){
       d tl = this.l;
       _monitor_enter(tl);
       this.g.remove(p0);
       this.m();
       _monitor_exit(tl);
    }
    public void c(b p0){
       d tl = this.l;
       _monitor_enter(tl);
       this.k.add(p0);
       _monitor_exit(tl);
    }
    public void d(String p0,boolean p1){
       d tl = this.l;
       _monitor_enter(tl);
       this.h.remove(p0);
       Object[] objArray = new Object[]{d.class.getSimpleName(),p0,Boolean.valueOf(p1)};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(d.m, String.format("%s %s executed; reschedule = %s", objArray), throwableArr);
       Iterator iterator = this.k.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0, p1);
       }
       _monitor_exit(tl);
       return;
    }
    public boolean f(String p0){
       d tl = this.l;
       _monitor_enter(tl);
       _monitor_exit(tl);
       return this.j.contains(p0);
    }
    public boolean g(String p0){
       d tl = this.l;
       _monitor_enter(tl);
       boolean b = (this.h.containsKey(p0) || this.g.containsKey(p0))? true: false;
       _monitor_exit(tl);
       return b;
    }
    public boolean h(String p0){
       d tl = this.l;
       _monitor_enter(tl);
       _monitor_exit(tl);
       return this.g.containsKey(p0);
    }
    public void i(b p0){
       d tl = this.l;
       _monitor_enter(tl);
       this.k.remove(p0);
       _monitor_exit(tl);
    }
    public boolean j(String p0){
       return this.k(p0, null);
    }
    public boolean k(String p0,WorkerParameters$a p1){
       d tl = this.l;
       _monitor_enter(tl);
       int i = 1;
       if (this.g(p0)) {
          Object[] objArray = new Object[i];
          objArray[0] = p0;
          Throwable[] throwableArr = new Throwable[0];
          h.c().a(d.m, String.format("Work %s is already enqueued for processing", objArray), throwableArr);
          _monitor_exit(tl);
          return 0;
       }else {
          j$c uoc = new j$c(this.c, this.d, this.e, this, this.f, p0);
          v1.c(this.i);
          v1.b(p1);
          j oj = v1.a();
          d uod = oj.b();
          uod.u(new d$a(this, p0, uod), this.e.c());
          this.h.put(p0, oj);
          _monitor_exit(tl);
          this.e.b().execute(oj);
          Object[] objArray1 = new Object[]{d.class.getSimpleName(),p0};
          Throwable[] throwableArr1 = new Throwable[0];
          h.c().a(d.m, String.format("%s: processing %s", objArray1), throwableArr1);
          return i;
       }
    }
    public boolean l(String p0){
       d tl = this.l;
       _monitor_enter(tl);
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = p0;
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(d.m, String.format("Processor cancelling %s", objArray), throwableArr);
       this.j.add(p0);
       j oj = this.g.remove(p0);
       if (oj != null) {
       }else {
          i = 0;
       }
       if (oj == null) {
          oj = this.h.remove(p0);
       }
       boolean b = d.e(p0, oj);
       if (i) {
          this.m();
       }
       _monitor_exit(tl);
       return b;
    }
    public final void m(){
       Throwable[] throwableArr;
       d tl = this.l;
       _monitor_enter(tl);
       if (!(this.g.isEmpty() ^ 0x01)) {
          SystemForegroundService systemForegr = SystemForegroundService.e();
          int i = 0;
          if (systemForegr != null) {
             throwableArr = new Throwable[i];
             h.c().a(d.m, "No more foreground work. Stopping SystemForegroundService", throwableArr);
             systemForegr.g();
          }else {
             throwableArr = new Throwable[i];
             h.c().a(d.m, "No more foreground work. SystemForegroundService is already stopped", throwableArr);
          }
          d tb = this.b;
          if (tb != null) {
             tb.release();
             this.b = null;
          }
       }
       _monitor_exit(tl);
       return;
    }
    public boolean n(String p0){
       d tl = this.l;
       _monitor_enter(tl);
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(d.m, String.format("Processor stopping foreground work %s", objArray), throwableArr);
       _monitor_exit(tl);
       return d.e(p0, this.g.remove(p0));
    }
    public boolean o(String p0){
       d tl = this.l;
       _monitor_enter(tl);
       Object[] objArray = new Object[]{p0};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(d.m, String.format("Processor stopping background work %s", objArray), throwableArr);
       _monitor_exit(tl);
       return d.e(p0, this.h.remove(p0));
    }
}
