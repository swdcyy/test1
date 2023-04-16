package com.kwai.middleware.azeroth.network.a;
import java.lang.String;
import okhttp3.MediaType;
import java.util.concurrent.ThreadPoolExecutor;
import f97.a;
import x97.j;
import okhttp3.OkHttpClient$Builder;
import zk.d;
import java.util.concurrent.Executor;
import x97.l;
import com.kwai.middleware.azeroth.network.a$a;
import java.lang.Object;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import java.util.Map;
import okhttp3.FormBody$Builder;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ca7.u;
import com.kwai.middleware.azeroth.network.a$b;
import java.lang.Class;
import ca7.c;
import ca7.v;
import okhttp3.RequestBody;
import x97.f;
import java.lang.Runnable;
import x97.e;
import android.net.Uri;
import java.lang.CharSequence;
import c97.d;
import java.lang.StringBuilder;
import okhttp3.HttpUrl;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import x97.i;
import okhttp3.HttpUrl$Builder;
import java.util.Locale;
import java.util.HashMap;
import android.text.TextUtils;
import okhttp3.Request$Builder;
import okhttp3.Request;
import x97.o;
import okhttp3.Call;
import ca7.k;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;
import okhttp3.EventListener;
import r97.w;
import okhttp3.Response;
import com.kwai.middleware.azeroth.network.AzerothApiException;
import java.io.Closeable;
import ca7.e;
import x97.h;
import okhttp3.ResponseBody;
import x97.p;
import java.lang.reflect.Type;
import el.a;
import x97.g;
import com.kwai.middleware.azeroth.network.AzerothResponseException;
import java.io.IOException;

public class a	// class@000d5d
{
    public final OkHttpClient a;
    public final Gson b;
    public final d c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final Executor i;
    public final boolean j;
    public final l k;
    public HttpUrl l;
    public static final MediaType m;
    public static final ThreadPoolExecutor n;
    public static final l o;
    public static OkHttpClient p;

