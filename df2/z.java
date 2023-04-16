package df2.z;
import erd.g;
import df2.m0;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.model.LiveForbidCommentStatusResponse;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Boolean;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class z implements g	// class@00250c
{
    public final m0 b;

    public void z(m0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       z tb = this.b;
       Objects.requireNonNull(tb);
       b.c0(LiveLogTag.LIVE_PROFILE, "refreshForbidCommentStatus success", "forbiddenComment", Boolean.valueOf(p0.mIsForbidden));
       tb.Y9(p0.mIsForbidden);
    }
}
