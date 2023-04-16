package com.yxcorp.retrofit.interceptor.HeaderInterceptor;
import okhttp3.Interceptor;
import com.yxcorp.retrofit.c$a;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.util.Map;
import okhttp3.Request;
import com.yxcorp.retrofit.e;
import okhttp3.HttpUrl;
import java.lang.String;
import java.lang.StringBuilder;
import mjd.a;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import okhttp3.Request$Builder;
import com.yxcorp.retrofit.dryrun.CommonParamsCompareManager$Type;
import com.yxcorp.retrofit.dryrun.a;

public class HeaderInterceptor implements Interceptor	// class@000972
{
    public final c$a a;
    public final boolean b;
    public final boolean c;

    public void HeaderInterceptor(c$a p0){
       super(p0, false, false);
    }
    public void HeaderInterceptor(c$a p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public Response intercept(Interceptor$Chain p0){
       Map map = this.a.a();
       Request request = p0.request();
       boolean b = (this.c == null && e.h().c(request.url().encodedPath()))? true: false;
       a.a("HeaderInterceptor", "enableNewCommonParams:"+this.b+" enableDryRun:"+b);
       if (!b && this.b != null) {
          return p0.proceed(request);
       }else {
          Headers$Builder uBuilder = request.headers().newBuilder();
          Iterator iterator = map.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             uBuilder.add(key, uEntry.getValue());
          }
          return a.b(p0, request, request.newBuilder().headers(uBuilder.build()).build(), b, this.b, CommonParamsCompareManager$Type.REQUEST_HEADERS);
       }
    }
}
