package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;

public class LiveAudienceGiftBoxHandleView$b implements ValueAnimator$AnimatorUpdateListener	// class@000b40
{
    public final int a;
    public final LiveAudienceGiftBoxHandleView b;

    public void LiveAudienceGiftBoxHandleView$b(LiveAudienceGiftBoxHandleView p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceGiftBoxHandleView$b.class, "1")) {
          return;
       }
       float f = p0.getAnimatedValue().floatValue();
       LiveAudienceGiftBoxHandleView$b ta = this.a;
       this.b.c.getLayoutParams().width = (int)((float)ta * f);
       this.b.c.setTranslationX((((f - 0x3f800000) * 0x3f000000) * (float)ta));
       this.b.c.requestLayout();
       return;
    }
}