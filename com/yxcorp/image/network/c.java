package com.yxcorp.image.network.c;
import q0d.a;
import com.yxcorp.image.network.c$c;
import java.util.HashSet;
import okhttp3.OkHttpClient$Builder;
import q0d.f;
import id.i;
import id.c0;
import id.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import q0d.g;
import java.lang.Integer;
import okhttp3.ResponseBody;
import com.facebook.imagepipeline.producers.n$a;
import android.net.Uri;
import okhttp3.Request$Builder;
import okhttp3.CacheControl$Builder;
import okhttp3.CacheControl;
import com.yxcorp.image.network.ImageHttpStatistics;
import okhttp3.Request;
import okhttp3.OkHttpClient;
import com.yxcorp.image.network.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import com.yxcorp.image.network.CookieAppendInterceptor;
import java.util.Set;
import com.yxcorp.image.network.CronetParameterInterceptor;
import com.kuaishou.aegon.okhttp.CronetInterceptor;
import java.util.concurrent.TimeUnit;
import okhttp3.EventListener$Factory;
import com.yxcorp.image.network.b;
import okhttp3.Call;
import com.yxcorp.image.network.c$a;
import id.d0;
import com.yxcorp.image.network.c$b;
import okhttp3.Callback;

public class c extends a	// class@00138c
{
    public final Set a;
    public final int b;
    public final int c;
    public final int d;
    public final OkHttpClient$Builder e;
    public final f f;

    public void c(c$c p0){
       int i;
       OkHttpClient$Builder uBuilder;
       super();
       c$c a = p0.a;
       if (a == null) {
          a = new HashSet();
       }
       this.a = a;
       a = p0.b;
       if (a <= null) {
          i = 3000;
       }
       this.b = i;
       a = p0.c;
       int i1 = 5000;
       if (a <= null) {
          i = 5000;
       }
       this.c = i;
       a = p0.d;
       if (a > null) {
          i1 = a;
       }
       this.d = i1;
       a = p0.e;
       if (a == null) {
          uBuilder = new OkHttpClient$Builder();
       }
       this.e = uBuilder;
       this.f = new f(this, p0.f);
       return;
    }
    public s a(i p0,c0 p1){
       g og = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(p0, p1);
       }
       return og;
    }
    public void b(s p0,int p1){
       this.f(p0, p1);
    }
    public void f(g p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "3")) {
          return;
       }
       g g = p0.g;
       if (g != null) {
          g.close();
          p0.g = null;
       }
       super.f(p0, p1);
       return;
    }
    public void g(g p0,n$a p1){
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "4")) {
          return;
       }
       Request request = new Request$Builder().cacheControl(new CacheControl$Builder().noStore().build()).url(p0.f().toString()).get().tag(ImageHttpStatistics.class, p0.f).build();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, uoc, "5");
       if (obj != patchProxyRe) {
       }else {
          uoc = this.f;
          f uof = f.class;
          _monitor_enter(uoc);
          f obj1 = PatchProxy.apply(null, uoc, uof, "1");
          if (obj1 != patchProxyRe) {
             _monitor_exit(uoc);
             obj = obj1;
          }else if(uoc.g == null){
             uoc.e.addInterceptor(new ConvertToIOExceptionInterceptor());
             uoc.e.addInterceptor(new CookieAppendInterceptor(uoc.a));
             if (uoc.f != null) {
                uoc.e.addInterceptor(new CronetParameterInterceptor()).addInterceptor(new CronetInterceptor());
             }
             obj1 = uoc.b;
             if (obj1 > null) {
                uoc.e.connectTimeout((long)obj1, TimeUnit.MILLISECONDS);
             }
             obj1 = uoc.c;
             if (obj1 > null) {
                uoc.e.readTimeout((long)obj1, TimeUnit.MILLISECONDS);
             }
             obj1 = uoc.d;
             if (obj1 > null) {
                uoc.e.writeTimeout((long)obj1, TimeUnit.MILLISECONDS);
             }
             obj1 = uoc.e;
             b uob = PatchProxy.apply(null, null, uof, "2");
             if (uob != patchProxyRe) {
             }else {
                uob = b.a;
             }
             obj1.eventListenerFactory(uob);
             uoc.g = uoc.e.build();
          }
          _monitor_exit(uoc);
          obj = uoc.g;
       }
       Call uCall = obj.newCall(request);
       p0.b().k(new c$a(this, uCall, obj));
       uCall.enqueue(new c$b(this, p0, p1));
       return;
    }
}
