package f3a.l$f;
import erd.g;
import f3a.l;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class l$f implements g	// class@00228e
{
    public final l b;

    public void l$f(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$f.class, "1")) {
       }else {
          this.b.Z8(p0.isEmpty());
       }
       return;
    }
}
