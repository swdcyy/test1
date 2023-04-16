package eg1.m;
import iy2.f$a;
import eg1.j;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.util.Iterator;
import java.util.Set;

public class m implements f$a	// class@002157
{
    public final j a;

    public void m(j p0){
       this.a = p0;
       super();
    }
    public void d(long p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, om, "1")) {
          return;
       }
       Iterator iterator = this.a.h.iterator();
       while (iterator.hasNext()) {
          f$a uoa = iterator.next();
          if (uoa != null) {
             uoa.d(p0);
          }
       }
       return;
    }
    public void h(long p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, om, "2")) {
          return;
       }
       Iterator iterator = this.a.h.iterator();
       while (iterator.hasNext()) {
          f$a uoa = iterator.next();
          if (uoa != null) {
             uoa.h(p0);
          }
       }
       return;
    }
}
