package dl9.y;
import sfc.a;
import dl9.u;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.airbnb.lottie.LottieAnimationView;
import com.kuaishou.android.model.mix.QComment;
import java.util.Map;
import java.lang.Boolean;

public final class y extends a	// class@001fc6
{
    public final u c;

    public void y(u p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       a.p(p0, "throwable");
       super.b(p0);
       u c = this.c.C;
       if (c != null && c.p() == true) {
          c = this.c.C;
          if (c != null) {
             c.f();
          }
       }
       u.P8(this.c).updateDislike(false);
       String id = u.P8(this.c).getId();
       a.o(id, "mComment.id");
       u.R8(this.c).put(id, Boolean.FALSE);
       return;
    }
}
