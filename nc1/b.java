package nc1.b;
import erd.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.c;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.g;

public final class b implements g	// class@0032cf
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       tb.Vo(p0, LiveCommentNoticeChannelType.API_USER_STATUS);
    }
}
