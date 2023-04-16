package com.yxcorp.retrofit.timing.LoggedInterceptorWrapper;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.System;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.EventListener;
import tjd.b;
import java.lang.Class;
import java.lang.String;
import okhttp3.Call;
import tjd.a;

public class LoggedInterceptorWrapper implements Interceptor	// class@000986
{
    public final Interceptor a;
    public final int b;

    public void LoggedInterceptorWrapper(Interceptor p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Response intercept(Interceptor$Chain p0){
       long l = System.currentTimeMillis();
       Response response = this.a.intercept(p0);
       long l1 = System.currentTimeMillis();
       EventListener uEventListen = p0.eventListener();
       if (uEventListen instanceof b) {
          uEventListen.d(p0.call(), new a(this.a.getClass().getSimpleName(), this.b, (l1 - l)));
       }
       return response;
    }
}
