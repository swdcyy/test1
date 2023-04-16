package dl9.v1;
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

public class v1 extends a	// class@001fbc
{
    public final u1 c;

    public void v1(u1 p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, v1.class, str)) {
          return;
       }
       super.b(p0);
       this.c.k9();
       v1 tc = this.c;
       tc.x.put(tc.v.getId(), Boolean.FALSE);
       return;
    }
}
