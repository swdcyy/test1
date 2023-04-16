package com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mCritScaleAnim$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import android.animation.AnimatorSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.shimmer.ShimmerFrameLayout;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import kotlin.jvm.internal.a;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog$mCritScaleAnim$2$a;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;

public final class RandomCoinDialog$mCritScaleAnim$2 extends Lambda implements a	// class@0014a3
{
    public final RandomCoinDialog this$0;

    public void RandomCoinDialog$mCritScaleAnim$2(RandomCoinDialog p0){
       this.this$0 = p0;
       super(0);
    }
    public final AnimatorSet invoke(){
       AnimatorSet obj = PatchProxy.apply(null, this, RandomCoinDialog$mCritScaleAnim$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimatorSet();
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3fa66666}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3fa66666})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(RandomCoinDialog.e0(this.this$0), propertyValu);
       objectAnimat.setDuration(600);
       objectAnimat.setInterpolator(new DecelerateInterpolator());
       a.o(objectAnimat, "ObjectAnimator.ofPropert¡­ateInterpolator\(\)\n      }");
       PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3fa66666,0x3f666666}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3fa66666,0x3f666666})};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(RandomCoinDialog.e0(this.this$0), propertyValu1);
       objectAnimat1.setDuration(300);
       objectAnimat1.setInterpolator(new AccelerateDecelerateInterpolator());
       a.o(objectAnimat1, "ObjectAnimator.ofPropert¡­ateInterpolator\(\)\n      }");
       PropertyValuesHolder[] propertyValu2 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f666666,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f666666,0x3f800000})};
       ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(RandomCoinDialog.e0(this.this$0), propertyValu2);
       objectAnimat2.setDuration(300);
       objectAnimat2.setInterpolator(new AccelerateDecelerateInterpolator());
       a.o(objectAnimat2, "ObjectAnimator.ofPropert¡­ateInterpolator\(\)\n      }");
       obj.addListener(new RandomCoinDialog$mCritScaleAnim$2$a(this));
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2};
       obj.playSequentially(uAnimatorArr);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
