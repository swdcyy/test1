package fia.h0;
import erd.g;
import fia.z;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import bia.f;
import com.kwai.robust.PatchProxyResult;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.utility.n;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator;
import fia.g0;
import android.animation.Animator$AnimatorListener;

public final class h0 implements g	// class@00290d
{
    public final z b;

    public void h0(z p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "1")) {
       }else {
          p0 = this.b;
          z b = p0.B;
          if (b != null && (p0.w != null && p0.G != null)) {
             a.m(b);
             p0 = this.b.G;
             a.m(p0);
             z w = this.b.w;
             a.m(w);
             AnimatorSet uAnimatorSet = PatchProxy.applyThreeRefs(b, p0, w, null, f.class, "17");
             if (uAnimatorSet != PatchProxyResult.class) {
             }else {
                a.p(b, "tipsGuide");
                a.p(p0, "guideLottie");
                a.p(w, "tipsView");
                uAnimatorSet = new AnimatorSet();
                float[] uofloatArray = new float[]{b.getX(),b.getX() + (float)b.getWidth()};
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(b, View.TRANSLATION_X, uofloatArray);
                a.o(objectAnimat, "translationX");
                objectAnimat.setDuration(300);
                objectAnimat.setInterpolator(new DecelerateInterpolator());
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(b, View.ALPHA, new float[2]{0x3f800000,0});
                a.o(objectAnimat1, "alphaGuide");
                objectAnimat1.setDuration(300);
                objectAnimat1.setInterpolator(new DecelerateInterpolator());
                p0 = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0});
                a.o(p0, "alphaLottie");
                p0.setDuration(300);
                p0.setInterpolator(new DecelerateInterpolator());
                View[] viewArray = new View[]{w};
                n.Z(0, viewArray);
                w.setAnimation(R.raw.arg_RES_7f0f006d);
                w.s();
                ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(w, View.SCALE_X, new float[2]{0x3f000000,0x3f800000});
                a.o(objectAnimat2, "expandX");
                objectAnimat2.setDuration(300);
                objectAnimat2.setInterpolator(new DecelerateInterpolator());
                ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(w, View.SCALE_Y, new float[2]{0x3f000000,0x3f800000});
                a.o(objectAnimat3, "expandY");
                objectAnimat3.setDuration(300);
                objectAnimat3.setInterpolator(new DecelerateInterpolator());
                Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,p0,objectAnimat2,objectAnimat3};
                uAnimatorSet.playTogether(uAnimatorArr);
             }
             uAnimatorSet.addListener(new g0(this));
             uAnimatorSet.start();
          }
       }
       return;
    }
}
