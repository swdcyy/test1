package cl9.q2$c;
import erd.g;
import cl9.q2;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yk9.f;

public final class q2$c implements g	// class@00065b
{
    public final q2 b;

    public void q2$c(q2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q2$c.class, "1")) {
       }else {
          a.p(p0, "fragmentEvent");
          if (p0 == FragmentEvent.PAUSE) {
             q2.P8(this.b).e();
          }
       }
       return;
    }
}
