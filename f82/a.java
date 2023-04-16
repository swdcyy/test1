package f82.a;
import java.lang.Runnable;
import com.kuaishou.live.core.show.fansgroup.b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import z12.x;
import f82.c;
import com.kwai.robust.PatchProxyResult;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.core.show.fansgroup.a;
import android.animation.Animator$AnimatorListener;

public final class a implements Runnable	// class@0028e5
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       a b = this.b;
       Objects.requireNonNull(b);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, b.class, "2")) {
       }else {
          b.f = 0;
          x.I(b.c);
          b a = b.a;
          b b1 = b.b;
          AnimatorSet uAnimatorSet = PatchProxy.applyTwoRefs(a, b1, objArray, c.class, "8");
          if (uAnimatorSet != PatchProxyResult.class) {
          }else {
             Keyframe keyframe = Keyframe.ofFloat(0, 0x3f800000);
             Keyframe keyframe1 = Keyframe.ofFloat(0.25f, 0x3f8a3d71);
             Keyframe keyframe2 = Keyframe.ofFloat(0x3f000000, 0x3f800000);
             Keyframe keyframe3 = Keyframe.ofFloat(0x3f800000, 0x3f800000);
             Keyframe[] keyframeArra = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3};
             Keyframe[] keyframeArra1 = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3};
             Keyframe[] keyframeArra2 = new Keyframe[]{Keyframe.ofFloat(0, 0),Keyframe.ofFloat(0x3e0f5c29, 0x3f800000),Keyframe.ofFloat(0x3ec28f5c, 0x3f800000),Keyframe.ofFloat(0x3f000000, 0),Keyframe.ofFloat(0x3f800000, 0)};
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.SCALE_X, keyframeArra),PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeArra1),PropertyValuesHolder.ofKeyframe(View.ALPHA, keyframeArra2)};
             Keyframe[] keyframeArra3 = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3};
             Keyframe[] keyframeArra4 = new Keyframe[]{keyframe,keyframe1,keyframe2,keyframe3};
             propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe(View.SCALE_X, keyframeArra3),PropertyValuesHolder.ofKeyframe(View.SCALE_Y, keyframeArra4)};
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             uAnimatorSet1.setDuration(1000).setInterpolator(new LinearInterpolator());
             Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofPropertyValuesHolder(a, propertyValu),ObjectAnimator.ofPropertyValuesHolder(b1, propertyValu)};
             uAnimatorSet1.playTogether(uAnimatorArr);
             uAnimatorSet = uAnimatorSet1;
          }
          b.c = uAnimatorSet;
          uAnimatorSet.addListener(super(b));
          b.c.start();
       }
       return;
    }
}
