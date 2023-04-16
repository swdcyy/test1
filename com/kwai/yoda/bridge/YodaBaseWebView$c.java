package com.kwai.yoda.bridge.YodaBaseWebView$c;
import com.kuaishou.webkit.extension.KsWebViewClient;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import sz7.l;
import com.kwai.yoda.session.logger.webviewload.XCacheInfo;

public class YodaBaseWebView$c extends KsWebViewClient	// class@001181
{
    public final YodaBaseWebView a;

    public void YodaBaseWebView$c(YodaBaseWebView p0){
       this.a = p0;
       super();
    }
    public void onMainRenderFrameCreated(long p0){
       YodaBaseWebView$c uoc = YodaBaseWebView$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "1")) {
          return;
       }
       super.onMainRenderFrameCreated(p0);
       this.a.getSessionPageInfoModule().e().mainRenderFrameCreatedTime = Long.valueOf(p0);
       return;
    }
}
