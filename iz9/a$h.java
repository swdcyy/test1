package iz9.a$h;
import erd.g;
import iz9.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import qp7.x0;
import qp7.b;
import wr7.g;
import java.util.Objects;
import pp7.b;
import java.util.BitSet;
import java.lang.Runnable;
import ekd.k1;
import j9a.a;
import j9a.d;
import java.lang.System;
import com.yxcorp.gifshow.entity.QPhoto;

public final class a$h implements g	// class@0028d3
{
    public final a b;

    public void a$h(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       a$h oh = a$h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, oh, "1")) {
          g og = this.b.E();
          Objects.requireNonNull(og);
          g og1 = g.class;
          if (!PatchProxy.isSupport(og1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), og, og1, "5")) {
             og.g.f(Boolean.valueOf(b));
          }
          String str = "notifyLoading";
          int i = 1;
          if (b) {
             this.b.w.clear(i);
             this.b.o0(str);
             oh = this.b;
             if (oh.x == null) {
                k1.m(oh.E);
                k1.r(this.b.E, (long)0x2710);
                k1.m(this.b.F);
                k1.r(this.b.F, (long)(d.b().timeOutSec * 1000));
             }
             this.b.z = System.currentTimeMillis();
             a u = this.b.u;
             if (u != null && u.isVideoType() == i) {
                u = this.b.u;
                if (u != null) {
                   u.setPlayFailed(i);
                }
             }
          }else {
             a$h tb = this.b;
             if ((System.currentTimeMillis() - tb.z) - (long)200 < 0) {
                a u1 = tb.u;
                if (u1 != null) {
                   u1.setPlayFailed(false);
                }
             }
             this.b.w.set(i);
             this.b.n0(str);
             k1.m(this.b.E);
             k1.m(this.b.F);
          }
       label_00d2 :
          this.b.x = b;
       }
       return;
    }
}
