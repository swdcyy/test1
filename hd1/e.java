package hd1.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeView;
import kc1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import android.view.View;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;
import w91.a;
import java.lang.Class;
import lp3.c;
import lp3.e;
import java.util.Map;
import com.kwai.robust.PatchProxy;
import uq5.a;
import xp5.g;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import ss5.a;
import nc1.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;
import rw1.b;

public final class e implements a$a	// class@002673
{
    public final b a;

    public void e(b p0){
       this.a = p0;
    }
    public void a(LiveGenericCommentNoticeView p0){
       b.a(this, p0);
    }
    public final void b(LiveGenericCommentNoticeInfo p0,View p1){
       e ta = this.a;
       Objects.requireNonNull(ta);
       b.c0(LiveLogTag.LIVE_COMMENT_NOTICE, "HIGH_VALUE_RECHARGE_NOTICE onClick", "info", p0);
       Map map = ta.d.a(a.class).d6();
       if (PatchProxy.applyVoid(null, ta, b.class, "6")) {
       }else {
          ta.d.a(a.class).pc("LIVE_ROOM_COMMENT_NOTICE", ta.b.getLiveStreamId(), ta.b.d(), ta.e.e1(), ta.b.getExpTag());
       }
       ta.d.a(k.class).D6();
       a.b(ta.c.a(), String.valueOf(p0.mNoticeType), p0.mBizId);
       b.b(ta.c.a(), "LIVE_ROOM_COMMENT_NOTICE", map);
       return;
    }
}
