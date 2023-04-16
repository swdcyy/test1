package al1.c$a;
import ol1.p;
import al1.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ViewFlipper;
import java.util.HashSet;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import ol1.n;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import al1.j;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintItem;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftHonorNamingView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintDisplayInfo;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintExtInfo;
import android.view.ViewGroup;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintGiftNaming;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.basic.widget.GreyscaleImageView;
import b61.b;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import rm1.e;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftHonorNamingView$a;
import al1.b;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import al1.c$b;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHint;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import java.lang.Boolean;

public class c$a implements p	// class@0000c8
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "3")) {
          return;
       }
       this.a.s.stopFlipping();
       this.a.s.removeAllViews();
       this.a.s.setVisibility(8);
       this.a.s.setTranslationY(0);
       this.a.t.clear();
       return;
    }
    public n b(GiftTab p0,GiftPanelItem p1){
       LiveGiftItemHintDisplayInfo mGiftNaming;
       LiveGiftItemHintGiftNaming liveGiftItem1;
       boolean b;
       Object obj = this;
       Object obj1 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "2";
       List obj2 = PatchProxy.applyTwoRefs(p0, obj1, obj, c$a.class, str);
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       n on = null;
       if (!obj.c(obj1)) {
          this.a();
          return on;
       }else {
          obj.a.t.clear();
          obj2 = j.a(p1);
          if (q.f(obj2)) {
             this.a();
             return on;
          }else {
             obj.a.s.stopFlipping();
             obj.a.s.removeAllViews();
             int i = 0;
             obj.a.s.setVisibility(i);
             Iterator iterator = obj2.iterator();
             int i1 = 1;
             while (iterator.hasNext()) {
                LiveGiftItemHintItem liveGiftItem = iterator.next();
                c$a a = obj.a;
                Objects.requireNonNull(a);
                c uoc = c.class;
                LiveGiftHonorNamingView liveGiftHono = PatchProxy.applyTwoRefs(obj1, liveGiftItem, a, uoc, "8");
                if (liveGiftHono != patchProxyRe) {
                }else {
                   liveGiftHono = new LiveGiftHonorNamingView(a.getContext());
                   if (!PatchProxy.applyVoidOneRefs(liveGiftItem, liveGiftHono, LiveGiftHonorNamingView.class, str)) {
                      liveGiftHono.b = liveGiftItem;
                      LiveGiftItemHintItem mDisplayInfo = liveGiftItem.mDisplayInfo;
                      if (mDisplayInfo == null || mDisplayInfo.mGiftNaming == null) {
                         b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftHonorNamingView][bindData\(\)][logTraceInfo] displayInfo == null || displayInfo.mGiftNaming == null");
                      }else {
                         LiveGiftItemHintItem mExtInfo = liveGiftItem.mExtInfo;
                         if (mExtInfo != null && mExtInfo.activityTitleGift != null) {
                            liveGiftHono.h.setBackgroundResource(R.drawable.arg_RES_7f0811ec);
                         }else {
                            liveGiftHono.h.setBackgroundResource(R.drawable.arg_RES_7f0811eb);
                         }
                         liveGiftHono.c = mDisplayInfo;
                         LiveGiftItemHintGiftNaming mUserInfo = mDisplayInfo.mGiftNaming.mUserInfo;
                         if (mUserInfo != null) {
                            liveGiftHono.e.p0(mUserInfo, HeadImageSize.ADJUST_MIDDLE, i);
                            liveGiftHono.f.setText(b.c(mUserInfo));
                         }
                         LiveGiftHonorNamingView g = liveGiftHono.g;
                         mGiftNaming = mDisplayInfo.mGiftNaming;
                         LiveGiftItemHintGiftNaming mTitleImageU = mGiftNaming.mTitleImageUrls;
                         int i2 = a1.e((float)mGiftNaming.mTitleWidth);
                         int i3 = a1.e((float)mDisplayInfo.mGiftNaming.mTitleHeight);
                         if (PatchProxy.isSupport(e.class)) {
                            liveGiftItem1 = mTitleImageU;
                            if (!PatchProxy.applyVoidFourRefs(g, liveGiftItem1, Integer.valueOf(i2), Integer.valueOf(i3), null, e.class, "1")) {
                            }
                         }else {
                            liveGiftItem1 = mTitleImageU;
                         }
                      }
                   }
                   Gift gift = p1.getGift();
                   b uob = PatchProxy.applyOneRefs(gift, a, uoc, "9");
                   if (uob != patchProxyRe) {
                   }else {
                      uob = new b(a, gift);
                   }
                   liveGiftHono.setOnLiveGiftHonorNamingViewClickListener(uob);
                }
                FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                layoutParams.gravity = 0x800005;
                liveGiftHono.setLayoutParams(layoutParams);
                liveGiftHono.setTag(new c$b(obj.a.W8(liveGiftItem), obj1, liveGiftItem));
                obj.a.s.addView(liveGiftHono);
                if (i1) {
                   obj.a.P8(liveGiftHono);
                   i1 = 0;
                }
             }
             b = true;
             if (obj2.size() > b) {
                obj.a.s.setAutoStart(b);
                obj.a.s.setFlipInterval(obj1.mItemHint.mNoticeIntervalMillis);
                obj.a.s.startFlipping();
             }else {
                obj.a.s.setAutoStart(i);
                obj.a.s.stopFlipping();
             }
             n on1 = new n(obj.a.s, a1.e(12.00f), a1.e(12.00f), a1.e(12.00f), a1.e(12.00f));
             return obj1;
          }
       }
    }
    public boolean c(GiftPanelItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          GiftPanelItem mItemHint = p0.mItemHint;
          if (mItemHint != null && !q.f(mItemHint.mHints)) {
             if (q.f(j.a(p0))) {
                return false;
             }else {
                return true;
             }
          }
       }
       return false;
    }
}
