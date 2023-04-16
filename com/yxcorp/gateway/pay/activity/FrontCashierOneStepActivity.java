package com.yxcorp.gateway.pay.activity.FrontCashierOneStepActivity;
import fv8.b;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import java.lang.Throwable;
import com.yxcorp.gateway.pay.response.QueryPayResponse;
import java.lang.String;
import iv8.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.IOException;
import com.yxcorp.gateway.pay.loading.PayLoadingView;
import e17.i;
import com.yxcorp.gateway.pay.params.FrontCashierPayParams;
import java.lang.StringBuilder;
import java.util.Map;
import nv8.b;
import java.lang.System;
import android.app.Activity;
import android.content.Context;
import android.os.ResultReceiver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import nv8.d;
import lv8.g;
import com.yxcorp.gateway.pay.service.GatewayPayApiService;
import lv8.o;
import brd.t;
import iv8.a;
import erd.o;
import gv8.o;
import gv8.p;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import java.lang.Integer;
import ekd.j0;
import lv8.d;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import com.google.gson.Gson;
import java.lang.Exception;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import android.view.View;
import java.lang.Boolean;
import android.content.res.Configuration;
import java.lang.Long;
import java.lang.Number;
import ev8.a;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import lv8.k;
import android.os.Build$VERSION;
import lv8.q;
import android.view.KeyEvent;
import nv8.e;
import gv8.r;
import gv8.n;
import gv8.q;
import com.yxcorp.gateway.pay.params.PayResult$PaySdKElapsedTime;
import com.yxcorp.gateway.pay.params.PayResult;
import ov8.c;
import ov8.b;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.api.KwaiPayConfig;
import nv8.a;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gateway.pay.activity.GatewayH5PayActivity;
import com.yxcorp.gateway.pay.response.GatewayPayPrepayResponse;
import kv8.e;
import lv8.c;

public class FrontCashierOneStepActivity extends BaseActivity implements b	// class@0011ff
{
    public String mExtra;
    public boolean mH5Downgrade;
    public PayLoadingView mLoadingView;
    public String mMerchantId;
    public String mOutOrderNo;
    public a mPay;
    public boolean mPayFinished;
    public FrontCashierPayParams mPayParams;
    public String mPayParamsStr;
    public long mPaySDKEndAppTimestamp;
    public long mPaySDKQueryResultCompletedTimestamp;
    public long mPaySDKStartAppTimestamp;
    public ResultReceiver mReceiver;
    public String mToken;
    public static long sFrontCashierStart;

