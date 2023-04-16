package com.kwai.yoda.api.YodaApi$webProxy$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.api.YodaApi;
import java.lang.Object;
import t97.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Long;
import t97.b;
import okhttp3.Cache;
import java.io.File;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import kotlin.jvm.internal.a;
import okhttp3.Interceptor;
import okhttp3.internal.http.BridgeInterceptor;
import qx7.a;
import okhttp3.CookieJar;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.WebInternalCache;
import okhttp3.internal.cache.InternalCache;
import com.kwai.yoda.api.CronetCacheInterceptor;
import com.kwai.yoda.api.CronetBridgeInterceptor;
import xz7.c;
import w97.a;
import com.kwai.yoda.Yoda;
import u97.g;

public final class YodaApi$webProxy$2 extends Lambda implements a	// class@00116f
{
    public final YodaApi this$0;

    public void YodaApi$webProxy$2(YodaApi p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       a uoa;
       YodaApi b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       YodaApi$webProxy$2 obj = PatchProxy.apply(objArray, this, YodaApi$webProxy$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.this$0;
       long l = 0x7530;
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(YodaApi.class)) {
          uoa = PatchProxy.applyOneRefs(Long.valueOf(l), obj, YodaApi.class, "5");
          if (uoa != patchProxyRe) {
          label_0102 :
             return uoa;
          }
       }
       b uob = new b("Yoda");
       uob.p = false;
       uob.o = 0;
       uob.e(false);
       uob.d(false);
       uob.s = l;
       if (PatchProxy.applyOneRefs(uob, obj, YodaApi.class, "6") != patchProxyRe) {
       }else {
          Cache uCache = new Cache(new File(Azeroth2.B.d().getFilesDir(), "yoda_web_cache"), 0x3200000);
          if (obj.d != null) {
             OkHttpClient okHttpClient = PatchProxy.apply(objArray, obj, YodaApi.class, "7");
             if (okHttpClient != patchProxyRe) {
             }else {
                okHttpClient = new OkHttpClient$Builder().retryOnConnectionFailure(false).build();
                a.h(okHttpClient, "OkHttpClient.Builder\(\).r¡­ionFailure\(false\).build\(\)");
             }
             uob.a(new RetryAndFollowUpInterceptor(okHttpClient, false));
             uob.a(new BridgeInterceptor(obj.b()));
             uob.a(new CacheInterceptor(new WebInternalCache(uCache)));
             uob.a(new CronetCacheInterceptor());
             uob.a(new CronetBridgeInterceptor());
          }else {
             a.q(uCache, "cache");
             uob.x = uCache;
             uob.t = obj.b();
          }
          b = obj.f;
          if (b != null) {
             b.accept(uob);
          }
       }
       uob.c(false);
       b = obj.b;
       if (b != null) {
          uob.c(true);
          uob.g(b);
       }
       b = obj.a;
       if (b != null) {
          a.q(b, "dns");
          uob.u = b;
       }
       b = obj.c;
       if (b != null) {
          Yoda yoda = Yoda.get();
          a.h(yoda, "Yoda.get\(\)");
          if (yoda.isDebugMode()) {
             uob.k(b);
          }
       }
       uoa = uob.b();
       goto label_0102 ;
    }
}
