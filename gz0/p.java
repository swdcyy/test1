package gz0.p;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.LiveAudienceBottomBarGiftAnimationManger;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;

public final class p implements g	// class@0025d2
{
    public final LiveAudienceBottomBarGiftAnimationManger b;

    public void p(LiveAudienceBottomBarGiftAnimationManger p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       boolean b = (p0 != null && p0.mEnableSendGiftNotifyAnimation != null)? true: false;
       tb.j = b;
       return;
    }
}
