package lo1.f;
import erd.g;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveAnchorStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveLikeNewStyleConfig;
import ko1.b0;
import java.lang.String;
import lo1.l;

public final class f implements g	// class@002fde
{
    public final LiveHeartParticleServiceImpl b;

    public void f(LiveHeartParticleServiceImpl p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       LiveAnchorStatusResponse mLiveLikeNew = p0.mLiveLikeNewStyleConfig;
       boolean b = (mLiveLikeNew != null)? true: false;
       tb.i = b;
       if (mLiveLikeNew != null) {
          tb.j = mLiveLikeNew.isStopTopBarAnimation;
          tb.n.h(mLiveLikeNew);
          LiveHeartParticleServiceImpl p = tb.p;
          if (p != null) {
             p0 = p0.mLiveLikeNewStyleConfig;
             p.a(p0.mLiveLikeTopBarProgressBarStartColor, p0.mLiveLikeTopBarProgressBarEndColor);
          }
       }
       return;
    }
}
