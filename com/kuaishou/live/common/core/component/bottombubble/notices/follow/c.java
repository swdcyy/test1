package com.kuaishou.live.common.core.component.bottombubble.notices.follow.c;
import lc1.b;
import lp3.e;
import java.lang.Object;
import or5.d;
import java.lang.Class;
import lp3.c;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfoWithBaseExtra;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import pg1.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import lnc.a1;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.follow.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.follow.a;
import xc1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.follow.a$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.follow.a$b;
import nc1.j$a;
import bq5.f$a;
import xc1.d;
import bq5.d;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;

public class c implements b	// class@000fbd
{
    public final d b;
    public final i c;
    public final e d;
    public e e;

    public void c(e p0){
       super();
       this.b = p0.a(d.class);
       this.c = p0.a(i.class);
       this.d = p0;
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       j oj;
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "2")) {
       }else {
          p0 = PatchProxy.applyOneRefs(p1, this, uoc, "3");
          if (p0 != PatchProxyResult.class) {
          }else {
             e uoe = this.d.a(e.class);
             this.e = uoe;
             if (uoe.getFollowStatus()) {
                oj = null;
             }else {
                LiveGenericCommentNoticeInfo mButtonInfo = p1.mButtonInfo;
                if (mButtonInfo != null) {
                   mButtonInfo.mBtnTitle = a1.p(0x7f100f8f);
                }
                j$a uoa = new j$a();
                uoa.e(new a(p1, new b(new b(this, p1))));
                uoa.c(p1.mDisplayDurationMs);
                uoa.f(p1.mPriority);
                uoa.h(p1.mBizId);
                uoa.j(p1.mDelayDisplayTimeMs);
                uoa.i(p1.mNoticeType);
                uoa.d(new d(this, p1));
                oj = uoa.g();
             }
          }
          if (p0 != null) {
             this.d.a(k.class).Y9(p0);
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.API_USER_STATUS};
       return f.b(4, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveGenericCommentNoticeInfoWithBaseExtra.class));
    }
    public void dispose(){
       a.a(this);
    }
}
