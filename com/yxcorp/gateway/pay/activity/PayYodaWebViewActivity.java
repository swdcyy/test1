package com.yxcorp.gateway.pay.activity.PayYodaWebViewActivity;
import lv8.l;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import lv8.a;
import com.yxcorp.gateway.pay.params.webview.JsPageButtonParams;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.app.Activity;
import android.widget.TextView;
import java.lang.StringBuilder;
import lv8.g;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import lv8.d;
import com.google.gson.Gson;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.b;
import android.content.Intent;
import ekd.j0;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import java.lang.Number;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import com.yxcorp.gateway.pay.params.result.BaseResult;
import android.widget.ImageButton;
import java.lang.Boolean;
import java.lang.Runtime;
import com.yxcorp.gateway.pay.activity.a;
import my7.i;
import com.kwai.yoda.bridge.YodaBaseWebView;
import my7.j;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import androidx.fragment.app.PluginManagerForMemoryRestart;
import com.yxcorp.gateway.pay.webview.n;
import rv8.o;
import lv8.k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import android.view.KeyEvent;
import android.view.View$OnClickListener;

public class PayYodaWebViewActivity extends BaseActivity implements l	// class@001209
{
    public final a mButtonBinder;
    public a mFragment;
    public ImageButton mLeftBtn;
    public TextView mLeftTv;
    public ImageButton mRightBtn;
    public TextView mRightTv;
    public String mSessionId;
    public String mThemeType;
    public TextView mTitleTv;
    public boolean mTranslucent;

