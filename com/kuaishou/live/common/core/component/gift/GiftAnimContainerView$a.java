package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$a;
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

public class GiftAnimContainerView$a extends AnimatorListenerAdapter	// class@001118
{
    public final boolean a;
    public final GiftAnimContainerView$k b;
    public final AnimatorSet c;
    public final GiftAnimContainerView$j d;
    public final GiftAnimContainerView e;

    public void GiftAnimContainerView$a(GiftAnimContainerView p0,boolean p1,GiftAnimContainerView$k p2,AnimatorSet p3,GiftAnimContainerView$j p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView$a.class, "1")) {
          return;
       }
       if (this.a != null) {
          GiftAnimContainerView$a tb = this.b;
          if (tb.c == this.c) {
             tb.c = null;
          }
          tb = this.d;
          if (tb != null) {
             tb.a();
          }
       }
       return;
    }
}
