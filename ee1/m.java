package ee1.m;
import z1.a;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wv4.f1;
import wv4.a;
import tv4.a;

public final class m implements a	// class@002113
{
    public final int a;

    public void m(int p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       m ta = this.a;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(ta), p0, uod1, "23")) {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          f1 uof1 = f1.class;
          if (PatchProxy.isSupport(uof1) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(ta), p0, uof1, "16") && p0.C())) {
             p0.a.H(p0.c, ta);
          }
       }
       return;
    }
}
