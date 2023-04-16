package em1.j;
import erd.g;
import em1.q;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.PrivilegeGiftListResponse;
import java.util.Objects;
import java.util.List;
import java.util.Collection;
import ekd.q;

public final class j implements g	// class@0021ba
{
    public final q b;

    public void j(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && !q.f(p0.getItems())) {
          tb.e(p0.getPrivilegeGifts());
          tb.i(p0.getPrivilegeGifts());
       }
       return;
    }
}
