package aegon.chrome.base.task.e;
import g0.l;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import g0.n;
import java.lang.String;
import java.lang.Object;
import g0.m;
import java.lang.StringBuilder;
import java.lang.ref.Reference;
import aegon.chrome.base.task.e$b;
import aegon.chrome.base.task.e$a;
import aegon.chrome.base.task.f;
import K.S;
import java.util.Set;
import java.lang.Runnable;
import java.lang.Class;
import java.util.LinkedList;
import android.util.Pair;
import java.lang.Long;
import java.util.List;
import java.util.Iterator;
import aegon.chrome.base.task.PostTask;
import java.util.ArrayList;
import aegon.chrome.base.TraceEvent;
import android.os.Process;
import java.lang.Throwable;
import java.util.concurrent.Executor;

public class e implements l	// class@00017d
{
    public final n a;
    public final String b;
    public final int c;
    public long d;
    public final Runnable e;
    public final Object f;
    public boolean g;
    public LinkedList h;
    public List i;
    public static final ReferenceQueue j;
    public static final Set k;
    public static final boolean l;

    static {
       e.j = new ReferenceQueue();
       e.k = new HashSet();
    }
    public void e(n p0){
       super(p0, "TaskRunnerImpl", 0);
       e.d();
    }
    public void e(n p0,String p1,int p2){
       super();
       this.e = new m(this);
       this.f = new Object();
       this.a = p0.e();
       this.b = p1+".PreNativeTask.run";
       this.c = p2;
    }
    public static void d(){
       e$b uob = e.j.poll();
       while (uob != null) {
          f.e();
          S.MERCiIV8(uob.a);
          Set k = e.k;
          _monitor_enter(k);
          k.remove(uob);
          _monitor_exit(k);
       }
       return;
    }
    public void a(Runnable p0){
       this.c(p0, 0);
    }
    public void c(Runnable p0,long p1){
       e uoe = null;
       if (this.d - uoe) {
          f.e().b(this.d, p0, p1, p0.getClass().getName());
          return;
       }else {
          e tf = this.f;
          _monitor_enter(tf);
          this.f();
          if (this.d - uoe) {
             f.e().b(this.d, p0, p1, p0.getClass().getName());
             _monitor_exit(tf);
             return;
          }else if(!p1 - uoe){
             this.h.add(p0);
             this.h();
          }else {
             this.i.add(new Pair(p0, Long.valueOf(p1)));
          }
          _monitor_exit(tf);
          return;
       }
    }
    public void e(){
       Iterator iterator;
       f.e();
       e ta = this.a;
       long l = S.M5_IQXaH(this.c, ta.a, ta.b, ta.c, ta.d, ta.e);
       e tf = this.f;
       _monitor_enter(tf);
       e th = this.h;
       if (th != null) {
          iterator = th.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             f.e().b(l, obj, 0, obj.getClass().getName());
          }
          this.h = null;
       }
       th = this.i;
       if (th != null) {
          iterator = th.iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             f.e().b(l, pair.first, pair.second.longValue(), pair.getClass().getName());
          }
          this.i = null;
       }
       this.d = l;
       _monitor_exit(tf);
       Set k = e.k;
       _monitor_enter(k);
       k.add(new e$b(this));
       _monitor_exit(k);
       e.d();
       return;
    }
    public final void f(){
       if (this.g != null) {
          return;
       }
       boolean b = true;
       this.g = b;
       Object a = PostTask.a;
       _monitor_enter(a);
       List b1 = PostTask.b;
       if (b1 == null) {
          b = false;
          _monitor_exit(a);
       }else {
          b1.add(this);
          _monitor_exit(a);
       }
       if (!b) {
          this.e();
       }else {
          this.h = new LinkedList();
          this.i = new ArrayList();
       }
       return;
    }
    public void g(){
       TraceEvent traceEvent = TraceEvent.d(this.b);
       e tf = this.f;
       _monitor_enter(tf);
       e th = this.h;
       if (th == null) {
          _monitor_exit(tf);
          if (traceEvent != null) {
             traceEvent.close();
          }
          return;
       }else {
          Runnable runnable = th.poll();
          _monitor_exit(tf);
          n a = this.a.a;
          if (a != 1) {
             if (a != 2) {
                Process.setThreadPriority(10);
             }else {
                Process.setThreadPriority(-1);
             }
          }else {
             Process.setThreadPriority(0);
          }
          runnable.run();
          if (traceEvent != null) {
             traceEvent.close();
          }
          return;
       }
    }
    public void h(){
       Executor e = (PostTask.e != null)? PostTask.e: PostTask.d;
       e.execute(this.e);
       return;
    }
}
