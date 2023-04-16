package gn2.k;
import msd.a;
import gn2.l;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.Objects;
import k51.a;
import android.view.View;
import k51.b;
import com.kuaishou.live.core.show.wishlight.spring.view.LiveBottomBarWishLightGiftView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import android.view.ViewParent;
import android.app.Activity;
import com.yxcorp.utility.n;
import d61.h;
import com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftComboAnimationView;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.gift.LiveGiftResourcePathConstant;
import l12.d;
import va1.f0;

public final class k implements a	// class@002b57
{
    public final l b;
    public final Context c;
    public final ViewGroup d;

    public void k(l p0,Context p1,ViewGroup p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object invoke(){
       k tb = this.b;
       k td = this.d;
       Objects.requireNonNull(tb);
       LiveBottomBarWishLightGiftView liveBottomBa = b.f(this.c, R.layout.live_audience_bottom_bar_wish_light_gift_entry_layout_container, td, false, a.c());
       tb.m = liveBottomBa;
       Objects.requireNonNull(liveBottomBa);
       if (PatchProxy.applyVoidOneRefs(td, liveBottomBa, LiveBottomBarWishLightGiftView.class, "6")) {
       }else {
          b.P(liveBottomBa.getLogTag(), "initComboView");
          List list = null;
          while (td instanceof View) {
             k ok = td;
             if (ok.getId() == 0x7f0a22df) {
                list = ok;
                break ;
             }
             td = td.getParent();
          }
          int i = 0x7f0a1ac4;
          if (list == null) {
             b.P(liveBottomBa.getLogTag(), "do activity findView logic");
             liveBottomBa.e = h.f(n.d(liveBottomBa).findViewById(0x1020002), 0x7f0a1ac5, i);
          }else {
             b.P(liveBottomBa.getLogTag(), "fragmentRootView findView logic");
             liveBottomBa.e = h.f(list, 0x7f0a1ac5, i);
          }
          LiveBottomBarWishLightGiftView e = liveBottomBa.e;
          if (e == null) {
             b.P(liveBottomBa.getLogTag(), "mLiveGiftComboAnimationView == null");
          }else {
             KwaiImageView kwaiImageVie = e.findViewById(R.id.live_gift_box_combo_button_count_down_view);
             liveBottomBa.d = kwaiImageVie;
             if (kwaiImageVie != null) {
                f0.a(kwaiImageVie, LiveGiftResourcePathConstant.LIVE_GIFT_COMBO_BUTTON_ICON);
             }
             liveBottomBa.e.setVisibility(4);
          }
       }
       return tb.m;
    }
}
