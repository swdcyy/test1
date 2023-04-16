package n9a.m;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.view.LikeView;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.AnimatorSet$Builder;
import java.lang.Long;
import android.animation.PropertyValuesHolder;
import android.view.animation.AccelerateDecelerateInterpolator;

public class m extends AnimatorListenerAdapter	// class@003114
{
    public final LottieAnimationView a;
    public final Animator$AnimatorListener b;
    public final View c;
    public final LikeView d;

    public void m(LikeView p0,LottieAnimationView p1,Animator$AnimatorListener p2,View p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.b.onAnimationCancel(p0);
       this.c.setAlpha(0x3f800000);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.v(this);
       this.a.setVisibility(4);
       this.b.onAnimationEnd(p0);
       this.c.setAlpha(0x3f800000);
       return;
    }
    public void onAnimationStart(Animator p0){
       ObjectAnimator objectAnimat;
       AnimatorSet uAnimatorSet1;
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       super.onAnimationStart(p0);
       int i = 0;
       this.a.setVisibility(i);
       this.c.setSelected(i);
       this.c.setAlpha(0);
       m td = this.d;
       if (td.h == null) {
          m ta = this.a;
          m tc = this.c;
          Objects.requireNonNull(td);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoidTwoRefs(ta, tc, td, LikeView.class, "20")) {
             int i1 = 2;
             if (td.g != null) {
                if (td.e == null) {
                   AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(ta, td, LikeView.class, "17");
                   if (uAnimatorSet != patchProxyRe) {
                   }else {
                      uAnimatorSet = new AnimatorSet();
                      objectAnimat = ObjectAnimator.ofFloat(ta, View.ALPHA, new float[i1]{0x3f800000,0});
                      objectAnimat.setInterpolator(new LinearInterpolator());
                      uAnimatorSet.setDuration(ta.getDuration());
                      uAnimatorSet.play(objectAnimat);
                   }
                   td.e = uAnimatorSet;
                }
             }else if(td.e == null){
                long l = ta.getDuration() - 250;
                if (PatchProxy.isSupport(LikeView.class)) {
                   uAnimatorSet1 = PatchProxy.applyTwoRefs(tc, Long.valueOf(l), td, LikeView.class, "16");
                   if (uAnimatorSet1 != patchProxyRe) {
                   label_00ec :
                      td.e = uAnimatorSet1;
                   }
                }
                uAnimatorSet1 = new AnimatorSet();
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i1];
                propertyValu[i] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i1]{0,0x3f800000});
                propertyValu[1] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i1]{0,0x3f800000});
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(tc, propertyValu);
                objectAnimat1.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimat = ObjectAnimator.ofFloat(tc, View.ALPHA, new float[i1]{0,0x3f800000});
                objectAnimat.setInterpolator(new LinearInterpolator());
                uAnimatorSet1.setStartDelay(l);
                uAnimatorSet1.setDuration(200);
                Animator[] uAnimatorArr = new Animator[i1];
                uAnimatorArr[i] = objectAnimat;
                uAnimatorArr[1] = objectAnimat1;
                uAnimatorSet1.playTogether(uAnimatorArr);
                goto label_00ec ;
             }
          }
          this.d.e.start();
       }
       return;
    }
}
