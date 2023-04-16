package kod.a$n;
import t36.f$a;
import java.lang.Object;
import voc.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a$n implements f$a	// class@001805
{
    public final boolean a;

    public void a$n(boolean p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$n.class, "1")) {
       }else {
          p0.g(this.a);
       }
       return;
    }
}
