package com.yxcorp.retrofit.region.APISchedulingInterceptor;
import okhttp3.Interceptor;
import pjd.c;
import ok.o;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import java.lang.String;
import com.yxcorp.retrofit.idc.c;
import jjd.b;
import com.google.common.base.Optional;
import okhttp3.HttpUrl$Builder;
import java.lang.StringBuilder;
import qjd.a;
import com.yxcorp.retrofit.idc.models.Host;
import mjd.a;
import com.yxcorp.retrofit.model.Region;
import okhttp3.Request$Builder;
import java.lang.Class;
import ujd.d;
import retrofit2.HttpException;
import okhttp3.ResponseBody;
import retrofit2.p;
import java.lang.Exception;
import hjd.a;
import com.yxcorp.retrofit.model.RetrofitException;

public class APISchedulingInterceptor implements Interceptor	// class@00097c
{
    public final c a;
    public final o b;

    public void APISchedulingInterceptor(c p0,o p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Response intercept(Interceptor$Chain p0){
       Host host;
       Request request = p0.request();
       String path = p0.request().url().url().getPath();
       b type = c.n().getType(request.url().host());
       Optional optional = Optional.absent();
       if (this.a.a()) {
          optional = this.a.b(path);
       }
       String str = "";
       if (optional.isPresent() && type != null) {
          HttpUrl$Builder uBuilder = request.url().newBuilder();
          a.c("APISchedulingInterceptor", "Schedule replace from host : "+request.url().host()+" to "+optional.get().b());
          host = optional.get().b();
          uBuilder.host(host.mHost);
          if (host.mIsHttps != null) {
             uBuilder.scheme("https");
             a.c("APISchedulingInterceptor", "Scheme is https");
          }else {
             uBuilder.scheme("http");
             a.c("APISchedulingInterceptor", "Scheme is http");
          }
          request = d.b(request.newBuilder().url(uBuilder.build()).tag(Region.class, new Region(str, optional.get().e(), str)).build(), "route-type", type);
       }
       int i = 0;
       try{
          Response response = p0.proceed(request);
          i = response.code();
          response.header("Expires");
          if (response.isSuccessful()) {
             return response;
          }else {
             a.c("APISchedulingInterceptor", "Response error, code = "+i);
             throw new HttpException(p.c(response.body(), response));
          }
       }catch(java.lang.Exception e9){
          if (optional.isPresent() && this.b.apply(a.a(e9, i))) {
             a uoa = optional.get();
             optional.get().f();
             a.c("APISchedulingInterceptor", uoa.a()+", "+uoa.e()+" switch to next host: "+uoa.b());
          }
          if (e9 instanceof RetrofitException) {
             throw e9;
          }else {
             throw new RetrofitException(e9, request, i, str);
          }
       }
    }
}
