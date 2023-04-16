package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i$f;
import qi4.e;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.transaction.base.model.PayResultQueryResponse;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.OrderPaymentRequestInfo;
import androidx.fragment.app.FragmentActivity;
import rk0.b;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.transaction.base.model.payment.CashierData;
import k2b.e0;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import p74.a;
import o74.a;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse;
import com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse$Data;
import dk4.a$a;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseAuthData;
import com.kuaishou.merchant.transaction.live.base.pay.PurchasePanelCreateOrderUnionResponse$CreateOrderUnionData;
import com.kuaishou.merchant.transaction.base.live.model.PurchaseCreateOrderUnionResponse$VerifyInfo;
import ak4.a$a;
import dk4.a;
import com.kwai.library.widget.popup.common.c;
import ck4.a$a;
import ck4.a;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.model.PageInfoReqParam;
import java.lang.Integer;
import nk4.i0;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.CharSequence;
import qi4.d;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import ue4.n;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.util.HashMap;
import com.yxcorp.gateway.pay.params.PayResult$PaySdKElapsedTime;
import java.lang.Long;
import com.kuaishou.merchant.transaction.base.model.PaymentMethodInfo;
import java.util.Map;
import je4.a;

public class i$f implements e	// class@00082a
{
    public final i a;

    public void i$f(i p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, i$f.class, "9")) {
          return;
       }
       this.a.x9(true);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, i$f.class, "10")) {
          return;
       }
       this.a.W8();
       return;
    }
    public void c(String p0,String p1,PayResultQueryResponse p2){
       i this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i$f.class, "4")) {
          return;
       }
       i$f ta = this.a;
       if (ta.y != null) {
          i v = ta.V;
          if (v != null && v.mCashierData != null) {
             a uoa = b.a(ta.P8());
             ClientContent$LiveStreamPackage liveStreamPa = this.a.h9();
             ta = this.a;
             i z = ta.z;
             this = ta.y;
             ta = 1;
             int i = (p2 == null || p2.mBuyResultType == ta)? 1: 3;
             uoa.I(liveStreamPa, z, this, i, TextUtils.k(p0), this.a.V.mCashierData.mProvider);
             return;
          }
       }
       a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmPanelBottomBarPresenter", "onRequestCheckResultSuccess: field null");
       return;
    }
    public boolean d(Throwable p0){
       boolean b;
       a$a uoa;
       a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       i$f obj = PatchProxy.applyOneRefs(p0, this, i$f.class, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       i oi = i.class;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, oi, "71");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.P8().isFinishing() || !p0 instanceof KwaiException){
          KwaiException mErrorCode = p0.mErrorCode;
          if (mErrorCode == 4122 || mErrorCode == 4123) {
             KwaiException mResponse = p0.mResponse;
             if (mResponse != null && (mResponse.a() instanceof PurchasePanelCreateOrderUnionResponse && p0.mResponse.a().mData != null)) {
                PurchasePanelCreateOrderUnionResponse$Data mOrderData = p0.mResponse.a().mData.mOrderData;
                if (mOrderData != null) {
                   obj.W8();
                   if (mErrorCode == 4122) {
                      if (!PatchProxy.applyVoidOneRefs(mOrderData, obj, oi, "72")) {
                         uoa = new a$a(obj.P8());
                         uoa.v(true);
                         uoa.Z0(new PurchaseAuthData(mOrderData.mVerifyInfo));
                         uoa1 = uoa.a1();
                         obj.Z = uoa1;
                         uoa1.Z();
                      }
                   }else if(PatchProxy.applyVoidOneRefs(mOrderData, obj, oi, "73")){
                      uoa = new a$a(obj.P8());
                      uoa.v(true);
                      uoa.Z0(new PurchaseAuthData(mOrderData.mVerifyInfo));
                      uoa1 = uoa.a1();
                      obj.Z = uoa1;
                      uoa1.Z();
                   }
                   b = true;
                }
             }
          }
       }
       b = false;
       return b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, i$f.class, "6")) {
          return;
       }
       i$f ta = this.a;
       i u = ta.U;
       if (u == null) {
          a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmPanelBottomBarPresenter", "onRequestPriceErrorToRefreshBusinessData: mPriceRequestInfo null");
          return;
       }else {
          u.mReselectedEventType = 3;
          ta.B9(u, true);
          return;
       }
    }
    public void f(String p0,int p1){
       i$f uof = i$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "3")) {
          return;
       }
       uof = this.a;
       if (uof.y != null) {
          i v = uof.V;
          if (v != null && v.mCashierData != null) {
             i e = uof.E;
             if (e != null) {
                e.postDelayed(new i0(this, p1, p0), 100);
             }
             return;
          }
       }
       a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmPanelBottomBarPresenter", "onPaySdkResult: field null");
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$f.class, "11")) {
          return;
       }
       i r = this.a.R;
       if (r instanceof ProgressFragment) {
          r.Jh(p0);
       }
       return;
    }
    public boolean h(){
       return d.d(this);
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, i$f.class, "13")) {
          return;
       }
       i$f ta = this.a;
       ta.U.mNotUseUnownedCoupon = true;
       ta.z.J.D = true;
       this.e();
       return;
    }
    public void j(String p0,String p1){
       Object obj = this;
       OrderPaymentRequestInfo obj1 = p0;
       if (PatchProxy.applyVoidTwoRefs(obj1, p1, obj, i$f.class, "1")) {
          return;
       }
       n.a(1, obj1);
       i$f a = obj.a;
       if (a.y != null) {
          i v = a.V;
          if (v != null && v.mCashierData != null) {
             a = obj.a;
             FeedLogCtx uFeedLogCtx = a.e9();
             obj1 = obj.a.V.mCashierData;
             b.a(a.P8()).J(obj.a.h9(), a.z, uFeedLogCtx, obj.a.y, 1, TextUtils.k(p0), obj1.mName, obj1.mIsCashierConfigDefault, obj1.mInstallmentName, obj1.mIsCashierInstallmentDefault, 1, "", null);
             return;
          }
       }
       a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmPanelBottomBarPresenter", "onRequestPaySuccess: field null");
       return;
    }
    public void k(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(i$f.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, i$f.class, "5")) {
          return;
       }
       i$f ta = this.a;
       if (ta.y != null) {
          i v = ta.V;
          if (v != null && v.mCashierData != null) {
             ta = this.a;
             b.a(ta.P8()).I(this.a.h9(), ta.z, ta.y, 2, TextUtils.k(p0), this.a.V.mCashierData.mProvider);
             return;
          }
       }
       a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmPanelBottomBarPresenter", "onRequestCheckResultFailure: field null");
       return;
    }
    public void l(int p0,String p1,HashMap p2){
       i$f uof = this;
       if (PatchProxy.isSupport(i$f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, i$f.class, "2")) {
          return;
       }
       n.a(2, "");
       i$f a = uof.a;
       if (a.y != null) {
          i v = a.V;
          if (v != null && v.mCashierData != null) {
             a = uof.a;
             FeedLogCtx uFeedLogCtx = a.e9();
             a = uof.a;
             OrderPaymentRequestInfo mCashierData = a.V.mCashierData;
             b.a(a.P8()).J(uof.a.h9(), a.z, uFeedLogCtx, a.y, 2, "", mCashierData.mName, mCashierData.mIsCashierConfigDefault, mCashierData.mInstallmentName, mCashierData.mIsCashierInstallmentDefault, p0, p1, p2);
             return;
          }
       }
       a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, "LiveAudienceOrderConfirmPanelBottomBarPresenter", "onRequestPayFailure: field null");
       return;
    }
    public void m(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$f.class, "7")) {
          return;
       }
       this.a.X8(p0);
       return;
    }
    public void n(int p0,long p1,long p2,long p3,long p4,PayResult$PaySdKElapsedTime p5,long p6,long p7,String p8){
       i$f uof = this;
       object oobject = p5;
       object oobject1 = p8;
       i$f uof1 = i$f.class;
       if (PatchProxy.isSupport(uof1)) {
          Object[] objArray = new Object[9];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = Long.valueOf(p1);
          objArray[2] = Long.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[4] = Long.valueOf(p4);
          objArray[5] = oobject;
          objArray[6] = Long.valueOf(p6);
          objArray[7] = Long.valueOf(p7);
          objArray[8] = oobject1;
          if (PatchProxy.applyVoid(objArray, this, uof1, "16")) {
             return;
          }
       }
       if (!TextUtils.x(p8)) {
          String str = null;
          if (p1 - str > 0) {
             PaymentMethodInfo selectedPaym = uof.a.y.getSelectedPaymentInfo();
             HashMap hashMap = new HashMap();
             String str1 = (selectedPaym != null)? "frontCashier": "defaultCashier";
             hashMap.put("cashierType", str1);
             hashMap.put("payPage", "halfScreenSubmitOrderPage");
             if (selectedPaym != null) {
                hashMap.put("paymentMethod", selectedPaym.mPaymentMethod);
                hashMap.put("provider", selectedPaym.mProvider);
                hashMap.put("providerChannelType", selectedPaym.mProviderChannelType);
             }
             hashMap.put("payFlowControl", Integer.valueOf(p0));
             hashMap.put("startPayTimeStamp", Long.valueOf(p1));
             long l = p2 - p1;
             if (l - str > 0) {
                hashMap.put("shopOrderResponse", Long.valueOf(l));
             }
             l = p3 - p1;
             if (l - str > 0) {
                hashMap.put("shopPreCreateResponse", Long.valueOf(l));
             }
             l = p4 - p1;
             if (l - str > 0) {
                hashMap.put("shopPaySDKStart", Long.valueOf(l));
             }
             if (oobject != null) {
                PayResult$PaySdKElapsedTime paySDKStartA = oobject.paySDKStartApp;
                if ((paySDKStartA - p1) - str > 0) {
                   hashMap.put("paySDKStartApp", Long.valueOf((paySDKStartA - p1)));
                }
                paySDKStartA = oobject.paySDKEndApp;
                if ((paySDKStartA - p1) - str > 0) {
                   hashMap.put("paySDKEndApp", Long.valueOf((paySDKStartA - p1)));
                }
                paySDKStartA = oobject.paySDKQueryResultCompleted;
                if ((paySDKStartA - p1) - str > 0) {
                   hashMap.put("paySDKQueryResultCompleted", Long.valueOf((paySDKStartA - p1)));
                }
             }
             l = p6 - p1;
             if (l - str > 0) {
                hashMap.put("shopPaySDKCompleted", Long.valueOf(l));
             }
             l = p7 - p1;
             if (l - str > 0) {
                hashMap.put("shopQueryResultCompleted", Long.valueOf(l));
             }
             hashMap.put("shopPayResult", oobject1);
             a.a(hashMap);
          }
       }
       return;
    }
    public boolean o(PayResultQueryResponse p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i$f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.k9(p0, p1);
    }
    public void p(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$f.class, "14")) {
          return;
       }
       this.a.C.E = p0;
       this.e();
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, i$f.class, "8")) {
          return;
       }
       this.a.y9();
       return;
    }
}
