package com.kwai.framework.krn.init.network.RemoveSigInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.StringBuffer;
import okhttp3.Request$Builder;

public class RemoveSigInterceptor implements Interceptor	// class@0015e9
{

    public void RemoveSigInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RemoveSigInterceptor removeSigInt = RemoveSigInterceptor.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, removeSigInt, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.request();
       Request request = PatchProxy.applyOneRefs(obj, this, removeSigInt, "2");
       if (request != patchProxyRe) {
       }else {
          HttpUrl httpUrl = obj.url();
          String str = httpUrl.scheme();
          String str1 = httpUrl.host();
          StringBuffer str2 = str;
          request = obj.newBuilder().url(str2+"://"+str1+httpUrl.encodedPath()).build();
       }
       return p0.proceed(request);
    }
}
