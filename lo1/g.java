package lo1.g;
import erd.g;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.basic.model.LiveLikeNewStyleConfig;
import ko1.b0;
import java.lang.String;
import lo1.l;

public final class g implements g	// class@002fdf
{
    public final LiveHeartParticleServiceImpl b;

    public void g(LiveHeartParticleServiceImpl p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       LiveTimeConsumingUserStatusResponse mLiveLikeNew = p0.mLiveLikeNewStyleConfig;
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
