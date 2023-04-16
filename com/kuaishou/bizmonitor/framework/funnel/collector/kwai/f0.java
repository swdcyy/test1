package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.f0;
import mn.d;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$b;

public class f0 extends d	// class@00116a
{
    public final PersistentStorage B0;

    public void f0(PersistentStorage p0,String p1,int p2){
       this.B0 = p0;
       super(p1, p2);
    }
    public Object a(b p0,Object p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, f0.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.B0.b(p1);
    }
}
