package i5a.b;
import com.kwai.component.photo.detail.slide.presenter.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import uw9.v3;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import i5a.a;
import qvb.q;
import qvb.j;
import uw9.l0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class b extends c	// class@00277c
{
    public l0 E;

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       if (this.u.mPhoto == null && this.E.x != null) {
          if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
             uob = b.e(this.u.mSlidePlayId);
             if (uob != null) {
                i oi = uob.q();
                oi.h(new a(this, oi));
                oi.a();
             }
          }
          return;
       }else {
          super.E8();
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.E = this.q8(l0.class);
       return;
    }
}
