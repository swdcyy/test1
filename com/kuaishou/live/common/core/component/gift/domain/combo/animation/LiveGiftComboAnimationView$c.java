package com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView$c;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils;
import com.kuaishou.live.common.core.component.gift.domain.combo.util.LiveGiftComboButtonAnimationUtils$a;
import ph1.i;
import com.yxcorp.gifshow.image.KwaiImageView;
import msd.l;
import com.kuaishou.live.common.core.basic.tools.l;
import android.animation.Animator;
import android.view.View;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.AnimatorSet$Builder;
import android.animation.Animator$AnimatorListener;

public class LiveGiftComboAnimationView$c implements Runnable	// class@001175
{
    public final LiveGiftComboAnimationView b;

    public void LiveGiftComboAnimationView$c(LiveGiftComboAnimationView p0){
       this.b = p0;
       super();
    }
    public void run(){
       PropertyValuesHolder[] propertyValu;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveGiftComboAnimationView$c.class, "1")) {
          return;
       }
       LiveGiftComboAnimationView$c tb = this.b;
       boolean b = true;
       tb.E = b;
       Objects.requireNonNull(tb);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoid(objArray, tb, LiveGiftComboAnimationView.class, "37") || (tb.u == null || (tb.D != null && tb.A != null))) {
          tb.o();
          int i = 0;
          tb.u.setVisibility(i);
          l.b(tb.u, LiveGiftComboButtonAnimationUtils.h.a("live_gift_combo_accumulate_anim"), i, objArray, new i(tb));
          tb.A.setVisibility(i);
          if (tb.v == null) {
             ObjectAnimator objectAnimat = PatchProxy.apply(objArray, tb, LiveGiftComboAnimationView.class, "39");
             int i1 = 2;
             if (objectAnimat != patchProxyRe) {
             }else {
                propertyValu = new PropertyValuesHolder[i1];
                propertyValu[i] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i1]{0x3f800000,0x3f4ccccd});
                propertyValu[b] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i1]{0x3f800000,0x3f4ccccd});
                objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tb.D, propertyValu);
                objectAnimat.setDuration(5000);
             }
             AnimatorSet uAnimatorSet = PatchProxy.apply(objArray, tb, LiveGiftComboAnimationView.class, "38");
             if (uAnimatorSet != patchProxyRe) {
             }else {
                uAnimatorSet = new AnimatorSet();
                propertyValu = new PropertyValuesHolder[i1];
                propertyValu[i] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i1]{0,0x3f99999a});
                propertyValu[b] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i1]{0,0x3f99999a});
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(tb.A, propertyValu);
                objectAnimat1.setDuration(560);
                objectAnimat1.setRepeatCount(-1);
                objectAnimat1.setInterpolator(new LinearInterpolator());
                ObjectAnimator objectAnimat2 = j.a(tb.A, new float[i1]{0x3f800000,0});
                objectAnimat2.setDuration(560);
                objectAnimat2.setRepeatCount(-1);
                uAnimatorSet.play(objectAnimat2).with(objectAnimat1);
             }
             AnimatorSet uAnimatorSet1 = new AnimatorSet();
             tb.v = uAnimatorSet1;
             uAnimatorSet1.play(objectAnimat).with(uAnimatorSet);
          }
          tb.v.start();
       }
    label_00f9 :
       LiveGiftComboAnimationView$c tb1 = this.b;
       if (tb1.r != null) {
          tb1.i(1200, false, -1, true, null);
       }
       return;
    }
}
