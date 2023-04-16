package com.yxcorp.gifshow.ad.service.neo.NeoVideoResponseInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import okhttp3.Request;
import com.kwai.sdk.switchconfig.a;
import g59.k;
import okhttp3.HttpUrl;
import java.net.URL;
import o49.g;
import java.util.Objects;
import okhttp3.ResponseBody;
import okio.d;
import okio.b;
import okhttp3.MediaType;
import java.nio.charset.Charset;
import java.lang.Throwable;
import yx.j0;
import android.util.LruCache;

public final class NeoVideoResponseInterceptor implements Interceptor	// class@0017f9
{

    public void NeoVideoResponseInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       g a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, NeoVideoResponseInterceptor.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "chain");
       obj = p0.request();
       Response response = p0.proceed(p0.request());
       if (!a.t().d("disableAdSaveResponse", false)) {
          k b = k.b;
          URL uRL = obj.url().url();
          a.o(uRL, "request.url\(\).url\(\)");
          String path = uRL.getPath();
          a.o(path, "request.url\(\).url\(\).path");
          a = g.a;
          Objects.requireNonNull(a);
          ResponseBody obj1 = PatchProxy.applyOneRefs(response, a, g.class, "4");
          String str = "";
          if (obj1 != patchProxyRe) {
             str = obj1;
          }else if(response != null){
             ResponseBody responseBody = response.body();
             if (responseBody != null) {
                d uod = responseBody.source();
                if (uod != null) {
                   uod.request(Long.MAX_VALUE);
                   b uob = uod.buffer();
                   obj1 = response.body();
                   if (obj1 != null) {
                      MediaType mediaType = obj1.contentType();
                      if (mediaType != null) {
                         a.o(mediaType, "response.body\(\)?.contentType\(\) ?: return \"\"");
                         Charset uCharset = mediaType.charset();
                         if (uCharset == null) {
                            uCharset = Charset.forName("UTF-8");
                         }
                         a.o(uCharset, "charset");
                         str = uob.c().readString(uCharset);
                      }
                   }
                }
             }
          }
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidTwoRefs(path, str, b, k.class, "1")) {
             a.p(path, "key");
             a.p(str, "value");
             k.a.put(path, str);
          }
       }
       a.o(response, "response");
       return response;
    }
}
