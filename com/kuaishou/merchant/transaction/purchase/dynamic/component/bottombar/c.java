package com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm4.a;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import ue4.g;
import com.google.gson.JsonElement;
import bo4.b;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.BottomBarModel;
import com.kuaishou.merchant.transaction.purchase.model.BuyButton;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.SpannableStringBuilder;
import lnc.a1;
import com.yxcorp.gifshow.util.span.SpannableStringBuilderUtils;
import android.view.View;
import hm4.d;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import em4.m;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo$Installment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import com.yxcorp.gifshow.util.rx.RxBus;
import wd4.c;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.b;
import erd.r;
import hm4.c;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import ue4.d;
import com.kuaishou.merchant.transaction.base.dynamic.form.DyFormCallBackData;
import pm4.e;
import pm4.f;
import ue4.r;
import pm4.d;
import java.lang.reflect.Type;
import el.a;
import ha0.a;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.kuaishou.merchant.transaction.purchase.dynamic.component.bottombar.c$a;

public class c extends PresenterV2	// class@000901
{
    public BottomBarModel p;
    public boolean q;
    public boolean r;
    public SelectShapeTextView s;
    public View t;
    public Fragment u;

    public void c(Fragment p0){
       super();
       this.r = true;
       this.u = p0;
    }
    public void E8(){
       PaymentMethodInfo paymentMetho;
       boolean b;
       ClientEvent$ElementPackage uElementPack;
       i3 oi3;
       String str2;
       PaymentMethodInfo mName;
       PaymentMethodInfo$Installment selectedInst;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          return;
       }
       c tu = this.u;
       String str = "4";
       if (!PatchProxy.applyVoidOneRefs(tu, objArray, a.class, str)) {
          JsonObject jsonObject1 = new JsonObject();
          paymentMetho = a.a(tu);
          JsonObject jsonObject2 = (paymentMetho != null)? g.e(g.d(paymentMetho)): objArray;
          jsonObject1.G("serverPayMethod", jsonObject2);
          jsonObject2 = new JsonObject();
          jsonObject2.c0("type", "stashPageData");
          jsonObject2.G("data", jsonObject1);
          b.a(tu, jsonObject2.toString());
       }
       if (this.s.getVisibility()) {
          this.s.setVisibility(0);
       }
       str = "Ìá½»¶©µ¥";
       if (!PatchProxy.applyVoid(objArray, this, uoc, str)) {
          tu = this.p;
          if (tu != null) {
             BottomBarModel mBuyButton1 = tu.mBuyButton;
             if (mBuyButton1 != null && !TextUtils.isEmpty(mBuyButton1.mText)) {
                SpannableStringBuilder spannableStr = new SpannableStringBuilder();
                int i1 = 0x7f061e52;
                SpannableStringBuilderUtils.h(spannableStr, this.p.mBuyButton.mText, a1.e(16.00f), a1.a(i1));
                if (!TextUtils.isEmpty(this.p.mBuyButton.mDescription)) {
                   spannableStr.append("\n");
                   SpannableStringBuilderUtils.h(spannableStr, this.p.mBuyButton.mDescription, a1.e(10.00f), a1.a(i1));
                }
                this.s.setText(spannableStr);
             }
          }
          this.s.setText(str);
       }
       this.s.setEnabled(this.q);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "7")) {
          int i = (this.s.isEnabled())? 8: 0;
          if (this.t.getVisibility() != i) {
             this.t.setVisibility(i);
          }
          tu = this.t;
          Object[] objArray1 = (this.s.isEnabled())? objArray: new d(this);
          tu.setOnClickListener(objArray1);
          if (this.r != null) {
             tu = this.q;
             c tp = this.p;
             if (tp != null) {
                BottomBarModel mBuyButton = tp.mBuyButton;
                if (mBuyButton != null && !TextUtils.isEmpty(mBuyButton.mText)) {
                   BuyButton mText = this.p.mBuyButton.mText;
                }
             }
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(tu), str, this, uoc, "8")) {
                paymentMetho = a.a(this.u);
                b = a.c(this.u);
                String str1 = a.b(this.u);
                JsonObject jsonObject = this.P8();
                m om = m.class;
                if (PatchProxy.isSupport(om)) {
                   Object[] objArray2 = new Object[]{Boolean.valueOf(tu),paymentMetho,Boolean.valueOf(b),str1,str,jsonObject};
                   if (!PatchProxy.applyVoid(objArray2, objArray, om, "28")) {
                   }
                }else {
                }
             }
          }
       label_01c1 :
          this.r = false;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          this.X7(RxBus.f.f(c.class).observeOn(d.a).filter(b.b).subscribe(new c(this)));
       }
       return;
    }
    public final JsonObject P8(){
       BottomBarModel obj = PatchProxy.apply(null, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p.mLog;
       if (obj == null || obj.e0("buyButton") == null) {
          return null;
       }
       return this.p.mLog.m0("buyButton");
    }
    public void R8(boolean p0,String p1){
       boolean b1;
       boolean b2;
       PaymentMethodInfo mName;
       Object obj = this;
       String str = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), str, obj, uoc, "9")) {
          return;
       }
       PaymentMethodInfo paymentMetho = a.a(obj.u);
       DyFormCallBackData uDyFormCallB = d.a.b(obj.u);
       String str1 = "";
       String str2 = (uDyFormCallB == null)? str1: uDyFormCallB.invalidateReason;
       PaymentMethodInfo$Installment installment = null;
       if (TextUtils.isEmpty(str2)) {
          c u = obj.u;
          Object obj1 = PatchProxy.applyOneRefs(u, installment, e.class, "3");
          if (obj1 != patchProxyRe) {
          }else if(u != null){
             obj1 = g.c(r.a(u, "stash_create_order_preorder_action_model"), new d().getType());
          }else {
             obj1 = installment;
          }
          if (obj1 == null) {
             str2 = str1;
          }else {
             str2 = obj1.interceptPreorderActionReason;
          }
       }
       boolean b = a.c(obj.u);
       String str3 = a.b(obj.u);
       JsonObject obj2 = PatchProxy.apply(installment, obj, uoc, "11");
       if (obj2 != patchProxyRe) {
          b1 = obj2.booleanValue();
       }else {
          obj2 = new JsonObject();
          obj2.c0("type", "getStashPageData");
          obj2.c0("data", "is_focus_show_followView");
          b1 = Boolean.parseBoolean(b.a(obj.u, obj2.toString()));
       }
       JsonObject obj3 = PatchProxy.apply(installment, obj, uoc, "12");
       int i = 0;
       if (obj3 != patchProxyRe) {
          b2 = obj3.booleanValue();
       }else {
          long l = a.a();
          b2 = (!l || DateUtils.r(l, System.currentTimeMillis()) > obj.p.mDaysOfUncheckSubmitOrder)? 1: 0;
       }
       obj3 = this.P8();
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[9];
          objArray[i] = Boolean.valueOf(p0);
          objArray[1] = paymentMetho;
          objArray[2] = Boolean.valueOf(b);
          objArray[3] = str3;
          objArray[4] = str;
          objArray[5] = Integer.valueOf(b1);
          objArray[6] = Integer.valueOf(b2);
          objArray[7] = obj3;
          objArray[8] = str2;
          if (PatchProxy.applyVoid(objArray, installment, om, "30")) {
          label_018d :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SUBMIT_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("is_able_button", Integer.valueOf(p0));
       if (paymentMetho != null) {
          mName = paymentMetho.mName;
          if (mName != null) {
          label_0132 :
             oi3.d("pay_method", mName);
             oi3.c("is_default", Integer.valueOf(b));
             if (str == null) {
                str = str1;
             }
             oi3.d("button_name", str);
             if (paymentMetho != null) {
                installment = paymentMetho.getSelectedInstallment();
             }
             m.f(oi3, installment, str3);
             m.b(oi3, obj3);
             oi3.c("is_focus_show", Integer.valueOf(b1));
             oi3.c("is_focus_default", Integer.valueOf(b2));
             if (!TextUtils.x(str2)) {
                oi3.d("unable_reason", str2);
             }
             uElementPack.params = oi3.e();
             ClickMetaData uClickMetaDa = new ClickMetaData();
             uClickMetaDa.setType(1);
             uClickMetaDa.setElementPackage(uElementPack);
             uClickMetaDa.setContentPackage(new ClientContent$ContentPackage());
             u1.B(uClickMetaDa);
             goto label_018d ;
          }
       }
       mName = str1;
       goto label_0132 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.s = p0.findViewById(0x7f0a42a6);
       this.t = p0.findViewById(0x7f0a30b2);
       this.s.setOnClickListener(new c$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       BottomBarModel uBottomBarMo = this.q8(BottomBarModel.class);
       this.p = uBottomBarMo;
       this.q = uBottomBarMo.mCanSale;
       return;
    }
}
