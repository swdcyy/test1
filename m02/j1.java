package m02.j1;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.Pair;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class j1 implements Comparator	// class@0030c4
{

    public void j1(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(p0.getSecond(), p1.getSecond());
    }
}
