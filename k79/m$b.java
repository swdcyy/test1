package k79.m$b;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import jlb.b;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class m$b implements Comparator	// class@002b59
{

    public void m$b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, m$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p1.b()), Integer.valueOf(p0.b()));
    }
}
