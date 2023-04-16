package hv1.c$b;
import erd.g;
import hv1.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;

public final class c$b implements g	// class@002788
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
       }else {
          this.b.a.onNext(p0);
       }
       return;
    }
}
