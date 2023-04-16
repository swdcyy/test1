package com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager$b;
import erd.o;
import java.lang.Object;
import daa.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import trd.u;
import trd.s0;
import usd.q;
import java.util.LinkedHashMap;
import java.util.Iterator;
import daa.l;
import java.lang.Integer;

public final class ConditionConfigManager$b implements o	// class@001ad1
{
    public static final ConditionConfigManager$b b;

    static {
       ConditionConfigManager$b.b = new ConditionConfigManager$b();
    }
    public void ConditionConfigManager$b(){
       super();
    }
    public Object apply(Object p0){
       LinkedHashMap linkedHashMa = PatchProxy.applyOneRefs(p0, this, ConditionConfigManager$b.class, "1");
       if (linkedHashMa != PatchProxyResult.class) {
       }else {
          a.p(p0, "wrapper");
          p0 = p0.conditions;
          LinkedHashMap linkedHashMa1 = new LinkedHashMap(q.n(s0.j(u.Y(p0, 10)), 16));
          p0 = p0.iterator();
          while (p0.hasNext()) {
             Object obj = p0.next();
             linkedHashMa1.put(Integer.valueOf(obj.id), obj);
          }
          linkedHashMa = linkedHashMa1;
       }
       return linkedHashMa;
    }
}
