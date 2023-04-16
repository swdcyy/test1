package dl9.y1;
import android.animation.AnimatorListenerAdapter;
import dl9.u1;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.util.Objects;
import java.lang.Long;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import dl9.z1;
import android.animation.Animator$AnimatorListener;

public class y1 extends AnimatorListenerAdapter	// class@001fc5
{
    public final boolean a;
    public final u1 b;

    public void y1(u1 p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y1.class, "3")) {
          return;
       }
       this.b.t.setVisibility(8);
       this.b.s.setVisibility(0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y1.class, "1")) {
          return;
       }
       this.b.t.setVisibility(8);
       this.b.s.setVisibility(0);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y1.class, "2")) {
          return;
       }
       y1 tb = this.b;
       long l = (this.a != null)? p0.getDuration() - 250: p0.getDuration();
       Objects.requireNonNull(tb);
       u1 ou1 = u1.class;
       if (!PatchProxy.isSupport(ou1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), tb, ou1, "14")) {
          ou1 = tb.M;
          if (ou1 != null && ou1.isRunning()) {
             tb.M.cancel();
          }
          tb.M = new AnimatorSet();
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f4ccccd,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f4ccccd,0x3f800000})};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tb.s, propertyValu);
          objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(tb.s, View.ALPHA, new float[2]{0,0x3f800000});
          objectAnimat1.setInterpolator(new LinearInterpolator());
          tb.M.setStartDelay(l);
          tb.M.setDuration(150);
          tb.M.addListener(new z1(tb));
          Animator[] uAnimatorArr = new Animator[]{objectAnimat1,objectAnimat};
          tb.M.playTogether(uAnimatorArr);
          tb.M.start();
       }
       return;
    }
}
