package azb.g;
import azb.n;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import l36.b;
import azb.g$a;
import java.lang.Object;
import java.util.Objects;
import azb.g$b;
import java.util.List;
import com.yxcorp.gifshow.post.growth.TriggerTaskGroup;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.p3;
import q87.c;
import java.lang.Integer;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper;
import java.lang.StringBuilder;
import r46.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.feature.post.api.model.GrowthGuideConfig;
import qrd.l1;
import com.google.gson.JsonArray;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper$loadGuideConfig$guideConfigs$1;
import msd.l;
import java.util.Map;
import java.lang.Iterable;
import o16.a;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import com.kwai.robust.PatchProxyResult;
import s36.c;
import o36.g;
import com.google.gson.JsonObject;
import l36.a;
import java.lang.Void;
import java.lang.Number;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class g implements n	// class@000371
{
    public static final Map a;
    public static final List b;
    public static l c;
    public static l d;
    public static final List e;
    public static final List f;
    public static final g$b g;
    public static final g h;

    static {
       g.h = new g();
       g.a = new LinkedHashMap();
       g.b = new ArrayList();
       Objects.requireNonNull(b.c);
       b.a = new g$a();
       g.e = new ArrayList();
       g.f = new ArrayList();
       g.g = new g$b();
    }
    public void g(){
       super();
    }
    public static final List b(g p0){
       return g.e;
    }
    public void a(TriggerTaskGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "12")) {
          return;
       }
       a.p(p0, "triggerTaskGroup");
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthGuideTaskManager onTriggerFinish", objArray);
       g.f.remove(p0);
       this.f();
       return;
    }
    public final void c(String p0,Integer p1){
       CopyOnWriteArrayList d;
       GrowthGuideConfigCacheHelper growthGuideC = GrowthGuideConfigCacheHelper.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthGuideTaskManager loadGuideCfgs taskType "+p1+" scene "+p0, objArray);
       GrowthGuideConfigCacheHelper e = GrowthGuideConfigCacheHelper.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidTwoRefs(p1, p0, e, growthGuideC, "6")) {
          if (d.a.b() - 1) {
             Object[] objArray2 = new Object[0];
             p3.D().w("PostGrowth", "GrowthGuideConfigManager version not match", objArray2);
          }else {
             GrowthGuideConfigCacheHelper.c.clear();
             d = GrowthGuideConfigCacheHelper.d;
             if (d.isEmpty() ^ 0x01) {
                _monitor_enter(e);
                Iterator iterator3 = d.iterator();
                a.o(iterator3, "preloadGuideCfgInfo.iterator\(\)");
                while (iterator3.hasNext()) {
                   GrowthGuideConfig growthGuideC1 = iterator3.next();
                   a.o(growthGuideC1, "it");
                   if (GrowthGuideConfigCacheHelper.e.c(growthGuideC1, p1, p0)) {
                      GrowthGuideConfigCacheHelper.c.add(growthGuideC1);
                   }
                }
                GrowthGuideConfigCacheHelper.d.clear();
                _monitor_exit(e);
             }
             List c = GrowthGuideConfigCacheHelper.c;
             if (!(c.isEmpty() ^ 0x01)) {
                c.addAll(e.f(d.a.a(), new GrowthGuideConfigCacheHelper$loadGuideConfig$guideConfigs$1(p1, p0)));
             }
          }
       }
       g.a.clear();
       g.b.clear();
       Iterator iterator = GrowthGuideConfigCacheHelper.e.a().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().getGuideItemCfgs(a.b.a()).iterator();
          while (iterator1.hasNext()) {
             GrowthGuideItemConfig growthGuideI = iterator1.next();
             g.a.put(growthGuideI.getGuideItemId(), growthGuideI);
          }
       }
       List b = g.b;
       GrowthGuideConfigCacheHelper e1 = GrowthGuideConfigCacheHelper.e;
       Objects.requireNonNull(e1);
       ArrayList uArrayList = PatchProxy.apply(null, e1, growthGuideC, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          Iterator iterator2 = GrowthGuideConfigCacheHelper.c.iterator();
          while (iterator2.hasNext()) {
             uArrayList.add(Integer.valueOf(iterator2.next().getTaskType()));
          }
       }
       b.addAll(uArrayList);
       Object[] objArray1 = new Object[0];
       p3.D().w("PostGrowth", "GrowthGuideTaskManager taskTypes size "+g.b.size(), objArray1);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, g.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthGuideTaskManager onPageChanged", objArray);
       ArrayList uArrayList = new ArrayList();
       List f = g.f;
       uArrayList.addAll(f);
       f.clear();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          TriggerTaskGroup triggerTaskG = iterator.next();
          Objects.requireNonNull(triggerTaskG);
          if (PatchProxy.applyVoid(null, triggerTaskG, TriggerTaskGroup.class, "2")) {
             continue ;
          }else {
             Object[] objArray1 = new Object[0];
             p3.D().w("PostGrowth", "TriggerTaskGroup "+triggerTaskG.hashCode()+" cancel", objArray1);
             ArrayList uArrayList1 = new ArrayList();
             uArrayList1.addAll(triggerTaskG.a);
             Iterator iterator1 = uArrayList1.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().b("cancel");
             }
             triggerTaskG.a.clear();
             triggerTaskG.f.clear();
             triggerTaskG.c();
          }
       }
       return;
    }
    public final void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthGuideTaskManager registerTriggerEvents itemSize "+p0.size(), objArray);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          GrowthGuideItemConfig growthGuideI = iterator.next();
          List triggers = growthGuideI.getTriggers();
          if (triggers != null) {
             b c = b.c;
             String itemId = growthGuideI.getItemId();
             Objects.requireNonNull(c);
             if (PatchProxy.applyVoidTwoRefs(itemId, triggers, c, b.class, "1")) {
                continue ;
             }else {
                a.p(itemId, "itemId");
                a.p(triggers, "triggerConfigs");
                String str = "FlyWheel";
                if (!g.a) {
                   Object[] objArray1 = new Object[0];
                   p3.D().w(str, "register trigger, disable by kswitch", objArray1);
                }else {
                   Object[] objArray2 = new Object[0];
                   p3.D().w(str, "register trigger, itemId: "+itemId, objArray2);
                   Iterator iterator1 = triggers.iterator();
                   while (iterator1.hasNext()) {
                      JsonObject jsonObject = iterator1.next();
                      Iterator iterator2 = b.b.iterator();
                   }
                }
             }
          }
       }
       return;
    }
    public final void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "11")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       p3.D().w("PostGrowth", "GrowthGuideTaskManager tryRunNextTriggerTaskGroup", objArray1);
       l c = g.c;
       if (c != null) {
          Void void = c.invoke(g.f);
       }
       List f = g.f;
       if (f.isEmpty()) {
          objArray = new Object[i];
          p3.D().w("PostGrowth", "GrowthGuideTaskManager tryRunNextTriggerTaskGroup has no TriggerTaskGroup", objArray);
          return;
       }else {
          TriggerTaskGroup triggerTaskG = f.get(i);
          if (triggerTaskG.b == null) {
             if (!PatchProxy.applyVoid(objArray, triggerTaskG, TriggerTaskGroup.class, "1")) {
                Object[] objArray2 = new Object[i];
                p3.D().w("PostGrowth", "TriggerTaskGroup "+triggerTaskG.hashCode()+" start", objArray2);
                triggerTaskG.b = true;
                Iterator iterator = triggerTaskG.g.iterator();
                while (iterator.hasNext()) {
                   int i1 = iterator.next().intValue();
                   Collection uCollection = triggerTaskG.f.get(Integer.valueOf(i1));
                   TriggerTaskGroup triggerTaskG1 = (uCollection == null || uCollection.isEmpty())? 1: null;
                   if (triggerTaskG1) {
                   }else {
                      List list = triggerTaskG.f.remove(Integer.valueOf(i1));
                      if (list != null) {
                         Object[] objArray3 = new Object[i];
                         p3.D().w("PostGrowth", "TriggerTaskGroup start, has no fit taskType", objArray3);
                         triggerTaskG.b(i1, list);
                         i = 1;
                         break ;
                      }else if(!i){
                         triggerTaskG.c();
                      }
                   }
                }
             }
          }else {
             objArray = new Object[i];
             p3.D().w("PostGrowth", "GrowthGuideTaskManager tryRunNextTriggerTaskGroup another trigger is processing", objArray);
          }
          return;
       }
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       this.h(CollectionsKt___CollectionsKt.G5(g.a.values()));
       return;
    }
    public final void h(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthGuideTaskManager unRegisterTriggerEvents itemSize "+p0.size(), objArray);
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          b c = b.c;
          String itemId = iterator.next().getItemId();
          Objects.requireNonNull(c);
          if (PatchProxy.applyVoidOneRefs(itemId, c, b.class, "2")) {
             continue ;
          }else {
             a.p(itemId, "itemId");
             if (!g.a) {
                continue ;
             }else {
                Object[] objArray1 = new Object[0];
                p3.D().w("FlyWheel", "unregister trigger, itemId: "+itemId, objArray1);
                Iterator iterator1 = b.b.iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().c(itemId);
                }
             }
          }
       }
       return;
    }
}
