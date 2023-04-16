package o02.d;
import erd.g;
import h91.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d implements g	// class@00344b
{
    public final a b;

    public void d(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          d tb = this.b;
          if (tb != null) {
             tb.onError(p0);
          }
       }
       return;
    }
}
