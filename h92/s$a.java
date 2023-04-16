package h92.s$a;
import h92.s$c;
import h92.s;
import java.lang.Object;
import h92.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h92.r;
import java.lang.Runnable;
import ekd.k1;
import h92.q;

public class s$a implements s$c	// class@002d23
{
    public final s a;

    public void s$a(s p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "2")) {
          return;
       }
       k1.o(new r(this, p0));
       return;
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       k1.o(new q(this, p0));
       return;
    }
}
