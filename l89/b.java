package l89.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.Result;
import kf7.a;
import java.util.Collection;
import java.util.Iterator;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import java.lang.Long;
import java.lang.Boolean;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;

public final class b	// class@002ccf
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final List a(){
       boolean b;
       ArrayList obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(a.c());
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          DependencyTask uDependencyT = iterator.next();
          HashMap hashMap = new HashMap();
          hashMap.put("scheduledThread", Integer.valueOf(uDependencyT.v()));
          hashMap.put("startTimestamp", Long.valueOf(uDependencyT.x()));
          hashMap.put("wallTimeCost", Long.valueOf(uDependencyT.y()));
          hashMap.put("cpuTimeCost", Long.valueOf(uDependencyT.p()));
          hashMap.put("state", Integer.valueOf(uDependencyT.r()));
          hashMap.put("name", uDependencyT.name());
          b = (!uDependencyT.v())? true: false;
          hashMap.put("isMainThread", Boolean.valueOf(b));
          obj.add(hashMap);
       }
       Result.constructor-impl(l1.a);
       return obj;
    }
}
