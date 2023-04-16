package com.yxcorp.gifshow.webview.yoda.utils.b;
import xz7.c;
import java.lang.Object;
import t97.b;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import com.kuaishou.aegon.okhttp.CronetInterceptor;
import com.kwai.framework.model.router.RouteType;
import java.lang.String;
import hyc.a;
import okhttp3.Interceptor;

public final class b implements c	// class@0017ca
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       CronetInterceptor uCronetInter = new CronetInterceptor(RouteType.ZT.mName);
       uCronetInter.a = new a();
       p0.a(uCronetInter);
    }
}
