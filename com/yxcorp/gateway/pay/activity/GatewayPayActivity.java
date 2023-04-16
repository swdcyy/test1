package com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import fv8.b;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import java.lang.Throwable;
import android.view.View;
import com.yxcorp.gateway.pay.response.DepositQueryResponse;
import com.yxcorp.gateway.pay.response.GatewayPayConfigResponse;
import com.yxcorp.gateway.pay.response.DepositPrepayResponse;
import java.lang.String;
import com.yxcorp.gateway.pay.response.GatewayPayPrepayResponse;
import com.yxcorp.gateway.pay.loading.PayLoadingView;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gateway.pay.params.PayResult;
import nv8.b;
import android.view.ViewGroup;
import java.lang.Object;
import java.util.Map;
import lv8.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.yxcorp.utility.TextUtils;
import lv8.d;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import lv8.c;
import gv8.e0;
import android.view.View$OnClickListener;
import android.content.Context;
import android.content.Intent;
import gv8.t;
import gv8.h0;
import java.lang.Integer;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.os.ResultReceiver;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.api.KwaiPayConfig;
import nv8.a;
import com.yxcorp.gateway.pay.service.GatewayPayApiService;
import lv8.o;
import com.yxcorp.gateway.pay.params.GatewayPayInputParams$GatewayPayOrder;
import com.yxcorp.gateway.pay.params.GatewayPayInputParams;
import brd.t;
import iv8.a;
import erd.o;
import gv8.k0;
import erd.a;
import gv8.w;
import gv8.z;
import erd.g;
import crd.b;
import android.app.Activity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import ekd.j0;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import java.lang.Boolean;
import android.net.Uri;
import android.os.Parcelable;
import gv8.d0;
import gv8.f0;
import gv8.g0;
import gv8.u;
import gv8.v;
import gv8.y;
import gv8.j0;
import gv8.x;
import gv8.a0;
import gv8.l0;
import gv8.c0;
import gv8.b0;
import ev8.a;
import android.content.res.Configuration;
import lv8.k;
import android.os.Build$VERSION;
import lv8.q;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import android.view.LayoutInflater;
import ag6.a;
import android.widget.TextView;
import android.widget.ImageView;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity$a;
import java.lang.reflect.Type;
import el.a;
import com.yxcorp.gateway.pay.params.GatewayPayBizContent;
import java.lang.Long;
import com.yxcorp.gateway.pay.activity.GatewayH5PayActivity;
import kv8.e;
import gv8.i0;

public class GatewayPayActivity extends BaseActivity implements b	// class@001204
{
    public ViewGroup mCashierDeskView;
    public View mCheckBtnAlipay;
    public View mCheckBtnKwai;
    public View mCheckBtnWechat;
    public String mDepositNo;
    public boolean mIsDeposit;
    public boolean mIsPayFinish;
    public boolean mIsShowCashierDesk;
    public PayLoadingView mLoadingView;
    public int mOrientation;
    public String mOutTradeNo;
    public a mPay;
    public GatewayPayConfigResponse mPayConfigResponse;
    public GatewayPayInputParams mPayInputParams;
    public GatewayPayInputParams$GatewayPayOrder mPayOrder;
    public ResultReceiver mReceiver;
    public ViewGroup mRootView;
    public String mSelectedProvider;

