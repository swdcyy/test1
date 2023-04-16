package com.yxcorp.retrofit.throttling.v2.ThrottlingInterceptorV2;
import okhttp3.Interceptor;
import java.lang.Object;
import com.yxcorp.retrofit.throttling.v2.ThrottlingInterceptorV2$a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import java.lang.String;
import com.yxcorp.retrofit.throttling.v2.b;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.retrofit.throttling.v2.b$c;
import android.os.SystemClock;
import com.yxcorp.retrofit.throttling.v2.b$d;
import mjd.a;
import ja0.a;

public class ThrottlingInterceptorV2 implements Interceptor	// class@0013ec
{
    public ThrottlingInterceptorV2$a a;

    public void ThrottlingInterceptorV2(){
       super();
    }
    public void ThrottlingInterceptorV2(ThrottlingInterceptorV2$a p0){
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       String path = p0.request().url().url().getPath();
       ThrottlingInterceptorV2 ta = this.a;
       if (ta != null) {
          path = ta.a(path);
       }
       b$c uoc = b.a().a.get(path);
       b$d uod = (uoc != null && uoc.a - SystemClock.elapsedRealtime() > 0)? new b$d(true, uoc.b): new b$d(false, "");
       if (uod.a != null) {
          a.c("ThrottlingInterceptorV2", "Throttled, return FakeResponse");
          return a.a(p0.request(), -997, uod.b);
       }else {
          return p0.proceed(p0.request());
       }
    }
}
