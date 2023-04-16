package c71.b;
import java.lang.Object;
import java.util.List;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.bottombar.service.model.config.LiveBottomServerConfig$BottomBarItem;
import java.lang.Integer;
import java.util.HashSet;
import java.util.Collection;
import java.util.Set;
import ekd.q;

public class b	// class@000483
{

    public void b(){
       super();
    }
    public static Map a(List p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(Integer.valueOf(iterator.next().mBottomBarItemId));
       }
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator1 = p0.iterator();
       while (iterator1.hasNext()) {
          LiveBottomServerConfig$BottomBarItem uBottomBarIt = iterator1.next();
          HashSet hashSet = new HashSet(uArrayList);
          uArrayList1.add(Integer.valueOf(uBottomBarIt.mBottomBarItemId));
          hashSet.removeAll(uArrayList1);
          if (!q.f(hashSet)) {
             obj.put(Integer.valueOf(uBottomBarIt.mBottomBarItemId), hashSet);
          }
       }
       return obj;
    }
}
