package eja.z$d;
import erd.r;
import java.lang.Object;
import ja6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Collection;
import ekd.q;

public final class z$d implements r	// class@00270b
{
    public static final z$d b;

    static {
       z$d.b = new z$d();
    }
    public void z$d(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, z$d.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          b = q.f(p0.a) ^ 0x01;
       }
       return b;
    }
}
