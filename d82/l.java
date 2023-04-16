package d82.l;
import erd.g;
import d82.n;
import java.lang.Object;
import com.kuaishou.live.common.core.component.escrow.LiveAnchorEscrowAuthorizeStatusResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class l implements g	// class@002495
{
    public final n b;

    public void l(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.LIVE_ESCROW, "get anchor escrow status", "status", Integer.valueOf(p0.mEscrowAuthorizeStatus));
       if (p0.mEscrowAuthorizeStatus == 1) {
          tb.R8();
       }
       return;
    }
}
