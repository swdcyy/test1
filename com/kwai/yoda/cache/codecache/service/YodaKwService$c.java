package com.kwai.yoda.cache.codecache.service.YodaKwService$c;
import erd.g;
import com.kwai.yoda.cache.codecache.service.YodaKwService;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.yoda.cache.codecache.model.CodeCacheInfo;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebSettings;
import com.kuaishou.webkit.extension.KsWebView;
import java.lang.StringBuilder;

public final class YodaKwService$c implements g	// class@0011ad
{
    public final YodaKwService b;

    public void YodaKwService$c(YodaKwService p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaKwService$c.class, "1")) {
       }else {
          byte[] second = p0.getSecond();
          if (second != null) {
             boolean b = false;
             boolean b1 = true;
             String str = (!second.length)? 1: null;
             if (!str) {
                p0 = p0.getFirst();
                a.h(p0, "it.first");
                p0.getUrl();
                YodaKwService$c tb = this.b;
                if (tb.c != null) {
                   WebSettings settings = tb.b().getSettings();
                   a.h(settings, "mWebView.settings");
                   settings.setJavaScriptEnabled(b1);
                   this.b.c = b;
                }
                this.b.b().getKsWebView().compileJsAndGenCodeCache("https://"+p0.getUrl(), second, p0.getSavePath());
             }
          }
       }
       return;
    }
}
