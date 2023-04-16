package ao.b$d;
import erd.c;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class b$d implements c	// class@000201
{
    public static final b$d a;

    static {
       b$d.a = new b$d();
    }
    public void b$d(){
       super();
    }
    public Object a(Object p0,Object p1){
       Boolean uBoolean = PatchProxy.applyTwoRefs(p0, p1, this, b$d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          a.p(p0, "t1");
          a.p(p1, "t2");
          boolean b = (p0.booleanValue() && p1.booleanValue())? true: false;
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
