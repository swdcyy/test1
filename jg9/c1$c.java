package jg9.c1$c;
import erd.g;
import jg9.c1;
import java.lang.Object;
import zb9.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import hg9.l;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;

public final class c1$c implements g	// class@002a89
{
    public final c1 b;

    public void c1$c(c1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c1$c.class, "1")) {
       }else {
          c1$c tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, c1.class, "8")) {
             if (tb.g2()) {
                tb.l2().d(true);
             }else {
                tb.l2().d(false);
             }
          }
       }
       return;
    }
}
