package com.kuaishou.bizmonitor.framework.funnel.collector.registers.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$a;
import java.lang.String;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$b;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$c;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$d;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$e;
import com.kuaishou.bizmonitor.framework.funnel.collector.registers.a$f;
import java.lang.Object;
import mn.b;
import qu.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.RuntimeException;

public class a	// class@00118d
{
    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    public static final d f;

    static {
       a.a = new a$a("onFunnelUpload", 3, 4);
       a.b = new a$b("onErrorUpload", 3, 4);
       a.c = new a$c("onKSUEvent", 3, 4);
       a.d = new a$d("onEventBus", 3, 4);
       a.e = new a$e("onKLog", 4, 4);
       a.f = new a$f("onAppEvent", 3, 4);
    }
    public void a(){
       super();
    }
    public static void a(b p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       p0 = p0.c("__registers__");
       if (!p0 instanceof List) {
          throw new RuntimeException("registers not enabled");
       }
       p0.add(p1);
       return;
    }
}
