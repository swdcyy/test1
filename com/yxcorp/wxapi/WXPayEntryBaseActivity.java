package com.yxcorp.wxapi.WXPayEntryBaseActivity;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dwb.j;
import q87.c;
import android.app.Activity;
import ekd.i;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gateway.pay.response.PrepareOrderResponse;
import java.lang.StringBuilder;
import java.lang.Exception;
import nv8.b;
import android.content.Context;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.c0;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import cld.a;
import erd.g;
import crd.b;
import lnc.b9;
import java.lang.Integer;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.kwai.robust.PatchProxyResult;
import java.lang.Throwable;
import com.tencent.mm.opensdk.modelpay.PayReq;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import com.yxcorp.plugin.payment.g;
import com.kwai.component.payment.response.PaymentConfigResponse$PayProvider;
import com.yxcorp.wxapi.WXPayEntryBaseActivity$a;
import com.yxcorp.wxapi.WXPayEntryBaseActivity$b;

public class WXPayEntryBaseActivity extends GifshowActivity implements IWXAPIEventHandler	// class@0009ff
{
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public PrepareOrderResponse E;
    public int F;
    public b G;
    public IWXAPI y;
    public String z;

    public void WXPayEntryBaseActivity(){
       super();
       this.F = 1;
    }
    public String getUrl(){
       return "ks//wxpay";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WXPayEntryBaseActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       j.C().w("KwaiPaySDK", "WXPayEntryBaseActivity onCreate", objArray);
       boolean b = true;
       i.i(this, i, this.isDarkImmersiveMode(), b);
       Intent intent = this.getIntent();
       try{
          i = 0;
          this.E = j0.e(intent, "key_preorder_response");
          this.F = j0.b(intent, "key_pay_source", b);
       }catch(java.lang.Exception e2){
          b.f("WXPayEntryBaseActivity", "WXPayEntry getExtra Exception:"+e2.getMessage());
          this.E = i;
          this.F = b;
       }
       IWXAPI iWXAPI = WXAPIFactory.createWXAPI(this, i);
       this.y = iWXAPI;
       WXPayEntryBaseActivity tE = this.E;
       if (tE != null) {
          String str = (TextUtils.isEmpty(tE.mAppId))? this.u3(): this.E.mAppId;
          iWXAPI.registerApp(str);
          this.z = this.E.getOrderId();
          this.A = b;
          this.y.handleIntent(intent, this);
          if (a.t().d("enableCheckWxPaySupportApi", b) && this.y.getWXAppSupportAPI() < 0x22000001) {
             this.onPayFinish(5);
          }
       }else {
          this.onPayFinish(2);
       }
       this.G = RxBus.f.g(c0.class, RxBus$ThreadMode.MAIN).subscribe(new a(this));
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, WXPayEntryBaseActivity.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j.C().w("KwaiPaySDK", "WXPayEntryBaseActivity onDestroy", objArray);
       super.onDestroy();
       b9.a(this.G);
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WXPayEntryBaseActivity.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       j.C().w("KwaiPaySDK", "WXPayEntryBaseActivity onNewIntent", objArray);
       super.onNewIntent(p0);
       this.setIntent(p0);
       this.y.handleIntent(p0, this);
       return;
    }
    public void onPayFinish(int p0){
       WXPayEntryBaseActivity wXPayEntryBa = WXPayEntryBaseActivity.class;
       if (PatchProxy.isSupport(wXPayEntryBa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, wXPayEntryBa, "9")) {
          return;
       }
       this.onPayFinish(p0, null);
       return;
    }
    public final void onPayFinish(int p0,String p1){
       WXPayEntryBaseActivity wXPayEntryBa = WXPayEntryBaseActivity.class;
       if (PatchProxy.isSupport(wXPayEntryBa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, wXPayEntryBa, "10")) {
          return;
       }
       b.o("WXPayEntryBaseActivity", "onPayFinish. result="+p0);
       Intent intent = new Intent();
       intent.putExtra("order_id", this.z);
       intent.putExtra("pay_error_message", p1);
       this.setResult(p0, intent);
       this.finish();
       return;
    }
    public void onReq(BaseReq p0){
    }
    public void onResp(BaseResp p0){
       BaseResp errCode;
       String str1;
       WXPayEntryBaseActivity wXPayEntryBa = WXPayEntryBaseActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, wXPayEntryBa, "5")) {
          return;
       }
       if (p0.getType() == 5) {
          Bundle uBundle = new Bundle();
          p0.toBundle(uBundle);
          StringBuilder str = "onResp: errCode=";
          errCode = p0.errCode;
          if (PatchProxy.isSupport(wXPayEntryBa)) {
             str1 = PatchProxy.applyOneRefs(Integer.valueOf(errCode), this, wXPayEntryBa, "6");
             if (str1 != PatchProxyResult.class) {
             }else {
                switch (errCode){
                    case 0xfffffffa:
                      str1 = "ERR_BAN";
                      break;
                    case 0xfffffffb:
                      str1 = "ERR_UNSUPPORT";
                      break;
                    case 0xfffffffc:
                      str1 = "ERR_AUTH_DENIED";
                      break;
                    case 0xfffffffd:
                      str1 = "ERR_SENT_FAILED";
                      break;
                    case 0xfffffffe:
                      str1 = "ERR_USER_CANCEL";
                      break;
                    case 0xffffffff:
                      str1 = "ERR_COMM";
                      break;
                    case 0:
                      str1 = "ERR_OK";
                      break;
                    default:
                      str1 = String.valueOf(errCode);
                }
             }
          }else {
             goto label_003d ;
          }
          b.o("WXPayEntryBaseActivity", str+str1+", resp="+uBundle);
          this.B = false;
          this.C = false;
          BaseResp errCode1 = p0.errCode;
          if (errCode1 != -2) {
             if (errCode1 != null) {
                b.h("KwaiPaySdk", "WXPayEntryBaseActivity onResp failed.", null, "result", uBundle.toString());
                this.onPayFinish(p0.errCode, uBundle.toString());
             }else if(this.D != null){
                this.v3(this.z);
             }else {
                this.onPayFinish(1);
             }
          }else {
             this.onPayFinish(3);
          }
       }
       return;
    }
    public void onResume(){
       boolean b;
       PrepareOrderResponse mStoreId;
       WXPayEntryBaseActivity wXPayEntryBa = WXPayEntryBaseActivity.class;
       if (PatchProxy.applyVoid(null, this, wXPayEntryBa, "3")) {
          return;
       }
       String str = "WXPayEntryBaseActivity";
       b.o(str, "WXPayEntry onResume, mWaitCallWechatPay ="+this.A+", mWaitConfirmOrder="+this.B+", mWaitResult ="+this.C);
       super.onResume();
       b = false;
       if (this.A != null) {
          this.A = b;
          this.D = j0.a(this.getIntent(), "ConfirmOrderStatus", b);
          WXPayEntryBaseActivity tE = this.E;
          if (!PatchProxy.applyVoidOneRefs(tE, this, wXPayEntryBa, "8")) {
             b.o(str, "callWechatPay: response="+tE.toSimpleString());
             PayReq payReq = new PayReq();
             str = (TextUtils.isEmpty(tE.mAppId))? this.u3(): tE.mAppId;
             payReq.appId = str;
             str = (TextUtils.isEmpty(tE.mStoreId))? "1313728901": tE.mStoreId;
             payReq.partnerId = str;
             payReq.prepayId = tE.getPrepayId();
             payReq.packageValue = "Sign=WXPay";
             payReq.nonceStr = tE.getNoncestr();
             payReq.timeStamp = tE.getTimestamp();
             payReq.sign = tE.getSign();
             if (!this.y.sendReq(payReq)) {
                this.onPayFinish(2);
             }else if(this.D != null){
                this.B = true;
             }else {
                this.C = true;
             }
          }
       }else if(this.B != null){
          this.v3(this.z);
       }else if(this.C != null){
          this.C = b;
          this.onPayFinish(b);
          b.f("KwaiPaySdk", "WXPayEntryBaseActivity wait result, enter error state");
       }
       return;
    }
    public String u3(){
       return "";
    }
    public final void v3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WXPayEntryBaseActivity.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       j.C().w("KwaiPaySDK", "WXPayEntryBaseActivity queryOrderStatus: orderId ="+p0, objArray);
       d.a(0x630bc993).d1().L(PaymentConfigResponse$PayProvider.WECHAT, this.F, p0).subscribe(new WXPayEntryBaseActivity$a(this), new WXPayEntryBaseActivity$b(this));
       return;
    }
}
