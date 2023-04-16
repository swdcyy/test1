package fa2.z;
import erd.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.i;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.g;
import com.kuaishou.live.core.show.hourlytrank.strengthnotice.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class z implements g	// class@002918
{
    public final i b;

    public void z(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z tb = this.b;
       Objects.requireNonNull(tb);
       tb.s = k0.b(p0, g.a, h.a).or(Boolean.FALSE).booleanValue();
       b.S(LiveLogTag.HOURLY_RANK.appendTag("LivePopularityRankStrengthNoticeController"), "audience fetch strength notice", "mIsPopularityStrengthNoticeEnable", Boolean.valueOf(tb.s));
    }
}
