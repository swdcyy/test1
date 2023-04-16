package ee1.i;
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

public final class i implements a	// class@00210b
{
    public final boolean a;

    public void i(boolean p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       i ta = this.a;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), p0, uod1, "19")) {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          f1 uof1 = f1.class;
          if (!PatchProxy.isSupport(uof1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), p0, uof1, "12")) {
             p0.a.F0(ta);
          }
       }
       return;
    }
}
