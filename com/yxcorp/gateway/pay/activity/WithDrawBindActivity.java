package com.yxcorp.gateway.pay.activity.WithDrawBindActivity;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import com.yxcorp.gateway.pay.response.BindResult;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gateway.pay.response.GatewayPayBaseResponse;
import lv8.g;
import android.app.Activity;
import android.os.ResultReceiver;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import android.content.Intent;
import android.content.Context;
import android.os.Parcelable;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import tv8.g;
import tv8.h;
import brd.t;
import t45.d;
import brd.z;
import gv8.g1;
import gv8.h1;
import erd.g;
import crd.b;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Boolean;
import android.content.res.Configuration;
import androidx.activity.ComponentActivity;
import android.os.Build$VERSION;
import lv8.q;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class WithDrawBindActivity extends BaseActivity	// class@001210
{
    public String mAccountGroupKey;
    public boolean mBindFinished;
    public String mProvider;
    public ResultReceiver mReceiver;
    public String mTicket;

    public void WithDrawBindActivity(){
       super();
    }
    public static void E2(WithDrawBindActivity p0,BindResult p1){
       p0.lambda$bindStart$0(p1);
    }
    public static void F2(WithDrawBindActivity p0,Throwable p1){
       p0.lambda$bindStart$1(p1);
    }
    private void lambda$bindStart$0(BindResult p0){
       g.d("WithDrawBindActivity finish, provider = "+this.mProvider+", error_code = "+p0.mCode+", msg = "+p0.mMsg);
       this.bindFinished(p0);
    }
    private void lambda$bindStart$1(Throwable p0){
       g.d("WithDrawBindActivity failed, error = "+p0.getMessage());
       this.bindFinished(BindResult.fail(p0.getMessage()));
    }
    public static void startBindWithDraw(Activity p0,String p1,String p2,String p3,ResultReceiver p4){
       WithDrawBindActivity withDrawBind = WithDrawBindActivity.class;
       if (PatchProxy.isSupport(withDrawBind)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, withDrawBind, "1")) {
             return;
          }
       }
       Intent intent = new Intent(p0, withDrawBind);
       intent.putExtra("provider", p1);
       intent.putExtra("ticket", p2);
       intent.putExtra("account_group_key", p3);
       intent.putExtra("result_receiver", p4);
       p0.startActivity(intent);
       return;
    }
    public final void bindFinished(BindResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WithDrawBindActivity.class, "7")) {
          return;
       }
       this.mBindFinished = true;
       if (this.mReceiver != null) {
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "bind_result", p0);
          this.mReceiver.send(0, uBundle);
       }
       this.finish();
       return;
    }
    public final void bindStart(){
       if (PatchProxy.applyVoid(null, this, WithDrawBindActivity.class, "3")) {
          return;
       }
       g.d("WithDrawBindActivity bind start");
       h.a(this, this.mProvider).a(this.mTicket, this.mAccountGroupKey).subscribeOn(d.a).subscribe(new g1(this), new h1(this));
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, WithDrawBindActivity.class, "4")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public String getPageName(){
       return "PAGE_GATEWAY_WITHDRAW_BIND";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, WithDrawBindActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final boolean isLandScape(){
       Configuration obj = PatchProxy.apply(null, this, WithDrawBindActivity.class, "8");
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
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, WithDrawBindActivity.class, "6")) {
          return;
       }
       super.onBackPressed();
       g.d("WithDrawBindActivity onBackPressed");
       this.bindFinished(BindResult.cancel(""));
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WithDrawBindActivity.class, "2")) {
          return;
       }
       this.overridePendingTransition(0, 0);
       super.onCreate(p0);
       if (!this.isLandScape() && Build$VERSION.SDK_INT < 29) {
          q.b(this);
       }
       this.mProvider = j0.f(this.getIntent(), "provider");
       this.mTicket = j0.f(this.getIntent(), "ticket");
       this.mAccountGroupKey = j0.f(this.getIntent(), "account_group_key");
       this.mReceiver = j0.d(this.getIntent(), "result_receiver");
       if (!TextUtils.x(this.mProvider) && (TextUtils.x(this.mTicket) || TextUtils.x(this.mAccountGroupKey))) {
          g.d("WithDrawBindActivity failed, invalid params");
          this.bindFinished(BindResult.fail(this.getString(R.string.arg_RES_7f103b87)));
          return;
       }else {
          this.bindStart();
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, WithDrawBindActivity.class, "5")) {
          return;
       }
       if (this.mBindFinished == null) {
          g.d("WithDrawBindActivity destroy with unknown status");
          this.mBindFinished = true;
          if (this.mReceiver != null) {
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "bind_result", BindResult.cancel(""));
             this.mReceiver.send(0, uBundle);
          }
       }
       super.onDestroy();
       return;
    }
}
