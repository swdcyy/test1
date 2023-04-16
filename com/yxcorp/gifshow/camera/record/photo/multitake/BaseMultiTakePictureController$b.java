package com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$b;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import oc9.d0;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import oc9.w;
import com.yxcorp.gifshow.camera.record.base.b;
import hg9.l;

public final class BaseMultiTakePictureController$b implements g	// class@000eb9
{
    public final BaseMultiTakePictureController b;

    public void BaseMultiTakePictureController$b(BaseMultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseMultiTakePictureController$b.class, "1")) {
       }else {
          a.p(p0, "event");
          BaseMultiTakePictureController$b tb = this.b;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, BaseMultiTakePictureController.class, "6") || (p0.b != tb.c || (!PanelShowEvent.a(tb.e, p0) || (!tb.f2() && p0.c != PanelShowEvent$PanelType.MORE_OPTION)))) {
             p0 = tb.d;
             a.o(p0, "mCallerContext");
             p0 = p0.b();
             a.o(p0, "mCallerContext.controllerManager");
             if (!p0.x2()) {
                tb.p.d(false);
             }else if(tb.g2()){
                tb.p.d(true);
             }
          }
       }
       return;
    }
}
