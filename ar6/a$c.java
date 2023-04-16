package ar6.a$c;
import zq6.o$a;
import ar6.a;
import java.lang.Object;
import wq6.h;
import zq6.p;
import zq6.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.kcube.internal.tab.TabNode;
import wq6.m;
import ar6.c;
import ar6.f;
import java.lang.StringBuilder;
import ur6.f;
import com.kwai.kcube.internal.tab.container.ContainerTabNode;
import com.kwai.kcube.TabIdentifier;
import msd.a;
import nsd.u;

public final class a$c implements o$a	// class@00039b
{
    public final a a;

    public void a$c(a p0){
       this.a = p0;
       super();
    }
    public v a(h p0,p p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "child");
       a.p(p1, "stateId");
       a.p(p2, "callerInfo");
       return this.a.i(m.b(p0), p1, p2);
    }
    public v b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "value");
       f uof = new f(p0, null, 0x7531+this.a.g.d0().M2()+"×éºÏ", null, false, 26, null);
       return obj;
    }
}
