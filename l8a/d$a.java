package l8a.d$a;
import l8a.a;
import l8a.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.i;
import com.yxcorp.gifshow.detail.slideplay.b;
import java.lang.Boolean;
import com.kwai.component.photo.detail.slide.presenter.c;
import rf5.u;
import java.util.Objects;
import com.yxcorp.utility.Log;
import qvb.f;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Runnable;
import qvb.q;
import qvb.j;

public class d$a implements a	// class@002d64
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "2")) {
          return;
       }
       d g = this.a.G;
       if (g == null) {
          return;
       }
       g.q().clear();
       this.a.G.d();
       return;
    }
    public void b(boolean p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       c x = this.a.x;
       if (x != null) {
          if (p0) {
             x.A();
          }else {
             Objects.requireNonNull(x);
             if (!PatchProxy.applyVoid(null, x, u.class, "12") && x.u) {
                Log.g("SwipeToProfileFeed", "setProgress-a=0");
                x.u = 0;
                x.z(0);
             }
          }
       }
       return;
    }
    public void c(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       this.a.Z8(p0);
       if (!q.f(this.a.G.e0())) {
          d$a ta = this.a;
          ta.u.mPhoto = ta.G.w2(0);
          this.a.v.run();
       }else {
          this.a.G.q().h(this.a.I);
          this.a.G.q().a();
       }
       return;
    }
}
