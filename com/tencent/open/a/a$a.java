package com.tencent.open.a.a$a;
import okhttp3.Interceptor;
import java.lang.String;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.Request$Builder;

public class a$a implements Interceptor	// class@000f3b
{
    public final String a;

    public void a$a(String p0){
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       return p0.proceed(p0.request().newBuilder().header("User-Agent", this.a).build());
    }
}
