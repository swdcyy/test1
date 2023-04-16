package ged.a;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.animation.AnimatorSet;

public class a	// class@002abf
{

    public void a(){
       super();
    }
    public static Animator a(View p0,Animator$AnimatorListener p1){
       p1 = PatchProxy.applyTwoRefs(p0, null, null, a.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       p0.setAlpha(0);
       p0.setScaleX(0x3f000000);
       p0.setScaleY(0x3f000000);
       float[] uofloatArray = new float[]{0x3f800000};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "alpha", uofloatArray);
       objectAnimat.setInterpolator(new LinearInterpolator());
       float[] uofloatArray1 = new float[]{0x3f800000};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, "scaleX", uofloatArray1);
       objectAnimat1.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       float[] uofloatArray2 = new float[]{0x3f800000};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(p0, "scaleY", uofloatArray2);
       objectAnimat2.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration(200);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       uAnimatorSet.playTogether(uAnimatorArr);
       return uAnimatorSet;
    }
    public static Animator b(View p0,Animator$AnimatorListener p1){
       p1 = PatchProxy.applyTwoRefs(p0, null, null, a.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       float[] uofloatArray = new float[]{0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "alpha", uofloatArray);
       objectAnimat.setInterpolator(new LinearInterpolator());
       float[] uofloatArray1 = new float[]{0x3f000000};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, "scaleX", uofloatArray1);
       objectAnimat1.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       float[] uofloatArray2 = new float[]{0x3f000000};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(p0, "scaleY", uofloatArray2);
       objectAnimat2.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration(200);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       uAnimatorSet.playTogether(uAnimatorArr);
       return uAnimatorSet;
    }
}
