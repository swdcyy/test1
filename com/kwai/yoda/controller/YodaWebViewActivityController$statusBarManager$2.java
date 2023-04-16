package com.kwai.yoda.controller.YodaWebViewActivityController$statusBarManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.controller.YodaWebViewActivityController;
import dz7.m;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.controller.YodaWebViewController;

public final class YodaWebViewActivityController$statusBarManager$2 extends Lambda implements a	// class@0011b4
{
    public final YodaWebViewActivityController this$0;

    public void YodaWebViewActivityController$statusBarManager$2(YodaWebViewActivityController p0){
       this.this$0 = p0;
       super(0);
    }
    public final m invoke(){
       Object obj = PatchProxy.apply(null, this, YodaWebViewActivityController$statusBarManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m(this.this$0.e(), this.this$0.getWebView());
    }
    public Object invoke(){
       return this.invoke();
    }
}
