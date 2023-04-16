package fna.t;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import fna.a;
import java.util.List;
import fna.v;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class t implements Comparator	// class@002995
{

    public void t(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Long.valueOf((- v.e(p0.o))), Long.valueOf((- v.e(p1.o))));
    }
}
