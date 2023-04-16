package com.yxcorp.gifshow.comment.f;
import erd.g;
import com.yxcorp.gifshow.comment.g;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.b;
import ek9.e1;
import io.reactivex.a;
import brd.a;
import t45.d;
import brd.z;
import ek9.f1;
import ek9.g1;
import erd.a;
import lnc.a1;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class f implements g	// class@0010cd
{
    public final g b;
    public final String c;
    public final String d;
    public final Activity e;

    public void f(g p0,String p1,String p2,Activity p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       f te = this.e;
       Objects.requireNonNull(tb);
       if (p0.b != null) {
          if (!PatchProxy.applyVoidTwoRefs(tc, td, tb, g.class, "3")) {
             p0 = tb.a;
             if (p0 == null || (p0.isDisposed() && (tc != null || td != null))) {
                tb.a = a.k(new e1(tb, tc, td)).w(d.c).s(d.a).u(new f1(tb), new g1(tb));
             }
          }
       }else {
          PermissionUtils.o(te, a1.p(R.string.arg_RES_7f104ab5));
       }
       return;
    }
}
