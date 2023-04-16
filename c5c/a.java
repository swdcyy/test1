package c5c.a;
import java.util.Comparator;
import java.lang.Object;
import t2c.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;

public final class a implements Comparator	// class@000520
{

    public void a(){
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          a.p(p0, "o1");
          a.p(p1, "o2");
          i = p0.getPriority() - p1.getPriority();
       }
       return i;
    }
}
