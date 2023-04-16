package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.k;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.k$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qk4.a;
import qk4.e;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ItemInfo;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$ItemNumberStimulateDesc;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;
import lnc.a1;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$LimitInfo;
import android.widget.LinearLayout;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.k$b;
import com.kuaishou.merchant.transaction.base.widget.NumberPickerView$a;
import com.kuaishou.merchant.transaction.base.widget.NumberPickerView;
import nk4.m0;
import com.kuaishou.merchant.transaction.base.widget.NumberPickerView$b;
import java.lang.Integer;
import java.lang.Math;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import z1.k;
import qk4.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import android.view.View;
import kk4.f;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.widget.selector.view.SelectShapeLinearLayout;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.content.Context;
import android.graphics.Typeface;
import ekd.d0;
import java.lang.Boolean;
import e17.i;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import ekd.m1;
import nk4.p0;
import java.util.Map;
import java.util.HashMap;

public class k extends PresenterV2 implements g	// class@00082f
{
    public MerchantLivePurchasePanelResponse p;
    public k q;
    public e r;
    public f s;
    public a t;
    public NumberPickerView u;
    public TextView v;
    public TextView w;
    public MerchantLivePurchasePanelResponse$LimitInfo x;

    public void k(){
       super();
       this.t = new k$a(this);
    }
    public void E8(){
       MerchantLivePurchasePanelResponse mLimitInfo;
       int i3;
       k tu1;
       MerchantLivePurchasePanelResponse$LimitInfo mMinPurchase;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "4")) {
          return;
       }
       this.r.b(this.t);
       if (!PatchProxy.applyVoid(objArray, this, ok, "7")) {
          tu1 = this.p;
          if (tu1 != null) {
             mLimitInfo = tu1.mItemInfo;
             if (mLimitInfo != null) {
                MerchantLivePurchasePanelResponse$ItemInfo mItemNumberS = mLimitInfo.mItemNumberStimulateDesc;
                if (mItemNumberS != null) {
                   if (!TextUtils.x(mItemNumberS.mNumberStimulateDesc)) {
                      this.v.setText(mItemNumberS.mNumberStimulateDesc);
                   }
                   if (!TextUtils.x(mItemNumberS.mFontColor)) {
                      this.v.setTextColor(TextUtils.J(mItemNumberS.mFontColor, a1.a(R.color.arg_RES_7f061da9)));
                   }
                }
             }
          }
       }
       mLimitInfo = this.p.mLimitInfo;
       this.x = mLimitInfo;
       if (mLimitInfo == null) {
          this.x = new MerchantLivePurchasePanelResponse$LimitInfo();
       }
       int i = 0;
       int i1 = 8;
       if (!PatchProxy.applyVoid(objArray, this, ok, "6")) {
          if (!TextUtils.x(this.x.mPurchaseLimitDesc)) {
             this.w.setVisibility(i);
             this.w.setText(this.x.mPurchaseLimitDesc);
          }else {
             this.w.setVisibility(i1);
          }
       }
       this.u.setVisibility(i);
       this.u.setOnNumberChangedListener(new k$b(this));
       this.u.setOnNumberDialogListener(new m0(this));
       MerchantLivePurchasePanelResponse$LimitInfo mPurchaseLim = this.x.mPurchaseLimitCount;
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mPurchaseLim), this, ok, "9")) {
          k tx = this.x;
          int i2 = 1;
          if (tx != null && tx.mPurchaseLimitType == i2) {
             k tu = this.u;
             i = Math.max(i2, tx.mMinPurchaseLimitCount);
             MerchantLivePurchasePanelResponse$LimitInfo mPurchaseLim1 = this.x.mPurchaseLimitCount;
             if (PatchProxy.isSupport(ok)) {
                Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(mPurchaseLim1), Integer.valueOf(mPurchaseLim), this, ok, "10");
                if (obj != PatchProxyResult.class) {
                   i3 = obj.intValue();
                label_00f3 :
                   tu.setMinNum(Math.min(i, i3));
                   this.u.setMaxNum(this.x.mPurchaseLimitCount);
                }
             }
             i3 = Math.min(mPurchaseLim1, mPurchaseLim);
             goto label_00f3 ;
          }else {
             tu1 = this.u;
             i = (tx == null)? 1: tx.mMinPurchaseLimitCount;
             tu1.setMinNum(Math.max(i2, i));
          }
          this.u.setCurrentNum(this.p.mItemCount);
          tu1 = this.u;
          tu1.b(tu1.getCurrentNum());
          this.p.mSelectedItemCount = this.u.getCurrentNum();
       }
       if (PatchProxy.applyVoid(objArray, this, ok, "11") || (this.q.get() != null && this.q.get().c() != null)) {
          this.q.get().c().setItemCountInfo(this.u.getCurrentNum());
       }
    label_0164 :
       if (!PatchProxy.applyVoid(objArray, this, ok, "5")) {
          View view = this.m8();
          k ts = this.s;
          if (ts != null) {
             f mBottomMargi = ts.mBottomMargin;
             if (mBottomMargi >= null) {
                i1 = mBottomMargi;
             }
          }
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          if (layoutParams instanceof RecyclerView$LayoutParams) {
             layoutParams.bottomMargin = a1.e((float)i1);
          }
          view.setLayoutParams(layoutParams);
       }
       return;
    }
    public void F8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "15")) {
          b uob = new b();
          uob.g(KwaiRadiusStyles.FULL);
          uob.v(a1.a(R.color.arg_RES_7f061dd7));
          this.u.getRootLinearView().setBackground(uob.a());
          this.u.setAddBg(R.drawable.arg_RES_7f080edc);
          this.u.setMinusBg(R.drawable.arg_RES_7f080ee5);
          this.u.getNumTv().setTypeface(d0.a("alte-din.ttf", this.getContext()));
       }
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, k.class, "8");
    }
    public boolean P8(int p0){
       PageInfoReqParam obj;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.q.get() != null && this.q.get().c() != null) {
          if (!this.q.get().h()) {
             return b;
          }else {
             obj = this.q.get().c();
             obj.mReselectedEventType = 3;
             this.p.mSelectedItemCount = p0;
             b = true;
             this.q.get().d(obj, b);
          }
       }
       return b;
    }
    public boolean R8(int p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ok, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 > p1) {
          i.d(R.style.arg_RES_7f11066a, a1.q(R.string.arg_RES_7f1033ac, this.u.getMaxNum()));
          return true;
       }else {
          return false;
       }
    }
    public boolean S8(int p0,int p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ok, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 < p1) {
          i.d(R.style.arg_RES_7f11066a, a1.q(R.string.arg_RES_7f1033ad, this.u.getMinNum()));
          return true;
       }else {
          return false;
       }
    }
    public void V8(SkuInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "17")) {
          return;
       }
       k tu = this.u;
       tu.setMaxNum(Math.min(tu.getMaxNum(), p0.mSkuStock));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a02f2);
       this.v = m1.f(p0, 0x7f0a02f1);
       this.w = m1.f(p0, 0x7f0a02f0);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, k.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, k.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(k.class, new p0());
       }else {
          obj.put(k.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.p = this.q8(MerchantLivePurchasePanelResponse.class);
       this.q = this.r8("LIVE_AUDIENCE_ORDER_BOTTOM_BAR_SERVICE_MEDIA");
       this.r = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_SERVICE");
       this.s = this.q8(f.class);
       return;
    }
}
