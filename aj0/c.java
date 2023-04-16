package aj0.c;
import p55.a;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.bridge.a;
import java.util.Objects;
import nsd.s0;
import java.util.ArrayList;
import java.util.List;

public final class c	// class@0000ac
{

    public static final Map a(a p0){
       String obj = PatchProxy.applyOneRefs(p0, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map map = a.n.e(p0);
       Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.collections.List<kotlin.String>>");
       map = s0.k(map);
       obj = "tool";
       ArrayList uArrayList = map.get(obj);
       if (uArrayList == null) {
          uArrayList = new ArrayList();
          map.put(obj, uArrayList);
       }
       s0.g(uArrayList).add("canIUse");
       return map;
    }
}
