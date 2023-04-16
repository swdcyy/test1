package e8a.e0;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideLikePresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import android.widget.ImageView;
import java.util.Objects;
import java.lang.Long;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import e8a.f0;
import android.animation.Animator$AnimatorListener;

public class e0 extends AnimatorListenerAdapter	// class@0020a0
{
    public final NasaProfileSideLikePresenter a;

    public void e0(NasaProfileSideLikePresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       e0 ta = this.a;
       ta.p.setSelected(ta.u.isLiked());
       this.a.q.setVisibility(0);
       this.a.r.setVisibility(8);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       e0 ta = this.a;
       ta.p.setSelected(ta.u.isLiked());
       this.a.q.setVisibility(0);
       this.a.r.setVisibility(8);
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "3")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.q.setVisibility(8);
       if (this.a.u.isLiked()) {
          e0 ta = this.a;
          long l = p0.getDuration() - 250;
          Objects.requireNonNull(ta);
          NasaProfileSideLikePresenter nasaProfileS = NasaProfileSideLikePresenter.class;
          if (!PatchProxy.isSupport(nasaProfileS) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), ta, nasaProfileS, "20")) {
             nasaProfileS = ta.z;
             if (nasaProfileS != null && nasaProfileS.isStarted()) {
                ta.z.cancel();
             }
             ta.z = new AnimatorSet();
             PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f4ccccd,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f4ccccd,0x3f800000})};
             ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(ta.q, propertyValu);
             objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(ta.q, View.ALPHA, new float[2]{0,0x3f800000});
             objectAnimat1.setInterpolator(new LinearInterpolator());
             ta.z.setStartDelay(l);
             ta.z.setDuration(150);
             ta.z.addListener(new f0(ta));
             Animator[] uAnimatorArr = new Animator[]{objectAnimat1,objectAnimat};
             ta.z.playTogether(uAnimatorArr);
             ta.z.start();
          }
       }
       return;
    }
}
