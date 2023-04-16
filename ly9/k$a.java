package ly9.k$a;
import qp7.y0;
import ly9.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import ly9.m;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import qvb.n0;

public class k$a extends y0	// class@002ebe
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void c(boolean p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.c.d(true);
       k$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, k.class, "9") && (ta.i.needFilterFeed == null || (ta.f.isVideoType() || ta.f.isImageType()))) {
          if (ta.c.e != null) {
             ta.c();
          }else {
             ta.d.a();
             ta.e = true;
          }
       }
       return;
    }
    public void d(boolean p0){
       k$a uoa = k$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       this.a.c.d(false);
       this.a.b();
       return;
    }
}
