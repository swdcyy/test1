package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e;
import th2.d;
import android.view.ViewGroup;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c$b;
import th2.r;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import ph2.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainGrabResult;
import android.graphics.Color;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource;
import uh2.r;
import lnc.a1;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource$RedPackRainButton;
import com.yxcorp.gifshow.model.CDNUrl;
import ekd.j;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import java.util.Collection;
import ekd.q;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ih2.n;
import d61.h;
import java.util.List;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackPrize;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainMerchantCouponInfo;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.Boolean;
import com.yxcorp.utility.f;
import brd.t;
import th2.j;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import android.text.SpannableString;
import com.yxcorp.gifshow.util.span.CustomTypefaceSpan;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import th2.i;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import android.net.Uri;
import d61.c0;
import java.util.ArrayList;
import d71.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e$a;
import ub.b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e$b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e$c;
import java.lang.Integer;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e$d;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e$e;

public class e extends d	// class@000f28
{
    public final r c;
    public KwaiImageView d;
    public KwaiImageView e;
    public KwaiImageView f;
    public KwaiImageView g;
    public View h;
    public View i;
    public KwaiImageView j;
    public TextView k;
    public View l;
    public View m;
    public TextView n;
    public View o;
    public TextView p;
    public c$b q;
    public int r;
    public b s;
    public AnimatorSet t;
    public boolean u;

