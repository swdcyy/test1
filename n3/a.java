package n3.a;
import java.lang.String;
import k3.h;
import n3.b;
import k3.k;
import java.lang.Object;
import java.util.HashMap;
import u3.r;
import java.util.Map;
import java.lang.Runnable;
import n3.a$a;
import java.lang.System;

public class a	// class@0026b3
{
    public final b a;
    public final k b;
    public final Map c;
    public static final String d;

    static {
       a.d = h.f("DelayedWorkTracker");
    }
    public void a(b p0,k p1){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new HashMap();
    }
    public void a(r p0){
       Runnable runnable = this.c.remove(p0.a);
       if (runnable != null) {
          this.b.b(runnable);
       }
       a$a uoa = new a$a(this, p0);
       this.c.put(p0.a, uoa);
       this.b.a((p0.a() - System.currentTimeMillis()), uoa);
       return;
    }
    public void b(String p0){
       Runnable runnable = this.c.remove(p0);
       if (runnable != null) {
          this.b.b(runnable);
       }
       return;
    }
}
