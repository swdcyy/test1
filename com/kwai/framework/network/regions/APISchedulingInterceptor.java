package com.kwai.framework.network.regions.APISchedulingInterceptor;
import okhttp3.Interceptor;
import lkd.b;
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
import java.net.URL;
import com.kwai.framework.model.router.RouteType;
import jb6.b;
import o56.c;
import o56.a;
import xf6.l;
import com.google.common.base.Optional;
import pjd.c;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import okhttp3.HttpUrl$Builder;
import qjd.a;
import com.yxcorp.retrofit.idc.models.Host;
import com.yxcorp.retrofit.model.Region;
import okhttp3.Request$Builder;
import ujd.d;
import retrofit2.HttpException;
import okhttp3.ResponseBody;
import retrofit2.p;
import java.lang.Exception;
import hjd.a;
import com.yxcorp.retrofit.model.RetrofitException;

public class APISchedulingInterceptor implements Interceptor	// class@00180c
{
    public final b a;
    public final o b;

    public void APISchedulingInterceptor(b p0,o p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Response intercept(Interceptor$Chain p0){
       Host host;
       Exception uException;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, APISchedulingInterceptor.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.request();
       String path = p0.request().url().url().getPath();
       RouteType routeType = b.c(obj.url().host());
       APISchedulingInterceptor uAPIScheduli = (!a.a().c() || l.c("enable_api_region_scheduling", false))? 1: null;
       Optional optional = Optional.absent();
       if (uAPIScheduli) {
          optional = this.a.get().b(path);
       }
       String str = "";
       if (optional.isPresent() && routeType != null) {
          Object[] objArray = new Object[false];
          c.C().w("APIScheduling", "Switch API host due to region scheduling info: "+obj.url().url(), objArray);
          HttpUrl$Builder uBuilder = obj.url().newBuilder();
          Object[] objArray1 = new Object[false];
          c.C().w("APIScheduling", "Replace from host : "+obj.url().host()+" to "+optional.get().b(), objArray1);
          host = optional.get().b();
          uBuilder.host(host.mHost);
          if (host.mIsHttps != null) {
             uBuilder.scheme("https");
             objArray = new Object[false];
             c.C().w("APIScheduling", "Scheme is https", objArray);
          }else {
             uBuilder.scheme("http");
             objArray = new Object[false];
             c.C().w("APIScheduling", "Scheme is http", objArray);
          }
          obj = d.b(obj.newBuilder().url(uBuilder.build()).tag(Region.class, new Region(str, optional.get().e(), str)).build(), "route-type", routeType);
       }
       try{
          Response response = PatchProxy.applyThreeRefs(p0, obj, optional, this, APISchedulingInterceptor.class, "2");
          if (response != patchProxyRe) {
          }else {
             try{
                response = p0.proceed(obj);
                response.code();
                try{
                   response.header("Expires");
                   if (!response.isSuccessful()) {
                      throw new HttpException(p.c(response.body(), response));
                   }
                }catch(java.lang.Exception e2){
                }
             }catch(java.lang.Exception e15){
                uException = e15;
                i = 0;
             }
             if (this.b.apply(a.a(uException, i))) {
                a uoa = optional.get();
                optional.get().f();
                Object[] objArray2 = new Object[false];
                c.C().w("APIScheduling", uoa.a()+", "+uoa.e()+" switch to next host: "+uoa.b(), objArray2);
             }
          }
          return response;
       }catch(java.lang.Exception e2){
          str = "Expires";
       }
       if (optional.isPresent() && this.b.apply(a.a(uException, i))) {
          goto label_016f ;
       }
       if (uException instanceof RetrofitException) {
          throw uException;
       }else {
          throw new RetrofitException(uException, obj, i, str);
       }
    }
}
