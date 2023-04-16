package com.kuaishou.live.common.core.component.gift.b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.gift.d;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class b extends AnimatorListenerAdapter	// class@001141
{
    public final GiftAnimContainerView$j a;
    public final d b;

    public void b(d p0,GiftAnimContainerView$j p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       d b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          ta.a();
       }
       b = this.b.b;
       if (b != null) {
          b.setVisibility(8);
       }
       return;
    }
}
