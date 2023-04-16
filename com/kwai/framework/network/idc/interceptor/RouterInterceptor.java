package com.kwai.framework.network.idc.interceptor.RouterInterceptor;
import okhttp3.Interceptor;
import ok.o;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import okhttp3.HttpUrl;
import com.kwai.framework.model.router.RouteType;
import jb6.b;
import okhttp3.HttpUrl$Builder;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import android.text.TextUtils;
import okhttp3.Request$Builder;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import ujd.d;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import retrofit2.HttpException;
import okhttp3.ResponseBody;
import retrofit2.p;
import java.lang.Exception;
import hjd.a;
import com.yxcorp.retrofit.model.RetrofitException;

public class RouterInterceptor implements Interceptor	// class@0017cd
{
    public final o a;

    public void RouterInterceptor(o p0){
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       String str1;
       Host host;
       RouterInterceptor routerInterc = RouterInterceptor.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, routerInterc, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.request();
       String str = obj.url().host();
       RouteType routeType = b.c(str);
       int i = 0;
       if (routeType != null) {
          Request request = PatchProxy.applyTwoRefs(obj, routeType, this, routerInterc, "2");
          if (request != patchProxyRe) {
          }else {
             str1 = "X-SPECIAL-HOST";
             str = obj.header(str1);
             HttpUrl$Builder uBuilder = obj.url().newBuilder();
             host = d.a().c(routeType.mName);
             String str2 = "http";
             if (!TextUtils.isEmpty(str)) {
                uBuilder.host(str);
             }else if(host != null){
                uBuilder.host(host.mHost);
                str = (host.mIsHttps != null)? "https": str2;
                uBuilder.scheme(str);
             }else {
             label_0096 :
                request = obj;
             }
             if (d.a().b(routeType.mName)) {
                uBuilder.scheme(str2);
             }
             obj = obj.newBuilder().headers(obj.headers().newBuilder().removeAll(str1).build()).url(uBuilder.build()).build();
             goto label_0096 ;
          }
          obj = d.b(request, "route-type", routeType);
       }else {
          Object[] objArray = new Object[i];
          c.C().A("RouterInterceptor", "Request:"+str+" does not match .mock-host.com, router can not switch host", objArray);
       }
       try{
          Response response = PatchProxy.applyThreeRefs(p0, obj, routeType, this, RouterInterceptor.class, "3");
          if (response != patchProxyRe) {
          }else {
             str1 = "";
             Response response1 = p0.proceed(obj);
             response1.code();
             str1 = response1.header("Expires");
             if (response1.isSuccessful()) {
                response = response1;
             }else {
                throw new HttpException(p.c(response1.body(), response1));
             }
          }
          return response;
       }catch(java.lang.Exception e13){
          if (routeType && this.a.apply(a.a(e13, i))) {
             d.a().f(routeType.mName, new Host(obj.url().host(), obj.url().isHttps()));
          }
          throw new RetrofitException(e13, obj, i, str1);
       }
    }
}
