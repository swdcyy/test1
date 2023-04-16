package jg9.x0$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.Pair;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class x0$a implements Comparator	// class@002abe
{

    public void x0$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, x0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(p0.getSecond(), p1.getSecond());
    }
}
