package com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.yxcorp.gateway.pay.api.WithdrawCallback;
import com.yxcorp.gateway.pay.api.PayInitConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import nv8.b;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;
import com.yxcorp.gateway.pay.response.BindResult;
import java.lang.StringBuilder;
import lv8.g;
import lv8.i;
import com.yxcorp.gateway.pay.api.KwaiPayConfig;
import android.app.Activity;
import brd.t;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gateway.pay.api.PayManager$1;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.yxcorp.gateway.pay.activity.AuthThirdActivity;
import com.yxcorp.gateway.pay.api.c;
import erd.o;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gateway.pay.api.PayManager$2;
import com.yxcorp.gateway.pay.activity.WithDrawBindActivity;
import java.lang.IllegalArgumentException;
import com.yxcorp.gateway.pay.api.d;
import java.lang.Boolean;
import nv8.d;
import com.google.gson.JsonObject;
import lv8.d;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import nv8.c;
import android.util.LruCache;
import java.util.HashSet;
import java.util.Map;
import nv8.e;
import go7.k;
import android.content.Intent;
import android.content.Context;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.Number;
import ok.n;
import jv8.c;
import jv8.b;
import jv8.d;
import jv8.a;
import com.yxcorp.gateway.pay.params.GatewayPayInputParams;
import com.yxcorp.gateway.pay.receiver.a;
import com.yxcorp.gateway.pay.params.GatewayPayInputParams$GatewayPayOrder;
import com.yxcorp.gateway.pay.activity.GatewayPayActivity;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.os.Parcelable;
import java.net.URLEncoder;
import java.lang.Exception;
import com.yxcorp.utility.TextUtils;
import h97.g;
import java.lang.System;
import yb7.i;
import android.app.Application;
import java.util.List;
import com.yxcorp.gateway.pay.api.PayRetrofitGlobalConfig;
import go7.b;
import go7.e;
import com.yxcorp.gateway.pay.api.SingleMonitorConfig;
import go7.f;
import go7.h;
import go7.i;
import go7.l;
import com.kwai.library.widget.popup.common.e;
import com.kwai.library.widget.popup.common.e$b;
import com.kwai.library.widget.popup.common.a;
import com.kwai.library.widget.popup.common.PopupInterface$i;
import e17.i$b;
import e17.i;
import lnc.ea;
import o07.q;
import com.yxcorp.retrofit.e;
import com.yxcorp.retrofit.d;
import go7.a;
import java.util.Objects;
import com.yxcorp.gateway.pay.params.PaymentInfo;
import lv8.c;
import com.yxcorp.gateway.pay.params.PayResult;
import java.lang.Integer;
import com.yxcorp.gateway.pay.service.GatewayPayApiService;
import lv8.o;
import iv8.a;
import com.yxcorp.gateway.pay.api.a;
import com.yxcorp.gateway.pay.api.b;
import erd.g;
import crd.b;
import c97.d;
import ba7.a;
import androidx.lifecycle.LifecycleOwner;
import nv8.a;
import com.yxcorp.gateway.pay.activity.FrontCashierActivity;
import com.google.common.collect.ImmutableMap;
import com.yxcorp.gateway.pay.activity.GatewayOrderPrepayActivity;
import com.yxcorp.gateway.pay.params.GatewayOrderParams;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderActivity;
import com.yxcorp.gateway.pay.params.GatewayPrepayParams;
import com.yxcorp.gateway.pay.activity.GatewayPayOrderV2Activity;
import com.yxcorp.gateway.pay.activity.FrontCashierOneStepActivity;
import com.yxcorp.gateway.pay.params.FrontCashierPayParams;

public final class PayManager implements PayCallback, WithdrawCallback	// class@00121c
{
    public boolean mIsDebug;
    public PayCallback mPayCallback;
    public final PayInitConfig mPayInitConfig;
    public WithdrawCallback mWithdrawCallback;
    public static PayManager sInstance;

