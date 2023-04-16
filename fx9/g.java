package fx9.g;
import erd.g;
import fx9.i;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class g implements g	// class@002372
{
    public final i b;

    public void g(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       i oi = i.class;
       if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, oi, "5")) {
          tb.y = b;
          tb.P8();
       }
       return;
    }
}
