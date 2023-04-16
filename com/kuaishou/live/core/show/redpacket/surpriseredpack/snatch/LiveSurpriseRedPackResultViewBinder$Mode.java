package com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode;
import java.lang.Enum;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$1;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$2;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$3;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$4;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$5;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$6;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$7;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$8;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$a;
import android.view.View;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackPrize;
import ekd.m1;
import android.widget.TextView;
import java.lang.CharSequence;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.Boolean;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainMerchantCouponInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder;
import crd.b;
import lnc.e0;
import com.yxcorp.gifshow.model.CDNUrl;
import uc.d;
import brd.t;
import com.kuaishou.live.common.core.basic.tools.l;
import ki2.i;
import erd.g;
import com.kuaishou.live.core.show.redpacket.surpriseredpack.snatch.LiveSurpriseRedPackResultViewBinder$Mode$a;
import android.os.CountDownTimer;

public class LiveSurpriseRedPackResultViewBinder$Mode extends Enum	// class@000fae
{
    public static final LiveSurpriseRedPackResultViewBinder$Mode[] $VALUES;
    public static final LiveSurpriseRedPackResultViewBinder$Mode BOTH;
    public static final LiveSurpriseRedPackResultViewBinder$Mode COIN_ONLY;
    public static final LiveSurpriseRedPackResultViewBinder$Mode COUPON_AND_COIN;
    public static final LiveSurpriseRedPackResultViewBinder$Mode COUPON_AND_GIFT;
    public static final LiveSurpriseRedPackResultViewBinder$Mode COUPON_ONLY;
    public static final LiveSurpriseRedPackResultViewBinder$Mode GIFT_ONLY;
    public static final LiveSurpriseRedPackResultViewBinder$Mode PRIZE_NO_TOP_ON;
    public static final LiveSurpriseRedPackResultViewBinder$Mode UNLUCKY;

