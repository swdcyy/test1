package com.kwai.plugin.dva.work.b;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Float;
import java.util.List;
import com.kwai.plugin.dva.work.c;
import java.util.LinkedList;
import java.util.HashMap;
import java.lang.Long;
import com.kwai.plugin.dva.work.b$a;
import com.kwai.plugin.dva.work.WorkExecutors;
import java.util.concurrent.Executor;
import com.kwai.plugin.dva.work.c$c;

public class b	// class@0013a2
{

    public void b(){
       super();
    }
    public static float a(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       float f = 0;
       Iterator iterator = p0.values().iterator();
       while (iterator.hasNext()) {
          f = f + iterator.next().floatValue();
       }
       return (f / (float)p0.size());
    }
    public static c b(List p0){
       LinkedList obj = PatchProxy.applyOneRefs(p0, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj.add(iterator.next().e());
       }
       c uoc = c.j(obj);
       int[] ointArray = new int[]{0};
       int i = p0.size();
       HashMap hashMap = new HashMap(p0.size());
       Iterator iterator1 = p0.iterator();
       while (iterator1.hasNext()) {
          hashMap.put(Long.valueOf(iterator1.next().f()), Float.valueOf(0));
       }
       Iterator iterator2 = p0.iterator();
       while (iterator2.hasNext()) {
          Object obj1 = iterator2.next();
          b$a uoa = new b$a(uoc, obj1, hashMap, ointArray, i, p0);
          obj1.b(WorkExecutors.c, v13);
       }
       return uoc;
    }
}
