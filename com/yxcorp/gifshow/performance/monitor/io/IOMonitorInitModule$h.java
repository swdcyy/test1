package com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$h;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map$Entry;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class IOMonitorInitModule$h implements Comparator	// class@000e86
{

    public void IOMonitorInitModule$h(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, IOMonitorInitModule$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(p1.getValue(), p0.getValue());
    }
}
