package a1d.l;
import sfc.a;
import a1d.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class l extends a	// class@00003c
{
    public final k c;

    public void l(k p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.R8();
       return;
    }
}
