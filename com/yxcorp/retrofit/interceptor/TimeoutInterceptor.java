package com.yxcorp.retrofit.interceptor.TimeoutInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Request;
import java.lang.String;
import java.lang.Integer;
import java.lang.Long;
import com.google.common.primitives.Longs;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import java.util.concurrent.TimeUnit;
import okhttp3.Request$Builder;

public class TimeoutInterceptor implements Interceptor	// class@000974
{

    public void TimeoutInterceptor(){
       super();
    }
    public final Integer a(Request p0,String p1){
       String str = p0.header(p1);
       Integer integer = null;
       if (str == null) {
          return integer;
       }
       Long longx = Longs.d(str.trim(), 10);
       if (longx != null && !longx.longValue() - (long)longx.intValue()) {
          integer = Integer.valueOf(longx.intValue());
       }
       return integer;
    }
    public Response intercept(Interceptor$Chain p0){
       Request request = p0.request();
       Headers$Builder uBuilder = request.headers().newBuilder();
       String str = "connectionTimeout";
       Integer integer = this.a(request, str);
       if (integer != null) {
          p0 = p0.withConnectTimeout(integer.intValue(), TimeUnit.MILLISECONDS);
          uBuilder.removeAll(str);
       }
       str = "writeTimeout";
       integer = this.a(request, str);
       if (integer != null) {
          p0 = p0.withWriteTimeout(integer.intValue(), TimeUnit.MILLISECONDS);
          uBuilder.removeAll(str);
       }
       integer = this.a(request, "readTimeout");
       if (integer != null) {
          p0 = p0.withReadTimeout(integer.intValue(), TimeUnit.MILLISECONDS);
          uBuilder.removeAll("readTimeout");
       }
       return p0.proceed(request.newBuilder().headers(uBuilder.build()).build());
    }
}
