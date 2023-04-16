package cb5.u$b;
import gka.o;
import cb5.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class u$b implements o	// class@00045a
{
    public final u b;

    public void u$b(u p0){
       this.b = p0;
       super();
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, u$b.class, "2")) {
          return;
       }
       u$b tb = this.b;
       if (tb.t != null) {
          k1.r(tb.z, tb.S8());
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, u$b.class, "1")) {
          return;
       }
       this.b.P8();
       return;
    }
}
