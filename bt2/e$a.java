package bt2.e$a;
import bt2.d;
import bt2.e;
import java.lang.Object;
import at2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mrd.a;

public final class e$a implements d	// class@000447
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       a.p(p0, "message");
       this.a.i.onNext(p0);
       return;
    }
}
