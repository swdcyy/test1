package com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$b;
import com.kuaishou.merchant.transaction.base.widget.paylist.PayListPanelView$f;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.SparseBooleanArray;
import k2b.e0;
import em4.m;
import com.kuaishou.merchant.transaction.base.model.BankCard;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo$Installment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import em4.a;
import com.kuaishou.merchant.transaction.base.model.PayAgreement;
import com.kuaishou.merchant.transaction.purchase.presenter.e$c;
import com.kuaishou.merchant.transaction.purchase.presenter.g$a;
import com.kuaishou.merchant.transaction.purchase.MerchantPurchaseFragment;
import com.kuaishou.merchant.transaction.base.model.SubCashierConfig;

public class PaymentMethodPanelPresenter$b implements PayListPanelView$f	// class@000956
{
    public final PaymentMethodPanelPresenter a;

    public void PaymentMethodPanelPresenter$b(PaymentMethodPanelPresenter p0){
       this.a = p0;
       super();
    }
    public void a(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PaymentMethodPanelPresenter$b.class, "6")) {
          return;
       }
       if (p0 != null && !this.a.p.get(1)) {
          m.t(this.a.x, p0);
          this.a.p.put(1, 1);
       }
       return;
    }
    public void b(PaymentMethodInfo p0,PaymentMethodInfo p1,BankCard p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PaymentMethodPanelPresenter$b.class, "2")) {
          return;
       }
       PaymentMethodPanelPresenter$b ta = this.a;
       m.i(ta.t.mPrevPageSelectedPayMethod, p1, p1.isServerSelectedAtMainLevel(ta.z), p1.getSelectedInstallment());
       if (p0 != null && !TextUtils.n(p0.mProviderRefreshType, p1.mProviderRefreshType)) {
          PaymentMethodPanelPresenter$b ta1 = this.a;
          Objects.requireNonNull(ta1);
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, ta1, PaymentMethodPanelPresenter.class, "4")) {
             JsonObject jsonObject = new JsonObject();
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.c0("provider", p1.mProvider);
             jsonObject1.c0("providerChannelType", p1.mProviderChannelType);
             if (p2 != null) {
                jsonObject1.c0("bankCardToken", p2.mToken);
             }
             jsonObject.G("cashierAttachParam", jsonObject1);
             ta1.F.e5(1000, jsonObject);
          }
          return;
       }else {
          this.a.D.c(p1.mAgreement);
          this.a.E.a(p1);
          return;
       }
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, PaymentMethodPanelPresenter$b.class, "4")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void d(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PaymentMethodPanelPresenter$b.class, "5")) {
          return;
       }
       PaymentMethodPanelPresenter$b ta = this.a;
       m.i(ta.t.mPrevPageSelectedPayMethod, p0, p0.isServerSelectedAtMainLevel(ta.z), p0.getSelectedInstallment());
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PaymentMethodPanelPresenter$b.class, "1")) {
          return;
       }
       PaymentMethodPanelPresenter$b ta = this.a;
       ta.G = true;
       PaymentMethodPanelPresenter x = ta.x;
       Objects.requireNonNull(x);
       if (!PatchProxy.applyVoid(objArray, x, MerchantPurchaseFragment.class, "26")) {
          JsonElement jsonElement = x.w.e0("cashierParam");
          if (jsonElement instanceof JsonObject) {
             jsonElement.z0("installmentProductNo");
             jsonElement.z0("selectedPurchaseNo");
          }
       }
       return;
    }
    public void f(PaymentMethodInfo p0){
    }
    public void g(PaymentMethodInfo p0,SubCashierConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PaymentMethodPanelPresenter$b.class, "3")) {
          return;
       }
       if (p0 != null && p1 != null) {
          PaymentMethodPanelPresenter$b ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, ta, PaymentMethodPanelPresenter.class, "5")) {
             JsonObject jsonObject = new JsonObject();
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.c0("provider", p0.mProvider);
             jsonObject1.c0("providerChannelType", p0.mProviderChannelType);
             jsonObject1.c0("subCashierConfigScene", p1.mSubCashierConfigScene);
             jsonObject.G("cashierAttachParam", jsonObject1);
             ta.F.e5(1000, jsonObject);
          }
       }
       return;
    }
}
