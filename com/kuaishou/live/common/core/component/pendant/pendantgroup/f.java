package com.kuaishou.live.common.core.component.pendant.pendantgroup.f;
import ty1.b;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import cw1.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import android.util.SparseArray;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import java.lang.Iterable;
import qk.m;
import cw1.k0;
import ok.o;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.lang.Boolean;
import cw1.d0;
import cw1.c0;

public final class f implements b	// class@00171b
{
    public final g a;

    public void f(g p0){
       this.a = p0;
    }
    public final void a(int p0,int p1){
       List list;
       Object obj1;
       int i = p0;
       f a = this.a;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l0 ol0 = l0.class;
       Object obj = null;
       if (PatchProxy.isSupport(ol0)) {
          list = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, ol0, "3");
          if (list != patchProxyRe) {
          }else if(!i){
             list = l0.a;
          }else {
             list = m.s(l0.a).p(new k0(l0.b.get(i))).B();
          }
       }else {
          goto label_0025 ;
       }
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          a.c(iterator.next());
       }
       if (PatchProxy.isSupport(ol0)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, ol0, "4");
          if (obj1 != patchProxyRe) {
          label_0077 :
             Object obj2 = obj1;
             if (obj2 != null && (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(obj2, Boolean.TRUE, Integer.valueOf(p1), a, g.class, "6"))) {
                g b = a.b;
                Objects.requireNonNull(b);
                if (!PatchProxy.isSupport(d0.class) || !PatchProxy.applyVoidThreeRefs(obj2, Boolean.TRUE, Integer.valueOf(p1), b, d0.class, "10")) {
                   b.e(obj2, true);
                   if (b.c(obj2, true)) {
                      b.a.a(p1);
                   }
                }
             }
             return;
          }
       }
       obj1 = l0.b.get(i);
       goto label_0077 ;
    }
}
