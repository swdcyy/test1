package com.kuaishou.aegon.okhttp.impl.c;
import com.kuaishou.aegon.okhttp.CronetInterceptorConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Runtime;
import java.lang.StringBuilder;
import bo.t;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.Interceptor$Chain;
import go.b;
import okhttp3.Response;
import com.kuaishou.aegon.okhttp.impl.d;
import java.lang.Boolean;
import java.lang.Integer;
import okhttp3.Request;
import okhttp3.HttpUrl;
import java.lang.Math;
import aegon.chrome.net.d;
import com.kuaishou.aegon.Aegon;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kuaishou.aegon.a;
import io.b$a;
import io.b;
import okhttp3.Headers;
import okhttp3.RequestBody;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.EventListener;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.aegon.okhttp.impl.b;
import java.util.concurrent.Executor;
import aegon.chrome.net.q$b;
import aegon.chrome.net.q$a;
import aegon.chrome.net.h$a;
import aegon.chrome.net.n$a;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.List;
import okhttp3.MediaType;
import okio.b;
import okio.c;
import i0.j;
import java.nio.ByteBuffer;
import aegon.chrome.net.o;
import com.kuaishou.aegon.okhttp.impl.e;
import aegon.chrome.net.h;
import aegon.chrome.net.q;
import okhttp3.Response$Builder;
import java.io.IOException;

public class c	// class@0005ee
{
    public static final Executor a;
    public static AtomicLong b;
    public static String c;

