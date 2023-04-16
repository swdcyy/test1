package com.kwai.yoda.cache.YodaXCache$prepareWebResourceResponse$6;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.yoda.session.logger.webviewload.XCacheInfo;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.cache.YodaXCache;
import vx7.a;
import yz7.r;
import sx7.x$a;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.System;
import java.lang.Long;
import com.kwai.yoda.cache.KsBlinkMemoryHelper;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.webkit.extension.KwSdk;
import java.lang.StringBuilder;
import com.kuaishou.webkit.extension.MemoryCacheInjector;
import com.kuaishou.webkit.WebViewFactoryProvider;
import com.kuaishou.webkit.WebViewFactory;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import iz7.d;
import brd.h;
import hrd.a;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import brd.z;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$a;
import sx7.j;
import erd.o;
import sx7.k;
import erd.g;
import crd.b;

public final class YodaXCache$prepareWebResourceResponse$6 extends Lambda implements a	// class@0011a3
{
    public final Ref$ObjectRef $cacheConfig;
    public final XCacheInfo $prepareTask;

    public void YodaXCache$prepareWebResourceResponse$6(XCacheInfo p0,Ref$ObjectRef p1){
       this.$prepareTask = p0;
       this.$cacheConfig = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       boolean b1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, YodaXCache$prepareWebResourceResponse$6.class, "1")) {
          return;
       }
       YodaXCache n = YodaXCache.n;
       n.p();
       a b = a.b;
       if (!b.a()) {
          b.b(this.$prepareTask);
          r.b("YodaXCache", "[YodaXCache] ksPreConnectUrl on ui");
       }
       if (a.g(this.$cacheConfig.element.enableBlink, Boolean.TRUE)) {
          YodaXCache$prepareWebResourceResponse$6 t$prepareTas = this.$prepareTask;
          Objects.requireNonNull(n);
          if (!PatchProxy.applyVoidOneRefs(t$prepareTas, n, YodaXCache.class, "16")) {
             r.h("YodaXCache", "[YodaXCache] decideInjectMemoryCache, start");
             t$prepareTas.blinkSupportSt = Long.valueOf(System.currentTimeMillis());
             KsBlinkMemoryHelper d = KsBlinkMemoryHelper.d;
             Objects.requireNonNull(d);
             String obj = PatchProxy.apply(objArray, d, KsBlinkMemoryHelper.class, "6");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
                obj = "KsBlinkMemoryHelper";
                r.h(obj, "decideInjectMemoryCache, support, start");
                if (KsBlinkMemoryHelper.a != null) {
                   r.h(obj, "decideInjectMemoryCache, support, return true");
                }else {
                   boolean b2 = KwSdk.useKsWebView();
                   r.h(obj, "decideInjectMemoryCache, support useKsWebView:"+b2);
                   if (!b2) {
                      r.h(obj, "decideInjectMemoryCache, support, return false,  useSysWebView");
                   }else {
                      b2 = MemoryCacheInjector.isSupported();
                      r.h(obj, "decideInjectMemoryCache, support:"+b2);
                      if (b2) {
                         WebViewFactoryProvider provider = WebViewFactory.getProvider();
                         a.h(provider, "WebViewFactory.getProvider\(\)");
                         KsBlinkMemoryHelper.a = provider.getMemoryCacheInjector();
                         r.h(obj, "decideInjectMemoryCache, support, "+KsBlinkMemoryHelper.a);
                         if (KsBlinkMemoryHelper.a == null) {
                         }
                      }else {
                         r.h(obj, "decideInjectMemoryCache, support finish, return false");
                      }
                   }
                }
                b1 = true;
             }
             t$prepareTas.blinkSupportEt = Long.valueOf(System.currentTimeMillis());
             t$prepareTas.blinkSupport = Boolean.valueOf(b1);
             if (b1) {
                r.h("YodaXCache", "[YodaXCache] decideInjectMemoryCache, support true, "+"size:"+t$prepareTas.b().size());
                obj = KsWebExtensionStatics.getV8CachedDataVersionTag();
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = t$prepareTas.b().iterator();
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   Object obj2 = obj1;
                   String str = obj2.c();
                   str = (str == null || !str.length())? 1: null;
                   obj2 = (str || a.g(obj2.c(), obj))? 1: null;
                   if (obj2) {
                      uArrayList.add(obj1);
                   }
                }
                YodaXCache.j = h.m(uArrayList).v().c(AzerothSchedulers.b.b()).a(new j(t$prepareTas)).d().z(k.b);
                r.h("YodaXCache", "[YodaXCache] decideInjectMemoryCache, finish");
             }
          }
       }
       return;
    }
}
