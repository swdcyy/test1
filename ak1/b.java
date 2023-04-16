package ak1.b;
import erd.g;
import com.kuaishou.live.common.core.component.gift.domain.slot.manager.LiveGiftSlotAnimManager;
import com.kuaishou.live.common.core.component.gift.domain.slot.view.LiveGiftSlotItemView;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import xj1.a;
import gk1.a;

public final class b implements g	// class@0000bd
{
    public final LiveGiftSlotAnimManager b;
    public final int c;
    public final LiveGiftSlotItemView d;

    public void b(LiveGiftSlotAnimManager p0,int p1,LiveGiftSlotItemView p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       b tb = this.b;
       b td = this.d;
       Objects.requireNonNull(tb);
       if (!p0.longValue() - (long)(this.c - 1)) {
          tb.b(td, 0, null, null, false);
       }
       return;
    }
}
