package com.yxcorp.gifshow.webview.yoda.utils.e;
import erd.g;
import java.lang.Object;
import zf6.h;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import com.kwai.yoda.event.d;
import nyc.a;
import java.lang.String;
import yz7.e;
import com.kwai.yoda.bridge.YodaBaseWebView;

public final class e implements g	// class@0017cd
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       d.f().c(null, "darkModeChanged", e.f(new a(p0.a)));
    }
}
