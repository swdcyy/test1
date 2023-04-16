package ez0.y;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.bottombar.LiveAudienceGiftBottomBarEntryService;
import java.lang.Boolean;
import brd.y;
import java.lang.String;

public final class y implements g	// class@00225e
{
    public final k b;

    public void y(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mShouldHideGiftEntrance != null) {
          tb.C.a();
          tb.T.onNext(Boolean.TRUE);
       }
       tb.S8(p0.mGiftToken, 0);
       return;
    }
}
