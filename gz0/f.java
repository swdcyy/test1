package gz0.f;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i$a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.i;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import qm1.d;

public final class f implements g	// class@0025c8
{
    public final i$a b;

    public void f(i$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       if (tb.a.n != null) {
          b.P(LiveLogTag.GIFT.appendTag("LiveAudienceBottomBarGiftAnimationController"), "success to loadUpdatedGifts");
          tb.a.n.c(p0);
       }
       return;
    }
}
