package com.kwai.yoda.cache.YodaXCache;
import com.kwai.yoda.cache.YodaXCache$requestProcessor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.yoda.cache.YodaXCache$offlineMatchers$2;
import com.kwai.yoda.cache.YodaXCache$bindMatchers$2;
import com.kwai.yoda.cache.YodaXCache$globalWebViewUA$2;
import com.kwai.yoda.cache.YodaXCache$webViewUAJar$2;
import java.util.LinkedList;
import com.kwai.yoda.cache.YodaXCache$firstLoad$2;
import rb7.c;
import rx7.r;
import java.lang.Class;
import brd.t;
import com.kwai.yoda.cache.YodaXCache$a;
import com.kwai.yoda.cache.YodaXCache$b;
import erd.g;
import crd.b;
import java.lang.Object;
import iz7.i;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.util.List;
import xz7.c;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.LaunchModelInternal;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import kotlin.jvm.internal.a;
import com.kuaishou.webkit.URLUtil;
import yz7.m;
import java.lang.StringBuilder;
import yz7.r;
import com.kwai.yoda.cache.CacheEntry;
import androidx.collection.LruCache;
import com.kwai.yoda.cache.CacheEntry$a;
import java.lang.ref.SoftReference;
import sz7.l;
import com.kwai.yoda.session.logger.webviewload.XCacheInfo;
import sx7.x$a;
import com.kuaishou.webkit.WebResourceResponse;
import sx7.l;
import sx7.m;
import java.lang.Boolean;
import iz7.j;
import gy7.a;
import gy7.a$a;
import sx7.d;
import java.lang.System;
import sx7.n;
import java.util.concurrent.Callable;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import sx7.o;
import sx7.p;
import java.util.Objects;
import com.kwai.yoda.bridge.c;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import com.kwai.yoda.Yoda;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import nz7.e;
import gz7.b;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import zsd.u;
import com.kwai.yoda.cache.YodaXCache$c;
import ub7.f;
import java.util.HashMap;
import android.widget.AbsoluteLayout;
import java.lang.Integer;
import com.kwai.yoda.cache.KsBlinkMemoryHelper;
import com.kuaishou.webkit.extension.MemoryCacheInjector;
import sx7.w;
import sx7.h;
import java.util.HashSet;
import com.kwai.yoda.cache.YodaXCache$d;
import px7.e;
import iz7.d;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.TypeCastException;
import java.lang.Long;
import trd.y;
import sz7.h;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import com.kuaishou.webkit.WebSettings;
import uz7.a;
import com.kwai.yoda.store.sp.YodaSharedPreferences;
import xb7.a;
import sx7.i;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Ref$ObjectRef;
import sx7.x;
import sx7.x$b;
import tb7.a;
import vx7.a;
import sx7.r;
import brd.a0;
import sx7.u;
import android.os.SystemClock;
import sx7.v;
import com.kwai.yoda.cache.YodaXCache$prepareWebResourceResponse$6;
import tb7.b;

public final class YodaXCache	// class@0011a6
{
    public static final p a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static boolean e;
    public static final p f;
    public static f g;
    public static e h;
    public static b i;
    public static b j;
    public static final LinkedList k;
    public static final p l;
    public static long m;
    public static final YodaXCache n;

