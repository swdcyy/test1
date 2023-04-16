package com.kwai.performance.stability.crash.monitor.excluded.ExcludedHwNsdImplNpe$SafeHashMap;
import java.util.HashMap;
import com.kwai.performance.stability.crash.monitor.excluded.ExcludedHwNsdImplNpe$a;
import java.lang.Object;
import java.lang.Integer;

public class ExcludedHwNsdImplNpe$SafeHashMap extends HashMap	// class@0011cf
{

    public void ExcludedHwNsdImplNpe$SafeHashMap(){
       super();
    }
    public void ExcludedHwNsdImplNpe$SafeHashMap(ExcludedHwNsdImplNpe$a p0){
       super();
    }
    public Object get(Object p0){
       p0 = super.get(p0);
       if (p0 == null) {
          p0 = Integer.valueOf(0);
       }
       return p0;
    }
}
