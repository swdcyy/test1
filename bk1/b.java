package bk1.b;
import ok.o;
import com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.gift.GiftMessage;
import qx1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class b implements o	// class@0003b2
{
    public final LiveGiftSlotModel b;

    public void b(LiveGiftSlotModel p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       boolean b;
       b tb = this.b;
       Objects.requireNonNull(tb);
       Object obj = PatchProxy.applyOneRefs(p0, tb, LiveGiftSlotModel.class, "7");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          p0 = p0.cast();
          if (tb.j.g6(5, String.valueOf(p0.mGiftId))) {
             b.c0(LiveLogTag.LIVE_SERVER_SIGNAL_BLOCK, "LiveGiftFeedBasePresenter ServerSignalBlocked", "data", p0.toString());
             b = 1;
          }else {
             b = 0;
          }
       }
       return (b ^ 1);
    }
}
