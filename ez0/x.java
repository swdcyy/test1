package ez0.x;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService;
import java.lang.Boolean;
import brd.y;
import java.lang.String;

public final class x implements g	// class@00225d
{
    public final k b;

    public void x(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mShouldHideGiftEntrance != null) {
          tb.C.a();
          tb.T.onNext(Boolean.TRUE);
       }
       tb.S8(p0.mGiftToken, 0);
       return;
    }
}
