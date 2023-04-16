package ee1.l;
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

public final class l implements a	// class@002111
{
    public final boolean a;

    public void l(boolean p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       l ta = this.a;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), p0, uod1, "49")) {
          p0 = p0.h;
          if (p0 != null) {
             f1 uof1 = f1.class;
             if (!PatchProxy.isSupport(uof1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), p0, uof1, "19")) {
                p0.a.X0(ta);
             }
          }
       }
       return;
    }
}
