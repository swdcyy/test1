package lf9.o;
import lf9.b;
import lf9.m;
import lf9.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import lf9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import kf9.f;
import java.util.HashMap;
import java.util.List;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import kf9.a;
import kf9.e;
import java.lang.Integer;
import kf9.c;

public final class o extends b	// class@002ddb
{
    public final q b;

    public void o(m p0,q p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       int i;
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "1")) {
       }else {
          a.p(p0, "action");
          f uof = this.a().j();
          this.a().h(f.a(uof, null, 0, 0, null, false, false, 47, null));
          i.e(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1041ec), 0);
          if (uof.c() instanceof e) {
             i = uof.b();
             if (!PatchProxy.isSupport(oo) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, oo, "2")) {
                this.b.v0(new c(7, i));
             }
          }
       }
       return;
    }
}
