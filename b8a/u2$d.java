package b8a.u2$d;
import erd.g;
import b8a.u2;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;

public final class u2$d implements g	// class@000402
{
    public final u2 b;

    public void u2$d(u2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u2$d.class, "1")) {
       }else {
          QPhoto qPhoto = this.b.R8();
          if (qPhoto != null) {
             FollowSlideRecoGuide uFollowSlide = this.b.V8(qPhoto);
             if (uFollowSlide != null && (uFollowSlide.mShowFromStart == null && p0.longValue() - this.b.P8(qPhoto) < 0)) {
                this.b.Y8(qPhoto);
             }
          }
       }
       return;
    }
}
