package fia.f$i;
import erd.r;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class f$i implements r	// class@002904
{
    public static final f$i b;

    static {
       f$i.b = new f$i();
    }
    public void f$i(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, f$i.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "event");
          b = (p0.d == null && p0.c == null)? true: false;
       }
       return b;
    }
}
