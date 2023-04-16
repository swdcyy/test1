package nc1.c;
import lf3.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.g;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.util.Objects;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import lf3.f;

public final class c implements g	// class@0032d0
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       tb.Yo(LiveCommentNoticeChannelType.LONG_CONNECTION, p0);
    }
    public boolean V(){
       return f.a(this);
    }
}
