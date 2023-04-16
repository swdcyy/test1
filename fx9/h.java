package fx9.h;
import erd.g;
import fx9.i;
import java.lang.Object;
import nk9.h;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.i3;
import f9a.a;
import java.lang.Long;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import sf5.f;
import fs4.h;
import qrd.l1;

public final class h implements g	// class@002373
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oi, "8")) {
       }else {
          tb.w = false;
          tb.P8();
          if (tb.v.k() - null > 0) {
             if (!PatchProxy.applyVoid(null, tb, oi, "9")) {
                a a = a.a;
                long l = tb.v.k();
                p0 = tb.q;
                i x = tb.x;
                Objects.requireNonNull(a);
                if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Long.valueOf(l), p0, Integer.valueOf(x), a, a.class, "1")) {
                   h oh = new h();
                   f.a(oh, p0);
                   oh.j = l;
                   oh.a = 20;
                   oh.b = 2;
                   f.c("ks-reco-zt", x, f.b(p0), oh);
                }
             }
             tb.v = new i3();
          }
       }
       return;
    }
}
