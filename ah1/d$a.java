package ah1.d$a;
import androidx.lifecycle.Observer;
import ah1.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.util.concurrent.atomic.AtomicInteger;

public class d$a implements Observer	// class@00009c
{
    public final Observer b;
    public int c;
    public final d d;

    public void d$a(d p0,Observer p1,int p2){
       this.d = p0;
       super();
       this.c = -1;
       this.b = p1;
       this.c = p2;
    }
    public boolean equals(Object p0){
       d$a uoa = d$a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uoa != p0.getClass()) {
          return false;
       }
       uoa = this.b;
       p0 = p0.b;
       if (uoa != p0 && !uoa.equals(p0)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, d$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.hashCode();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       if (this.d.a.get() > this.c && (p0 != null || this.d.b != null)) {
          this.b.onChanged(p0);
       }
       return;
    }
}
