package com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController;
import java.util.List;
import android.animation.AnimatorSet;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import fd3.d;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet$Builder;

public final class LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$1 extends Lambda implements l	// class@000b2c
{
    public final AnimatorSet $animator$inlined;
    public final List $recoverActions$inlined;
    public final LiteSideBarReplaceAnimController this$0;

    public void LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$1(LiteSideBarReplaceAnimController p0,List p1,AnimatorSet p2){
       this.this$0 = p0;
       this.$recoverActions$inlined = p1;
       this.$animator$inlined = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "view");
       LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$1 t$animator$i = this.$animator$inlined;
       LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(p0, tthis$0, LiteSideBarReplaceAnimController.class, "9");
       if (uAnimatorSet != PatchProxyResult.class) {
       }else {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f000000,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f000000,0x3f800000})};
          ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
          objectAnimat.setInterpolator(new DecelerateInterpolator());
          a.o(objectAnimat, "ObjectAnimator.ofPropert¡­eInterpolator\(\)\n        }");
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0,0x3f800000});
          objectAnimat1.setInterpolator(new LinearInterpolator());
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          uAnimatorSet1.setDuration(300);
          uAnimatorSet1.setStartDelay(100);
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
          uAnimatorSet1.playTogether(uAnimatorArr);
          uAnimatorSet1.addListener(new d(objectAnimat, objectAnimat1, p0));
          uAnimatorSet = uAnimatorSet1;
       }
       t$animator$i.play(uAnimatorSet);
       PatchProxy.onMethodExit(LiteSideBarReplaceAnimController$prepareAppearAnimation$$inlined$with$lambda$1.class, "1");
       return;
    }
}
