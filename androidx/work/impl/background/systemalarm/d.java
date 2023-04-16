package androidx.work.impl.background.systemalarm.d;
import l3.b;
import java.lang.String;
import k3.h;
import android.content.Context;
import l3.d;
import l3.i;
import java.lang.Object;
import androidx.work.impl.background.systemalarm.a;
import v3.p;
import ig6.c;
import x3.a;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Looper;
import android.content.Intent;
import java.lang.Integer;
import java.lang.Throwable;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.lang.Thread;
import java.lang.IllegalStateException;
import v3.i;
import androidx.work.impl.background.systemalarm.d$c;
import androidx.work.impl.background.systemalarm.d$b;
import java.lang.Runnable;
import java.util.Iterator;
import android.os.PowerManager$WakeLock;
import v3.m;
import androidx.work.impl.background.systemalarm.d$a;

public class d implements b	// class@000a82
{
    public final Context b;
    public final a c;
    public final p d;
    public final d e;
    public final i f;
    public final a g;
    public final Handler h;
    public final List i;
    public Intent j;
    public d$c k;
    public static final String l;

    static {
       d.l = h.f("SystemAlarmDispatcher");
    }
    public void d(Context p0){
       super(p0, null, null);
    }
    public void d(Context p0,d p1,i p2){
       super();
       Context applicationC = p0.getApplicationContext();
       this.b = applicationC;
       this.g = new a(applicationC);
       this.d = new p();
       i oi = c.b(p0);
       this.f = oi;
       applicationC = oi.F();
       this.e = applicationC;
       this.c = oi.J();
       applicationC.c(this);
       this.i = new ArrayList();
       this.j = null;
       this.h = new Handler(Looper.getMainLooper());
    }
    public boolean a(Intent p0,int p1){
       String l = d.l;
       Object[] objArray = new Object[]{p0,Integer.valueOf(p1)};
       int i = 0;
       Throwable[] throwableArr = new Throwable[i];
       h.c().a(l, String.format("Adding command %s \(%s\)", objArray), throwableArr);
       this.b();
       String action = p0.getAction();
       if (TextUtils.isEmpty(action)) {
          Throwable[] throwableArr1 = new Throwable[i];
          h.c().h(l, "Unknown command. Ignoring", throwableArr1);
          return i;
       }else if(("ACTION_CONSTRAINTS_CHANGED").equals(action) && this.i("ACTION_CONSTRAINTS_CHANGED")){
          return i;
       }else {
          p0.putExtra("KEY_START_ID", p1);
          d ti = this.i;
          _monitor_enter(ti);
          if (!this.i.isEmpty()) {
             i = 1;
          }
          this.i.add(p0);
          if (!i) {
             this.l();
          }
          _monitor_exit(ti);
          return 1;
       }
    }
    public final void b(){
       if (this.h.getLooper().getThread() == Thread.currentThread()) {
          return;
       }
       throw new IllegalStateException("Needs to be invoked on the main thread.");
    }
    public void c(){
       String l = d.l;
       int i = 0;
       Throwable[] throwableArr = new Throwable[i];
       h.c().a(l, "Checking if commands are complete.", throwableArr);
       this.b();
       d ti = this.i;
       _monitor_enter(ti);
       if (this.j != null) {
          Object[] objArray = new Object[]{this.j};
          Throwable[] throwableArr1 = new Throwable[i];
          h.c().a(l, String.format("Removing command %s", objArray), throwableArr1);
          if (this.i.remove(i).equals(this.j)) {
             this.j = null;
          }else {
             throw new IllegalStateException("Dequeue-d command is not the first.");
          }
       }
       i oi = this.c.b();
       if (!this.g.o() && (this.i.isEmpty() && !oi.a())) {
          Throwable[] throwableArr2 = new Throwable[i];
          h.c().a(l, "No more commands & intents.", throwableArr2);
          d tk = this.k;
          if (tk != null) {
             tk.c();
          }
       }else if(!this.i.isEmpty()){
          this.l();
       }
       _monitor_exit(ti);
       return;
    }
    public void d(String p0,boolean p1){
       this.k(new d$b(this, a.c(this.b, p0, p1), 0));
    }
    public d e(){
       return this.e;
    }
    public a f(){
       return this.c;
    }
    public i g(){
       return this.f;
    }
    public p h(){
       return this.d;
    }
    public final boolean i(String p0){
       this.b();
       d ti = this.i;
       _monitor_enter(ti);
       Iterator iterator = this.i.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (p0.equals(iterator.next().getAction())) {
                break ;
             }
          }else {
             _monitor_exit(ti);
             return false;
          }
       }
       _monitor_exit(ti);
       return true;
    }
    public void j(){
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(d.l, "Destroying SystemAlarmDispatcher", throwableArr);
       this.e.i(this);
       this.d.a();
       this.k = null;
    }
    public void k(Runnable p0){
       this.h.post(p0);
    }
    public final void l(){
       this.b();
       PowerManager$WakeLock wakeLock = m.b(this.b, "ProcessCommand");
       wakeLock.acquire();
       this.f.J().d(new d$a(this));
       wakeLock.release();
    }
}
