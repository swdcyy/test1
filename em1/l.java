package em1.l;
import erd.g;
import em1.q;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftListResponse;
import java.util.Objects;
import java.lang.String;

public final class l implements g	// class@0021bc
{
    public final q b;

    public void l(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && tb.a == null) {
          tb.B(p0);
          tb.y("loadGiftsFromDisk");
       }
       return;
    }
}
