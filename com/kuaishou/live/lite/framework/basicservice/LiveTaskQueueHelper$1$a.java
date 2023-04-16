package com.kuaishou.live.lite.framework.basicservice.LiveTaskQueueHelper$1$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import xj3.e;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class LiveTaskQueueHelper$1$a implements Comparator	// class@000905
{

    public void LiveTaskQueueHelper$1$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveTaskQueueHelper$1$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Long.valueOf(p1.a()), Long.valueOf(p0.a()));
    }
}
