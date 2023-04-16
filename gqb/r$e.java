package gqb.r$e;
import erd.g;
import gqb.r;
import java.lang.Object;
import dqb.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import brd.y;

public final class r$e implements g	// class@002b8f
{
    public final r b;

    public void r$e(r p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$e.class, "1")) {
       }else {
          a.p(p0, "event");
          if (a.g(r.P8(this.b).getCurrentPhoto(), p0.a) ^ 0x01) {
             r.P8(this.b).k(p0.b, false);
          }else {
             p0 = this.b.u;
             if (p0 != null) {
                p0.onNext(Boolean.FALSE);
             }
          }
       }
       return;
    }
}
