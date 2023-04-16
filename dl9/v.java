package dl9.v;
import erd.g;
import dl9.u;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kuaishou.android.model.mix.QComment;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class v implements g	// class@001fbd
{
    public final u b;

    public void v(u p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "1")) {
       }else {
          String id = u.P8(this.b).getId();
          a.o(id, "mComment.id");
          u.R8(this.b).put(id, Boolean.FALSE);
       }
       return;
    }
}
