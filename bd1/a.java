package bd1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.c$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.LiveHighlightNoticeInfo;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.LiveHighlightNoticeInfo$ExtraInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;
import bq5.h;
import lp3.c;
import lp3.e;
import bq5.f;

public final class a implements c$a	// class@000347
{
    public final a a;
    public final LiveHighlightNoticeInfo b;

    public void a(a p0,LiveHighlightNoticeInfo p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(LiveHighlightNoticeInfo p0){
       a ta = this.a;
       a tb = this.b;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(tb, ta, a.class, "2")) {
       }else if(tb.mVideoInfo == null){
          ta.d.yn(tb.mExtraInfo);
          a.b(ta.b, String.valueOf(tb.mNoticeType), tb.mBizId);
          if (ta.e != null) {
             ta.c.a(h.class).ce(ta.e);
          }
       }
       return;
    }
}
