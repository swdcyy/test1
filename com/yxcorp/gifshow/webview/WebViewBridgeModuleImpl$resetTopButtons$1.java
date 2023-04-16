package com.yxcorp.gifshow.webview.WebViewBridgeModuleImpl$resetTopButtons$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.webview.view.c;
import txc.b;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;

public final class WebViewBridgeModuleImpl$resetTopButtons$1 extends Lambda implements a	// class@0016e7
{
    public final c $actionBar;
    public final b $bridgeContext;

    public void WebViewBridgeModuleImpl$resetTopButtons$1(c p0,b p1){
       this.$actionBar = p0;
       this.$bridgeContext = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, WebViewBridgeModuleImpl$resetTopButtons$1.class, "1")) {
          return;
       }
       WebViewBridgeModuleImpl$resetTopButtons$1 t$actionBar = this.$actionBar;
       if (t$actionBar != null) {
          t$actionBar.a(this.$bridgeContext.o());
       }
       return;
    }
}
