package ec9.d;
import java.util.Comparator;
import ec9.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ac9.g;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class d implements Comparator	// class@00216d
{
    public final e b;

    public void d(e p0){
       this.b = p0;
       super();
    }
    public final int compare(Object p0,Object p1){
       HashMap obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.c.get(p0.getTemplateId());
       if (obj != null) {
          p0 = obj.get(Integer.valueOf(p0.getType()));
          if (p0 != null) {
          label_003b :
             obj = this.b.c.get(p1.getTemplateId());
             if (obj != null) {
                p1 = obj.get(Integer.valueOf(p1.getType()));
                if (p1 != null) {
                label_0062 :
                   return b.f(p0, p1);
                }
             }
             p1 = Integer.valueOf(-1);
             goto label_0062 ;
          }
       }
       p0 = Integer.valueOf(-1);
       goto label_003b ;
    }
}
