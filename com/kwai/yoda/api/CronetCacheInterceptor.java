package com.kwai.yoda.api.CronetCacheInterceptor;
import okhttp3.Interceptor;
import okhttp3.TlsVersion;
import okhttp3.CipherSuite;
import java.util.List;
import java.util.Collections;
import okhttp3.Handshake;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.Request;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.connection.RealConnection;
import okhttp3.Response$Builder;
import okhttp3.ResponseBody;

public class CronetCacheInterceptor implements Interceptor	// class@00116a
{
    public static final Handshake a;

    static {
       CronetCacheInterceptor.a = Handshake.get(TlsVersion.TLS_1_2, CipherSuite.TLS_RSA_WITH_NULL_MD5, Collections.emptyList(), Collections.emptyList());
    }
    public void CronetCacheInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CronetCacheInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Response response = p0.proceed(p0.request(), p0.streamAllocation(), null, null);
       if (response.networkResponse() != null) {
          response = response.networkResponse().newBuilder().body(response.body()).handshake(CronetCacheInterceptor.a).build();
       }
       return response;
    }
}
