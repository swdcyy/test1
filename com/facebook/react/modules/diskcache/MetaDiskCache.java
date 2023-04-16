package com.facebook.react.modules.diskcache.MetaDiskCache;
import java.lang.StringBuilder;
import java.io.File;
import java.lang.String;
import com.facebook.react.modules.diskcache.b;
import ua.a;
import com.facebook.react.modules.diskcache.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import od.a;
import ed.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ed.u;
import ed.u$b;
import ne.j;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import vc.l;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import com.facebook.react.modules.diskcache.c;
import com.facebook.react.modules.diskcache.d;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheErrorLogger;
import ua.a$b;
import vc.e;
import com.facebook.cache.disk.b;
import com.facebook.cache.disk.c;
import vc.c;
import com.facebook.common.memory.b;
import com.facebook.common.memory.c;
import ne.k;
import android.content.Context;
import ne.e;
import ab.h;
import com.facebook.cache.common.CacheKey;
import java.lang.Boolean;
import java.util.Map;
import ne.a;
import java.lang.System;
import java.lang.Integer;
import cb.a;
import com.facebook.cache.disk.f;
import ta.d;
import com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import com.facebook.common.references.a;
import ne.b;
import com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory;
import java.lang.Throwable;
import ne.g;
import java.lang.Runnable;
import sa.a;
import sa.b;
import java.io.InputStream;
import java.io.FileInputStream;
import com.facebook.react.modules.diskcache.a;
import fb.c;
import com.facebook.imagepipeline.memory.d;
import bolts.Task;
import ne.i;
import java.util.concurrent.Callable;
import java.lang.Exception;
import com.facebook.react.modules.diskcache.MetaDiskCache$a;
import com.facebook.cache.common.d;

public class MetaDiskCache	// class@0012b0
{
    public final f a;
    public final b b;
    public final c c;
    public final Executor d;
    public final k e;
    public final v f;
    public final Map g;
    public e h;
    public CacheErrorLogger i;
    public CacheEventListener j;
    public static final Class k;
    public static final String l;
    public static int m;
    public static Executor n;
    public static final c o;

