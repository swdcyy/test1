package com.kwai.framework.plugin.downloader.PluginDownloader;
import com.kwai.plugin.dva.install.remote.download.b;
import com.kwai.framework.plugin.downloader.PluginDownloader$a;
import nsd.u;
import kd6.f;
import ae6.f;
import com.kwai.framework.plugin.log.PluginLogger;
import java.util.concurrent.CountDownLatch;
import gd6.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.downloader.PluginDownloader$mWarmUpManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.plugin.downloader.PluginDownloader$mIncrementDownloader$2;
import com.kwai.plugin.dva.install.remote.download.c$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.plugin.PluginManager;
import be6.l;
import be6.d;
import qrd.l1;
import csd.b;
import gd6.a;
import gd6.a$a;
import ed6.b;
import java.lang.Boolean;
import com.kwai.framework.plugin.downloader.PluginDownloader$d;
import kd6.c;
import kd6.b;
import kd6.c$a;
import com.kwai.framework.plugin.downloader.PluginDownloader$suspendDownload$1;
import com.kwai.framework.plugin.downloader.PluginDownloader$c;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.framework.plugin.log.PluginInstallResultLogger;
import java.lang.Long;
import java.util.concurrent.ConcurrentHashMap;
import nd6.d;
import java.lang.System;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.util.Objects;
import java.util.Map;
import be6.e;
import java.io.File;
import com.kwai.plugin.dva.util.a;
import kotlin.io.FilesKt__UtilsKt;
import o56.a;
import java.lang.Throwable;
import nd6.k;
import java.lang.Runnable;
import t45.c;
import com.kwai.framework.plugin.downloader.PluginDownloader$b;
import com.kwai.framework.plugin.downloader.PluginDownloader$waitDownloaderInitComplete$1;
import com.yxcorp.download.DownloadManager;
import com.kwai.video.cache.AwesomeCacheInitConfig;
import kotlinx.coroutines.c;

public final class PluginDownloader implements b	// class@000c8a
{
    public final String a;
    public final p b;
    public final p c;
    public final f d;
    public final f e;
    public final f f;
    public final PluginLogger g;
    public final CountDownLatch h;
    public final b i;
    public static final PluginDownloader$a j;

