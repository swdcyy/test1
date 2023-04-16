package ay9.e;
import erd.g;
import ay9.q;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xl8.b;
import java.lang.Boolean;
import qp7.b;

public final class e implements g	// class@0002f3
{
    public final q b;

    public void e(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && !tb.r0(tb.q0())) {
          tb.z0();
          if (!PatchProxy.applyVoid(null, tb, q.class, "4")) {
             q d = tb.D;
             if (d == null || d.a().booleanValue()) {
                tb.c0();
             }
          }
          tb.v = p0;
          tb.x0();
       }
       return;
    }
}
