package azb.g$b;
import s36.b;
import java.lang.Object;
import s36.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import azb.g;
import java.util.List;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import msd.l;
import java.lang.Void;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import lnc.d7;
import java.util.Objects;
import lq.i;
import java.util.Map;
import nsd.s0;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class g$b implements b	// class@000370
{

    public void g$b(){
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "1")) {
          return;
       }
       a.p(p0, "guideItem");
       g.b(g.h).remove(p0);
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "3")) {
          return;
       }
       a.p(p0, "guideItem");
       return;
    }
    public void c(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "2")) {
          return;
       }
       a.p(p0, "guideItem");
       return;
    }
    public void d(c p0){
       d7 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, g$b.class, "4")) {
          return;
       }
       a.p(p0, "guideItem");
       g h = g.h;
       g.b(h).add(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "PostGrowth";
       p3.D().w(str, "GrowthGuideTaskManager onShow item"+p0.hashCode()+" showing size "+g.b(h).size(), objArray);
       l d = g.d;
       if (d != null) {
          Void void = d.invoke(p0);
       }
       GrowthGuideItemConfig growthGuideI = p0.c();
       if (growthGuideI != null) {
          a = d7.a;
          String guideItemId = growthGuideI.getGuideItemId();
          Objects.requireNonNull(a);
          a.p(guideItemId, "guideId");
          if (i.h()) {
             String str1 = "guideItemShowCount";
             Map map = s0.k(i.m().z(str1));
             if (map == null) {
                map = new LinkedHashMap();
             }
             Integer integer = map.get(guideItemId);
             int i1 = (integer != null)? integer.intValue(): 0;
             map.put(guideItemId, Integer.valueOf((i1 + 1)));
             i.m().Q(str1, map);
          }
          if (a.g() == Integer.MIN_VALUE) {
             Object[] objArray1 = new Object[i];
             p3.D().w(str, "GrowthGuideTaskManager onShow record taskType "+growthGuideI.getTaskType(), objArray1);
             if (growthGuideI.isUnlock()) {
                Object[] objArray2 = new Object[i];
                p3.D().w(str, "GrowthGuideTaskManager onShow unblockable item", objArray2);
             }else {
                a.n(growthGuideI.getTaskType());
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = g.a.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (uEntry.getValue().getTaskType() != growthGuideI.getTaskType() && !uEntry.getValue().isUnlock()) {
                      uArrayList.add(uEntry.getValue());
                   }
                }
                g.h.h(uArrayList);
             }
          }
       }
       return;
    }
}
