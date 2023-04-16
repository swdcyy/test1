package com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$e;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$l;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import android.widget.RelativeLayout;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$k;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$e$a;
import java.lang.Runnable;
import android.widget.LinearLayout;
import android.view.View;
import x43.c;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import b61.b;

public class GiftAnimContainerView$e implements Animation$AnimationListener	// class@00111d
{
    public final GiftAnimItemView b;
    public final GiftAnimContainerView$l c;
    public final GiftAnimContainerView$j d;
    public final GiftAnimContainerView e;

    public void GiftAnimContainerView$e(GiftAnimContainerView p0,GiftAnimItemView p1,GiftAnimContainerView$l p2,GiftAnimContainerView$j p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView$e.class, "2")) {
          return;
       }
       b.c0(LiveLogTag.GIFT, "ComboAnimState cancelSlotAnimationOnEnd animateToDisplay", "animation", this.b.getAnimation());
       this.e.i(this.b, p0);
       GiftAnimContainerView$e tc = this.c;
       if (tc.b == tc.c) {
          this.e.m(this.b).d();
          if (this.e.h(this.c)) {
             this.e.b(this.c, this.b, this.d);
          }else {
             this.d.a();
          }
          return;
       }else {
          this.e.postDelayed(new GiftAnimContainerView$e$a(this), 500);
          return;
       }
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, GiftAnimContainerView$e.class, "1")) {
          return;
       }
       GiftAnimContainerView$e te = this.e;
       GiftAnimContainerView d = te.d;
       if (d != null) {
          GiftAnimContainerView$e tb = this.b;
          b = (tb == te.i)? true: false;
          d.a(tb, b);
       }
       b.c0(LiveLogTag.GIFT, "onDisplayGift", "gift.user", b.c(this.c.a.mUser));
       return;
    }
}
