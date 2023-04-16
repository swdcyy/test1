package com.kwai.yoda.function.hybrid.GetHybridStatusFunction;
import ay7.a;
import com.kwai.yoda.function.hybrid.GetHybridStatusFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import gz7.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.Yoda;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import wz7.a;
import com.kwai.yoda.function.hybrid.GetHybridStatusFunction$b;
import java.io.File;
import gz7.i$a;
import tb7.c;
import wz7.d;
import com.kwai.yoda.function.hybrid.GetHybridStatusFunction$HybridStatusData;
import com.kwai.yoda.function.hybrid.GetHybridStatusFunction$HybridStatusResultParam;
import com.kwai.yoda.bridge.YodaException;

public final class GetHybridStatusFunction extends a	// class@0011d1
{
    public static final GetHybridStatusFunction$a d;

    static {
       GetHybridStatusFunction.d = new GetHybridStatusFunction$a(null);
    }
    public void GetHybridStatusFunction(){
       super();
    }
    public String c(){
       return "getHybridStatus";
    }
    public String d(){
       return "hybrid";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       i oi = i.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, GetHybridStatusFunction.class, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       Yoda yoda = Yoda.get();
       a.h(yoda, "Yoda.get\(\)");
       i offlinePacka = yoda.getOfflinePackageHandler();
       if (offlinePacka == null) {
          throw new YodaException(0x1e84a, "The yoda havn\'t init");
       }
       a.h(offlinePacka, "Yoda.get\(\).offlinePackag¡­, \"The yoda havn\'t init\"\)");
       Object[] objArray = null;
       List list = PatchProxy.apply(objArray, offlinePacka, oi, "16");
       if (list != patchProxyRe) {
       }else {
          Collection uCollection1 = offlinePacka.c.values();
          a.h(uCollection1, "cachedRequestInfo.values");
          list = CollectionsKt___CollectionsKt.G5(uCollection1);
       }
       List list1 = PatchProxy.apply(objArray, offlinePacka, oi, "17");
       if (list1 != patchProxyRe) {
       }else {
          Collection uCollection = offlinePacka.d.values();
          a.h(uCollection, "cachedMatchInfo.values");
          list1 = CollectionsKt___CollectionsKt.G5(uCollection);
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = list1.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          GetHybridStatusFunction$b uob = new GetHybridStatusFunction$b();
          a hyId = uoa.hyId;
          uob.hyId = hyId;
          uob.hyVersion = uoa.version;
          uob.loadType = uoa.loadType;
          uob.packageType = uoa.packageType;
          uob.installMode = uoa.installMode;
          uob.status = "DOWNLOADED";
          File uFile = i.j.b(hyId);
          uob.size = c.c(uFile);
          uob.count = c.b(uFile);
          uArrayList.add(uob);
       }
       iterator = list.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          if (a.g(uod.status, "DOWNLOADED")) {
             continue ;
          }
          GetHybridStatusFunction$b uob1 = new GetHybridStatusFunction$b();
          uob1.hyId = uod.hyId;
          uob1.hyVersion = uod.version;
          uob1.loadType = uod.loadType;
          uob1.packageType = uod.packageType;
          uob1.status = uod.status;
          uArrayList.add(uob1);
       }
       GetHybridStatusFunction$HybridStatusData hybridStatus = new GetHybridStatusFunction$HybridStatusData();
       hybridStatus.statusList = uArrayList;
       GetHybridStatusFunction$HybridStatusResultParam hybridStatus1 = new GetHybridStatusFunction$HybridStatusResultParam();
       hybridStatus1.data = hybridStatus;
       return hybridStatus1;
    }
}