    public void e(ViewGroup p0,c$b p1){
       String str1;
       ClientEvent$ElementPackage uElementPack;
       View view1;
       TextView textView;
       String str2;
       View view3;
       String str3;
       e uoe1;
       int i2;
       boolean b;
       int i3;
       LiveRedPackRainResource mGrabResultK;
       r or = this;
       super(p0);
       r or1 = new r();
       or.c = or1;
       or.q = p1;
       View view = this.b();
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(view, or, uoe, "1")) {
       }else if(view == null){
          or.d = m1.f(view, 0x7f0a24b0);
          or.e = m1.f(view, 0x7f0a24d5);
          or.f = m1.f(view, 0x7f0a24b1);
          or.g = m1.f(view, 0x7f0a24c7);
          or.h = m1.f(view, 0x7f0a24b4);
          or.i = m1.f(view, 0x7f0a24b3);
          or.j = m1.f(view, 0x7f0a24c0);
          or.k = m1.f(view, 0x7f0a24cd);
          or.o = m1.f(view, 0x7f0a24c8);
          or.n = m1.f(view, 0x7f0a24c5);
          or.p = m1.f(view, 0x7f0a247a);
          or.o.setAlpha(0);
          or.p.setAlpha(0);
          or.i.setAlpha(0);
          int i = 0;
          or.h.measure(i, i);
          e h = or.h;
          h.setPivotX((float)(h.getMeasuredWidth() / 2));
          h = or.h;
          h.setPivotY((float)h.getMeasuredHeight());
          or.h.setScaleY(0x3f733333);
          float f = 0x3f666666;
          or.o.setScaleX(f);
          or.o.setScaleY(f);
          a uoa = or.q.i();
          if (uoa != null) {
             LiveRedPackRainGrabResult liveRedPackR = or.q.m();
             a m = uoa.m;
             LiveRedPackRainResource$RedPackRainButton redPackRainB = null;
             if (!PatchProxy.applyVoidTwoRefs(liveRedPackR, m, or, uoe, "2")) {
                if (!PatchProxy.applyVoidOneRefs(m, or, uoe, "3")) {
                   String str4 = "#F72B2B";
                   if (m == null) {
                      or.r = Color.parseColor(str4);
                   }else {
                      mGrabResultK = m.mGrabResultTextColor;
                      or.r = (mGrabResultK != null)? r.d(mGrabResultK, Color.parseColor(str4)): Color.parseColor(str4);
                   }
                   or.k.setTextColor(or.r);
                }
                if (liveRedPackR != null && liveRedPackR.mIsKoi != null) {
                   if (!PatchProxy.applyVoidOneRefs(m, or, uoe, "5")) {
                      i3 = 0x7f061dbb;
                      i2 = 0x7f0606da;
                      if (m == null) {
                         or.k(1);
                         or.j(redPackRainB, 1, a1.a(i2));
                         or.p.setTextColor(a1.a(i3));
                      }else {
                         or.i(m.mGrabResultKoiBackgroundImage, m.mGrabResultKoiCardImage, m.mGrabResultKoiCoverBottomImage, 1);
                         or.j(m.mGrabResultKoiReceiveButton, 1, a1.a(i2));
                         mGrabResultK = m.mGrabResultKoiSummaryTextColor;
                         if (mGrabResultK != null) {
                            or.p.setTextColor(r.d(mGrabResultK, a1.a(i3)));
                         }
                         if (!j.h(m.mGrabResultKoiImage)) {
                            or.j.U(m.mGrabResultKoiImage);
                         }
                      }
                   }
                }else if(PatchProxy.applyVoidOneRefs(m, or, uoe, "4")){
                   i3 = 0x7f061e26;
                   str2 = "#FFFCFC";
                   if (m == null) {
                      or.k(i);
                      or.j(redPackRainB, i, Color.parseColor(str2));
                      or.p.setTextColor(a1.a(i3));
                   }else {
                      or.i(m.mGrabResultBackgroundImage, m.mGrabResultCardImage, m.mGrabResultCoverBottomImage, i);
                      or.j(m.mGrabResultReceiveButton, i, Color.parseColor(str2));
                      LiveRedPackRainResource mGrabResultS = m.mGrabResultSummaryTextColor;
                      if (mGrabResultS != null) {
                         or.p.setTextColor(r.d(mGrabResultS, a1.a(i3)));
                      }
                   }
                }
             }
          label_01cd :
             if (liveRedPackR == null) {
                b.Z(LiveLogTag.LIVE_RED_PACK_RAIN, "LiveRedPackRainNormalResultComponent bindView: grabResult is null");
                or.m(view, uoa.m);
             }else {
                int i1 = 3;
                if (!PatchProxy.applyVoidOneRefs(liveRedPackR, or, uoe, "14")) {
                   or.k.setVisibility(i);
                   or.k.setText(liveRedPackR.mTitle);
                   if (liveRedPackR.mLinkActionType == i1) {
                      b = this.h();
                      or.u = b;
                      if (b) {
                         or.n.setText(liveRedPackR.mAckTips);
                      }else {
                         or.n.setText(R.string.arg_RES_7f102665);
                      }
                   }else {
                      or.n.setText(liveRedPackR.mAckTips);
                   }
                   or.p.setText(liveRedPackR.mPrizeDesc);
                }
                LiveRedPackRainGrabResult mPrizeList = liveRedPackR.mPrizeList;
                String str = "";
                if (q.f(mPrizeList)) {
                   str1 = str;
                   if (!PatchProxy.applyVoidThreeRefs(view, liveRedPackR, uoa.m, this, e.class, "19")) {
                      n.e("LIVE_RED_PACKET_RAIN_GAIN_FAILED_CARD", or.q.i().a, or.q.e().Z2.a());
                      view1 = h.f(view, R.id.live_red_pack_rain_unlucky_layout_view_stub, 0x7f0a24d9);
                      or.m = view1;
                      textView = m1.f(view1, R.id.live_red_pack_rain_unlucky_result_text);
                      textView.setText(liveRedPackR.mTitle);
                      textView.setTextColor(or.r);
                      or.p.setVisibility(8);
                      or.k.setVisibility(8);
                   }
                }else {
                   str1 = str;
                   LiveRedPackPrize liveRedPackP1 = or.c(mPrizeList);
                   if (liveRedPackR.mIsKoi != null) {
                      if (liveRedPackP1 != null) {
                         or.j.setVisibility(i);
                         if (!PatchProxy.applyVoidTwoRefs(view, liveRedPackP1, or, uoe, "16")) {
                            or.k.getLayoutParams().topMargin = a1.d(0x7f07032c);
                            view1 = h.f(view, R.id.live_red_pack_rain_lucky_user_with_coupon_view_stub, 0x7f0a24c1);
                            or.l = view1;
                            KwaiImageView kwaiImageVie = m1.f(view1, R.id.red_pack_rain_lucky_user_product_img);
                            if (!q.f(liveRedPackP1.mPicUrl)) {
                               kwaiImageVie.P(liveRedPackP1.mPicUrl);
                            }
                            LiveRedPackRainMerchantCouponInfo liveRedPackR1 = LiveRedPackRainMerchantCouponInfo.parseLiveRedPackRainMerchantCouponInfo(liveRedPackP1.mExtInfo);
                            if (liveRedPackR1 != null) {
                               e l = or.l;
                               if (!PatchProxy.applyVoidTwoRefs(l, liveRedPackR1, or, uoe, "17")) {
                                  m1.f(l, R.id.red_pack_rain_lucky_user_product_name).setText(liveRedPackR1.itemTitle);
                                  str2 = "alte-din.ttf";
                                  m1.f(l, R.id.red_pack_rain_coupon_price_prefix).setTypeface(d0.a(str2, a1.c()));
                                  textView = m1.f(l, R.id.red_pack_rain_coupon_price);
                                  textView.setText(liveRedPackR1.showPrice);
                                  textView.setTypeface(d0.a(str2, a1.c()));
                                  View view2 = m1.f(l, 0x7f0a34f1);
                                  if (PatchProxy.isSupport(uoe)) {
                                     view3 = view2;
                                     str3 = str2;
                                     uoe1 = l;
                                     if (!PatchProxy.applyVoidThreeRefs(view2, liveRedPackR1, Boolean.TRUE, this, e.class, "18")) {
                                     label_0354 :
                                        if (liveRedPackR1.validityType == 2) {
                                           or.s = f.d().b(liveRedPackR1.validityTime, 100).subscribe(new j(view3, 1), Functions.e);
                                        }else {
                                           view3.setText(liveRedPackR1.couponEndTime);
                                        }
                                     }
                                  }else {
                                     view3 = view2;
                                     str3 = str2;
                                     uoe1 = l;
                                     goto label_0354 ;
                                  }
                                  h = uoe1;
                                  textView = m1.f(h, R.id.red_pack_rain_coupon_original_price);
                                  textView.setPaintFlags((textView.getPaintFlags() | 0x10));
                                  String originalPric = liveRedPackR1.getOriginalPriceWithTag();
                                  super(originalPric);
                                  if (originalPric.length() > 1) {
                                     this.setSpan(new CustomTypefaceSpan(str1, d0.a(str3, a1.c())), 1, originalPric.length(), 17);
                                  }
                                  textView.setText(this);
                                  textView = m1.f(h, R.id.red_pack_rain_coupon_postage);
                                  i2 = (liveRedPackR1.mIsFreePost != null)? 0: 8;
                                  textView.setVisibility(i2);
                               }
                            }
                         }
                      }else {
                         or.j.setVisibility(8);
                         or.m(view, uoa.m);
                      }
                   }else {
                      or.j.setVisibility(8);
                      LiveSurpriseRedPackResultViewBinder$Mode mode = or1.d(liveRedPackR.mPrizeList);
                      if (mode == LiveSurpriseRedPackResultViewBinder$Mode.UNLUCKY) {
                         or.m(view, uoa.m);
                      }else if(mode != LiveSurpriseRedPackResultViewBinder$Mode.COUPON_AND_GIFT && (mode == LiveSurpriseRedPackResultViewBinder$Mode.COUPON_AND_COIN || mode == LiveSurpriseRedPackResultViewBinder$Mode.BOTH)){
                         or.k.setVisibility(8);
                      }else {
                         or.k.setVisibility(0);
                      }
                      mode.bind(view, liveRedPackR.mPrizeList);
                   }
                }
                LiveRedPackRainGrabResult mIsKoi = liveRedPackR.mIsKoi;
                if (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidTwoRefs(mPrizeList, Boolean.valueOf(mIsKoi), or, uoe, "27") && !q.f(mPrizeList))) {
                   LiveRedPackPrize liveRedPackP = or.c(mPrizeList);
                   LiveRedPackPrize mId = (liveRedPackP != null)? liveRedPackP.mId: str1;
                   uoa = or.q.i().a;
                   List list = or.g(mPrizeList);
                   ClientContent$LiveStreamPackage liveStreamPa = or.q.e().Z2.a();
                   n on = n.class;
                   if (PatchProxy.isSupport(on)) {
                      Object[] objArray = new Object[]{uoa,mId,Boolean.valueOf(mIsKoi),list,liveStreamPa};
                      if (!PatchProxy.applyVoid(objArray, null, on, "6")) {
                      }
                   }else {
                   }
                }
             label_0489 :
                or.g.setOnClickListener(new i(or, mPrizeList, liveRedPackR));
             }
          }
       }
       return;
    }
    public int a(){
       return 0x7f0d0d87;
    }
    public final LiveRedPackPrize c(List p0){
       LiveRedPackPrize obj = PatchProxy.applyOneRefs(p0, this, e.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          obj = iterator.next();
          if (obj.mPrizeType == 3 || obj.mDisplayType == 2) {
             break ;
          }
       }
       return obj;
    }
    public Uri d(boolean p0){
       c0 obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoe, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = c0.a;
       String str = (p0)? "udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_lucky_user_bg.webp": "udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_result_back_red.webp";
       return obj.a(str);
    }
    public Uri e(boolean p0){
       c0 obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoe, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = c0.a;
       String str = (p0)? "udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_lucky_user_bottom_bg.webp": "udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_opened_bottom_bg.webp";
       return obj.a(str);
    }
    public Uri f(boolean p0){
       c0 obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoe, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = c0.a;
       String str = (p0)? "udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_lucky_user_top_bg.webp": "udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_result_top_back.webp";
       return obj.a(str);
    }
    public final List g(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, e.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LiveRedPackPrize liveRedPackP = iterator.next();
          if (liveRedPackP.mPrizeType != 3) {
             obj.add(liveRedPackP);
          }
       }
       return obj;
    }
    public final boolean h(){
       Object obj = PatchProxy.apply(null, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.q.e() == null) {
          return false;
       }
       if (this.q.e().a2 == null) {
          return false;
       }
       return this.q.e().a2.i();
    }
    public final void i(CDNUrl[] p0,CDNUrl[] p1,CDNUrl[] p2,boolean p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, e.class, "6")) {
          return;
       }
       if (!j.h(p0) && (!j.h(p1) && !j.h(p2))) {
          this.d.a0(p0, new e$a(this, p3));
          this.e.a0(p1, new e$b(this, p3));
          this.f.a0(p2, new e$c(this, p3));
       }else {
          this.k(p3);
       }
       return;
    }
    public final void j(LiveRedPackRainResource$RedPackRainButton p0,boolean p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, e.class, "8")) {
          return;
       }
       if (p0 != null && !j.h(p0.mImageUrls)) {
          this.g.a0(p0.mImageUrls, new e$d(this, p0, p2, p1));
       }else {
          this.l(p1, p2);
       }
       return;
    }
    public final void k(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "7")) {
          return;
       }
       this.d.setImageURI(this.d(p0));
       this.e.setImageURI(this.f(p0));
       this.f.setImageURI(this.e(p0));
       return;
    }
    public void l(boolean p0,int p1){
       Uri uri;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoe, "9")) {
          return;
       }
       e tg = this.g;
       if (PatchProxy.isSupport(uoe)) {
          uri = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoe, "13");
          if (uri != PatchProxyResult.class) {
          label_003f :
             tg.setImageURI(uri);
             this.n.setTextColor(p1);
             return;
          }
       }
       c0 a = c0.a;
       String str = (p0)? "udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_lucky_user_use.webp": "udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_result_lucky_snatch_btn.webp";
       uri = a.a(str);
       goto label_003f ;
    }
    public final void m(View p0,LiveRedPackRainResource p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "20")) {
          return;
       }
       n.e("LIVE_RED_PACKET_RAIN_GAIN_FAILED_CARD", this.q.i().a, this.q.e().Z2.a());
       TextView textView = m1.f(h.f(p0, R.id.live_red_pack_rain_unlucky_layout_view_stub, 0x7f0a24d9), R.id.live_red_pack_rain_unlucky_result_text);
       textView.setTextColor(this.r);
       textView.setText(R.string.arg_RES_7f102672);
       this.p.setVisibility(8);
       this.k.setVisibility(8);
       this.n.setText(R.string.arg_RES_7f10266d);
       this.n.setOnClickListener(new e$e(this));
       return;
    }
}
