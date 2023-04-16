package com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import fv8.b;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import com.yxcorp.gateway.pay.response.GatewayOrderCashierResponse;
import java.lang.Throwable;
import android.view.View;
import java.util.Map;
import com.yxcorp.gateway.pay.response.GatewayPayPrepayResponse;
import java.lang.String;
import java.lang.Object;
import android.view.ViewGroup;
import lv8.g;
import com.yxcorp.gateway.pay.loading.PayLoadingView;
import lv8.c;
import nv8.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gv8.t0;
import android.view.View$OnClickListener;
import android.content.Context;
import android.content.Intent;
import gv8.s0;
import gv8.u0;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import org.json.JSONException;
import android.app.Activity;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Integer;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.params.PayResult;
import java.lang.StringBuilder;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gateway.pay.params.GatewayOrderParams;
import java.lang.Exception;
import gv8.q0;
import android.widget.TextView;
import gv8.r0;
import gv8.m0;
import android.widget.LinearLayout;
import com.yxcorp.gateway.pay.service.GatewayPayApiService;
import lv8.o;
import brd.t;
import iv8.a;
import erd.o;
import gv8.w0;
import erd.a;
import gv8.y0;
import gv8.p0;
import erd.g;
import crd.b;
import java.lang.Boolean;
import gv8.x0;
import gv8.n0;
import gv8.o0;
import ev8.a;
import android.os.Bundle;
import android.content.res.Configuration;
import lv8.k;
import android.os.Build$VERSION;
import lv8.q;
import android.view.LayoutInflater;
import ag6.a;
import android.widget.ImageView;
import com.yxcorp.gateway.pay.activity.GatewayH5PayActivity;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.FragmentActivity;
import kv8.e;
import gv8.v0;

public class GatewayPayOrderActivity extends BaseActivity implements b	// class@001205
{
    public ViewGroup mCashierDeskView;
    public TextView mCashierMoneyText;
    public TextView mCashierSubjectText;
    public View mCheckBtnAlipay;
    public View mCheckBtnKwai;
    public View mCheckBtnWechat;
    public View mCloseIcon;
    public boolean mIsPayFinish;
    public boolean mIsShowCashierDesk;
    public PayLoadingView mLoadingView;
    public String mMerchantId;
    public int mOrientation;
    public String mOutTradeNo;
    public a mPay;
    public TextView mPayButton;
    public String mPayType;
    public String mPrepayNo;
    public LinearLayout mProviderContainer;
    public String mProviderExtra;
    public ViewGroup mRootView;
    public String mSelectedProvider;

