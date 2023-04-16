package gz9.g;
import erd.g;
import gz9.b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import de5.a;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.paycourse.PayVideoMeta;
import tl8.d;
import uw9.o;
import q87.c;
import java.util.Objects;
import gz9.a;
import io.reactivex.subjects.PublishSubject;

public final class g implements g	// class@00251c
{
    public final b b;

    public void g(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       b a;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          this.b.c.z(p0);
          this.b.f();
          p0 = this.b.g;
          a.o(p0, "mPhoto");
          p0 = p0.getEntity();
          p0 = (p0 != null)? p0.a(PayVideoMeta.class): null;
          if (p0 != null) {
             Object[] objArray = new Object[0];
             o.C().w("PayCoursePaymentController", "refresh new pay course", objArray);
             a = this.b.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(p0, a, a.class, "3")) {
                a.p(p0, "payVideoMeta");
                a.b.onNext(p0);
             }
          }
       }
       return;
    }
}
