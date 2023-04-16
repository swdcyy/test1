package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$h;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$k;
import android.animation.AnimatorSet;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class GiftAnimContainerView$h extends AnimatorListenerAdapter	// class@001120
{
    public final GiftAnimContainerView$k a;
    public final AnimatorSet b;
    public final GiftAnimContainerView$j c;
    public final GiftAnimContainerView d;

    public void GiftAnimContainerView$h(GiftAnimContainerView p0,GiftAnimContainerView$k p1,AnimatorSet p2,GiftAnimContainerView$j p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView$h.class, "1")) {
          return;
       }
       GiftAnimContainerView$h ta = this.a;
       if (ta.c == this.b) {
          ta.c = null;
       }
       ta = this.c;
       if (ta != null) {
          ta.a();
       }
       return;
    }
}
