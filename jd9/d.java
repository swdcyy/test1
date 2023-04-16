package jd9.d;
import erd.g;
import jd9.f;
import java.lang.Object;
import mc9.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements g	// class@002a5d
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "8")) {
       }else {
          p0 = p0.c;
          if (p0 == 7 || p0 == 2) {
             tb.h2();
          }
       }
       return;
    }
}
