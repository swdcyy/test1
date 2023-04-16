package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$j;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public class c$j extends d	// class@001161
{

    public void c$j(String p0,int p1){
       super(p0, p1);
    }
    public Object a(b p0,Object p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$j.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return a.t().c(p1, p2);
    }
}