    public void PayYodaWebViewActivity(){
       this.mButtonBinder = new a();
    }
    public void bindTextButton(int p0,JsPageButtonParams p1){
       PayYodaWebViewActivity payYodaWebVi = PayYodaWebViewActivity.class;
       if (PatchProxy.isSupport(payYodaWebVi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, payYodaWebVi, "13")) {
          return;
       }
       View view = this.findViewById(p0);
       if (view instanceof TextView) {
          this.mButtonBinder.a(p1, view);
       }else {
          g.d("PayYodaWebViewActivity: bindTextButton unknown id "+p0);
       }
       return;
    }
    public final String buildCancelResult(){
       Object obj = PatchProxy.apply(null, this, PayYodaWebViewActivity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a.q(new JsErrorResult(0, ""));
    }
    public final void ensureYodaInit(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebViewActivity.class, "2")) {
          return;
       }
       b payYodaConfi = PayManager.getInstance().getPayYodaConfig();
       if (payYodaConfi == null) {
          g.d("PayYodaWebViewActivity: ensureYodaInit: config null");
          return;
       }else {
          payYodaConfi.a();
          return;
       }
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebViewActivity.class, "19")) {
          return;
       }
       super.finish();
       if (this.mTranslucent != null) {
          this.overridePendingTransition(0, 0);
       }else {
          this.overridePendingTransition(0, R.anim.arg_RES_7f0100dc);
       }
       return;
    }
    public String getLeftTopButtonType(){
       Object obj = PatchProxy.apply(null, this, PayYodaWebViewActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j0.f(this.getIntent(), "left_top_btn_type");
    }
    public String getPageName(){
       return "GATEWAY_WEBVIEW";
    }
    public String getPageType(){
       return "H5";
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PayYodaWebViewActivity.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       TypedArray obj = PatchProxy.apply(null, this, PayYodaWebViewActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.getTheme().obtainStyledAttributes(c$b.R3);
       obj.recycle();
       return obj.getColor(0, -1);
    }
    public String getWebUrl(){
       Object obj = PatchProxy.apply(null, this, PayYodaWebViewActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j0.f(this.getIntent(), "web_url");
    }
    public void handleFinished(String p0){
       JsErrorResult jsErrorResul;
       if (PatchProxy.applyVoidOneRefs(p0, this, PayYodaWebViewActivity.class, "14")) {
          return;
       }
       g.d("PayYodaWebViewActivity: handleFinished, data:"+p0);
       if (TextUtils.isEmpty(p0)) {
          PayManager.getInstance().onWithdrawCancel(this.buildCancelResult());
          this.finish();
          return;
       }else {
          try{
             jsErrorResul = d.a.h(p0, JsErrorResult.class);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             jsErrorResul = null;
          }
          if (jsErrorResul != null) {
             BaseResult mResult = jsErrorResul.mResult;
             if (mResult == null) {
             label_0062 :
                PayManager.getInstance().onWithdrawCancel(p0);
             }else if(1 == mResult){
                PayManager.getInstance().onWithdrawSuccess(p0);
             }else {
                PayManager.getInstance().onWithdrawFailure(jsErrorResul.mResult, jsErrorResul.mErrorMsg);
             }
          }else {
             goto label_0062 ;
          }
          this.finish();
          return;
       }
    }
    public final void initView(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebViewActivity.class, "6")) {
          return;
       }
       this.mLeftBtn = this.findViewById(0x7f0a2fa1);
       this.mLeftTv = this.findViewById(0x7f0a2fa2);
       this.mRightBtn = this.findViewById(0x7f0a2fb2);
       this.mRightTv = this.findViewById(0x7f0a2fb3);
       this.mTitleTv = this.findViewById(0x7f0a2fbc);
       View view = this.findViewById(R.id.pay_title_root);
       View view1 = this.findViewById(R.id.pay_title_divider);
       if (this.isImmersiveMode()) {
          view.setVisibility(8);
          view1.setVisibility(8);
       }
       return;
    }
    public boolean isCustomImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, PayYodaWebViewActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isImmersiveMode();
    }
    public final boolean isImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, PayYodaWebViewActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mTranslucent != null || ("4").equals(this.mThemeType))? true: false;
       return b;
    }
    public final void logMemory(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebViewActivity.class, "20")) {
          return;
       }
       Runtime runtime = Runtime.getRuntime();
       g.d("PayYodaWebViewActivity logMemory, maxMemory:"+runtime.maxMemory()+", totalMemory:"+runtime.totalMemory()+", freeMemory:"+runtime.freeMemory());
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(PayYodaWebViewActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PayYodaWebViewActivity.class, "16")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       g.d("PayYodaWebViewActivity: onActivityResult requestCode "+p0+", resultCode "+p1);
       PayYodaWebViewActivity tmFragment = this.mFragment;
       if (tmFragment != null) {
          a e = tmFragment.e;
          if (e != null && (e.getManagerProvider() != null && this.mFragment.e.getManagerProvider().a() != null)) {
             this.mFragment.e.getManagerProvider().a().d(p0, p1, p2);
          }
       }
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, PayYodaWebViewActivity.class, "18")) {
          return;
       }
       super.onBackPressed();
       g.d("PayYodaWebViewActivity onBackPressed");
       this.handleFinished(null);
       return;
    }
    public void onCreate(Bundle p0){
       a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, PayYodaWebViewActivity.class, "1")) {
          return;
       }
       PluginManagerForMemoryRestart.e(this, p0);
       try{
          this.ensureYodaInit();
          n.a(this);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       String str = "sessionId";
       boolean b = false;
       if (this.getIntent() != null) {
          this.mTranslucent = j0.a(this.getIntent(), "translucent", b);
          this.mSessionId = j0.f(this.getIntent(), str);
       }
       this.mThemeType = o.a(this.getWebUrl());
       g.d("PayWebViewActivity onCreate, mTranslucent="+this.mTranslucent+", mThemeType="+this.mThemeType);
       boolean b1 = true;
       if (this.mTranslucent != null) {
          this.setTheme(R.style.arg_RES_7f11024f);
          this.overridePendingTransition(b, b);
          k.b(this, b, b1, b1);
       }else {
          int i = 0x7f0100da;
          if (("4").equals(this.mThemeType)) {
             this.setTheme(R.style.arg_RES_7f110250);
             this.overridePendingTransition(i, b);
             k.b(this, b, b, b1);
          }else {
             this.setTheme(R.style.arg_RES_7f11024e);
             this.overridePendingTransition(i, b);
          }
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d1107);
       this.initView();
       String webUrl = this.getWebUrl();
       boolean b2 = this.isImmersiveMode();
       PayYodaWebViewActivity tmSessionId = this.mSessionId;
       if (PatchProxy.isSupport(a.class)) {
          uoa = PatchProxy.applyThreeRefs(webUrl, Boolean.valueOf(b2), tmSessionId, null, a.class, "1");
          if (uoa != PatchProxyResult.class) {
          label_00e7 :
             this.mFragment = uoa;
             e uoe = this.getSupportFragmentManager().beginTransaction();
             uoe.v(R.id.web_view_container, this.mFragment);
             uoe.l();
             this.logMemory();
             return;
          }
       }
       uoa = new a();
       Bundle uBundle = new Bundle();
       uBundle.putString("url", webUrl);
       uBundle.putBoolean("immersive_mode", b2);
       uBundle.putString(str, tmSessionId);
       uoa.setArguments(uBundle);
       goto label_00e7 ;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       PayYodaWebViewActivity payYodaWebVi = PayYodaWebViewActivity.class;
       if (PatchProxy.isSupport(payYodaWebVi)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, payYodaWebVi, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return super.onKeyDown(p0, p1);
    }
    public void setImageRes(int p0,int p1){
       PayYodaWebViewActivity payYodaWebVi = PayYodaWebViewActivity.class;
       if (PatchProxy.isSupport(payYodaWebVi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, payYodaWebVi, "10")) {
          return;
       }
       View view = this.findViewById(p0);
       if (view instanceof ImageButton) {
          view.setImageResource(p1);
       }else {
          g.d("PayYodaWebViewActivity: setImageRes unknown id "+p0);
       }
       return;
    }
    public void setOnClickListener(int p0,View$OnClickListener p1){
       PayYodaWebViewActivity payYodaWebVi = PayYodaWebViewActivity.class;
       if (PatchProxy.isSupport(payYodaWebVi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, payYodaWebVi, "12")) {
          return;
       }
       View view = this.findViewById(p0);
       if (view != null) {
          view.setOnClickListener(p1);
       }else {
          g.d("PayYodaWebViewActivity: setOnClickListener unknown id "+p0);
       }
       return;
    }
    public void setText(int p0,String p1){
       PayYodaWebViewActivity payYodaWebVi = PayYodaWebViewActivity.class;
       if (PatchProxy.isSupport(payYodaWebVi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, payYodaWebVi, "11")) {
          return;
       }
       View view = this.findViewById(p0);
       if (view instanceof TextView) {
          view.setText(p1);
       }else {
          g.d("PayYodaWebViewActivity: setText unknown id "+p0);
       }
       return;
    }
    public void setVisibility(int p0,int p1){
       PayYodaWebViewActivity payYodaWebVi = PayYodaWebViewActivity.class;
       if (PatchProxy.isSupport(payYodaWebVi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, payYodaWebVi, "9")) {
          return;
       }
       View view = this.findViewById(p0);
       if (view != null) {
          view.setVisibility(p1);
       }else {
          g.d("PayYodaWebViewActivity: setVisibility unknown id "+p0);
       }
       return;
    }
}
