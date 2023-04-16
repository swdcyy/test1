package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$i;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public class c$i extends d	// class@001160
{

    public void c$i(String p0,int p1){
       super(p0, p1);
    }
    public Object a(b p0,Object p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$i.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return Integer.valueOf(a.t().a(p1, p2.intValue()));
    }
}
