package ek1.b;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig;
import ak1.a;
import java.lang.Object;
import ek1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ek1.e;
import ek1.f$a;
import java.lang.Enum;
import ek1.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b	// class@00217f
{
    public final LiveGiftSlotQueueConfig a;
    public final a b;
    public final e c;

    public void b(LiveGiftSlotQueueConfig p0,a p1){
       super();
       this.a = p0;
       this.b = p1;
       e uoe = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "1");
       if (uoe != PatchProxyResult.class) {
       }else if(f$a.a[p0.b.ordinal()] != 1){
          uoe = e.a;
       }else {
          uoe = new a(p0, p1);
       }
       this.c = uoe;
       b.c0(LiveGiftTag.GIFT_SLOT, "[LiveGiftSlotTrimLogic][init]", "queueConfig", p0);
       return;
    }
}
