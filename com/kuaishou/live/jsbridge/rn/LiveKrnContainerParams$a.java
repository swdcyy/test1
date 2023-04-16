package com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams$a;
import java.lang.Object;
import nsd.u;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import com.kuaishou.live.jsbridge.rn.LiveKrnContainerParams;
import trd.t0;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class LiveKrnContainerParams$a	// class@001d27
{

    public void LiveKrnContainerParams$a(){
       super();
    }
    public void LiveKrnContainerParams$a(u p0){
       super();
    }
    public static Map c(LiveKrnContainerParams$a p0,Map p1,Map p2,int p3,Object p4){
       return p0.b(p1, null);
    }
    public final Map a(String p0,String p1,Map p2){
       Pair[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveKrnContainerParams$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "bundleId");
       a.p(p1, "componentName");
       obj = new Pair[]{new Pair(LiveKrnContainerParams.BUNDLE_ID, p0),new Pair(LiveKrnContainerParams.COMPONENT_NAME, p1)};
       return this.b(t0.W(obj), p2);
    }
    public final Map b(Map p0,Map p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveKrnContainerParams$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "containerParams");
       obj = new HashMap();
       if (p1 != null) {
          obj.putAll(p1);
       }
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          obj.put(uEntry.getKey().getParamName(), uEntry.getValue());
       }
       return obj;
    }
}
