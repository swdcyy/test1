package com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$n;
import erd.g;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ed9.f;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import jg9.f;
import android.animation.Animator;
import android.view.View;
import com.yxcorp.utility.n;

public final class MultiTakePictureController$n implements g	// class@000eda
{
    public final MultiTakePictureController b;

    public void MultiTakePictureController$n(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MultiTakePictureController$n.class, "1")) {
       }else {
          a.p(p0, "event");
          MultiTakePictureController$n tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, MultiTakePictureController.class, "27")) {
             tb.F.c(p0);
             if (tb.v != null && p0.c != PanelShowEvent$PanelType.MORE_OPTION) {
                if (p0.a != null) {
                   p0 = tb.J;
                   Objects.requireNonNull(p0);
                   if (!PatchProxy.applyVoid(null, p0, f.class, "9")) {
                      p0 = p0.d;
                      if (p0 != null && p0.isRunning()) {
                         p0.end();
                      }
                   }
                   n.W(tb.t, 4, 50);
                }else if(!tb.F.b(p0)){
                   n.W(tb.t, 0, 50);
                }
             }
          }
       }
       return;
    }
}
