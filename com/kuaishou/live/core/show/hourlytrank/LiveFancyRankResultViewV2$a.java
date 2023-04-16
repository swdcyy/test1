package com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;

public class LiveFancyRankResultViewV2$a implements ValueAnimator$AnimatorUpdateListener	// class@000bec
{
    public final View a;
    public final LiveFancyRankResultViewV2 b;

    public void LiveFancyRankResultViewV2$a(LiveFancyRankResultViewV2 p0,View p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFancyRankResultViewV2$a.class, "1")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
       layoutParams.height = p0.getAnimatedValue().intValue();
       this.a.setLayoutParams(layoutParams);
       return;
    }
}