    static {
       YodaXCache.n = new YodaXCache();
       YodaXCache.a = s.c(YodaXCache$requestProcessor$2.INSTANCE);
       YodaXCache.b = s.c(YodaXCache$offlineMatchers$2.INSTANCE);
       YodaXCache.c = s.c(YodaXCache$bindMatchers$2.INSTANCE);
       YodaXCache.d = s.c(YodaXCache$globalWebViewUA$2.INSTANCE);
       YodaXCache.f = s.c(YodaXCache$webViewUAJar$2.INSTANCE);
       YodaXCache.k = new LinkedList();
       YodaXCache.l = s.c(YodaXCache$firstLoad$2.INSTANCE);
       YodaXCache.m = -1;
       c.c.b(r.class).subscribe(YodaXCache$a.b, YodaXCache$b.b);
    }
    public void YodaXCache(){
       super();
    }
    public static t m(YodaXCache p0,i p1,YodaBaseWebView p2,List p3,c p4,int p5,Object p6){
       List hyIds;
       List list;
       l sessionPageI;
       XCacheInfo xCacheInfo;
       i oi = p1;
       t ot = null;
       YodaBaseWebView yodaBaseWebV = (p5 & 0x02)? ot: p2;
       if (p5 & 0x04) {
          if (yodaBaseWebV) {
             LaunchModel launchModel = yodaBaseWebV.getLaunchModel();
             if (launchModel != null) {
                hyIds = launchModel.getHyIds();
             label_001e :
                list = hyIds;
             }
          }
          hyIds = ot;
          goto label_001e ;
       }else {
          list = p3;
       }
       c uoc = (p5 & 0x08)? ot: p4;
       String obj = PatchProxy.applyFourRefs(p1, yodaBaseWebV, list, uoc, p0, YodaXCache.class, "20");
       if (obj != PatchProxyResult.class) {
          ot = obj;
       }else {
          obj = p1.d().toString();
          a.h(obj, "request.url.toString\(\)");
          if (URLUtil.isNetworkUrl(obj)) {
             String str = m.a(obj);
             char c = '.';
             String str1 = "YodaXCache";
             r.b(str1, "[YodaXCache]match try with "+str+c);
             SoftReference softReferenc = CacheEntry.p.a().get(str);
             int i = 1;
             if (softReferenc != null) {
                Object obj1 = softReferenc.get();
                if (obj1 != null) {
                   r.b(str1, "[YodaXCache]match in cache: "+str+" with status: "+obj1.d());
                   int i1 = obj1.d();
                   if (i1 != i) {
                      if (i1 != 2) {
                         if (i1 != 3) {
                            r.b(str1, "[YodaXCache] cache status unknown"+str);
                            YodaXCache.n.r(yodaBaseWebV, obj1);
                            if (yodaBaseWebV != null) {
                               sessionPageI = yodaBaseWebV.getSessionPageInfoModule();
                               if (sessionPageI != null) {
                                  xCacheInfo = sessionPageI.e();
                                  if (xCacheInfo != null) {
                                     xCacheInfo.mainDocCancelReason = "cache_expire";
                                  }
                               }
                            }
                            obj1.b();
                         }else {
                            YodaXCache n1 = YodaXCache.n;
                            YodaXCache.q(n1, yodaBaseWebV, p1, obj1.e(), "_ready", null, null, 48, null);
                            n1.r(yodaBaseWebV, obj1);
                            ot = t.just(obj1.k());
                         }
                      }else {
                         YodaXCache.q(YodaXCache.n, yodaBaseWebV, p1, "proxy", "_merge", null, null, 48, null);
                         ot = obj1.i().doAfterNext(new l(obj1, str, yodaBaseWebV, oi)).doOnError(new m(obj1, str, yodaBaseWebV, oi));
                      }
                   }else {
                      YodaXCache.q(YodaXCache.n, yodaBaseWebV, p1, "hy", "_merge", null, null, 48, null);
                      ot = obj1.i();
                   }
                }
             }
             Boolean fALSE = Boolean.FALSE;
             String str2 = "url";
             if (a.g(p1.a().offlinenable, fALSE) ^ i) {
                a.h(str, str2);
                j oj = p0.e(str, yodaBaseWebV, list);
                if (oj != null) {
                   YodaXCache n = YodaXCache.n;
                   YodaXCache yodaXCache = n;
                   YodaXCache.q(yodaXCache, yodaBaseWebV, p1, "hy", null, null, null, 56, null);
                   ot = t.just(n.d(oi, str).a(oj).k());
                }
             }else if(yodaBaseWebV != null){
                sessionPageI = yodaBaseWebV.getSessionPageInfoModule();
                if (sessionPageI != null) {
                   xCacheInfo = sessionPageI.e();
                   if (xCacheInfo != null) {
                      xCacheInfo.offlineEnable = fALSE;
                   }
                }
             }
             if (!p1.h()) {
                r.b(str1, "[YodaXCache] skip_net_because: useKs="+a.b.b()+" or allow proxy="+p1.f()+c);
                YodaXCache.q(p0, yodaBaseWebV, p1, "system", null, null, p1.a(), 24, 0);
             }else {
                a.h(str, str2);
                d uod = p0.c(str, oi);
                uod.l(System.currentTimeMillis());
                t.fromCallable(new n(str, uod, uoc, oi)).subscribeOn(AzerothSchedulers.b.d()).subscribe(new o(str, uod), new p(uod));
                YodaXCache.q(p0, yodaBaseWebV, p1, "proxy", null, null, null, 56, 0);
                ot = uod.i();
             }
          }
       }
       return ot;
    }
    public static void q(YodaXCache p0,YodaBaseWebView p1,i p2,String p3,String p4,String p5,x$a p6,int p7,Object p8){
       c loadEventLog;
       l sessionPageI;
       XCacheInfo xCacheInfo;
       p8 = "";
       if (p7 & 0x08) {
          p4 = p8;
       }
       Boolean uBoolean = null;
       if (!(p7 & 0x10)) {
          p8 = uBoolean;
       }
       if (p7 & 0x20) {
          p6 = uBoolean;
       }
       Objects.requireNonNull(p0);
       c uoc = c.class;
       YodaXCache yodaXCache = YodaXCache.class;
       int i = 1;
       if (PatchProxy.isSupport(yodaXCache)) {
          Object[] objArray = new Object[]{p1,p2,p3,p4,p8,p6};
          if (!PatchProxy.applyVoid(objArray, p0, yodaXCache, "28")) {
          label_003f :
             String str = p2.d().toString();
             a.h(str, "request.url.toString\(\)");
             r.b("YodaXCache", "[YodaXCache]intercept_request_result:"+p3+" state:"+p4);
             if (!p2.g()) {
                p3 = p3+p4;
                if (p1 != null) {
                   loadEventLog = p1.getLoadEventLogger();
                   if (loadEventLog != null && !PatchProxy.applyVoidOneRefs(p3, loadEventLog, uoc, "15")) {
                      AtomicInteger uAtomicInteg1 = loadEventLog.j.get(p3);
                      if (uAtomicInteg1 == null) {
                         uAtomicInteg1 = new AtomicInteger(0);
                         loadEventLog.j.put(p3, uAtomicInteg1);
                      }
                      uAtomicInteg1.incrementAndGet();
                   }
                }
                Yoda yoda = Yoda.get();
                a.h(yoda, "Yoda.get\(\)");
                if (yoda.isDebugToolEnable() && p1 != null) {
                   loadEventLog = p1.getLoadEventLogger();
                   if (loadEventLog != null && !PatchProxy.applyVoidTwoRefs(p3, str, loadEventLog, uoc, "16")) {
                      Set set = loadEventLog.k.get(p3);
                      if (set == null) {
                         set = new CopyOnWriteArraySet();
                         loadEventLog.k.put(p3, set);
                      }
                      set.add(str);
                   }
                }
                if (p1 != null) {
                   sessionPageI = p1.getSessionPageInfoModule();
                   if (sessionPageI != null) {
                      Map map = sessionPageI.a();
                      if (map != null) {
                         AtomicInteger uAtomicInteg = map.get(p3);
                         if (uAtomicInteg != null) {
                            uAtomicInteg.incrementAndGet();
                         }else if(p1 != null){
                            sessionPageI = p1.getSessionPageInfoModule();
                            if (sessionPageI != null) {
                               map = sessionPageI.a();
                               if (map != null) {
                                  uAtomicInteg = map.put(p3, new AtomicInteger(i));
                               }
                            }
                         }
                      }else {
                         goto label_00fa ;
                      }
                   }else {
                      goto label_00fa ;
                   }
                }else {
                   goto label_00fa ;
                }
                if (p2.e()) {
                   if (p1 != null) {
                      e sessionLogge = p1.getSessionLogger();
                      if (sessionLogge != null) {
                         sessionLogge.w("load_request");
                      }
                   }
                   if (p1 != null) {
                      sessionPageI = p1.getSessionPageInfoModule();
                      if (sessionPageI != null) {
                         sessionPageI.k(p3);
                      }
                   }
                   if (p8.length() <= 0) {
                      i = 0;
                   }
                   if (!i) {
                      p8 = uBoolean;
                   }
                   if (p1 != null) {
                      sessionPageI = p1.getSessionPageInfoModule();
                      if (sessionPageI != null) {
                         xCacheInfo = sessionPageI.e();
                         if (xCacheInfo != null) {
                            xCacheInfo.mainDocCancelReason = p8;
                         }
                      }
                   }
                   if (p1 != null) {
                      sessionPageI = p1.getSessionPageInfoModule();
                      if (sessionPageI != null) {
                         xCacheInfo = sessionPageI.e();
                         if (xCacheInfo != null) {
                            if (p6 != null) {
                               uBoolean = Boolean.valueOf(p6.a());
                            }
                            xCacheInfo.noSwitchConfig = uBoolean;
                         }
                      }
                   }
                }
             }
          }
       }else {
          goto label_003f ;
       }
       return;
    }
    public final b a(YodaBaseWebView p0,List p1){
       b uob;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, YodaXCache.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = CollectionsKt___CollectionsKt.V2(p1, null, null, null, 0, null, null, 63, null);
       if (u.S1(obj)) {
          return null;
       }
       if (this.j().get(obj) != null) {
          uob = YodaXCache.n.j().remove(obj);
          if (uob != null) {
          label_004a :
             a.h(uob, "offlineMatchers[hyKey]?.\x20\x02tcher\(Supplier { hyIds }\)\x00");
             this.f().put(Integer.valueOf(p0.hashCode()), uob);
             return uob;
          }
       }
       uob = new b(new YodaXCache$c(p1));
       goto label_004a ;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, YodaXCache.class, "7")) {
          return;
       }
       CacheEntry.p.a().evictAll();
       KsBlinkMemoryHelper d = KsBlinkMemoryHelper.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoid(null, d, KsBlinkMemoryHelper.class, "5")) {
          MemoryCacheInjector a = KsBlinkMemoryHelper.a;
          if (a != null) {
             a.removeAllInjectedResources();
          }
       }
       return;
    }
    public final d c(String p0,i p1){
       d obj = PatchProxy.applyTwoRefs(p0, p1, this, YodaXCache.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d(p1, p0, 2);
       w.a(CacheEntry.p.a(), p0, new SoftReference(obj));
       return obj;
    }
    public final CacheEntry d(i p0,String p1){
       h obj = PatchProxy.applyTwoRefs(p0, p1, this, YodaXCache.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h(p0, p1, 1);
       w.a(CacheEntry.p.a(), p1, new SoftReference(obj));
       return obj;
    }
    public final j e(String p0,YodaBaseWebView p1,List p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, YodaXCache.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b uob = this.i(p1, p2);
       j oj = (uob != null)? uob.a(new i(Uri.parse(p0)), p1): null;
       return oj;
    }
    public final HashMap f(){
       Object obj = PatchProxy.apply(null, this, YodaXCache.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaXCache.c.getValue();
    }
    public final HashSet g(){
       Object obj = PatchProxy.apply(null, this, YodaXCache.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaXCache.l.getValue();
    }
    public final String h(){
       Object obj = PatchProxy.apply(null, this, YodaXCache.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaXCache.d.getValue();
    }
    public final b i(YodaBaseWebView p0,List p1){
       b uob;
       YodaXCache obj = PatchProxy.applyTwoRefs(p0, p1, this, YodaXCache.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null) {
          if (p0 != null) {
             obj = YodaXCache.n;
             uob = obj.f().get(Integer.valueOf(p0.hashCode()));
             if (uob == null) {
                uob = obj.a(p0, p1);
             }
          }else {
             String str = CollectionsKt___CollectionsKt.V2(p1, null, null, null, 0, null, null, 63, null);
             obj = YodaXCache.n;
             uob = obj.j().get(str);
             if (uob == null) {
                uob = new b(new YodaXCache$d(p1));
                w.a(obj.j(), str, uob);
             }
          }
       }else {
          uob = null;
       }
       return uob;
    }
    public final LruCache j(){
       Object obj = PatchProxy.apply(null, this, YodaXCache.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaXCache.b.getValue();
    }
    public final b k(YodaBaseWebView p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaXCache.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "webView");
       return this.f().get(Integer.valueOf(p0.hashCode()));
    }
    public final f l(){
       return YodaXCache.g;
    }
    public final e n(){
       Object obj = PatchProxy.apply(null, this, YodaXCache.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaXCache.f.getValue();
    }
    public final void o(d p0,XCacheInfo p1){
       boolean i2;
       int len;
       int i3;
       object oobject2;
       Object obj = p0;
       Long longx = p1;
       if (PatchProxy.applyVoidTwoRefs(obj, longx, this, YodaXCache.class, "17")) {
          return;
       }
       byte[] uobyteArray = p0.d();
       int i = 0;
       int i1 = 1;
       if (uobyteArray != null) {
          i2 = (!uobyteArray.length)? 1: 0;
          if ((i2 ^ i1) == i1) {
             longx.f.addAll(obj.a);
          }
       }
       long l = System.currentTimeMillis();
       KsBlinkMemoryHelper d = KsBlinkMemoryHelper.d;
       String[] stringArray = p0.f();
       String str = p0.e();
       Map map = p0.g();
       byte[] uobyteArray1 = p0.d();
       byte[] uobyteArray2 = p0.a();
       Objects.requireNonNull(d);
       KsBlinkMemoryHelper ksBlinkMemor = KsBlinkMemoryHelper.class;
       object oobject = null;
       if (PatchProxy.isSupport(ksBlinkMemor)) {
          Object[] objArray = new Object[]{stringArray,str,map,uobyteArray1,uobyteArray2,oobject};
          String[] obj1 = PatchProxy.apply(objArray, d, ksBlinkMemor, "2");
          if (obj1 != PatchProxyResult.class) {
             i2 = obj1.booleanValue();
             i1 = 0;
          }else if(KsBlinkMemoryHelper.a != null && stringArray != null){
             i3 = (!stringArray.length)? 1: 0;
             obj1 = (i3 ^ i1)? stringArray: oobject;
             if (obj1 != null && str != null) {
                String str2 = (u.S1(str) ^ i1)? str: oobject;
                if (str2 != null && map != null) {
                   Map map1 = (map.isEmpty() ^ i1)? map: oobject;
                   if (map1 != null && uobyteArray1 != null) {
                      i3 = (!uobyteArray1.length)? 1: 0;
                      byte[] uobyteArray3 = (i3 ^ i1)? uobyteArray1: oobject;
                      if (uobyteArray3 != null) {
                         int i4 = d.a(str);
                         r.a("[SampleCache] injectMemoryCache, inject resources type="+i4);
                         if (i4 >= 0) {
                            ArrayList uArrayList = new ArrayList();
                            len = stringArray.length;
                            i3 = 0;
                            while (i3 < len) {
                               object oobject1 = stringArray[i3];
                               int i5 = (oobject1 == null || !oobject1.length())? 1: 0;
                               if (!i5) {
                                  uArrayList.add("http://"+oobject1);
                                  uArrayList.add("https://"+oobject1);
                               }
                               i3 = i3 + 1;
                               String str3 = 1;
                            }
                            ArrayList uArrayList1 = (uArrayList.isEmpty() ^ 1)? uArrayList: oobject;
                            if (uArrayList1 != null) {
                               MemoryCacheInjector a = KsBlinkMemoryHelper.a;
                               if (a != null) {
                                  String[] stringArray1 = new String[0];
                                  Object[] objArray1 = uArrayList.toArray(stringArray1);
                                  if (objArray1 != null) {
                                     a.injectResources(objArray1, i4, map, uobyteArray1, uobyteArray2);
                                  }else {
                                     throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                                  }
                               }
                               i2 = true;
                            }
                         }
                      }
                   }
                }
             }
          }
       label_014a :
          i2 = false;
       }else {
          goto label_0076 ;
       }
       Boolean uBoolean = Boolean.valueOf(i2);
       if (uBoolean.booleanValue()) {
          oobject = uBoolean;
       }
       if (oobject != null) {
          oobject.booleanValue();
          longx.blinkInjectedEnd = Long.valueOf(System.currentTimeMillis());
          y.s0(longx.g, p0.f());
          y.s0(KsBlinkMemoryHelper.d.b(), p0.f());
          long l1 = System.currentTimeMillis();
          stringArray = p0.f();
          len = stringArray.length;
          for (i3 = 0; i3 < len; i3 = i3 + 1) {
             h oh = new h();
             oh.url = stringArray[i3];
             oh.injectStartTime = Long.valueOf(l);
             oh.injectEndTime = Long.valueOf(l1);
             longx.d.add(oh);
          }
          uobyteArray = p0.a();
          if (uobyteArray != null) {
             i2 = (!uobyteArray.length)? 1: 0;
             i = 1;
             if ((i2 ^ i) == i) {
                y.s0(longx.j, p0.f());
             }
          }else {
             i = 1;
          }
          String str1 = p0.b();
          if (str1 != null) {
             if (str1.length()) {
                i = 0;
             }
             if (!i) {
                longx.injectCodeCacheErrors.add(p0.b());
             }
          }
       }
    label_01da :
       return;
    }
    public final String p(){
       String obj = PatchProxy.apply(null, this, YodaXCache.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (YodaXCache.e) {
          return this.h();
       }
       obj = WebSettings.getDefaultUserAgent(Azeroth2.B.d());
       Yoda yoda = Yoda.get();
       a.h(yoda, "Yoda.get\(\)");
       a yodaStorage = yoda.getYodaStorage();
       String str = "ua";
       a.h(obj, str);
       Objects.requireNonNull(yodaStorage);
       if (!PatchProxy.applyVoidOneRefs(obj, yodaStorage, a.class, "3")) {
          a.q(obj, str);
          yodaStorage = yodaStorage.a;
          Objects.requireNonNull(yodaStorage);
          if (!PatchProxy.applyVoidOneRefs(obj, yodaStorage, YodaSharedPreferences.class, "5")) {
             a.q(obj, str);
             a.d(yodaStorage.a(), "user_agent", obj, false, 4, null);
          }
       }
       YodaXCache.e = true;
       return obj;
    }
    public final void r(YodaBaseWebView p0,CacheEntry p1){
       l sessionPageI;
       XCacheInfo xCacheInfo;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaXCache.class, "27")) {
          return;
       }
       if (p1.l.g() && p1 instanceof d) {
          if (p0 != null) {
             sessionPageI = p0.getSessionPageInfoModule();
             if (sessionPageI != null) {
                xCacheInfo = sessionPageI.e();
                if (xCacheInfo != null) {
                   xCacheInfo.prepareStart = Long.valueOf(p1.q);
                }
             }
          }
          if (p0 != null) {
             sessionPageI = p0.getSessionPageInfoModule();
             if (sessionPageI != null) {
                xCacheInfo = sessionPageI.e();
                if (xCacheInfo != null) {
                   xCacheInfo.prepareThreadEnd = Long.valueOf(p1.r);
                }
             }
          }
          if (p0 != null) {
             sessionPageI = p0.getSessionPageInfoModule();
             if (sessionPageI != null) {
                xCacheInfo = sessionPageI.e();
                if (xCacheInfo != null) {
                   xCacheInfo.prepareHeadEnd = Long.valueOf(p1.s);
                }
             }
          }
          if (p0 != null) {
             sessionPageI = p0.getSessionPageInfoModule();
             if (sessionPageI != null) {
                xCacheInfo = sessionPageI.e();
                if (xCacheInfo != null) {
                   xCacheInfo.prepareRequestEnd = Long.valueOf(p1.t);
                }
             }
          }
          if (p0 != null) {
             l sessionPageI1 = p0.getSessionPageInfoModule();
             if (sessionPageI1 != null) {
                XCacheInfo xCacheInfo1 = sessionPageI1.e();
                if (xCacheInfo1 != null) {
                   xCacheInfo1.prepareStatus = Integer.valueOf(p1.i);
                }
             }
          }
       }
    label_0091 :
       return;
    }
    public final void s(LaunchModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaXCache.class, "8")) {
          return;
       }
       a.q(p0, "launchModel");
       this.t(p0, null);
       return;
    }
    public final void t(LaunchModel p0,i p1){
       String str1;
       LinkedList k;
       XCacheInfo xCacheInfo;
       XCacheInfo xCacheInfo1;
       Ref$ObjectRef objectRef;
       Ref$ObjectRef this;
       Ref$ObjectRef objectRef1;
       Ref$ObjectRef objectRef2;
       Ref$ObjectRef objectRef3;
       XCacheInfo xCacheInfo2;
       SoftReference softReferenc;
       CacheEntry uCacheEntry;
       i oi;
       x$a ksPreConnect;
       Uri uri;
       String str2;
       a b;
       Object obj = this;
       List obj1 = p0;
       Object obj2 = p1;
       YodaXCache yodaXCache = YodaXCache.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, obj2, obj, yodaXCache, "9")) {
          return;
       }
       String str = "launchModel";
       a.q(obj1, str);
       if (!PatchProxy.applyVoidThreeRefs(p0, null, p1, this, YodaXCache.class, "10")) {
          a.q(obj1, str);
          str = p0.getUrl();
          a.h(str, "launchModel.url");
          Map loadHeaders = p0.getLoadHeaders();
          if (loadHeaders == null) {
             loadHeaders = new LinkedHashMap();
          }
          Map map = loadHeaders;
          obj1 = p0.getHyIds();
          int i = 0;
          int i1 = 1;
          object oobject = null;
          if (PatchProxy.isSupport(yodaXCache)) {
             Object[] objArray = new Object[]{str,map,obj1,oobject,obj2};
             if (!PatchProxy.applyVoid(objArray, obj, yodaXCache, "11")) {
             }
          }else {
          }
       }
    label_0291 :
       return;
    }
    public final void u(f p0){
       YodaXCache.g = p0;
    }
}
