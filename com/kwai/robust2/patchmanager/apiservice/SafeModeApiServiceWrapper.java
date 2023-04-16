package com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper;
import qm7.a;
import java.util.Random;
import java.lang.Object;
import retrofit2.q$b;
import java.lang.String;
import cyd.a;
import retrofit2.h$a;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.b$a;
import okhttp3.OkHttpClient$Builder;
import com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper$CustomInterceptor;
import com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper$a;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.q;
import com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper$b;
import java.lang.Class;

public class SafeModeApiServiceWrapper implements a	// class@00141d
{
    public final SafeModeApiServiceWrapper$b a;
    public static final String b;
    public static final SafeModeApiServiceWrapper c;

    static {
       String str = (new Random().nextBoolean())? "https://api.kuaishouzt.com": "https://api.kwaizt.com";
       SafeModeApiServiceWrapper.b = str;
       SafeModeApiServiceWrapper.c = new SafeModeApiServiceWrapper();
    }
    public void SafeModeApiServiceWrapper(){
       super();
       q$b uob = new q$b();
       uob.c(SafeModeApiServiceWrapper.b);
       uob.b(a.a());
       uob.a(RxJava2CallAdapterFactory.create());
       OkHttpClient$Builder uBuilder = new OkHttpClient$Builder();
       uBuilder.addInterceptor(new SafeModeApiServiceWrapper$CustomInterceptor(null));
       uob.e(uBuilder.build());
       this.a = uob.d().a(SafeModeApiServiceWrapper$b.class);
    }
    public SafeModeApiServiceWrapper$b a(){
       return this.a;
    }
    public Object get(){
       return this.a();
    }
}
