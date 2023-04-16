package d82.n$a;
import d82.n$c;
import d82.n;
import java.lang.Object;
import jg1.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;

public class n$a implements n$c	// class@002497
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "2")) {
          return;
       }
       if (this.a.v.contains(p0)) {
          this.a.v.remove(p0);
       }
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       if (!this.a.v.contains(p0)) {
          this.a.v.add(p0);
       }
       return;
    }
}
