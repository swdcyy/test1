package com.yxcorp.gateway.pay.activity.FrontCashierActivity;
import fv8.b;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import java.lang.Throwable;
import com.yxcorp.gateway.pay.params.PaymentInfo;
import com.yxcorp.gateway.pay.response.CreatePayOrderResponse;
import iv8.c;
import com.yxcorp.gateway.pay.response.QueryPayResponse;
import java.lang.String;
import com.yxcorp.gateway.pay.response.GatewayPayBaseResponse;
import java.lang.Object;
import java.util.Map;
import nv8.e;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.IOException;
import java.lang.Math;
import java.lang.Integer;
import java.lang.StringBuilder;
import lv8.g;
import e17.i;
import nv8.b;
import android.app.Activity;
import nv8.d;
import com.yxcorp.gateway.pay.response.CreatePayOrderResponse$a;
import ev8.a;
import android.content.Context;
import android.os.ResultReceiver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.os.Parcelable;
import com.yxcorp.gateway.pay.service.GatewayPayApiService;
import lv8.o;
import brd.t;
import iv8.a;
import erd.o;
import gv8.e;
import gv8.g;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import gv8.l;
import java.util.HashMap;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import lv8.i;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.api.KwaiPayConfig;
import ekd.j0;
import lv8.d;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import com.google.gson.Gson;
import java.lang.Exception;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.Boolean;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gateway.pay.loading.PayLoadingView;
import android.content.res.Configuration;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import lv8.k;
import android.view.View;
import android.os.Build$VERSION;
import lv8.q;
import android.view.KeyEvent;
import gv8.d;
import gv8.j;
import gv8.h;
import com.yxcorp.gateway.pay.params.PayResult;
import ov8.c;
import ov8.b;
import nv8.a;
import com.yxcorp.gateway.pay.loading.PayLoadingDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import gv8.m;
import gv8.i;
import lv8.c;
import com.google.common.collect.ImmutableMap;
import gv8.k;
import gv8.f;
import kv8.e;
import gv8.c;

public class FrontCashierActivity extends BaseActivity implements b	// class@0011fe
{
    public boolean mH5Downgrade;
    public PayLoadingView mLoadingView;
    public String mMerchantId;
    public String mOutOrderNo;
    public a mPay;
    public boolean mPayFinished;
    public PayLoadingDialog mPayLoadingDialog;
    public PaymentInfo mPaymentInfo;
    public ResultReceiver mReceiver;
    public String mToken;