    public void PayManager(PayInitConfig p0){
       this.mPayInitConfig = p0;
    }
    public static PayManager getInstance(){
       PayManager payManager = PayManager.class;
       Object obj = PatchProxy.apply(null, null, payManager, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PayManager.sInstance == null) {
          _monitor_enter(payManager);
          if (PayManager.sInstance != null) {
             _monitor_exit(payManager);
          }else {
             throw new IllegalStateException("please do init by invoke init\(PayInitConfig config\) first!");
          }
       }
       return PayManager.sInstance;
    }
    public static synchronized void init(PayInitConfig p0){
       _monitor_enter(PayManager.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, PayManager.class, "1")) {
          _monitor_exit(PayManager.class);
          return;
       }else if(PayManager.sInstance != null){
          try{
             b.g("PayManager", "PayManager has been inited!", new IllegalStateException("PayManager has been inited!"));
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static AuthThirdResult lambda$authThirdPartyAccount$2(Throwable p0){
       return AuthThirdResult.fail(null, p0.getMessage());
    }
    public static BindResult lambda$bindWithDrawType$3(Throwable p0){
       return BindResult.fail(p0.getMessage());
    }
    public static void lambda$preQueryPromotion$0(String p0){
    }
    public static void lambda$preQueryPromotion$1(Throwable p0){
       g.d("PayManager preQueryPromotion: "+p0.getMessage());
       if (i.a(p0) == 401 && (PayManager.getInstance().getKwaiPayConfig() != null && PayManager.getInstance().getKwaiPayConfig().enableRefreshTokenAfter401())) {
          PayManager.getInstance().getKwaiPayConfig().refreshToken();
          b.o("PayManager", "app/promo/pre_query: http 401, refresh token");
       }
    label_004a :
       return;
    }
    public t authThirdPartyAccount(Activity p0,String p1,String p2){
       PublishSubject obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PayManager.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PublishSubject.g();
       AuthThirdActivity.startAuthThird(p0, p1, p2, new PayManager$1(this, new Handler(Looper.getMainLooper()), obj));
       return obj.onErrorReturn(c.b);
    }
    public t bindWithDrawType(Activity p0,String p1,String p2,String p3){
       PublishSubject obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, PayManager.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = PublishSubject.g();
       g.d("native bindWithdrawType start");
       if (!TextUtils.isEmpty(p3) && (!TextUtils.isEmpty(p1) && !TextUtils.isEmpty(p2))) {
          WithDrawBindActivity.startBindWithDraw(p0, p1, p3, p2, new PayManager$2(this, new Handler(Looper.getMainLooper()), obj, p0));
       }else {
          g.d("native bindWithdrawType failed, params invalid, accountGroupKey="+p2+", provider="+p1);
          obj.onError(new IllegalArgumentException(p0.getString(R.string.arg_RES_7f103b87)));
       }
       return obj.onErrorReturn(d.b);
    }
    public String buildOrderCashierUrl(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, PayManager.class, "52");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.buildOrderCashierUrl(p0, p1, null);
    }
    public String buildOrderCashierUrl(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PayManager.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.buildOrderCashierUrl(p0, p1, p2, false);
    }
    public String buildOrderCashierUrl(String p0,String p1,String p2,boolean p3){
       String obj;
       int i;
       String str1;
       CharSequence uCharSequenc;
       JsonObject jsonObject;
       String str = "sessionId";
       if (PatchProxy.isSupport(PayManager.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, PayManager.class, "54");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = (this.isDebug())? this.getDebugUrlPrefix(): "https://www.kuaishoupay.com/";
       if (p3) {
          d.e("KUAISHOUPAY_NATIVE_START_H5_CASHIER", p0, p1, null, null, null, "PRE_CASHIER_SDK_NATIVE");
       }else {
          d.e("KUAISHOUPAY_START_H5_CASHIER", p0, p1, null, null, null, null);
       }
       Object obj1 = null;
       try{
          if (TextUtils.isEmpty(p2)) {
             jsonObject = new JsonObject();
             i = p2;
          }else {
             Gson a = d.a;
             JsonObject jsonObject1 = JsonObject.class;
             String str2 = p2;
             jsonObject = a.h(str2, jsonObject1);
          }
          str1 = (jsonObject.e0(str) != null)? jsonObject.e0(str).w(): obj1;
          try{
             if (TextUtils.isEmpty(str1)) {
                str1 = this.genUniqueToken();
             }
             jsonObject.c0(str, str1);
             uCharSequenc = jsonObject.toString();
          label_00a2 :
             if (str1 != null) {
                if (!PatchProxy.applyVoidOneRefs(str1, obj1, c.class, "1") && (!TextUtils.isEmpty(str1) && c.a.get(str1) == null)) {
                   c.a.put(str1, new HashSet());
                }
             label_00c9 :
                e.e("pullUpH5Cashier", obj1, str1);
             }
             obj = obj+"kspay/cashier/order/index.html?hyId=cashier-pay-v2&"+"merchantId="+p0+"&outOrderNo="+p1;
             if (!TextUtils.isEmpty(uCharSequenc)) {
                obj = obj+"&extra="+this.encodeExtra(uCharSequenc);
             }else {
                int i1 = this;
             }
             if (!this.isDebug() && (this.isEnableSwitchHost() && this.getWebInitConfig() != null)) {
                return this.getWebInitConfig().b(obj);
             }else {
                str = obj;
                g.d("PayManager, buildOrderCashierUrl url="+str);
                return str;
             }
          }catch(com.google.gson.JsonSyntaxException e0){
          }
          b.g("PayManager", " buildOrderCashierUrl: check sessionId error", e0);
          uCharSequenc = i;
          goto label_00a2 ;
       }catch(com.google.gson.JsonSyntaxException e0){
          i = p2;
       }catch(com.google.gson.JsonSyntaxException e0){
       }
       str1 = obj1;
       goto label_009a ;
    }
    public Intent buildPayWebViewIntent(Activity p0,String p1,boolean p2){
       if (PatchProxy.isSupport(PayManager.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, PayManager.class, "49");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PayWebViewActivity$a uoa = PayWebViewActivity.buildWebViewIntent(p0, p1);
       uoa.c(p2);
       return uoa.a();
    }
    public int contract(String p0,String p1,String p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PayManager.class, "50");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       g.d("bridge:startContract. provider="+p0+", method="+p2+", providerConfig="+p1);
       n.j(p0);
       n.j(p1);
       Object obj1 = null;
       obj = PatchProxy.applyOneRefs(p0, obj1, c.class, "1");
       if (obj != patchProxyRe) {
          obj1 = obj;
       }else if(!p0.equals("alipay")){
          if (p0.equals("wechat")) {
             obj1 = new d();
          }
       }else {
          obj1 = new a();
       }
       if (obj1 == null) {
          return 412;
       }else if(TextUtils.isEmpty(p2)){
          obj1.a(p1);
       }else if(p2.equals("QUICK_RETURN_QUOTA")){
          obj1.b(p1);
       }else if(p2.equals("PAY_SCORE")){
          obj1.c(p1);
       }else {
          obj1.a(p1, p2);
       }
       g.j("GATEWAY_CONTRACT", "START", g.l(p0, p1, p2));
       return 1;
    }
    public synchronized void deposit(Activity p0,GatewayPayInputParams p1,PayCallback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PayManager.class, "51")) {
          return;
       }
       Intent intent = new Intent(p0, GatewayPayActivity.class);
       intent.setFlags(0x24000000);
       SerializableHook.putExtra(intent, "gateway_input_params", p1);
       intent.putExtra("gateway_deposit_mode", true);
       intent.putExtra("gateway_deposit_receiver", new a(new Handler(Looper.getMainLooper()), p2, "", p1.mOrder.mMerchantId));
       p0.startActivity(intent);
       return;
    }
    public boolean enableCashierNative2_0(){
       PayInitConfig obj = PatchProxy.apply(null, this, PayManager.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPayInitConfig.mKwaiPayConfig;
       boolean b = (obj != null && obj.enableNative2_0())? true: false;
       return b;
    }
    public final String encodeExtra(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, PayManager.class, "55");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          obj = URLEncoder.encode(p0, "UTF-8");
          p0 = obj.replaceAll("\\+", "%20");
       }catch(java.lang.Exception e3){
          g.d(e3.getMessage());
          p0 = obj;
       }
       return TextUtils.k(p0);
    }
    public final String genUniqueToken(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.c(String.valueOf(System.currentTimeMillis()))+"-"+this.mPayInitConfig.mCommonParams.getUserId();
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getInitCommonParams().getContext();
    }
    public List getCookieForceRootHosts(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getWebInitConfig() != null) {
          return this.getWebInitConfig().i();
       }
       return null;
    }
    public String getDebugHost(){
       return this.mPayInitConfig.mDebugHostUrl;
    }
    public final StringBuilder getDebugUrlPrefix(){
       String obj = PatchProxy.apply(null, this, PayManager.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getDebugHost();
       if (TextUtils.isEmpty(obj)) {
          obj = "www.kuaishoupay.com";
       }
       return "https://"+obj+"/";
    }
    public List getExtraCookieList(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPayRetrofitGlobalConfig().getExtraCookieList();
    }
    public Map getExtraUrlParams(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPayRetrofitGlobalConfig().getExtraUrlParams();
    }
    public g getInitCommonParams(){
       return this.mPayInitConfig.mCommonParams;
    }
    public KwaiPayConfig getKwaiPayConfig(){
       return this.mPayInitConfig.mKwaiPayConfig;
    }
    public String getLatitude(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getInitCommonParams().getLatitude()+"";
    }
    public String getLongitude(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getInitCommonParams().getLongitude()+"";
    }
    public PayRetrofitGlobalConfig getPayRetrofitGlobalConfig(){
       return this.mPayInitConfig.mPayRetrofitConfig;
    }
    public b getPayYodaConfig(){
       return this.mPayInitConfig.mPayYodaConfig;
    }
    public e getRubasApi(){
       e a;
       PayInitConfig obj = PatchProxy.apply(null, this, PayManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPayInitConfig.mRubasApi;
       if (obj == null) {
          g.m("PayManager getRubasApi: rubasApi is not configured!!");
          a = e.a;
       }
       return a;
    }
    public String getServiceId(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getInitCommonParams().b0()+"_st";
    }
    public String getServiceSecurity(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getInitCommonParams().W();
    }
    public SingleMonitorConfig getSingleMonitorConfig(){
       PayInitConfig obj = PatchProxy.apply(null, this, PayManager.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mPayInitConfig.mKwaiPayConfig;
       if (obj != null) {
          return obj.getSingleMonitorSwitch();
       }
       return null;
    }
    public f getUnionPay(){
       return this.mPayInitConfig.mUnionPayHelper;
    }
    public String getUserAgent(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getPayRetrofitGlobalConfig().getUserAgent();
    }
    public String getUserId(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getInitCommonParams().getUserId();
    }
    public String getUserToken(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getInitCommonParams().P();
    }
    public h getVerifyConfig(){
       return this.mPayInitConfig.mVerifyConfig;
    }
    public i getVideoUploadHelper(){
       return this.mPayInitConfig.mVideoHelper;
    }
    public k getWebInitConfig(){
       return this.mPayInitConfig.mWebInitConfig;
    }
    public l getWithDrawConfig(){
       return this.mPayInitConfig.mWithDrawConfig;
    }
    public final void initConfig(){
       if (PatchProxy.applyVoid(null, this, PayManager.class, "2")) {
          return;
       }
       this.initNetWorkingIfNeeded();
       this.registerUpdateChecker();
       this.initKSToast();
       return;
    }
    public final void initKSToast(){
       if (PatchProxy.applyVoid(null, this, PayManager.class, "6")) {
          return;
       }
       if (e.g()) {
          return;
       }
       e$b uob = new e$b();
       uob.a(new a());
       e.f(this.mPayInitConfig.mApplication, uob);
       i.r(new i$b());
       i.y(ea.b());
       return;
    }
    public final void initNetWorkingIfNeeded(){
       if (PatchProxy.applyVoid(null, this, PayManager.class, "4")) {
          return;
       }
       if (this.mPayInitConfig.mNetWorkGlobalConfig != null && e.h().g() == null) {
          e.h().i(this.mPayInitConfig.mNetWorkGlobalConfig);
       }
       return;
    }
    public boolean isDebug(){
       return this.mIsDebug;
    }
    public boolean isEnableExperimentalYoda(){
       PayInitConfig obj = PatchProxy.apply(null, this, PayManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPayInitConfig.mWebInitConfig;
       boolean b = (obj != null && obj.e())? true: false;
       return b;
    }
    public boolean isEnableKeyLogger(){
       PayInitConfig obj = PatchProxy.apply(null, this, PayManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPayInitConfig.mPayLoggerConfig;
       boolean b = (obj != null && obj.a())? true: false;
       return b;
    }
    public boolean isEnableLogger(){
       return this.mPayInitConfig.mEnableLogger;
    }
    public boolean isEnableSentryLogger(){
       PayInitConfig obj = PatchProxy.apply(null, this, PayManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPayInitConfig.mPayLoggerConfig;
       boolean b = (obj != null && obj.b())? true: false;
       return b;
    }
    public boolean isEnableSwitchHost(){
       PayInitConfig obj = PatchProxy.apply(null, this, PayManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mPayInitConfig.mWebInitConfig;
       boolean b = (obj != null && obj.h())? true: false;
       return b;
    }
    public boolean isKwaiUrl(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PayManager.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getPayRetrofitGlobalConfig().isKwaiUrl(p0);
    }
    public boolean isSupportAlipay(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(this.mPayInitConfig);
       return true;
    }
    public boolean isSupportNative2_0Pay(PaymentInfo p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, PayManager.class, "36");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (("PAP").equals(p0.getPaymentMethod())) {
          return c.i(p0.getProvider(), p0.getChannelType());
       }
       boolean b = false;
       if (("IN_APP").equals(p0.getPaymentMethod())) {
          obj = p0.getProvider();
          String channelType = p0.getChannelType();
          Object obj1 = PatchProxy.applyTwoRefs(obj, channelType, null, c.class, "11");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(TextUtils.isEmpty(obj)){
             String str = "alipay";
             if (str.equalsIgnoreCase(obj) || (!("wechat").equalsIgnoreCase(obj) || (("NORMAL").equalsIgnoreCase(channelType) || (str.equalsIgnoreCase(obj) && ("ALIPAY_HB").equalsIgnoreCase(channelType))))) {
                b = true;
             }
          }
       }
       return b;
    }
    public boolean isSupportUnionPay(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getUnionPay() != null)? true: false;
       return b;
    }
    public boolean isSupportWechatPay(){
       Object obj = PatchProxy.apply(null, this, PayManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(this.mPayInitConfig);
       return true;
    }
    public synchronized void onPayCancel(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayManager.class, "59")) {
          return;
       }
       PayManager tmPayCallbac = this.mPayCallback;
       if (tmPayCallbac != null) {
          tmPayCallbac.onPayCancel(p0);
          this.mPayCallback = null;
          b.o("PayManager", "onPayCancel");
       }
       return;
    }
    public synchronized void onPayFailure(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayManager.class, "58")) {
          return;
       }
       PayManager tmPayCallbac = this.mPayCallback;
       if (tmPayCallbac != null) {
          tmPayCallbac.onPayFailure(p0);
          this.mPayCallback = null;
          b.h("PayManager", "onPayFailure", null, "result", d.a.q(p0));
       }
       return;
    }
    public synchronized void onPaySuccess(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayManager.class, "57")) {
          return;
       }
       PayManager tmPayCallbac = this.mPayCallback;
       if (tmPayCallbac != null) {
          tmPayCallbac.onPaySuccess(p0);
          this.mPayCallback = null;
          b.o("PayManager", "onPaySuccess");
       }
       return;
    }
    public synchronized void onPayUnknown(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayManager.class, "60")) {
          return;
       }
       PayManager tmPayCallbac = this.mPayCallback;
       if (tmPayCallbac != null) {
          tmPayCallbac.onPayUnknown(p0);
          this.mPayCallback = null;
          b.o("PayManager", "onPayUnknown");
       }
       return;
    }
    public synchronized void onWithdrawCancel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayManager.class, "63")) {
          return;
       }
       PayManager tmWithdrawCa = this.mWithdrawCallback;
       if (tmWithdrawCa != null) {
          tmWithdrawCa.onWithdrawCancel(p0);
          this.mWithdrawCallback = null;
          b.o("PayManager", "onWithdrawCancel");
       }
       return;
    }
    public synchronized void onWithdrawFailure(int p0,String p1){
       PayManager payManager = PayManager.class;
       if (PatchProxy.isSupport(payManager) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, payManager, "62")) {
          return;
       }
       payManager = this.mWithdrawCallback;
       if (payManager != null) {
          payManager.onWithdrawFailure(p0, p1);
          this.mWithdrawCallback = null;
          b.q("PayManager", "onWithdrawFailure", "errorCode", Integer.valueOf(p0), "errorMsg", p1);
       }
       return;
    }
    public synchronized void onWithdrawSuccess(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PayManager.class, "61")) {
          return;
       }
       PayManager tmWithdrawCa = this.mWithdrawCallback;
       if (tmWithdrawCa != null) {
          tmWithdrawCa.onWithdrawSuccess(p0);
          this.mWithdrawCallback = null;
          b.o("PayManager", "onWithdrawSuccess");
       }
       return;
    }
    public void openMidGroundUrl(Activity p0,String p1,boolean p2){
       if (PatchProxy.isSupport(PayManager.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, PayManager.class, "48")) {
          return;
       }
       p0.startActivity(this.buildPayWebViewIntent(p0, p1, p2));
       return;
    }
    public void preQueryPromotion(){
       if (PatchProxy.applyVoid(null, this, PayManager.class, "43")) {
          return;
       }
       if (!PayManager.getInstance().getInitCommonParams().f()) {
          g.m("PayManager preQueryPromotion: device is not login");
          return;
       }else {
          String str = PayManager.getInstance().getInitCommonParams().g();
          g.d("PayManager preQueryPromotion:"+str);
          if (!TextUtils.isEmpty(str)) {
             o.a().preQueryPromo(str).map(new a()).subscribe(a.b, b.b);
          }
          return;
       }
    }
    public final void registerUpdateChecker(){
       if (PatchProxy.applyVoid(null, this, PayManager.class, "5")) {
          return;
       }
       d.a().c.a("gatewaypay", "3.4.14");
       return;
    }
    public void setDebug(boolean p0){
       this.mIsDebug = p0;
    }
    public void startKsPay(Context p0,PaymentInfo p1,PayCallback p2,LifecycleOwner p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, PayManager.class, "35")) {
          return;
       }
       a.f().h();
       if (p1 != null && (TextUtils.isEmpty(p1.getMerchantId()) || TextUtils.isEmpty(p1.getOutOrderNo()))) {
          if (p2 != null) {
             p2.onPayFailure(new PayResult("30", "", "", ""));
          }
          b.l("PayManager", "startKsPay: error params. ", ImmutableMap.of("paymentInfo", p1));
          return;
       }else {
          String str = this.genUniqueToken();
          if (!this.enableCashierNative2_0()) {
             g.d("PayManager startKsPay: not enable cashier native2.0.");
             this.startKsPayOrderPrePayInternal(p0, p1, p2, str, p3);
             return;
          }else if(!PayManager.getInstance().isSupportNative2_0Pay(p1)){
             g.d("PayManager startKsPay: not support native2.0. paymentInfo:"+p1);
             this.startKsPayOrderPrePayInternal(p0, p1, p2, str, p3);
             return;
          }else {
             e.e("startKsPay", e.b(p1, "PRE_CASHIER_SDK_NATIVE_STEP2"), str);
             d.c("KUAISHOUPAY_CASHIER_SDK_START", p1, null, "PRE_CASHIER_SDK_NATIVE_STEP2");
             a uoa = new a(new Handler(Looper.getMainLooper()), p2, p1.getOutOrderNo(), p1.getMerchantId(), p3);
             FrontCashierActivity.startFrontCashierActivity(p0, p1, str, v7);
             g.d("PayManager startKsPay: payment: "+p1+", token: "+str);
             return;
          }
       }
    }
    public final void startKsPayOrderPrePayInternal(Context p0,PaymentInfo p1,PayCallback p2,String p3,LifecycleOwner p4){
       String str;
       PayManager payManager = PayManager.class;
       if (PatchProxy.isSupport(payManager)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, payManager, "34")) {
             return;
          }
       }
       if (p1 != null && (TextUtils.isEmpty(p1.getMerchantId()) || TextUtils.isEmpty(p1.getOutOrderNo()))) {
          if (p2 != null) {
             p2.onPayFailure(new PayResult("30", "", "", ""));
          }
          b.l("PayManager", "startKsPayOrderPrePayInternal: error params. ", ImmutableMap.of("paymentInfo", p1));
          return;
       }else if(TextUtils.isEmpty(p1.getProvider())){
          str = "COMMON_CASHIER";
       }else {
          str = "PRE_CASHIER_SDK_H5";
       }
       e.e("startKsPay", e.b(p1, str), this.genUniqueToken());
       a uoa = new a(new Handler(Looper.getMainLooper()), p2, p1.mOutOrderNo, p1.mMerchantId, p4);
       g.d("PayManager startKsPayOrderPrePayInternal: merchantId="+p1.mMerchantId+", outOrderNo="+p1.mOutOrderNo+", extra="+p1.mExtra);
       GatewayOrderPrepayActivity.startOrderPrepayActivity(p0, p1, str, p3);
       return;
    }
    public void startKspayOrderPrepay(Context p0,String p1,String p2,PayCallback p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, PayManager.class, "30")) {
          return;
       }
       this.startKspayOrderPrepay(p0, p1, p2, p3, null, null);
       return;
    }
    public void startKspayOrderPrepay(Context p0,String p1,String p2,PayCallback p3,LifecycleOwner p4){
       PayManager payManager = PayManager.class;
       if (PatchProxy.isSupport(payManager)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, payManager, "32")) {
             return;
          }
       }
       this.startKspayOrderPrepay(p0, p1, p2, p3, null, p4);
       return;
    }
    public void startKspayOrderPrepay(Context p0,String p1,String p2,PayCallback p3,String p4){
       PayManager payManager = PayManager.class;
       if (PatchProxy.isSupport(payManager)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, payManager, "31")) {
             return;
          }
       }
       this.startKspayOrderPrepay(p0, p1, p2, p3, p4, null);
       return;
    }
    public void startKspayOrderPrepay(Context p0,String p1,String p2,PayCallback p3,String p4,LifecycleOwner p5){
       PayManager payManager = PayManager.class;
       if (PatchProxy.isSupport(payManager)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, payManager, "33")) {
             return;
          }
       }
       PaymentInfo paymentInfo = new PaymentInfo();
       paymentInfo.mMerchantId = p1;
       paymentInfo.mOutOrderNo = p2;
       paymentInfo.mExtra = p4;
       a.f().h();
       this.startKsPayOrderPrePayInternal(p0, paymentInfo, p3, this.genUniqueToken(), p5);
       return;
    }
    public synchronized void startOrderPay(Activity p0,GatewayOrderParams p1,PayCallback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PayManager.class, "28")) {
          return;
       }
       this.mPayCallback = p2;
       StringBuilder str = "PayManager startOrderPay: GatewayOrderParams=";
       String str1 = (p1 != null)? p1.toString(): "";
       g.d(str+str1);
       Intent intent = new Intent(p0, GatewayPayOrderActivity.class);
       SerializableHook.putExtra(intent, "gateway_order_params", p1);
       p0.startActivity(intent);
       return;
    }
    public void startOrderPayV2(Activity p0,GatewayPrepayParams p1,PayCallback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PayManager.class, "29")) {
          return;
       }
       StringBuilder str = "PayManager startOrderPayV2: GatewayPrepayParams=";
       String str1 = (p1 != null)? p1.toString(): "";
       g.d(str+str1);
       GatewayPayOrderV2Activity.startOrderV2Activity(p0, new a(new Handler(Looper.getMainLooper()), p2, p1.mOutTradeNo, p1.mMerchantId), p1);
       return;
    }
    public synchronized void startPay(Activity p0,GatewayPayInputParams p1,PayCallback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PayManager.class, "27")) {
          return;
       }
       this.mPayCallback = p2;
       Intent intent = new Intent(p0, GatewayPayActivity.class);
       intent.setFlags(0x24000000);
       SerializableHook.putExtra(intent, "gateway_input_params", p1);
       p0.startActivity(intent);
       g.d("start gateway pay");
       return;
    }
    public void startPay(Context p0,String p1,String p2,PayCallback p3,String p4){
       PayManager payManager = PayManager.class;
       if (PatchProxy.isSupport(payManager)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, payManager, "40")) {
             return;
          }
       }
       this.startPay(p0, p1, p2, null, p3, p4, null);
       return;
    }
    public void startPay(Context p0,String p1,String p2,String p3,PayCallback p4){
       PayManager payManager = PayManager.class;
       if (PatchProxy.isSupport(payManager)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, payManager, "39")) {
             return;
          }
       }
       this.startPay(p0, p1, p2, p3, p4, null, null);
       return;
    }
    public void startPay(Context p0,String p1,String p2,String p3,PayCallback p4,String p5,LifecycleOwner p6){
       String str1;
       Object obj;
       FrontCashierPayParams uFrontCashie;
       String str2;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p5;
       PayManager payManager = PayManager.class;
       if (PatchProxy.isSupport(payManager)) {
          Object[] objArray = new Object[]{p0,oobject,oobject1,oobject2,p4,oobject3,p6};
          if (PatchProxy.applyVoid(objArray, this, payManager, "41")) {
             return;
          }
       }else {
          int i1 = this;
       }
       a.f().h();
       a uoa = new a(new Handler(Looper.getMainLooper()), p4, p2, p1, p6);
       String str = this.genUniqueToken();
       FrontCashierOneStepActivity.startCashierActivity(p0, p1, p2, p3, p5, str, v7);
       try{
          str1 = "PRE_CASHIER_SDK_NATIVE";
          obj = d.a.h(oobject2, FrontCashierPayParams.class);
          if (obj == null || obj.mNeedToH5 != null) {
             str1 = "NATIVE_THEN_COMMON_CASHIER";
          }
          str2 = str1;
          uFrontCashie = obj;
       label_0084 :
          d.d("KUAISHOUPAY_CASHIER_SDK_START", p1, p2, null, uFrontCashie, str2);
          e.e("startKsPay", e.a(uFrontCashie, oobject, oobject1, str2), str);
          g.d("PayManager startPay: merchantId="+oobject+", outOrderNo="+oobject1+", payParams="+oobject2+", extra="+oobject3);
          return;
       }catch(java.lang.Exception e0){
       }catch(java.lang.Exception e0){
          int i = obj;
       }
       e0.printStackTrace();
       uFrontCashie = null;
       str2 = str1;
       goto label_0084 ;
    }
    public void withdraw(Activity p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PayManager.class, "46")) {
          return;
       }
       this.withdraw(p0, p1, null);
       return;
    }
    public synchronized void withdraw(Activity p0,String p1,WithdrawCallback p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PayManager.class, "47")) {
          return;
       }
       this.mWithdrawCallback = p2;
       p0.startActivity(PayWebViewActivity.buildWebViewIntent(p0, p1).a());
       return;
    }
}
