package s3.c;
import java.lang.String;
import k3.h;
import android.content.Context;
import x3.a;
import java.lang.Object;
import java.util.LinkedHashSet;
import q3.a;
import java.util.Set;
import java.lang.Class;
import java.lang.Throwable;
import r3.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import s3.c$a;
import java.util.List;
import java.lang.Runnable;

public abstract class c	// class@002b96
{
    public final a a;
    public final Context b;
    public final Object c;
    public final Set d;
    public Object e;
    public static final String f;

    static {
       c.f = h.f("ConstraintTracker");
    }
    public void c(Context p0,a p1){
       super();
       this.c = new Object();
       this.d = new LinkedHashSet();
       this.b = p0.getApplicationContext();
       this.a = p1;
    }
    public void a(a p0){
       c tc = this.c;
       _monitor_enter(tc);
       if (this.d.add(p0)) {
          int i = 1;
          if (this.d.size() == i) {
             this.e = this.b();
             Object[] objArray = new Object[]{this.getClass().getSimpleName(),this.e};
             Throwable[] throwableArr = new Throwable[0];
             h.c().a(c.f, String.format("%s: initial state = %s", objArray), throwableArr);
             this.e();
          }
          p0.a(this.e);
       }
       _monitor_exit(tc);
       return;
    }
    public abstract Object b();
    public void c(a p0){
       c tc = this.c;
       _monitor_enter(tc);
       if (this.d.remove(p0) && this.d.isEmpty()) {
          this.f();
       }
       _monitor_exit(tc);
       return;
    }
    public void d(Object p0){
       c tc = this.c;
       _monitor_enter(tc);
       c te = this.e;
       if (te == p0 || (te != null && te.equals(p0))) {
          _monitor_exit(tc);
          return;
       }else {
          this.e = p0;
          this.a.c().execute(new c$a(this, new ArrayList(this.d)));
          _monitor_exit(tc);
          return;
       }
    }
    public abstract void e();
    public abstract void f();
}
