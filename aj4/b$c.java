package aj4.b$c;
import com.kuaishou.merchant.transaction.base.dynamic.component.payment.CashierView$e;
import aj4.b;
import java.lang.Object;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.List;
import androidx.fragment.app.Fragment;
import rk0.b;
import ij4.d;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.model.SubCashierConfig;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.Number;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.merchant.transaction.base.model.BankCard;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.lang.CharSequence;
import md4.h;
import md4.h$a;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo$Installment;
import java.util.Objects;
import com.google.gson.JsonArray;

public final class b$c implements CashierView$e	// class@000088
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void a(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "7")) {
          return;
       }
       if (p0 == null || (!q.f(p0.mSubCashierConfigs) && !this.a.F.contains(p0.mName))) {
          this.a.F.add(p0.mName);
          Fragment uFragment = this.a.R8();
          if (!PatchProxy.applyVoidTwoRefs(uFragment, p0, null, d.class, "17")) {
             Iterator iterator = p0.mSubCashierConfigs.iterator();
             while (iterator.hasNext()) {
                SubCashierConfig subCashierCo = iterator.next();
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "SUBPAY_METHOD";
                i3 oi3 = i3.f();
                oi3.d("pay_method", TextUtils.k(p0.mName));
                oi3.d("sub_pay_method", TextUtils.k(subCashierCo.mName));
                oi3.c("is_default", Integer.valueOf(subCashierCo.mOriginalSelected));
                uElementPack.params = oi3.e();
                u1.C0("", d.b(uFragment), 3, uElementPack, new ClientContent$ContentPackage());
             }
          }
       }
       return;
    }
    public void b(PaymentMethodInfo p0,PaymentMethodInfo p1,BankCard p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$c.class, "1")) {
          return;
       }
       Fragment uFragment = this.a.R8();
       if (!PatchProxy.applyVoidTwoRefs(uFragment, p1, null, d.class, "12")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "PAY_MODULE";
          uElementPack.params = d.c(p1).toString();
          u1.L("", d.b(uFragment), 1, uElementPack, new ClientContent$ContentPackage());
       }
       this.a.u9(p1);
       if (p0 != null && !TextUtils.n(p0.mProviderRefreshType, p1.mProviderRefreshType)) {
          h.b.a(this.a.R8()).p0(p0);
          this.a.a1();
          a.s(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "LivePaymentPresenter", "payment changed, refresh page");
          return;
       }else {
          this.a.s9();
          return;
       }
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "4")) {
          return;
       }
       this.a.q9();
       return;
    }
    public void d(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "6")) {
          return;
       }
       this.a.u9(p0);
       Fragment uFragment = this.a.R8();
       if (!PatchProxy.applyVoidTwoRefs(uFragment, p0, null, d.class, "16")) {
          PaymentMethodInfo$Installment selectedInst = p0.getSelectedInstallment();
          if (selectedInst != null) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PAY_PERIODS_MODULE";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("pay_method", p0.mName);
             jsonObject.c0("periods", selectedInst.mInstallmentNumDesc);
             jsonObject.a0("is_default_periods", Integer.valueOf(selectedInst.mOriginalSelected));
             uElementPack.params = jsonObject.toString();
             u1.L("", d.b(uFragment), 1, uElementPack, new ClientContent$ContentPackage());
          }
       }
       return;
    }
    public void e(){
       this.a.G = true;
    }
    public void f(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "5")) {
          return;
       }
       b$c ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, b.class, "10") || (p0 == null || (p0.mInstallmentList != null && !ta.D.contains(p0.mName)))) {
          ta.D.add(p0.mName);
          Fragment uFragment = ta.R8();
          if (!PatchProxy.applyVoidTwoRefs(uFragment, p0, null, d.class, "15")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PAY_PERIODS_MODULE";
             JsonArray jsonArray = new JsonArray();
             Iterator iterator = p0.mInstallmentList.iterator();
             while (iterator.hasNext()) {
                PaymentMethodInfo$Installment installment = iterator.next();
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("periods", installment.mInstallmentNumDesc);
                jsonObject.a0("is_default_periods", Integer.valueOf(installment.mOriginalSelected));
                jsonArray.G(jsonObject);
             }
             JsonObject jsonObject1 = new JsonObject();
             jsonObject1.c0("pay_method", p0.mName);
             jsonObject1.G("pay_method_period_list", jsonArray);
             uElementPack.params = jsonObject1.toString();
             u1.C0("", d.b(uFragment), 3, uElementPack, new ClientContent$ContentPackage());
          }
       }
    label_00a6 :
       return;
    }
    public void g(PaymentMethodInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "2")) {
          return;
       }
       this.a.u9(p0);
       return;
    }
    public void h(PaymentMethodInfo p0,PaymentMethodInfo p1,SubCashierConfig p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$c.class, "3")) {
          return;
       }
       this.a.u9(p1);
       if (p1 != null && p2 != null) {
          if (p0 != null) {
             h.b.a(this.a.R8()).p0(p0);
          }
          this.a.a1();
       }
       return;
    }
}
