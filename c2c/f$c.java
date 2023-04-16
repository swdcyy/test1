package c2c.f$c;
import erd.g;
import c2c.f;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import c2c.e;
import java.lang.Enum;
import qrd.l1;

public final class f$c implements g	// class@0004fd
{
    public final f b;

    public void f$c(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
       }else {
          a.p(p0, "fragmentEvent");
          f$c tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, f.class, "15")) {
             int i = e.b[p0.ordinal()];
             if (i != 1) {
                if (i == 2) {
                   tb.S8();
                }
             }else {
                tb.R8();
             }
          }
       }
       return;
    }
}
