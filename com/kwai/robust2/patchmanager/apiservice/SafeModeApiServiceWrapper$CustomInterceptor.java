package com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper$CustomInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper$a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import okhttp3.Request;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import java.lang.String;
import com.kwai.robust2.patchmanager.c;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import okhttp3.Request$Builder;

public class SafeModeApiServiceWrapper$CustomInterceptor implements Interceptor	// class@00141a
{

    public void SafeModeApiServiceWrapper$CustomInterceptor(){
       super();
    }
    public void SafeModeApiServiceWrapper$CustomInterceptor(SafeModeApiServiceWrapper$a p0){
       super();
    }
    public Response intercept(Interceptor$Chain p0){
       Request request = p0.request();
       HttpUrl$Builder uBuilder = request.url().newBuilder().scheme(request.url().scheme()).host(request.url().host());
       Iterator iterator = c.a().d.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          uBuilder.addQueryParameter(key, uEntry.getValue());
       }
       return p0.proceed(request.newBuilder().url(uBuilder.build()).build());
    }
}
