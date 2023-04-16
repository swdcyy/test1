package com.facebook.react.modules.diskcache.c;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import java.lang.Object;
import com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory;
import java.lang.Class;
import java.lang.String;
import java.lang.Throwable;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.Enum;
import cb.a;
import com.facebook.react.modules.diskcache.MetaDiskCache$EventType;
import java.util.Map;
import vd.d;
import com.facebook.react.modules.diskcache.e;

public class c implements CacheErrorLogger	// class@0012b3
{
    public final MetaDiskCache a;

    public void c(MetaDiskCache p0){
       this.a = p0;
       super();
    }
    public void a(CacheErrorLogger$CacheErrorCategory p0,Class p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "1")) {
          return;
       }
       a.c(MetaDiskCache.k, "Error:"+p0.name()+":"+p2);
       MetaDiskCache h = this.a.h;
       if (h != null) {
          MetaDiskCache$EventType eXCEPTION = MetaDiskCache$EventType.EXCEPTION;
          String str = p0.name();
          String str1 = (p3 != null)? p3.toString(): "unknown Exception";
          h.a(6, eXCEPTION, d.f("Category", str, "Message", p2, "Exception", str1), p3);
       }
       return;
    }
}
