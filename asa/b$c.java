package asa.b$c;
import cta.a;
import asa.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$Status;
import java.util.Collection;
import uv8.q0;
import java.lang.reflect.Type;
import java.util.Map;
import tra.a;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import wq6.g;
import com.kuaishou.gifshow.platform.network.keyconfig.DynamicTabConfig$ActivityTabConfig;
import java.lang.Boolean;
import uv8.r0;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import xr6.c;
import xr6.c$a;
import xr6.c$b;
import wq6.f;

public final class b$c implements a	// class@0002e1
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       DynamicTabConfig obj;
       DynamicTabConfig obj1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
          return;
       }
       a.p(p0, "list");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       int i = 1;
       while (iterator.hasNext()) {
          obj = iterator.next();
          obj1 = obj;
          if (!a.g(obj1.mType, "ato_operate") || (obj1.mStatus != DynamicTabConfig$Status.ADD || obj1.mActivityTabConfig == null)) {
             i = 0;
          }
          if (i) {
             uArrayList.add(obj);
          }
       }
       if (uArrayList.isEmpty() ^ i) {
          Map map = a.e(q0.M);
          a.o(map, "DefaultPreferenceHelper\n…CK_DEFAULT_SHOW_ACTIVITY\)");
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             obj = iterator1.next();
             DynamicTabConfig mType = obj.mType;
             a.o(mType, "it.mType");
             h oh = this.a.x.G(new TabIdentifier(mType, obj.mId));
             if (oh != null) {
                obj1 = obj.mActivityTabConfig;
                a.m(obj1);
                if (!map.containsKey(obj1.mActivityId)) {
                   obj1 = obj.mActivityTabConfig;
                   a.m(obj1);
                   DynamicTabConfig$ActivityTabConfig mActivityId = obj1.mActivityId;
                   a.o(mActivityId, "it.mActivityTabConfig!!.mActivityId");
                   map.put(mActivityId, Boolean.TRUE);
                   a.h(map);
                   r0.c(oh.M2());
                   obj = obj.mActivityTabConfig;
                   a.m(obj);
                   Object[] objArray = new Object[0];
                   b.C().w("KCubeBlockActionBarPresenter", "XBlock 自动切到活动: "+obj.mActivityId, objArray);
                   this.a.x.J(oh.M2(), 0, c.e.c("XBlockAddActivity").a());
                }
             }
          }
       }
       return;
    }
}
