package dl9.u$e;
import erd.g;
import dl9.u;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.QComment;

public final class u$e implements g	// class@001faf
{
    public final u b;

    public void u$e(u p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u$e.class, "1")) {
       }else {
          a.o(p0, "clickLike");
          if (p0.booleanValue() && (u.P8(this.b).mDisliked != null && this.b.W8())) {
             this.b.S8();
          }
       }
       return;
    }
}