    static {
       int i;
       Object obj = PatchProxy.apply(null, null, CronetInterceptorConfig.class, "11");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = CronetInterceptorConfig.g;
          if (i <= 0) {
             i = Runtime.getRuntime().availableProcessors();
          }
          t.c("CronetInterceptorConfig", "Callback thread pool\'s size is "+i);
       }
       c.a = Executors.newFixedThreadPool(i);
       c.b = new AtomicLong(0);
       c.c = null;
    }
    public void c(){
       super();
    }
    public static Response a(Interceptor$Chain p0,boolean p1,boolean p2,int p3,b p4){
       String obj1;
       d obj2;
       String str4;
       object oobject = p0;
       object oobject1 = p4;
       d uod = d.class;
       c uoc = c.class;
       int i = 0;
       d obj = null;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),Boolean.valueOf(p2),Integer.valueOf(p3),oobject1};
          obj1 = PatchProxy.apply(objArray, obj, uoc, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       Request request = p0.request();
       String str = request.url().toString();
       String str1 = str.substring(i, Math.min(200, str.length()));
       t.a("CronetInterceptor", "doRequest. url: "+str1);
       d uod1 = Aegon.c();
       if (uod1 != null) {
          if (c.c == null) {
             obj1 = " aegon/";
             obj2 = PatchProxy.apply(obj, obj, Aegon.class, "20");
             if (obj2 != PatchProxyResult.class) {
             }else if(!Aegon.f.get()){
                str4 = obj;
             }else {
                str4 = b.b(a.a);
             }
             c.c = obj1+obj2;
          }
          Headers headers = request.headers();
          RequestBody requestBody = request.body();
          EventListener uEventListen = (oobject instanceof RealInterceptorChain)? oobject.eventListener(): obj;
          obj1 = (headers != null)? headers.get("x-aegon-request-id"): obj;
          if (TextUtils.isEmpty(obj1)) {
             obj1 = "okhttp-"+c.b.incrementAndGet();
          }
          String str2 = obj1;
          obj2 = new d(oobject, uEventListen, str2);
          obj2.k = oobject1;
          Executor uExecutor = c.a;
          b uob = obj1;
          b uob1 = obj1;
          obj1 = str2;
          obj = obj2;
          d uod2 = uod;
          String str3 = str2;
          RequestBody requestBody1 = requestBody;
          uob = new b(obj1, p3, p0, uEventListen, uExecutor);
          h$a uoa = uod1.d(str, obj, uExecutor);
          uoa.n(uob1);
          uoa.l(request.method());
          uoa.h("x-aegon-request-id", str3);
          if (headers != null) {
             for (int i1 = 0; i1 < headers.size(); i1 = i1 + 1) {
                str4 = headers.name(i1);
                str2 = headers.value(i1);
                if (CronetInterceptorConfig.f && str4.equalsIgnoreCase("user-agent")) {
                   str2 = str2+c.c;
                }
                uoa.h(str4, str2);
             }
          }
          uoa.h("x-aegon-connect-timeout", String.valueOf(p0.connectTimeoutMillis()));
          uoa.h("x-aegon-read-timeout", String.valueOf(p0.readTimeoutMillis()));
          uoa.h("x-aegon-write-timeout", String.valueOf(p0.writeTimeoutMillis()));
          if (p1) {
             uoa.h("x-aegon-force-early-data", "1");
          }
          if (p2) {
             uoa.h("x-aegon-enable-cache", "1");
          }
          obj1 = request.url().encodedPath();
          Iterator obj3 = PatchProxy.applyOneRefs(obj1, null, CronetInterceptorConfig.class, "8");
          if (obj3 != PatchProxyResult.class) {
             obj1 = obj3;
          }else {
             obj3 = CronetInterceptorConfig.c.entrySet().iterator();
             while (true) {
                if (obj3.hasNext()) {
                   Map$Entry uEntry = obj3.next();
                   Iterator iterator = uEntry.getValue().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (obj1.equals(iterator.next())) {
                            obj1 = uEntry.getKey();
                            break ;
                         }
                      }else {
                         continue ;
                      }
                   }
                }else {
                   CharSequence uCharSequenc = null;
                }
             }
          }
          if (!TextUtils.isEmpty(obj1)) {
             uoa.h("x-aegon-request-priority", obj1);
          }
          if (requestBody1 != null) {
             MediaType mediaType = requestBody1.contentType();
             if (mediaType != null && !TextUtils.isEmpty(mediaType.toString())) {
                uoa.h("Content-Type", mediaType.toString());
             }
             if (requestBody1.contentLength() >= 0 && requestBody1.contentLength() - 0x100000 < 0) {
                b uob2 = new b();
                requestBody1.writeTo(uob2);
                byte[] uobyteArray = uob2.readByteArray();
                uoa.q(new j(ByteBuffer.wrap(uobyteArray, 0, uobyteArray.length).slice()), c.a);
             }else {
                uoa.q(new e(requestBody1, (long)p0.writeTimeoutMillis()), c.a);
             }
          }
          t.a("CronetInterceptor", "request start. url: "+str1+", requestId: "+str3);
          uoa.j().f();
          _monitor_enter(obj);
          d uod3 = uod2;
          if (PatchProxy.applyVoid(null, obj, uod3, "9")) {
             _monitor_exit(obj);
          label_0299 :
             _monitor_enter(uob1);
             if (PatchProxy.applyVoid(null, uob1, b.class, "2")) {
                _monitor_exit(uob1);
             label_02c9 :
                t.a("CronetInterceptor", "request finish. requestId: "+str3);
                d e = obj.e;
                if (e == null) {
                   Response response = PatchProxy.apply(null, obj, uod3, "8");
                   if (response != PatchProxyResult.class) {
                   }else {
                      response = obj.c.build();
                   }
                   return response;
                }else {
                   throw e;
                }
             }
             while (uob1.f == null) {
                try{
                   uob1.wait();
                }catch(java.lang.InterruptedException e0){
                   t.d("CronetInterceptor", "Interrupted: "+e0);
                   goto label_02a7 ;
                }
             }
             _monitor_exit(uob1);
             goto label_02c9 ;
          }
          while (obj.d == null) {
             try{
                obj.wait();
             }catch(java.lang.InterruptedException e0){
                t.d("CronetInterceptor", "Interrupted: "+e0);
                goto label_0277 ;
             }
          }
          _monitor_exit(obj);
          goto label_0299 ;
       }else {
          t.b("CronetInterceptor", "Aegon not initialized");
          throw new IOException("Aegon not initialized");
       }
    }
}
