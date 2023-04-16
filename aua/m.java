package aua.m;
import java.lang.Runnable;
import aua.n;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.animation.AnimatorSet;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import aua.p;
import android.animation.Animator$AnimatorListener;

public final class m implements Runnable	// class@000316
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final void run(){
       m tb = this.b;
       Objects.requireNonNull(tb);
       n on = n.class;
       if (PatchProxy.applyVoid(null, tb, on, "11")) {
       }else {
          tb.F.clearAnimation();
          n f = tb.F;
          AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(f, tb, on, "13");
          if (uAnimatorSet != PatchProxyResult.class) {
          }else {
             float[] uofloatArray = new float[]{CircleWithStrokeView.f,n.Q};
             float[] uofloatArray1 = new float[]{CircleWithStrokeView.e,0};
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(f, "radius", uofloatArray),ObjectAnimator.ofFloat(f, "strokeWidth", uofloatArray1),ObjectAnimator.ofFloat(f, "alpha", new float[2]{0x3f800000,0})};
             uAnimatorSet1.playTogether(uAnimatorArr);
             uAnimatorSet = uAnimatorSet1;
          }
          tb.J = uAnimatorSet;
          uAnimatorSet.setDuration(830);
          tb.J.setInterpolator(new LinearInterpolator());
          tb.J.addListener(new p(tb));
          tb.J.start();
       }
       return;
    }
}
