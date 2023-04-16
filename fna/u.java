package fna.u;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import fna.a;
import cra.c0;
import java.lang.Long;
import java.lang.Comparable;
import xrd.b;

public final class u implements Comparator	// class@002996
{

    public void u(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, u.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Long.valueOf((- p0.k.f().longValue())), Long.valueOf((- p1.k.f().longValue())));
    }
}
