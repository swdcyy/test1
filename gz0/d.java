package gz0.d;
import aq5.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import java.lang.Object;
import aq5.a;
import java.util.Objects;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;

public final class d implements b	// class@0025c6
{
    public final i b;

    public void d(i p0){
       this.b = p0;
    }
    public final void e6(a p0,boolean p1){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == AudienceBizRelation.BOTTOM_BAR_SHOP) {
          tb.k = p1;
          i g = tb.g;
          if (g != null) {
             g.j(tb.a());
          }
       }
       return;
    }
}
