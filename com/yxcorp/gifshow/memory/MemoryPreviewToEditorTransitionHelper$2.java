package com.yxcorp.gifshow.memory.MemoryPreviewToEditorTransitionHelper$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import lnc.a1;
import android.view.animation.DecelerateInterpolator;
import android.animation.AnimatorSet;
import com.yxcorp.gifshow.memory.MemoryPreviewToEditorTransitionHelper$2$a;
import android.animation.Animator$AnimatorListener;

public final class MemoryPreviewToEditorTransitionHelper$2 extends Lambda implements l	// class@001d43
{
    public static final MemoryPreviewToEditorTransitionHelper$2 INSTANCE;

    static {
       MemoryPreviewToEditorTransitionHelper$2.INSTANCE = new MemoryPreviewToEditorTransitionHelper$2();
    }
    public void MemoryPreviewToEditorTransitionHelper$2(){
       super(1);
    }
    public final Animator invoke(View p0){
       View obj = PatchProxy.applyOneRefs(p0, this, MemoryPreviewToEditorTransitionHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "view");
       obj = p0.findViewById(R.id.memory_publish_coin);
       float f = 0;
       if (obj != null) {
          obj.setAlpha(f);
       }
       p0.setAlpha(f);
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0,0x3f800000});
       a.o(objectAnimat, "animatorAlpha");
       objectAnimat.setInterpolator(new LinearInterpolator());
       objectAnimat.setStartDelay(200);
       objectAnimat.setDuration(200);
       float[] uofloatArray = new float[]{(float)a1.e(60.00f),f};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       a.o(objectAnimat1, "animatorTranslationY");
       objectAnimat1.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       objectAnimat1.setStartDelay(150);
       objectAnimat1.setDuration(250);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.addListener(new MemoryPreviewToEditorTransitionHelper$2$a(p0));
       Animator[] uAnimatorArr = new Animator[]{objectAnimat1,objectAnimat};
       uAnimatorSet.playTogether(uAnimatorArr);
       return uAnimatorSet;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
