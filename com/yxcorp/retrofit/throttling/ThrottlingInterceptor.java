package com.yxcorp.retrofit.throttling.ThrottlingInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.net.URL;
import java.lang.String;
import sjd.b;
import java.util.Map;
import sjd.a;
import java.lang.System;
import java.lang.StringBuilder;
import mjd.a;
import java.lang.Thread;

public class ThrottlingInterceptor implements Interceptor	// class@0013e9
{

    public void ThrottlingInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       b uob = b.a();
       _monitor_enter(uob);
       a uoa = uob.a.remove(p0.request().url().url().getPath());
       _monitor_exit(uob);
       if (uoa != null && (uoa.a - System.currentTimeMillis() > 0 && uoa.b - null > 0)) {
          a.c("ThrottlingInterceptor", "Thread sleep "+uoa.b+"ms");
          Thread.sleep(uoa.b);
       }
    label_0054 :
       return p0.proceed(p0.request());
    }
}
