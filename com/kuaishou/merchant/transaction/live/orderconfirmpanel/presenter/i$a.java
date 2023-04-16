package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$a;
import qk4.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BuyButton;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PayButtonEnableCondition;
import android.text.SpannableStringBuilder;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import java.util.Objects;
import android.widget.TextView;
import java.util.LinkedHashMap;
import com.kuaishou.merchant.transaction.base.sku.c;
import java.util.List;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.sku.SkuSpecification;
import java.lang.CharSequence;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$MoneyInfo;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import gk4.c;

public class i$a implements d	// class@000825
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "10")) {
          return;
       }
       this.a.x9(false);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "11")) {
          return;
       }
       this.a.W8();
       return;
    }
    public PageInfoReqParam c(){
       Object obj = PatchProxy.apply(null, this, i$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.j9();
    }
    public void d(PageInfoReqParam p0,boolean p1){
       i$a uoa = i$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.l(p0, p1, 0);
       return;
    }
    public void e(int p0,boolean p1,BuyButton p2){
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, i$a.class, "5")) {
          return;
       }
       this.a.N = new PayButtonEnableCondition(p0, p1);
       this.a.F9(false, p2);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "9")) {
          return;
       }
       i$a ta = this.a;
       i s = ta.S;
       if (s != null) {
          ta.n9(s);
       }
       return;
    }
    public void g(SkuInfo p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "3")) {
          return;
       }
       i$a ta = this.a;
       Objects.requireNonNull(ta);
       i oi = i.class;
       if (!PatchProxy.applyVoidOneRefs(p0, ta, oi, "31")) {
          LinkedHashMap obj = PatchProxy.apply(null, ta, oi, "32");
          if (obj != PatchProxyResult.class) {
             obj.booleanValue();
          }else {
             i = 8;
             if (ta.m9() && !ta.s9()) {
                ta.J.setVisibility(i);
                ta.K.setVisibility(i);
                ta.M.setVisibility(0);
                obj = ta.B.c();
                String str = "«Î—°‘Ò";
                Iterator iterator = ta.B.d().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      SkuSpecification skuSpecifica = iterator.next();
                      if (!obj.containsKey(skuSpecifica.mPropName)) {
                         str = str+skuSpecifica.mPropName;
                      }
                   }
                   ta.M.setText(str);
                   ta.M.requestLayout();
                }
             }else {
                ta.J.setVisibility(0);
                ta.K.setVisibility(0);
                ta.M.setVisibility(i);
             }
          }
          if (!p0.isValidSku()) {
             i y = ta.y;
             if (y.mMoneyInfo == null) {
                y.mMoneyInfo = new MerchantLivePurchasePanelResponse$MoneyInfo();
             }
             y = ta.y;
             y.mMoneyInfo.mDisplayType = 0;
             if (y.mBuyButton == null) {
                y.mBuyButton = new BuyButton();
             }
             ta.N = new PayButtonEnableCondition(2, ta.y.mBuyButton.mCanClick);
             ta.E9(0);
          }
       }
       return;
    }
    public boolean h(){
       i u = this.a.U;
       boolean b = (u != null && u.mShouldRequest != null)? true: false;
       return b;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "7")) {
          return;
       }
       this.a.D9();
       return;
    }
    public void j(boolean p0){
       this.a.t = p0;
    }
    public void k(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$a.class, "4")) {
          return;
       }
       i$a ta = this.a;
       i k = ta.K;
       int i = (ta.t9())? 0: 8;
       k.setVisibility(i);
       ta = this.a;
       ta.q9(p0, ta.y.mMoneyInfo);
       return;
    }
    public void l(PageInfoReqParam p0,boolean p1,int p2){
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, i$a.class, "2")) {
          return;
       }
       p0.setModifyCountType(p2);
       this.a.B9(p0, p1);
       return;
    }
    public boolean m(){
       i obj = PatchProxy.apply(null, this, i$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.O;
       if (obj == null || !obj.d()) {
          return false;
       }
       this.f();
       return true;
    }
}
