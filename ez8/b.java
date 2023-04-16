package ez8.b;
import com.yxcorp.gifshow.widget.m;
import ez8.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n49.d;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.o;

public final class b extends m	// class@00226d
{
    public final a c;

    public void b(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "v");
       b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, a.class, "5")) {
          a r = tc.r;
          if (r == null) {
             a.S("mPhotoAdActionBarClickProcessor");
          }
          a p = tc.p;
          if (p == null) {
             a.S("mPhoto");
          }
          d uod = d.a();
          uod.b(107);
          uod.g(true);
          r.c(p, tc.getActivity(), uod);
       }
       return;
    }
}
