package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$f;
import ekd.f$i;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$l;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import android.widget.RelativeLayout;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import x43.c;

public class GiftAnimContainerView$f extends f$i	// class@00111e
{
    public final GiftAnimItemView b;
    public final GiftAnimContainerView$l c;
    public final GiftAnimContainerView$j d;
    public final GiftAnimContainerView e;

    public void GiftAnimContainerView$f(GiftAnimContainerView p0,GiftAnimItemView p1,GiftAnimContainerView$l p2,GiftAnimContainerView$j p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView$f.class, "2")) {
          return;
       }
       b.c0(LiveLogTag.GIFT, "ComboAnimState cancelSlotAnimationOnEnd animateToDisplayAfterReplace", "animation", this.b.getAnimation());
       this.e.i(this.b, p0);
       this.b.r();
       this.e.f(this.b, this.c, this.d, 0);
       return;
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView$f.class, "1")) {
          return;
       }
       GiftAnimContainerView$f te = this.e;
       GiftAnimContainerView d = te.d;
       if (d != null) {
          GiftAnimContainerView$f tb = this.b;
          boolean b = (tb == te.i)? true: false;
          d.b(tb, b);
       }
       return;
    }
}