    public void FrontCashierActivity(){
       super();
    }
    public static void E2(FrontCashierActivity p0,Throwable p1){
       p0.lambda$startPapPay$1(p1);
    }
    public static void F2(FrontCashierActivity p0,Throwable p1){
       p0.lambda$confirmPaySuccess$9(p1);
    }
    public static void G2(FrontCashierActivity p0,Throwable p1){
       p0.lambda$queryPayResult$7(p1);
    }
    public static void H2(FrontCashierActivity p0,PaymentInfo p1,CreatePayOrderResponse p2){
       p0.lambda$startPapPay$0(p1, p2);
    }
    public static void L2(FrontCashierActivity p0,Throwable p1){
       p0.lambda$startNativePay$3(p1);
    }
    public static void M2(FrontCashierActivity p0,PaymentInfo p1,CreatePayOrderResponse p2){
       p0.lambda$createPayOrder$4(p1, p2);
    }
    public static void N2(FrontCashierActivity p0,c p1,int p2,QueryPayResponse p3){
       p0.lambda$queryPayResult$6(p1, p2, p3);
    }
    public static void O2(FrontCashierActivity p0,String p1){
       p0.lambda$confirmPaySuccess$8(p1);
    }
    public static void P2(FrontCashierActivity p0,PaymentInfo p1,CreatePayOrderResponse p2){
       p0.lambda$startNativePay$2(p1, p2);
    }
    private void lambda$confirmPaySuccess$8(String p0){
       this.returnResultAndFinish(1);
    }
    private void lambda$confirmPaySuccess$9(Throwable p0){
       this.returnResultAndFinish(1);
    }
    private void lambda$createPayOrder$4(PaymentInfo p0,CreatePayOrderResponse p1){
       e.e("receivePayOrderResultNative", e.c(p0, "cashier_type", "PRE_CASHIER_SDK_NATIVE_STEP2", "result_code", p1.mCode), this.mToken);
    }
    public static void lambda$queryPayResult$5(c p0,QueryPayResponse p1){
       if (!TextUtils.equals(p1.mOrderState, "SUCCESS") && (TextUtils.equals(p1.mOrderState, "CONFIRM_SUCCESS") || p0.d != null)) {
          return;
       }
       throw new IOException("Î´Öª´íÎó!");
    }
    private void lambda$queryPayResult$6(c p0,int p1,QueryPayResponse p2){
       this.hideLoading();
       e.e("receiveQueryPayResult", e.d(this.mPaymentInfo, "cashier_type", "PRE_CASHIER_SDK_NATIVE_STEP2", "result_code", p2.mCode, "count", Integer.valueOf(Math.min((p0.d + 1), (p1 + 1)))), this.mToken);
       g.d("FrontCashierActivity queryPayResult: orderState="+p2.mOrderState);
       if (TextUtils.equals(p2.mOrderState, "SUCCESS") || TextUtils.equals(p2.mOrderState, "CONFIRM_SUCCESS")) {
          this.returnResultAndFinish(1);
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f103ba3);
          b.l("FrontCashierActivity", "queryPayResult: query result unknown, provider="+this.mPaymentInfo.getProvider(), this.getErrorReportMap(this.mPaymentInfo.getProvider(), "order_state="+p2.mOrderState));
          this.returnResultAndFinish(2, p2.mOrderState);
       }
       return;
    }
    private void lambda$queryPayResult$7(Throwable p0){
       this.hideLoading();
       String message = (!TextUtils.isEmpty(p0.getMessage()))? p0.getMessage(): this.getString(R.string.arg_RES_7f103ba4);
       i.d(R.style.arg_RES_7f11066a, message);
       this.returnResultAndFinish(2);
       b.k("FrontCashierActivity", "queryPayResult: query result error, provider="+this.mPaymentInfo.getProvider(), p0, this.getErrorReportMap(this.mPaymentInfo.getProvider(), null));
       return;
    }
    private void lambda$startNativePay$2(PaymentInfo p0,CreatePayOrderResponse p1){
       g.d("FrontCashierActivity startNativePay: createPayOrder response: "+p1);
       if (p1.mNeedToH5 != null) {
          this.mH5Downgrade = true;
          d.c("KUAISHOUPAY_NATIVE_START_H5_CASHIER", p0, null, "PRE_CASHIER_SDK_NATIVE_STEP2");
          e.e("startFrontCashierToH5", e.c(p0, "cashier_type", "PRE_CASHIER_SDK_NATIVE_STEP2", "result_code", p1.mCode), this.mToken);
          this.startH5OrderCashier(p0.mMerchantId, p0.getOutOrderNo(), p0.getProvider(), p1.mPayResult, p0.getExtra());
       }else if(("SUCCESS").equals(p1.mCode)){
          this.mPay = this.startThirdSdkPay(this, p0.getProvider(), p1.mGatewayPayParam.g);
       }else {
          g.m("FrontCashierActivity startNativePay: createPayOrder fail. msg: "+p1.mMsg);
          if (!TextUtils.isEmpty(p1.mMsg)) {
             i.d(R.style.arg_RES_7f11066a, p1.mMsg);
          }
          this.handlePayFinish(2, p1.mCode, TextUtils.isEmpty(p1.mMsg));
       }
       return;
    }
    private void lambda$startNativePay$3(Throwable p0){
       this.handleApiError(p0);
       i.a(R.style.arg_RES_7f11066a, 0x7f103ba4);
       this.returnResultAndFinish(2);
    }
    private void lambda$startPapPay$0(PaymentInfo p0,CreatePayOrderResponse p1){
       if (p1.mNeedToH5 != null) {
          this.mH5Downgrade = true;
          this.hideLoading();
          d.c("KUAISHOUPAY_NATIVE_START_H5_CASHIER", p0, null, "PRE_CASHIER_SDK_NATIVE_STEP2");
          e.e("startFrontCashierToH5", e.c(p0, "cashier_type", "PRE_CASHIER_SDK_NATIVE_STEP2", "result_code", p1.mCode), this.mToken);
          this.startH5OrderCashier(p0.mMerchantId, p0.getOutOrderNo(), p0.getProvider(), p1.mPayResult, p0.getExtra());
       }else if(("SUCCESS").equals(p1.mCode)){
          this.queryPayResult();
       }else {
          this.hideLoading();
          if (!TextUtils.isEmpty(p1.mMsg)) {
             i.d(R.style.arg_RES_7f11066a, p1.mMsg);
          }
          this.handlePayFinish(2, p1.mCode, TextUtils.isEmpty(p1.mMsg));
       }
       return;
    }
    private void lambda$startPapPay$1(Throwable p0){
       this.hideLoading();
       this.handleApiError(p0);
       i.a(R.style.arg_RES_7f11066a, 0x7f103ba4);
       this.returnResultAndFinish(2);
    }
    public static void startFrontCashierActivity(Context p0,PaymentInfo p1,String p2,ResultReceiver p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, FrontCashierActivity.class, "1")) {
          return;
       }
       Intent intent = new Intent(p0, FrontCashierActivity.class);
       SerializableHook.putExtra(intent, "params", p1);
       intent.putExtra("token", p2);
       intent.putExtra("result_receiver", p3);
       if (!p0 instanceof Activity) {
          intent.addFlags(0x10000000);
       }
       p0.startActivity(intent);
       return;
    }
    public final void confirmPaySuccess(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FrontCashierActivity.class, "20")) {
          return;
       }
       g.d("FrontCashierActivity confirmPaySuccess¡£outOrderNo="+p1);
       o.a().confirmPaySuccess(p0, p1, p2).map(new a()).subscribe(new e(this), new g(this));
       return;
    }
    public final t createPayOrder(PaymentInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrontCashierActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e.e("startCreatePayOrderNative", e.b(p0, "PRE_CASHIER_SDK_NATIVE_STEP2"), this.mToken);
       return o.a().createPayOder(this.mToken, p0.getMerchantId(), p0.getOutOrderNo(), p0.getProvider(), p0.getPaymentMethod(), p0.getChannelType(), p0.getActivityDiscountCode(), "NATIVE").map(new a()).doOnNext(new l(this, p0));
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, FrontCashierActivity.class, "28")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public final Map getErrorReportMap(String p0,String p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, FrontCashierActivity.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("provider", p0);
       obj.put("outOrderNo", this.mOutOrderNo);
       obj.put("merchantId", this.mMerchantId);
       obj.put("errorMsg", p1);
       return obj;
    }
    public String getPageName(){
       return "APP_GENERAL";
    }
    public String getPageParams(){
       JsonObject obj = PatchProxy.apply(null, this, FrontCashierActivity.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("merchant_id", this.mMerchantId);
       obj.c0("order_id", this.mOutOrderNo);
       obj.c0("cashier_type", "PRE_CASHIER_SDK_NATIVE_STEP2");
       return obj.toString();
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FrontCashierActivity.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public final void handleApiError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrontCashierActivity.class, "8")) {
          return;
       }
       if (i.a(p0) == 401 && (PayManager.getInstance().getKwaiPayConfig() != null && PayManager.getInstance().getKwaiPayConfig().enableRefreshTokenAfter401())) {
          PayManager.getInstance().getKwaiPayConfig().refreshToken();
          b.o("FrontCashierActivity", "create_pay_order: http 401, refresh token");
       }
    label_003d :
       PayManager payManager = null;
       if (PayManager.getInstance().getKwaiPayConfig() != null) {
          payManager = PayManager.getInstance().getKwaiPayConfig().useKuaishouApiSid();
       }
       b.h("FrontCashierActivity", "create_pay_order return error. msg="+p0.getMessage()+", use ks api:"+payManager, p0, "payment_method", this.mPaymentInfo.getPaymentMethod());
       return;
    }
    public final void handleH5OrderCashierResult(int p0,int p1,Intent p2){
       JsErrorResult jsErrorResul;
       if (PatchProxy.isSupport(FrontCashierActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, FrontCashierActivity.class, "14")) {
          return;
       }
       b.o("FrontCashierActivity", " handleH5OrderCashierResult, requestCode:"+p0+", resultCode:"+p1);
       if (p1 != -1) {
          this.handleH5PayFinish(3);
          return;
       }else {
          p0 = 30;
          try{
             String str = j0.f(p2, "exit_data");
             if (TextUtils.isEmpty(str)) {
                g.d("FrontCashierActivity handleH5OrderCashierResult extraData null");
                this.handleH5PayFinish(p0);
                return;
             }else {
                jsErrorResul = d.a.h(str, JsErrorResult.class);
             }
          }catch(java.lang.Exception e9){
             g.d("FrontCashierActivity handleH5OrderCashierResult result JSONException: "+e9.getMessage());
             jsErrorResul = null;
          }
          if (jsErrorResul == null) {
             this.handleH5PayFinish(p0);
             return;
          }else {
             BaseResult mResult = jsErrorResul.mResult;
             if (mResult != null) {
                jsErrorResul = 1;
                if (mResult != jsErrorResul) {
                   mResult = (mResult != 412)? 2: 0;
                   this.handleH5PayFinish(mResult);
                }else {
                   this.handleH5PayFinish(jsErrorResul);
                }
             }else {
                this.handleH5PayFinish(3);
             }
             return;
          }
       }
    }
    public final void handleH5PayFinish(int p0){
       FrontCashierActivity uFrontCashie = FrontCashierActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFrontCashie, "21")) {
          return;
       }
       g.d("FrontCashierActivity handleH5PayFinish: resultCode="+p0);
       if (p0 != 1 && p0 != 3) {
          b.l("FrontCashierActivity", "front cashier, downgrade to h5, pay fail !!! provider="+this.mPaymentInfo.getProvider(), this.getErrorReportMap(this.mPaymentInfo.getProvider(), "errorCode="+p0));
       }
       this.returnResult(p0, 1);
       this.finish();
       return;
    }
    public final void handlePayFinish(int p0,String p1){
       FrontCashierActivity uFrontCashie = FrontCashierActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uFrontCashie, "16")) {
          return;
       }
       this.handlePayFinish(p0, p1, true);
       return;
    }
    public final void handlePayFinish(int p0,String p1,boolean p2){
       if (PatchProxy.isSupport(FrontCashierActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, FrontCashierActivity.class, "17")) {
          return;
       }
       g.d("FrontCashierActivity handlePayFinish: result="+p0+", msg="+p1);
       if (p0) {
          if (p0 != 1) {
             if (p0 != 3) {
                if (p2) {
                   i.a(R.style.arg_RES_7f110668, 0x7f103b9b);
                }
                this.returnResultAndFinish(p0, p1);
                StringBuilder str = "front cashier pay return error. provider="+this.mPaymentInfo.getProvider()+", errorMsg=";
                String str1 = (TextUtils.isEmpty(p1))? "": p1;
                b.l("FrontCashierActivity", str+str1, this.getErrorReportMap(this.mPaymentInfo.getProvider(), p1));
             }else {
                i.a(R.style.arg_RES_7f110668, 0x7f103b9a);
                this.returnResultAndFinish(p0, p1);
             }
          }else {
             this.confirmPaySuccess(this.mPaymentInfo.getMerchantId(), this.mPaymentInfo.getOutOrderNo(), this.mPaymentInfo.getProvider());
          }
       }else {
          this.queryPayResult();
       }
       return;
    }
    public final void hideLoading(){
       if (PatchProxy.applyVoid(null, this, FrontCashierActivity.class, "6")) {
          return;
       }
       FrontCashierActivity tmPayLoading = this.mPayLoadingDialog;
       if (tmPayLoading != null) {
          tmPayLoading.dismiss();
       }
       this.mLoadingView.d();
       return;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public final boolean isLandScape(){
       Configuration obj = PatchProxy.apply(null, this, FrontCashierActivity.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getResources().getConfiguration();
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (obj.orientation == 2) {
          b = true;
       }
       return b;
    }
    public boolean needUploadPV(){
       return false;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(FrontCashierActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, FrontCashierActivity.class, "13")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       b.o("FrontCashierActivity", " onActivityResult, requestCode="+p0+", resultCode="+p1);
       if (p0 == 100) {
          this.handleH5OrderCashierResult(p0, p1, p2);
       }else {
          FrontCashierActivity tmPay = this.mPay;
          if (tmPay == null || !tmPay.b(p0, p1, p2)) {
             this.onPayFinish(p1, null);
          }
       }
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, FrontCashierActivity.class, "26")) {
          return;
       }
       super.onBackPressed();
       b.o("FrontCashierActivity", " onBackPressed");
       this.returnResultAndFinish(3);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrontCashierActivity.class, "2")) {
          return;
       }
       g.d("FrontCashierActivity onCreate");
       int i = 0;
       this.overridePendingTransition(i, i);
       k.b(this, i, true, true);
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d10fc);
       this.mLoadingView = this.findViewById(0x7f0a2fa5);
       if (!this.isLandScape() && Build$VERSION.SDK_INT < 29) {
          q.b(this);
       }
       this.mPaymentInfo = j0.e(this.getIntent(), "params");
       this.mReceiver = j0.d(this.getIntent(), "result_receiver");
       this.mToken = j0.f(this.getIntent(), "token");
       FrontCashierActivity tmPaymentInf = this.mPaymentInfo;
       if (tmPaymentInf != null && (TextUtils.isEmpty(tmPaymentInf.getMerchantId()) || TextUtils.isEmpty(this.mPaymentInfo.getOutOrderNo()))) {
          b.h("FrontCashierActivity", "front cashier pay failed, params error.", null, "paymentInfo", this.mPaymentInfo);
          this.returnResultAndFinish(30);
          return;
       }else {
          this.mMerchantId = this.mPaymentInfo.getMerchantId();
          this.mOutOrderNo = this.mPaymentInfo.getOutOrderNo();
          this.startOrderPay();
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FrontCashierActivity.class, "29")) {
          return;
       }
       if (this.mPayFinished == null) {
          b.f("FrontCashierActivity", "destroy with unknown status");
          this.returnResult(0, this.mH5Downgrade);
       }
       super.onDestroy();
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       FrontCashierActivity uFrontCashie = FrontCashierActivity.class;
       if (PatchProxy.isSupport(uFrontCashie)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uFrontCashie, "27");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 4) {
          g.d("FrontCashierActivity onKeyDown: back pressed");
          this.returnResult(3, this.mH5Downgrade);
       }
       return super.onKeyDown(p0, p1);
    }
    public void onPayFinish(int p0,String p1){
       FrontCashierActivity uFrontCashie = FrontCashierActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uFrontCashie, "15")) {
          return;
       }
       b.o("FrontCashierActivity", " onPayFinish, resultCode="+p0+", msg="+p1);
       d.c("PROVIDER_RETURN_PAYMENT_RESULT", this.mPaymentInfo, d.a(p0), "PRE_CASHIER_SDK_NATIVE_STEP2");
       e.e("thirdSdkReturnResult", e.d(this.mPaymentInfo, "cashier_type", "PRE_CASHIER_SDK_NATIVE_STEP2", "result_name", d.a(p0), "result_code", Integer.valueOf(p0)), this.mToken);
       this.handlePayFinish(p0, p1);
       return;
    }
    public final void queryPayResult(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FrontCashierActivity.class, "19")) {
          return;
       }
       int i = 1;
       FrontCashierActivity tmPaymentInf = this.mPaymentInfo;
       Map map = PatchProxy.applyThreeRefs(tmPaymentInf, "cashier_type", "PRE_CASHIER_SDK_NATIVE_STEP2", null, e.class, "4");
       if (map != PatchProxyResult.class) {
       }else {
          map = e.b(tmPaymentInf, objArray);
          map.put("cashier_type", "PRE_CASHIER_SDK_NATIVE_STEP2");
       }
       e.e("startQueryPayResult", map, this.mToken);
       b.o("FrontCashierActivity", "queryPayResult. outOrderNo="+this.mPaymentInfo.getOutOrderNo());
       if (!this.useCustomPapLoading()) {
          this.mLoadingView.setLoadingText(this.getString(R.string.arg_RES_7f103ba2));
          this.mLoadingView.b();
       }
       c uoc = new c(i, 1000);
       d.c("KUAISHOUPAY_TRADE_QUERY", this.mPaymentInfo, "UNKNOWN_STATUS", objArray);
       o.a().queryPayResult(this.mToken, this.mMerchantId, this.mOutOrderNo).map(new a()).doOnNext(new d(uoc)).retryWhen(uoc).subscribe(new j(this, uoc, i), new h(this));
       return;
    }
    public final void returnResult(int p0,boolean p1){
       FrontCashierActivity uFrontCashie = FrontCashierActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uFrontCashie, "24")) {
          return;
       }
       this.returnResult(p0, p1, null);
       return;
    }
    public final void returnResult(int p0,boolean p1,String p2){
       boolean b;
       FrontCashierActivity tmPaymentInf;
       if (PatchProxy.isSupport(FrontCashierActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, FrontCashierActivity.class, "25")) {
          return;
       }
       b.o("FrontCashierActivity", " returnResult: resultCode="+p0+", hasHandled="+this.mPayFinished);
       if (this.mPayFinished != null) {
          return;
       }
       b = true;
       this.mPayFinished = b;
       String str = (p1)? "NATIVE_STEP2_THEN_COMMON_CASHIER": "PRE_CASHIER_SDK_NATIVE_STEP2";
       String str1 = str;
       d.c("KUAISHOUPAY_PAYMENT_RESULT", this.mPaymentInfo, d.a(p0), str1);
       e.e("returnResultToBusiness", e.d(this.mPaymentInfo, "cashier_type", str1, "result_name", d.a(p0), "result_code", Integer.valueOf(p0)), this.mToken);
       PayResult payResult = new PayResult(p0, this.mOutOrderNo, this.mMerchantId, this.mPaymentInfo.getProvider());
       if (p0 == b) {
          tmPaymentInf = this.mPaymentInfo;
          c.b().c(tmPaymentInf.mProvider, tmPaymentInf.mChannelType, tmPaymentInf.mPaymentMethod);
       }else {
          tmPaymentInf = this.mPaymentInfo;
          b uob = new b(p0, this.mOutOrderNo, p2, tmPaymentInf.mProvider, tmPaymentInf.mChannelType, tmPaymentInf.mPaymentMethod, str1);
          c.b().d(v10);
       }
       if (this.mReceiver != null) {
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "order_pay_result", payResult);
          this.mReceiver.send(p0, uBundle);
       }
       if (p0 == b && (PayManager.getInstance().getKwaiPayConfig() == null || !PayManager.getInstance().getKwaiPayConfig().enableReportPaySuccessLog())) {
          b = false;
       }
       a.f().e(b);
       return;
    }
    public final void returnResultAndFinish(int p0){
       FrontCashierActivity uFrontCashie = FrontCashierActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFrontCashie, "22")) {
          return;
       }
       this.returnResultAndFinish(p0, null);
       return;
    }
    public final void returnResultAndFinish(int p0,String p1){
       FrontCashierActivity uFrontCashie = FrontCashierActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uFrontCashie, "23")) {
          return;
       }
       this.returnResult(p0, false, p1);
       this.finish();
       return;
    }
    public final void showPapLoading(){
       if (PatchProxy.applyVoid(null, this, FrontCashierActivity.class, "5")) {
          return;
       }
       if (this.useCustomPapLoading()) {
          PayLoadingDialog payLoadingDi = new PayLoadingDialog();
          this.mPayLoadingDialog = payLoadingDi;
          payLoadingDi.sh(this.mPaymentInfo.mLoadingText);
          this.mPayLoadingDialog.th(this.mPaymentInfo.mLoadingIconUrl);
          this.mPayLoadingDialog.setCancelable(false);
          this.mPayLoadingDialog.show(this.getSupportFragmentManager(), "loadingDialog");
       }else {
          this.mLoadingView.setLoadingText(this.getString(R.string.arg_RES_7f103b9e));
          this.mLoadingView.b();
       }
       return;
    }
    public final void startH5OrderCashier(String p0,String p1,String p2,String p3,String p4){
       PayWebViewActivity$a uoa;
       JsonObject jsonObject = JsonObject.class;
       FrontCashierActivity uFrontCashie = FrontCashierActivity.class;
       if (PatchProxy.isSupport(uFrontCashie)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uFrontCashie, "9")) {
             return;
          }
       }
       b.o("FrontCashierActivity", " startH5OrderCashier start¡£ outOrderNo="+p1+", payResult="+p3);
       if (TextUtils.isEmpty(p0) || TextUtils.isEmpty(p1)) {
          b.l("FrontCashierActivity", " startH5OrderCashier failed, merchantId or orderId is null", this.getErrorReportMap(p2, null));
          this.handleH5PayFinish(30);
          return;
       }else if(!TextUtils.isEmpty(p3)){
          try{
             JsonObject jsonObject1 = (TextUtils.isEmpty(p4))? new JsonObject(): d.a.h(p4, jsonObject);
             jsonObject1.G("pay_result", d.a.h(p3, jsonObject));
             jsonObject1.c0("sessionId", this.mToken);
             jsonObject1.c0("cashier_type", "NATIVE_STEP2_THEN_COMMON_CASHIER");
             p4 = jsonObject1.toString();
          }catch(com.google.gson.JsonSyntaxException e8){
             b.g("FrontCashierActivity", " startH5OrderCashier insert payParams error", e8);
          }
       }
    }
    public final void startNativePay(PaymentInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrontCashierActivity.class, "10")) {
          return;
       }
       g.d("FrontCashierActivity startNativePay:");
       this.createPayOrder(p0).subscribe(new m(this, p0), new i(this));
       return;
    }
    public final void startOrderPay(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FrontCashierActivity.class, "3")) {
          return;
       }
       d.c("PAYMENT_CONFIRM_AUTOMATION", this.mPaymentInfo, objArray, "PRE_CASHIER_SDK_NATIVE_STEP2");
       g.d("FrontCashierActivity startOrderPay: paymentInfo ="+this.mPaymentInfo.toString());
       if (("PAP").equals(this.mPaymentInfo.getPaymentMethod()) && c.i(this.mPaymentInfo.getProvider(), this.mPaymentInfo.getChannelType())) {
          this.startPapPay(this.mPaymentInfo);
       }else if(("IN_APP").equals(this.mPaymentInfo.getPaymentMethod())){
          this.startNativePay(this.mPaymentInfo);
       }else {
          g.d("startOrderPay: failed, invalid pay method. paymentInfo="+this.mPaymentInfo);
          this.returnResultAndFinish(30);
       }
       return;
    }
    public final void startPapPay(PaymentInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrontCashierActivity.class, "7")) {
          return;
       }
       b.r("FrontCashierActivity", "startPapPay", ImmutableMap.of("provider", p0.getProvider(), "paymentInfo", p0));
       this.showPapLoading();
       this.createPayOrder(p0).subscribe(new k(this, p0), new f(this));
       return;
    }
    public final a startThirdSdkPay(Activity p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, FrontCashierActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = null;
       if (TextUtils.isEmpty(p2)) {
          b.f("FrontCashierActivity", "startNativePay failed, mProviderConfig is null!");
          this.handlePayFinish(30, str);
          return str;
       }else {
          d.c("PROVIDER_SDK_START", this.mPaymentInfo, str, "PRE_CASHIER_SDK_NATIVE_STEP2");
          e.e("startPullUpThirdSdk", e.b(this.mPaymentInfo, "PRE_CASHIER_SDK_NATIVE_STEP2"), this.mToken);
          a uoa = e.a(p0, p1.toLowerCase());
          if (uoa == null || !uoa.a()) {
             this.handlePayFinish(2, str);
             b.h("FrontCashierActivity", "startNativePay failed, provider invalid !", str, "provider", p1);
             return str;
          }else {
             b.p("FrontCashierActivity", "startNativePay", "provider", p1);
             uoa.a(p2, new c(this));
             return uoa;
          }
       }
    }
    public final boolean useCustomPapLoading(){
       Object obj = PatchProxy.apply(null, this, FrontCashierActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mPaymentInfo.mLoadingText) && !TextUtils.isEmpty(this.mPaymentInfo.mLoadingIconUrl))? true: false;
       return b;
    }
}
