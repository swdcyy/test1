package fna.q;
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

public final class q implements Comparator	// class@002992
{

    public void q(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Long.valueOf((- p0.l.f().longValue())), Long.valueOf((- p1.l.f().longValue())));
    }
}
