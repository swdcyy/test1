package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$exitCurrentWebView$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import vxc.e;
import f55.g;
import android.app.Activity;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uxc.b;
import sy7.b;
import java.lang.Throwable;

public final class WebViewBridgeModuleImpl$exitCurrentWebView$1 extends Lambda implements a	// class@0016d8
{
    public final Activity $activity;
    public final g $callback;
    public final e $jsInjectKwai;

    public void WebViewBridgeModuleImpl$exitCurrentWebView$1(e p0,g p1,Activity p2){
       this.$jsInjectKwai = p0;
       this.$callback = p1;
       this.$activity = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       WebViewBridgeModuleImpl$exitCurrentWebView$1 t$activity;
       if (PatchProxy.applyVoid(null, this, WebViewBridgeModuleImpl$exitCurrentWebView$1.class, "1")) {
          return;
       }
       try{
          b uob = this.$jsInjectKwai.h();
          if (uob != null && uob.a()) {
             b.b.g("exitCurrentWebView with externalCallback hooked");
             this.$callback.onSuccess(null);
             return;
          }else {
             b.b.g("exitCurrentWebView with act finished");
             t$activity = this.$activity;
             if (t$activity != null) {
                t$activity.finish();
             }
          }
       }catch(java.lang.Exception e0){
          b.b.e("exitCurrentWebView crash", e0);
          t$activity = this.$activity;
          if (t$activity != null) {
             t$activity.finish();
          }
       }
       this.$callback.onSuccess(null);
       return;
    }
}
