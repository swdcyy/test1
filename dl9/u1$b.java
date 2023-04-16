package dl9.u1$b;
import sfc.a;
import dl9.u1;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Boolean;
import java.util.Map;

public class u1$b extends a	// class@001fb8
{
    public final u1 c;

    public void u1$b(u1 p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u1$b.class, "1")) {
          return;
       }
       super.b(p0);
       if (!this.c.V8() || this.c.v.mDisliked == null) {
          this.c.j9();
       }
       u1$b tc = this.c;
       tc.x.put(tc.v.getId(), Boolean.FALSE);
       return;
    }
}