    static {
       PluginDownloader.j = new PluginDownloader$a(null);
    }
    public void PluginDownloader(f p0,f p1,f p2,PluginLogger p3,CountDownLatch p4,b p5){
       a.p(p0, "mIncrementStore");
       a.p(p1, "mIncrementDownloaderGetter");
       a.p(p2, "mWarmUpManagerGetter");
       a.p(p3, "mLogger");
       a.p(p4, "mLock");
       a.p(p5, "mUrlInterceptor");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.a = "PluginManager";
       this.b = s.c(new PluginDownloader$mWarmUpManager$2(this));
       this.c = s.c(new PluginDownloader$mIncrementDownloader$2(this));
    }
    public Object a(String p0,int p1,String p2,String p3,String p4,c$a p5,c p6){
       l obj1;
       boolean b;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginDownloader pluginDownlo = PluginDownloader.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(pluginDownlo)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),oobject1,oobject2,oobject3,oobject4,p6};
          obj1 = PatchProxy.apply(objArray, obj, pluginDownlo, "3");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       int i2 = PluginManager.H.B(oobject);
       String str = PluginDownloader.j.a(oobject, i2);
       obj1 = obj.e(str, p1, oobject2, oobject3);
       d.c(str, obj1.d(), "pre_download", obj1.a(), obj1.b(), obj1.c());
       l1 ol1 = null;
       if (obj1.d()) {
          if (oobject4 != null) {
             oobject4.onProgress(100);
             ol1 = l1.a;
          }
          if (ol1 == b.h()) {
             return ol1;
          }else {
             return l1.a;
          }
       }else {
          String str1 = obj.i.a(a.b.a(oobject1));
          if (str1 != null) {
             oobject1 = str1;
          }
          Object obj2 = PatchProxy.apply(ol1, ol1, b.class, "1");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else {
             long l = b.a();
             b = (!l - 2 || !l - 3)? true: false;
          }
          if (b) {
             oobject1 = b.b(oobject1);
          }
          object oobject5 = oobject1;
          String str2 = str;
          PluginDownloader$d uod = new PluginDownloader$d(this, p5, str, p3, p1, p4, p0, i2);
          c uoc = this.f();
          boolean b1 = (i2 == i1)? true: false;
          Object obj3 = c$a.a(uoc, str2, p0, p1, oobject5, p4, p3, v17, "plugin_pre", 0, b1, p6, 256, null);
          if (obj3 == b.h()) {
             return obj3;
          }else {
             return l1.a;
          }
       }
    }
    public Object b(String p0,int p1,String p2,String p3,String p4,c$a p5,c p6){
       object obj1;
       PluginDownloader$suspendDownload$1 label1;
       PluginDownloader$suspendDownload$1 l$7;
       PluginDownloader$suspendDownload$1 l$6;
       PluginDownloader$suspendDownload$1 i$1;
       PluginDownloader$suspendDownload$1 l$5;
       PluginDownloader$suspendDownload$1 l$4;
       PluginDownloader$suspendDownload$1 l$3;
       PluginDownloader$suspendDownload$1 l$2;
       PluginDownloader$suspendDownload$1 i$0;
       Object obj3;
       object oobject7;
       PluginDownloader$suspendDownload$1 osuspendDown;
       Object obj4;
       boolean b;
       String obj5;
       long l1;
       l ol1;
       object oobject8;
       boolean b2;
       PluginDownloader$suspendDownload$1 obj = this;
       object oobject = p0;
       int i = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       object oobject5 = p6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginDownloader pluginDownlo = PluginDownloader.class;
       int i1 = 2;
       int i2 = 1;
       if (PatchProxy.isSupport(pluginDownlo)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),oobject1,oobject2,oobject3,oobject4,oobject5};
          obj1 = PatchProxy.apply(objArray, obj, pluginDownlo, "4");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       if (oobject5 instanceof PluginDownloader$suspendDownload$1) {
          obj1 = oobject5;
          PluginDownloader$suspendDownload$1 label = obj1.label;
          int i3 = Integer.MIN_VALUE;
          if (label & i3) {
             obj1.label = label - i3;
          label_0058 :
             object oobject6 = obj1;
             PluginDownloader$suspendDownload$1 result = oobject6.result;
             PluginDownloader$suspendDownload$1 obj2 = b.h();
             label1 = oobject6.label;
             if (label1 != null) {
                if (label1 != i2) {
                   if (label1 == i1) {
                      j0.n(result);
                   label_0287 :
                      return l1.a;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$7 = oobject6.L$7;
                   l$6 = oobject6.L$6;
                   i$1 = oobject6.I$1;
                   l$5 = oobject6.L$5;
                   l$4 = oobject6.L$4;
                   l$3 = oobject6.L$3;
                   l$2 = oobject6.L$2;
                   i$0 = oobject6.I$0;
                   j0.n(result);
                   result = oobject6.L$0;
                   obj = oobject6.I$2;
                   obj3 = obj2;
                   label1 = oobject6.L$1;
                   obj2 = oobject6.L$9;
                   label = oobject6.L$8;
                   oobject7 = oobject6;
                   osuspendDown = oobject6.L$10;
                }
             }else {
                j0.n(result);
                i1 = PluginManager.H.B(oobject);
                String str = PluginDownloader.j.a(oobject, i1);
                l ol = obj.e(str, i, oobject2, oobject3);
                d.c(str, ol.d(), "download", ol.a(), ol.b(), ol.c());
                PluginInstallResultLogger g = PluginInstallResultLogger.g;
                int b1 = ol.d();
                long l = ol.a();
                _monitor_enter(g);
                if (PatchProxy.isSupport(PluginInstallResultLogger.class)) {
                   l1 = l;
                   ol1 = ol;
                   obj4 = obj2;
                   oobject8 = oobject6;
                   if (PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(b1), Long.valueOf(l), g, PluginInstallResultLogger.class, "8")) {
                      _monitor_exit(g);
                   label_016f :
                      if (ol1.d()) {
                         if (oobject4 != null) {
                            oobject4.onProgress(100);
                         }
                         return l1.a;
                      }else {
                         obj5 = obj.i.a(a.b.a(oobject1));
                         if (obj5 == null) {
                            oobject5 = oobject1;
                         }
                         String obj6 = PatchProxy.apply(null, null, b.class, "2");
                         if (obj6 != patchProxyRe) {
                            b2 = obj6.booleanValue();
                         }else {
                            l = b.a();
                            b2 = (!l - 1 || !l - 3)? true: false;
                         }
                         if (b2) {
                            obj5 = b.b(obj5);
                         }
                         String str1 = obj5;
                         PluginDownloader$c uoc1 = oobject3;
                         PluginDownloader$c uoc2 = oobject3;
                         String str2 = str;
                         int i4 = i1;
                         uoc1 = new PluginDownloader$c(this, p5, str, p3, p1, p4, p0, i1);
                         Objects.requireNonNull(PluginDownloadExtension.k);
                         Integer integer = PluginDownloadExtension.b.get(oobject);
                         b1 = (integer != null)? integer.intValue(): 0;
                         obj6 = "plugin";
                         obj.h.await();
                         oobject8.L$0 = obj;
                         oobject8.L$1 = oobject;
                         int i5 = p1;
                         oobject7 = oobject8;
                         oobject7.I$0 = i5;
                         oobject7.L$2 = oobject1;
                         PluginDownloader$c obj7 = p3;
                         oobject7.L$3 = obj7;
                         String obj8 = p4;
                         oobject7.L$4 = obj8;
                         oobject7.L$5 = oobject4;
                         int i6 = i4;
                         oobject7.I$1 = i6;
                         oobject7.L$6 = str2;
                         l ol2 = ol1;
                         oobject7.L$7 = ol2;
                         oobject7.L$8 = str1;
                         PluginDownloader$c uoc3 = uoc2;
                         oobject7.L$9 = uoc3;
                         oobject7.I$2 = b1;
                         oobject7.L$10 = obj6;
                         oobject7.label = 1;
                         obj3 = obj4;
                         if (obj.j(oobject7) == obj3) {
                            return obj3;
                         }else {
                            l$6 = str2;
                            l$4 = obj8;
                            obj8 = obj6;
                            label1 = p0;
                            int i7 = b1;
                            result = obj;
                            i$0 = i5;
                            String str3 = str1;
                            l$5 = oobject4;
                            l$3 = obj7;
                            obj7 = uoc3;
                            i$1 = i6;
                            l$7 = ol2;
                            l$2 = oobject1;
                         }
                      }
                   }
                }else {
                   l1 = l;
                   ol1 = ol;
                   obj4 = obj2;
                   oobject8 = oobject6;
                }
                a.p(oobject, "pluginName");
                d uod = g.b().get(oobject);
                if (uod != null) {
                   uod.d("warm_up");
                   uod.b(l1);
                   uod.e(System.currentTimeMillis());
                }
                _monitor_exit(g);
                goto label_016f ;
             }
             c uoc = result.f();
             obj4 = obj3;
             b = (i$1 == 1)? true: false;
             oobject7.L$0 = result;
             oobject7.L$1 = label1;
             oobject7.I$0 = i$0;
             oobject7.L$2 = l$2;
             oobject7.L$3 = l$3;
             oobject7.L$4 = l$4;
             oobject7.L$5 = l$5;
             oobject7.I$1 = i$1;
             oobject7.L$6 = l$6;
             oobject7.L$7 = l$7;
             oobject7.L$8 = label;
             oobject7.L$9 = obj2;
             oobject7.I$2 = obj;
             oobject7.L$10 = osuspendDown;
             oobject7.label = 2;
             obj5 = obj4;
             if (uoc.b(l$6, label1, i$0, label, l$4, l$3, obj2, osuspendDown, obj, b, oobject7) == obj5) {
                return obj5;
             }else {
                goto label_0287 ;
             }
          }
       }
       label1 = new PluginDownloader$suspendDownload$1(obj, oobject5);
       goto label_0058 ;
    }
    public void c(String p0,int p1,String p2,String p3,String p4,c$a p5){
       if (PatchProxy.isSupport(PluginDownloader.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, PluginDownloader.class, "8")) {
             return;
          }
       }
       a.p(p0, "pluginId");
       a.p(p2, "url");
       a.p(p3, "dist");
       return;
    }
    public void d(String p0,int p1,String p2,String p3,String p4,c$a p5){
       if (PatchProxy.isSupport(PluginDownloader.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, PluginDownloader.class, "9")) {
             return;
          }
       }
       a.p(p0, "pluginId");
       a.p(p2, "url");
       a.p(p3, "dist");
       return;
    }
    public final l e(String p0,int p1,String p2,String p3){
       l obj;
       File this;
       if (PatchProxy.isSupport(PluginDownloader.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, this, PluginDownloader.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new l();
       long l = System.currentTimeMillis();
       if (p3 != null) {
          this = this.g().c(p3);
          if (this != null) {
             if (a.g(a.h(this), p3)) {
                FilesKt__UtilsKt.Q(this, new File(p2), true, 0, 4, null);
                if (a.g(a.h(new File(p2)), p3)) {
                   String m = a.m;
                   a.o(m, "AppEnv.VERSION");
                   this.d.a(p0, p2, p1, p3, m);
                   obj.g(true);
                   obj.e((System.currentTimeMillis() - l));
                   return obj;
                }else {
                   obj.f(4);
                }
             }else {
                obj.f(2);
                this.g().d(p3);
             }
          }else {
             obj.f(true);
          }
       }else {
          obj.f(true);
       }
       obj.e((System.currentTimeMillis() - l));
       obj.g(false);
       return obj;
    }
    public final c f(){
       Object obj = PatchProxy.apply(null, this, PluginDownloader.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final e g(){
       Object obj = PatchProxy.apply(null, this, PluginDownloader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final void h(String p0,int p1,String p2){
       PluginDownloader tg;
       PluginLogger pluginLogger = PluginLogger.class;
       if (PatchProxy.isSupport(PluginDownloader.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, PluginDownloader.class, "6")) {
          return;
       }
       if (p1) {
          if (p1 == 1) {
             tg = this.g;
             Objects.requireNonNull(tg);
             if (!PatchProxy.applyVoidTwoRefs(p0, p2, tg, pluginLogger, "8")) {
                a.p(p0, "featureName");
                tg.e(p0, p2, "featureDownloaded");
             }
          }
       }else {
          tg = this.g;
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoidOneRefs(p0, tg, pluginLogger, "7")) {
             a.p(p0, "name");
             c.a(new k(tg, p0));
          }
       }
       return;
    }
    public final void i(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(PluginDownloader.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, PluginDownloader.class, "7")) {
          return;
       }
       if (p3 != null) {
          PluginDownloader$b uob = new PluginDownloader$b(this, p0, p1, p2, p3);
          c.a(v0);
       }
       return;
    }
    public final Object j(c p0){
       PluginDownloader$waitDownloaderInitComplete$1 owaitDownloa;
       boolean b;
       if (p0 instanceof PluginDownloader$waitDownloaderInitComplete$1) {
          owaitDownloa = p0;
          PluginDownloader$waitDownloaderInitComplete$1 label = owaitDownloa.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             owaitDownloa.label = i2;
          label_0018 :
             PluginDownloader$waitDownloaderInitComplete$1 result = owaitDownloa.result;
             Object obj = b.h();
             PluginDownloader$waitDownloaderInitComplete$1 label1 = owaitDownloa.label;
             if (label1 != null) {
                if (label1 == 1) {
                   label1 = owaitDownloa.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                label1 = this;
             }
             do {
                result = PatchProxy.apply(null, null, DownloadManager.class, "3");
                b = (result != PatchProxyResult.class)? result.booleanValue(): AwesomeCacheInitConfig.isInitialized();
                if (!b) {
                }else {
                   return l1.a;
                }
                owaitDownloa.L$0 = label1;
                owaitDownloa.label = 1;
             } while (c.a(5, owaitDownloa) == obj);
             return obj;
          }
       }
       owaitDownloa = new PluginDownloader$waitDownloaderInitComplete$1(this, p0);
       goto label_0018 ;
    }
}
