package com.yxcorp.gateway.pay.activity.WechatAuthActivity;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import com.yxcorp.gateway.pay.activity.WechatAuthActivity$a;
import java.lang.Long;
import java.lang.String;
import lv8.g;
import com.yxcorp.gateway.pay.withdraw.WithDrawHelper;
import android.app.Activity;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import android.content.Intent;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import crd.b;
import androidx.fragment.app.FragmentActivity;
import java.lang.StringBuilder;
import fv8.c;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import brd.t;
import gv8.a1;
import erd.g;
import android.content.Context;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.tencent.mm.opensdk.modelmsg.SendAuth$Req;
import java.lang.System;
import com.tencent.mm.opensdk.modelbase.BaseReq;

public class WechatAuthActivity extends BaseActivity	// class@00120d
{
    public String mAppId;
    public c mAuthListener;
    public b mResponseDelayDisposable;
    public boolean mSendingWXReq;
    public String mTransaction;

    public void WechatAuthActivity(){
       super();
       this.mAuthListener = new WechatAuthActivity$a(this);
    }
    public static void E2(WechatAuthActivity p0,Long p1){
       p0.lambda$onResume$0(p1);
    }
    private void lambda$onResume$0(Long p0){
       if (this.mSendingWXReq != null) {
          g.d("WechatAuth timeout");
          WithDrawHelper.removeWechatListener(this.mTransaction);
          this.onFinish(AuthThirdResult.cancel(null, this.getString(R.string.arg_RES_7f103b8b)));
       }
       return;
    }
    public String getPageName(){
       return "GATEWAY_WECHAT_AUTH";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, WechatAuthActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, WechatAuthActivity.class, "4")) {
          return;
       }
       super.onBackPressed();
       g.d("WechatAuth onBackPressed");
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WechatAuthActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.mAppId = this.getIntent().getStringExtra("appId");
       return;
    }
    public void onFinish(AuthThirdResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WechatAuthActivity.class, "6")) {
          return;
       }
       Intent intent = new Intent();
       SerializableHook.putExtra(intent, "KEY_AUTH_RESULT", p0);
       this.setResult(-1, intent);
       this.finish();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, WechatAuthActivity.class, "3")) {
          return;
       }
       WechatAuthActivity tmResponseDe = this.mResponseDelayDisposable;
       if (tmResponseDe != null && !tmResponseDe.isDisposed()) {
          g.d("WechatAuth onPause, stop timer");
          this.mResponseDelayDisposable.dispose();
       }
       super.onPause();
       return;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, WechatAuthActivity.class, "2")) {
          return;
       }
       super.onResume();
       g.d("WechatAuth onResume, mSendingWXReq = "+this.mSendingWXReq);
       if (this.mSendingWXReq == null) {
          boolean b = true;
          try{
             this.mSendingWXReq = b;
             this.mTransaction = this.sendAuthReq(this.mAuthListener);
          }catch(java.io.IOException e0){
             g.d("sendAuthReq failed, error = "+e0.getMessage());
             this.onFinish(AuthThirdResult.fail(objArray, e0.getMessage()));
          }
       }else {
          this.mResponseDelayDisposable = t.timer(8000, TimeUnit.MILLISECONDS).subscribe(new a1(this));
       }
    }
    public String sendAuthReq(c p0){
       IWXAPI obj = PatchProxy.applyOneRefs(p0, this, WechatAuthActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       g.d("appid:"+this.mAppId);
       obj = WXAPIFactory.createWXAPI(this.getApplicationContext(), this.mAppId, true);
       if (!obj.isWXAppInstalled()) {
          throw new IOException(this.getString(0x7f103bb4));
       }
       if (!obj.registerApp(this.mAppId)) {
          throw new IOException(this.getString(0x7f103b98));
       }
       SendAuth$Req req = new SendAuth$Req();
       String str = String.valueOf(System.currentTimeMillis());
       req.transaction = str;
       req.scope = "snsapi_userinfo";
       req.state = "kwai_wechat_auth";
       if (p0 != null) {
          WithDrawHelper.addWechatListener(str, 0, "auth", null, p0);
       }
       obj.sendReq(req);
       return req.transaction;
    }
}
