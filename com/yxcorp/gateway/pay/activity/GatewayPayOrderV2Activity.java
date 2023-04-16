package com.yxcorp.gateway.pay.activity.GatewayPayOrderV2Activity;
import fv8.b;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import android.app.Activity;
import android.os.ResultReceiver;
import com.yxcorp.gateway.pay.params.GatewayPrepayParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.content.Context;
import android.os.Parcelable;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Integer;
import java.lang.StringBuilder;
import lv8.g;
import nv8.d;
import com.yxcorp.gateway.pay.params.PayResult;
import android.os.Bundle;
import java.lang.Boolean;
import android.content.res.Configuration;
import ev8.a;
import lv8.k;
import android.os.Build$VERSION;
import lv8.q;
import ekd.j0;
import nv8.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gateway.pay.activity.GatewayH5PayActivity;
import com.yxcorp.gateway.pay.response.GatewayPayPrepayResponse;
import androidx.fragment.app.FragmentActivity;
import kv8.e;
import gv8.z0;
import java.lang.Throwable;
import lv8.c;

public class GatewayPayOrderV2Activity extends BaseActivity implements b	// class@001206
{
    public String mMerchantId;
    public String mOutTradeNo;
    public a mPay;
    public boolean mPayFinished;
    public GatewayPrepayParams mPayParams;
    public String mProvider;
    public ResultReceiver mReceiver;