    public void FrontCashierOneStepActivity(){
       super();
    }
    public static void E2(FrontCashierOneStepActivity p0,Throwable p1){
       p0.lambda$confirmPaySuccess$4(p1);
    }
    public static void F2(FrontCashierOneStepActivity p0,QueryPayResponse p1){
       p0.lambda$queryPayResult$1(p1);
    }
    public static void G2(FrontCashierOneStepActivity p0,Throwable p1){
       p0.lambda$queryPayResult$2(p1);
    }
    public static void H2(FrontCashierOneStepActivity p0,String p1){
       p0.lambda$confirmPaySuccess$3(p1);
    }
    private void lambda$confirmPaySuccess$3(String p0){
       this.returnResultAndFinish(1);
    }
    private void lambda$confirmPaySuccess$4(Throwable p0){
       this.returnResultAndFinish(1);
    }
    public static void lambda$queryPayResult$0(c p0,QueryPayResponse p1){
       if (!TextUtils.equals(p1.mOrderState, "SUCCESS") && (TextUtils.equals(p1.mOrderState, "CONFIRM_SUCCESS") || p0.d != null)) {
          return;
       }
       throw new IOException("Î´Öª´íÎó!");
    }
    private void lambda$queryPayResult$1(QueryPayResponse p0){
       this.mLoadingView.d();
       if (TextUtils.equals(p0.mOrderState, "SUCCESS") || TextUtils.equals(p0.mOrderState, "CONFIRM_SUCCESS")) {
          this.mPaySDKQueryResultCompletedTimestamp = System.currentTimeMillis();
          this.returnResultAndFinish(1);
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f103ba3);
          FrontCashierOneStepActivity tmPayParams = this.mPayParams;
          FrontCashierPayParams mProvider = (tmPayParams != null)? tmPayParams.mProvider: "";
          b.l("FrontCashierOneStepActivity", "oneStepPay query result unknown, provider="+mProvider, this.getErrorReportMap(mProvider, "order_state="+p0.mOrderState));
          this.mPaySDKQueryResultCompletedTimestamp = System.currentTimeMillis();
          this.returnResultAndFinish(2, p0.mOrderState);
       }
       return;
    }
    private void lambda$queryPayResult$2(Throwable p0){
       this.mLoadingView.d();
       String message = (!TextUtils.isEmpty(p0.getMessage()))? p0.getMessage(): this.getString(R.string.arg_RES_7f103ba4);
       i.d(R.style.arg_RES_7f11066a, message);
       this.mPaySDKQueryResultCompletedTimestamp = System.currentTimeMillis();
       this.returnResultAndFinish(2);
       FrontCashierOneStepActivity tmPayParams = this.mPayParams;
       FrontCashierPayParams mProvider = (tmPayParams != null)? tmPayParams.mProvider: "";
       b.k("FrontCashierOneStepActivity", "oneStepPay query result error, provider="+mProvider, p0, this.getErrorReportMap(mProvider, null));
       return;
    }
    public static void startCashierActivity(Context p0,String p1,String p2,String p3,String p4,String p5,ResultReceiver p6){
       FrontCashierOneStepActivity uFrontCashie = FrontCashierOneStepActivity.class;
       if (PatchProxy.isSupport(uFrontCashie)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, uFrontCashie, "1")) {
             return;
          }
       }
       Intent intent = new Intent(p0, uFrontCashie);
       intent.putExtra("merchantId", p1);
       intent.putExtra("outOrderNo", p2);
       intent.putExtra("params", p3);
       intent.putExtra("extra", p4);
       intent.putExtra("token", p5);
       intent.putExtra("result_receiver", p6);
       if (!p0 instanceof Activity) {
          intent.addFlags(0x10000000);
       }
       FrontCashierOneStepActivity.sFrontCashierStart = SystemClock.elapsedRealtime();
       p0.startActivity(intent);
       return;
    }
    public final void confirmPaySuccess(){
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "16")) {
          return;
       }
       d.d("KUAISHOUPAY_TRADE_CONFIRM", this.mMerchantId, this.mOutOrderNo, "SUCCESS", this.mPayParams, null);
       g.d("FrontCashierOneStepActivity confirmPaySuccess");
       o.a().confirmPaySuccess(this.mMerchantId, this.mOutOrderNo, this.mPayParams.mProvider).map(new a()).subscribe(new o(this), new p(this));
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "24")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public final Map getErrorReportMap(String p0,String p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, FrontCashierOneStepActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("provider", p0);
       obj.put("outOrderNo", this.mOutOrderNo);
       obj.put("merchantId", this.mMerchantId);
       obj.put("payResult", this.mPayParamsStr);
       obj.put("errorMsg", p1);
       return obj;
    }
    public String getPageName(){
       return "APP_GENERAL";
    }
    public String getPageParams(){
       JsonObject obj = PatchProxy.apply(null, this, FrontCashierOneStepActivity.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       obj.c0("merchant_id", this.mMerchantId);
       obj.c0("order_id", this.mOutOrderNo);
       obj.c0("cashier_type", "PRE_CASHIER_SDK_NATIVE");
       return obj.toString();
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, FrontCashierOneStepActivity.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public final void handleH5OrderCashierResult(int p0,int p1,Intent p2){
       JsErrorResult jsErrorResul;
       if (PatchProxy.isSupport(FrontCashierOneStepActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, FrontCashierOneStepActivity.class, "10")) {
          return;
       }
       b.o("FrontCashierOneStepActivity", " handleH5OrderCashierResult, requestCode:"+p0+", resultCode:"+p1);
       if (p1 != -1) {
          this.handleH5PayFinish(3);
          return;
       }else {
          p0 = 30;
          try{
             String str = j0.f(p2, "exit_data");
             if (TextUtils.isEmpty(str)) {
                g.d("FrontCashierOneStepActivity handleH5OrderCashierResult extraData null");
                this.handleH5PayFinish(p0);
                return;
             }else {
                jsErrorResul = d.a.h(str, JsErrorResult.class);
             }
          }catch(java.lang.Exception e9){
             g.d("FrontCashierOneStepActivity handleH5OrderCashierResult result JSONException: "+e9.getMessage());
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
       FrontCashierOneStepActivity uFrontCashie = FrontCashierOneStepActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFrontCashie, "17")) {
          return;
       }
       if (p0 != 1 && p0 != 3) {
          FrontCashierOneStepActivity tmPayParams = this.mPayParams;
          FrontCashierPayParams mProvider = (tmPayParams != null)? tmPayParams.mProvider: "";
          b.l("FrontCashierOneStepActivity", "oneStepPay fail, downgrade to h5, provider="+mProvider, this.getErrorReportMap(mProvider, "errorCode="+p0));
       }
       this.returnResult(p0, 1);
       this.finish();
       return;
    }
    public final void handlePayFinish(int p0,String p1){
       FrontCashierOneStepActivity uFrontCashie = FrontCashierOneStepActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uFrontCashie, "13")) {
          return;
       }
       this.mPaySDKEndAppTimestamp = System.currentTimeMillis();
       if (p0) {
          if (p0 != 1) {
             int i = 0x7f110668;
             if (p0 != 3) {
                i.a(i, R.string.arg_RES_7f103b9b);
                this.returnResultAndFinish(p0, p1);
                FrontCashierOneStepActivity tmPayParams = this.mPayParams;
                FrontCashierPayParams mProvider = (tmPayParams != null)? tmPayParams.mProvider: "";
                b.l("FrontCashierOneStepActivity", "oneStepPay third sdk return error. provider="+mProvider, this.getErrorReportMap(mProvider, p1));
             }else {
                i.a(i, R.string.arg_RES_7f103b9a);
                this.returnResultAndFinish(p0);
             }
          }else {
             this.confirmPaySuccess();
          }
       }else {
          this.queryPayResult();
       }
       return;
    }
    public final void initParams(){
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "3")) {
          return;
       }
       try{
          this.mMerchantId = j0.f(this.getIntent(), "merchantId");
          this.mOutOrderNo = j0.f(this.getIntent(), "outOrderNo");
          this.mExtra = j0.f(this.getIntent(), "extra");
          this.mToken = j0.f(this.getIntent(), "token");
          this.mReceiver = j0.d(this.getIntent(), "result_receiver");
          String str = j0.f(this.getIntent(), "params");
          this.mPayParamsStr = str;
          if (!TextUtils.isEmpty(str)) {
             this.mPayParams = d.a.h(this.mPayParamsStr, FrontCashierPayParams.class);
          }
       }catch(java.lang.Exception e0){
          b.g("FrontCashierOneStepActivity", "oneStepPay init error", e0);
          g.d("FrontCashierOneStepActivity initParams, exception="+e0.getMessage());
          this.returnResultAndFinish(300);
       }
       return;
    }
    public final void initView(){
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "4")) {
          return;
       }
       this.mLoadingView = this.findViewById(0x7f0a2fa5);
       return;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public final boolean isLandScape(){
       Configuration obj = PatchProxy.apply(null, this, FrontCashierOneStepActivity.class, "28");
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
    public final void logStartThirdPayDuration(){
       JsonObject jsonObject;
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "27")) {
          return;
       }
       try{
          jsonObject = d.a.h(this.getPageParams(), JsonObject.class);
       }catch(com.google.gson.JsonSyntaxException e0){
          jsonObject = new JsonObject();
       }
       jsonObject.a0("duration", Long.valueOf((SystemClock.elapsedRealtime() - FrontCashierOneStepActivity.sFrontCashierStart)));
       FrontCashierOneStepActivity tmPayParams = this.mPayParams;
       FrontCashierPayParams mPaymentMeth = (tmPayParams != null)? tmPayParams.mPaymentMethod: "";
       jsonObject.c0("payment_method", mPaymentMeth);
       g.j("KUAISHOUPAY_PAYMENT_DURATION", "UNKNOWN_STATUS", jsonObject.toString());
       return;
    }
    public boolean needUploadPV(){
       return false;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(FrontCashierOneStepActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, FrontCashierOneStepActivity.class, "11")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       b.o("FrontCashierOneStepActivity", " onActivityResult, requestCode="+p0+", resultCode="+p1);
       this.mPaySDKEndAppTimestamp = System.currentTimeMillis();
       if (p0 == 101) {
          this.onPayFinish(0, null);
       }else if(p0 == 100){
          this.handleH5OrderCashierResult(p0, p1, p2);
       }else {
          FrontCashierOneStepActivity tmPay = this.mPay;
          if (tmPay == null || !tmPay.b(p0, p1, p2)) {
             this.onPayFinish(p1, null);
          }
       }
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "22")) {
          return;
       }
       super.onBackPressed();
       g.d("FrontCashierOneStepActivity onBackPressed");
       this.returnResultAndFinish(3);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrontCashierOneStepActivity.class, "2")) {
          return;
       }
       int i = 0;
       this.overridePendingTransition(i, i);
       k.b(this, i, true, true);
       this.initParams();
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d10fb);
       if (!this.isLandScape() && Build$VERSION.SDK_INT < 29) {
          q.b(this);
       }
       this.initView();
       this.startFrontCashierPay();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "25")) {
          return;
       }
       if (this.mPayFinished == null) {
          b.f("FrontCashierOneStepActivity", "oneStepPay destroy with unknown status");
          this.returnResult(0, this.mH5Downgrade);
       }
       super.onDestroy();
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       FrontCashierOneStepActivity uFrontCashie = FrontCashierOneStepActivity.class;
       if (PatchProxy.isSupport(uFrontCashie)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uFrontCashie, "23");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 == 4) {
          g.d("FrontCashierOneStepActivity onKeyDown: back pressed");
          this.returnResult(3, this.mH5Downgrade);
       }
       return super.onKeyDown(p0, p1);
    }
    public void onPayFinish(int p0,String p1){
       FrontCashierOneStepActivity uFrontCashie = FrontCashierOneStepActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uFrontCashie, "12")) {
          return;
       }
       g.d("FrontCashierOneStepActivity onPayFinish, resultCode="+p0);
       d.d("PROVIDER_RETURN_PAYMENT_RESULT", this.mMerchantId, this.mOutOrderNo, d.a(p0), this.mPayParams, "PRE_CASHIER_SDK_NATIVE");
       Map map = e.a(this.mPayParams, this.mMerchantId, this.mOutOrderNo, "PRE_CASHIER_SDK_NATIVE");
       map.put("result_code", Integer.valueOf(p0));
       map.put("result_name", d.a(p0));
       e.e("thirdSdkReturnResult", map, this.mToken);
       this.handlePayFinish(p0, p1);
       return;
    }
    public final void queryPayResult(){
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "15")) {
          return;
       }
       g.d("FrontCashierOneStepActivity queryPayResult");
       this.mLoadingView.setLoadingText(this.getString(R.string.arg_RES_7f103ba2));
       this.mLoadingView.b();
       c uoc = new c(1, 1000);
       d.d("KUAISHOUPAY_TRADE_QUERY", this.mMerchantId, this.mOutOrderNo, "UNKNOWN_STATUS", this.mPayParams, null);
       o.a().queryPayResult(this.mMerchantId, this.mOutOrderNo).map(new a()).doOnNext(new r(uoc)).retryWhen(uoc).subscribe(new n(this), new q(this));
       return;
    }
    public final void returnResult(int p0,boolean p1){
       FrontCashierOneStepActivity uFrontCashie = FrontCashierOneStepActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uFrontCashie, "20")) {
          return;
       }
       this.returnResult(p0, p1, null);
       return;
    }
    public final void returnResult(int p0,boolean p1,String p2){
       boolean b;
       FrontCashierOneStepActivity uFrontCashie = this;
       int i = p0;
       if (PatchProxy.isSupport(FrontCashierOneStepActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), p2, this, FrontCashierOneStepActivity.class, "21")) {
          return;
       }
       b.o("FrontCashierOneStepActivity", " handleResult, resultCode="+i+", hasHandled="+uFrontCashie.mPayFinished);
       if (uFrontCashie.mPayFinished != null) {
          return;
       }
       b = true;
       uFrontCashie.mPayFinished = b;
       String str = (p1)? "NATIVE_THEN_COMMON_CASHIER": "PRE_CASHIER_SDK_NATIVE";
       String str1 = str;
       d.d("KUAISHOUPAY_PAYMENT_RESULT", uFrontCashie.mMerchantId, uFrontCashie.mOutOrderNo, d.a(p0), uFrontCashie.mPayParams, str1);
       Map map = e.a(uFrontCashie.mPayParams, uFrontCashie.mMerchantId, uFrontCashie.mOutOrderNo, str1);
       map.put("result_code", Integer.valueOf(p0));
       map.put("result_name", d.a(p0));
       e.e("returnResultToBusiness", map, uFrontCashie.mToken);
       PayResult$PaySdKElapsedTime paySdKElapse = new PayResult$PaySdKElapsedTime(uFrontCashie.mPaySDKStartAppTimestamp, uFrontCashie.mPaySDKEndAppTimestamp, uFrontCashie.mPaySDKQueryResultCompletedTimestamp);
       PayResult payResult = new PayResult(i, uFrontCashie.mOutOrderNo, uFrontCashie.mMerchantId, "", map);
       if (uFrontCashie.mPayParams != null) {
          c uoc = c.b();
          if (i == b) {
             FrontCashierOneStepActivity mPayParams = uFrontCashie.mPayParams;
             uoc.c(mPayParams.mProvider, mPayParams.mChannelType, mPayParams.mPaymentMethod);
          }else {
             FrontCashierOneStepActivity mPayParams1 = uFrontCashie.mPayParams;
             b uob = new b(p0, uFrontCashie.mOutOrderNo, p2, mPayParams1.mProvider, mPayParams1.mChannelType, mPayParams1.mPaymentMethod, str1);
             uoc.d(v3);
          }
       }
       if (uFrontCashie.mReceiver != null) {
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "order_pay_result", v2);
          uFrontCashie.mReceiver.send(i, uBundle);
       }
       if (i == b && (PayManager.getInstance().getKwaiPayConfig() == null || !PayManager.getInstance().getKwaiPayConfig().enableReportPaySuccessLog())) {
          b = false;
       }
       a.f().e(b);
       return;
    }
    public final void returnResultAndFinish(int p0){
       FrontCashierOneStepActivity uFrontCashie = FrontCashierOneStepActivity.class;
       if (PatchProxy.isSupport(uFrontCashie) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFrontCashie, "18")) {
          return;
       }
       this.returnResultAndFinish(p0, null);
       return;
    }
    public final void returnResultAndFinish(int p0,String p1){
       if (PatchProxy.isSupport(FrontCashierOneStepActivity.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, FrontCashierOneStepActivity.class, "19")) {
          return;
       }
       this.returnResult(p0, false);
       this.finish();
       return;
    }
    public final void startFrontCashierPay(){
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "5")) {
          return;
       }
       StringBuilder str = "startFrontCashierPay, needToH5=";
       FrontCashierOneStepActivity tmPayParams = this.mPayParams;
       String str1 = "param is null";
       Boolean uBoolean = (tmPayParams != null)? Boolean.valueOf(tmPayParams.mNeedToH5): str1;
       str = str+uBoolean+", payCode=";
       tmPayParams = this.mPayParams;
       if (tmPayParams != null) {
          str1 = tmPayParams.mPayCode;
       }
       b.o("FrontCashierOneStepActivity", str+str1);
       FrontCashierOneStepActivity tmPayParams1 = this.mPayParams;
       if (tmPayParams1 == null || tmPayParams1.mNeedToH5 != null) {
          this.mH5Downgrade = true;
          this.startH5OrderCashier();
       }else if(TextUtils.equals("SUCCESS", tmPayParams1.mPayCode)){
          this.startThirdPay();
       }else {
          i.d(R.style.arg_RES_7f11066a, this.mPayParams.mPayMsg);
          this.returnResultAndFinish(2);
       }
       return;
    }
    public final void startH5OrderCashier(){
       PayWebViewActivity$a uoa;
       JsonObject jsonObject = JsonObject.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FrontCashierOneStepActivity.class, "9")) {
          return;
       }
       String str = "FrontCashierOneStepActivity";
       b.o(str, " startH5OrderCashier start");
       if (TextUtils.isEmpty(this.mMerchantId) || TextUtils.isEmpty(this.mOutOrderNo)) {
          FrontCashierOneStepActivity tmPayParams = this.mPayParams;
          FrontCashierPayParams mProvider = (tmPayParams != null)? tmPayParams.mProvider: "";
          b.l(str, " startH5OrderCashier failed, merchantId or orderId is null", this.getErrorReportMap(mProvider, objArray));
          this.handleH5PayFinish(30);
          return;
       }else if(!TextUtils.isEmpty(this.mPayParamsStr)){
          try{
             JsonObject jsonObject1 = (TextUtils.isEmpty(this.mExtra))? new JsonObject(): d.a.h(this.mExtra, jsonObject);
             jsonObject1.G("pay_result", d.a.h(this.mPayParamsStr, jsonObject));
             jsonObject1.c0("sessionId", this.mToken);
             jsonObject1.c0("cashier_type", "NATIVE_THEN_COMMON_CASHIER");
             this.mExtra = jsonObject1.toString();
          }catch(com.google.gson.JsonSyntaxException e0){
             b.g(str, " startH5OrderCashier insert payParams error", e0);
          }
       }
    }
    public final void startH5Pay(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrontCashierOneStepActivity.class, "7")) {
          return;
       }
       String str = "FrontCashierOneStepActivity";
       b.o(str, "startH5Pay, provider ="+p0);
       if (TextUtils.isEmpty(this.mPayParams.mProviderConfig)) {
          b.f(str, " startH5Pay failed, providerConfig is null!");
          this.handlePayFinish(30, null);
          return;
       }else {
          this.mPaySDKStartAppTimestamp = System.currentTimeMillis();
          Intent intent = new Intent(this, GatewayH5PayActivity.class);
          intent.putExtra("provider", p0);
          GatewayPayPrepayResponse gatewayPayPr = new GatewayPayPrepayResponse();
          FrontCashierOneStepActivity tmPayParams = this.mPayParams;
          gatewayPayPr.mReferer = tmPayParams.mReferer;
          gatewayPayPr.mProviderConfig = tmPayParams.mProviderConfig;
          gatewayPayPr.mOutTradeNo = tmPayParams.mOutTradeNo;
          SerializableHook.putExtra(intent, "prepay_response", gatewayPayPr);
          this.startActivityForResult(intent, 101);
          this.overridePendingTransition(R.anim.arg_RES_7f0100da, 0x7f0100dc);
          d.d("PROVIDER_H5_START", this.mMerchantId, this.mOutOrderNo, null, this.mPayParams, "PRE_CASHIER_SDK_NATIVE");
          return;
       }
    }
    public final void startNativePayInApp(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrontCashierOneStepActivity.class, "8")) {
          return;
       }
       g.d("FrontCashierOneStepActivity startNativePayInApp start, provider="+p0);
       FrontCashierPayParams mProviderCon = this.mPayParams.mProviderConfig;
       String str = null;
       String str1 = "FrontCashierOneStepActivity";
       if (TextUtils.isEmpty(mProviderCon)) {
          b.f(str1, "startNativePayInApp failed, mProviderConfig is null!");
          this.handlePayFinish(30, str);
          return;
       }else {
          a uoa = e.a(this, p0);
          this.mPay = uoa;
          if (uoa == null || !uoa.a()) {
             this.handlePayFinish(2, str);
             b.f(str1, " startNativePayInApp failed, provider:"+p0+" not avalible");
             return;
          }else {
             d.d("PROVIDER_SDK_START", this.mMerchantId, this.mOutOrderNo, null, this.mPayParams, "PRE_CASHIER_SDK_NATIVE");
             e.e("startPullUpThirdSdk", e.a(this.mPayParams, this.mMerchantId, this.mOutOrderNo, "PRE_CASHIER_SDK_NATIVE"), this.mToken);
             this.mPaySDKStartAppTimestamp = System.currentTimeMillis();
             this.mPay.a(mProviderCon, this);
             return;
          }
       }
    }
    public final void startThirdPay(){
       int i;
       if (PatchProxy.applyVoid(null, this, FrontCashierOneStepActivity.class, "6")) {
          return;
       }
       g.d("FrontCashierOneStepActivity startThirdPay, provider="+this.mPayParams.mProvider+", paymentMethod="+this.mPayParams.mPaymentMethod);
       this.logStartThirdPayDuration();
       String str = (!TextUtils.isEmpty(this.mPayParams.mProvider))? (this.mPayParams.mProvider).toLowerCase(): this.mPayParams.mProvider;
       String str1 = str;
       if (("H5").equals(this.mPayParams.mPaymentMethod) && c.m(str1)) {
          this.startH5Pay(str1);
       }else if(("IN_APP").equals(this.mPayParams.mPaymentMethod)){
          this.startNativePayInApp(str1);
       }else if(("PAP").equals(this.mPayParams.mPaymentMethod)){
          i = 1;
       }else {
          b.i("FrontCashierOneStepActivity", "oneStepPay failed, invalid pay method", null, "paymentMethod", this.mPayParams.mPaymentMethod, "provider", str1);
          g.d("FrontCashierOneStepActivity startThirdPay failed, invalid pay method");
          i = 30;
       }
       this.handlePayFinish(i, null);
       return;
    }
}
