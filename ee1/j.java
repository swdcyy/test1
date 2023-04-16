package ee1.j;
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

public final class j implements a	// class@00210d
{
    public final boolean a;

    public void j(boolean p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       j ta = this.a;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), p0, uod1, "47")) {
          p0 = p0.h;
          if (p0 != null) {
             f1 uof1 = f1.class;
             if (!PatchProxy.isSupport(uof1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), p0, uof1, "17")) {
                p0.a.M(ta, p0.c);
             }
          }
       }
       return;
    }
}
