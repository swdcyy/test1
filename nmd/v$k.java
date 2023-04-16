package nmd.v$k;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import nmd.v;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.util.Objects;
import android.view.View;
import java.lang.NullPointerException;

public final class v$k implements ValueAnimator$AnimatorUpdateListener	// class@001e83
{
    public final v a;
    public final float b;
    public final boolean c;

    public void v$k(v p0,float p1,boolean p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, v$k.class, "1")) {
          return;
       }
       a.p(p0, "value");
       v$k ta = this.a;
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          float f = p0.floatValue();
          Objects.requireNonNull(ta);
          v ov = v.class;
          if (!PatchProxy.isSupport(ov) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), ta, ov, "8")) {
             ov = ta.m;
             a.o(ov, "mMergeEditPostLayout");
             ov.setAlpha(f);
             ov = ta.p;
             a.o(ov, "mActionRecycleView");
             ov.setAlpha(f);
             ov = ta.q;
             if (ov != null) {
                ov.setAlpha(f);
             }
             v s = ta.s;
             if (s != null) {
                s.setAlpha(f);
             }
          }
          PatchProxy.onMethodExit(v$k.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(v$k.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
