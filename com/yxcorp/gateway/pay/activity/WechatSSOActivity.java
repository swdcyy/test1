package com.yxcorp.gateway.pay.activity.WechatSSOActivity;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import com.yxcorp.gateway.pay.activity.WechatSSOActivity$a;
import com.yxcorp.gateway.pay.response.PayAuthParamResponse;
import java.lang.Long;
import java.lang.Throwable;
import com.yxcorp.gateway.pay.response.BindResult;
import java.lang.String;
import fv8.c;
import android.app.Activity;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.withdraw.WithDrawHelper;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.service.GatewayPayApiService;
import lv8.o;
import brd.t;
import iv8.a;
import erd.o;
import lv8.n;
import brd.z;
import gv8.c1;
import gv8.f1;
import erd.g;
import crd.b;
import gv8.b1;
import gv8.e1;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import ekd.j0;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.TimeUnit;
import gv8.d1;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gateway.pay.api.PayManager;
import android.content.Context;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mm.opensdk.modelmsg.SendAuth$Req;
import java.lang.System;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import java.lang.Exception;

public class WechatSSOActivity extends BaseActivity	// class@00120f
{
    public c mAuthListener;
    public String mGroupKey;
    public b mResponseDelayDisposable;
    public boolean mSendingWXReq;
    public String mTicket;
    public String mTransaction;

    public void WechatSSOActivity(){
       super();
       this.mAuthListener = new WechatSSOActivity$a(this);
    }
    public static void E2(WechatSSOActivity p0,PayAuthParamResponse p1){
       p0.lambda$authParams$1(p1);
    }
    public static void F2(WechatSSOActivity p0,Long p1){
       p0.lambda$onResume$0(p1);
    }
    public static void G2(WechatSSOActivity p0,Throwable p1){
       p0.lambda$bindWechat$4(p1);
    }
    public static void H2(WechatSSOActivity p0,BindResult p1){
       p0.lambda$bindWechat$3(p1);
    }
    public static void L2(WechatSSOActivity p0,Throwable p1){
       p0.lambda$authParams$2(p1);
    }
    private void lambda$authParams$1(PayAuthParamResponse p0){
       this.mTransaction = this.sendAuthReq(p0.getParam("app_id"), this.mAuthListener);
    }
    private void lambda$authParams$2(Throwable p0){
       this.onFinish(BindResult.fail(this.getString(R.string.arg_RES_7f103b88)));
       g.d("wechat bind authParams failed, error = "+p0.getMessage());
    }
    private void lambda$bindWechat$3(BindResult p0){
       this.onFinish(p0);
       g.d("wechat bind, bind request success");
    }
    private void lambda$bindWechat$4(Throwable p0){
       this.onFinish(BindResult.fail(this.getString(R.string.arg_RES_7f103b88)));
       g.d("wechat bind, bind request fail, error="+p0.getMessage());
    }
    private void lambda$onResume$0(Long p0){
       if (this.mSendingWXReq != null) {
          WithDrawHelper.removeWechatListener(this.mTransaction);
          this.onFinish(BindResult.cancel(this.getString(R.string.arg_RES_7f103baa)));
       }
       return;
    }
    public final void authParams(){
       if (PatchProxy.applyVoid(null, this, WechatSSOActivity.class, "4")) {
          return;
       }
       o.a().authParams("wechat", this.mTicket, this.mGroupKey).map(new a()).subscribeOn(n.b).subscribe(new c1(this), new f1(this));
       return;
    }
    public void bindWechat(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WechatSSOActivity.class, "6")) {
          return;
       }
       o.a().bind("wechat", p0, p1, p2).map(new a()).subscribe(new b1(this), new e1(this));
       return;
    }
    public String getPageName(){
       return "GATEWAY_WECHAT_SSO";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, WechatSSOActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WechatSSOActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       this.mTicket = j0.f(intent, "ticket");
       this.mGroupKey = j0.f(intent, "groupkey");
       this.authParams();
       return;
    }
    public void onFinish(BindResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WechatSSOActivity.class, "7")) {
          return;
       }
       Intent intent = new Intent();
       SerializableHook.putExtra(intent, "result", p0);
       this.setResult(-1, intent);
       this.finish();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, WechatSSOActivity.class, "3")) {
          return;
       }
       WechatSSOActivity tmResponseDe = this.mResponseDelayDisposable;
       if (tmResponseDe != null && !tmResponseDe.isDisposed()) {
          g.d("WechatSSO onPause, stop timer");
          this.mResponseDelayDisposable.dispose();
       }
       super.onPause();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, WechatSSOActivity.class, "2")) {
          return;
       }
       super.onResume();
       g.d("WechatSSO onResume, mSendingWXReq = "+this.mSendingWXReq);
       this.mSendingWXReq = (this.mSendingWXReq == null)? true: t.timer(8000, TimeUnit.MILLISECONDS).subscribe(new d1(this));
       return;
    }
    public final String sendAuthReq(String p0,c p1){
       SendAuth$Req obj = PatchProxy.applyTwoRefs(p0, p1, this, WechatSSOActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          g.d("wechat bind sendAuthReq, appId= "+p0);
          if (!TextUtils.isEmpty(p0)) {
             IWXAPI iWXAPI = WXAPIFactory.createWXAPI(PayManager.getInstance().getContext(), p0, true);
             if (!iWXAPI.isWXAppInstalled()) {
                throw new IllegalStateException(this.getString(0x7f103bb4));
             }
             obj = new SendAuth$Req();
             String str = String.valueOf(System.currentTimeMillis());
             obj.transaction = str;
             obj.scope = "snsapi_userinfo";
             obj.state = "pay_wechat_bind";
             if (p1 != null) {
                WithDrawHelper.addWechatListener(str, 0, "bind", null, p1);
             }
             iWXAPI.sendReq(obj);
             return obj.transaction;
          }else {
             g.d("wechat bind sendAuthReq failed, appId is null");
             throw new IllegalArgumentException(this.getString(0x7f103b88));
          }
       }catch(java.lang.Exception e6){
          this.onFinish(BindResult.fail(e6.getMessage()));
          return "";
       }
    }
}
