package ed1.b;
import erd.g;
import ed1.d;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import s81.a;
import java.lang.String;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.bottombubble.notices.LiveCommentNoticeRemoveExperiment;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import lnc.a1;
import java.util.ArrayList;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeButtonInfo;
import ed1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.a$a;
import nc1.j$a;
import bq5.f$a;
import java.lang.StringBuilder;
import java.lang.System;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import ed1.c;
import bq5.d;
import nc1.j;
import lp3.e;
import nc1.k;
import lp3.c;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class b implements g	// class@0020e7
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && a.n() < 3) {
          p0 = a.a;
          if (!DateUtils.H(p0.getLong("liveBulletNoticeLastShowTimestamp", 0))) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             d uod = d.class;
             if (!PatchProxy.applyVoid(null, tb, uod, "3")) {
                LiveGenericCommentNoticeInfo obj = PatchProxy.apply(null, null, LiveCommentNoticeRemoveExperiment.class, "2");
                boolean b = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("live_comment_notice_remove", false);
                if (b) {
                   b.Z(LiveCommonLogTag.COMMENT_NOTICE, "onInterceptNotice filter and showPayBulletNotice will not show");
                }else {
                   obj = new LiveGenericCommentNoticeInfo();
                   obj.mSubTitle = a1.p(0x7f101ef0);
                   obj.mDescription = a1.p(0x7f101eef);
                   obj.mContentIconUrls = new ArrayList();
                   LiveCommentNoticeButtonInfo liveCommentN = new LiveCommentNoticeButtonInfo();
                   obj.mButtonInfo = liveCommentN;
                   liveCommentN.mBtnTitle = a1.p(0x7f101fb2);
                   j$a uoa = new j$a();
                   uoa.e(new a(obj, new a(tb)));
                   uoa.c(8000);
                   String str = PatchProxy.apply(null, tb, uod, "4");
                   if (str != patchProxyRe) {
                   }else {
                      str = "livePayBullet_"+System.currentTimeMillis();
                   }
                   uoa.h(str);
                   uoa.f(obj.mPriority);
                   uoa.i(obj.mNoticeType);
                   uoa.d(new c(tb));
                   j oj = uoa.g();
                   if (!tb.r.b()) {
                      tb.r.a(k.class).Y9(oj);
                   }
                   p0 = p0.edit();
                   p0.putLong("liveBulletNoticeLastShowTimestamp", System.currentTimeMillis());
                   g.a(p0);
                }
             }
          }
       }
       return;
    }
}
