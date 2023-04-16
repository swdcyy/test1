package k21.h;
import erd.g;
import k21.k;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import oq5.b;

public final class h implements g	// class@002c6c
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       k ok = k.class;
       if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, ok, "9")) {
          if (b) {
             tb.p.b();
          }else {
             tb.V8();
          }
       }
       return;
    }
}
