package bra.i$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bra.i;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import android.widget.TextView;
import lnc.a1;
import java.lang.NullPointerException;

public final class i$a implements ValueAnimator$AnimatorUpdateListener	// class@000434
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          int i = p0.intValue();
          UnmuteTipView j = this.a.b.J;
          int i1 = 5;
          if (j != null) {
             float f = 0x3f800000;
             if (i > i1) {
                f = (i1 <= i && 50 >= i)? f - ((float)(i - 50) / (float)45): 0;
             }
          label_003b :
             j.setAlpha(f);
          }
          float f1 = 247.00f;
          if (i <= i1) {
             i = a1.e(f1);
          }else if(i1 <= i && 200 >= i){
             i = a1.e(f1) - (int)(((float)(i - i1) / (float)195) * (float)a1.d(0x7f07025f));
          }else {
             i = a1.e(137.00f);
          }
          this.a.b.setBgWidth(i);
          PatchProxy.onMethodExit(i$a.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(i$a.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
       }
    }
}
