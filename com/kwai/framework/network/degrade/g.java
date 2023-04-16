package com.kwai.framework.network.degrade.g;
import com.kwai.framework.network.degrade.e;
import java.util.Random;
import java.lang.Object;
import com.kwai.framework.network.degrade.h;
import java.util.ArrayList;
import com.kwai.framework.network.degrade.a;
import java.util.List;
import com.kwai.framework.network.degrade.f;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kwai.framework.network.degrade.e$a;
import ekd.k1;
import java.lang.reflect.Type;
import com.kwai.framework.network.degrade.e$b;
import java.util.Objects;
import java.util.Map;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegradeConfig;
import java.lang.Number;
import java.lang.Math;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient$Builder;
import java.util.concurrent.TimeUnit;
import com.yxcorp.retrofit.interceptor.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import com.kwai.framework.network.degrade.DegradeCdnRetryInterceptor;
import d0d.c;
import d0d.g$b;
import okhttp3.EventListener$Factory;
import okhttp3.Response;
import java.lang.StringBuilder;
import java.lang.System;
import okhttp3.Request$Builder;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Call;
import ta6.c;
import java.lang.Throwable;
import q87.c;
import retrofit2.a;
import o56.c;
import o56.a;
import okhttp3.HttpUrl;
import java.net.URL;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
import com.kwai.framework.network.degrade.b;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashSet;
import java.util.Iterator;
import com.yxcorp.utility.TextUtils;
import okhttp3.OkHttpBridge;

public class g implements e	// class@0017c0
{
    public DegradeConfig a;
    public int b;
    public h c;
    public OkHttpClient d;
    public final List e;
    public final a f;
    public g$b g;
    public static g h;
    public static final Random i;

    static {
       g.i = new Random();
    }
    public void g(){
       super();
       this.b = -1;
       this.c = new h();
       ArrayList uArrayList = new ArrayList();
       this.e = uArrayList;
       this.f = new a(uArrayList);
       this.g = f.a;
       this.a = DegradeConfig.EMPTY;
       g.h = this;
    }
    public static g i(){
       Object obj = PatchProxy.apply(null, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1538291188);
    }
    public void a(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       k1.d();
       this.e.add(p0);
       return;
    }
    public synchronized Object b(String p0,Type p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.a(p0, p1);
    }
    public void c(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "3")) {
          return;
       }
       k1.d();
       this.e.remove(p0);
       return;
    }
    public e d(String p0,e$b p1){
       g obj = PatchProxy.applyTwoRefs(p0, p1, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, h.class, "2")) {
          obj.a.put(p0, p1);
       }
       return this;
    }
    public synchronized DegradeConfig e(){
       DegradeConfig eMPTY = DegradeConfig.EMPTY;
       g ta = this.a;
       if (ta != null) {
          eMPTY = ta;
       }
       return eMPTY;
    }
    public synchronized String f(){
       Object obj = PatchProxy.apply(null, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == -1) {
          this.b = k1.b.nextInt(this.a.mConfig.mCdnUrls.size());
       }
       return this.a.mConfig.mCdnUrls.get(this.b);
    }
    public final int g(){
       Object obj = PatchProxy.apply(null, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Math.max(this.a.mConfig.mCdnUrls.size(), 1);
    }
    public OkHttpClient h(){
       OkHttpClient$Builder obj = PatchProxy.apply(null, this, g.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          TimeUnit sECONDS = TimeUnit.SECONDS;
          obj = new OkHttpClient$Builder().connectTimeout(10, sECONDS).readTimeout(10, sECONDS).writeTimeout(10, sECONDS);
          c uoc = new c();
          uoc.c(this.g);
          this.d = obj.addInterceptor(new ConvertToIOExceptionInterceptor()).addInterceptor(new DegradeCdnRetryInterceptor()).eventListenerFactory(uoc.a()).build();
       }
       return this.d;
    }
    public final Response j(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Request request = new Request$Builder().url(p0+System.currentTimeMillis()).cacheControl(CacheControl.FORCE_NETWORK).build();
       try{
          return g.i().h().newCall(request).execute();
       }catch(java.lang.Exception e4){
          c.C().e("Degrade", "", e4);
          return null;
       }
    }
    public synchronized void k(DegradeConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       if (p0 == null) {
          p0 = DegradeConfig.EMPTY;
       }
       this.a = p0;
       this.b = -1;
       this.f.b(p0);
       return;
    }
    public a l(a p0){
       g og1;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, og, "15");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       if (a.a().b()) {
          return obj1;
       }
       obj2 = p0.request().url().url().getPath();
       _monitor_enter(this);
       Object obj3 = PatchProxy.applyOneRefs(obj2, obj, og, "11");
       if (obj3 != patchProxyRe) {
          _monitor_exit(this);
       }else {
          obj3 = null;
          og1 = obj.a;
          if (og1 != null) {
             DegradeConfig$UrlDegradeConfig mUriConfig = og1.mConfig.mUriConfig;
             if (mUriConfig != null) {
                obj3 = mUriConfig.get(obj2);
             }
          }
          _monitor_exit(this);
       }
       if (obj3 != null) {
          OkHttpClient okHttpClient = this.h();
          og1 = g.i();
          Request request = p0.request();
          Objects.requireNonNull(og1);
          Object obj4 = PatchProxy.applyTwoRefs(obj3, request, og1, og, "14");
          if (obj4 != patchProxyRe) {
          }else {
             og = og1.c;
             Objects.requireNonNull(og);
             Matcher obj5 = PatchProxy.applyTwoRefs(obj3, request, og, h.class, "1");
             if (obj5 != patchProxyRe) {
                obj4 = obj5;
             }else {
                obj5 = h.b.matcher(obj3.mUrlTemplate);
                HashSet hashSet = new HashSet();
                while (obj5.find()) {
                   hashSet.add(obj5.group(1));
                }
                DegradeConfig$UrlDegrade mUrlTemplate = obj3.mUrlTemplate;
                if (!hashSet.isEmpty()) {
                   Iterator iterator = hashSet.iterator();
                   DegradeConfig$UrlDegrade urlDegrade = mUrlTemplate;
                   while (iterator.hasNext()) {
                      Object obj6 = iterator.next();
                      String obj7 = obj6;
                      Iterator iterator1 = iterator;
                      Object obj8 = obj6;
                      obj7 = PatchProxy.applyThreeRefs(obj7, obj3, request, og, h.class, "3");
                      if (obj7 != patchProxyRe) {
                      }else {
                         e$b uob = og.a.get(obj8);
                         if (uob == null) {
                            uob = h.c;
                         }
                         obj7 = uob.a(obj3, request, obj8);
                      }
                      if (TextUtils.x(obj7)) {
                         obj7 = "";
                      }
                      urlDegrade = urlDegrade.replace("{"+obj8+"}", obj7);
                      iterator = iterator1;
                   }
                   mUrlTemplate = urlDegrade;
                }
                obj4 = new Request$Builder().url(mUrlTemplate).tag(request.tag()).cacheControl(CacheControl.FORCE_NETWORK).build();
             }
          }
          return new b(obj1, obj3, OkHttpBridge.newRealCall(okHttpClient, obj4));
       }else {
          return obj1;
       }
    }
}
