package c00.d;
import tx4.q;
import java.lang.Object;
import okhttp3.Request$Builder;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import okhttp3.OkHttpClient;
import java.util.Map;
import tx4.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import okhttp3.HttpUrl;
import okhttp3.FormBody$Builder;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.Call;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Iterator;
import okhttp3.Headers;
import okhttp3.Response;
import tx4.u;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import okhttp3.ResponseBody;
import com.yxcorp.utility.Log;
import c00.a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import okhttp3.HttpUrl$Builder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import e00.b;
import e00.c;
import java.lang.Thread;
import okhttp3.Callback;
import kotlin.jvm.internal.a;
import e00.a;
import java.lang.Throwable;
import c00.c;

public class d implements q	// class@0002df
{
    public OkHttpClient a;
    public a b;
    public Request$Builder c;
    public String d;
    public String e;
    public String f;
    public Map g;
    public Map h;
    public Map i;
    public FormBody j;
    public boolean k;
    public boolean l;
    public String m;

    public void d(){
       super();
       this.k = true;
       this.m = "TKRequest";
       this.c = new Request$Builder();
       a uoa = b.a(-1961311520).a(RouteType.API, d.b);
       this.b = uoa;
       this.a = uoa.buildClient();
    }
    public void a(Map p0){
       this.g = p0;
    }
    public void b(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       HttpUrl httpUrl = this.l(true);
       if (this.j == null) {
          this.j = new FormBody$Builder().build();
       }
       this.m(p0, this.a.newCall(this.c.url(httpUrl).post(this.j).build()));
       return;
    }
    public void c(String p0){
       this.f = p0;
    }
    public void d(int p0){
    }
    public void e(Map p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "2")) {
          return;
       }
       int i = -1961311520;
       if (p0 != null) {
          String str = "hostType";
          if (p0.containsKey(str)) {
             this.m = p0.get(str);
             g og = b.a(i);
             String str1 = p0.get(str);
             RouteType routeType = PatchProxy.applyOneRefs(str1, this, uod, "11");
             if (routeType != PatchProxyResult.class) {
             }else if(str1 != null && str1.equals("ad")){
                str1 = "apie";
             }
             RouteType routeType1 = RouteType.nameOf(str1);
             if (routeType1 == null) {
                routeType1 = RouteType.API;
             }
             routeType = routeType1;
             this.b = og.a(routeType, d.b);
          label_0067 :
             this.a = this.b.buildClient();
             return;
          }
       }
       this.b = b.a(i).a(RouteType.API, d.b);
       goto label_0067 ;
    }
    public void f(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       this.m(p0, this.a.newCall(this.c.url(this.l(false)).get().build()));
       return;
    }
    public void g(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.h = p0;
       if (p0 != null && p0.size() > 0) {
          FormBody$Builder uBuilder = new FormBody$Builder();
          Iterator iterator = p0.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             uBuilder.add(str, String.valueOf(p0.get(str)));
          }
          this.j = uBuilder.build();
       }
       return;
    }
    public void h(String p0){
       this.d = p0;
    }
    public void i(){
       this.k = false;
    }
    public void j(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       if (p0 != null && p0.size() > 0) {
          this.l = ("1").equals(p0.remove("preload"));
          this.c.headers(Headers.of(p0));
          this.i = p0;
       }
       return;
    }
    public void k(Response p0,i p1){
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "8")) {
          return;
       }
       if (p1 != null) {
          u ou = new u();
          Headers headers = p0.headers();
          String str = PatchProxy.applyOneRefs(headers, this, uod, "9");
          if (str != PatchProxyResult.class) {
          }else if(headers != null){
             HashMap hashMap = new HashMap();
             Iterator iterator = headers.names().iterator();
             while (iterator.hasNext()) {
                String str1 = iterator.next();
                hashMap.put(str1, headers.get(str1));
             }
             str = a.a.q(hashMap);
          }else {
             str = null;
          }
          ou.allHeaderFields = str;
          ou.body = p0.body().string();
          ou.statusCode = p0.code();
          if (this.k != null) {
             Log.g("tachikoma", "callback to js");
             k1.o(new a(p1, ou));
          }else {
             Log.g("tachikoma", "not need callback to js");
          }
       }
       return;
    }
    public final HttpUrl l(boolean p0){
       HttpUrl$Builder obj;
       String str1;
       d th;
       Iterator iterator;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uod, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = HttpUrl.parse(this.b.buildBaseUrl()).newBuilder();
       if (!TextUtils.x(this.f)) {
          obj.scheme(this.f);
       }
       if (!TextUtils.x(this.d)) {
          obj.host(this.d);
       }
       if (!TextUtils.x(this.e)) {
          String str = obj.build().toString();
          str1 = "/";
          if (str.endsWith(str1) && (this.e).startsWith(str1)) {
             this.e = (this.e).substring(1);
          }
          obj = HttpUrl.parse(str+this.e).newBuilder();
       }
       if (!p0) {
          th = this.h;
          if (th != null && th.size() > 0) {
             iterator = this.h.keySet().iterator();
             while (iterator.hasNext()) {
                str1 = iterator.next();
                if (TextUtils.x(str1)) {
                   continue ;
                }
                obj.addQueryParameter(str1, String.valueOf(this.h.get(str1)));
             }
          }
       }
       th = this.g;
       if (th != null && th.size() > 0) {
          iterator = this.g.keySet().iterator();
          while (iterator.hasNext()) {
             str1 = iterator.next();
             if (TextUtils.x(str1)) {
                continue ;
             }
             obj.addQueryParameter(str1, String.valueOf(this.g.get(str1)));
          }
       }
       return obj.build();
    }
    public final void m(i p0,Call p1){
       b d;
       Response obj;
       boolean b;
       Response response;
       d uod = d.class;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "6")) {
          return;
       }
       Object[] objArray = null;
       c uoc = PatchProxy.apply(objArray, this, uod, "12");
       if (uoc != patchProxyRe) {
       }else {
          uoc = new c(this.m);
          uoc.e = this.h;
          uoc.b = this.d;
          uoc.a = this.e;
          uoc.c = this.f;
          uoc.f = this.i;
       }
       if (this.l != null) {
          Log.b("tachikomaPre", Thread.currentThread().getName()+"开始预加载:"+uoc.toString());
          d = b.d;
          _monitor_enter(d);
          a uoa = PatchProxy.applyOneRefs(uoc, d, uob, "5");
          if (uoa != patchProxyRe) {
             _monitor_exit(d);
          }else {
             a.p(uoc, "id");
             uoa = new a(uoc);
             b.a.put(uoc, uoa);
             _monitor_exit(d);
          }
          p1.enqueue(uoa);
       }else if(p0 == null){
          Log.b("tachikomaPre", Thread.currentThread().getName()+"正常请求，callback为null，停止请求");
          return;
       }else {
          b d1 = b.d;
          _monitor_enter(d1);
          Object[] objArray1 = PatchProxy.applyOneRefs(uoc, d1, uob, "3");
          if (objArray1 != patchProxyRe) {
             _monitor_exit(d1);
          }else {
             a.p(uoc, "id");
             response = b.b.remove(uoc);
             if (response != null) {
                Log.g("tachikomaPre::TKPreloadManager", "移除预请求缓存结果 id: "+uoc);
                obj = response;
             }
             _monitor_exit(d1);
             objArray1 = obj;
          }
          if (objArray1 != null) {
             try{
                Log.b("tachikomaPre", Thread.currentThread().getName()+"命中缓存:"+uoc.toString());
                this.k(objArray1, p0);
             }catch(java.lang.Exception e10){
                Log.n("tachikomaPre", "tk response cache callback error::\n "+Log.f(e10));
             }
          }else {
             _monitor_enter(d1);
             obj = PatchProxy.applyOneRefs(uoc, d1, uob, "4");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                a.p(uoc, "id");
                b = b.a.containsKey(uoc);
             }
             _monitor_exit(d1);
             if (b) {
                Log.b("tachikomaPre", Thread.currentThread().getName()+"正在请求中,复用请求:"+uoc.toString());
                _monitor_enter(d1);
                if (PatchProxy.applyVoidTwoRefs(uoc, p0, d1, uob, "2")) {
                   _monitor_exit(d1);
                }else {
                   a.p(uoc, "id");
                   a.p(p0, "callback");
                   b.c.put(uoc, p0);
                   _monitor_exit(d1);
                }
             }else {
                Log.b("tachikomaPre", Thread.currentThread().getName()+"开始正常加载:"+uoc.toString());
                if (!PatchProxy.applyVoidTwoRefs(p1, p0, this, uod, "7")) {
                   p1.enqueue(new c(this, p0));
                }
             }
          }
       }
    }
    public void setPath(String p0){
       this.e = p0;
    }
}
