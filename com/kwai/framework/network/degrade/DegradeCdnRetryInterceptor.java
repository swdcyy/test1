package com.kwai.framework.network.degrade.DegradeCdnRetryInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.framework.network.degrade.g;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.Number;
import java.lang.Math;
import retrofit2.HttpException;
import okhttp3.ResponseBody;
import retrofit2.p;
import java.lang.Thread;
import java.lang.InterruptedException;
import okhttp3.Request$Builder;
import okhttp3.OkHttpBridge;
import android.net.Uri;
import ekd.w0;
import java.lang.CharSequence;
import java.lang.Exception;
import com.yxcorp.retrofit.model.RetrofitException;

public class DegradeCdnRetryInterceptor implements Interceptor	// class@0017b2
{

    public void DegradeCdnRetryInterceptor(){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       int i3;
       Request obj = PatchProxy.applyOneRefs(p0, this, DegradeCdnRetryInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.request();
       String str = obj.url().toString();
       if (str.startsWith("http://ali.static.yximgs.com/degradation/config/fallbackable2CdnConfig?v=") || str.startsWith("http://tx.static.yximgs.com/degradation/config/fallbackable2CdnConfig?v=")) {
          return p0.proceed(obj);
       }
       int i = 3;
       g og = g.i();
       _monitor_enter(og);
       String obj1 = PatchProxy.apply(null, og, g.class, "8");
       int i1 = (obj1 != PatchProxyResult.class)? obj1.intValue(): og.g();
       _monitor_exit(og);
       i = Math.min(i, i1);
       int i2 = 404;
       obj1 = "";
       Object[] objArray = null;
    label_0054 :
       if (0 < i) {
          try{
             Response response = p0.proceed(obj);
             response.code();
             response.header("Expires");
             if (response.isSuccessful()) {
                return response;
             }else {
                throw new HttpException(p.c(response.body(), response));
             }
          }catch(java.lang.Exception e10){
             long l = 1000;
             try{
                Thread.sleep(l);
             }catch(java.lang.InterruptedException e11){
                e11.printStackTrace();
             }
             g og1 = g.i();
             _monitor_enter(og1);
             if (PatchProxy.applyVoid(null, og1, g.class, "10")) {
                _monitor_exit(og1);
             }else {
                g b = og1.b;
                if (b != -1) {
                   int i4 = b + 1;
                   i4 = i4 % og1.g();
                   og1.b = i4;
                }
                _monitor_exit(og1);
             }
             Request$Builder obj2 = PatchProxy.applyTwoRefs(obj, str, this, DegradeCdnRetryInterceptor.class, "2");
             if (obj2 != PatchProxyResult.class) {
                obj = obj2;
             }else {
                try{
                   obj2 = OkHttpBridge.requestBuilder(obj);
                   obj2.url(str.replace(w0.f(str).getHost(), g.i().f()));
                   obj = obj2.build();
                }catch(java.lang.Exception e11){
                   e11.printStackTrace();
                }
             }
          }
       }else {
          throw new RetrofitException(objArray, obj, i2, obj1);
       }
    }
}
