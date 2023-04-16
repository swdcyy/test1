package em1.k;
import erd.g;
import em1.q;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.PacketGiftListResponse;
import java.util.Objects;
import java.util.List;

public final class k implements g	// class@0021bb
{
    public final q b;

    public void k(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       tb.e(p0.getItems());
       tb.i(p0.getItems());
    }
}
