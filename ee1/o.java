package ee1.o;
import z1.a;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import wv4.f1;
import wv4.a;
import tv4.a;

public final class o implements a	// class@002117
{
    public final boolean a;
    public final boolean b;

    public void o(boolean p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       o ta = this.a;
       o tb = this.b;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(ta), Boolean.valueOf(tb), p0, uod1, "20")) {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          f1 uof1 = f1.class;
          if (!PatchProxy.isSupport(uof1) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(ta), Boolean.valueOf(tb), p0, uof1, "13")) {
             p0.a.Z(ta, tb);
          }
       }
       return;
    }
}
