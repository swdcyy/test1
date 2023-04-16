package com.yxcorp.gateway.pay.activity.GatewayOrderPrepayActivity;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gateway.pay.params.PaymentInfo;
import android.os.ResultReceiver;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.os.Parcelable;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import lv8.d;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import nv8.b;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Integer;
import java.lang.StringBuilder;
import lv8.g;
import ekd.j0;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.Boolean;
import android.content.res.Configuration;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import lv8.k;
import android.os.Build$VERSION;
import lv8.q;
import java.util.Map;
import nv8.e;
import nv8.d;
import com.yxcorp.gateway.pay.params.PayResult;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.api.KwaiPayConfig;
import nv8.a;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import gv8.s;
import fv8.a;

public class GatewayOrderPrepayActivity extends BaseActivity	// class@001202
{
    public boolean mPayFinished;
    public PaymentInfo mPaymentInfo;
    public ResultReceiver mReceiver;
    public String mToken;

    public void GatewayOrderPrepayActivity(){
       super();
    }
    public static void E2(GatewayOrderPrepayActivity p0,int p1,int p2,Intent p3){
       p0.lambda$startOrderPrepay$0(p1, p2, p3);
    }
    private void lambda$startOrderPrepay$0(int p0,int p1,Intent p2){
       this.handleActivityCallback(p0, p1, p2);
    }
    public static void startOrderPrepayActivity(Context p0,PaymentInfo p1,ResultReceiver p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, GatewayOrderPrepayActivity.class, "1")) {
          return;
       }
       Intent intent = new Intent(p0, GatewayOrderPrepayActivity.class);
       SerializableHook.putExtra(intent, "paymentInfo", p1);
       intent.putExtra("result_receiver", p2);
       intent.putExtra("token", p3);
       if (!p0 instanceof Activity) {
          intent.addFlags(0x10000000);
       }
       p0.startActivity(intent);
       return;
    }
    public final String appendExtra(String p0,String p1,String p2){
       JsonObject obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GatewayOrderPrepayActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = (TextUtils.isEmpty(p0))? new JsonObject(): d.a.h(p0, JsonObject.class);
          obj.c0(p1, p2);
          p0 = obj.toString();
       }catch(java.lang.Exception e8){
          b.h("GatewayOrderPrepayActivity", "appendExtra error", e8, "extra", p0);
       }
       return p0;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, GatewayOrderPrepayActivity.class, "7")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public String getPageName(){
       return "GATEWAY_ORDER_PREPAY";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GatewayOrderPrepayActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final void handleActivityCallback(int p0,int p1,Intent p2){
       JsErrorResult jsErrorResul;
       if (PatchProxy.isSupport(GatewayOrderPrepayActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, GatewayOrderPrepayActivity.class, "6")) {
          return;
       }
       g.d("OrderPrepayActivity handleActivityCallback, requestCode:"+p0+", resultCode:"+p1);
       if (p0 == 100) {
          if (p1 != -1) {
             this.handlePayFinish(3);
             return;
          }else {
             p0 = 30;
             try{
                String str = j0.f(p2, "exit_data");
                if (TextUtils.isEmpty(str)) {
                   b.f("GatewayOrderPrepayActivity", "OrderPrepayActivity handleActivityCallback extraData null");
                   this.handlePayFinish(p0);
                   return;
                }else {
                   jsErrorResul = d.a.h(str, JsErrorResult.class);
                }
             }catch(java.lang.Exception e10){
                b.g("GatewayOrderPrepayActivity", "OrderPrepayActivity handleActivityCallback result JSONException: ", e10);
                jsErrorResul = null;
             }
             if (jsErrorResul == null) {
                this.handlePayFinish(p0);
                return;
             }else {
                BaseResult mResult = jsErrorResul.mResult;
                if (mResult != null) {
                   jsErrorResul = 1;
                   if (mResult != jsErrorResul) {
                      mResult = (mResult != 412)? 2: 0;
                      this.handlePayFinish(mResult);
                   }else {
                      this.handlePayFinish(jsErrorResul);
                   }
                }else {
                   this.handlePayFinish(3);
                }
             }
          }
       }
       return;
    }
    public final void handlePayFinish(int p0){
       GatewayOrderPrepayActivity gatewayOrder = GatewayOrderPrepayActivity.class;
       if (PatchProxy.isSupport(gatewayOrder) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, gatewayOrder, "10")) {
          return;
       }
       this.returnResult(p0);
       this.finish();
       return;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public final boolean isLandScape(){
       Configuration obj = PatchProxy.apply(null, this, GatewayOrderPrepayActivity.class, "3");
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
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, GatewayOrderPrepayActivity.class, "9")) {
          return;
       }
       super.onBackPressed();
       g.d("OrderPrepayActivity onBackPressed");
       this.handlePayFinish(3);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayOrderPrepayActivity.class, "2")) {
          return;
       }
       int i = 0;
       this.overridePendingTransition(i, i);
       k.b(this, i, true, true);
       super.onCreate(p0);
       if (!this.isLandScape() && Build$VERSION.SDK_INT < 29) {
          q.b(this);
       }
       this.mPaymentInfo = j0.e(this.getIntent(), "paymentInfo");
       this.mToken = j0.f(this.getIntent(), "token");
       this.mReceiver = j0.d(this.getIntent(), "result_receiver");
       GatewayOrderPrepayActivity tmPaymentInf = this.mPaymentInfo;
       if (tmPaymentInf != null && (TextUtils.isEmpty(tmPaymentInf.mMerchantId) || TextUtils.isEmpty(this.mPaymentInfo.mOutOrderNo))) {
          b.h("GatewayOrderPrepayActivity", "invalid paymentInfo!!!!!", null, "paymentInfo", this.mPaymentInfo);
          this.handlePayFinish(30);
          return;
       }else {
          this.startOrderPrepay();
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, GatewayOrderPrepayActivity.class, "8")) {
          return;
       }
       if (this.mPayFinished == null) {
          g.d("OrderPrepayActivity destroy with unknown status");
          this.returnResult(0);
       }
       super.onDestroy();
       return;
    }
    public final void returnResult(int p0){
       GatewayOrderPrepayActivity gatewayOrder = GatewayOrderPrepayActivity.class;
       if (PatchProxy.isSupport(gatewayOrder) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, gatewayOrder, "11")) {
          return;
       }
       String str = (TextUtils.isEmpty(this.mPaymentInfo.getProvider()))? "COMMON_CASHIER": "PRE_CASHIER_SDK_H5";
       Map map = e.b(this.mPaymentInfo, str);
       map.put("result_code", Integer.valueOf(p0));
       map.put("result_name", d.a(p0));
       e.e("returnResultToBusiness", map, this.mToken);
       boolean b = true;
       this.mPayFinished = b;
       GatewayOrderPrepayActivity tmPaymentInf = this.mPaymentInfo;
       PayResult payResult = new PayResult(p0, tmPaymentInf.mOutOrderNo, tmPaymentInf.mMerchantId, tmPaymentInf.mProvider);
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
    public final void startOrderPrepay(){
       PayWebViewActivity$a this;
       if (PatchProxy.applyVoid(null, this, GatewayOrderPrepayActivity.class, "4")) {
          return;
       }
       GatewayOrderPrepayActivity tmPaymentInf = this.mPaymentInfo;
       this.appendExtra(tmPaymentInf.mExtra, "sessionId", this.mToken);
       String str = PayManager.getInstance().buildOrderCashierUrl(tmPaymentInf.mMerchantId, tmPaymentInf.mOutOrderNo, this);
       this = PayWebViewActivity.buildWebViewIntent(this, str);
       this.c(true);
       this.d(this.mToken);
       this.startActivityForCallback(this.a(), 100, new s(this));
       b.p("GatewayOrderPrepayActivity", "startOrderPrepay", "url", str);
       return;
    }
}
