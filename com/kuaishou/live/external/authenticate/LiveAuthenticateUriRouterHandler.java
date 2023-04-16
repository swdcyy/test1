package com.kuaishou.live.external.authenticate.LiveAuthenticateUriRouterHandler;
import com.kwai.platform.krouter.handler.AnnotationUriHandler;
import xh7.b;
import qh7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import xh7.a;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.os.Bundle;
import nf6.e;
import com.yxcorp.gifshow.webview.c;
import yh7.a;

public class LiveAuthenticateUriRouterHandler extends AnnotationUriHandler	// class@001b6e
{

    public void LiveAuthenticateUriRouterHandler(){
       super();
    }
    public void c(b p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAuthenticateUriRouterHandler.class, "1")) {
          return;
       }
       Intent intent = KwaiWebViewActivity.N3(p0.b(), WebEntryUrls.j).a();
       Bundle uBundle = p0.c(Bundle.class, "com.kwai.platform.krouter.handler.extra_intent");
       if (uBundle != null) {
          intent.putExtras(uBundle);
       }
       e.b(intent);
       c.i(p0.b(), intent);
       p1.a(new a(200));
       return;
    }
}
