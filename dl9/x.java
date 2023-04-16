package dl9.x;
import erd.g;
import dl9.u;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import kotlin.jvm.internal.a;
import java.lang.Boolean;
import brd.y;
import java.util.Map;

public final class x implements g	// class@001fc3
{
    public final u b;

    public void x(u p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "1")) {
       }else if(u.P8(this.b).mLiked != null){
          p0 = this.b.w;
          if (p0 == null) {
             a.S("mCancelLikedSubject");
          }
          p0.onNext(Boolean.TRUE);
       }
       String id = u.P8(this.b).getId();
       a.o(id, "mComment.id");
       u.R8(this.b).put(id, Boolean.FALSE);
       return;
    }
}
