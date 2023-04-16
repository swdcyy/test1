package id9.a0;
import erd.g;
import id9.b0;
import java.lang.Object;
import mc9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;

public final class a0 implements g	// class@0027e5
{
    public final b0 b;

    public void a0(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b0.class, "4")) {
       }else {
          a c = p0.c;
          if (c == 2 || c == 7) {
             tb.o = p0.a;
             tb.p = p0.b.getAbsolutePath();
             tb.g2();
          }
       }
       return;
    }
}
