package com.kuaishou.pagedy.c;
import com.kuaishou.pagedy.c$a;
import java.lang.Object;
import oo4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.pagedy.manager.DynamicPageCenter;
import crd.b;
import to4.h;
import po4.e;
import ju4.d;
import ju4.e;
import java.lang.StringBuilder;
import com.kuaishou.bowl.core.component.a;
import nv.c;
import com.kuaishou.bowl.core.util.ComponentStateMachine$ComponentState;
import java.util.Map;
import su.g;
import qu4.f;

public class c	// class@000a47
{
    public g a;
    public DynamicPageCenter b;
    public String c;
    public c d;

    public void c(c$a p0){
       super();
       this.b = p0.b;
       this.a = p0.a;
       this.c = p0.c;
       this.d = new c();
    }
    public void a(){
       String str = "1";
       if (PatchProxy.applyVoid(null, this, c.class, str)) {
          return;
       }
       c tb = this.b;
       if (tb != null) {
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, DynamicPageCenter.class, "30")) {
             h.a(tb.a);
             h.a(tb.b);
             tb.c = null;
             tb.e = null;
             DynamicPageCenter a = tb.A;
             if (a != null && !PatchProxy.applyVoid(null, a, e.class, str)) {
                e a1 = a.a;
                if (a1 != null) {
                   d.l(a1);
                   a.a = null;
                }
                a1 = a.b;
                if (a1 != null) {
                   e.l(a1);
                   a.b = null;
                }
                a1 = a.c;
                if (a1 != null) {
                   e.l(a1);
                   a.c = null;
                }
             }
          label_0055 :
             tb.h = true;
             if (tb.m != null) {
                c.f("释放根节点 component"+tb.m.getComponentName());
                tb.m.moveToState(ComponentStateMachine$ComponentState.DESTROY);
             }
             DynamicPageCenter r = tb.r;
             if (r != null) {
                r.clear();
             }
             r = tb.q;
             if (r != null) {
                r.clear();
             }
             g.b(tb.l, null);
             tb.v.clear();
             f.c.l(tb.l);
          }
       }
       this.a = null;
       this.d = null;
       return;
    }
}
