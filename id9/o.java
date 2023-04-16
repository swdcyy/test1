package id9.o;
import erd.g;
import id9.t;
import java.lang.Object;
import vf9.g0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class o implements g	// class@0027f5
{
    public final t b;

    public void o(t p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, t.class, "12")) {
       }else if(p0.a == null){
          tb.h2();
       }
       return;
    }
}
