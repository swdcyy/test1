package com.yxcorp.gateway.pay.activity.AuthThirdActivity;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import lv8.g;
import nv8.b;
import android.app.Activity;
import android.os.ResultReceiver;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
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
import gv8.a;
import gv8.b;
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

public class AuthThirdActivity extends BaseActivity	// class@0011fc
{
    public boolean mAuthFinished;
    public String mAuthParams;
    public String mProvider;
    public ResultReceiver mReceiver;

    public void AuthThirdActivity(){
       super();
    }
    public static void E2(AuthThirdActivity p0,AuthThirdResult p1){
       p0.lambda$authStart$0(p1);
    }
    public static void F2(AuthThirdActivity p0,Throwable p1){
       p0.lambda$authStart$1(p1);
    }
    private void lambda$authStart$0(AuthThirdResult p0){
       g.d("AuthThirdActivity finish, provider = "+this.mProvider+", result = "+p0.mResult+", error_code = "+p0.mErrorCode);
       this.authFinished(p0);
    }
    private void lambda$authStart$1(Throwable p0){
       b.g("AuthThirdActivity", "AuthThirdActivity failed !", p0);
       this.authFinished(AuthThirdResult.fail(null, p0.getMessage()));
    }
    public static void startAuthThird(Activity p0,String p1,String p2,ResultReceiver p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, AuthThirdActivity.class, "1")) {
          return;
       }
       Intent intent = new Intent(p0, AuthThirdActivity.class);
       intent.putExtra("provider", p1);
       intent.putExtra("auth_params", p2);
       intent.putExtra("result_receiver", p3);
       p0.startActivity(intent);
       return;
    }
    public final void authFinished(AuthThirdResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthThirdActivity.class, "7")) {
          return;
       }
       this.mAuthFinished = true;
       if (this.mReceiver != null) {
          Bundle uBundle = new Bundle();
          SerializableHook.putSerializable(uBundle, "auth_third_result", p0);
          this.mReceiver.send(0, uBundle);
       }
       this.finish();
       return;
    }
    public final void authStart(){
       if (PatchProxy.applyVoid(null, this, AuthThirdActivity.class, "6")) {
          return;
       }
       g.d("AuthThirdActivity authStart");
       h.a(this, this.mProvider).a(this.mAuthParams).subscribeOn(d.a).subscribe(new a(this), new b(this));
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, AuthThirdActivity.class, "3")) {
          return;
       }
       super.finish();
       this.overridePendingTransition(0, 0);
       return;
    }
    public String getPageName(){
       return "GATEWAY_AUTH_THIRD";
    }
    public String getPageType(){
       return "NATIVE";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AuthThirdActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public final boolean isLandScape(){
       Configuration obj = PatchProxy.apply(null, this, AuthThirdActivity.class, "8");
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
       if (PatchProxy.applyVoid(null, this, AuthThirdActivity.class, "4")) {
          return;
       }
       super.onBackPressed();
       g.d("AuthThirdActivity onBackPressed");
       this.authFinished(AuthThirdResult.cancel(null, ""));
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthThirdActivity.class, "2")) {
          return;
       }
       this.overridePendingTransition(0, 0);
       super.onCreate(p0);
       if (!this.isLandScape() && Build$VERSION.SDK_INT < 29) {
          q.b(this);
       }
       this.mProvider = j0.f(this.getIntent(), "provider");
       this.mAuthParams = j0.f(this.getIntent(), "auth_params");
       this.mReceiver = j0.d(this.getIntent(), "result_receiver");
       if (TextUtils.x(this.mProvider) || TextUtils.x(this.mAuthParams)) {
          g.d("AuthThirdActivity onCreate, invalid params");
          this.authFinished(AuthThirdResult.fail(null, "invalid params"));
          return;
       }else {
          this.authStart();
          return;
       }
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AuthThirdActivity.class, "5")) {
          return;
       }
       if (this.mAuthFinished == null) {
          g.d("AuthThirdActivity destroy with unknown status");
          this.mAuthFinished = true;
          if (this.mReceiver != null) {
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "auth_third_result", AuthThirdResult.cancel(objArray, ""));
             this.mReceiver.send(0, uBundle);
          }
       }
       super.onDestroy();
       return;
    }
}
