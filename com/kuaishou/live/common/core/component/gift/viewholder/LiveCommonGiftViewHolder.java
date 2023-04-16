package com.kuaishou.live.common.core.component.gift.viewholder.LiveCommonGiftViewHolder;
import sm1.g;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import z1.k;
import com.kuaishou.live.common.core.component.gift.viewholder.LiveCommonGiftViewHolder$1;
import java.lang.Object;
import rl1.a;
import xz6.e;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftItemLabelView;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kuaishou.live.external.invoke.deserializer.gift.GiftPanelItemViewData;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftItemLeftTagData;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import ah1.a;
import sl1.a;
import java.util.List;
import rm1.f;
import rl1.j;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIMarkLabel;
import java.util.Objects;
import rl1.j$a;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIStaticTextLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIText;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIBackground;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImageLabel;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIImage;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIDynamicTextLabel;

public class LiveCommonGiftViewHolder extends g	// class@00132f
{
    public TextView h;
    public TextView i;
    public KwaiImageView j;
    public View k;
    public LiveGiftItemLabelView l;
    public GiftPanelItem m;
    public LifecycleOwner n;
    public a o;
    public final Model$a p;

    public void LiveCommonGiftViewHolder(View p0,LifecycleOwner p1,k p2){
       super(p0);
       this.p = new LiveCommonGiftViewHolder$1(this);
       this.n = p1;
       if (p2 != null) {
          this.o = p2.get();
       }
       this.h = this.a(0x7f0a1d4d);
       this.i = this.a(0x7f0a1d4e);
       this.j = this.a(0x7f0a1d49);
       this.k = this.a(0x7f0a1d28);
       this.l = this.a(0x7f0a1d4a);
       return;
    }
    public void c(int p0,GiftPanelItem p1,boolean p2){
       Gift gift;
       LiveCommonGiftViewHolder liveCommonGi = LiveCommonGiftViewHolder.class;
       if (PatchProxy.isSupport(liveCommonGi) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, LiveCommonGiftViewHolder.class, "1")) {
          return;
       }
       LiveCommonGiftViewHolder liveCommonGi1 = (p1.mItemType == 2 || p1.isEnableJumpByLink())? 1: null;
       LiveCommonGiftViewHolder tk = this.k;
       if (tk != null) {
          if (!liveCommonGi1) {
             tk.setBackground(a1.f(R.drawable.arg_RES_7f080354));
          }else {
             tk.setBackgroundColor(0);
          }
       }
       GiftPanelItemViewData giftPanelIte = this.h(p1);
       if (giftPanelIte == null) {
          return;
       }else {
          this.h.setText(giftPanelIte.mName);
          this.i.setText(giftPanelIte.mDescription);
          RelativeLayout$LayoutParams layoutParams = this.h.getLayoutParams();
          Application uApplication = a.a().a();
          float f = (p2)? 0x3f800000: 5.00f;
          layoutParams.setMargins(0, n.c(uApplication, f), 0, 0);
          this.h.requestLayout();
          LiveGiftItemLeftTagData liveGiftItem = LiveGiftItemLeftTagData.parse(giftPanelIte);
          if (liveCommonGi1) {
             liveGiftItem.mShouldGoneOnSelected = false;
          }
          this.e(liveGiftItem);
          this.f(p1, giftPanelIte);
          this.h.setTag(giftPanelIte.mName);
          liveCommonGi1 = this.m;
          if (!PatchProxy.applyVoidTwoRefs(liveCommonGi1, p1, this, liveCommonGi, "2") && this.o != null) {
             if (liveCommonGi1 != null && liveCommonGi1.mCanGiftNaming != null) {
                gift = liveCommonGi1.getGift();
                if (gift != null) {
                   this.o.d(Integer.valueOf(gift.mId), this.p);
                }
             }
             if (p1.mCanGiftNaming != null) {
                gift = p1.getGift();
                if (gift != null) {
                   this.g(this.o.f(gift.mId));
                   LiveCommonGiftViewHolder tn = this.n;
                   if (tn != null) {
                      this.o.b(tn, Integer.valueOf(gift.mId), this.p);
                   }
                }
             }else {
                this.l.b();
             }
          }
       label_00e3 :
          this.m = p1;
          return;
       }
    }
    public void f(GiftPanelItem p0,GiftPanelItemViewData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveCommonGiftViewHolder.class, "4")) {
          return;
       }
       LiveCommonGiftViewHolder tj = this.j;
       if (tj != null) {
          f.a(tj, p1.mPicUrls);
       }
       return;
    }
    public void g(a p0){
       UserInfo userInfo;
       List list;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveCommonGiftViewHolder.class, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj2 = null;
       j$a obj3 = PatchProxy.applyOneRefs(obj1, obj2, j.class, "4");
       if (obj3 != patchProxyRe) {
       }else {
          obj3 = j.a;
          Objects.requireNonNull(obj3);
          Object obj4 = PatchProxy.applyOneRefs(obj1, obj3, j$a.class, "5");
          if (obj4 != patchProxyRe) {
             obj2 = obj4;
          }else if(obj1 != null){
             userInfo = p0.c();
          }else {
             userInfo = obj2;
          }
          if (userInfo != null) {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if ((qCurrentUser.getId()).equals(p0.c().mId)) {
                userInfo = p0.c().mHeadUrls;
                UIText uIText = new UIText(0, 0, "¹ÚÃû", "#ffffff", 3, null);
                int i = 2;
                UIStaticTextLabel uIStaticText = new UIStaticTextLabel(v5, obj2, i, obj2);
                int i1 = 0;
                if (userInfo != null) {
                   list = ArraysKt___ArraysKt.uy(userInfo);
                   if (list != null) {
                   label_008b :
                      UIImage uIImage = new UIImage(list, 0, false, 6, null);
                      UIMarkLabel uIMarkLabel = new UIMarkLabel(3, 0, uIStaticText, i1, new UIImageLabel(v5, 0, i, obj2), 10, null);
                      obj2 = obj4;
                   }
                }
                list = CollectionsKt__CollectionsKt.E();
                goto label_008b ;
             }
          }
          obj4 = obj2;
       }
       if (obj1 != null && obj3 != null) {
          obj.l.a(obj3);
       }else {
          obj.l.b();
       }
       return;
    }
    public GiftPanelItemViewData h(GiftPanelItem p0){
       return p0.mGiftPanelItemViewData;
    }
}