    static {
       a.m = MediaType.parse("application/x-www-form-urlencoded");
       a.n = a.d("azeroth-api-thread", 4);
       a.o = new j();
    }
    public void a(OkHttpClient$Builder p0,d p1,String p2,String p3,String p4,boolean p5,boolean p6,Executor p7,boolean p8,l p9,a$a p10){
       super();
       this.c = p1;
       this.b = p1.b();
       this.a = p0.build();
       this.e = p3;
       this.d = p2;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
    }
    public static FormBody$Builder b(Map p0){
       FormBody$Builder uBuilder = new FormBody$Builder();
       if (p0 != null && !p0.isEmpty()) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             uBuilder.add(u.a(uEntry.getKey()), u.a(uEntry.getValue()));
          }
       }
       return uBuilder;
    }
    public static a$b h(String p0){
       return new a$b(p0);
    }
    public final void a(String p0,String p1,Class p2,c p3){
       v.d(p0, "url cannot be null or empty");
       v.c(p1, "http method cannot be null");
       v.c(p2, "modelClass cannot be null");
       v.c(p3, "callback cannot be null");
    }
    public void c(String p0,Map p1,Class p2,c p3){
       this.f(p0, "GET", null, p1, null, p2, p3);
    }
    public void d(String p0,Map p1,Class p2,c p3){
       this.f(p0, "POST", null, null, p1, p2, p3);
    }
    public void e(String p0,Map p1,Map p2,RequestBody p3,Class p4,c p5){
       this.a(p0, "POST", p4, p5);
       f uof = new f(this, p0, null, null, p3, p4, p5);
       this.i.execute(p2);
    }
    public void f(String p0,String p1,Map p2,Map p3,Map p4,Class p5,c p6){
       Class uClass = p5;
       c uoc = p6;
       this.a(p0, p1, uClass, uoc);
       e uoe = new e(this, p0, p1, p2, p3, p4, uClass, uoc);
       this.i.execute(v11);
    }
    public final void g(String p0,String p1,Map p2,Map p3,RequestBody p4,Class p5,c p6){
       HttpUrl httpUrl;
       String str1;
       Iterator iterator;
       Map$Entry uEntry;
       String key;
       StringBuilder key1;
       Response response1;
       a uoa = this;
       String str = p1;
       c uoc = p6;
       Uri uri = Uri.parse(p0);
       v.d(uri, "urlPath cannot parse success");
       if (!u.c(uri.getScheme())) {
          throw new IllegalArgumentException(p0+" urlPath cannot contains scheme. You can only assign host by method AzerothApiRequester.Builder\(\).specialHost\(\)!");
       }
       String encodedPath = uri.getEncodedPath();
       Response response = null;
       if (uoa.l == null) {
          _monitor_enter(this);
          if (uoa.l == null) {
             a f = (!u.c(uoa.f))? uoa.f: uoa.k.a();
             if (d.a().i()) {
                v.d(f, "host cannot be null");
             }
             if (u.c(f)) {
                _monitor_exit(this);
                httpUrl = response;
             label_00ab :
                if (httpUrl == null) {
                   this.i(uoc, new IllegalArgumentException("host is null, urlPath: "+encodedPath));
                   a.a(new i(encodedPath));
                   return;
                }else {
                   HttpUrl$Builder uBuilder = httpUrl.newBuilder();
                   int i = 2;
                   if (uoa.h == null && !encodedPath.startsWith("/rest/")) {
                      Object[] objArray = new Object[i];
                      objArray[0] = uoa.e;
                      objArray[1] = encodedPath;
                      encodedPath = String.format(Locale.US, "/rest/zt/%s/%s", objArray);
                   }
                   try{
                      str1 = httpUrl.encodedPath();
                      if (!u.c(str1)) {
                         if (str1.endsWith("/")) {
                            str1 = str1.substring(0, (str1.length() - 1));
                         }
                         encodedPath = str1+encodedPath;
                      }
                      uBuilder.encodedPath(encodedPath);
                      HashMap hashMap = (p3 == null)? new HashMap(): p3;
                      if (!TextUtils.isEmpty(uoa.d)) {
                         hashMap.put("subBiz", uoa.d);
                      }
                      if (!hashMap.isEmpty()) {
                         iterator = hashMap.entrySet().iterator();
                         while (iterator.hasNext()) {
                            uEntry = iterator.next();
                            key = uEntry.getKey();
                            uBuilder.addQueryParameter(key, uEntry.getValue());
                         }
                      }
                      Set queryParamet = uri.getQueryParameterNames();
                      if (queryParamet != null && !queryParamet.isEmpty()) {
                         iterator = queryParamet.iterator();
                         while (iterator.hasNext()) {
                            encodedPath = iterator.next();
                            uBuilder.addQueryParameter(encodedPath, uri.getQueryParameter(encodedPath));
                         }
                      }
                      Request$Builder uBuilder1 = new Request$Builder().url(uBuilder.build());
                      if (p2 != null) {
                         Iterator iterator1 = p2.entrySet().iterator();
                         while (iterator1.hasNext()) {
                            uEntry = iterator1.next();
                            key1 = uEntry.getKey();
                            uBuilder1.addHeader(key1, uEntry.getValue());
                         }
                      }
                      int i1 = p1.hashCode();
                      if (i1 != 0x11336) {
                         if (i1 != 0x2590a0) {
                            if (i1 == 0x77f979ab && str.equals("DELETE")) {
                               i = 1;
                            }else {
                            label_01eb :
                               i = -1;
                            }
                         }else if(str.equals("POST")){
                            i = 0;
                         }else {
                            goto label_01eb ;
                         }
                      }else if(str.equals("GET")){
                      }
                      if (i) {
                         if (i != 1) {
                            uBuilder1.get();
                         }else {
                            uBuilder1.delete();
                         }
                      }else {
                         uBuilder1.post(p4);
                      }
                      Request request = uBuilder1.build();
                      if (!u.c(uoa.f)) {
                         request = o.a(request, "X-SPECIAL-HOST", request.url().host());
                      }
                      Call uCall = uoa.a.newCall(request);
                      str1 = "eventListener";
                      Class class = uCall.getClass();
                      Field uField = response;
                      do {
                         if (uField == null) {
                            try{
                               uField = class.getDeclaredField(str1);
                               uField.setAccessible(1);
                            }catch(java.lang.NoSuchFieldException e0){
                               class = class.getSuperclass();
                            }
                         }else {
                            uField.setAccessible(1);
                            Map obj = uField.get(uCall);
                            if (obj instanceof w) {
                               obj.a();
                               response1 = obj;
                            }else {
                               response1 = response;
                            }
                            response = uCall.execute();
                            response.code();
                            this.j(response, response1, p5, uoc);
                            e.a(response);
                            return;
                         }
                      } while (class != null);
                      throw new NoSuchFieldException();
                   }catch(java.lang.Exception e0){
                      this.i(uoc, e0);
                      return;
                   }
                }
             }else if(!f.startsWith("http")){
                key1 = "";
                key = (uoa.g != null)? "https://": "http://";
                str1 = key1+key+f;
             }
             a uoa1 = str1;
             try{
                uoa.l = HttpUrl.parse(uoa1);
             }catch(java.lang.Exception e0){
                Azeroth2.B.v(new IllegalArgumentException("parse host failed host: "+uoa1, e0));
             }
             if (d.a().i()) {
                v.d(uoa.l, "host cannot parse to HttpUrl");
             }
          }
          _monitor_exit(this);
       }
       httpUrl = uoa.l;
       goto label_00ab ;
    }
    public final void i(c p0,Throwable p1){
       if (this.j != null) {
          v.e(new h(p0, p1));
       }else {
          p0.onFailure(p1);
       }
       return;
    }
    public final void j(Response p0,w p1,Class p2,c p3){
       p a;
       if (!p0.isSuccessful()) {
          throw new IOException("Request failed with response: "+p0);
       }
       ResponseBody responseBody = p0.body();
       if (responseBody == null) {
          throw new IOException("Request failed cause responseBody is null. response: "+p0);
       }
       int i = 1;
       Type[] typeArray = new Type[i];
       typeArray[0] = p2;
       p op = this.b.i(responseBody.string(), a.getParameterized(p.class, typeArray).getType());
       op.d = p0;
       if (p1 != null) {
          p1.b(op.a());
       }
       if (op.a() != i) {
          i = 0;
       }
       if (i) {
          a = op.a;
          if (this.j != null) {
             v.e(new g(p3, a));
          }else {
             p3.onSuccess(a);
          }
       }else {
          this.i(p3, new AzerothResponseException(op));
       }
       return;
    }
}
