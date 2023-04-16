package com.kwai.middleware.azeroth.network.a$b;
import com.kwai.middleware.azeroth.network.a;
import java.lang.Object;
import okhttp3.OkHttpClient$Builder;
import okhttp3.OkHttpClient;
import java.lang.String;
import zk.d;
import x97.p;
import com.kwai.middleware.azeroth.network.ResponseJsonAdapter;
import java.lang.reflect.Type;
import c97.d;
import h97.i;
import x97.n;
import java.util.concurrent.Executor;
import x97.l;
import com.kwai.middleware.azeroth.network.a$a;
import x97.k;
import java.util.concurrent.TimeUnit;
import com.kwai.middleware.azeroth.network.interceptor.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import com.kwai.middleware.azeroth.network.interceptor.RetryInterceptor;
import com.kwai.middleware.azeroth.network.interceptor.HeaderInterceptor;
import x97.d;
import com.kwai.middleware.azeroth.network.interceptor.ParamsInterceptor;
import com.kwai.middleware.azeroth.network.interceptor.RouterInterceptor;
import java.util.List;
import java.util.Iterator;
import javax.net.ssl.SSLSocketFactory;
import ca7.q;
import javax.net.ssl.TrustManager;
import ca7.p;
import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManager;
import java.security.SecureRandom;
import java.lang.Exception;
import r97.a0;
import okhttp3.EventListener$Factory;
import q97.c;
import java.lang.Throwable;
import java.lang.Class;

public class a$b	// class@000d5c
{
    public d a;
    public OkHttpClient$Builder b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public Executor h;
    public boolean i;
    public l j;

    public void a$b(a p0){
       super();
       this.i = true;
       this.j = a.o;
       this.a = p0.c;
       this.b = p0.a.newBuilder();
       this.d = p0.d;
       this.e = p0.e;
       this.c = p0.f;
       this.f = p0.g;
       this.g = p0.h;
       this.h = p0.i;
       this.i = p0.j;
    }
    public void a$b(String p0){
       super();
       this.i = true;
       this.j = a.o;
       this.e = p0;
       d uod = new d();
       uod.f(p.class, new ResponseJsonAdapter());
       uod.j();
       uod.c();
       this.a = uod;
       this.f = d.a().e().b().d();
       this.h = a.n;
    }
    public a a(){
       a uoa = new a(this.c(), this.a, this.d, this.e, this.c, this.f, this.g, this.h, this.i, this.j, null);
       return v12;
    }
    public d b(){
       return this.a;
    }
    public OkHttpClient$Builder c(){
       SSLSocketFactory socketFactor;
       if (this.b == null) {
          if (a.p == null) {
             k ok = d.a().e().b().a();
             TimeUnit sECONDS = TimeUnit.SECONDS;
             OkHttpClient$Builder uBuilder = new OkHttpClient$Builder().connectTimeout(15, sECONDS).readTimeout(15, sECONDS).writeTimeout(15, sECONDS);
             boolean b = true;
             OkHttpClient$Builder uBuilder1 = uBuilder.followRedirects(b).followSslRedirects(b).retryOnConnectionFailure(b).addInterceptor(new ConvertToIOExceptionInterceptor()).addInterceptor(new RetryInterceptor(3)).addInterceptor(new HeaderInterceptor(ok)).addInterceptor(new ParamsInterceptor(ok)).addInterceptor(new RouterInterceptor(a.o));
             List list = d.a().e().b().b();
             if (list != null && !list.isEmpty()) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   uBuilder1.addInterceptor(iterator.next());
                }
             }
             try{
                if (d.a().e().b().c()) {
                   uBuilder1.sslSocketFactory(q.a());
                }else {
                   KeyManager[] keyManagerAr = null;
                   try{
                      TrustManager[] trustManager = new TrustManager[b];
                      trustManager[0] = new p();
                      SSLContext instance = SSLContext.getInstance("TLSv1");
                      instance.init(keyManagerAr, trustManager, keyManagerAr);
                      socketFactor = instance.getSocketFactory();
                   }catch(java.lang.Exception e2){
                      e2.printStackTrace();
                   }
                   uBuilder1.sslSocketFactory(socketFactor);
                }
             }catch(java.lang.Exception e0){
             }
             n on = d.a().e().b();
             if (on != null) {
                on.h(e0);
             }
             a.p = e0.build();
          }
          this.b = a.p.newBuilder();
       }
       EventListener$Factory uFactory = d.a().g().z();
       if (uFactory != null) {
          this.b.eventListenerFactory(uFactory);
       }
       return this.b;
    }
    public void d(Class p0,Interceptor p1){
       List list = this.c().interceptors();
       List list1 = this.c().interceptors();
       Iterator iterator = list1.iterator();
       int i = -1;
       while (iterator.hasNext()) {
          Interceptor interceptor = iterator.next();
          if (interceptor != null && p0.equals(interceptor.getClass())) {
             i = list1.indexOf(interceptor);
             iterator.remove();
          }
       }
       if (i >= 0 && i < list.size()) {
          list.add(i, p1);
       }else {
          list.add(p1);
       }
       return;
    }
    public a$b e(l p0){
       this.j = p0;
       this.d(RouterInterceptor.class, new RouterInterceptor(p0));
       return this;
    }
    public a$b f(d p0){
       this.d(HeaderInterceptor.class, new HeaderInterceptor(p0));
       this.d(ParamsInterceptor.class, new ParamsInterceptor(p0));
       return this;
    }
    public a$b g(int p0){
       this.d(RetryInterceptor.class, new RetryInterceptor(p0));
       return this;
    }
    public a$b h(boolean p0){
       this.i = p0;
       return this;
    }
    public a$b i(String p0){
       this.d = p0;
       return this;
    }
    public a$b j(boolean p0){
       this.f = p0;
       return this;
    }
    public a$b k(String p0){
       this.c = p0;
       return this;
    }
}
