package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$o;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import zb9.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.d0;
import kotlin.jvm.internal.a;
import java.util.Objects;
import hg9.l;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;

public final class MultiTakePictureController$o implements g	// class@000edb
{
    public final MultiTakePictureController b;

    public void MultiTakePictureController$o(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$o.class, "1")) {
       }else if(this.b.f2()){
          MultiTakePictureController$o tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, MultiTakePictureController.class, "38")) {
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
