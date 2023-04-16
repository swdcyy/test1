package dl9.w;
import sfc.a;
import dl9.u;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.QComment;
import java.util.Map;
import java.lang.Boolean;

public final class w extends a	// class@001fc0
{
    public final u c;

    public void w(u p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       super.b(p0);
       if (u.P8(this.c).mLiked == null) {
          u.P8(this.c).updateDislike(true);
       }
       String id = u.P8(this.c).getId();
       a.o(id, "mComment.id");
       u.R8(this.c).put(id, Boolean.FALSE);
       return;
    }
}
