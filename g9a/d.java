package g9a.d;
import g9a.d$a;
import nsd.u;
import android.content.Context;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import tyc.g0;
import g9a.d$b;
import android.view.GestureDetector$OnGestureListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.MotionEvent;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import java.util.Objects;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import android.graphics.Rect;
import android.view.ViewConfiguration;
import g9a.e;

public final class d	// class@002416
{
    public e a;
    public final Handler b;
    public ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final g0 h;
    public final Context i;
    public static boolean j;
    public static final d$a k;

    static {
       d.k = new d$a(null);
    }
    public void d(Context p0,View p1){
       a.p(p0, "context");
       a.p(p1, "view");
       super();
       this.i = p0;
       Handler handler = new Handler(Looper.getMainLooper());
       this.b = handler;
       this.c = new ArrayList();
       this.d = true;
       this.h = new g0(p0, new d$b(this, p1), handler);
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       a.p(p0, "view");
       this.c.add(p0);
       return;
    }
    public final void b(MotionEvent p0){
       Rect rect;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "ev");
       if (!p0.getAction()) {
          this.g();
          this.g = this.f;
       }
       int i = 0;
       if (this.g == null) {
          Object[] objArray = new Object[i];
          o.C().w("PressControlSpeedHelper", "À¹½ØÊÂ¼þ"+p0.getAction(), objArray);
          return;
       }else {
          String str = "null cannot be cast to non-null type android.app.Activity";
          if (ExperimentUtils.d() == 1) {
             d ti = this.i;
             Objects.requireNonNull(ti, str);
             int i1 = n.j(ti) - a1.d(0x7f070bf1);
             rect = new Rect(i, (i1 - a1.e(160.00f)), n.k(this.i), i1);
             if (!p0.getAction() && rect.contains((int)p0.getRawX(), (int)p0.getRawY())) {
                this.e = true;
             }
             if (this.e != null) {
                this.e(p0);
             }
          }else if(ExperimentUtils.d() == 2){
             d ti1 = this.i;
             Objects.requireNonNull(ti1, str);
             Rect rect1 = new Rect(i, i, a1.e(64.00f), n.j(ti1));
             rect = new Rect((n.k(this.i) - a1.e(64.00f)), i, n.k(this.i), n.j(this.i));
             if (!p0.getAction() && (rect1.contains((int)p0.getRawX(), (int)p0.getRawY()) || rect.contains((int)p0.getRawX(), (int)p0.getRawY()))) {
                this.e = true;
             }
             if (this.e != null) {
                this.e(p0);
             }
          }
          return;
       }
    }
    public final void c(boolean p0){
       this.d = p0;
    }
    public final void d(boolean p0){
       this.f = p0;
    }
    public final void e(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (p0.getAction() == 1 || p0.getAction() == 3) {
          this.g();
       }
       this.h.b((long)(ViewConfiguration.getLongPressTimeout() - 20));
       this.h.onTouchEvent(p0);
       return;
    }
    public final void f(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       a.p(p0, "view");
       this.c.remove(p0);
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.e = false;
       this.g = false;
       if (d.j) {
          d.j = false;
          d ta = this.a;
          if (ta != null) {
             ta.a(false, 0, 0);
          }
       }
       return;
    }
    public final void h(e p0){
       this.a = p0;
    }
}
