package ltd.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ltd.f;
import kotlin.jvm.internal.a;
import msd.a;

public abstract class g	// class@001e06
{
    public Object _next;
    public Object _prev;
    public static final AtomicReferenceFieldUpdater a;
    public static final AtomicReferenceFieldUpdater b;

    static {
       g.a = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_next");
       g.b = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_prev");
    }
    public void g(g p0){
       super();
       this._next = null;
       this._prev = p0;
    }
    public final void a(){
       g.b.lazySet(this, null);
    }
    public final g b(){
       g og = this.e();
       while (og != null && og.f()) {
          og = og._prev;
       }
       return og;
    }
    public final g c(){
       Object obj = this.d();
       if (obj == f.a) {
          return null;
       }
       return obj;
    }
    public final Object d(){
       return this._next;
    }
    public final g e(){
       return this._prev;
    }
    public abstract boolean f();
    public final g g(){
       g og = this.c();
       if (og == null) {
          a.L();
       }
       while (og.f()) {
          og = og.c();
          if (og == null) {
             a.L();
          }
       }
       return og;
    }
    public final boolean h(){
       boolean b = (this.c() == null)? true: false;
       return b;
    }
    public final boolean i(){
       return g.a.compareAndSet(this, null, f.a);
    }
    public final g j(a p0){
       Object obj = this.d();
       if (obj != f.a) {
          return obj;
       }
       p0.invoke();
       throw null;
    }
    public final void k(){
       g og;
       g og1;
       do {
          og = this.b();
          og1 = this.g();
          og1._prev = og;
          if (og != null) {
             og._next = og1;
          }
       } while (og1.f() || (og != null && og.f()));
       return;
    }
    public final boolean l(g p0){
       return g.a.compareAndSet(this, null, p0);
    }
}
