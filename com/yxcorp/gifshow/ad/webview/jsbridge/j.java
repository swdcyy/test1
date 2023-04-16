package com.yxcorp.gifshow.ad.webview.jsbridge.j;
import com.yxcorp.gifshow.webview.yoda.h;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import java.util.Objects;
import o59.c0;
import erd.g;
import o59.b0;

public class j extends h	// class@0018d5
{

    public void j(g p0,String p1){
       super(null, p0, p1);
    }
    public void callAdBridge(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "2")) {
          return;
       }
       this.c().getJavascriptBridge().invoke(this.b(), "callAdBridge", p0, "");
       return;
    }
    public void callCardHandler(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       this.c().getJavascriptBridge().invoke(this.b(), "callCardHandler", p0, "");
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       g og = this.a();
       Objects.requireNonNull(og);
       c0 uoc0 = new c0(og);
       this.e(this.c(), "callCardHandler", uoc0);
       og = this.a();
       Objects.requireNonNull(og);
       b0 uob0 = new b0(og);
       this.e(this.c(), "callAdBridge", uob0);
       return;
    }
}
