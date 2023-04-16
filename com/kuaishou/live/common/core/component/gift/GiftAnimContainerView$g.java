package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$g;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$k;
import android.animation.AnimatorSet;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class GiftAnimContainerView$g extends AnimatorListenerAdapter	// class@00111f
{
    public final GiftAnimContainerView$j a;
    public final GiftAnimContainerView$k b;
    public final AnimatorSet c;
    public final GiftAnimContainerView d;

    public void GiftAnimContainerView$g(GiftAnimContainerView p0,GiftAnimContainerView$j p1,GiftAnimContainerView$k p2,AnimatorSet p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView$g.class, "1")) {
          return;
       }
       b.c0(LiveLogTag.GIFT, "ComboAnimState animateComboInternal onAnimationEnd", "callback", this.a);
       GiftAnimContainerView$g tb = this.b;
       if (tb.c == this.c) {
          tb.c = null;
       }
       tb = this.a;
       if (tb != null) {
          tb.a();
       }
       return;
    }
}
