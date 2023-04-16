package com.kuaishou.merchant.transaction.purchase.presenter.SubmitButtonPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.purchase.presenter.SubmitButtonPresenter$3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.kuaishou.merchant.transaction.purchase.model.BuyButton;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import um4.q2;
import android.view.View$OnClickListener;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;
import com.kuaishou.merchant.basic.model.AddressInfo;
import com.google.gson.JsonObject;
import vm4.e;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import com.kuaishou.merchant.transaction.purchase.presenter.a0$f;
import com.kuaishou.merchant.transaction.purchase.presenter.r$h;
import com.kwai.robust.PatchProxyResult;
import em4.m;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.PromotionEventLogParam;
import com.kuaishou.merchant.transaction.base.model.SubCashierConfig;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo$Installment;
import java.util.Set;
import java.util.Map$Entry;
import com.google.gson.JsonElement;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import k2b.e0;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.kuaishou.merchant.transaction.purchase.presenter.SubmitButtonPresenter$a;

public class SubmitButtonPresenter extends PresenterV2	// class@00095c
{
    public List A;
    public boolean B;
    public final LifecycleObserver C;
    public MerchantPurchaseFragment p;
    public r$h q;
    public a0$f r;
    public PaymentMethodPanelPresenter$d s;
    public PurchasePageParams t;
    public boolean u;
    public AddressInfo v;
    public SelectShapeTextView w;
    public View x;
    public boolean y;
    public BuyButton z;

