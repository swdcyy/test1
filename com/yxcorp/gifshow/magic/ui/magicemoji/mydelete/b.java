package com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.a$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.mydelete.c;
import java.lang.Object;
import java.util.Objects;
import s5b.b;
import java.lang.String;
import q87.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import v4b.g;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import y3b.c;
import brd.t;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import e4b.a;
import e4b.c;
import com.google.common.base.a;
import java.lang.Iterable;
import y3b.a;
import erd.o;
import t45.d;
import brd.z;
import y3b.b;
import v4b.f;
import v4b.e;
import v4b.d;
import erd.g;
import erd.a;

public final class b implements a$b	// class@001bd7
{
    public final c a;

    public void b(c p0){
       this.a = p0;
    }
    public final void a(){
       b ta = this.a;
       Objects.requireNonNull(ta);
       int i = 0;
       Object[] objArray = new Object[i];
       b.D().w("MagicFaceDelete", "confirm delete items", objArray);
       objArray = null;
       if (PatchProxy.applyVoid(objArray, ta, c.class, "5")) {
       }else {
          c q = ta.q;
          if (q == null || q.isDisposed()) {
             ta.u = i;
             k1.r(new g(ta), 200);
             q = ta.p;
             Objects.requireNonNull(q);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             c uoc = c.class;
             t ot = PatchProxy.apply(objArray, q, uoc, "1");
             if (ot != patchProxyRe) {
             }else {
                ArrayList uArrayList = PatchProxy.apply(objArray, q, uoc, "2");
                if (uArrayList != patchProxyRe) {
                }else {
                   uArrayList = new ArrayList();
                   if (!q.f(q.a) || !q.f(q.b)) {
                      uArrayList.addAll(q.a);
                      uArrayList.addAll(q.b);
                   }
                }
                a uoa = c.a();
                String str = PatchProxy.applyOneRefs(uArrayList, q, uoc, "3");
                if (str != patchProxyRe) {
                }else if(q.f(uArrayList)){
                   str = "";
                }else {
                   str = a.g(",").c(uArrayList);
                }
                ot = t.just(str).flatMap(new a(uoa)).observeOn(d.a).map(b.b);
             }
             ta.q = ot.observeOn(d.a).subscribe(new f(ta), new e(ta), new d(ta));
          }
       }
       return;
    }
}
