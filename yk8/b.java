package yk8.b;
import java.lang.AutoCloseable;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import yk8.c$a;
import java.lang.Integer;
import android.util.Size;
import yk8.b$a;
import vk8.k;
import android.os.Handler;
import android.os.Looper;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.IllegalStateException;
import yk8.c;

public abstract class b implements AutoCloseable	// class@004190
{
    public boolean b;
    public boolean c;
    public final Context d;
    public final Size[] e;
    public static final String f;
    public static final c$a g;
    public static final c$a h;
    public static final c$a i;
    public static final c$a j;
    public static final c$a k;
    public static final c$a l;
    public static final c$a m;
    public static final c$a n;
    public static final c$a o;
    public static final c$a p;
    public static final c$a q;
    public static final c$a r;
    public static final c$a s;
    public static final c$a t;
    public static final c$a u;
    public static final c$a v;

    static {
       b.f = "SEC_SDK/"+b.class.getSimpleName();
       Class tYPE = Integer.TYPE;
       b.g = new c$a("still-input-format", tYPE);
       b.h = new c$a("still-input-format-list", int[].class);
       b.i = new c$a("still-output-format", tYPE);
       b.j = new c$a("still-output-format-list", int[].class);
       b.k = new c$a("still-size", Size.class);
       b.l = new c$a("still-size-list", Size[].class);
       b.m = new c$a("stream-size", Size.class);
       b.n = new c$a("stream-size-list", Size[].class);
       b.o = new c$a("jpeg-quality", tYPE);
       b.p = new c$a("camera-id", tYPE);
       b.q = new c$a("multi-input-count-range", new b$a());
       b.r = new c$a("stream-format", tYPE);
       b.s = new c$a("stream-format-list", int[].class);
       b.t = new c$a("sensor-orientation", tYPE);
       b.u = new c$a("lens-facing", tYPE);
       b.v = new c$a("sensor-view-angle", int[].class);
    }
    public static Handler a(Handler p0){
       Looper looper;
       if (p0 == null) {
          looper = Looper.myLooper();
          if (looper != null) {
             looper = new Handler(looper);
          }else {
             throw new IllegalArgumentException("No handler given, and current thread has no looper!");
          }
       }
       return looper;
    }
    public static Handler b(Handler p0,Object p1){
       if (p1 != null) {
          p0 = b.a(p0);
       }
       return p0;
    }
    public void c(){
       if (this.b != null) {
          return;
       }
       throw new IllegalStateException("SCameraProcessor is not initialized.");
    }
    public synchronized void close(){
       if (this.c != null) {
          return;
       }
       if (this.k()) {
          this.f();
       }
       this.l();
       this.c = true;
       return;
    }
    public void e(){
       if (this.b == null) {
          return;
       }
       throw new IllegalStateException("SCameraProcessor is already initialized.");
    }
    public abstract void f();
    public void finalize(){
       try{
          this.close();
          super.finalize();
          return;
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public abstract c g();
    public abstract void j();
    public boolean k(){
       return this.b;
    }
    public abstract void l();
    public void o(boolean p0){
       this.b = p0;
    }
    public abstract void p(c p0);
    public void r(){
       if (this.c == null) {
          return;
       }
       throw new IllegalStateException("SCameraProcessor is already closed");
    }
}
