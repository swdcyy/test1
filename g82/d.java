package g82.d;
import erd.g;
import g82.v;
import java.lang.Object;
import com.kuaishou.live.common.core.component.fansgroup.model.LiveFansGroupJoinResponse;
import t02.a0;
import com.kuaishou.live.core.show.fansgroup.LiveAudienceKwaiCoinsChangeReason;
import mrd.a;

public final class d implements g	// class@002a99
{
    public final v b;

    public void d(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       tb.p.t2.onNext(LiveAudienceKwaiCoinsChangeReason.JOIN_FANS_GROUP);
       int i = (p0 == null)? 0: p0.mJoinTicketGiftId;
       tb.d9(i);
       return;
    }
}
