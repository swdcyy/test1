package iz9.a$j;
import erd.g;
import iz9.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.BitSet;

public final class a$j implements g	// class@0028d5
{
    public final a b;

    public void a$j(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$j.class, "1")) {
       }else {
          a.o(p0, "isSeek");
          if (p0.booleanValue()) {
             this.b.w.set(2);
             this.b.n0("notifyLoading");
          }else {
             this.b.w.clear(2);
             this.b.o0("notifyLoading");
          }
       }
       return;
    }
}
