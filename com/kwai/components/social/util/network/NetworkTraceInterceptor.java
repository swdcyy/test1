package com.kwai.components.social.util.network.NetworkTraceInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import java.util.List;
import li5.a;
import java.util.Collection;
import ekd.q;
import okhttp3.HttpUrl;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import com.kwai.components.social.util.network.NetworkTrace;
import okhttp3.Request$Builder;

public class NetworkTraceInterceptor implements Interceptor	// class@000cdd
{
    public static String a = "X-Ref-Page";

    public void NetworkTraceInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, NetworkTraceInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       if (!q.f(a.b()) && a.b().contains(TextUtils.join("/", obj.url().pathSegments()))) {
          return p0.proceed(obj);
       }
       NetworkTrace networkTrace = obj.tag(NetworkTrace.class);
       if (networkTrace != null && !TextUtils.isEmpty(networkTrace.referInfo)) {
          obj = obj.newBuilder().addHeader(NetworkTraceInterceptor.a, networkTrace.referInfo).build();
       }
       return p0.proceed(obj);
    }
}
