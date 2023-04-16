package ee1.b0;
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

public final class b0 implements a	// class@0020fc
{
    public final int a;
    public final int b;

    public void b0(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       b0 ta = this.a;
       b0 tb = this.b;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(ta), Integer.valueOf(tb), p0, uod1, "32")) {
          p0 = p0.h;
          Objects.requireNonNull(p0);
          f1 uof1 = f1.class;
          if (!PatchProxy.isSupport(uof1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(ta), Integer.valueOf(tb), p0, uof1, "26")) {
             p0.a.n(ta, tb);
          }
       }
       return;
    }
}
