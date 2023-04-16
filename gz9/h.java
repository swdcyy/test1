package gz9.h;
import erd.g;
import gz9.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class h implements g	// class@00251d
{
    public final b b;

    public void h(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          this.b.e();
       }
       return;
    }
}
