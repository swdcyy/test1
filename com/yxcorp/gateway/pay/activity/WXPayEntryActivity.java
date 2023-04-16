package com.yxcorp.gateway.pay.activity.WXPayEntryActivity;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import com.yxcorp.gateway.pay.response.PrepareOrderResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import android.os.Bundle;
import android.app.Activity;
import lv8.k;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gateway.pay.api.PayManager;
import android.content.Context;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import androidx.fragment.app.FragmentActivity;
import java.lang.Integer;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import java.lang.StringBuilder;
import lv8.g;

public class WXPayEntryActivity extends BaseActivity implements IWXAPIEventHandler	// class@00120b
{
    public PrepareOrderResponse mPreOrderResponse;
    public boolean mWaitCallWechatPay;
    public boolean mWaitResult;
    public IWXAPI mWxApi;

    public void WXPayEntryActivity(){
       super();
    }
    public final void callWechatPay(PrepareOrderResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WXPayEntryActivity.class, "5")) {
          return;
       }
       PayReq payReq = new PayReq();
       payReq.appId = p0.mAppId;
       payReq.partnerId = p0.mStoreId;
       payReq.prepayId = p0.getPrepayId();
       payReq.packageValue = "Sign=WXPay";
       payReq.nonceStr = p0.getNoncestr();
       payReq.timeStamp = p0.getTimestamp();
       payReq.sign = p0.getSign();
       if (!this.mWxApi.sendReq(payReq)) {
          this.onPayFinish(2);
       }else {
          this.mWaitResult = true;
       }
       return;
    }
    public String getPageName(){
       return "GATEWAY_WXPAYENTRY";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, WXPayEntryActivity.class, "7")) {
          return;
       }
       this.onPayFinish(3);
       return;
    }
    public void onCreate(Bundle p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, WXPayEntryActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       k.b(this, 0, this.isDarkImmersiveMode(), true);
       Intent intent = this.getIntent();
       PrepareOrderResponse prepareOrder = j0.e(this.getIntent(), "key_preorder_response");
       this.mPreOrderResponse = prepareOrder;
       if (prepareOrder != null && (TextUtils.isEmpty(prepareOrder.mAppId) || TextUtils.isEmpty(this.mPreOrderResponse.mStoreId))) {
          i = 30;
       }else {
          IWXAPI iWXAPI = WXAPIFactory.createWXAPI(PayManager.getInstance().getContext(), null);
          this.mWxApi = iWXAPI;
          iWXAPI.registerApp(this.mPreOrderResponse.mAppId);
          this.mWxApi.handleIntent(intent, this);
          if (this.mWxApi.getWXAppSupportAPI() < 0x22000001) {
             i = 2;
          }else {
             this.mWaitCallWechatPay = true;
             return;
          }
       }
       this.onPayFinish(i);
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WXPayEntryActivity.class, "3")) {
          return;
       }
       super.onNewIntent(p0);
       this.setIntent(p0);
       this.mWxApi.handleIntent(p0, this);
       return;
    }
    public final void onPayFinish(int p0){
       WXPayEntryActivity wXPayEntryAc = WXPayEntryActivity.class;
       if (PatchProxy.isSupport(wXPayEntryAc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, wXPayEntryAc, "6")) {
          return;
       }
       this.setResult(p0);
       this.finish();
       return;
    }
    public void onReq(BaseReq p0){
    }
    public void onResp(BaseResp p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, WXPayEntryActivity.class, "4")) {
          return;
       }
       if (p0.getType() == 5) {
          g.d("WXPayEntry onResp, errorCode="+p0.errCode);
          this.mWaitResult = false;
          p0 = p0.errCode;
          if (p0 != -2) {
             if (p0 == null) {
                i = 1;
             }
          }else {
             i = 3;
          }
          this.onPayFinish(p0);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, WXPayEntryActivity.class, "2")) {
          return;
       }
       super.onResume();
       g.d("WXPayEntry onResume, mWaitCallWechatPay="+this.mWaitCallWechatPay+", mWaitResult="+this.mWaitResult);
       if (this.mWaitCallWechatPay != null) {
          this.mWaitCallWechatPay = false;
          this.callWechatPay(this.mPreOrderResponse);
       }else if(this.mWaitResult != null){
          this.mWaitResult = false;
          this.onPayFinish(false);
       }
       return;
    }
}
