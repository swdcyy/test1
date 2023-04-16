package buc.f$c;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import qsc.c;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class f$c implements Comparator	// class@000494
{

    public void f$c(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p0.getPriority()), Integer.valueOf(p1.getPriority()));
    }
}
