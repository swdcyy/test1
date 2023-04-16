package gz9.f;
import erd.g;
import gz9.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import uw9.o;
import q87.c;
import com.yxcorp.gifshow.detail.event.PlayEvent;
import com.yxcorp.gifshow.detail.event.PlayEvent$Status;
import com.yxcorp.gifshow.entity.QPhoto;
import org.greenrobot.eventbus.a;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.PayCourseApiService;
import brd.t;
import cjd.e;
import erd.o;
import gz9.j;
import gz9.k;
import crd.b;
import crd.a;

public final class f implements g	// class@00251b
{
    public final b b;

    public void f(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          b uob = b.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, uob, "9")) {
             Object[] objArray1 = new Object[0];
             o.C().w("PayCoursePaymentController", "startPayRequest", objArray1);
             p0.g();
             if (!PatchProxy.applyVoid(objArray, p0, uob, "6")) {
                a.d().k(new PlayEvent(p0.g, PlayEvent$Status.PAUSE, 19));
             }
             p0.i.c(b.a(0x74d268f).getPrepayInfo(p0.d(), 1).map(new e()).subscribe(new j(p0), new k(p0)));
          }
       }
       return;
    }
}
