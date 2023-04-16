package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onNextBtnClick$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import java.util.List;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import j8c.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$b;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import jg9.z;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import jg9.a0;
import erd.o;
import jg9.d0;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onNextBtnClick$1$a;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onNextBtnClick$1$b;
import erd.g;
import crd.b;

public final class MultiTakePictureController$onNextBtnClick$1 extends Lambda implements l	// class@000ee1
{
    public final MultiTakePictureController this$0;

    public void MultiTakePictureController$onNextBtnClick$1(MultiTakePictureController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(List p0){
       z a;
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$onNextBtnClick$1.class, "1")) {
          return;
       }
       a.p(p0, "qMedias");
       if (p0.isEmpty()) {
          this.this$0.u2();
          return;
       }else {
          Object[] objArray = new Object[0];
          a.D().s(MultiTakePictureController.V.c(), "go to edit "+p0, objArray);
          MultiTakePictureController$onNextBtnClick$1 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          t ot = PatchProxy.applyOneRefs(p0, tthis$0, MultiTakePictureController.class, "37");
          if (ot != PatchProxyResult.class) {
          }else {
             a = d.a;
             ot = t.fromCallable(new z(tthis$0)).subscribeOn(a).map(new a0(p0)).subscribeOn(d.c).map(new d0(tthis$0)).subscribeOn(a);
             a.o(ot, "Observable.fromCallable ¡­beOn\(KwaiSchedulers.MAIN\)");
          }
          ot.observeOn(d.a).subscribe(new MultiTakePictureController$onNextBtnClick$1$a(this, p0), new MultiTakePictureController$onNextBtnClick$1$b(this));
          return;
       }
    }
}
