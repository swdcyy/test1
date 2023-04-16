package jd6.g;
import com.kwai.framework.plugin.feature.KwaiFeatureUpdateManager;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.lang.System;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collections;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import od6.n;
import od6.k;
import rd6.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import od6.j;
import java.util.Collection;
import trd.u;
import od6.h;
import com.kwai.framework.plugin.model.FeatureTaskContent;
import com.kwai.sdk.switchconfig.a;
import dd6.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.a0;
import jd6.g$b;
import erd.o;
import t45.d;
import brd.z;
import jd6.g$c;
import jd6.g$d;
import erd.g;
import crd.b;
import o56.a;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.Integer;
import qj7.d;
import zi7.a;
import kotlin.Pair;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import java.util.Arrays;
import java.util.Map;
import trd.t0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.plugin.dva.repository.store.a;
import com.google.gson.Gson;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;

public final class g	// class@001b4d
{
    public static String a = "";
    public static List b;
    public static d c;
    public static PluginLogger d;
    public static final KwaiFeatureUpdateManager e;
    public static final HashMap f;
    public static final Set g;
    public static long h;
    public static final g i;

    static {
       g.i = new g();
       g.e = new KwaiFeatureUpdateManager();
       g.f = new HashMap();
       g.g = new LinkedHashSet();
       g.h = System.currentTimeMillis();
    }
    public void g(){
       super();
    }
    public static final List a(){
       List obj = PatchProxy.apply(null, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = g.b;
       if (obj == null) {
          obj = CollectionsKt__CollectionsKt.E();
       }
       return Collections.unmodifiableList(obj);
    }
    public static final boolean c(String p0,String p1){
       n on = null;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, on, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "moduleName");
       a.p(p1, "buildType");
       n on1 = g.f.get(p0);
       if (on1 != null) {
          on = on1.buildType;
       }
       return a.g(on, p1);
    }
    public static final boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "moduleName");
       return g.c(p0, "plugin");
    }
    public static final boolean e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "moduleName");
       return g.c(p0, "source");
    }
    public final List b(){
       j obj1;
       ArrayList uArrayList1;
       String str;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, g.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = g.c;
       if (obj == null) {
          a.S("mPluginSource");
       }
       k ok = obj.g();
       if (ok != null) {
          objArray = ok.tasks;
       }
       if (objArray != null) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = objArray.iterator();
          int i = 0;
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             if (obj1.content != null) {
                i = 1;
             }
             if (i) {
                uArrayList.add(obj1);
             }
          }
          uArrayList1 = new ArrayList(u.Y(uArrayList, 10));
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             obj1 = iterator1.next();
             j content = obj1.content;
             if (content != null) {
                str = content.c();
                if (str != null) {
                label_006f :
                   obj1 = obj1.content;
                   int i1 = (obj1 != null)? obj1.d(): 0;
                   uArrayList1.add(new h(str, i1));
                }
             }
             str = "";
             goto label_006f ;
          }
       }else {
          uArrayList1 = CollectionsKt__CollectionsKt.E();
       }
       return uArrayList1;
    }
    public final void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "14")) {
          return;
       }
       if (!a.t().d("update_feature_config", false)) {
          return;
       }
       d obj = PatchProxy.apply(objArray, objArray, a.class, "5");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.a("/rest/zt/appsupport/feature/plugins", RequestTiming.COLD_START);
       if (b) {
          return;
       }else {
          obj = g.c;
          if (obj == null) {
             a.S("mPluginSource");
          }
          obj.n(this.b()).C(g$b.b).T(d.c).R(g$c.b, g$d.b);
          return;
       }
    }
    public final List g(FeatureDetails p0){
       FeatureInfo uFeatureInfo;
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiFeatureUpdateManager obj = PatchProxy.applyOneRefs(p0, this, g.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "rollbackDetails");
       obj = g.e;
       Objects.requireNonNull(obj);
       List list = PatchProxy.applyOneRefs(p0, obj, KwaiFeatureUpdateManager.class, "7");
       if (list != patchProxyRe) {
       }else {
          a.p(p0, "rollbackDetails");
          KwaiFeatureUpdateManager b = obj.b;
          _monitor_enter(b);
          StringBuilder str = "rollback feature list size = ";
          List splits = p0.getSplits();
          String str1 = null;
          Integer integer = (splits != null)? Integer.valueOf(splits.size()): str1;
          d.c(str+integer);
          KwaiFeatureUpdateManager c = obj.c;
          if (c == null) {
             c = obj.e().d();
          }
          if (c != null) {
             FeatureDetails uFeatureDeta = new FeatureDetails(c.getAppVersionName(), c.getFeatureId(), c.getSplitEntryFragments(), c.getSplits());
             int i = 1;
             if (a.g(uFeatureDeta.getFeatureId(), p0.getFeatureId()) ^ i) {
                d.c("featureId not consistent! old="+uFeatureDeta.getFeatureId()+" new="+p0.getFeatureId());
                list = CollectionsKt__CollectionsKt.E();
                _monitor_exit(b);
             }else {
                List first = obj.b(uFeatureDeta, p0, i).getFirst();
                if (first.isEmpty()) {
                   d.c("rollback feature list is empty.");
                   list = CollectionsKt__CollectionsKt.E();
                   _monitor_exit(b);
                }else {
                   d.c("pending rollback features = "+obj.d(first));
                   list = uFeatureDeta.getSplits();
                   if (list != null) {
                      FeatureDetails uFeatureDeta1 = obj.e().h();
                      if (uFeatureDeta1 != null) {
                         List splits1 = uFeatureDeta1.getSplits();
                         if (splits1 != null) {
                            ArrayList uArrayList = new ArrayList(u.Y(list, 10));
                            Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                               uFeatureInfo = iterator.next();
                               uArrayList.add(new Pair(uFeatureInfo.getSplitName(), uFeatureInfo));
                            }
                            Pair[] pairArray = new Pair[0];
                            Object[] objArray = uArrayList.toArray(pairArray);
                            if (objArray != null) {
                               Map map = t0.j0(Arrays.copyOf(objArray, objArray.length));
                               uArrayList = new ArrayList();
                               Iterator iterator1 = splits1.iterator();
                               while (iterator1.hasNext()) {
                                  uFeatureInfo = iterator1.next();
                                  Iterator iterator2 = first.iterator();
                                  while (true) {
                                     if (iterator2.hasNext()) {
                                        obj1 = iterator2.next();
                                        if (!a.g(obj1.getSplitName(), uFeatureInfo.getSplitName())) {
                                           continue ;
                                        }
                                     }else {
                                        obj1 = str1;
                                     }
                                     if (obj1 != null) {
                                        uArrayList.add(obj1);
                                        map.put(uFeatureInfo.getSplitName(), uFeatureInfo);
                                     }else {
                                        continue ;
                                     }
                                  }
                               }
                               uFeatureDeta.setSplits(CollectionsKt___CollectionsKt.G5(map.values()));
                               a uoa = a.c();
                               a.o(uoa, "SPHelper.getInstance\(\)");
                               String str2 = uoa.b().q(uFeatureDeta);
                               if (str2 == null) {
                                  d.b("rollbackFeatureConfig\(\) updatedConfigJson=null!!!", new IllegalStateException());
                                  list = CollectionsKt__CollectionsKt.E();
                                  _monitor_exit(b);
                               }else {
                                  a.c().o(obj.f(), str2);
                                  obj.c = uFeatureDeta;
                                  _monitor_exit(b);
                                  list = uArrayList;
                               }
                            }else {
                               throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                         }
                      }
                      list = CollectionsKt__CollectionsKt.E();
                      _monitor_exit(b);
                   }else {
                      list = CollectionsKt__CollectionsKt.E();
                      _monitor_exit(b);
                   }
                }
             }
          }else {
             list = CollectionsKt__CollectionsKt.E();
             _monitor_exit(b);
          }
       }
       return list;
    }
    public final List h(FeatureDetails p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiFeatureUpdateManager obj = PatchProxy.applyOneRefs(p0, this, g.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "updateDetails");
       obj = g.e;
       Objects.requireNonNull(obj);
       List list = PatchProxy.applyOneRefs(p0, obj, KwaiFeatureUpdateManager.class, "6");
       if (list != patchProxyRe) {
       }else {
          a.p(p0, "updateDetails");
          KwaiFeatureUpdateManager b = obj.b;
          _monitor_enter(b);
          if (!obj.h(p0)) {
             list = CollectionsKt__CollectionsKt.E();
             _monitor_exit(b);
          }else {
             FeatureDetails uFeatureDeta = obj.e().h();
             if (uFeatureDeta != null) {
                if (a.g(uFeatureDeta.getFeatureId(), p0.getFeatureId()) ^ 0x01) {
                   d.c("featureId not consistent! old="+uFeatureDeta.getFeatureId()+" new="+p0.getFeatureId());
                   list = CollectionsKt__CollectionsKt.E();
                   _monitor_exit(b);
                }else {
                   Pair pair = KwaiFeatureUpdateManager.c(obj, uFeatureDeta, p0, false, 4, null);
                   list = pair.getFirst();
                   FeatureDetails uFeatureDeta1 = new FeatureDetails(uFeatureDeta.getAppVersionName(), uFeatureDeta.getFeatureId(), uFeatureDeta.getSplitEntryFragments(), pair.getSecond());
                   a uoa = a.c();
                   a.o(uoa, "SPHelper.getInstance\(\)");
                   String str = uoa.b().q(uFeatureDeta1);
                   if (str == null) {
                      d.b("updateFeatureConfig\(\) updatedConfigJson=null!!!", new IllegalStateException());
                      list = CollectionsKt__CollectionsKt.E();
                      _monitor_exit(b);
                   }else if(list.isEmpty() ^ 0x01){
                      d.c("updateFeatureConfig\(\) updated:"+obj.d(list));
                   }else {
                      d.c("updateFeatureConfig\(\) number of updates is 0.");
                   }
                   a.c().o(obj.f(), str);
                   obj.c = uFeatureDeta1;
                   _monitor_exit(b);
                }
             }else {
                list = CollectionsKt__CollectionsKt.E();
                _monitor_exit(b);
             }
          }
       }
       return list;
    }
}
