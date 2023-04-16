package ed2.r;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build$VERSION;
import wg3.a;
import java.util.LinkedList;
import android.util.Pair;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import java.lang.Long;
import brd.t;
import java.lang.Throwable;
import ed2.q;
import ed2.n;
import android.view.Window;
import android.os.Handler;
import android.view.Window$OnFrameMetricsAvailableListener;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import ed2.p;
import erd.o;
import ed2.o;
import erd.g;

public class r	// class@002706
{
    public final Object a;
    public LinkedList b;
    public LinkedList c;
    public Window$OnFrameMetricsAvailableListener d;
    public Comparator e;
    public long f;
    public long g;
    public Activity h;
    public String i;

    public void r(Activity p0){
       super();
       this.a = new Object();
       this.h = p0;
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Build$VERSION.SDK_INT >= 24 && a.f() > 0)? true: false;
       return b;
    }
    public long a(){
       return this.g;
    }
    public final Pair b(LinkedList p0,int p1){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, or, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (q.f(p0)) {
          return new Pair(Long.valueOf(0), Long.valueOf(0));
       }else {
          return p0.get(((p1 * p0.size()) / 100));
       }
    }
    public long c(){
       return this.f;
    }
    public t e(long p0){
       r or = r.class;
       if (PatchProxy.isSupport(or)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, or, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!r.d()) {
          return t.error(new Throwable("LiveFrameMetricsMonitor is not available"));
       }else {
          this.b = new LinkedList();
          this.c = new LinkedList();
          this.e = q.b;
          this.d = new n(this, new Object());
          this.h.getWindow().addOnFrameMetricsAvailableListener(this.d, new Handler());
          return t.interval(p0, p0, TimeUnit.MILLISECONDS).observeOn(d.c).map(new p(this)).doOnNext(new o(this)).observeOn(d.a);
       }
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       if (this.d != null && r.d()) {
          this.h.getWindow().removeOnFrameMetricsAvailableListener(this.d);
       }
       this.d = null;
       this.f = 0;
       this.g = 0;
       r tb = this.b;
       if (tb != null) {
          tb.clear();
       }
       tb = this.c;
       if (tb != null) {
          tb.clear();
       }
       this.i = null;
       return;
    }
}
