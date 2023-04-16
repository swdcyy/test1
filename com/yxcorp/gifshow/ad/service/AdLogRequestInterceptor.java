package com.yxcorp.gifshow.ad.service.AdLogRequestInterceptor;
import okhttp3.Interceptor;
import com.yxcorp.gifshow.ad.service.AdLogRequestInterceptor$a;
import nsd.u;
import java.lang.Object;
import com.google.common.collect.ImmutableList;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import o56.c;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import com.kwai.sdk.switchconfig.a;
import xf6.l;
import okhttp3.HttpUrl;
import java.net.URL;
import okhttp3.Request$Builder;
import zsd.u;

public final class AdLogRequestInterceptor implements Interceptor	// class@0017f8
{
    public static final ImmutableList a;
    public static final AdLogRequestInterceptor$a b;

    static {
       AdLogRequestInterceptor.b = new AdLogRequestInterceptor$a(null);
       AdLogRequestInterceptor.a = ImmutableList.of("/rest/n/log/ad/photo/action", "/rest/nebula/log/ad/photo/action");
    }
    public void AdLogRequestInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, AdLogRequestInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "chain");
       obj = p0.request();
       if (obj == null) {
          return null;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (uoc.c() && (SystemUtil.K() && (a.t().d("adEnableReplaceHost", true) && l.c("adEnableLogHostReplace", true)))) {
          HttpUrl httpUrl = obj.url();
          URL uRL = httpUrl.url();
          a.o(uRL, "httpUrl.url\(\)");
          if (AdLogRequestInterceptor.a.contains(uRL.getPath())) {
             String str = httpUrl.host();
             if ((a.g("logger-v2-backend.corp.kuaishou.com", str) ^ true) && (a.g("ad-log-api.staging.kuaishou.com", str) ^ true)) {
                String str1 = obj.url().toString();
                a.o(str1, "request.url\(\).toString\(\)");
                a.o(str, "originHost");
                obj = obj.newBuilder().url(u.g2(str1, str, "ad-log-api.staging.kuaishou.com", false, 4, null)).build();
                a.o(obj, "request.newBuilder\(\).url¡­, LOG_TEST_HOST\)\).build\(\)");
             }
          }
       }
    label_009f :
       return p0.proceed(obj);
    }
}
