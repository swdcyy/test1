package k79.m$a;
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

public final class m$a implements Comparator	// class@002b58
{

    public void m$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, m$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p1.b()), Integer.valueOf(p0.b()));
    }
}
