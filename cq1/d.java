package cq1.d;
import cq1.c;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import cq1.d$b;
import cq1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import yp1.d;
import com.kuaishou.android.live.log.b;
import cq1.d$a;
import android.view.View;
import java.lang.Boolean;
import java.util.Comparator;
import java.util.Collections;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;

public final class d implements c	// class@001e36
{
    public final List a;
    public final Comparator b;
    public final ViewGroup c;

    public void d(ViewGroup p0){
       a.p(p0, "renderContainer");
       super();
       this.c = p0;
       this.a = new ArrayList();
       this.b = d$b.b;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "item");
       b.P(d.a(), "hierarchyManager removeItem");
       d$a uoa = this.d(p0);
       if (uoa != null) {
          this.e(uoa);
       }
       return;
    }
    public void b(b p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "item");
       b.P(d.a(), "hierarchyManager addItem");
       d$a uoa = this.d(p0);
       int i = p0.c2();
       View view = p0.getView();
       if (uoa != null) {
          int i1 = 1;
          b = (uoa.a() != i)? true: false;
          i1 = i1 ^ a.g(uoa.c(), view);
          b.T(d.a(), "hierarchyManager addExistedItem", "isHierarchyChanged", Boolean.valueOf(b), "isViewChanged", Boolean.valueOf(i1));
          if (b || i1) {
             this.e(uoa);
             this.c(new d$a(view, i, p0));
          }
       }else {
          this.c(new d$a(view, i, p0));
       }
       return;
    }
    public final void c(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       this.a.add(p0);
       Collections.sort(this.a, this.b);
       this.c.addView(p0.c(), this.a.indexOf(p0));
       p0.b().m();
       return;
    }
    public final d$a d(b p0){
       d$a uoa;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          uoa = obj.next();
          if (a.g(uoa.b(), p0)) {
             break ;
          }
       }
       return uoa;
    }
    public final void e(d$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       this.a.remove(p0);
       this.c.removeView(p0.c());
       p0.b().j2();
       return;
    }
}
