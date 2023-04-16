package com.yxcorp.gateway.pay.activity.a$a;
import my7.f;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import lv8.l;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.model.LaunchModel;
import java.lang.String;
import java.lang.Object;
import my7.c;
import dz7.l;
import android.app.Activity;
import hy7.q;
import my7.d;
import mz7.a;
import my7.f$a;
import my7.i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gateway.pay.activity.a$a$b;
import java.lang.Number;
import android.util.TypedValue;
import android.content.res.Resources;
import com.kuaishou.webkit.WebChromeClient;
import com.kwai.yoda.bridge.YodaWebChromeClient;
import com.kuaishou.webkit.WebViewClient;
import com.yxcorp.gateway.pay.webview.yoda.k;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.model.LaunchModelInternal;
import com.yxcorp.gateway.pay.activity.a$a$a;
import com.kwai.yoda.bridge.g$b;
import com.kwai.yoda.bridge.g;
import brd.g;

public class a$a implements f	// class@001213
{
    public final f$a a;
    public final BaseActivity b;
    public final l c;
    public final YodaBaseWebView d;
    public final LaunchModel e;
    public final String f;
    public final l g;

    public void a$a(BaseActivity p0,l p1,YodaBaseWebView p2,LaunchModel p3,String p4){
       super();
       this.a = new c();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = new l(p0, p2);
    }
    public static String a(a$a p0){
       return p0.f;
    }
    public q createPolicyChecker(){
       return d.a(this);
    }
    public a getContainerSession(){
       return null;
    }
    public LaunchModel getLaunchModel(){
       return this.e;
    }
    public f$a getLifeCycler(){
       return this.a;
    }
    public i getManagerProvider(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$a$b(this);
    }
    public int getStatusBarHeight(){
       TypedValue obj = PatchProxy.apply(null, this, a$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new TypedValue();
       this.b.getResources().getValue(R.dimen.arg_RES_7f070fdc, obj, true);
       return (int)TypedValue.complexToFloat(obj.data);
    }
    public int getTitleBarHeight(){
       return 0;
    }
    public WebChromeClient getWebChromeClient(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new YodaWebChromeClient(this.d);
    }
    public WebViewClient getWebViewClient(){
       k obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a$a tb = this.b;
       a$a td = this.d;
       obj = new k(tb, this.c, td, new JsNativeEventCommunication(tb, td));
       obj.i = this.e.getUrl();
       obj.t(new a$a$a(this));
       return obj;
    }
    public boolean onCreate(){
       return d.d(this);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "9")) {
          return;
       }
       this.a.onNext("destroy");
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "7")) {
          return;
       }
       this.a.onNext("pause");
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "6")) {
          return;
       }
       this.a.onNext("resume");
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "5")) {
          return;
       }
       this.a.onNext("start");
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "8")) {
          return;
       }
       this.a.onNext("stop");
       return;
    }
}
