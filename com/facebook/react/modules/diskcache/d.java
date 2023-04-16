package com.facebook.react.modules.diskcache.d;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import java.lang.Object;
import com.facebook.react.modules.diskcache.MetaDiskCache$EventType;
import com.facebook.cache.common.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.facebook.cache.common.CacheKey;
import java.io.IOException;
import vd.d;
import java.util.HashMap;
import java.lang.Throwable;
import cb.a;
import cb.c;
import com.facebook.react.modules.diskcache.e;

public class d implements CacheEventListener	// class@0012b4
{
    public final MetaDiskCache a;

    public void d(MetaDiskCache p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,MetaDiskCache$EventType p1,a p2){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, d.class, "9")) {
          return;
       }
       Map map = PatchProxy.applyOneRefs(p2, this, uod, "10");
       if (map != PatchProxyResult.class) {
       }else if(p2 != null){
          String str1 = (p2.getCacheKey() != null)? p2.getCacheKey().a(): p2.b();
          String str2 = (p2.getException() != null)? p2.getException().toString(): "unknownException";
          map = d.e("Key", str1, "Exception", str2);
       }else {
          map = new HashMap();
       }
       IOException exception = (p2 != null)? p2.getException(): null;
       if (p0 == 6) {
          a.d(MetaDiskCache.k, map.toString(), exception);
       }else {
          Class k = MetaDiskCache.k;
          String str = map.toString();
          if (a.a.d(4)) {
             a.a.i(a.j(k), str);
          }
       }
       MetaDiskCache h = this.a.h;
       if (h != null) {
          h.a(p0, p1, map, exception);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       this.a(4, MetaDiskCache$EventType.ON_CLEARED, null);
       return;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.a(4, MetaDiskCache$EventType.ON_MISS, p0);
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       this.a(6, MetaDiskCache$EventType.ON_WRITE_EXCEPTION, p0);
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.a(4, MetaDiskCache$EventType.ON_HIT, p0);
       return;
    }
    public void f(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       this.a(6, MetaDiskCache$EventType.ON_READ_EXCEPTION, p0);
       return;
    }
    public void g(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       this.a(4, MetaDiskCache$EventType.ON_WRITE_ATTEMPT, p0);
       return;
    }
    public void h(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       this.a(4, MetaDiskCache$EventType.ON_EVICTION, p0);
       return;
    }
    public void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       this.a(4, MetaDiskCache$EventType.ON_WRITE_SUCCESS, p0);
       return;
    }
}
