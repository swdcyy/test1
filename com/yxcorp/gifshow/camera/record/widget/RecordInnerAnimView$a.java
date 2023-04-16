package com.yxcorp.gifshow.camera.record.widget.RecordInnerAnimView$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import kotlin.jvm.internal.Ref$BooleanRef;
import android.widget.ImageView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.NullPointerException;

public final class RecordInnerAnimView$a implements ValueAnimator$AnimatorUpdateListener	// class@000fd3
{
    public final Ref$BooleanRef a;
    public final ImageView b;

    public void RecordInnerAnimView$a(Ref$BooleanRef p0,ImageView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, RecordInnerAnimView$a.class, "1")) {
          return;
       }
       if (this.a.element != null) {
          RecordInnerAnimView$a tb = this.b;
          a.o(p0, "it");
          p0 = p0.getAnimatedValue();
          if (p0 != null) {
             tb.setRotation(p0.floatValue());
          }else {
             PatchProxy.onMethodExit(RecordInnerAnimView$a.class, "1");
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
          }
       }
       RecordInnerAnimView$a ta = this.a;
       ta.element = ta.element ^ 0x01;
       PatchProxy.onMethodExit(RecordInnerAnimView$a.class, "1");
       return;
    }
}
