package com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$c;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import java.lang.Object;
import vb9.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import e17.i;

public final class BaseMultiTakePictureController$c implements g	// class@000eba
{
    public final BaseMultiTakePictureController b;

    public void BaseMultiTakePictureController$c(BaseMultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseMultiTakePictureController$c.class, "1")) {
       }else {
          a.p(p0, "event");
          BaseMultiTakePictureController$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, BaseMultiTakePictureController.class, "12") && (p0.b == 1 && p0.c == 4)) {
             p0 = tb.o;
             if (p0 != null && p0.s()) {
                p0.h();
             }
          }
       }
       return;
    }
}
