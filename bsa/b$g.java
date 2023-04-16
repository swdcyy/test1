package bsa.b$g;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class b$g implements r	// class@000457
{
    public static final b$g b;

    static {
       b$g.b = new b$g();
    }
    public void b$g(){
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, b$g.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "active");
          b = p0.booleanValue() ^ 0x01;
       }
       return b;
    }
}
