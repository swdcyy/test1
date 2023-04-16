package jg9.c1$b;
import erd.g;
import jg9.c1;
import java.lang.Object;
import zb9.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import oc9.d0;
import hg9.l;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;

public final class c1$b implements g	// class@002a88
{
    public final c1 b;

    public void c1$b(c1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c1$b.class, "1")) {
       }else {
          a.p(p0, "event");
          c1$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, c1.class, "7")) {
             tb.t = p0.a;
             if (!tb.f2()) {
                if (tb.g2()) {
                   tb.l2().d(true);
                }else {
                   tb.l2().d(false);
                }
             }
          }
       }
       return;
    }
}
