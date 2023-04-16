package com.yxcorp.gifshow.profile.presenter.profile.f;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.l;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import l3c.a0;
import com.kwai.framework.model.user.UserOwnerCount;
import com.yxcorp.gifshow.profile.presenter.profile.k;
import lkd.b;
import j4c.k;
import com.yxcorp.gifshow.profile.presenter.profile.e;
import lnc.a1;
import j4c.j;
import j4c.l;
import com.yxcorp.gifshow.profile.presenter.profile.c;
import com.yxcorp.gifshow.profile.presenter.profile.j;
import j4c.e;
import com.yxcorp.gifshow.profile.presenter.profile.d;

public final class f implements g	// class@001492
{
    public final l b;

    public void f(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       p0 = l.class;
       if (PatchProxy.applyVoid(null, tb, p0, "11")) {
       }else if(!tb.q.hasMore()){
          l s = tb.s;
          if (s instanceof a0) {
             if (tb.q.isEmpty()) {
                if (tb.u.mLike > null) {
                   if (!PatchProxy.applyVoidOneRefs(s, tb, p0, "12")) {
                      s.C(new k(tb));
                      s.B(new k(tb));
                      if (tb.p != null) {
                         s.A(e.a);
                      }
                      s.C = (float)a1.e(8.00f);
                      tb.W8();
                   }
                }else {
                   s.C(new j(tb));
                   s.B(new l(tb));
                   if (tb.p != null) {
                      s.A(c.a);
                   }
                }
                s.i();
             }else {
                p0 = tb.u;
                int i = l.V8(tb.q);
                int i1 = 0;
                if (p0 != null && (p0.mLike > null && !i)) {
                   i1 = 1;
                }
             label_0091 :
                if (i1) {
                   s.H(new j(tb));
                }else {
                   s.H(new e(tb));
                }
                s.G(d.a);
                s.p();
                if (tb.R8() > 0) {
                   tb.W8();
                }
             }
          }
       }
       return;
    }
}
