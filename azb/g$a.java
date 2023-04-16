package azb.g$a;
import l36.b$a;
import java.lang.Object;
import java.util.List;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import azb.g;
import java.util.Objects;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import lnc.d7;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.post.api.model.GrowthGuideItemConfig;
import java.lang.Integer;
import java.util.ArrayList;
import com.yxcorp.gifshow.post.growth.TriggerTaskGroup;
import com.yxcorp.gifshow.post.growth.GrowthGuideTaskManager$onTrigger$2;
import azb.n;
import s36.b;
import msd.a;

public final class g$a implements b$a	// class@00036f
{

    public void g$a(){
       super();
    }
    public void a(List p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$a.class, "1")) {
          return;
       }
       a.p(p0, "items");
       a.p(p1, "triggerParams");
       g h = g.h;
       Objects.requireNonNull(h);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, h, g.class, "10") && !p0.isEmpty()) {
          Object[] objArray = new Object[0];
          p3.D().w("PostGrowth", "GrowthGuideTaskManager on trigger success: "+p0, objArray);
          d7.a.g();
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             GrowthGuideItemConfig growthGuideI = g.a.get(iterator.next());
             if (growthGuideI != null) {
                List list = linkedHashMa.get(Integer.valueOf(growthGuideI.getTaskType()));
                if (list == null) {
                   list = new ArrayList();
                }
                list.add(growthGuideI);
                linkedHashMa.put(Integer.valueOf(growthGuideI.getTaskType()), list);
             }
          }
          TriggerTaskGroup triggerTaskG = new TriggerTaskGroup(h, g.g, linkedHashMa, g.b, p1, GrowthGuideTaskManager$onTrigger$2.INSTANCE);
          g.f.add(v8);
          h.f();
       }
       return;
    }
}
