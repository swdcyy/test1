package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f;
import im8.g;
import k51.c;
import java.util.HashSet;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f$b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ql1.c;
import ol1.a;
import jk1.f;
import lp3.c;
import lp3.e;
import jk1.c;
import kz0.c;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import p91.m;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kz0.j;
import ok.x;
import xp5.g;
import brd.t;
import cjd.e;
import erd.o;
import kz0.d;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Set;
import java.util.Collection;
import ekd.q;
import java.util.List;
import android.view.View;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import kz0.h;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.u1;
import android.widget.ViewFlipper;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHint;
import ol1.p;
import java.util.Iterator;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.LiveGiftActivityBannerItem;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintDisplayInfo;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintPictureInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.a;
import com.kuaishou.live.external.invoke.deserializer.gift.LiveGiftItemHintActionInfo;
import android.view.View$OnClickListener;
import android.view.animation.Animation;
import kz0.b;
import kz0.g;
import java.util.Map;
import java.util.HashMap;

public class f extends c implements g	// class@000b32
{
    public c A;
    public p B;
    public p C;
    public a D;
    public c E;
    public m p;
    public e q;
    public Set r;
    public LiveViewFlipper s;
    public View t;
    public int u;
    public List v;
    public KwaiDialogFragment w;
    public boolean x;
    public Animation y;
    public Animation z;
    public static String sLivePresenterClassName = "LiveAudienceGiftActivityBannerPresenter";

    public void f(){
       super();
       this.r = new HashSet();
       this.x = false;
       this.A = new f$a(this);
       this.C = new f$b(this);
       this.E = new f$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.D.e(this.E);
       this.q.a(f.class).fl(this.A);
       f ts = this.s;
       if (ts != null) {
          ts.a(new c(this));
       }
       if (k0.c(this.p.r5().mEntity, b.a, c.a, d.a).or(Boolean.FALSE).booleanValue()) {
          b.Z(LiveLogTag.GIFT, "disableGiftActivityBanner");
          return;
       }else {
          this.X7(j.a.get().a(this.q.a(g.class).getLiveStreamId()).map(new e()).subscribe(new d(this), e.b));
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.D.g(this.E);
       this.r.clear();
       this.x = false;
       this.R8();
       if (!q.f(this.v)) {
          this.v.clear();
       }
       this.q.a(f.class).ii(this.A);
       return;
    }
    public final void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "11")) {
          return;
       }
       if (p0 != null && p0.getTag() instanceof String) {
          String tag = p0.getTag();
          if (this.r.contains(tag)) {
             return;
          }else {
             this.r.add(tag);
             ClientContent$LiveStreamPackage liveStreamPa = this.q.a(i.class).a();
             if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, tag, null, h.class, "1")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "ACTIVE_GIFT_ICON";
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                uContentPack.liveStreamPackage = liveStreamPa;
                ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
                uContentPack.moreInfoPackage = moreInfoPack;
                moreInfoPack.id = tag;
                u1.u0(9, uElementPack, uContentPack);
             }
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       f ts = this.s;
       if (ts != null && !ts.getVisibility()) {
          this.s.stopFlipping();
          this.s.removeAllViews();
          this.s.setVisibility(8);
          this.t.setVisibility(8);
       }
       return;
    }
    public void S8(boolean p0){
       LiveGiftActivityBannerItem liveGiftActi;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "6")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       GiftPanelItem giftPanelIte = this.D.a();
       boolean b = (!p0 && (giftPanelIte != null && (giftPanelIte.getGift() != null && giftPanelIte.getGift().isMagicBoxGift())))? true: false;
       int i = (!p0 && (giftPanelIte != null && (giftPanelIte.getGift() != null && giftPanelIte.getGift().mDrawable != null)))? 1: 0;
       if (!p0 && giftPanelIte != null) {
          GiftPanelItem mItemHint = giftPanelIte.mItemHint;
          if (mItemHint != null && !q.f(mItemHint.mHints)) {
             liveGiftActi = 1;
          label_0061 :
             int i1 = (!p0 && (giftPanelIte == null || giftPanelIte.getGift() == null))? 1: 0;
             f uof1 = (!q.f(this.v) && (!b && (!i && (liveGiftActi || i1))))? 1: null;
             if (uof1) {
                this.R8();
                return;
             }else {
                uof1 = this.B;
                if (uof1 != null) {
                   uof1.a();
                }
                if (!this.s.getVisibility() && this.s.getChildCount()) {
                   return;
                }else {
                   this.s.removeAllViews();
                   Iterator iterator = this.v.iterator();
                   uof = 1;
                   View view = null;
                   while (iterator.hasNext()) {
                      LiveGiftActivityBannerItem liveGiftActi1 = iterator.next();
                      LiveGiftActivityBannerItem mDescription = liveGiftActi1.mDescription;
                      LiveGiftItemHintDisplayInfo mPictureInfo = liveGiftActi1.mDisplayInfo.mPictureInfo;
                      liveGiftActi1 = liveGiftActi1.mActionInfo;
                      FrameLayout$LayoutParams obj = PatchProxy.applyThreeRefs(mDescription, mPictureInfo, liveGiftActi1, this, f.class, "9");
                      if (obj != PatchProxyResult.class) {
                         view = obj;
                      }else if(mPictureInfo == null || q.f(mPictureInfo.mPictureUrls)){
                         view = new KwaiImageView(this.getContext());
                         obj = new FrameLayout$LayoutParams(a1.e((float)mPictureInfo.mWidth), a1.e((float)mPictureInfo.mHeight));
                         obj.gravity = 0x800005;
                         view.setLayoutParams(obj);
                         view.P(mPictureInfo.mPictureUrls);
                         if (liveGiftActi1 != null) {
                            view.setOnClickListener(new a(this, mDescription, liveGiftActi1));
                         }
                         view.setTag(mDescription);
                      }
                      if (view == null) {
                         continue ;
                      }else if(uof){
                         this.P8(view);
                         uof = null;
                      }
                      this.s.addView(view);
                   }
                   if (this.s.getChildCount()) {
                      this.s.setVisibility(0);
                      this.t.setVisibility(0);
                      this.x = false;
                   }
                   if (this.v.size() > 1) {
                      this.s.setFlipInterval(this.u);
                      this.s.setInAnimation(view);
                      this.s.setOutAnimation(view);
                      this.s.startFlipping();
                   }else {
                      this.s.stopFlipping();
                   }
                   return;
                }
             }
          }
       }
       liveGiftActi = null;
       goto label_0061 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a1d01);
       p0 = p0.findViewById(R.id.live_gift_activity_banner_close_image);
       this.t = p0;
       p0.setOnClickListener(new b(this));
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(f.class, new g());
       }else {
          obj.put(f.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.q = this.r8("LIVE_SERVICE_MANAGER");
       this.D = this.r8("LIVE_GIFT_PANE_RIGHT_TOP_BANNER_SERVICE");
       this.B = this.t8("LIVE_GIFT_PANE_RIGHT_TOP_BANNER_GIFT_HINT_ENTRY");
       this.p = this.q8(m.class);
       return;
    }
}