    public void GatewayPayActivity(){
       super();
    }
    public static void E2(GatewayPayActivity p0){
       p0.lambda$loadPayConfig$6();
    }
    public static void F2(GatewayPayActivity p0,Throwable p1){
       p0.lambda$loadDepositPrepay$5(p1);
    }
    public static void G2(GatewayPayActivity p0,View p1){
       p0.lambda$addKwaiPay$17(p1);
    }
    public static void H2(GatewayPayActivity p0,Throwable p1){
       p0.lambda$depositQuery$14(p1);
    }
    public static void L2(GatewayPayActivity p0,DepositQueryResponse p1){
       p0.lambda$depositQuery$13(p1);
    }
    public static void M2(GatewayPayActivity p0,GatewayPayConfigResponse p1){
       p0.lambda$loadPayConfig$7(p1);
    }
    public static void N2(GatewayPayActivity p0,DepositPrepayResponse p1){
       p0.lambda$loadDepositPrepay$4(p1);
    }
    public static void O2(GatewayPayActivity p0,View p1){
       p0.lambda$initView$0(p1);
    }
    public static void P2(GatewayPayActivity p0){
       p0.lambda$depositQuery$12();
    }
    public static void Q2(GatewayPayActivity p0){
       p0.lambda$loadPrepayInfo$9();
    }
    public static void R2(GatewayPayActivity p0,Throwable p1){
       p0.lambda$loadPayConfig$8(p1);
    }
    public static void T2(GatewayPayActivity p0,Throwable p1){
       p0.lambda$loadPrepayInfo$11(p1);
    }
    public static void U2(GatewayPayActivity p0,View p1){
       p0.lambda$addAliPay$16(p1);
    }
    public static void V2(GatewayPayActivity p0,View p1){
       p0.lambda$initView$1(p1);
    }
    public static void W2(GatewayPayActivity p0,String p1,GatewayPayPrepayResponse p2){
       p0.lambda$loadPrepayInfo$10(p1, p2);
    }
    public static void X2(GatewayPayActivity p0,View p1){
       p0.lambda$initView$2(p1);
    }
    public static void Y2(GatewayPayActivity p0){
       p0.lambda$loadDepositPrepay$3();
    }
    public static void Z2(GatewayPayActivity p0,View p1){
       p0.lambda$addWechatPay$15(p1);
    }
    private void lambda$addAliPay$16(View p0){
       this.mSelectedProvider = "alipay";
       this.mCheckBtnAlipay.setSelected(true);
       GatewayPayActivity tmCheckBtnWe = this.mCheckBtnWechat;
       if (tmCheckBtnWe != null) {
          tmCheckBtnWe.setSelected(false);
       }
       tmCheckBtnWe = this.mCheckBtnKwai;
       if (tmCheckBtnWe != null) {
          tmCheckBtnWe.setSelected(false);
       }
       return;
    }
    private void lambda$addKwaiPay$17(View p0){
       this.mSelectedProvider = "kscoin";
       this.mCheckBtnKwai.setSelected(true);
       GatewayPayActivity tmCheckBtnWe = this.mCheckBtnWechat;
       if (tmCheckBtnWe != null) {
          tmCheckBtnWe.setSelected(false);
       }
       tmCheckBtnWe = this.mCheckBtnAlipay;
       if (tmCheckBtnWe != null) {
          tmCheckBtnWe.setSelected(false);
       }
       return;
    }
    private void lambda$addWechatPay$15(View p0){
       this.mSelectedProvider = "wechat";
       this.mCheckBtnWechat.setSelected(true);
       GatewayPayActivity tmCheckBtnAl = this.mCheckBtnAlipay;
       if (tmCheckBtnAl != null) {
          tmCheckBtnAl.setSelected(false);
       }
       tmCheckBtnAl = this.mCheckBtnKwai;
       if (tmCheckBtnAl != null) {
          tmCheckBtnAl.setSelected(false);
       }
       return;
    }
    private void lambda$depositQuery$12(){
       this.mLoadingView.d();
    }
    private void lambda$depositQuery$13(DepositQueryResponse p0){
       String str = "SUCCESS";
       if (TextUtils.equals(str, p0.mDepositState)) {
          PayResult payResult = new PayResult("1", this.mDepositNo, p0.mDepositAmount, p0.mIncentiveAmout, p0.mCompleteTime);
          this.depositFinishCallback(1, v8);
          this.logTaskEvent(str);
       }else {
          PayResult payResult1 = new PayResult("0", this.mDepositNo, p0.mDepositAmount, p0.mIncentiveAmout, p0.mCompleteTime);
          this.depositFinishCallback(0, v7);
          this.logTaskEvent("UNKNOWN_STATUS");
       }
       this.finish();
       return;
    }
    private void lambda$depositQuery$14(Throwable p0){
       PayResult payResult = new PayResult("0", this.mDepositNo, "", "", "");
       this.depositFinishCallback(0, v6);
       b.g("GatewayPayActivity", "DepositPay depositQuery failed", p0);
       this.logTaskEvent("UNKNOWN_STATUS");
       this.finish();
    }
    private void lambda$initView$0(View p0){
       if (this.mIsShowCashierDesk != null) {
          this.mCashierDeskView.setVisibility(8);
          this.mIsShowCashierDesk = false;
       }
       String str = "inApp";
       if (!(this.mSelectedProvider).equals("kscoin") && (this.mPayConfigResponse.mProviderConfig.get((this.mSelectedProvider).toUpperCase())).equals("H5")) {
          str = "h5";
       }
       this.loadPrepayInfo(str);
       GatewayPayActivity tmSelectedPr = this.mSelectedProvider;
       GatewayPayActivity tmOutTradeNo = this.mOutTradeNo;
       String str1 = PatchProxy.applyThreeRefs(tmSelectedPr, tmOutTradeNo, null, null, g.class, "17");
       if (str1 != PatchProxyResult.class) {
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("provider", tmSelectedPr);
          if (!TextUtils.x(tmOutTradeNo)) {
             hashMap.put("out_trade_no", tmOutTradeNo);
          }
          if (!TextUtils.x(null)) {
             hashMap.put("gateway_prepay_no", null);
          }
          str1 = d.a.q(hashMap);
       }
       g.e("GATEWAYPAY_CONFIRM_CLICK", str1);
       return;
    }
    private void lambda$initView$1(View p0){
       this.onPayFinish(3, null);
    }
    private void lambda$initView$2(View p0){
       if (!this.mCashierDeskView.getVisibility()) {
          this.onPayFinish(3, null);
       }
       return;
    }
    private void lambda$loadDepositPrepay$3(){
       this.mLoadingView.d();
    }
    private void lambda$loadDepositPrepay$4(DepositPrepayResponse p0){
       b.p("GatewayPayActivity", this.getLogType()+" loadDepositPrepay", "source", p0.mDepositSource);
       if (TextUtils.equals(p0.mDepositSource, "GATEWAY")) {
          this.openGatewayCashierDesk(p0);
       }else if(TextUtils.equals(p0.mDepositSource, "ORDER")){
          this.openOrderCashierDesk(p0);
       }else {
          this.onPayFinish(30, null);
          b.h("GatewayPayActivity", this.getLogType()+"loadDepositPrepay failed, deposit source error", null, "depositSource", p0.mDepositSource);
       }
       return;
    }
    private void lambda$loadDepositPrepay$5(Throwable p0){
       this.onPayFinish(300, null);
       b.g("GatewayPayActivity", this.getLogType()+"loadDepositPrepay failed", p0);
    }
    private void lambda$loadPayConfig$6(){
       this.mLoadingView.d();
    }
    private void lambda$loadPayConfig$7(GatewayPayConfigResponse p0){
       if (c.k(p0.mProviderConfig)) {
          this.onPayFinish(30, null);
          b.f("GatewayPayActivity", this.getLogType()+" loadPayConfig failed, provider_config is null!");
          return;
       }else {
          this.mPayConfigResponse = p0;
          this.startPay();
          return;
       }
    }
    private void lambda$loadPayConfig$8(Throwable p0){
       this.onPayFinish(300, null);
       b.g("GatewayPayActivity", this.getLogType()+" loadPayConfig failed", p0);
    }
    private void lambda$loadPrepayInfo$10(String p0,GatewayPayPrepayResponse p1){
       this.mOutTradeNo = p1.mOutTradeNo;
       if (p0.equals("h5") || this.isContractConfig(p1.mProviderConfig)) {
          this.startH5Pay(this.mSelectedProvider, p1);
       }else {
          this.startNativePay(this.mSelectedProvider, p1);
       }
       return;
    }
    private void lambda$loadPrepayInfo$11(Throwable p0){
       this.onPayFinish(300, null);
       b.g("GatewayPayActivity", this.getLogType()+"loadPrepayInfo failed", p0);
    }
    private void lambda$loadPrepayInfo$9(){
       this.mLoadingView.d();
    }
    public final void addAliPay(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayActivity.class, "26")) {
          return;
       }
       if (this.mPayConfigResponse.mProviderConfig.get(("alipay").toUpperCase()) != null) {
          View view = this.setProviderStyle(p0, R.string.arg_RES_7f103b84, 0x7f081a52, "alipay");
          this.mCheckBtnAlipay = view;
          view.setOnClickListener(new e0(this));
       }
       return;
    }
    public final void addKwaiPay(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayActivity.class, "27")) {
          return;
       }
       if (this.mPayConfigResponse.mProviderConfig.get(("kscoin").toUpperCase()) != null && c.l(this) != null) {
          View view = this.setProviderStyle(p0, R.string.arg_RES_7f103b92, 0x7f081a6d, "kscoin");
          this.mCheckBtnKwai = view;
          view.setOnClickListener(new t(this));
       }
       return;
    }
    public final void addWechatPay(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayActivity.class, "25")) {
          return;
       }
       if (this.mPayConfigResponse.mProviderConfig.get(("wechat").toUpperCase()) != null && c.g(this, "com.tencent.mm")) {
          View view = this.setProviderStyle(p0, R.string.arg_RES_7f103bb3, 0x7f081a85, "wechat");
          this.mCheckBtnWechat = view;
          view.setOnClickListener(new h0(this));
       }
       return;
    }
    public final void depositFinishCallback(int p0,PayResult p1){
       GatewayPayActivity gatewayPayAc = GatewayPayActivity.class;
       if (PatchProxy.isSupport(gatewayPayAc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, gatewayPayAc, "21")) {
          return;
       }
       if (this.mReceiver != null) {
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "order_pay_result", p1);
          this.mReceiver.send(p0, uBundle);
       }
       int i = 1;
       if (p0 == i && (PayManager.getInstance().getKwaiPayConfig() == null || !PayManager.getInstance().getKwaiPayConfig().enableReportPaySuccessLog())) {
          i = false;
       }
       a.f().e(i);
       return;
    }
    public final void depositQuery(){
       if (PatchProxy.applyVoid(null, this, GatewayPayActivity.class, "23")) {
          return;
       }
       b.o("GatewayPayActivity", "DepositPay depositQuery start");
       this.mLoadingView.b();
       o.a().depositQuery(this.mPayOrder.mMerchantId, this.mPayInputParams.mAccountGroupKey, this.mDepositNo).map(new a()).doFinally(new k0(this)).subscribe(new w(this), new z(this));
       return;
    }
    public void finish(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GatewayPayActivity.class, "4")) {
          return;
       }
       if (this.mIsPayFinish == null) {
          this.onPayFinish(3, objArray);
       }else {
          this.mRootView.setBackgroundColor(0);
          super.finish();
          int i = (this.isLandScape())? 0x7f0100dc: 0x7f0100db;
          this.overridePendingTransition(0, i);
       }
       return;
    }
    public final String getLogType(){
       String str = (this.mIsDeposit != null)? "DepositPay": "GatewayPay";
       return str;
    }
    public String getPageName(){
       return "GATEWAY_PAY";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GatewayPayActivity.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final void handleDepositFinish(int p0){
       GatewayPayActivity gatewayPayAc = GatewayPayActivity.class;
       if (PatchProxy.isSupport(gatewayPayAc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, gatewayPayAc, "20")) {
          return;
       }
       gatewayPayAc = this.mPayOrder;
       String str = "";
       String str1 = (gatewayPayAc == null)? str: gatewayPayAc.mMerchantId;
       PayResult payResult = new PayResult(str+p0, this.mDepositNo, str1, this.mSelectedProvider);
       if (p0 && p0 != 1) {
          this.depositFinishCallback(p0, payResult);
          String str2 = (p0 != 3)? "FAIL": "CANCEL";
          this.logTaskEvent(str2);
          this.finish();
       }else {
          this.depositQuery();
       }
       return;
    }
    public final void handleOrderPayFinish(int p0,int p1,Intent p2){
       JsErrorResult jsErrorResul;
       if (PatchProxy.isSupport(GatewayPayActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, GatewayPayActivity.class, "18")) {
          return;
       }
       g.d(this.getLogType()+" handleOrderPayFinish, requestCode:"+p0+", resultCode:"+p1);
       if (p0 == 101) {
          if (p1 != -1) {
             this.onPayFinish(3, null);
             return;
          }else {
             p0 = 30;
             try{
                String str = j0.f(p2, "exit_data");
                if (TextUtils.isEmpty(str)) {
                   b.f("GatewayPayActivity", this.getLogType()+"handleOrderPayFinish, extraData null");
                   this.onPayFinish(p0, null);
                   return;
                }else {
                   jsErrorResul = d.a.h(str, JsErrorResult.class);
                }
             }catch(java.lang.Exception e10){
                b.g("GatewayPayActivity", this.getLogType()+"handleOrderPayFinish, result exception!", e10);
                jsErrorResul = null;
             }
             if (jsErrorResul == null) {
                this.onPayFinish(p0, null);
                return;
             }else {
                BaseResult mResult = jsErrorResul.mResult;
                if (mResult != null) {
                   jsErrorResul = 1;
                   if (mResult != jsErrorResul) {
                      mResult = (mResult != 412)? 2: 0;
                      this.onPayFinish(mResult, null);
                   }else {
                      this.onPayFinish(jsErrorResul, null);
                   }
                }else {
                   this.onPayFinish(3, null);
                }
             }
          }
       }
       return;
    }
    public final void handlePayFinish(int p0){
       String str2;
       GatewayPayActivity gatewayPayAc = GatewayPayActivity.class;
       if (PatchProxy.isSupport(gatewayPayAc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, gatewayPayAc, "22")) {
          return;
       }
       gatewayPayAc = this.mPayOrder;
       String str = "";
       String str1 = (gatewayPayAc == null)? str: gatewayPayAc.mMerchantId;
       if (p0) {
          if (p0 != 1) {
             if (p0 != 3) {
                PayManager.getInstance().onPayFailure(new PayResult(str+p0, this.mOutTradeNo, str1, this.mSelectedProvider));
                str2 = "FAIL";
             }else {
                PayManager.getInstance().onPayCancel(new PayResult(str+p0, this.mOutTradeNo, str1, this.mSelectedProvider));
                str2 = "CANCEL";
             }
          }else {
             PayManager.getInstance().onPaySuccess(new PayResult(str+p0, this.mOutTradeNo, str1, this.mSelectedProvider));
             str2 = "SUCCESS";
          }
       }else {
          PayManager.getInstance().onPayUnknown(new PayResult(str+p0, this.mOutTradeNo, str1, this.mSelectedProvider));
          str2 = "UNKNOWN_STATUS";
       }
       this.logTaskEvent(str2);
       this.finish();
       return;
    }
    public final boolean handleSignIntent(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GatewayPayActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null || p0.getData() == null) {
          return false;
       }
       String queryParamet = p0.getData().getQueryParameter("sign_model");
       g.d("gateway handleSignIntent, signModel= "+queryParamet);
       return TextUtils.equals(queryParamet, "page_sign");
    }
    public final void initGatewayPay(){
       GatewayPayInputParams mOrder;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GatewayPayActivity.class, "8")) {
          return;
       }
       boolean b = false;
       try{
          this.mPayInputParams = j0.e(this.getIntent(), "gateway_input_params");
          this.mIsDeposit = j0.a(this.getIntent(), "gateway_deposit_mode", b);
          this.mReceiver = j0.d(this.getIntent(), "gateway_deposit_receiver");
       }catch(java.lang.Exception e3){
          b.g("GatewayPayActivity", "initGatewayPay", e3);
          this.mPayInputParams = objArray;
          this.mIsDeposit = b;
          this.mReceiver = objArray;
       }
       GatewayPayActivity tmPayInputPa = this.mPayInputParams;
       if (tmPayInputPa != null) {
          mOrder = tmPayInputPa.mOrder;
          if (mOrder != null) {
             this.mPayOrder = mOrder;
             this.logTaskEvent("START");
             if (this.mIsDeposit != null) {
                this.loadDepositPrepay();
             }else {
                this.loadPayConfig();
             }
             b.p("GatewayPayActivity", this.getLogType(), "isDeposit", Boolean.valueOf(this.mIsDeposit));
             return;
          }
       }
       this.onPayFinish(30, objArray);
       b.f("GatewayPayActivity", this.getLogType()+"failed, mPayInputParams.mOrder == null");
       return;
    }
    public final void initView(){
       if (PatchProxy.applyVoid(null, this, GatewayPayActivity.class, "7")) {
          return;
       }
       this.mLoadingView = this.findViewById(0x7f0a2fa5);
       ViewGroup viewGroup = this.findViewById(R.id.pay_cashier_desk_root);
       this.mCashierDeskView = viewGroup;
       viewGroup.findViewById(R.id.pay_btn).setOnClickListener(new d0(this));
       this.mCashierDeskView.findViewById(R.id.pay_close_image).setOnClickListener(new f0(this));
       viewGroup = this.findViewById(R.id.pay_root);
       this.mRootView = viewGroup;
       viewGroup.setOnClickListener(new g0(this));
       return;
    }
    public final boolean isContractConfig(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GatewayPayActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(p0) && p0.startsWith("http"))? true: false;
       return b;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public final boolean isLandScape(){
       boolean b = (this.mOrientation == 2)? true: false;
       return b;
    }
    public final void loadDepositPrepay(){
       if (PatchProxy.applyVoid(null, this, GatewayPayActivity.class, "9")) {
          return;
       }
       g.d(this.getLogType()+" loadDepositPrepay");
       this.mLoadingView.b();
       GatewayPayActivity tmPayOrder = this.mPayOrder;
       o.a().depositPrepay(tmPayOrder.mMerchantId, tmPayOrder.mTimestamp, tmPayOrder.mVersion, tmPayOrder.mFormat, tmPayOrder.mSign, tmPayOrder.mBizContent, true).map(new a()).doFinally(new u(this)).subscribe(new v(this), new y(this));
       return;
    }
    public final void loadPayConfig(){
       if (PatchProxy.applyVoid(null, this, GatewayPayActivity.class, "11")) {
          return;
       }
       g.d(this.getLogType()+"  loadPayConfig");
       this.mLoadingView.b();
       o.a().gatewayPayConfig(this.mPayOrder.mMerchantId, PayManager.getInstance().isSupportWechatPay(), PayManager.getInstance().isSupportAlipay(), c.g(this, "com.tencent.mm"), c.g(this, "com.eg.android.AlipayGphone")).map(new a()).doFinally(new j0(this)).subscribe(new x(this), new a0(this));
       return;
    }
    public final void loadPrepayInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayActivity.class, "12")) {
          return;
       }
       g.d(this.getLogType()+"  loadPrepayInfo, method="+p0);
       this.mLoadingView.b();
       GatewayPayActivity tmPayOrder = this.mPayOrder;
       o.a().gatewayPayPrepay(this.mSelectedProvider, p0, tmPayOrder.mMerchantId, tmPayOrder.mTimestamp, tmPayOrder.mVersion, tmPayOrder.mFormat, tmPayOrder.mSign, tmPayOrder.mBizContent, tmPayOrder.mProxyId).map(new a()).doFinally(new l0(this)).subscribe(new c0(this, p0), new b0(this));
       return;
    }
    public final void logTaskEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayActivity.class, "29")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("provider", this.mSelectedProvider);
       GatewayPayActivity tmPayOrder = this.mPayOrder;
       if (tmPayOrder != null) {
          hashMap.put("biz_content", tmPayOrder.mBizContent);
          hashMap.put("merchant_id", this.mPayOrder.mMerchantId);
       }
       tmPayOrder = this.mPayInputParams;
       if (tmPayOrder != null) {
          hashMap.put("account_group_key", tmPayOrder.mAccountGroupKey);
       }
       String str = (this.mIsDeposit != null)? "DEPOSIT_PAY": "GATEWAY_PAY";
       g.j(str, p0, d.a.q(hashMap));
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(GatewayPayActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, GatewayPayActivity.class, "6")) {
          return;
       }
       g.d("GatewayPayActivity onActivityResult, requestCode = "+p0+", resultCode = "+p0);
       if (p0 == 100) {
          this.onPayFinish(0, null);
       }else if(p0 == 101){
          this.handleOrderPayFinish(p0, p1, p2);
       }else {
          GatewayPayActivity tmPay = this.mPay;
          if (tmPay == null || !tmPay.b(p0, p1, p2)) {
             this.onPayFinish(p1, null);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       int i1;
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayActivity.class, "1")) {
          return;
       }
       this.mOrientation = this.getResources().getConfiguration().orientation;
       int i = (this.isLandScape())? 0x1030011: 0x1030010;
       this.setTheme(i);
       i = 0;
       this.overridePendingTransition(i, i);
       k.a(this, i, true);
       super.onCreate(p0);
       if (this.handleSignIntent(this.getIntent())) {
          g.d("GatewayPayActivity onCreate, handleSignIntent = true");
          super.finish();
          return;
       }else if(this.isLandScape()){
          i1 = 0x7f0d10fd;
       }else {
          i1 = 0x7f0d10fe;
       }
       this.setContentView(i1);
       if (!this.isLandScape() && Build$VERSION.SDK_INT < 29) {
          q.b(this);
       }
       this.initView();
       this.initGatewayPay();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, GatewayPayActivity.class, "5")) {
          return;
       }
       if (this.mIsPayFinish == null) {
          g.d("GatewayPayActivity destroy with unknown status, isDeposit = "+this.mIsDeposit);
          if (this.mIsDeposit != null) {
             PayResult payResult = new PayResult("0", this.mDepositNo, "", "", "");
             this.depositFinishCallback(0, v0);
          }else {
             PayManager.getInstance().onPayUnknown(new PayResult("0", this.mOutTradeNo, "", this.mSelectedProvider));
          }
          this.logTaskEvent("UNKNOWN_STATUS");
       }
       super.onDestroy();
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayActivity.class, "2")) {
          return;
       }
       super.onNewIntent(p0);
       if (this.handleSignIntent(p0)) {
          super.finish();
       }
       return;
    }
    public void onPayFinish(int p0,String p1){
       GatewayPayActivity gatewayPayAc = GatewayPayActivity.class;
       if (PatchProxy.isSupport(gatewayPayAc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, gatewayPayAc, "19")) {
          return;
       }
       this.mIsPayFinish = true;
       if (this.mIsDeposit != null) {
          this.handleDepositFinish(p0);
       }else {
          this.handlePayFinish(p0);
       }
       g.d(this.getLogType()+" finished, result="+p0);
       return;
    }
    public final void openGatewayCashierDesk(DepositPrepayResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayActivity.class, "10")) {
          return;
       }
       DepositPrepayResponse mDepositConf = p0.mDepositConfig;
       if (mDepositConf == null) {
          this.onPayFinish(30, null);
          b.f("GatewayPayActivity", this.getLogType()+" openGatewayCashierDesk failed, deposit config is null!");
          return;
       }else {
          this.mPayOrder = d.a.h(mDepositConf, GatewayPayInputParams$GatewayPayOrder.class);
          this.mDepositNo = p0.mDepositNo;
          this.loadPayConfig();
          return;
       }
    }
    public final void openOrderCashierDesk(DepositPrepayResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayActivity.class, "17")) {
          return;
       }
       this.mDepositNo = p0.mDepositNo;
       if (TextUtils.isEmpty(this.mPayOrder.mMerchantId) || TextUtils.isEmpty(p0.mOutOrderNo)) {
          this.onPayFinish(30, null);
          b.i("GatewayPayActivity", this.getLogType()+" openOrderCashierDesk error", null, "merchantId", this.mPayOrder.mMerchantId, "outOrderNo", p0.mOutOrderNo);
          return;
       }else {
          PayWebViewActivity$a uoa = PayWebViewActivity.buildWebViewIntent(this, PayManager.getInstance().buildOrderCashierUrl(this.mPayOrder.mMerchantId, p0.mOutOrderNo, ""));
          uoa.c(true);
          this.startActivityForResult(uoa.a(), 101);
          return;
       }
    }
    public final View setProviderStyle(ViewGroup p0,int p1,int p2,String p3){
       View obj;
       if (PatchProxy.isSupport(GatewayPayActivity.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, GatewayPayActivity.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.c(LayoutInflater.from(this), R.layout.arg_RES_7f0d1104, p0, false);
       obj.findViewById(R.id.pay_provider_name).setText(p1);
       obj.findViewById(R.id.pay_provider_icon).setImageResource(p2);
       View view = obj.findViewById(R.id.pay_check_btn);
       if (TextUtils.isEmpty(this.mSelectedProvider)) {
          this.mSelectedProvider = p3;
          view.setSelected(true);
       }
       p0.addView(obj);
       return view;
    }
    public final void showCashierDesk(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GatewayPayActivity.class, "24")) {
          return;
       }
       String str = "GatewayPayActivity";
       b.o(str, "showCashierDesk");
       Gson a = d.a;
       GatewayPayBizContent gatewayPayBi = a.i(this.mPayOrder.mBizContent, new GatewayPayActivity$a(this).getType());
       this.mOutTradeNo = gatewayPayBi.mOutTradeNo;
       this.mCashierDeskView.findViewById(R.id.pay_money_text).setText("гд"+c.c(Long.valueOf(gatewayPayBi.mTotalAmount).longValue()));
       this.mCashierDeskView.findViewById(R.id.pay_subject).setText(gatewayPayBi.mSubject);
       ViewGroup viewGroup = this.mCashierDeskView.findViewById(R.id.pay_provider_container);
       viewGroup.removeAllViews();
       this.addWechatPay(viewGroup);
       this.addAliPay(viewGroup);
       this.addKwaiPay(viewGroup);
       if (TextUtils.isEmpty(this.mSelectedProvider)) {
          this.onPayFinish(30, objArray);
          b.f(str, "showCashierDesk "+this.getLogType()+"failed, mSelectedProvider is null!");
          return;
       }else {
          b = true;
          this.mIsShowCashierDesk = b;
          this.mRootView.setBackgroundColor(0x33000000);
          int i = 0;
          if (this.isLandScape()) {
             c.e(this.mCashierDeskView, i, R.anim.arg_RES_7f0100da);
          }else {
             this.mCashierDeskView.setVisibility(i);
             GatewayPayActivity tmCashierDes = this.mCashierDeskView;
             c.f(tmCashierDes, tmCashierDes.findViewById(R.id.pay_bottom_view), 0x3f99999a, b, 300);
          }
          g.d(this.getLogType()+"  showCashierDesk");
          g.b("GATEWAY_CASHIER_SHOW", a.q(this.mPayConfigResponse), this.mPayOrder.mBizContent);
          return;
       }
    }
    public final void startH5Pay(String p0,GatewayPayPrepayResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GatewayPayActivity.class, "15")) {
          return;
       }
       String str = "GatewayPayActivity";
       b.p(str, "startH5Pay: "+this.getLogType(), "provider", p0);
       if (p1 == null || TextUtils.isEmpty(p1.mProviderConfig)) {
          this.onPayFinish(30, null);
          b.f(str, this.getLogType()+" startH5Pay failed, prepayResponse or mProviderConfig is null!");
          return;
       }else {
          Intent intent = new Intent(this, GatewayH5PayActivity.class);
          intent.putExtra("provider", p0);
          SerializableHook.putExtra(intent, "prepay_response", p1);
          this.startActivityForResult(intent, 100);
          this.overridePendingTransition(R.anim.arg_RES_7f0100da, 0x7f0100dc);
          return;
       }
    }
    public final void startNativePay(String p0,GatewayPayPrepayResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GatewayPayActivity.class, "16")) {
          return;
       }
       b.p("GatewayPayActivity", "startNativePay: "+this.getLogType(), "provider", p0);
       p1 = p1.mProviderConfig;
       if (TextUtils.isEmpty(p1)) {
          this.onPayFinish(30, null);
          b.f("GatewayPayActivity", this.getLogType()+" startNativePay failed, mProviderConfig is null!");
          return;
       }else {
          a uoa = e.a(this, p0);
          this.mPay = uoa;
          if (uoa == null || !uoa.a()) {
             this.onPayFinish(2, null);
             b.h("GatewayPayActivity", this.getLogType()+" startNativePay failed, provider invalid !", null, "provider", p0);
             return;
          }else {
             this.mPay.a(p1, new i0(this));
             return;
          }
       }
    }
    public final void startPay(){
       if (PatchProxy.applyVoid(null, this, GatewayPayActivity.class, "14")) {
          return;
       }
       g.d(this.getLogType()+"  startPay");
       GatewayPayInputParams mProvider = this.mPayInputParams.mProvider;
       if (TextUtils.isEmpty(mProvider)) {
          this.showCashierDesk();
          return;
       }else {
          this.mSelectedProvider = mProvider.toLowerCase();
          String str = (("IN_APP").equals((this.mPayConfigResponse.mProviderConfig.get(mProvider.toUpperCase())).toUpperCase()) || (this.mSelectedProvider).equals("kscoin"))? "inApp": "h5";
          this.loadPrepayInfo(str);
          return;
       }
    }
}
