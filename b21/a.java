package b21.a;
import erd.h;
import java.lang.Object;
import java.lang.Integer;
import oe3.h;
import fe3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Triple;
import kotlin.jvm.internal.a;

public final class a implements h	// class@00030a
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public Object a(Object p0,Object p1,Object p2){
       Triple triple = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (triple != PatchProxyResult.class) {
       }else {
          a.p(p0, "a");
          a.p(p1, "b");
          a.p(p2, "c");
          triple = new Triple(p0, p1, p2);
       }
       return triple;
    }
}
