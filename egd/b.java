package egd.b;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import egd.c;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class b implements Comparator	// class@000d11
{

    public void b(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Long.valueOf(p1.b()), Long.valueOf(p0.b()));
    }
}
