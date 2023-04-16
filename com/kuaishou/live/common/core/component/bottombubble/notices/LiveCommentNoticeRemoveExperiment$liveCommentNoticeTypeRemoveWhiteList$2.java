package com.kuaishou.live.common.core.component.bottombubble.notices.LiveCommentNoticeRemoveExperiment$liveCommentNoticeTypeRemoveWhiteList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.bottombubble.notices.LiveCommentNoticeTypeRemoveWhiteList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.reflect.Type;

public final class LiveCommentNoticeRemoveExperiment$liveCommentNoticeTypeRemoveWhiteList$2 extends Lambda implements a	// class@000f83
{
    public static final LiveCommentNoticeRemoveExperiment$liveCommentNoticeTypeRemoveWhiteList$2 INSTANCE;

    static {
       LiveCommentNoticeRemoveExperiment$liveCommentNoticeTypeRemoveWhiteList$2.INSTANCE = new LiveCommentNoticeRemoveExperiment$liveCommentNoticeTypeRemoveWhiteList$2();
    }
    public void LiveCommentNoticeRemoveExperiment$liveCommentNoticeTypeRemoveWhiteList$2(){
       super(0);
    }
    public final LiveCommentNoticeTypeRemoveWhiteList invoke(){
       Object obj = PatchProxy.apply(null, this, LiveCommentNoticeRemoveExperiment$liveCommentNoticeTypeRemoveWhiteList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().u("SOURCE_LIVE").getValue("live_comment_notice_type_remove_whitelist", LiveCommentNoticeTypeRemoveWhiteList.class, null);
       if (obj instanceof LiveCommentNoticeTypeRemoveWhiteList) {
          return obj;
       }
       return null;
    }
    public Object invoke(){
       return this.invoke();
    }
}
