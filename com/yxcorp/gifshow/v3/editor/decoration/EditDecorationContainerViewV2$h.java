package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$h;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Iterator;
import java.util.LinkedList;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.view.View;
import java.lang.NullPointerException;

public final class EditDecorationContainerViewV2$h implements ValueAnimator$AnimatorUpdateListener	// class@000eff
{
    public final EditDecorationContainerViewV2 a;
    public final float b;

    public void EditDecorationContainerViewV2$h(EditDecorationContainerViewV2 p0,float p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, EditDecorationContainerViewV2$h.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          float f = p0.floatValue();
          Iterator iterator = this.a.l.iterator();
          while (iterator.hasNext()) {
             EditDecorationBaseDrawer uEditDecorat = iterator.next();
             a.o(uEditDecorat, "drawer");
             uEditDecorat.setGlobalScale(f);
          }
          this.a.t.invalidate();
          PatchProxy.onMethodExit(EditDecorationContainerViewV2$h.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(EditDecorationContainerViewV2$h.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