    static {
       LiveSurpriseRedPackResultViewBinder$Mode$1 mode$1 = new LiveSurpriseRedPackResultViewBinder$Mode$1("BOTH", 0);
       LiveSurpriseRedPackResultViewBinder$Mode.BOTH = mode$1;
       LiveSurpriseRedPackResultViewBinder$Mode$2 mode$2 = new LiveSurpriseRedPackResultViewBinder$Mode$2("GIFT_ONLY", 1);
       LiveSurpriseRedPackResultViewBinder$Mode.GIFT_ONLY = mode$2;
       LiveSurpriseRedPackResultViewBinder$Mode$3 mode$3 = new LiveSurpriseRedPackResultViewBinder$Mode$3("COIN_ONLY", 2);
       LiveSurpriseRedPackResultViewBinder$Mode.COIN_ONLY = mode$3;
       LiveSurpriseRedPackResultViewBinder$Mode$4 mode$4 = new LiveSurpriseRedPackResultViewBinder$Mode$4("COUPON_ONLY", 3);
       LiveSurpriseRedPackResultViewBinder$Mode.COUPON_ONLY = mode$4;
       LiveSurpriseRedPackResultViewBinder$Mode$5 mode$5 = new LiveSurpriseRedPackResultViewBinder$Mode$5("COUPON_AND_GIFT", 4);
       LiveSurpriseRedPackResultViewBinder$Mode.COUPON_AND_GIFT = mode$5;
       LiveSurpriseRedPackResultViewBinder$Mode$6 mode$6 = new LiveSurpriseRedPackResultViewBinder$Mode$6("COUPON_AND_COIN", 5);
       LiveSurpriseRedPackResultViewBinder$Mode.COUPON_AND_COIN = mode$6;
       LiveSurpriseRedPackResultViewBinder$Mode$7 mode$7 = new LiveSurpriseRedPackResultViewBinder$Mode$7("PRIZE_NO_TOP_ON", 6);
       LiveSurpriseRedPackResultViewBinder$Mode.PRIZE_NO_TOP_ON = mode$7;
       LiveSurpriseRedPackResultViewBinder$Mode$8 mode$8 = new LiveSurpriseRedPackResultViewBinder$Mode$8("UNLUCKY", 7);
       LiveSurpriseRedPackResultViewBinder$Mode.UNLUCKY = mode$8;
       LiveSurpriseRedPackResultViewBinder$Mode[] modeArray = new LiveSurpriseRedPackResultViewBinder$Mode[]{mode$1,mode$2,mode$3,mode$4,mode$5,mode$6,mode$7,mode$8};
       LiveSurpriseRedPackResultViewBinder$Mode.$VALUES = modeArray;
    }
    public void LiveSurpriseRedPackResultViewBinder$Mode(String p0,int p1){
       super(p0, p1);
    }
    public void LiveSurpriseRedPackResultViewBinder$Mode(String p0,int p1,LiveSurpriseRedPackResultViewBinder$a p2){
       super(p0, p1);
    }
    public static void lambda$updateCouponView$0(View p0,Bitmap p1){
       p0.setBackground(new BitmapDrawable(a1.m(), p1));
    }
    public static LiveSurpriseRedPackResultViewBinder$Mode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveSurpriseRedPackResultViewBinder$Mode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveSurpriseRedPackResultViewBinder$Mode.class, p0);
    }
    public static LiveSurpriseRedPackResultViewBinder$Mode[] values(){
       Object obj = PatchProxy.apply(null, null, LiveSurpriseRedPackResultViewBinder$Mode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveSurpriseRedPackResultViewBinder$Mode.$VALUES.clone();
    }
    public void bind(View p0,List p1){
    }
    public void updateCoinView(View p0,LiveRedPackPrize p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSurpriseRedPackResultViewBinder$Mode.class, "3")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.red_pack_coin_value);
       textView.setText(String.valueOf(p1.mCount));
       textView.setTypeface(d0.a("alte-din.ttf", a1.c()));
       return;
    }
    public void updateCouponView(View p0,LiveRedPackPrize p1,boolean p2){
       if (PatchProxy.isSupport(LiveSurpriseRedPackResultViewBinder$Mode.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, LiveSurpriseRedPackResultViewBinder$Mode.class, "4")) {
          return;
       }
       LiveRedPackRainMerchantCouponInfo liveRedPackR = LiveRedPackRainMerchantCouponInfo.parseLiveRedPackRainMerchantCouponInfo(p1.mExtInfo);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.red_pack_rain_coupon_pic_layout);
       View view = m1.f(p0, R.id.red_pack_rain_coupon_price_layout);
       if (TextUtils.x(liveRedPackR.showPrice)) {
          view.setVisibility(4);
          kwaiImageVie.setVisibility(0);
          if (!q.f(p1.mPicUrl)) {
             kwaiImageVie.P(p1.mPicUrl);
          }
       }else {
          view.setVisibility(0);
          kwaiImageVie.setVisibility(8);
       }
       KwaiImageView kwaiImageVie1 = m1.f(p0, R.id.red_pack_coupon_icon);
       if (!q.f(liveRedPackR.mBrandIcon)) {
          kwaiImageVie1.setVisibility(0);
          kwaiImageVie1.P(liveRedPackR.mBrandIcon);
       }else {
          kwaiImageVie1.setVisibility(8);
       }
       View view1 = m1.f(p0, R.id.live_red_pack_rain_coupon_layout);
       if (!q.f(liveRedPackR.mBrandBackground)) {
          b b = LiveSurpriseRedPackResultViewBinder.b;
          b uob = null;
          if (b != null) {
             b.dispose();
             LiveSurpriseRedPackResultViewBinder.b = uob;
          }
          LiveSurpriseRedPackResultViewBinder.b = l.e(e0.g(e0.a(liveRedPackR.mBrandBackground, "")), uob).subscribe(new i(view1));
       }
       m1.f(p0, R.id.red_pack_coupon_name).setText(liveRedPackR.mCouponName);
       m1.f(p0, R.id.red_pack_coupon_value_prefix).setTypeface(d0.a("alte-din.ttf", a1.c()));
       TextView textView = m1.f(p0, R.id.red_pack_coupon_value);
       textView.setText(liveRedPackR.showPrice);
       textView.setTypeface(d0.a("alte-din.ttf", a1.c()));
       textView = m1.f(p0, R.id.red_pack_coupon_threshold);
       if (TextUtils.x(liveRedPackR.thresholdUseLimit)) {
          textView.setVisibility(8);
       }else {
          textView.setText(liveRedPackR.thresholdUseLimit);
       }
       m1.f(p0, R.id.red_pack_coupon_use_range).setText(liveRedPackR.targetUseLimit);
       this.updateTimeCountDownView(m1.f(p0, R.id.red_pack_coupon_use_time), liveRedPackR, (p2 ^ 0x01));
       return;
    }
    public void updateTimeCountDownView(TextView p0,LiveRedPackRainMerchantCouponInfo p1,boolean p2){
       if (PatchProxy.isSupport(LiveSurpriseRedPackResultViewBinder$Mode.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, LiveSurpriseRedPackResultViewBinder$Mode.class, "5")) {
          return;
       }
       if (p1.validityType == 2) {
          LiveSurpriseRedPackResultViewBinder$Mode$a mode$a = new LiveSurpriseRedPackResultViewBinder$Mode$a(this, p1.validityTime, 100, p0, p2);
          LiveSurpriseRedPackResultViewBinder.a = v0;
          v0.start();
       }else {
          p0.setText(p1.couponEndTime);
       }
       return;
    }
}
