package ni0.c;
import java.lang.Runnable;
import lj0.c;
import android.view.View;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import pi0.a;
import com.kuaishou.krn.apm.wsd.model.WsdReportData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.apm.wsd.WhiteScreenDetector;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.wsd.model.KdsFrameworkConfig;
import java.lang.Boolean;
import com.kuaishou.krn.log.model.a;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import zj0.x;
import bk0.p;
import bk0.m;
import java.lang.System;
import java.lang.Long;
import java.util.Objects;
import java.lang.Integer;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ni0.a;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.Map;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import ek0.d;
import oi0.a;
import com.kuaishou.krn.apm.wsd.model.WsdReportData$ShotCancelReason;
import com.kuaishou.krn.c;
import kj0.l;
import ni0.b;
import oi0.b$a;
import oi0.b;
import bk0.j;

public final class c implements Runnable	// class@003322
{
    public final c b;
    public final View c;
    public final String d;

    public void c(c p0,View p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       c c;
       c d;
       boolean b5;
       long reason;
       Long longx;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       WsdReportData wsdReportDat = WsdReportData.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, obj, c.class, str)) {
          return;
       }
       WsdReportData wsdReportDat1 = new WsdReportData(obj.b, objArray);
       WhiteScreenDetector i = WhiteScreenDetector.i;
       a b = WhiteScreenDetector.b;
       if (b == null) {
          a.S("mConfig");
       }
       KdsFrameworkConfig kdsFramework = b.a();
       Boolean uBoolean = (kdsFramework != null)? Boolean.valueOf(kdsFramework.enableShotScreen): objArray;
       wsdReportDat1.mEnableShotScreen = uBoolean;
       b = obj.b.h();
       String str1 = "krnContext.krnPageLoadTimeHelper";
       a.o(b, str1);
       long l = b.f();
       WhiteScreenDetector whiteScreenD = null;
       boolean b1 = true;
       int b2 = (l - whiteScreenD > 0)? true: false;
       wsdReportDat1.mIsT2T3Completed = Boolean.valueOf(b2);
       a uoa1 = obj.b.h();
       a.o(uoa1, str1);
       boolean b3 = (uoa1.e() - whiteScreenD > 0)? true: false;
       wsdReportDat1.g(Boolean.valueOf(b3));
       c b4 = obj.b;
       int i1 = 2;
       if (!PatchProxy.applyVoidOneRefs(b4, wsdReportDat1, wsdReportDat, "2")) {
          a.p(b4, "krnContext");
          x ox = b4.k();
          if (ox instanceof p && ox.I().G()) {
             wsdReportDat1.e(i1);
          }
       }
       wsdReportDat1.i(Long.valueOf(System.currentTimeMillis()));
       b4 = obj.c;
       Objects.requireNonNull(i);
       String str2 = "6";
       KdsFrameworkConfig obj1 = PatchProxy.applyOneRefs(b4, i, WhiteScreenDetector.class, str2);
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else {
          uoa1 = WhiteScreenDetector.b;
          if (uoa1 == null) {
             a.S("mConfig");
          }
          Objects.requireNonNull(uoa1);
          Integer integer = PatchProxy.apply(objArray, uoa1, uoa, str2);
          if (integer != patchProxyRe) {
          }else {
             obj1 = uoa1.a();
             integer = (obj1 != null)? Integer.valueOf(obj1.maxViewDetect): objArray;
          }
          if (integer != null) {
             b2 = integer.intValue();
             if (b2 > 0) {
                b = WhiteScreenDetector.b;
                if (b == null) {
                   a.S("mConfig");
                }
                Objects.requireNonNull(b);
                List list = PatchProxy.apply(objArray, b, uoa, "5");
                if (list != patchProxyRe) {
                }else {
                   kdsFramework = b.a();
                   if (kdsFramework != null) {
                      kdsFramework = kdsFramework.classExcepts;
                      if (kdsFramework != null) {
                         list = CollectionsKt___CollectionsKt.G5(kdsFramework);
                      }
                   }
                   list = objArray;
                }
                HashSet hashSet = (list != null)? CollectionsKt___CollectionsKt.E5(list): objArray;
                b = new a(b2, hashSet);
                i.c().put(b4, b.a);
                b1 = b.b(b4);
             }
          }
       }
       str1 = new Gson().q(i.c().get(obj.c));
       a.o(str1, "Gson\(\).toJson\(mViewsInfos[rootView]\)");
       if (!PatchProxy.applyVoidOneRefs(str1, wsdReportDat1, wsdReportDat, str)) {
          a.p(str1, "<set-?>");
          wsdReportDat1.mViewsInfos = str1;
       }
       d.e("WhiteScreenDetector hasContent:"+b1+" for "+obj.d);
       if (b1) {
          return;
       }else {
          c = obj.c;
          d = obj.d;
          a.o(d, "pageId");
          Objects.requireNonNull(i);
          if (!PatchProxy.applyVoidThreeRefs(c, d, wsdReportDat1, i, WhiteScreenDetector.class, "5")) {
             b = WhiteScreenDetector.b;
             if (b == null) {
                a.S("mConfig");
             }
             Objects.requireNonNull(b);
             Object obj2 = PatchProxy.apply(objArray, b, uoa, "4");
             if (obj2 != patchProxyRe) {
                b5 = obj2.booleanValue();
             }else {
                KdsFrameworkConfig kdsFramework1 = b.a();
                kdsFramework1 = (kdsFramework1 != null)? kdsFramework1.enableShotScreen: null;
             }
             if (b5 != null) {
                long l1 = System.currentTimeMillis();
                if (!PatchProxy.applyVoidThreeRefs(c, d, wsdReportDat1, i, WhiteScreenDetector.class, "7")) {
                   b = WhiteScreenDetector.d;
                   if (b != null && !b.a(2)) {
                      reason = WsdReportData$ShotCancelReason.OVER_HEAT.getReason();
                      longx = wsdReportDat1.h();
                      if (longx != null) {
                         objArray = Long.valueOf((reason | longx.longValue()));
                      }
                      wsdReportDat1.j(objArray);
                      d.i("WhiteScreenDetector captureViewVerify: give up for cannot meet deviceLimits for "+d);
                   }else {
                      c uoc = c.b();
                      a.o(uoc, "KrnManager.get\(\)");
                      l ol = uoc.g();
                      a.o(ol, "KrnManager.get\(\).krnInitParams");
                      if (ol.c()) {
                         reason = WsdReportData$ShotCancelReason.LOW_DISK.getReason();
                         longx = wsdReportDat1.h();
                         if (longx != null) {
                            objArray = Long.valueOf((reason | longx.longValue()));
                         }
                         wsdReportDat1.j(objArray);
                         d.i("WhiteScreenDetector captureViewVerify: give up for LowDiskMode for "+d);
                      }else {
                         reason = System.currentTimeMillis();
                         b c1 = WhiteScreenDetector.c;
                         if (c1 != null) {
                            c1.b(c, 5, 0x3f733333, true, new b(wsdReportDat1, c, d));
                         }
                         d.e("WhiteScreenDetector verifyWhiteView: cost="+(System.currentTimeMillis() - reason)+"ms");
                      }
                   }
                }
                wsdReportDat1.mShotCost = Long.valueOf((System.currentTimeMillis() - l1));
             }
             wsdReportDat = wsdReportDat1.mCheckCost;
             a.m(wsdReportDat);
             wsdReportDat1.i(Long.valueOf((System.currentTimeMillis() - wsdReportDat.longValue())));
             j.b.b("krn_white_page_error", wsdReportDat1);
          }
          return;
       }
    }
}
