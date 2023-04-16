package com.kwai.yoda.controller.YodaWebViewController;
import my7.i;
import my7.f;
import java.lang.Object;
import my7.c;
import hy7.q;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import hy7.o;
import android.view.View;
import com.kwai.yoda.bridge.YodaBaseWebView;
import mz7.a;
import android.content.Context;
import com.kwai.yoda.model.LaunchModel;
import my7.f$a;
import java.lang.Number;
import yz7.n;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import com.kuaishou.webkit.WebChromeClient;
import my7.d;
import com.kuaishou.webkit.WebViewClient;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.content.Intent;
import java.lang.Integer;
import java.lang.Boolean;
import my7.j;
import com.kwai.yoda.model.LaunchModelInternal;
import java.lang.CharSequence;
import ca7.u;
import yz7.r;
import rx7.s;
import my7.o;
import brd.g;

public abstract class YodaWebViewController implements i, f	// class@0011b8
{
    public a mContainerSession;
    public boolean mFirstEnter;
    public LaunchModel mLaunchModel;
    public final f$a mLifeCycler;
    public YodaBaseWebView mWebView;
    public static final String TAG = "YodaWebViewController";

    public void YodaWebViewController(){
       super();
       this.mLifeCycler = new c();
       this.mFirstEnter = true;
    }
    public q createPolicyChecker(){
       Object obj = PatchProxy.apply(null, this, YodaWebViewController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o();
    }
    public abstract View findStatusSpace();
    public abstract YodaBaseWebView findWebView();
    public a getContainerSession(){
       return this.mContainerSession;
    }
    public abstract Context getContext();
    public LaunchModel getLaunchModel(){
       return this.mLaunchModel;
    }
    public f$a getLifeCycler(){
       return this.mLifeCycler;
    }
    public i getManagerProvider(){
       return this;
    }
    public int getStatusBarHeight(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, YodaWebViewController.class, "9");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.getContext();
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, n.class, "4");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): (int)((float)n.e(obj) / c.c(obj.getResources()).density);
       return i;
    }
    public int getTitleBarHeight(){
       TypedValue obj = PatchProxy.apply(null, this, YodaWebViewController.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new TypedValue();
       this.getContext().getResources().getValue(R.dimen.arg_RES_7f070fdc, obj, true);
       return (int)TypedValue.complexToFloat(obj.data);
    }
    public WebChromeClient getWebChromeClient(){
       return d.b(this);
    }
    public YodaBaseWebView getWebView(){
       return this.mWebView;
    }
    public WebViewClient getWebViewClient(){
       return d.c(this);
    }
    public void handleLaunchModel(LaunchModel p0){
    }
    public void initStatusPlace(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewController.class, "6")) {
          return;
       }
       View view = this.findStatusSpace();
       if (view != null) {
          LinearLayout$LayoutParams layoutParams = view.getLayoutParams();
          layoutParams.height = n.e(this.getContext());
          view.setLayoutParams(layoutParams);
       }
       return;
    }
    public YodaBaseWebView initWebView(){
       YodaBaseWebView obj = PatchProxy.apply(null, this, YodaWebViewController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.findWebView();
       this.mWebView = obj;
       if (obj != null) {
          obj.attach(this);
       }
       return this.mWebView;
    }
    public boolean interceptActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(YodaWebViewController.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, YodaWebViewController.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.a().d(p0, p1, p2);
    }
    public boolean interceptBackPress(){
       return false;
    }
    public boolean invalidLaunchModel(){
       YodaWebViewController obj = PatchProxy.apply(null, this, YodaWebViewController.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mLaunchModel;
       if (obj != null && !u.c(obj.getUrl())) {
          return false;
       }
       r.d(this.getClass().getSimpleName(), "URLÎª¿Õ");
       return true;
    }
    public void loadUrl(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewController.class, "4")) {
          return;
       }
       s.c(this.mWebView, this.mLaunchModel);
       return;
    }
    public boolean onCreate(){
       Object obj = PatchProxy.apply(null, this, YodaWebViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.initWebView();
       this.initStatusPlace();
       this.loadUrl();
       this.a();
       this.b();
       return true;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewController.class, "10")) {
          return;
       }
       this.mLifeCycler.onNext("destroy");
       o oo = this.b();
       if (oo != null) {
          oo.a();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewController.class, "11")) {
          return;
       }
       this.mLifeCycler.onNext("pause");
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewController.class, "13")) {
          return;
       }
       if (this.getWebView() != null && this.mFirstEnter != null) {
          this.mFirstEnter = false;
       }
       this.mLifeCycler.onNext("resume");
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewController.class, "12")) {
          return;
       }
       this.mLifeCycler.onNext("start");
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, YodaWebViewController.class, "14")) {
          return;
       }
       this.mLifeCycler.onNext("stop");
       return;
    }
    public abstract LaunchModel resolveLaunchModel();
    public void setContainerSession(a p0){
       this.mContainerSession = p0;
    }
}
