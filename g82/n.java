package g82.n;
import oj0.a;
import g82.v;
import java.lang.Object;
import java.util.Map;
import t02.a0;
import com.kuaishou.live.core.show.fansgroup.LiveAudienceKwaiCoinsChangeReason;
import mrd.a;

public final class n implements a	// class@002aad
{
    public final v b;

    public void n(v p0){
       this.b = p0;
    }
    public final void W(Map p0){
       this.b.p.t2.onNext(LiveAudienceKwaiCoinsChangeReason.FANS_GROUP_SEND_GIFT);
    }
}