    public void GatewayPayOrderV2Activity(){
       super();
    }
    public static void startOrderV2Activity(Activity p0,ResultReceiver p1,GatewayPrepayParams p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, GatewayPayOrderV2Activity.class, "1")) {
          return;
       }
       Intent intent = new Intent(p0, GatewayPayOrderV2Activity.class);
       intent.putExtra("result_receiver", p1);
       SerializableHook.putExtra(intent, "pay_params", p2);
       p0.startActivity(intent);
       return;
    }
    public String getPageName(){
       return "PAGE_GATEWAY_ORDER_PAY_V2";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GatewayPayOrderV2Activity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final void handlePayFinish(int p0){
       GatewayPayOrderV2Activity gatewayPayOr = GatewayPayOrderV2Activity.class;
       if (PatchProxy.isSupport(gatewayPayOr) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, gatewayPayOr, "10")) {
          return;
       }
       g.d("OrderPay handlePayFinish, resultCode = "+p0);
       this.mPayFinished = true;
       d.e("PROVIDER_RETURN_PAYMENT_RESULT", this.mMerchantId, this.mOutTradeNo, this.mProvider, this.mPayParams.mPayMethod, d.a(p0), null);
       PayResult payResult = new PayResult(p0, this.mOutTradeNo, this.mMerchantId, this.mProvider);
       if (this.mReceiver != null) {
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "order_pay_result", payResult);
          this.mReceiver.send(p0, uBundle);
       }
       this.finish();
       return;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public final boolean isLandScape(){
       Configuration obj = PatchProxy.apply(null, this, GatewayPayOrderV2Activity.class, "9");
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
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(GatewayPayOrderV2Activity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, GatewayPayOrderV2Activity.class, "3")) {
          return;
       }
       if (p0 == 100) {
          this.onPayFinish(0, null);
       }else {
          GatewayPayOrderV2Activity tmPay = this.mPay;
          if (tmPay == null || !tmPay.b(p0, p1, p2)) {
             this.onPayFinish(p1, null);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayOrderV2Activity.class, "2")) {
          return;
       }
       g.d("GatewayPayOrderV2Activity onCreate");
       int i = 0;
       this.overridePendingTransition(i, i);
       k.b(this, i, true, true);
       super.onCreate(p0);
       if (!this.isLandScape() && Build$VERSION.SDK_INT < 29) {
          q.b(this);
       }
       this.mReceiver = j0.d(this.getIntent(), "result_receiver");
       GatewayPrepayParams gatewayPrepa = j0.e(this.getIntent(), "pay_params");
       this.mPayParams = gatewayPrepa;
       if (gatewayPrepa == null) {
          b.f("GatewayPayOrderV2Activity", "OrderPay failed, payParams is null");
          this.handlePayFinish(30);
          return;
       }else {
          this.mOutTradeNo = gatewayPrepa.mOutTradeNo;
          this.mMerchantId = gatewayPrepa.mMerchantId;
          if (!TextUtils.x(gatewayPrepa.mProvider)) {
             this.mProvider = (this.mPayParams.mProvider).toLowerCase();
          }
          this.startOrderPay();
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, GatewayPayOrderV2Activity.class, "5")) {
          return;
       }
       if (this.mPayFinished == null) {
          b.o("GatewayPayOrderV2Activity", "destroy with unknown status");
          this.mPayFinished = true;
          PayResult payResult = new PayResult("3", this.mOutTradeNo, this.mMerchantId, this.mProvider);
          if (this.mReceiver != null) {
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "order_pay_result", payResult);
             this.mReceiver.send(3, uBundle);
          }
       }
       super.onDestroy();
       return;
    }
    public void onPayFinish(int p0,String p1){
       GatewayPayOrderV2Activity gatewayPayOr = GatewayPayOrderV2Activity.class;
       if (PatchProxy.isSupport(gatewayPayOr) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, gatewayPayOr, "4")) {
          return;
       }
       g.d("OrderPay finished, result="+p0);
       this.handlePayFinish(p0);
       return;
    }
    public final void startH5Pay(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayOrderV2Activity.class, "7")) {
          return;
       }
       String str = "GatewayPayOrderV2Activity";
       String str1 = "provider";
       b.p(str, "startH5Pay", str1, p0);
       if (TextUtils.x(this.mPayParams.mProviderConfig)) {
          this.onPayFinish(30, null);
          b.f(str, "startH5Pay failed, providerConfig is null!");
          return;
       }else {
          Intent intent = new Intent(this, GatewayH5PayActivity.class);
          intent.putExtra(str1, p0);
          GatewayPayPrepayResponse gatewayPayPr = new GatewayPayPrepayResponse();
          GatewayPayOrderV2Activity tmPayParams = this.mPayParams;
          gatewayPayPr.mReferer = tmPayParams.mReferer;
          gatewayPayPr.mProviderConfig = tmPayParams.mProviderConfig;
          gatewayPayPr.mOutTradeNo = tmPayParams.mOutTradeNo;
          SerializableHook.putExtra(intent, "prepay_response", gatewayPayPr);
          this.startActivityForResult(intent, 100);
          this.overridePendingTransition(R.anim.arg_RES_7f0100da, 0x7f0100dc);
          return;
       }
    }
    public final void startNativePay(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayOrderV2Activity.class, "8")) {
          return;
       }
       GatewayPrepayParams mProviderCon = this.mPayParams.mProviderConfig;
       if (TextUtils.x(mProviderCon)) {
          b.f("GatewayPayOrderV2Activity", "startNativePay failed, mProviderConfig is null!");
          this.onPayFinish(30, null);
          return;
       }else {
          a uoa = e.a(this, p0);
          this.mPay = uoa;
          if (uoa == null || !uoa.a()) {
             this.onPayFinish(2, null);
             b.h("GatewayPayOrderV2Activity", "startNativePay failed,provider invalid !", null, "provider", p0);
             return;
          }else {
             b.p("GatewayPayOrderV2Activity", "startNativePay", "provider", p0);
             d.e("PROVIDER_SDK_START", this.mMerchantId, this.mOutTradeNo, this.mProvider, this.mPayParams.mPayMethod, null, null);
             this.mPay.a(mProviderCon, new z0(this));
             return;
          }
       }
    }
    public final void startOrderPay(){
       if (PatchProxy.applyVoid(null, this, GatewayPayOrderV2Activity.class, "6")) {
          return;
       }
       b.o("GatewayPayOrderV2Activity", "startOrderPay: payParams="+this.mPayParams.toSimpleString());
       if (("H5").equals(this.mPayParams.mPayMethod) && c.m(this.mProvider)) {
          this.startH5Pay(this.mProvider);
       }else if(("IN_APP").equals(this.mPayParams.mPayMethod)){
          this.startNativePay(this.mProvider);
       }else {
          g.d("OrderPay failed, invalid pay method");
          this.handlePayFinish(30);
       }
       return;
    }
}
