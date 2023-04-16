package com.kwai.yoda.controller.YodaWebViewActivityController$titleBarManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.controller.YodaWebViewActivityController;
import dz7.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import android.view.View;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.controller.YodaWebViewController;

public final class YodaWebViewActivityController$titleBarManager$2 extends Lambda implements a	// class@0011b5
{
    public final YodaWebViewActivityController this$0;

    public void YodaWebViewActivityController$titleBarManager$2(YodaWebViewActivityController p0){
       this.this$0 = p0;
       super(0);
    }
    public final n invoke(){
       Object obj = PatchProxy.apply(null, this, YodaWebViewActivityController$titleBarManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new n(this.this$0.e().findViewById(0x7f0a3f58), this.this$0.getWebView());
    }
    public Object invoke(){
       return this.invoke();
    }
}
