package com.kwai.yoda.cache.codecache.service.YodaKwService$initWebView$1;
import com.kuaishou.webkit.extension.KwSdk$CoreInitCallback;
import com.kwai.yoda.cache.codecache.service.YodaKwService;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.yoda.cache.codecache.service.YodaKwService$initWebView$1$onCoreLoadFinished$1;
import msd.a;
import tb7.b;
import com.kuaishou.webkit.extension.KsCoreInitSettings;
import com.kuaishou.webkit.WebView;

public final class YodaKwService$initWebView$1 implements KwSdk$CoreInitCallback	// class@0011b0
{
    public final YodaKwService a;

    public void YodaKwService$initWebView$1(YodaKwService p0){
       this.a = p0;
       super();
    }
    public void onCoreLoadFailed(String p0,String p1){
       PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaKwService$initWebView$1.class, "3");
    }
    public void onCoreLoadFinished(boolean p0){
       YodaKwService$initWebView$1 oinitWebView = YodaKwService$initWebView$1.class;
       if (PatchProxy.isSupport(oinitWebView) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oinitWebView, "2")) {
          return;
       }
       if (p0) {
          b.j(new YodaKwService$initWebView$1$onCoreLoadFinished$1(this));
       }
       return;
    }
    public void onPreLoadCore(KsCoreInitSettings p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaKwService$initWebView$1.class, "1")) {
          return;
       }
       WebView.setDataDirectorySuffix("yodakw");
       if (p0 != null) {
          p0.enableMultiProcess(false);
          p0.useSystemWebView(false);
          p0.setV8ClassicScriptCacheMode(2);
       }
       return;
    }
}
