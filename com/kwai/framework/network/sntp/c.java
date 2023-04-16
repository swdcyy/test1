package com.kwai.framework.network.sntp.c;
import javax.inject.Provider;
import java.lang.Object;
import com.kwai.framework.network.sntp.d;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import com.yxcorp.retrofit.interceptor.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public final class c implements Provider	// class@000c53
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       OkHttpClient$Builder uBuilder = new OkHttpClient$Builder();
       TimeUnit mILLISECONDS = TimeUnit.MILLISECONDS;
       uBuilder.connectTimeout(6000, mILLISECONDS);
       uBuilder.readTimeout(6000, mILLISECONDS);
       uBuilder.addInterceptor(new ConvertToIOExceptionInterceptor());
       return uBuilder.build();
    }
}
