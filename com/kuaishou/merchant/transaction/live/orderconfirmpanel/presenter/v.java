package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nk4.p1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderConfirmCommodity;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.CommodityItemRecommendInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import lnc.a1;
import ue4.v;
import com.kuaishou.merchant.transaction.base.sku.c$a;
import com.kuaishou.merchant.transaction.base.sku.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.text.TextUtils;
import android.text.SpannableStringBuilder;
import android.graphics.Typeface;
import ot3.p0;
import android.text.style.StyleSpan;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import android.text.TextPaint;
import android.view.View;
import ekd.m1;
import kk4.g;

public class v extends PresenterV2	// class@000843
{
    public TextView p;
    public TextView q;
    public TextView r;
    public MerchantLivePurchasePanelResponse s;
    public c t;
    public OrderConfirmCommodity u;
    public c$a v;

    public void v(){
       super();
       this.v = new p1(this);
    }
    public void E8(){
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ov, "3")) {
          return;
       }
       this.S8(this.s.mSelectedSku);
       if (!PatchProxy.applyVoid(objArray, this, ov, "6")) {
          OrderConfirmCommodity mItemRecomme = this.u.mItemRecommendInfo;
          if (mItemRecomme != null && !TextUtils.x(mItemRecomme.mDesc)) {
             this.r.setVisibility(0);
             this.r.setText(this.u.mItemRecommendInfo.mDesc);
             this.r.setTextColor(v.a(this.u.mItemRecommendInfo.mColor, a1.a(R.color.arg_RES_7f061da9)));
          }else {
             this.r.setVisibility(8);
          }
       }
       this.t.i(this.v);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, v.class, "4")) {
          return;
       }
       this.t.p(this.v);
       return;
    }
    public final String P8(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          p0 = "";
       }
       return p0;
    }
    public final CharSequence R8(String p0,int p1,int p2,String p3,int p4,int p5,int p6){
       object oobject = p3;
       int i = p6;
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),oobject,Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, this, ov, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i1 = this;
       }
       if (p0 == null || TextUtils.isEmpty(p0)) {
          return "";
       }else {
          SpannableStringBuilder spannableStr = new SpannableStringBuilder();
          spannableStr.append(p0.f(p0, p2, p1, Typeface.DEFAULT_BOLD, p5, 1));
          spannableStr.setSpan(new StyleSpan(1), 0, 1, 33);
          if (i > 0 && !TextUtils.x(p3)) {
             SpannableStringBuilderUtils.i(spannableStr, i);
          }
          if (!TextUtils.x(p3)) {
             SpannableStringBuilderUtils.a(spannableStr, oobject, p4);
             spannableStr.setSpan(new StyleSpan(1), spannableStr.length(), spannableStr.length(), 33);
          }
          return spannableStr;
       }
    }
    public final void S8(SkuInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "5")) {
          return;
       }
       if (p0 != null && p0.isValidSku()) {
          this.V8(p0.mSkuShowPrice, p0.mSkuShowCouponPrice, p0.mOriginalPriceSuffix, p0.mCouponPriceSuffix);
       }else {
          v tu = this.u;
          this.V8(tu.mPrice, tu.mCouponPrice, tu.mPriceSuffix, tu.mCouponPriceSuffix);
       }
       return;
    }
    public final void V8(String p0,String p1,String p2,String p3){
       int this;
       v ov = this;
       String str = p2;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, v.class, "7")) {
          return;
       }
       int i = 0x7f0702ac;
       int i1 = 0x7f0702e3;
       int i2 = 0x7f07028d;
       this = 0x7f0702b8;
       int i3 = 0;
       if (!TextUtils.x(p1)) {
          ov.p.setVisibility(i3);
          ov.p.setText(this.R8(p1, a1.d(this), a1.d(i2), this.P8(p3), a1.d(R.dimen.arg_RES_7f07027a), a1.d(i1), a1.d(i)));
          ov.q.setVisibility(i3);
          ov.q.setText(this.R8(p0, a1.d(R.dimen.arg_RES_7f07027a), a1.d(R.dimen.arg_RES_7f07027a), this.P8(str), a1.d(R.dimen.arg_RES_7f07027a), 0, 0));
          ov.q.getPaint().setFlags(16);
       }else {
          ov.q.setVisibility(8);
          ov.p.setVisibility(i3);
          ov.p.setText(this.R8(p0, a1.d(this), a1.d(i2), this.P8(str), a1.d(R.dimen.arg_RES_7f07027a), a1.d(i1), a1.d(i)));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a02e7);
       this.r = m1.f(p0, 0x7f0a40f5);
       this.p = m1.f(p0, 0x7f0a02e2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       this.s = this.q8(MerchantLivePurchasePanelResponse.class);
       this.t = this.r8("LIVE_AUDIENCE_SKU_MANAGER");
       this.u = this.q8(g.class).b;
       return;
    }
}
