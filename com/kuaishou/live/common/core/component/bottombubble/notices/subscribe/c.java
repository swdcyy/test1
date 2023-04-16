package com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.c;
import erd.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveSubscribeStatInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e$b;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e$c;
import nc1.j$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import bq5.f$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseExtraInfo;
import md1.d;
import bq5.d;
import nc1.j;
import nc1.k;
import lp3.c;

public final class c implements g	// class@00100c
{
    public final e b;
    public final LiveSubscribeAnchorNoticeInfo c;

    public void c(e p0,LiveSubscribeAnchorNoticeInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, e.class, "5")) {
       }else {
          b.P(LiveLogTag.LIVE_SUBSCRIBE.appendTag("SubscribeAnchorNotice"), "add SubscribeAnchorNotice Widget");
          tb.i = new e$b(tc, new b(tb));
          p0 = new j$a();
          p0.h(tc.mBizId);
          p0.f(tc.mPriority);
          p0.j(tc.mExtraInfo.mDelayDisplayTimeMs);
          p0.c(tc.mDisplayDurationMs);
          p0.e(tb.i);
          p0.i(tc.mNoticeType);
          p0.d(new d(tb, tc));
          tb.h = p0.g();
          p0 = tb.f(k.class);
          p0.Y9(tb.h);
       }
       return;
    }
}
