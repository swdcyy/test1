package hv1.d;
import erd.g;
import hv1.c;
import java.lang.Object;
import fv1.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrd.a;

public final class d implements g	// class@00278b
{
    public final c b;

    public void d(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          this.b.b.onNext(p0);
       }
       return;
    }
}