    public void SubmitButtonPresenter(){
       super();
       this.y = true;
       this.C = new SubmitButtonPresenter$3(this);
    }
    public void E8(){
       BuyButton mText;
       SubmitButtonPresenter submitButton = SubmitButtonPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, submitButton, "3")) {
          return;
       }
       if (this.w.getVisibility()) {
          this.w.setVisibility(0);
       }
       SubmitButtonPresenter tz = this.z;
       if (tz != null && !TextUtils.isEmpty(tz.mText)) {
          this.w.setText(this.z.mText);
       }
       this.w.setEnabled(this.u);
       if (!PatchProxy.applyVoid(objArray, this, submitButton, "4")) {
          int i = (this.w.isEnabled())? 8: 0;
          if (this.x.getVisibility() != i) {
             this.x.setVisibility(i);
          }
          tz = this.x;
          Object[] objArray1 = (this.w.isEnabled())? objArray: new q2(this);
          tz.setOnClickListener(objArray1);
       }
       if (!PatchProxy.applyVoid(objArray, this, submitButton, "5")) {
          if (this.y != null) {
             submitButton = this.u;
             SubmitButtonPresenter tz1 = this.z;
             if (tz1 != null) {
                mText = tz1.mText;
                if (mText != null) {
                label_0085 :
                   this.R8(submitButton, mText);
                }
             }
             mText = "Ã·Ωª∂©µ•";
             goto label_0085 ;
          }
          this.y = false;
          this.B = true;
          submitButton = this.p;
          if (submitButton.M != null) {
             submitButton.getLifecycle().addObserver(this.C);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SubmitButtonPresenter.class, "6")) {
          return;
       }
       SubmitButtonPresenter tp = this.p;
       if (tp.M != null) {
          tp.getLifecycle().removeObserver(this.C);
       }
       return;
    }
    public void P8(boolean p0,String p1){
       String obj1;
       boolean b1;
       Iterator iterator;
       Map$Entry uEntry;
       Iterator iterator1;
       ClientEvent$ElementPackage obj = this;
       String str = p1;
       SubmitButtonPresenter submitButton = SubmitButtonPresenter.class;
       if (PatchProxy.isSupport(submitButton) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), str, obj, submitButton, "8")) {
          return;
       }
       PaymentMethodInfo paymentMetho = obj.s.a();
       SubmitButtonPresenter v = obj.v;
       long l = (v == null)? 0: v.mAddressId;
       JsonObject jsonObject = e.c("MerchantPurchaseCommitLogData");
       int i = 0;
       boolean b = (paymentMetho != null && paymentMetho.isServerSelectedAtMainLevel(obj.s.b()))? true: false;
       PurchasePageParams mPrevPageSel = obj.t.mPrevPageSelectedPayMethod;
       JsonObject jsonObject1 = obj.r.c();
       SubmitButtonPresenter a = obj.A;
       SubmitButtonPresenter q = obj.q;
       String str1 = "";
       String str2 = (q == null)? str1: q.a();
       if (PatchProxy.isSupport(m.class)) {
          Object[] objArray = new Object[10];
          objArray[i] = Boolean.valueOf(p0);
          objArray[1] = Long.valueOf(l);
          objArray[2] = jsonObject;
          objArray[3] = paymentMetho;
          objArray[4] = Boolean.valueOf(b);
          objArray[5] = mPrevPageSel;
          objArray[6] = jsonObject1;
          objArray[7] = a;
          objArray[8] = str;
          objArray[9] = str2;
          if (PatchProxy.applyVoid(objArray, null, m.class, "11")) {
          label_01f7 :
             return;
          }
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "SUBMIT_BUTTON";
       i3 oi3 = i3.f();
       String str3 = str1;
       oi3.c("is_able_button", Integer.valueOf(p0));
       oi3.c("address_id", Long.valueOf(l));
       if (paymentMetho != null) {
          PaymentMethodInfo mName = paymentMetho.mName;
          if (mName != null) {
          label_00cd :
             oi3.d("pay_method", mName);
             oi3.c("is_default", Integer.valueOf(b));
             obj1 = PatchProxy.applyOneRefs(a, null, m.class, "26");
             if (obj1 != PatchProxyResult.class) {
                b1 = obj1.booleanValue();
             }else if(q.f(a)){
                iterator1 = a.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      PromotionEventLogParam promotionEve1 = iterator1.next();
                      if (promotionEve1.mPromotionType == 8 && promotionEve1.mSelected != null) {
                         b1 = true;
                         break ;
                      }
                   }
                }
             }
             b1 = false;
             oi3.a("is_happy_bean", Boolean.valueOf(b1));
             obj1 = PatchProxy.applyOneRefs(a, null, m.class, "27");
             if (obj1 != PatchProxyResult.class) {
                i = obj1.booleanValue();
             }else if(q.f(a)){
                iterator1 = a.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      PromotionEventLogParam promotionEve = iterator1.next();
                      if (promotionEve.mPromotionType == 7 && promotionEve.mSelected != null) {
                         i = 1;
                         break ;
                      }
                   }
                }
             }
             i = 0;
             oi3.c("jinxian_stutas", Integer.valueOf(i));
             if (str == null) {
                str = str3;
             }
             oi3.d("button_name", str);
             if (paymentMetho != null && paymentMetho.getSelectedSubCashierConfig() != null) {
                oi3.d("sub_pay_method", paymentMetho.getSelectedSubCashierConfig().mName);
             }
             PaymentMethodInfo$Installment selectedInst = (paymentMetho != null)? paymentMetho.getSelectedInstallment(): null;
             m.f(oi3, selectedInst, mPrevPageSel);
             if (jsonObject != null) {
                iterator = jsonObject.entrySet().iterator();
                while (iterator.hasNext()) {
                   uEntry = iterator.next();
                   obj1 = uEntry.getKey();
                   oi3.d(obj1, uEntry.getValue().toString());
                }
             }
             if (!TextUtils.x(str2)) {
                oi3.d("unable_reason", str2);
             }
             if (jsonObject1 != null) {
                iterator = jsonObject1.entrySet().iterator();
                while (iterator.hasNext()) {
                   uEntry = iterator.next();
                   obj1 = uEntry.getKey();
                   oi3.d(obj1, uEntry.getValue().toString());
                }
             }
             obj.params = oi3.e();
             ClickMetaData uClickMetaDa = new ClickMetaData();
             uClickMetaDa.setType(1);
             uClickMetaDa.setElementPackage(obj);
             uClickMetaDa.setContentPackage(new ClientContent$ContentPackage());
             u1.B(uClickMetaDa);
             goto label_01f7 ;
          }
       }
       obj1 = str3;
       goto label_00cd ;
    }
    public void R8(boolean p0,String p1){
       PaymentMethodInfo mName;
       Object obj = this;
       String str = p1;
       SubmitButtonPresenter submitButton = SubmitButtonPresenter.class;
       if (PatchProxy.isSupport(submitButton) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), str, obj, submitButton, "7")) {
          return;
       }
       PaymentMethodInfo paymentMetho = obj.s.a();
       SubmitButtonPresenter v = obj.v;
       long l = (v == null)? 0: v.mAddressId;
       int i = 1;
       int i1 = 0;
       boolean b = (paymentMetho != null && paymentMetho.isServerSelectedAtMainLevel(obj.s.b()))? true: false;
       PurchasePageParams mPrevPageSel = obj.t.mPrevPageSelectedPayMethod;
       SubmitButtonPresenter z = obj.z;
       String str1 = (z == null)? "": z.mBtnUnableReason;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Long.valueOf(l),paymentMetho,Boolean.valueOf(b),mPrevPageSel,str,str1};
          if (PatchProxy.applyVoid(objArray, null, om, "10")) {
          label_00de :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SUBMIT_BUTTON";
       i3 oi3 = i3.f();
       oi3.c("is_able_button", Integer.valueOf(p0));
       oi3.c("address_id", Long.valueOf(l));
       if (paymentMetho != null) {
          mName = paymentMetho.mName;
          if (mName != null) {
          label_00a4 :
             oi3.d("pay_method", mName);
             oi3.c("is_default", Integer.valueOf(b));
             if (str == null) {
                str = "";
             }
             oi3.d("button_name", str);
             if (!TextUtils.x(str1)) {
                oi3.d("unable_reason", str1);
             }
             PaymentMethodInfo$Installment selectedInst = (paymentMetho != null)? paymentMetho.getSelectedInstallment(): null;
             m.f(oi3, selectedInst, mPrevPageSel);
             uElementPack.params = oi3.e();
             u1.C0("", null, 6, uElementPack, new ClientContent$ContentPackage());
             goto label_00de ;
          }
       }
       mName = "";
       goto label_00a4 ;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SubmitButtonPresenter.class, "2")) {
          return;
       }
       this.w = p0.findViewById(0x7f0a42a6);
       this.x = p0.findViewById(0x7f0a30b2);
       this.w.setOnClickListener(new SubmitButtonPresenter$a(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SubmitButtonPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("order_service");
       this.r = this.r8("follow_ks_shop_upload_service");
       this.s = this.r8("payment_method_service");
       this.u = this.v8("can_sale", Boolean.class).booleanValue();
       this.v = this.t8("address_id");
       this.t = this.r8("page_params");
       this.z = this.t8("buy_button");
       this.A = this.t8("promotion_log_params");
       return;
    }
}
