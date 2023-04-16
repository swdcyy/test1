package g99.l;
import java.lang.Runnable;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import g99.m;
import android.animation.Animator$AnimatorListener;

public final class l implements Runnable	// class@002448
{
    public final c b;

    public void l(c p0){
       this.b = p0;
    }
    public final void run(){
       float o;
       l tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, tb, uoc, "13")) {
       }else {
          tb.E.clearAnimation();
          c e = tb.E;
          AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(e, tb, uoc, "15");
          if (uAnimatorSet != PatchProxyResult.class) {
          }else {
             float[] uofloatArray = new float[]{c.M - (o / 2.00f),c.N};
             o = c.O;
             float[] uofloatArray1 = new float[]{o,0};
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(e, "radius", uofloatArray),ObjectAnimator.ofFloat(e, "strokeWidth", uofloatArray1),ObjectAnimator.ofFloat(e, "alpha", new float[2]{0x3f800000,0})};
             uAnimatorSet1.playTogether(uAnimatorArr);
             uAnimatorSet = uAnimatorSet1;
          }
          tb.J = uAnimatorSet;
          uAnimatorSet.setDuration(830);
          tb.J.setInterpolator(new LinearInterpolator());
          tb.J.addListener(new m(tb));
          tb.J.start();
       }
       return;
    }
}
