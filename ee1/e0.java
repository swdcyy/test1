package ee1.e0;
import z1.a;
import android.graphics.Bitmap;
import java.lang.Object;
import wv4.d1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import wv4.o0;
import wv4.a;
import tv4.a;

public final class e0 implements a	// class@002102
{
    public final Bitmap a;
    public final int b;

    public void e0(Bitmap p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       e0 ta = this.a;
       e0 tb = this.b;
       Objects.requireNonNull(p0);
       d1 uod1 = d1.class;
       if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidTwoRefs(ta, Integer.valueOf(tb), p0, uod1, "12")) {
          p0 = p0.g;
          Objects.requireNonNull(p0);
          o0 oo0 = o0.class;
          if (!PatchProxy.isSupport(oo0) || !PatchProxy.applyVoidTwoRefs(ta, Integer.valueOf(tb), p0, oo0, "8")) {
             p0.a.c1(ta, tb);
          }
       }
       return;
    }
}
