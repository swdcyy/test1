package go1.s;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageView;
import android.util.Property;
import android.animation.ObjectAnimator;
import go1.r;
import android.animation.Animator$AnimatorListener;

public class s extends AnimatorListenerAdapter	// class@002541
{
    public final i a;

    public void s(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       s ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, i.class, "14")) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          i b = ta.B;
          float[] uofloatArray = new float[]{b.getScaleX(),0x3f4ccccd};
          i b1 = ta.B;
          float[] uofloatArray1 = new float[]{b1.getScaleY(),0x3f4ccccd};
          uAnimatorSet.addListener(new r(ta));
          Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(b, View.SCALE_X, uofloatArray).setDuration(200),ObjectAnimator.ofFloat(b1, View.SCALE_Y, uofloatArray1).setDuration(200),ObjectAnimator.ofFloat(ta.B, View.ROTATION, new float[2]{0,0x41800000}).setDuration(100)};
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.start();
       }
       return;
    }
}
