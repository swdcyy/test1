package com.kuaishou.live.common.core.component.gift.e;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView;
import com.kuaishou.live.common.core.component.gift.GiftAnimItemView;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import android.widget.RelativeLayout;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import x43.c;

public class e implements Animation$AnimationListener	// class@00127f
{
    public final GiftAnimItemView b;
    public final GiftAnimContainerView$j c;
    public final GiftAnimContainerView d;

    public void e(GiftAnimContainerView p0,GiftAnimItemView p1,GiftAnimContainerView$j p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animation p0){
       GiftAnimItemView e;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       LiveLogTag gIFT = LiveLogTag.GIFT;
       Animation animation = this.b.getAnimation();
       e = this.b.E;
       QLiveMessage mUser = (e != null)? e.mUser: null;
       b.d0(gIFT, "onDisappearGift cancelSlotAnimationOnEnd animateToDisappear", "animation", animation, "gift", b.c(mUser));
       this.d.v(this.b);
       this.b.l();
       this.d.i(this.b, p0);
       this.c.a();
       e td = this.d;
       GiftAnimContainerView d = td.d;
       if (d != null) {
          e tb = this.b;
          b = (tb == td.i)? true: false;
          d.c(tb, b);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       e td = this.d;
       GiftAnimContainerView d = td.d;
       if (d != null) {
          e tb = this.b;
          boolean b = (tb == td.i)? true: false;
          d.b(tb, b);
       }
       return;
    }
}
