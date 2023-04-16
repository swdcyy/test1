package a32.n$a;
import a32.r;
import a32.n;
import java.lang.Object;
import a32.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;

public class n$a implements r	// class@00002c
{
    public final n a;

    public void n$a(n p0){
       this.a = p0;
       super();
    }
    public void a(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       if (p0 != null && !this.a.p.contains(p0)) {
          this.a.p.add(p0);
          int i = this.a.S8();
          if (i > 0) {
             this.a.R8(p0, i);
          }
       }
       return;
    }
}
