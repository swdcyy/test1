package a09.a$c;
import erd.g;
import a09.a;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a$c implements g	// class@00000b
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a.p(p0, "fragmentEvent");
          if (p0 == FragmentEvent.RESUME) {
             p0 = this.b;
             if (p0.D != null) {
                p0.q2(0);
             }
          }
       }
       return;
    }
}
