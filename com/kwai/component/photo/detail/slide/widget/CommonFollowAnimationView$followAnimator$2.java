package com.kwai.component.photo.detail.slide.widget.CommonFollowAnimationView$followAnimator$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.animation.AnimationSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.animation.ScaleAnimation;
import qrd.l1;
import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;

public final class CommonFollowAnimationView$followAnimator$2 extends Lambda implements a	// class@000aae
{
    public static final CommonFollowAnimationView$followAnimator$2 INSTANCE;

    static {
       CommonFollowAnimationView$followAnimator$2.INSTANCE = new CommonFollowAnimationView$followAnimator$2();
    }
    public void CommonFollowAnimationView$followAnimator$2(){
       super(0);
    }
    public final AnimationSet invoke(){
       AnimationSet obj = PatchProxy.apply(null, this, CommonFollowAnimationView$followAnimator$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AnimationSet(false);
       ScaleAnimation scaleAnimati = new ScaleAnimation(0x3f800000, 0x3f666666, 0x3f800000, 0x3f666666, 1, 0x3f000000, 1, 0x3f000000);
       v1.setDuration(250);
       obj.addAnimation(v1);
       AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
       uAlphaAnimat.setDuration(250);
       obj.addAnimation(uAlphaAnimat);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
