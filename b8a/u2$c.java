package b8a.u2$c;
import erd.g;
import b8a.u2;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public final class u2$c implements g	// class@000401
{
    public final u2 b;

    public void u2$c(u2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, u2$c.class, "1")) {
       }else {
          p0 = this.b.R8();
          if (p0 != null) {
             FollowSlideRecoGuide uFollowSlide = this.b.V8(p0);
             if (uFollowSlide != null && uFollowSlide.mShowFromStart == 1) {
                u2 u = this.b.u;
                if (u == null) {
                   a.S("mDetailPlayModule");
                }
                e player = u.getPlayer();
                a.o(player, "mDetailPlayModule.player");
                if (player.getCurrentPosition() - this.b.P8(p0) >= 0) {
                   this.b.Y8(p0);
                }
             }
          }
       }
       return;
    }
}
