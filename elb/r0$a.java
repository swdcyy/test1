package elb.r0$a;
import java.util.Comparator;
import java.lang.Object;
import elb.p0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class r0$a implements Comparator	// class@002764
{
    public static final r0$a b;

    static {
       r0$a.b = new r0$a();
    }
    public void r0$a(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, r0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.m(p0);
          a.m(p1);
          i = a.t(p0.a(), p1.a());
       }
       return i;
    }
}
