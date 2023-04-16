package com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.c$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.c;
import android.view.View;
import sk4.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.BuyButtonModel;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.BuyButton;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import com.kuaishou.merchant.transaction.base.sku.SkuInfo;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import androidx.fragment.app.Fragment;
import bo4.b;
import ue4.g;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ue4.d;
import com.kuaishou.merchant.transaction.base.dynamic.form.DyFormCallBackData;
import android.widget.TextView;
import ij4.d;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo$Installment;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class c$a extends m	// class@000793
{
    public final c c;

    public void c$a(c p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       String str2;
       boolean b;
       ClientEvent$ElementPackage obj = this;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, obj, c$a.class, "1")) {
          return;
       }
       BuyButtonModel mBuyButton = obj.c.y.mBuyButton;
       if (mBuyButton != null && mBuyButton.mCanClick == null) {
          return;
       }
       a.d(MerchantTransactionLogBiz.PURCHASE_PANEL_V2, "BuyButtonPresenter", "onBuyButtonClick");
       c$a c = obj.c;
       String str = "";
       c.G = str;
       c y = c.y;
       if (y != null) {
          BuyButtonModel mBuyButton1 = y.mBuyButton;
          if (mBuyButton1 != null) {
             c.G = mBuyButton1.mBtnClickInterceptLogReason;
          }
       }
       c.o9();
       c f = obj.c.F;
       Object[] obj1 = null;
       BuyButton obj2 = PatchProxy.applyOneRefs(f, obj1, uob, "3");
       String str1 = "data";
       if (obj2 != patchProxyRe) {
       }else {
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.c0("type", "getStashPageData");
          jsonObject1.c0(str1, "stashSelectedSkuInfo");
          obj2 = g.b(b.a(f, jsonObject1.toString()), SkuInfo.class);
       }
       c = obj.c;
       Objects.requireNonNull(c);
       c uoc = PatchProxy.apply(obj1, c, c.class, "5");
       if (uoc != patchProxyRe) {
       }else if(!TextUtils.x(c.G)){
          uoc = c.G;
       }else {
          DyFormCallBackData uDyFormCallB = d.a.b(c.F);
          uoc = (uDyFormCallB == null)? str: uDyFormCallB.invalidateReason;
       }
       c = obj.c;
       c f1 = c.F;
       SkuInfo mSkuId = (obj2 != null)? obj2.mSkuId: 0;
       obj2 = c.y.mBuyButton.mCanClick;
       if (c.B.getText() != null) {
          str = obj.c.B.getText().toString();
       }
       JsonObject serverParams = obj.c.y.getServerParams();
       if (PatchProxy.isSupport(d.class)) {
          obj1 = new Object[]{f1,Long.valueOf(mSkuId),Integer.valueOf(obj2),str,uoc,serverParams};
          str2 = str1;
          if (PatchProxy.applyVoid(obj1, null, d.class, "7")) {
          label_01bd :
             return;
          }
       }else {
          str2 = str1;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = "SUBMIT_BUTTON";
       i3 oi3 = i3.f();
       d.a(oi3, serverParams);
       oi3.d("click_status", String.valueOf(obj2));
       oi3.d("button_name", str);
       oi3.d("unable_reason", uoc);
       oi3.c("sku_id", Long.valueOf(mSkuId));
       PaymentMethodInfo obj3 = PatchProxy.applyOneRefs(f1, null, uob, "5");
       if (obj3 != patchProxyRe) {
          b = obj3.booleanValue();
       }else {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("type", "getStashPageData");
          jsonObject.c0(str2, "serverPayMethod");
          obj3 = g.b(b.a(f1, jsonObject.toString()), PaymentMethodInfo.class);
          b = (obj3 != null)? obj3.equals(b.b(f1)): 1;
       }
       oi3.c("is_default", Integer.valueOf(b));
       obj3 = b.b(f1);
       if (obj3 != null) {
          PaymentMethodInfo$Installment selectedInst = obj3.getSelectedInstallmentRule();
          if (selectedInst != null) {
             oi3.d("periods", selectedInst.mInstallmentNumDesc);
             oi3.c("is_default_periods", Integer.valueOf(selectedInst.mSelected));
          }
          oi3.d("pay_method", obj3.mName);
       }
       obj.params = oi3.e();
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setType(1);
       uClickMetaDa.setElementPackage(obj);
       uClickMetaDa.setLogPage(d.b(f1));
       uClickMetaDa.setContentPackage(new ClientContent$ContentPackage());
       u1.B(uClickMetaDa);
       goto label_01bd ;
    }
}
