package com.yxcorp.retrofit.e;
import java.lang.Object;
import com.yxcorp.retrofit.e$a;
import com.yxcorp.retrofit.a;
import retrofit2.q;
import retrofit2.q$b;
import dyd.a;
import retrofit2.h$a;
import com.google.gson.Gson;
import com.yxcorp.retrofit.c;
import cyd.a;
import djd.a;
import yid.g;
import retrofit2.b$a;
import java.lang.String;
import okhttp3.OkHttpClient;
import yid.h;
import brd.z;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import java.lang.Class;
import ejd.c;
import ejd.c$a;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import ejd.b;
import android.os.Handler;
import ekd.s1;
import java.lang.Runnable;
import com.yxcorp.retrofit.e$b;
import com.yxcorp.retrofit.d;
import android.content.Context;

public class e	// class@0013c9
{
    public d a;

    public void e(){
       super();
    }
    public void e(e$a p0){
       super();
    }
    public static q a(a p0){
       b$a a;
       q$b uob = new q$b();
       uob.b(a.a());
       uob.b(a.b(p0.buildGson()));
       uob.b(new a());
       uob.a(new g(p0));
       uob.c(p0.buildBaseUrl());
       uob.e(p0.buildClient());
       a = h.a;
       if (a == null) {
          if (p0.getExecuteScheduler() != null) {
             uob.a(RxJava2CallAdapterFactory.createWithScheduler(p0.getExecuteScheduler()));
          }else {
             uob.a(RxJava2CallAdapterFactory.create());
          }
       }else {
          uob.a(a);
       }
       return uob.d();
    }
    public static Object b(a p0,Class p1){
       c a = c$a.a;
       Objects.requireNonNull(a);
       if (!a.t().d("enableInterceptorReport", false)) {
       }else {
          s1.c().post(new b(a, p0));
       }
       return e.a(p0).a(p1);
    }
    public static e h(){
       return e$b.a;
    }
    public boolean c(String p0){
       return this.a.S(p0);
    }
    public boolean d(){
       return this.a.enableInterceptorUpgrade();
    }
    public boolean e(){
       return this.a.enableNewCommonParams();
    }
    public Context f(){
       return this.a.getContext();
    }
    public d g(){
       return this.a;
    }
    public void i(d p0){
       this.a = p0;
    }
}
