package com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareCouponView;
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
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareCouponInfo;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareRedPacketStyle;
import java.lang.CharSequence;
import lnc.a1;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareCouponView$a;
import android.view.View$OnClickListener;

public final class LiveMerchantTrustDareCouponView extends LiveMerchantTrustDareBaseView	// class@001b76
{
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public LiveMerchantTrustDareRedPacketView K;
    public View L;
    public HashMap M;

    public void LiveMerchantTrustDareCouponView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMerchantTrustDareCouponView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMerchantTrustDareCouponView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.f(this, R.layout.arg_RES_7f0d163d, true);
       if (PatchProxy.applyVoid(null, this, LiveMerchantTrustDareCouponView.class, "1")) {
       }else {
          this.K = m1.f(this, 0x7f0a4097);
          this.D = m1.f(this, 0x7f0a4098);
          TextView textView = m1.f(this, R.id.trust_dare_reward_coupon_price_tv);
          this.E = textView;
          if (textView == null) {
             a.S("mPriceTv");
          }
          textView.setTypeface(p0.l());
          this.F = m1.f(this, 0x7f0a409b);
          this.G = m1.f(this, 0x7f0a4099);
          this.H = m1.f(this, 0x7f0a409c);
          this.I = m1.f(this, 0x7f0a409d);
          this.J = m1.f(this, 0x7f0a4094);
          this.L = m1.f(this, 0x7f0a4093);
       }
       return;
    }
    public void LiveMerchantTrustDareCouponView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void L(LiveMerchantTrustDareCouponInfo p0){
       LiveMerchantTrustDareCouponView tK;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTrustDareCouponView.class, "2")) {
          return;
       }
       if (p0 != null) {
          tK = this.K;
          if (tK == null) {
             a.S("mRedPacketView");
          }
          tK.L(p0.getMPacketStyle());
          tK = this.D;
          if (tK == null) {
             a.S("mCouponTitleTv");
          }
          tK.setText(p0.getMTitle());
          tK = this.E;
          if (tK == null) {
             a.S("mPriceTv");
          }
          tK.setText(p0.h(p0.m(p0.getMMoney()), a1.d(R.dimen.arg_RES_7f070f72), a1.d(R.dimen.arg_RES_7f070f79), a1.d(R.dimen.arg_RES_7f0702ac), true));
          tK = this.F;
          if (tK == null) {
             a.S("mUseConditionTv");
          }
          tK.setText(p0.getMUseCondition());
          tK = this.G;
          if (tK == null) {
             a.S("mCouponTypeDesTv");
          }
          tK.setText(p0.getMCouponDes());
          tK = this.H;
          if (tK == null) {
             a.S("mCouponScopeTv");
          }
          tK.setText(p0.getMCouponSubDesc());
          tK = this.I;
          if (tK == null) {
             a.S("mCouponValidityTv");
          }
          tK.setText(p0.getMCouponValidDesc());
          tK = this.J;
          if (tK == null) {
             a.S("mCouponUseBtn");
          }
          tK.setText(p0.getMButtonTitle());
       }
       tK = this.L;
       if (tK == null) {
          a.S("mButtonLayout");
       }
       if (tK != null) {
          tK.setOnClickListener(new LiveMerchantTrustDareCouponView$a(this, p0));
       }
       return;
    }
}
