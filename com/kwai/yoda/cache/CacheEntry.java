package com.kwai.yoda.cache.CacheEntry;
import com.kwai.yoda.cache.CacheEntry$a;
import nsd.u;
import com.kwai.yoda.cache.CacheEntry$Companion$caches$2;
import msd.a;
import qrd.p;
import qrd.s;
import iz7.i;
import java.lang.String;
import java.lang.System;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Map;
import com.kwai.yoda.cache.CacheEntry$processingRequest$2;
import iz7.j;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import yz7.r;
import org.json.JSONObject;
import com.kuaishou.webkit.WebResourceResponse;
import java.lang.CharSequence;
import zsd.u;
import java.io.InputStream;
import isd.a;
import crd.b;
import androidx.collection.LruCache;
import java.lang.ref.SoftReference;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import com.kwai.yoda.cache.CacheEntry$b;
import erd.g;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.middleware.azeroth.Azeroth2;
import o97.a;
import o97.a$a;
import java.util.concurrent.TimeUnit;
import sx7.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import tb7.j;
import java.util.LinkedHashMap;
import java.io.ByteArrayInputStream;

public abstract class CacheEntry	// class@001198
{
    public b a;
    public long b;
    public final Map c;
    public Map d;
    public byte[] e;
    public String f;
    public String g;
    public String h;
    public int i;
    public int j;
    public final p k;
    public final i l;
    public final String m;
    public final long n;
    public static final p o;
    public static final CacheEntry$a p;

    static {
       CacheEntry.p = new CacheEntry$a(null);
       CacheEntry.o = s.c(CacheEntry$Companion$caches$2.INSTANCE);
    }
    public void CacheEntry(i p0,String p1,int p2,long p3,int p4,u p5){
       if (p4 & 0x02) {
          p1 = null;
       }
       if (p4 & 0x04) {
          p2 = 0;
       }
       if (p4 & 0x08) {
          p3 = System.currentTimeMillis();
       }
       a.q(p0, "request");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p3;
       this.b = -1;
       Map map = p0.c();
       a.h(map, "request.requestHeaders");
       this.c = map;
       this.g = "UTF-8";
       this.i = 200;
       this.j = p2;
       this.k = s.c(CacheEntry$processingRequest$2.INSTANCE);
       return;
    }
    public CacheEntry a(j p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CacheEntry.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "response");
       long l = System.currentTimeMillis();
       long l1 = l - this.n;
       r.b("YodaXCacheEntry", "[YodaXCacheEntry] response duration "+this.m+": "+l1);
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("url", this.m);
       jSONObject.put("process_duration", l1);
       this.d = p0.getResponseHeaders();
       this.f = p0.getMimeType();
       String encoding = p0.getEncoding();
       String str = null;
       if (encoding == null || !(u.S1(encoding) ^ 0x01)) {
          encoding = str;
       }
       this.g = encoding;
       this.i = p0.getStatusCode();
       this.h = p0.getReasonPhrase();
       r.b("YodaXCacheEntry", "[YodaXCacheEntry]readStart: "+this.m);
       InputStream data = p0.getData();
       a.h(data, "inputStream");
       this.e = a.p(data);
       data.close();
       jSONObject.put("read_duration", (System.currentTimeMillis() - l));
       this.j(3);
       r.b("YodaXCacheEntry", "[YodaXCacheEntry]readComplete: "+this.m);
       return this;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CacheEntry.class, "7")) {
          return;
       }
       CacheEntry ta = this.a;
       if (ta != null) {
          if (!(ta.isDisposed() ^ 0x01)) {
             ta = objArray;
          }
          if (ta != null) {
             ta.dispose();
          }
       }
       this.a = objArray;
       ta = this.m;
       if (ta != null) {
          r.b("YodaXCacheEntry", "[YodaXCacheEntry] expire cache removed:"+this.m);
          CacheEntry.p.a().remove(ta);
       }
       return;
    }
    public abstract long c();
    public final int d(){
       return this.j;
    }
    public abstract String e();
    public final String f(){
       return this.f;
    }
    public final PublishSubject g(){
       Object obj = PatchProxy.apply(null, this, CacheEntry.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public abstract boolean h(boolean p0);
    public final t i(){
       t obj = PatchProxy.apply(null, this, CacheEntry.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g().doOnError(new CacheEntry$b(this));
       a.h(obj, "processingRequest.doOnEr¡­\n      doOnExpire\(\)\n    }");
       return obj;
    }
    public final void j(int p0){
       boolean b;
       CacheEntry uCacheEntry = CacheEntry.class;
       if (PatchProxy.isSupport(uCacheEntry) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCacheEntry, "1")) {
          return;
       }
       this.j = p0;
       if (!PatchProxy.isSupport(uCacheEntry) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uCacheEntry, "5")) {
          String str = "YodaXCacheEntry";
          if (p0) {
             if (p0 == 3) {
                this.b = System.currentTimeMillis();
                if (this.g().d()) {
                   this.g().onNext(this.k());
                   Object obj = PatchProxy.apply(null, this, uCacheEntry, "4");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else {
                      a uoa = Azeroth2.B.q();
                      b = (uoa != null)? a$a.b(uoa, null, "yoda_cache_control_default", true, 1, null): true;
                   }
                   if (!this.h(b)) {
                      r.b(str, "[YodaXCacheEntry] response do not store");
                      this.b();
                   }
                }
                this.a = t.timer(this.c(), TimeUnit.SECONDS).subscribe(new a(this));
             }
          }else {
             r.b(str, "[YodaXCacheEntry] step to unkonwn:"+this.m);
             this.g().onError(new RuntimeException("response do not store"));
          }
       }
       return;
    }
    public final WebResourceResponse k(){
       String obj = PatchProxy.apply(null, this, CacheEntry.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CacheEntry tf = this.f;
       CacheEntry tg = this.g;
       CacheEntry ti = this.i;
       obj = j.b(this.h);
       if (obj == null) {
          obj = "OK";
       }
       String str = obj;
       CacheEntry td = this.d;
       if (td == null) {
          td = new LinkedHashMap();
       }
       WebResourceResponse webResourceR = new WebResourceResponse(tf, tg, ti, str, td, new ByteArrayInputStream(this.e));
       return td;
    }
}
