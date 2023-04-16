package com.kwai.framework.exceptionhandler.safemode.deps.SwitchHostOnRetryFailedInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import java.util.LinkedHashSet;
import okhttp3.Request;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl$Builder;
import r66.d;
import com.kwai.framework.model.router.RouteType;
import java.lang.CharSequence;
import r66.f;
import java.lang.Enum;
import q66.a;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import zsd.u;
import okhttp3.Request$Builder;
import kotlin.jvm.internal.a;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;

public final class SwitchHostOnRetryFailedInterceptor implements Interceptor	// class@001551
{
    public final String a;
    public final Set b;
    public int c;

    public void SwitchHostOnRetryFailedInterceptor(){
       super(0);
    }
    public void SwitchHostOnRetryFailedInterceptor(int p0){
       super();
       this.c = p0;
       this.a = "SafeMode";
       this.b = new LinkedHashSet();
    }
    public final Request a(Request p0){
       RouteType aPI;
       SwitchHostOnRetryFailedInterceptor switchHostOn = SwitchHostOnRetryFailedInterceptor.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HttpUrl$Builder obj = PatchProxy.applyOneRefs(p0, this, switchHostOn, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.url().newBuilder();
       p0.url().toString();
       String str = p0.url().host();
       d uod = d.class;
       Object obj1 = null;
       Object obj2 = PatchProxy.applyOneRefs(str, obj1, uod, "6");
       int i = 0;
       if (obj2 != patchProxyRe) {
       }else if(str == null || !str.contains(d.a)){
          str = str.substring(i, str.indexOf(46));
          RouteType[] obj4 = PatchProxy.applyOneRefs(str, obj1, uod, "5");
          if (obj4 != patchProxyRe) {
             obj2 = obj4;
          }else {
             obj4 = RouteType.values();
             int len = obj4.length;
             int i2 = 0;
             while (true) {
                if (i2 < len) {
                   object oobject = obj4[i2];
                   if ((oobject.mName).equals(str)) {
                      obj2 = oobject;
                      break ;
                   }else if(str != null && str.startsWith("api")){
                      aPI = RouteType.API;
                   }else if(str != null && str.startsWith("ulog")){
                      aPI = RouteType.ULOG;
                   }else {
                      i2 = i2 + 1;
                   }
                   obj2 = aPI;
                   break ;
                }
             }
          }
       }
       obj2 = obj1;
       List obj3 = PatchProxy.applyOneRefs(obj2, this, switchHostOn, "3");
       if (obj3 != patchProxyRe) {
          obj1 = obj3;
       }else if(obj2 == null){
       label_00a6 :
          obj3 = a.c;
       }else {
          int i1 = f.a[obj2.ordinal()];
          if (i1 != 1) {
             if (i1 != 2) {
                goto label_00a6 ;
             }else {
                obj3 = a.d;
             }
          }else {
             obj3 = a.c;
          }
       }
       Iterator iterator = obj3.iterator();
       while (iterator.hasNext()) {
          String str1 = iterator.next();
          if (!this.b.contains(str1)) {
             obj1 = str1;
             break ;
          }
       }
       if (obj1 == null || u.S1(obj1)) {
          i = 1;
       }
       if (i) {
          return p0;
       }else {
          obj.host(obj1);
          obj.scheme("https");
          p0 = p0.newBuilder().url(obj.build()).build();
          p0.url().toString();
          a.o(p0, "newRequest");
          return p0;
       }
    }
    public Response intercept(Interceptor$Chain p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SwitchHostOnRetryFailedInterceptor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "chain");
       int i = 0;
       Request request = p0.request();
       a.o(request, "chain.request\(\)");
       Response response = p0.proceed(request);
       String str = request.url().host();
       a.o(str, "request.url\(\).host\(\)");
       this.b.add(str);
       a.m(response);
       while (!response.isSuccessful() && i < this.c) {
          i = i + 1;
          response.close();
          response = p0.proceed(request);
       }
       if (!response.isSuccessful()) {
          response = p0.proceed(this.a(request));
       }
       return response;
    }
}
