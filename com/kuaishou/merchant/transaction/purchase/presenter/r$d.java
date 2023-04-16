package com.kuaishou.merchant.transaction.purchase.presenter.r$d;
import com.kuaishou.merchant.transaction.base.net.error.c;
import com.kuaishou.merchant.transaction.purchase.presenter.r;
import android.app.Activity;
import com.google.gson.JsonObject;
import com.kuaishou.merchant.transaction.base.pay.OrderEventProcessor;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vm4.c;
import ue4.p;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import com.yxcorp.retrofit.model.KwaiException;
import p74.a;
import o74.a;
import em4.m;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import com.kuaishou.merchant.transaction.purchase.presenter.PaymentMethodPanelPresenter$d;
import com.kuaishou.merchant.transaction.base.live.model.PurchasePageParams;
import k2b.e0;
import java.lang.Integer;
import java.lang.Number;
import njd.a;
import com.kuaishou.merchant.transaction.base.net.error.PromptBean;
import com.kuaishou.merchant.transaction.base.net.error.PromptBean$PromptData;
import android.text.TextUtils;
import ie4.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse$Data;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.transaction.purchase.presenter.s;
import java.lang.Runnable;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseAuthData;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse$VerifyInfo;
import com.kuaishou.merchant.transaction.base.authority.PurchaseAuthDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.merchant.transaction.base.payment.PrepayData;

public class r$d extends c	// class@0009a0
{
    public boolean f;
    public JsonObject g;
    public OrderEventProcessor h;
    public final r i;

