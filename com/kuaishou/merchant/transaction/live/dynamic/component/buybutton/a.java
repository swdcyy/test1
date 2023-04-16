package com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.a;
import qd4.a;
import id4.a;
import com.kuaishou.merchant.transaction.base.dynamic.form.FormSceneEnum;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.transaction.base.dynamic.form.DyFormCallBackData;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.bowl.core.component.a;
import com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.BuyButtonModel;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$PurchaseAgreementInfo;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import sk4.b;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse$AgreementInfo;
import java.util.Collection;
import java.util.HashSet;
import ekd.q;
import u07.t$a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import zj4.b;
import ti4.a;
import zj4.b$a;
import java.lang.CharSequence;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import ti4.b;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import ti4.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kuaishou.merchant.transaction.base.dynamic.form.DyFormCallBackData$ComponentFormModel;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.transaction.live.dynamic.component.buybutton.c;

public class a extends a implements a	// class@000791
{

    public void a(){
       super();
    }
    public DyFormCallBackData e(FormSceneEnum p0,Object p1,JsonObject p2){
       boolean b;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "2");
       if (p1 != patchProxyRe) {
          return p1;
       }
       DyFormCallBackData uDyFormCallB = null;
       if (p0 != FormSceneEnum.CREATE_ORDER) {
          return uDyFormCallB;
       }
       if (!this.getModelObj() instanceof BuyButtonModel) {
          return uDyFormCallB;
       }
       BuyButtonModel modelObj = this.getModelObj();
       p1 = PatchProxy.applyOneRefs(modelObj, this, uoa, "3");
       if (p1 != patchProxyRe) {
          b = p1.booleanValue();
       }else {
          p1 = modelObj.mPurchaseAgreementInfo;
          p1 = (p1 != null && p1.mShowAgreement != null)? 1: null;
          PaymentMethodInfo paymentMetho = b.b(this.getCurFragment());
          String str1 = (paymentMetho != null && paymentMetho.isAgreementValid())? 1: null;
          ArrayList uArrayList2 = PatchProxy.applyOneRefs(modelObj, this, uoa, "4");
          if (uArrayList2 != patchProxyRe) {
          }else {
             uArrayList2 = new ArrayList();
             Iterator iterator1 = this.s(modelObj).iterator();
             while (iterator1.hasNext()) {
                uArrayList2.add(iterator1.next().mAgreementIdentifyKey);
             }
          }
          if (p1 || (str1 && !modelObj.mSignedAgreementSet.containsAll(uArrayList2))) {
             b = true;
          }else {
             b = false;
          }
       }
       String str = "";
       if (b) {
          MerchantLivePurchasePanelResponse$PurchaseAgreementInfo purchaseAgre = PatchProxy.applyOneRefs(modelObj, this, uoa, "6");
          if (purchaseAgre != patchProxyRe) {
          }else {
             List list = this.s(modelObj);
             if (!q.f(list)) {
                ArrayList uArrayList = new ArrayList();
                ArrayList uArrayList1 = new ArrayList();
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   MerchantLivePurchasePanelResponse$AgreementInfo uAgreementIn = iterator.next();
                   uArrayList.add(uAgreementIn.mAgreementUrlText);
                   uArrayList1.add(uAgreementIn.mAgreementIdentifyKey);
                }
                t$a uoa1 = new t$a(this.getCurActivity());
                uoa1.X0(modelObj.mPurchaseAgreementInfo.mAgreementTip);
                uoa1.v0(new b(uoa1, list, new a(this, list)));
                uoa1.N0(R.layout.arg_RES_7f0d06a7);
                uoa1.O0(uArrayList);
                uoa1.S0(R.string.arg_RES_7f1033c6);
                uoa1.u0(new b(this, modelObj, uArrayList1));
                uoa1.w0(true);
                uoa1.Q0(R.string.arg_RES_7f1033c9);
                uoa1.v(true);
                uoa1.L(new PopupInterface$g(R.layout.arg_RES_7f0d02ec));
                uoa1.p();
                uoa1.Y(new c(this));
                purchaseAgre = modelObj.mPurchaseAgreementInfo.mAgreementTip;
             }
          }
          str = purchaseAgre;
       }
       if (!b) {
          uDyFormCallB = new DyFormCallBackData$ComponentFormModel("agreementInfo", modelObj.mAgreementInfo);
       }
       return new DyFormCallBackData((b ^ 0x01), uDyFormCallB, str);
    }
    public int m(){
       return 0x7f0d07b4;
    }
    public PresenterV2 q(Fragment p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "1");
       return new c(p0);
    }
    public final List s(BuyButtonModel p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       p0 = p0.mPurchaseAgreementInfo;
       if (p0 != null) {
          MerchantLivePurchasePanelResponse$PurchaseAgreementInfo mAgreementUr = p0.mAgreementUrl;
          if (mAgreementUr != null) {
             obj.addAll(mAgreementUr);
          }
       }
       PaymentMethodInfo paymentMetho = b.b(this.getCurFragment());
       if (paymentMetho != null && paymentMetho.isAgreementValid()) {
          obj.add(MerchantLivePurchasePanelResponse$AgreementInfo.from(paymentMetho));
       }
       return obj;
    }
}
