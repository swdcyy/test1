package ez0.e;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.util.Objects;
import java.lang.String;

public final class e implements g	// class@002240
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          tb.v(3, p0.mGiftToken);
       }
       return;
    }
}
