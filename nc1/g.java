package nc1.g;
import erd.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;

public final class g implements g	// class@0032d4
{
    public final g b;
    public final LiveCommentNoticeChannelType c;

    public void g(g p0,LiveCommentNoticeChannelType p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.To(this.c, p0);
    }
}
