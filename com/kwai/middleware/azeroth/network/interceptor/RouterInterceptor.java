package com.kwai.middleware.azeroth.network.interceptor.RouterInterceptor;
import okhttp3.Interceptor;
import x97.j;
import x97.l;
import java.lang.Object;
import ca7.v;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import java.util.Map;
import java.lang.String;
import java.lang.CharSequence;
import ca7.u;
import android.net.Uri;
import okhttp3.HttpUrl;
import okhttp3.Request$Builder;
import okhttp3.HttpUrl$Builder;
import java.lang.Throwable;
import com.kwai.middleware.azeroth.network.interceptor.a;

public class RouterInterceptor implements Interceptor	// class@000d62
{
    public l a;

    public void RouterInterceptor(){
       super(new j());
    }
    public void RouterInterceptor(l p0){
       super();
       v.b(p0);
       this.a = p0;
    }
    public Response intercept(Interceptor$Chain p0){
       Uri uri;
       String str1;
       Response response;
       Throwable throwable;
       Request request = p0.request();
       String str = "X-SPECIAL-HOST";
       String obj = request.tag();
       if (obj instanceof Map) {
          try{
             str = obj.get(str);
             if (str != null) {
             }
          }catch(java.lang.Exception e0){
          }
       }
       str = "";
    }
}