    public void GatewayPayOrderActivity(){
       super();
    }
    public static void E2(GatewayPayOrderActivity p0,GatewayOrderCashierResponse p1){
       p0.lambda$loadCashierDesk$4(p1);
    }
    public static void F2(GatewayPayOrderActivity p0,Throwable p1){
       p0.lambda$loadOrderTradeInfo$8(p1);
    }
    public static void G2(GatewayPayOrderActivity p0,View p1){
       p0.lambda$initListener$2(p1);
    }
    public static void H2(GatewayPayOrderActivity p0,Throwable p1){
       p0.lambda$loadCashierDesk$5(p1);
    }
    public static void L2(GatewayPayOrderActivity p0,View p1){
       p0.lambda$initListener$0(p1);
    }
    public static void M2(GatewayPayOrderActivity p0,Map p1,View p2){
       p0.lambda$addKwaiPay$11(p1, p2);
    }
    public static void N2(GatewayPayOrderActivity p0,Map p1,View p2){
       p0.lambda$addAliPay$10(p1, p2);
    }
    public static void O2(GatewayPayOrderActivity p0,boolean p1){
       p0.lambda$loadOrderTradeInfo$6(p1);
    }
    public static void P2(GatewayPayOrderActivity p0,View p1){
       p0.lambda$initListener$1(p1);
    }
    public static void Q2(GatewayPayOrderActivity p0,Map p1,View p2){
       p0.lambda$addWechatPay$9(p1, p2);
    }
    public static void R2(GatewayPayOrderActivity p0){
       p0.lambda$loadCashierDesk$3();
    }
    public static void T2(GatewayPayOrderActivity p0,GatewayPayPrepayResponse p1){
       p0.lambda$loadOrderTradeInfo$7(p1);
    }
    private void lambda$addAliPay$10(Map p0,View p1){
       this.mSelectedProvider = "alipay";
       this.mPayType = p0.get(("alipay").toUpperCase());
       this.mCheckBtnAlipay.setSelected(true);
       GatewayPayOrderActivity tmCheckBtnWe = this.mCheckBtnWechat;
       if (tmCheckBtnWe != null) {
          tmCheckBtnWe.setSelected(false);
       }
       tmCheckBtnWe = this.mCheckBtnKwai;
       if (tmCheckBtnWe != null) {
          tmCheckBtnWe.setSelected(false);
       }
       return;
    }
    private void lambda$addKwaiPay$11(Map p0,View p1){
       this.mSelectedProvider = "kscoin";
       this.mPayType = p0.get(("kscoin").toUpperCase());
       this.mCheckBtnKwai.setSelected(true);
       GatewayPayOrderActivity tmCheckBtnWe = this.mCheckBtnWechat;
       if (tmCheckBtnWe != null) {
          tmCheckBtnWe.setSelected(false);
       }
       tmCheckBtnWe = this.mCheckBtnAlipay;
       if (tmCheckBtnWe != null) {
          tmCheckBtnWe.setSelected(false);
       }
       return;
    }
    private void lambda$addWechatPay$9(Map p0,View p1){
       this.mSelectedProvider = "wechat";
       this.mPayType = p0.get(("wechat").toUpperCase());
       this.mCheckBtnWechat.setSelected(true);
       GatewayPayOrderActivity tmCheckBtnAl = this.mCheckBtnAlipay;
       if (tmCheckBtnAl != null) {
          tmCheckBtnAl.setSelected(false);
       }
       tmCheckBtnAl = this.mCheckBtnKwai;
       if (tmCheckBtnAl != null) {
          tmCheckBtnAl.setSelected(false);
       }
       return;
    }
    private void lambda$initListener$0(View p0){
       if (this.mIsShowCashierDesk != null) {
          this.mCashierDeskView.setVisibility(8);
          this.mIsShowCashierDesk = false;
       }
       this.loadOrderTradeInfo(true);
       g.e("GATEWAYPAY_ORDER_CONFIRM_CLICK", this.buildConfirmClickParams(this.mSelectedProvider, this.mPrepayNo, this.mMerchantId));
       return;
    }
    private void lambda$initListener$1(View p0){
       this.onPayFinish(3, null);
    }
    private void lambda$initListener$2(View p0){
       if (!this.mCashierDeskView.getVisibility()) {
          this.onPayFinish(3, null);
       }
       return;
    }
    private void lambda$loadCashierDesk$3(){
       this.mLoadingView.d();
    }
    private void lambda$loadCashierDesk$4(GatewayOrderCashierResponse p0){
       if (c.k(p0.mProviderConfig)) {
          this.onPayFinish(30, null);
          b.f("GatewayPayOrderActivity", "OrderPay loadCashierDesk failed, gateway_cashier_config is null");
          return;
       }else {
          b.o("GatewayPayOrderActivity", "OrderPay loadCashierDesk success!");
          this.showCashierDesk(p0);
          return;
       }
    }
    private void lambda$loadCashierDesk$5(Throwable p0){
       this.onPayFinish(300, null);
       b.g("GatewayPayOrderActivity", "OrderPay loadCashierDesk failed", p0);
    }
    private void lambda$loadOrderTradeInfo$6(boolean p0){
       if (p0) {
          this.mLoadingView.d();
       }
       return;
    }
    private void lambda$loadOrderTradeInfo$7(GatewayPayPrepayResponse p0){
       this.mOutTradeNo = p0.mOutTradeNo;
       if (("H5").equals(this.mPayType) && c.m(this.mSelectedProvider)) {
          this.startH5Pay(this.mSelectedProvider, p0);
       }else {
          this.startNativePay(this.mSelectedProvider, p0);
       }
       return;
    }
    private void lambda$loadOrderTradeInfo$8(Throwable p0){
       this.onPayFinish(300, null);
       b.g("GatewayPayOrderActivity", "OrderPay loadOrderTradeInfo failed, ", p0);
    }
    public final void addAliPay(Map p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GatewayPayOrderActivity.class, "11")) {
          return;
       }
       if (!TextUtils.x(p0.get(("alipay").toUpperCase()))) {
          View view = this.setProviderStyle(p1, R.string.arg_RES_7f103b84, 0x7f081a52, "alipay", p0);
          this.mCheckBtnAlipay = view;
          view.setOnClickListener(new t0(this, p0));
       }
       return;
    }
    public final void addKwaiPay(Map p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GatewayPayOrderActivity.class, "12")) {
          return;
       }
       if (!TextUtils.x(p0.get(("kscoin").toUpperCase())) && c.l(this) != null) {
          View view = this.setProviderStyle(p1, R.string.arg_RES_7f103b92, 0x7f081a6d, "kscoin", p0);
          this.mCheckBtnKwai = view;
          view.setOnClickListener(new s0(this, p0));
       }
       return;
    }
    public final void addWechatPay(Map p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GatewayPayOrderActivity.class, "10")) {
          return;
       }
       if (!TextUtils.x(p0.get(("wechat").toUpperCase())) && c.g(this, "com.tencent.mm")) {
          View view = this.setProviderStyle(p1, R.string.arg_RES_7f103bb3, 0x7f081a85, "wechat", p0);
          this.mCheckBtnWechat = view;
          view.setOnClickListener(new u0(this, p0));
       }
       return;
    }
    public final String buildCashierShowParams(GatewayOrderCashierResponse p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, GatewayPayOrderActivity.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("gateway_cashier_config", p0.mProviderConfig);
          obj.put("out_trade_no", p0.mOutTradeNo);
          obj.put("trade_create_time", p0.mCreateTime);
       }catch(org.json.JSONException e5){
          e5.printStackTrace();
       }
       return obj.toString();
    }
    public final String buildConfirmClickParams(String p0,String p1,String p2){
       JSONObject obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GatewayPayOrderActivity.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new JSONObject();
          obj.put("provider", p0);
          obj.put("gateway_prepay_no", p1);
          obj.put("merchant_id", p2);
       }catch(org.json.JSONException e7){
          e7.printStackTrace();
       }
       return obj.toString();
    }
    public final String buildTaskEventParams(String p0,String p1,String p2,String p3,String p4,String p5){
       JSONObject obj;
       GatewayPayOrderActivity gatewayPayOr = GatewayPayOrderActivity.class;
       if (PatchProxy.isSupport(gatewayPayOr)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          obj = PatchProxy.apply(objArray, this, gatewayPayOr, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          obj = new JSONObject();
          obj.put("provider", p0);
          obj.put("payment_method", p3);
          obj.put("merchant_id", p2);
          obj.put("gateway_prepay_no", p1);
          obj.put("out_trade_no", p4);
          obj.put("provider_channel_extra", p5);
       }catch(org.json.JSONException e4){
          e4.printStackTrace();
       }
       return obj.toString();
    }
    public void finish(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GatewayPayOrderActivity.class, "15")) {
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
    public String getPageName(){
       return "GATEWAY_ORDER_PAY";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, GatewayPayOrderActivity.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final void handlePayFinish(int p0){
       String str1;
       GatewayPayOrderActivity gatewayPayOr = GatewayPayOrderActivity.class;
       if (PatchProxy.isSupport(gatewayPayOr) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, gatewayPayOr, "18")) {
          return;
       }
       String str = "";
       if (p0) {
          if (p0 != 1) {
             if (p0 != 3) {
                PayManager.getInstance().onPayFailure(new PayResult(str+p0, this.mOutTradeNo, this.mMerchantId, this.mSelectedProvider));
                str1 = this.buildTaskEventParams(this.mSelectedProvider, this.mPrepayNo, this.mMerchantId, this.mPayType, this.mOutTradeNo, this.mProviderExtra);
                str = "FAIL";
             }else {
                PayManager.getInstance().onPayCancel(new PayResult(str+p0, this.mOutTradeNo, this.mMerchantId, this.mSelectedProvider));
                str1 = this.buildTaskEventParams(this.mSelectedProvider, this.mPrepayNo, this.mMerchantId, this.mPayType, this.mOutTradeNo, this.mProviderExtra);
                str = "CANCEL";
             }
          }else {
             PayManager.getInstance().onPaySuccess(new PayResult(str+p0, this.mOutTradeNo, this.mMerchantId, this.mSelectedProvider));
             str1 = this.buildTaskEventParams(this.mSelectedProvider, this.mPrepayNo, this.mMerchantId, this.mPayType, this.mOutTradeNo, this.mProviderExtra);
             str = "SUCCESS";
          }
       }else {
          PayManager.getInstance().onPayUnknown(new PayResult(str+p0, this.mOutTradeNo, this.mMerchantId, this.mSelectedProvider));
          str1 = this.buildTaskEventParams(this.mSelectedProvider, this.mPrepayNo, this.mMerchantId, this.mPayType, this.mOutTradeNo, this.mProviderExtra);
          str = "UNKNOWN_STATUS";
       }
       g.j("ORDER_PAY", str, str1);
       this.finish();
       return;
    }
    public final void initGatewayPay(){
       GatewayOrderParams gatewayOrder;
       String str = "GatewayPayOrderActivity";
       if (PatchProxy.applyVoid(null, this, GatewayPayOrderActivity.class, "4")) {
          return;
       }
       String str1 = "OrderPay start";
       try{
          g.d(str1);
          gatewayOrder = j0.e(this.getIntent(), "gateway_order_params");
       }catch(java.lang.Exception e1){
          b.g(str, "initGatewayPay error !", e1);
          e1.printStackTrace();
          gatewayOrder = null;
       }
       Object[] objArray = (gatewayOrder == null)? null: this.buildTaskEventParams(gatewayOrder.mProvider, gatewayOrder.mPrepayNo, gatewayOrder.mMerchantId, gatewayOrder.mPayMethod, this.mOutTradeNo, gatewayOrder.mProviderExtra);
       g.j("ORDER_PAY", "START", objArray);
       if (gatewayOrder != null && (TextUtils.x(gatewayOrder.mMerchantId) || TextUtils.x(gatewayOrder.mPrepayNo))) {
          this.onPayFinish(30, null);
          b.f(str, "OrderPay failed, merchant_id or gateway_prepay_no is null!");
          return;
       }else {
          this.mMerchantId = gatewayOrder.mMerchantId;
          this.mPrepayNo = gatewayOrder.mPrepayNo;
          this.mProviderExtra = gatewayOrder.mProviderExtra;
          if (!TextUtils.x(gatewayOrder.mProvider)) {
             this.mSelectedProvider = (gatewayOrder.mProvider).toLowerCase();
          }
          this.mPayType = gatewayOrder.mPayMethod;
          if (TextUtils.x(this.mSelectedProvider) || TextUtils.x(this.mPayType)) {
             this.loadCashierDesk();
          }else {
             this.loadOrderTradeInfo(false);
          }
          return;
       }
    }
    public final void initListener(){
       if (PatchProxy.applyVoid(null, this, GatewayPayOrderActivity.class, "3")) {
          return;
       }
       this.mPayButton.setOnClickListener(new q0(this));
       this.mCloseIcon.setOnClickListener(new r0(this));
       this.mRootView.setOnClickListener(new m0(this));
       return;
    }
    public final void initView(){
       if (PatchProxy.applyVoid(null, this, GatewayPayOrderActivity.class, "2")) {
          return;
       }
       this.mLoadingView = this.findViewById(0x7f0a2fa5);
       this.mCashierDeskView = this.findViewById(0x7f0a2f9a);
       this.mRootView = this.findViewById(0x7f0a2fb4);
       this.mCloseIcon = this.mCashierDeskView.findViewById(0x7f0a2f9c);
       this.mPayButton = this.mCashierDeskView.findViewById(0x7f0a2f99);
       this.mCashierMoneyText = this.mCashierDeskView.findViewById(0x7f0a2fa6);
       this.mCashierSubjectText = this.mCashierDeskView.findViewById(0x7f0a2fb6);
       this.mProviderContainer = this.mCashierDeskView.findViewById(0x7f0a2fa9);
       return;
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public final boolean isLandScape(){
       boolean b = (this.mOrientation == 2)? true: false;
       return b;
    }
    public final void loadCashierDesk(){
       if (PatchProxy.applyVoid(null, this, GatewayPayOrderActivity.class, "5")) {
          return;
       }
       b.o("GatewayPayOrderActivity", "loadCashierDesk start");
       this.mLoadingView.b();
       o.a().orderCashierConfig(this.mMerchantId, this.mPrepayNo, PayManager.getInstance().isSupportWechatPay(), PayManager.getInstance().isSupportAlipay(), c.g(this, "com.tencent.mm"), c.g(this, "com.eg.android.AlipayGphone")).map(new a()).doFinally(new w0(this)).subscribe(new y0(this), new p0(this));
       return;
    }
    public final void loadOrderTradeInfo(boolean p0){
       GatewayPayOrderActivity gatewayPayOr = GatewayPayOrderActivity.class;
       if (PatchProxy.isSupport(gatewayPayOr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, gatewayPayOr, "7")) {
          return;
       }
       String str = "GatewayPayOrderActivity";
       b.o(str, "OrderPay loadOrderTradeInfo start");
       if (TextUtils.x(this.mPayType)) {
          this.onPayFinish(30, null);
          b.f(str, "OrderPay loadOrderTradeInfo failed, payType is null!");
          return;
       }else if(p0){
          this.mLoadingView.b();
       }
       o.a().orderTrade(this.mSelectedProvider, this.mPayType, this.mMerchantId, this.mPrepayNo, this.mProviderExtra).map(new a()).doFinally(new x0(this, p0)).subscribe(new n0(this), new o0(this));
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(GatewayPayOrderActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, GatewayPayOrderActivity.class, "14")) {
          return;
       }
       if (p0 == 100) {
          this.onPayFinish(0, null);
       }else {
          GatewayPayOrderActivity tmPay = this.mPay;
          if (tmPay == null || !tmPay.b(p0, p1, p2)) {
             this.onPayFinish(p1, null);
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayOrderActivity.class, "1")) {
          return;
       }
       this.mOrientation = this.getResources().getConfiguration().orientation;
       int i = (this.isLandScape())? 0x1030011: 0x1030010;
       this.setTheme(i);
       i = 0;
       this.overridePendingTransition(i, i);
       k.b(this, i, true, true);
       super.onCreate(p0);
       int i1 = (this.isLandScape())? 0x7f0d10fd: 0x7f0d10fe;
       this.setContentView(i1);
       if (!this.isLandScape() && Build$VERSION.SDK_INT < 29) {
          q.b(this);
       }
       this.initView();
       this.initListener();
       this.initGatewayPay();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, GatewayPayOrderActivity.class, "16")) {
          return;
       }
       if (this.mIsPayFinish == null) {
          this.mIsPayFinish = true;
          PayManager.getInstance().onPayUnknown(new PayResult("0", this.mOutTradeNo, this.mMerchantId, this.mSelectedProvider));
          g.d("GatewayPayOrderActivity destroy with unknown status");
          g.j("ORDER_PAY", "UNKNOWN_STATUS", this.buildTaskEventParams(this.mSelectedProvider, this.mPrepayNo, this.mMerchantId, this.mPayType, this.mOutTradeNo, this.mProviderExtra));
       }
       super.onDestroy();
       return;
    }
    public void onPayFinish(int p0,String p1){
       GatewayPayOrderActivity gatewayPayOr = GatewayPayOrderActivity.class;
       if (PatchProxy.isSupport(gatewayPayOr) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, gatewayPayOr, "17")) {
          return;
       }
       this.mIsPayFinish = true;
       this.handlePayFinish(p0);
       g.d("OrderPay finished, result="+p0);
       return;
    }
    public final View setProviderStyle(ViewGroup p0,int p1,int p2,String p3,Map p4){
       View obj;
       GatewayPayOrderActivity gatewayPayOr = GatewayPayOrderActivity.class;
       if (PatchProxy.isSupport(gatewayPayOr)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          obj = PatchProxy.apply(objArray, this, gatewayPayOr, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.c(LayoutInflater.from(this), R.layout.arg_RES_7f0d1104, p0, 0);
       obj.findViewById(R.id.pay_provider_name).setText(p1);
       obj.findViewById(R.id.pay_provider_icon).setImageResource(p2);
       View view = obj.findViewById(R.id.pay_check_btn);
       if (TextUtils.x(this.mSelectedProvider)) {
          this.mSelectedProvider = p3;
          this.mPayType = p4.get(p3.toUpperCase());
          view.setSelected(1);
       }
       p0.addView(obj);
       return view;
    }
    public final void showCashierDesk(GatewayOrderCashierResponse p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, GatewayPayOrderActivity.class, "6")) {
          return;
       }
       this.mCashierMoneyText.setText("гд"+c.c(p0.mTotalAmount));
       this.mCashierSubjectText.setText(p0.mSubject);
       this.mProviderContainer.removeAllViews();
       this.addWechatPay(p0.mProviderConfig, this.mProviderContainer);
       this.addAliPay(p0.mProviderConfig, this.mProviderContainer);
       this.addKwaiPay(p0.mProviderConfig, this.mProviderContainer);
       if (TextUtils.x(this.mSelectedProvider)) {
          this.onPayFinish(30, null);
          b.f("GatewayPayOrderActivity", "OrderPay showCashierDesk failed, mSelectedProvider is null!");
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
             GatewayPayOrderActivity tmCashierDes = this.mCashierDeskView;
             c.f(tmCashierDes, tmCashierDes.findViewById(R.id.pay_bottom_view), 0x3f99999a, b, 300);
          }
          g.d("OrderPay showCashierDesk");
          String str = this.buildCashierShowParams(p0);
          if (!PatchProxy.applyVoidTwoRefs("GATEWAY_ORDER_CASHIER_SHOW", str, null, g.class, "1")) {
             g.b("GATEWAY_ORDER_CASHIER_SHOW", str, null);
          }
          return;
       }
    }
    public final void startH5Pay(String p0,GatewayPayPrepayResponse p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GatewayPayOrderActivity.class, "8")) {
          return;
       }
       String str = "GatewayPayOrderActivity";
       b.p(str, "startH5Pay,", "provider", p0);
       if (p1 == null || TextUtils.x(p1.mProviderConfig)) {
          this.onPayFinish(30, null);
          b.f(str, "startH5Pay failed, prepayResponse or mProviderConfig is null!");
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GatewayPayOrderActivity.class, "9")) {
          return;
       }
       String str = "GatewayPayOrderActivity";
       b.p(str, "startNativePay,", "provider", p0);
       p1 = p1.mProviderConfig;
       if (TextUtils.x(p1)) {
          this.onPayFinish(30, null);
          b.f(str, "startNativePay failed, mProviderConfig is null!");
          return;
       }else {
          a uoa = e.a(this, p0);
          this.mPay = uoa;
          if (uoa == null || !uoa.a()) {
             this.onPayFinish(2, null);
             b.h(str, "startNativePay failed, provider invalid !", null, "provider", p0);
             return;
          }else {
             this.mPay.a(p1, new v0(this));
             return;
          }
       }
    }
}
