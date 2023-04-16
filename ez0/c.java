package ez0.c;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftPanelListResponse;
import java.lang.String;

public final class c implements g	// class@00223c
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       tb.c = p0;
       p0 = (p0 == null)? "": p0.mGiftToken;
       tb.v(0, p0);
       return;
    }
}
