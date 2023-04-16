package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c$g;
import mn.d;
import java.lang.String;
import mn.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;

public class c$g extends d	// class@00115e
{

    public void c$g(String p0,int p1){
       super(p0, p1);
    }
    public Object a(b p0,Object p1,Object p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c$g.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return f.b(p1, String.class, p2);
    }
}
