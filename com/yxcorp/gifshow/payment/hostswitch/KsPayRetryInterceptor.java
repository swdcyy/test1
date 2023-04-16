package com.yxcorp.gifshow.payment.hostswitch.KsPayRetryInterceptor;
import okhttp3.Interceptor;
import ok.o;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.Request;
import com.yxcorp.retrofit.model.RetrofitException;
import java.lang.Exception;
import hjd.a;

public class KsPayRetryInterceptor implements Interceptor	// class@000e44
{
    public final o a;

    public void KsPayRetryInterceptor(o p0){
       super();
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       Request obj = PatchProxy.applyOneRefs(p0, this, KsPayRetryInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       try{
          return p0.proceed(obj);
       }catch(java.lang.Exception e1){
          if (e1 instanceof RetrofitException && this.a.apply(a.a(e1, e1.mResponseCode))) {
             return p0.proceed(obj);
          }
          throw e1;
       }
    }
}
