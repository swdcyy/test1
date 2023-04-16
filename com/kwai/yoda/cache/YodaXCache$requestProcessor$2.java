package com.kwai.yoda.cache.YodaXCache$requestProcessor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.request.YodaWebRequestProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.bridge.YodaBaseWebView;

public final class YodaXCache$requestProcessor$2 extends Lambda implements a	// class@0011a4
{
    public static final YodaXCache$requestProcessor$2 INSTANCE;

    static {
       YodaXCache$requestProcessor$2.INSTANCE = new YodaXCache$requestProcessor$2();
    }
    public void YodaXCache$requestProcessor$2(){
       super(0);
    }
    public final YodaWebRequestProcessor invoke(){
       Object obj = PatchProxy.apply(null, this, YodaXCache$requestProcessor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new YodaWebRequestProcessor(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
