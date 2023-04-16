package f1a.c$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map$Entry;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class c$a implements Comparator	// class@002272
{

    public void c$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(p1.getValue(), p0.getValue());
    }
}