    static {
       MetaDiskCache.k = MetaDiskCache.class;
       MetaDiskCache.l = File.separator+"MetaDiskCache";
       MetaDiskCache.m = 0x6400000;
       MetaDiskCache.o = b.a;
    }
    public void MetaDiskCache(a p0,String p1,e p2){
       v ov = this;
       String str = p1;
       MetaDiskCache metaDiskCach = MetaDiskCache.class;
       super();
       int i = 1;
       boolean b = (p0 != null || str)? true: false;
       a.a(b);
       Object[] objArray = null;
       u ou = PatchProxy.apply(objArray, ov, metaDiskCach, "30");
       if (ou != PatchProxyResult.class) {
       }else {
          u$b uob = u.l();
          uob.d = new j(ov);
          ou = uob.a();
       }
       v ov1 = new v(ou);
       ov.f = ov1;
       ov.g = new ConcurrentHashMap();
       _monitor_enter(this);
       Executor uExecutor = PatchProxy.apply(objArray, ov, metaDiskCach, "27");
       if (uExecutor != PatchProxyResult.class) {
          _monitor_exit(this);
       }else if(MetaDiskCache.n == null){
          ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(1, 4, 180, TimeUnit.SECONDS, new LinkedBlockingQueue(), new l(10, "MetaDiskCacheIOExecutor", i));
          MetaDiskCache.n = uExecutor;
       }
       uExecutor = MetaDiskCache.n;
       _monitor_exit(this);
       ov.d = uExecutor;
       if (!PatchProxy.applyVoid(null, ov, metaDiskCach, "28")) {
          ov.i = new c(ov);
          ov.j = new d(ov);
       }
       a uoa = (p0 == null)? MetaDiskCache.a(str, ov.j, ov.i).a(): p0;
       ov.a = c.b(uoa, new e().a(uoa), uExecutor);
       ov.b = ov1.f(i);
       ov.c = ov1.g();
       ov.h = p2;
       k ok = PatchProxy.apply(null, null, k.class, "1");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k();
       }
       ov.e = ok;
       return;
    }
    public static a$b a(String p0,CacheEventListener p1,CacheErrorLogger p2){
       a$b obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, MetaDiskCache.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.c(null);
       obj.b(new e(p0));
       obj.d((long)MetaDiskCache.m);
       obj.a = 1;
       obj.i = p1;
       obj.h = p2;
       obj.c(1);
       return obj;
    }
    public static MetaDiskCache c(a p0,String p1,e p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, MetaDiskCache.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MetaDiskCache(p0, p1, p2);
    }
    public boolean b(CacheKey p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MetaDiskCache obj = PatchProxy.applyOneRefs(p0, this, MetaDiskCache.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.e;
       _monitor_enter(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, k.class, "9");
       boolean b = true;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
          _monitor_exit(obj);
       }else {
          a.c(p0);
          if (!obj.a.containsKey(p0)) {
             _monitor_exit(obj);
          }else {
             a uoa = obj.a.get(p0);
             _monitor_enter(uoa);
             if (!a.o(uoa)) {
                obj.a.remove(p0);
                Object[] objArray = new Object[]{Integer.valueOf(System.identityHashCode(uoa)),p0.a(),Integer.valueOf(System.identityHashCode(p0))};
                a.v(k.b, "Found closed reference %d for key %s \(%d\)", objArray);
                _monitor_exit(uoa);
                _monitor_exit(obj);
             }else {
                _monitor_exit(uoa);
                _monitor_exit(obj);
                b1 = true;
             }
          }
          b1 = false;
       }
       if (!b1 && !this.a.i(p0)) {
          b = false;
       }
       return b;
    }
    public a d(CacheKey p0){
       a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, MetaDiskCache.class, "14");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = this.e.a(p0);
          if (obj != null) {
             obj.d = true;
             a.n(MetaDiskCache.k, "Found entry for %s in staging area", p0.a());
          }else {
             a.n(MetaDiskCache.k, "Did not find entry for %s in staging area", p0.a());
             obj = 0;
             PooledByteBuffer pooledByteBu = this.f(p0);
             if (pooledByteBu == null) {
                return obj;
             }else {
                a uoa = a.o(pooledByteBu);
                Object obj1 = PatchProxy.applyOneRefs(uoa, obj, a.class, "1");
                if (obj1 != patchProxyRe) {
                   uoa1 = obj1;
                }else {
                   uoa1 = new a(uoa, obj);
                   if (!uoa1.p()) {
                      uoa1 = obj;
                   }
                }
                a.f(uoa);
                boolean b = uoa1;
             }
          }
          return obj;
       }catch(java.lang.Exception e6){
          this.i.a(CacheErrorLogger$CacheErrorCategory.GENERIC_IO, MetaDiskCache.k, "getSync", e6);
          return obj;
       }
    }
    public void e(CacheKey p0,a p1){
       Class k;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MetaDiskCache.class, "17")) {
          return;
       }
       a.c(p0);
       a.a(a.o(p1));
       MetaDiskCache te = this.e;
       _monitor_enter(te);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, te, k.class, "2")) {
          _monitor_exit(te);
       }else {
          a.c(p0);
          a.a(a.o(p1));
          a.b(te.a.put(p0, a.a(p1)));
          te.b();
          _monitor_exit(te);
       }
       try{
          this.d.execute(new g(this, p0, p1));
       }catch(java.lang.Exception e0){
          k = MetaDiskCache.k;
          Object[] objArray = new Object[]{p0.a()};
          a.w(k, e0, "Failed to schedule disk-cache write for %s", objArray);
          this.i.a(CacheErrorLogger$CacheErrorCategory.GENERIC_IO, k, "put", e0);
          this.e.d(p0, p1);
          a.b(p1);
       }
       return;
    }
    public final PooledByteBuffer f(CacheKey p0){
       Class obj = PatchProxy.applyOneRefs(p0, this, MetaDiskCache.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = MetaDiskCache.k;
          a.n(obj, "Disk cache read for %s", p0.a());
          a uoa = this.a.c(p0);
          if (!uoa instanceof b) {
             a.n(obj, "Disk cache miss for %s", p0.a());
             return null;
          }else {
             a.n(obj, "Found entry in disk cache for %s", p0.a());
             InputStream inputStream = uoa.a();
             a.a(inputStream instanceof FileInputStream);
             a uoa1 = new a(inputStream, (int)uoa.size());
             uoa = a.p(uoa1, MetaDiskCache.o);
             d uod = new d(uoa, uoa1.getSize());
             if (inputStream != null) {
                inputStream.close();
             }
             a.n(obj, "Successful read from disk cache for %s", p0.a());
             return uod;
          }
       }catch(java.io.IOException e0){
          Object[] objArray = new Object[]{p0.a()};
          a.w(MetaDiskCache.k, e0, "Exception reading from cache for %s", objArray);
          throw e0;
       }
    }
    public Task g(CacheKey p0){
       MetaDiskCache obj = PatchProxy.applyOneRefs(p0, this, MetaDiskCache.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.c(p0);
       obj = this.e;
       try{
          obj.c(p0);
          return Task.call(new i(this, p0), this.d);
       }catch(java.lang.Exception e0){
          Class k = MetaDiskCache.k;
          Object[] objArray = new Object[]{p0.a()};
          a.w(k, e0, "Failed to schedule disk-cache remove for %s", objArray);
          this.i.a(CacheErrorLogger$CacheErrorCategory.GENERIC_IO, k, "remove", e0);
          return Task.forError(e0);
       }
    }
    public void h(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MetaDiskCache.class, "4")) {
          return;
       }
       try{
          this.d.execute(p0);
       }catch(java.lang.Exception e4){
          a.c(MetaDiskCache.k, "runOnDiskCacheThread: "+e4.toString());
       }
       return;
    }
    public void i(CacheKey p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MetaDiskCache.class, "26")) {
          return;
       }
       Class k = MetaDiskCache.k;
       String str = p0.a();
       String str1 = "About to write to disk-cache for key %s";
       try{
          a.n(k, str1, str);
          this.a.k(p0, new MetaDiskCache$a(this, p1));
          a.n(k, "Successful disk-cache write for key %s", p0.a());
       }catch(java.lang.Exception e6){
          Class k1 = MetaDiskCache.k;
          this.i.a(CacheErrorLogger$CacheErrorCategory.GENERIC_IO, k1, "writeToDiskCache", e6);
          Object[] objArray = new Object[]{p0.a()};
          a.f(k1, e6, "Failed to write to disk-cache for key %s", objArray);
       }
       return;
    }
}
