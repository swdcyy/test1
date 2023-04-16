package com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareCashView;
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
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareCashInfo;
import com.kuaishou.merchant.marketing.platform.trustordare.model.LiveMerchantTrustDareRedPacketStyle;
import java.lang.CharSequence;
import com.kuaishou.merchant.marketing.platform.trustordare.view.LiveMerchantTrustDareCashView$a;
import android.view.View$OnClickListener;

public final class LiveMerchantTrustDareCashView extends LiveMerchantTrustDareBaseView	// class@001b74
{
    public TextView D;
    public TextView E;
    public TextView F;
    public TextView G;
    public LiveMerchantTrustDareRedPacketView H;
    public View I;
    public HashMap J;

    public void LiveMerchantTrustDareCashView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void LiveMerchantTrustDareCashView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void LiveMerchantTrustDareCashView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       a.f(this, R.layout.arg_RES_7f0d163c, true);
       if (PatchProxy.applyVoid(null, this, LiveMerchantTrustDareCashView.class, "1")) {
       }else {
          this.H = m1.f(this, 0x7f0a4091);
          this.D = m1.f(this, 0x7f0a4092);
          TextView textView = m1.f(this, R.id.trust_dare_reward_cash_price_tv);
          this.E = textView;
          if (textView == null) {
             a.S("mCashPriceTv");
          }
          textView.setTypeface(p0.l());
          this.G = m1.f(this, 0x7f0a4090);
          this.F = m1.f(this, 0x7f0a408e);
          this.I = m1.f(this, 0x7f0a4089);
       }
       return;
    }
    public void LiveMerchantTrustDareCashView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void L(LiveMerchantTrustDareCashInfo p0){
       LiveMerchantTrustDareCashView tH;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantTrustDareCashView.class, "2")) {
          return;
       }
       if (p0 != null) {
          tH = this.H;
          if (tH == null) {
             a.S("mRedPacketView");
          }
          tH.L(p0.getMPacketStyle());
          tH = this.D;
          if (tH == null) {
             a.S("mCashTitleTv");
          }
          tH.setText(p0.getMTitle());
          tH = this.E;
          if (tH == null) {
             a.S("mCashPriceTv");
          }
          tH.setText(p0.o(p0.getMMoney()));
          tH = this.F;
          if (tH == null) {
             a.S("mCashDesTv");
          }
          tH.setText(p0.getMDesTitle());
          tH = this.G;
          if (tH == null) {
             a.S("mCashUseBtn");
          }
          tH.setText(p0.getMButtonTitle());
       }
       tH = this.I;
       if (tH == null) {
          a.S("mButtonLayout");
       }
       if (tH != null) {
          tH.setOnClickListener(new LiveMerchantTrustDareCashView$a(this, p0));
       }
       return;
    }
}
