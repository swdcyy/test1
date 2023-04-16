package g19.q$a;
import jta.a;
import g19.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import g19.q$a$a;
import erd.g;
import g19.p;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class q$a extends a	// class@0023d5
{
    public final q a;

    public void q$a(q p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       q$a uoa = q$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          i0.a().e(940, q.P8(this.a).mEntity).d(new q$a$a(this)).a();
          Objects.requireNonNull(p.c);
          p.a = -1;
       }
       return;
    }
    public void d(float p0){
       q$a uoa = q$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (!p0 - 0x3f800000) {
          p c = p.c;
          q s = this.a.s;
          if (s == null) {
             a.S("mSlidePlayViewModel");
          }
          Objects.requireNonNull(c);
          p.a = s.R0(q.P8(this.a));
       }
       return;
    }
}
