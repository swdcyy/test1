package gz9.b$b;
import erd.g;
import gz9.b;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import uw9.o;
import q87.c;
import ok.x;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.yxcorp.gifshow.feed.d;
import gz9.g;
import gz9.h;
import crd.b;
import crd.a;

public final class b$b implements g	// class@002515
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          b uob = b.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, uob, "15")) {
             Object[] objArray1 = new Object[0];
             o.C().w("PayCoursePaymentController", "onOrderSuccess", objArray1);
             p0.d.get().logTrialDuration();
             p0.a();
             if (!PatchProxy.applyVoid(objArray, p0, uob, "16")) {
                p0.i.c(d.a(p0.g).subscribe(new g(p0), new h(p0)));
             }
          }
       }
       return;
    }
}
