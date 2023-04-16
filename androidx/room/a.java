package androidx.room.a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.room.a$a;
import androidx.room.a$b;
import java.io.Closeable;
import java.lang.Runnable;
import java.lang.IllegalStateException;
import java.lang.String;
import z0.a;
import a3.b;
import a3.c;

public final class a	// class@00094e
{
    public c a;
    public final Handler b;
    public Runnable c;
    public final Object d;
    public final long e;
    public final Executor f;
    public int g;
    public long h;
    public b i;
    public boolean j;
    public final Runnable k;
    public final Runnable l;

    public void a(long p0,TimeUnit p1,Executor p2){
       super();
       this.a = null;
       this.b = new Handler(Looper.getMainLooper());
       this.c = null;
       this.d = new Object();
       this.g = 0;
       this.h = SystemClock.uptimeMillis();
       this.j = false;
       this.k = new a$a(this);
       this.l = new a$b(this);
       this.e = p1.toMillis(p0);
       this.f = p2;
    }
    public void a(){
       a td = this.d;
       _monitor_enter(td);
       this.j = true;
       a ti = this.i;
       if (ti != null) {
          ti.close();
       }
       this.i = null;
       _monitor_exit(td);
       return;
    }
    public void b(){
       a td = this.d;
       _monitor_enter(td);
       a tg = this.g;
       if (tg <= null) {
          throw new IllegalStateException("ref count is 0 or lower but we\'re supposed to decrement");
       }
       int i = tg - 1;
       this.g = i;
       if (!i) {
          if (this.i == null) {
             _monitor_exit(td);
             return;
          }else {
             this.b.postDelayed(this.k, this.e);
          }
       }
       _monitor_exit(td);
       return;
    }
    public Object c(a p0){
       this.b();
       return p0.apply(this.e());
    }
    public b d(){
       a td = this.d;
       _monitor_enter(td);
       _monitor_exit(td);
       return this.i;
    }
    public b e(){
       a td = this.d;
       _monitor_enter(td);
       this.b.removeCallbacks(this.k);
       this.g = this.g + 1;
       if (this.j != null) {
          throw new IllegalStateException("Attempting to open already closed database.");
       }
       a ti = this.i;
       if (ti != null && ti.isOpen()) {
          _monitor_exit(td);
          return this.i;
       }else {
          ti = this.a;
          if (ti == null) {
             throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
          }
          b uob = ti.e0();
          this.i = uob;
          _monitor_exit(td);
          return uob;
       }
    }
    public void f(c p0){
       if (this.a != null) {
          return;
       }
       this.a = p0;
       return;
    }
    public boolean g(){
       return (this.j ^ 0x01);
    }
    public void h(Runnable p0){
       this.c = p0;
    }
}
