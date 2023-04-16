package d01.f;
import erd.g;
import d01.g;
import java.lang.Object;
import com.kuaishou.live.core.show.model.LiveGiftBoxTabRedDotResponse;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;

public final class f implements g	// class@001ed7
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       tb.u = p0;
       tb.X8(GiftTab.PacketGift, p0);
       tb.X8(GiftTab.FansGroupGift, p0);
       tb.X8(GiftTab.PrivilegeGift, p0);
       tb.X8(GiftTab.PropsPanel, p0);
    }
}
