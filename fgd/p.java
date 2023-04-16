package fgd.p;
import erd.o;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class p implements o	// class@000e31
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public Object apply(Object p0){
       Boolean uBoolean = PatchProxy.applyOneRefs(p0, this, p.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
