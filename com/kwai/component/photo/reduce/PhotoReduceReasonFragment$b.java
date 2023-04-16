package com.kwai.component.photo.reduce.PhotoReduceReasonFragment$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.component.photo.reduce.PhotoReduceReasonFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.Objects;
import android.view.View;
import com.yxcorp.utility.n;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.animation.AnimatorSet;
import android.animation.Animator;

public class PhotoReduceReasonFragment$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000ad5
{
    public final PhotoReduceReasonFragment b;

    public void PhotoReduceReasonFragment$b(PhotoReduceReasonFragment p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PhotoReduceReasonFragment$b.class, "1")) {
          return;
       }
       this.b.p.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       this.b.uh();
       PhotoReduceReasonFragment$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, PhotoReduceReasonFragment.class, "12") && tb.y != null) {
          View[] viewArray = new View[]{tb.L,tb.K};
          n.Z(4, viewArray);
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, PhotoReduceReasonFragment.class, "17")) {
          PhotoReduceReasonFragment q = tb.q;
          q.setPivotX(tb.v);
          q.setPivotY(tb.w);
          q.setAlpha(0);
          q.setScaleX(0x3f000000);
          q.setScaleY(0x3f000000);
          float[] uofloatArray = new float[]{0x3f800000};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(q, "alpha", uofloatArray);
          objectAnimat.setInterpolator(new LinearInterpolator());
          float[] uofloatArray1 = new float[]{0x3f800000};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(q, "scaleX", uofloatArray1);
          objectAnimat1.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
          float[] uofloatArray2 = new float[]{0x3f800000};
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(q, "scaleY", uofloatArray2);
          objectAnimat2.setInterpolator(new AnticipateOvershootInterpolator(0x3f4ccccd));
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.setDuration(200);
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.start();
       }
       return;
    }
}
