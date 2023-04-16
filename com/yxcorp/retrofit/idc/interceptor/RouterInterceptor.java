package com.yxcorp.retrofit.idc.interceptor.RouterInterceptor;
import okhttp3.Interceptor;
import fjd.b;
import ok.o;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.String;
import jjd.b;
import okhttp3.HttpUrl$Builder;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import mjd.a;
import okhttp3.Request$Builder;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import ujd.d;
import retrofit2.HttpException;
import okhttp3.ResponseBody;
import retrofit2.p;
import java.lang.Exception;
import hjd.a;
import com.yxcorp.retrofit.model.RetrofitException;

public class RouterInterceptor implements Interceptor	// class@00096e
{
    public final b a;
    public final o b;

    public void RouterInterceptor(b p0,o p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Response intercept(Interceptor$Chain p0){
       Host host;
       Request request = p0.request();
       String str = request.url().host();
       b type = this.a.getType(str);
       if (type != null) {
          str = "X-SPECIAL-HOST";
          String str1 = request.header(str);
          HttpUrl$Builder uBuilder = request.url().newBuilder();
          host = this.a.c(type.getName());
          if (!TextUtils.isEmpty(str1)) {
             uBuilder.host(str1);
             a.c("RouterInterceptor", "Hit special host:"+str1);
          }else if(host != null){
             a.c("RouterInterceptor", "Router replace host from "+request.url().host()+" to "+host.mHost);
             uBuilder.host(host.mHost);
             str1 = (host.mIsHttps != null)? "https": "http";
             uBuilder.scheme(str1);
          }else {
             a.b("RouterInterceptor", "Get null host with RouterType: "+type.getName());
          label_00d2 :
             request = d.b(request, "route-type", type);
          }
          if (this.a.b(type.getName())) {
             uBuilder.scheme("http");
          }
          request = request.newBuilder().headers(request.headers().newBuilder().removeAll(str).build()).url(uBuilder.build()).build();
          goto label_00d2 ;
       }else {
          a.b("RouterInterceptor", "Request:"+str+" does not match .mock-host.com, router can not switch host");
       }
       int i = 0;
       try{
          Response response = p0.proceed(request);
          i = response.code();
          response.header("Expires");
          if (response.isSuccessful()) {
             return response;
          }else {
             a.c("RouterInterceptor", "Response error, code = "+i);
             throw new HttpException(p.c(response.body(), response));
          }
       }catch(java.lang.Exception e10){
          if (type && this.b.apply(a.a(e10, i))) {
             this.a.f(type.getName(), new Host(request.url().host(), request.url().isHttps()));
             a.c("RouterInterceptor", "RouteType "+type.getName()+"switch to next host: "+this.a.c(type.getName()));
          }
          throw new RetrofitException(e10, request, i, "");
       }
    }
}
