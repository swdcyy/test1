package bu7.j0$b;
import java.util.Comparator;
import bu7.j0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import bu7.j0$a;

public class j0$b implements Comparator	// class@00048e
{
    public final j0 b;

    public void j0$b(j0 p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j0$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0.a() - p1.a() > 0) {
          return 1;
       }
       return 0;
    }
}
