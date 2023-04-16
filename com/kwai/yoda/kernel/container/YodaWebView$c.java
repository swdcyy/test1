package com.kwai.yoda.kernel.container.YodaWebView$c;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sy7.b;
import java.lang.StringBuilder;

public final class YodaWebView$c implements ValueCallback	// class@00128d
{
    public static final YodaWebView$c a;

    static {
       YodaWebView$c.a = new YodaWebView$c();
    }
    public void YodaWebView$c(){
       super();
    }
    public void onReceiveValue(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebView$c.class, "1")) {
       }else {
          b.b.g("evaluate js received callback - "+p0);
       }
       return;
    }
}
