package a04.d;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a04.b;
import java.util.Objects;
import a04.a;
import kotlin.Pair;
import brd.g;

public final class d implements g	// class@00000a
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void subscribe(v p0){
       b d;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       d = b.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidOneRefs(p0, d, b.class, "13")) {
          p0.onNext(a.d.b());
          p0.onComplete();
       }
       return;
    }
}
