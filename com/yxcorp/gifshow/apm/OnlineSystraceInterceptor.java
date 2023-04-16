package com.yxcorp.gifshow.apm.OnlineSystraceInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.apm.OnlineSystraceInterceptor$a;
import com.yxcorp.gifshow.apm.OnlineSystraceInterceptor$b;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import java.lang.StringBuilder;
import okhttp3.HttpUrl;
import wkd.b;
import com.yxcorp.gifshow.OnlineSystraceManager;

public class OnlineSystraceInterceptor implements Interceptor	// class@001b8c
{
    public Boolean a;

    public void OnlineSystraceInterceptor(){
       super();
       this.a = Boolean.FALSE;
    }
    public void OnlineSystraceInterceptor(OnlineSystraceInterceptor$a p0){
       super();
    }
    public static OnlineSystraceInterceptor a(){
       return OnlineSystraceInterceptor$b.a;
    }
    public Response intercept(Interceptor$Chain p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OnlineSystraceInterceptor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.a.booleanValue()) {
          return p0.proceed(p0.request());
       }
       b.a(-2022051331).d("KSOS_URL_"+p0.request().url());
       b.a(-2022051331).c();
       return p0.proceed(p0.request());
    }
}
