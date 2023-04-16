package com.kwai.framework.network.cronet.CronetParameterInterceptor;
import okhttp3.Interceptor;
import java.lang.Object;
import wkd.b;
import hb6.b;
import okhttp3.Interceptor$Chain;
import okhttp3.Response;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.Request;
import okhttp3.HttpUrl;
import com.kwai.sdk.switchconfig.a;
import okhttp3.Request$Builder;
import uk.a;
import o56.c;
import o56.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import ujd.d;
import com.kwai.framework.model.router.RouteType;
import fjd.b;
import jb6.d;
import javax.net.ssl.SSLSocketFactory;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import java.util.Objects;
import java.lang.Number;
import hb6.d;
import java.util.Map;
import java.lang.Long;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.EventListener;
import d0d.d;
import java.util.LinkedList;
import d0d.f;

public class CronetParameterInterceptor implements Interceptor	// class@000bf2
{
    public final b a;

    public void CronetParameterInterceptor(){
       super();
       this.a = b.a(-1295466596);
    }
    public Response intercept(Interceptor$Chain p0){
       Collection obj1;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CronetParameterInterceptor uCronetParam = CronetParameterInterceptor.class;
       Request obj = PatchProxy.applyOneRefs(p0, this, uCronetParam, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = p0.request();
       String str = obj.url().host();
       boolean b = false;
       if (a.t().d("enableCronetHTTPDNS", b)) {
          obj1 = PatchProxy.applyOneRefs(obj, this, uCronetParam, "2");
          obj = (obj1 != patchProxyRe)? obj1: obj.newBuilder().addHeader("x-aegon-enable-preresolver", "1").build();
       }
    label_0044 :
       if (!a.c(str)) {
          RouteType obj2 = PatchProxy.applyOneRefs(obj, this, uCronetParam, "4");
          if (obj2 != patchProxyRe) {
          }else if(a.c(obj.url().host())){
             obj2 = PatchProxy.applyOneRefs(obj, this, uCronetParam, "5");
             if (obj2 != patchProxyRe) {
                obj = obj2;
             }else if(!a.a().c() || !TextUtils.equals(obj.url().scheme(), "https")){
                obj2 = d.a(obj, "route-type");
                if (obj2 != null && d.a().g(obj2.mName, obj.url().host()) != null) {
                   obj = obj.newBuilder().addHeader("x-aegon-skip-cert-verify", String.valueOf(1)).build();
                }
             }
             obj2 = PatchProxy.applyOneRefs(obj, this, uCronetParam, "6");
             if (obj2 != patchProxyRe) {
             }else {
                str = obj.url().host();
                obj1 = this.a.b(str);
                Collection uCollection = this.a.a(str);
                if (!q.f(obj1)) {
                   String str1 = TextUtils.join(";", obj1);
                   if (!TextUtils.isEmpty(str1)) {
                      Request$Builder uBuilder = obj.newBuilder().addHeader("x-aegon-resolve", str1);
                      CronetParameterInterceptor ta = this.a;
                      Objects.requireNonNull(ta);
                      Long obj3 = PatchProxy.applyOneRefs(str, ta, b.class, "4");
                      String str2 = null;
                      if (obj3 != patchProxyRe) {
                         l = obj3.longValue();
                      }else {
                         b b1 = ta.b;
                         Objects.requireNonNull(b1);
                         obj3 = PatchProxy.applyOneRefs(str, b1, d.class, "3");
                         if (obj3 != patchProxyRe) {
                            l = obj3.longValue();
                         }else {
                            _monitor_enter(b1);
                            Long longx = b1.c.get(str);
                            obj3 = b1.d.get(str);
                            if (longx != null && (obj3 != null && (obj3.longValue() - str2 > 0 && longx.longValue() - obj3.longValue() > 0))) {
                               l = longx.longValue();
                               _monitor_exit(b1);
                            }else {
                               _monitor_exit(b1);
                               l = str2;
                            }
                         }
                      }
                      if (l - str2 > 0) {
                         uBuilder.addHeader("x-aegon-resolve-forced", String.valueOf(l));
                      }
                      Object[] objArray = new Object[b];
                      c.C().w("CronetParams", "Set Aegon request header resolve: "+str+" -> "+str1+" version: "+l, objArray);
                      obj = uBuilder.build();
                   }
                }else if(!q.f(uCollection)){
                   String str3 = TextUtils.join(";", uCollection);
                   if (!TextUtils.isEmpty(str3)) {
                      Object[] objArray1 = new Object[b];
                      c.C().w("CronetParams", "Set Aegon request header resolve fallback: "+str+" -> "+str3, objArray1);
                      obj = obj.newBuilder().addHeader("x-aegon-resolve-fallback", "3000;"+str3).build();
                   }
                }
                obj2 = obj;
             }
          }
          obj = obj2;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uCronetParam, "3") && p0 instanceof RealInterceptorChain) {
          EventListener uEventListen = p0.eventListener();
          if (uEventListen instanceof d) {
             LinkedList linkedList = uEventListen.e();
             if (!linkedList.isEmpty() && linkedList.getFirst() instanceof f) {
                linkedList.getFirst().f();
             }
          }
       }
       return p0.proceed(obj);
    }
}
