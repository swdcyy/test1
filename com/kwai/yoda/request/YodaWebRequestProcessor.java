package com.kwai.yoda.request.YodaWebRequestProcessor;
import com.kwai.yoda.request.YodaWebRequestProcessor$a;
import nsd.u;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import com.kwai.yoda.request.YodaWebRequestProcessor$mOfflineFileMatcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.yoda.request.YodaWebRequestProcessor$mYodaWebRequestClient$2;
import gz7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaWebRequestProcessor	// class@0012cf
{
    public final p a;
    public final p b;
    public final YodaBaseWebView c;
    public static final YodaWebRequestProcessor$a d;

    static {
       YodaWebRequestProcessor.d = new YodaWebRequestProcessor$a(null);
    }
    public void YodaWebRequestProcessor(YodaBaseWebView p0){
       super();
       this.c = p0;
       this.a = s.c(new YodaWebRequestProcessor$mOfflineFileMatcher$2(this));
       this.b = s.c(YodaWebRequestProcessor$mYodaWebRequestClient$2.INSTANCE);
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, YodaWebRequestProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final YodaBaseWebView b(){
       return this.c;
    }
}