    public void r$d(r p0,Activity p1,boolean p2,JsonObject p3,OrderEventProcessor p4){
       this.i = p0;
       super(p1);
       this.f = p2;
       this.g = p3;
       this.h = p4;
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       String str3;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, r$d.class, "2")) {
          return;
       }
       super.b(p0);
       String str = p.a(obj1, c.a());
       if (!TextUtils.x(str)) {
          str = "\n"+str;
       }
       MerchantTransactionLogBiz pURCHASE = MerchantTransactionLogBiz.PURCHASE;
       StringBuilder str1 = "CreateOrderError: ";
       v5 = obj1 instanceof KwaiException;
       String str2 = null;
       if (v5) {
          str3 = "code "+obj1.mErrorCode;
       }else if(obj1 != null){
          str3 = "cause "+p0.getCause();
       }else {
          str3 = str2;
       }
       a.g(pURCHASE, "CreateOrderPresenter", str1+str3+str);
       m.l(p0);
       r i = obj.i.I;
       if (v5) {
          str2 = obj1.mErrorCode+"";
       }
       String str4 = str2;
       r$d i1 = obj.i;
       r r = i1.R;
       boolean b = (r != null && r.isServerSelectedAtMainLevel(i1.t.b()))? true: false;
       PurchasePageParams mPrevPageSel = obj.i.K.mPrevPageSelectedPayMethod;
       String str5 = (obj1 == null)? "": p0.getMessage();
       m.k(i, 2, 0, str4, r, b, mPrevPageSel, 0, str5);
       return;
    }
    public void c(int p0,String p1,Throwable p2){
       PromptBean$PromptData mConfirmActi;
       r$d uod = r$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, r$d.class, "10")) {
          return;
       }
       super.c(p0, p1, p2);
       if (p0 != -3) {
          if (p0 != 1003) {
             int i = 1000;
             if (p0 != i) {
                if (p0 == 1001 && !PatchProxy.applyVoid(null, this, uod, "11")) {
                   this.g.a0("freightInsurance", Integer.valueOf(1));
                   this.i.R8(1, 1, this.g);
                }
             }else if(p2 instanceof KwaiException){
                KwaiException mResponse = p2.mResponse;
                if (mResponse != null && mResponse.a() instanceof PromptBean) {
                   PromptBean promptBean = p2.mResponse.a();
                   if (promptBean != null) {
                      PromptBean mPromptData = promptBean.mPromptData;
                      if (mPromptData != null && !TextUtils.x(mPromptData.mConfirmActionData)) {
                         mConfirmActi = promptBean.mPromptData.mConfirmActionData;
                      label_007b :
                         this.i.S8(i, mConfirmActi);
                      }
                   }
                }
             }
             mConfirmActi = "";
             goto label_007b ;
          }else {
             this.i.S8(1003, p1);
          }
       }else if(!TextUtils.isEmpty(p1) && this.d() != null){
          b.a(this.d(), TextUtils.c(p1, "identifyKey", this.i.P));
       }
       return;
    }
    public void e(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$d.class, "1")) {
          return;
       }
       r$d th = this.h;
       if (th != null) {
          th.c(p0);
       }
       return;
    }
    public void f(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$d.class, "9")) {
          return;
       }
       p0.O = true;
       return;
    }
    public void g(boolean p0){
       r$d uod = r$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "8")) {
          return;
       }
       p0.O = true;
       return;
    }
    public boolean h(Throwable p0){
       KwaiException mResponse;
       Object obj4;
       Object obj = this;
       PurchaseCreateOrderUnionResponse obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       r$d uod = r$d.class;
       KwaiException obj2 = PatchProxy.applyOneRefs(obj1, obj, uod, "3");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       boolean b = false;
       if (!obj1 instanceof KwaiException) {
          return b;
       }
       obj2 = obj1.mErrorCode;
       if (obj2 == 4105 && obj.f != null) {
          JsonElement obj3 = PatchProxy.applyOneRefs(obj1, obj, uod, "5");
          if (obj3 != patchProxyRe) {
             b = obj3.booleanValue();
          }else {
             mResponse = obj1.mResponse;
             if (mResponse != null && mResponse.a() instanceof PurchaseCreateOrderUnionResponse) {
                obj1 = obj1.mResponse.a();
                PurchaseCreateOrderUnionResponse mData = obj1.mData;
                if (mData != null && !TextUtils.x(mData.mACT)) {
                   JsonObject jsonObject = new JsonObject();
                   jsonObject.c0("act", obj1.mData.mACT);
                   String str = "preCreateParam";
                   obj3 = obj.g.e0(str);
                   if (obj3 != null) {
                      jsonObject.c0(str, obj3.w());
                   }
                   str = "transparentCreateOrderParam";
                   obj3 = obj.g.e0(str);
                   if (obj3 != null) {
                      jsonObject.c0(str, obj3.w());
                   }else {
                      a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "transfer params is empty");
                   }
                   obj.i.V8(new s(obj, obj1, jsonObject));
                   b = true;
                }
             }
             a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "act value invalid while code 4105");
          }
          return b;
       }else {
          String str1 = "PurchaseVerifyDialogFragment";
          if (obj2 == 4122) {
             obj4 = PatchProxy.applyOneRefs(obj1, obj, uod, "6");
             if (obj4 != patchProxyRe) {
                b = obj4.booleanValue();
             }else if(obj.i.I != null){
                mResponse = obj1.mResponse;
                if (mResponse != null && mResponse.a() instanceof PurchaseCreateOrderUnionResponse) {
                   obj1 = obj1.mResponse.a().mData;
                   if (obj1 != null) {
                      PurchaseAuthDialogFragment.Ih(1, new PurchaseAuthData(obj1.mVerifyInfo)).show(obj.i.I.getChildFragmentManager(), str1);
                      obj.i.O = true;
                      b = true;
                   }
                }
             }
             a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "fragment null or value invalid while real name auth");
             return b;
          }else if(obj2 == 4123){
             obj4 = PatchProxy.applyOneRefs(obj1, obj, uod, "7");
             if (obj4 != patchProxyRe) {
                b = obj4.booleanValue();
             }else if(obj.i.I != null){
                mResponse = obj1.mResponse;
                if (mResponse != null && mResponse.a() instanceof PurchaseCreateOrderUnionResponse) {
                   obj1 = obj1.mResponse.a().mData;
                   if (obj1 != null) {
                      PurchaseAuthDialogFragment.Ih(2, new PurchaseAuthData(obj1.mVerifyInfo)).show(obj.i.I.getChildFragmentManager(), str1);
                      obj.i.O = true;
                      b = true;
                   }
                }
             }
             a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "fragment null or value invalid while message auth");
             return b;
          }else if(obj2 == 0x9c91){
             obj4 = PatchProxy.applyOneRefs(obj1, obj, uod, "4");
             if (obj4 != patchProxyRe) {
                b = obj4.booleanValue();
             }else {
                mResponse = obj1.mResponse;
                if (mResponse != null && mResponse.a() instanceof PurchaseCreateOrderUnionResponse) {
                   obj1 = obj1.mResponse.a().mData;
                   if (obj1 != null) {
                      r$d i = obj.i;
                      PurchaseCreateOrderUnionResponse$Data mTid = obj1.mTid;
                      PurchaseCreateOrderUnionResponse$Data mOrderDetail = obj1.mOrderDetailUrl;
                      PurchaseCreateOrderUnionResponse$Data mPrepayPassT = obj1.mPrepayPassThrough;
                      PurchaseCreateOrderUnionResponse$Data mBatchId = obj1.mBatchId;
                      PurchaseCreateOrderUnionResponse$Data mPrepayData = obj1.mPrepayData;
                      PrepayData prepayData = (mPrepayData != null)? mPrepayData.mPrePayType: 0;
                      i.W8(mTid, mOrderDetail, mPrepayPassT, mBatchId, prepayData, obj1.mPayFlowControl, obj1.mPrePayScene);
                      b = true;
                   }
                }
                a.s(MerchantTransactionLogBiz.PURCHASE, "CreateOrderPresenter", "processPrepay: value invalid while code 40081");
             }
          }
          return b;
       }
    }
}
