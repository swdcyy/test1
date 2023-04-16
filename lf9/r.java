package lf9.r;
import lf9.b;
import lf9.m;
import lf9.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import kf9.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import kf9.f;
import java.util.HashMap;
import java.util.List;
import java.lang.Integer;
import kf9.a;
import kf9.e;
import lf9.e;
import java.util.Objects;
import lf9.e$a;
import lf9.a;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Map;

public final class r extends b	// class@002dde
{
    public final q b;

    public void r(m p0,q p1){
       a.p(p0, "provider");
       a.p(p1, "viewModel");
       super(p0);
       this.b = p1;
    }
    public void c(a p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, str)) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          if (p0.b() == uob.b()) {
             this.a().h(f.a(uob, null, 0, 0, null, false, false, 47, null));
             f uof = this.a().j();
             HashMap hashMap = uof.g();
             if (hashMap.get(Integer.valueOf(uof.b())) instanceof e) {
                e$a c = e.c;
                m om = this.a();
                r tb = this.b;
                Objects.requireNonNull(c);
                if (!PatchProxy.applyVoidTwoRefs(om, tb, c, e$a.class, str)) {
                   a.p(om, "provider");
                   a.p(tb, "viewModel");
                   b uob1 = om.j();
                   c = uob1.g().get(Integer.valueOf(uob1.b()));
                   if (!c instanceof e) {
                      c = null;
                   }
                   Object obj = c;
                   if (obj != null) {
                      e uoe = tb.t0().b(7);
                      if (uoe != null) {
                         int i = uob1.b();
                         e uoe1 = e.class;
                         if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoe, uoe1, "2")) {
                            b uob2 = uoe.b.get(Integer.valueOf(i));
                            if (uob2 != null) {
                               b9.a(uob2);
                            }
                         }
                      }
                      int i1 = (obj.b() != 2)? 0: obj.b();
                      uob1.g().put(Integer.valueOf(uob1.b()), e.a(obj, null, -1, i1, false, 9, null));
                      om.h(f.a(uob1, null, 0, 0, null, 0, false, 63, null));
                   }
                }
             }
          }
       }
       return;
    }
}
