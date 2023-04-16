package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PersistentStorage$b	// class@00114e
{
    public int launch;
    public long time;
    public Object value;

    public void PersistentStorage$b(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PersistentStorage$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{time:"+this.time+",launch:"+this.launch+",value:"+this.value+"}";
    }
}
