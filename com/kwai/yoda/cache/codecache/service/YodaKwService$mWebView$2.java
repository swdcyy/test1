package com.kwai.yoda.cache.codecache.service.YodaKwService$mWebView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.cache.codecache.service.YodaKwService;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.app.Service;

public final class YodaKwService$mWebView$2 extends Lambda implements a	// class@0011b1
{
    public final YodaKwService this$0;

    public void YodaKwService$mWebView$2(YodaKwService p0){
       this.this$0 = p0;
       super(0);
    }
    public final WebView invoke(){
       Object obj = PatchProxy.apply(null, this, YodaKwService$mWebView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WebView(this.this$0.getApplicationContext());
    }
    public Object invoke(){
       return this.invoke();
    }
}
