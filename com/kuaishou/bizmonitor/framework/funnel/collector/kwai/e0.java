package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.e0;
import mn.d;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.List;

public class e0 extends d	// class@001168
{
    public final PersistentStorage B0;

    public void e0(PersistentStorage p0,String p1,int p2){
       this.B0 = p0;
       super(p1, p2);
    }
    public Object b(b p0,Object[] p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, e0.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return this.B0.d(p1[0], p1[1].intValue(), p1[2].intValue(), p1[3].intValue());
    }
}
