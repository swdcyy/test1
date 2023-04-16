package nc1.a;
import vf1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.c;
import java.lang.Object;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import java.util.List;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.g;

public final class a implements b	// class@0032ce
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void x6(LiveAudienceDelayInfosResponse p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (q.f(p0.mLiveCommentNoticeInfoList)) {
       }else {
          tb.Vo(p0.mLiveCommentNoticeInfoList, LiveCommentNoticeChannelType.API_DELAY_INFO);
       }
       return;
    }
}
