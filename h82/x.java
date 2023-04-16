package h82.x;
import erd.g;
import h82.z;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.fansgroup.LiveFansGroupInfo;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public final class x implements g	// class@002cef
{
    public final z b;

    public void x(z p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       p0 = p0.mLiveFansGroupInfo;
       boolean b = (p0 != null && (p0.mHasFansGroupAuthority != null && !tb.M.c.isGRPRCustomizedLive()))? true: false;
       tb.j9(b);
       return;
    }
}
