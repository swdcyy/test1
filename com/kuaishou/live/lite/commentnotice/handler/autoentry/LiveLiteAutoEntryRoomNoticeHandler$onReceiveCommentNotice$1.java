package com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$onReceiveCommentNotice$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfoWithBaseExtra;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ha3.b;
import ia3.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import xp5.i;
import la3.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;

public final class LiveLiteAutoEntryRoomNoticeHandler$onReceiveCommentNotice$1 extends Lambda implements l	// class@000858
{
    public final LiveGenericCommentNoticeInfoWithBaseExtra $notice;
    public final LiveLiteAutoEntryRoomNoticeHandler this$0;

    public void LiveLiteAutoEntryRoomNoticeHandler$onReceiveCommentNotice$1(LiveLiteAutoEntryRoomNoticeHandler p0,LiveGenericCommentNoticeInfoWithBaseExtra p1){
       this.this$0 = p0;
       this.$notice = p1;
       super(1);
    }
    public final LiveLiteGuidanceMessageQueueManager$b invoke(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       b obj = PatchProxy.applyOneRefs(p0, this, LiveLiteAutoEntryRoomNoticeHandler$onReceiveCommentNotice$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "it");
       LiveLiteAutoEntryRoomNoticeHandler$onReceiveCommentNotice$1 tthis$0 = this.this$0;
       LiveLiteAutoEntryRoomNoticeHandler$onReceiveCommentNotice$1 t$notice = this.$notice;
       Objects.requireNonNull(tthis$0);
       obj = PatchProxy.applyTwoRefs(p0, t$notice, tthis$0, LiveLiteAutoEntryRoomNoticeHandler.class, "6");
       if (obj != PatchProxyResult.class) {
       }else {
          b uob = new b(tthis$0, t$notice, p0, p0, t$notice, tthis$0.j, tthis$0.k, tthis$0.d, tthis$0.o);
       }
       return obj;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
