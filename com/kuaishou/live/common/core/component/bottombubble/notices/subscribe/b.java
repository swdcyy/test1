package com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e$c;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo;
import java.util.Objects;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo$ExtraInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import md1.f;
import java.lang.Class;
import lp3.c;
import md1.c;
import java.lang.String;
import ps5.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;

public final class b implements e$c	// class@00100b
{
    public final e a;

    public void b(e p0){
       this.a = p0;
    }
    public final void a(LiveSubscribeAnchorNoticeInfo p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       LiveSubscribeAnchorNoticeInfo mExtraInfo = p0.mExtraInfo;
       LiveSubscribeAnchorNoticeInfo$ExtraInfo mSubscribeId = (mExtraInfo != null)? mExtraInfo.mSubscribeId: null;
       if (!TextUtils.x(mSubscribeId) && ta.g == null) {
          ta.g = true;
          ta.f(f.class).vl(mSubscribeId, 3, new c(ta));
          a.b(ta.e.a(), String.valueOf(p0.mNoticeType), p0.mBizId);
       }
       return;
    }
}
