package com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareCashCouponView;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareBaseView;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareRedPacketView;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import android.graphics.Typeface;
import ot3.p0;

public final class LiveMerchantTrustDareCashCouponView extends LiveMerchantTrustDareBaseView	// class@001b72
{
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public View L;
    public LiveMerchantTrustDareRedPacketView M;
    public HashMap N;

    public void LiveMerchantTrustDareCashCouponView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMerchantTrustDareCashCouponView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMerchantTrustDareCashCouponView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.f(this, R.layout.arg_RES_7f0d163b, true);
       if (PatchProxy.applyVoid(null, this, LiveMerchantTrustDareCashCouponView.class, "1")) {
       }else {
          this.M = m1.f(this, 0x7f0a408c);
          this.D = m1.f(this, 0x7f0a408d);
          TextView textView = m1.f(this, R.id.trust_dare_reward_cash_price_tv);
          this.E = textView;
          if (textView == null) {
             a.S("mCashPriceTv");
          }
          textView.setTypeface(p0.l());
          textView = m1.f(this, R.id.trust_dare_reward_coupon_price_tv);
          this.F = textView;
          if (textView == null) {
             a.S("mCouponPriceTv");
          }
          textView.setTypeface(p0.l());
          this.G = m1.f(this, 0x7f0a409b);
          this.H = m1.f(this, 0x7f0a4095);
          this.I = m1.f(this, 0x7f0a409c);
          this.J = m1.f(this, 0x7f0a409a);
          this.K = m1.f(this, 0x7f0a408b);
          this.L = m1.f(this, 0x7f0a408a);
       }
       return;
    }
    public void LiveMerchantTrustDareCashCouponView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
}
