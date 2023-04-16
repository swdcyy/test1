package l69.b;
import erd.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import ra0.d;
import brd.t;

public final class b implements o	// class@002c94
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "pathList");
          ot = d.a(0x1bf6ff1d).Mm(p0);
       }
       return ot;
    }
}
