package e93.f$d;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import e93.f$a;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class f$d implements Comparator	// class@0026bf
{

    public void f$d(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Long.valueOf(p1.a()), Long.valueOf(p0.a()));
    }
}
