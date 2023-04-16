package i5a.a;
import qvb.q;
import i5a.b;
import qvb.i;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.j;
import qvb.p;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.photo.detail.slide.presenter.c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import az6.a;
import java.util.Objects;
import p5a.c;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import com.kwai.framework.player.core.b;
import java.lang.Runnable;

public class a implements q	// class@00277b
{
    public final i b;
    public final b c;

    public void a(b p0,i p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, a.class, "2")) {
          return;
       }
       this.b.f(this);
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.b.f(this);
       if (!q.f(this.b.getItems())) {
          c u = this.c.u;
          u.mPhoto = this.b.getItem(0);
          u.setSlidePlayId(u.mSlidePlayId);
          a tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, b.class, "4")) {
             c uoc = QPhotoMediaPlayerCacheManager.d(tc.u.mPhoto);
             if (uoc != null) {
                uoc.release();
             }
          }
          this.c.v.run();
       }
       return;
    }
}
