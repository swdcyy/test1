package com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction;
import com.kwai.yoda.function.c;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$a;
import nsd.u;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$c;
import yz7.e;
import java.util.Collection;
import com.kwai.yoda.Yoda;
import kotlin.jvm.internal.a;
import gz7.i;
import android.os.SystemClock;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$GetOfflinePackageDetailResultPrams;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$d;
import java.util.concurrent.Callable;
import brd.t;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$e;
import erd.o;
import java.util.concurrent.TimeUnit;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$f;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$g;
import erd.g;
import crd.b;
import com.kwai.yoda.bridge.YodaException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Long;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.yoda.function.hybrid.GetOfflinePackageDetailFunction$b;
import wz7.a;
import java.lang.Integer;
import wz7.d;

public final class GetOfflinePackageDetailFunction extends c	// class@0011da
{
    public static final GetOfflinePackageDetailFunction$a f;

    static {
       GetOfflinePackageDetailFunction.f = new GetOfflinePackageDetailFunction$a(null);
    }
    public void GetOfflinePackageDetailFunction(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       Object obj = this;
       object oobject = p3;
       GetOfflinePackageDetailFunction getOfflinePa = GetOfflinePackageDetailFunction.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(getOfflinePa)) {
          Object[] objArray = new Object[]{p0,p1,p2,oobject,p4};
          if (PatchProxy.applyVoid(objArray, obj, getOfflinePa, "1")) {
             return;
          }
       }
       GetOfflinePackageDetailFunction$c uoc = e.a(oobject, GetOfflinePackageDetailFunction$c.class);
       GetOfflinePackageDetailFunction$c uoc1 = uoc;
       if (uoc1 != null) {
          uoc = uoc1.hybridIdList;
          Yoda yoda = (uoc == null || uoc.isEmpty())? 1: null;
          if (!yoda) {
             yoda = Yoda.get();
             a.h(yoda, "Yoda.get\(\)");
             i offlinePacka = yoda.getOfflinePackageHandler();
             if (offlinePacka != null) {
                a.h(offlinePacka, "Yoda.get\(\).offlinePackag¡­ackage handler is null.\"\)");
                long l = 1000;
                boolean b = (uoc1.reloadFromRemote != null && (offlinePacka.q() && (SystemClock.elapsedRealtime() - offlinePacka.i()) - (uoc1.reloadThresholdInSecond * l) > 0))? true: false;
                if (!b) {
                   this.l(p0, obj.s(uoc1, offlinePacka, b), p1, p2, null, p4);
                   return;
                }else {
                   getOfflinePa = this;
                   YodaBaseWebView yodaBaseWebV = p0;
                   GetOfflinePackageDetailFunction$c uoc2 = uoc1;
                   i oi = offlinePacka;
                   boolean b1 = b;
                   String str = p1;
                   String str1 = p2;
                   String str2 = p4;
                   GetOfflinePackageDetailFunction$f uof = new GetOfflinePackageDetailFunction$f(getOfflinePa, yodaBaseWebV, uoc2, oi, b1, str, str1, str2);
                   GetOfflinePackageDetailFunction$g og = new GetOfflinePackageDetailFunction$g(getOfflinePa, yodaBaseWebV, uoc2, oi, b1, str, str1, str2);
                   obj.k(t.fromCallable(new GetOfflinePackageDetailFunction$d(offlinePacka)).flatMap(GetOfflinePackageDetailFunction$e.b).timeout(l, TimeUnit.MILLISECONDS).subscribe(v14, v15));
                   return;
                }
             }else {
                throw new YodaException(0x1e84a, "The offline package handler is null.");
             }
          }
       }
       this.o(p0, p1, p2, 0x1e84f, "The Input parameter is invalid.", p4);
       return;
    }
    public final GetOfflinePackageDetailFunction$GetOfflinePackageDetailResultPrams s(GetOfflinePackageDetailFunction$c p0,i p1,boolean p2){
       LinkedHashMap obj;
       int i1;
       GetOfflinePackageDetailFunction$b uob1;
       i oi = p1;
       if (PatchProxy.isSupport(GetOfflinePackageDetailFunction.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, GetOfflinePackageDetailFunction.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       GetOfflinePackageDetailFunction$GetOfflinePackageDetailResultPrams getOfflinePa = new GetOfflinePackageDetailFunction$GetOfflinePackageDetailResultPrams();
       int i = 1;
       getOfflinePa.mResult = i;
       long l = p1.i();
       GetOfflinePackageDetailFunction$c hybridIdList = p0.hybridIdList;
       if (PatchProxy.isSupport(GetOfflinePackageDetailFunction.class)) {
          obj = PatchProxy.applyThreeRefs(Long.valueOf(l), hybridIdList, p1, this, GetOfflinePackageDetailFunction.class, "3");
          if (obj != PatchProxyResult.class) {
             i1 = this;
          label_0129 :
             getOfflinePa.detailMap = obj;
             getOfflinePa.fromRemote = p2;
             return getOfflinePa;
          }
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       ArrayList uArrayList = new ArrayList(hybridIdList);
       if (uArrayList.isEmpty() ^ i) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             a.h(obj1, "hyId");
             GetOfflinePackageDetailFunction$b uob = null;
             if (PatchProxy.isSupport(GetOfflinePackageDetailFunction.class)) {
                uob1 = PatchProxy.applyThreeRefs(obj1, p1, Long.valueOf(l), this, GetOfflinePackageDetailFunction.class, "5");
                if (uob1 != PatchProxyResult.class) {
                }else {
                label_0096 :
                   a uoa = oi.g(obj1);
                   if (uoa != null) {
                      GetOfflinePackageDetailFunction$b uob2 = new GetOfflinePackageDetailFunction$b();
                      uob2.hyId = uoa.hyId;
                      uob2.version = Integer.valueOf(uoa.version);
                      uob2.status = "DOWNLOADED";
                      uob2.size = Long.valueOf(uoa.size);
                      uob2.lastUpdatedTimestamp = Long.valueOf(l);
                      uob1 = uob2;
                   }else {
                      uob1 = uob;
                   }
                }
             }else {
                goto label_0096 ;
             }
             if (uob1 == null) {
                if (PatchProxy.isSupport(GetOfflinePackageDetailFunction.class)) {
                   d obj2 = PatchProxy.applyThreeRefs(obj1, p1, Long.valueOf(l), this, GetOfflinePackageDetailFunction.class, "4");
                   if (obj2 != PatchProxyResult.class) {
                      uob = obj2;
                   }else {
                   label_00e2 :
                      obj2 = oi.h(obj1);
                      if (obj2 != null) {
                         uob = new GetOfflinePackageDetailFunction$b();
                         uob.hyId = obj2.hyId;
                         uob.version = Integer.valueOf(obj2.version);
                         uob.status = obj2.status;
                         uob.lastUpdatedTimestamp = Long.valueOf(l);
                      }
                   }
                }else {
                   goto label_00e2 ;
                }
                uob1 = uob;
             }
             if (uob1 != null) {
                i1 = this;
             }else {
                uob1 = PatchProxy.applyOneRefs(obj1, this, GetOfflinePackageDetailFunction.class, "6");
                if (uob1 != PatchProxyResult.class) {
                }else {
                   uob1 = new GetOfflinePackageDetailFunction$b();
                   uob1.hyId = obj1;
                   uob1.status = "NONE";
                }
             }
             linkedHashMa.put(obj1, uob1);
          }
       }
       obj = linkedHashMa;
       goto label_0129 ;
    }
}
