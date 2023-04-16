package com.kwai.framework.logger.uploader.DebugLoggerInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import com.kwai.framework.logger.uploader.b;
import javax.inject.Provider;
import tpd.a;
import upd.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import o56.c;
import o56.a;
import w96.m;
import okhttp3.HttpUrl;
import java.net.URL;
import android.util.Pair;
import java.util.Set;
import aa6.c;
import w96.l;
import w96.d;
import java.lang.StringBuilder;
import q87.c;
import android.net.Uri;
import ekd.w0;
import okhttp3.HttpUrl$Builder;
import java.util.List;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import okhttp3.Request$Builder;
import okhttp3.OkHttpClient$Builder;
import okhttp3.OkHttpClient;
import okhttp3.Call;

public class DebugLoggerInterceptor implements Interceptor	// class@000b92
{
    public a a;

    public void DebugLoggerInterceptor(){
       super();
       this.a = a.a(b.a);
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, DebugLoggerInterceptor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       if (a.a().c() || m.a()) {
          String path = obj.url().url().getPath();
          int i = 0;
          String str = " to ";
          if (this.a.get().second.contains(path)) {
             c uoc = l.a();
             if (uoc != null) {
                Object[] objArray = new Object[i];
                d.C().w("DebugLoggerInterceptor", "duplicate Replace host from "+obj.url().host()+str+uoc.mHost, objArray);
                new OkHttpClient$Builder().build().newCall(obj.newBuilder().url(HttpUrl.parse(uoc.mHost).newBuilder().addPathSegments(TextUtils.join("/", w0.f(obj.url().url().toString()).getPathSegments())).build()).build()).execute();
             }
          }
          if (this.a.get().first.contains(path)) {
             c uoc1 = l.a();
             if (uoc1 != null) {
                Object[] objArray1 = new Object[i];
                d.C().w("DebugLoggerInterceptor", "Replace host from "+obj.url().host()+str+uoc1.mHost, objArray1);
                obj = obj.newBuilder().url(HttpUrl.parse(uoc1.mHost).newBuilder().addPathSegments(TextUtils.join("/", w0.f(obj.url().url().toString()).getPathSegments())).build()).build();
             }
          }
       }
    label_0136 :
       return p0.proceed(obj);
    }
}
