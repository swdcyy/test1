package fia.f$j;
import erd.r;
import fia.f;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Collection;
import ekd.q;

public final class f$j implements r	// class@002905
{
    public final f b;

    public void f$j(f p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, f$j.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = q.f(this.b.I) ^ 0x01;
       }
       return b;
    }
}
