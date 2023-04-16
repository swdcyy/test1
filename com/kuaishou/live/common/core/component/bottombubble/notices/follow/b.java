package com.kuaishou.live.common.core.component.bottombubble.notices.follow.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.follow.a$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.follow.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfoWithBaseExtra;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import java.lang.String;
import mc1.a;
import pg1.e;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import xp5.g;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import xc1.c;
import n3d.a;

public final class b implements a$a	// class@000fbc
{
    public final c a;
    public final LiveGenericCommentNoticeInfoWithBaseExtra b;

    public void b(c p0,LiveGenericCommentNoticeInfoWithBaseExtra p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       b ta = this.a;
       b tb = this.b;
       a.b(ta.c.a(), String.valueOf(tb.mBizId), tb.mBizId);
       if (ta.e.oa()) {
          ta.e.lm(ta.b.r5().mEntity, ta.b.d(), 75, false);
       }else {
          ta.e.U8(new c(ta));
       }
       return;
    }
}
