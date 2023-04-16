package ic1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.b$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import lp3.c;
import lp3.e;
import bq5.f;
import sd1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;

public final class a implements b$a	// class@00288f
{
    public final a a;

    public void a(a p0){
       this.a = p0;
    }
    public final void a(LiveCommonChatNoticeInfo p0){
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, a.class, "4")) {
       }else {
          a e = ta.e;
          boolean b = true;
          if (e != b) {
             if (e == 2) {
                ta.c.a(LiveAudienceApplyChatService.class).Jb(b);
                ta.g.e(0);
             }
          }else {
             ta.c.a(a.class).o9("NOTICE");
          }
          a.c(ta.b, String.valueOf(54), ta.h.mBizId, ta.d());
       }
       return;
    }
}
