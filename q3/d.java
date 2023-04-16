package q3.d;
import r3.c$a;
import java.lang.String;
import k3.h;
import android.content.Context;
import x3.a;
import q3.c;
import java.lang.Object;
import r3.c;
import r3.a;
import r3.b;
import r3.h;
import r3.d;
import r3.g;
import r3.f;
import r3.e;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Iterable;

public class d implements c$a	// class@00295b
{
    public final c a;
    public final c[] b;
    public final Object c;
    public static final String d;

    static {
       d.d = h.f("WorkConstraintsTracker");
    }
    public void d(Context p0,a p1,c p2){
       e uoe;
       super();
       p0 = p0.getApplicationContext();
       this.a = p2;
       c[] uocArray = new c[]{new a(p0, p1),new b(p0, p1),new h(p0, p1),new d(p0, p1),new g(p0, p1),new f(p0, p1),uoe};
       uoe = new e(p0, p1);
       this.b = uocArray;
       this.c = new Object();
    }
    public void a(List p0){
       d tc = this.c;
       _monitor_enter(tc);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (this.c(str)) {
             Object[] objArray = new Object[]{str};
             Throwable[] throwableArr = new Throwable[0];
             h.c().a(d.d, String.format("Constraints met for %s", objArray), throwableArr);
             uArrayList.add(str);
          }
       }
       d ta = this.a;
       if (ta != null) {
          ta.e(uArrayList);
       }
       _monitor_exit(tc);
       return;
    }
    public void b(List p0){
       d tc = this.c;
       _monitor_enter(tc);
       d ta = this.a;
       if (ta != null) {
          ta.c(p0);
       }
       _monitor_exit(tc);
       return;
    }
    public boolean c(String p0){
       object oobject;
       d tc = this.c;
       _monitor_enter(tc);
       d tb = this.b;
       int len = tb.length;
       int i = 0;
       while (true) {
          if (i < len) {
             oobject = tb[i];
             if (oobject.d(p0)) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             _monitor_exit(tc);
             return 1;
          }
       }
       Object[] objArray = new Object[]{p0,oobject.getClass().getSimpleName()};
       Throwable[] throwableArr = new Throwable[0];
       h.c().a(d.d, String.format("Work %s constrained by %s", objArray), throwableArr);
       _monitor_exit(tc);
       return 0;
    }
    public void d(Iterable p0){
       d tc = this.c;
       _monitor_enter(tc);
       d tb = this.b;
       int len = tb.length;
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          tb[i1].g(null);
       }
       tb = this.b;
       len = tb.length;
       for (i1 = 0; i1 < len; i1 = i1 + 1) {
          tb[i1].e(p0);
       }
       d tb1 = this.b;
       int len1 = tb1.length;
       for (; i < len1; i = i + 1) {
          tb1[i].g(this);
       }
       _monitor_exit(tc);
       return;
    }
    public void e(){
       d tc = this.c;
       _monitor_enter(tc);
       d tb = this.b;
       int len = tb.length;
       for (int i = 0; i < len; i = i + 1) {
          tb[i].f();
       }
       _monitor_exit(tc);
       return;
    }
}
