package com.kuaishou.live.common.core.component.bottombubble.notices.LiveCommentNoticeRemoveExperiment;
import com.kuaishou.live.common.core.component.bottombubble.notices.LiveCommentNoticeRemoveExperiment$liveCommentNoticeTypeRemoveWhiteList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.LiveCommentNoticeTypeRemoveWhiteList;

public final class LiveCommentNoticeRemoveExperiment	// class@000f84
{
    public static final p a;

    static {
       LiveCommentNoticeRemoveExperiment.a = s.c(LiveCommentNoticeRemoveExperiment$liveCommentNoticeTypeRemoveWhiteList$2.INSTANCE);
    }
    public static final boolean a(int p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveCommentNoticeRemoveExperiment liveCommentN = LiveCommentNoticeRemoveExperiment.class;
       if (PatchProxy.isSupport(liveCommentN)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, liveCommentN, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (!a.t().u("SOURCE_LIVE").d("live_comment_notice_remove", false)) {
          return false;
       }else {
          Object obj1 = PatchProxy.apply(null, null, liveCommentN, "3");
          if (obj1 == patchProxyRe) {
             obj1 = LiveCommentNoticeRemoveExperiment.a.getValue();
          }
          if (obj1 instanceof LiveCommentNoticeTypeRemoveWhiteList) {
             return (obj1.isTypeInWhiteList(p0) ^ 0x01);
          }else {
             return false;
          }
       }
    }
}
