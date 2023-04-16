package ez0.d;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.PrivilegeGiftListResponse;
import java.util.Objects;
import java.lang.String;

public final class d implements g	// class@00223e
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          tb.v(2, p0.mGiftToken);
       }
       return;
    }
}
