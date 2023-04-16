package kf0.e;
import kf0.e$a;
import nsd.u;
import kf0.s;
import android.content.Context;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.ViewConfiguration;
import je0.c;
import je0.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import android.widget.FrameLayout;
import java.lang.Integer;
import java.util.Iterator;
import java.util.List;
import je0.a$a;

public final class e	// class@002d09
{
    public final List a;
    public final c b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public final Context i;
    public final KemTaskPendant j;
    public static final int k;
    public static final int l;
    public static final e$a m;

    static {
       e.m = new e$a(null);
       s d = s.d;
       e.k = d.a(10.00f);
       e.l = d.a(20.00f);
    }
    public void e(Context p0,KemTaskPendant p1){
       a.p(p0, "context");
       a.p(p1, "pendant");
       super();
       this.i = p0;
       this.j = p1;
       this.a = new CopyOnWriteArrayList();
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       a.o(viewConfigur, "ViewConfiguration.get\(context\)");
       this.c = viewConfigur.getScaledTouchSlop();
       this.b = new c(p1);
    }
    public final boolean a(float p0,float p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoe, "3");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       float f = (float)e.l;
       float f1 = (float)e.k;
       if (PatchProxy.isSupport(uoe)) {
          Object obj1 = PatchProxy.applyFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(f), Float.valueOf(f1), this, e.class, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(p0 - (- f) >= 0 && (p1 - (- f1) >= 0 && (p0 - ((float)(this.j.getRight() - this.j.getLeft()) + f) < 0 && p1 - ((float)(this.j.getBottom() - this.j.getTop()) + f1) < 0))){
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_004f ;
       }
       return b;
    }
    public final void b(int p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoe, "7")) {
          return;
       }
       uoe = this.j;
       uoe.setX((uoe.getX() + (float)p0));
       e tj = this.j;
       tj.setY((tj.getY() + (float)p1));
       this.j.bringToFront();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().i(this.j);
       }
       return;
    }
}
