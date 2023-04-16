package com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$onReceiveCommentNotice$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$TkCommentNoticeInfo;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import nc1.k;
import java.lang.Object;
import z51.c;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import nd1.a;
import nc1.j$a;
import bq5.f$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import nd1.b;
import bq5.d;

public final class LiveTkNoticeHandler$onReceiveCommentNotice$1 extends Lambda implements l	// class@001015
{
    public final k $commentNoticeQueueService;
    public final LiveTkNoticeHandler$TkCommentNoticeInfo $notice;
    public final LiveTkBridge $tkBridge;
    public final LiveTkNoticeHandler this$0;

    public void LiveTkNoticeHandler$onReceiveCommentNotice$1(LiveTkNoticeHandler p0,LiveTkNoticeHandler$TkCommentNoticeInfo p1,LiveTkBridge p2,k p3){
       this.this$0 = p0;
       this.$notice = p1;
       this.$tkBridge = p2;
       this.$commentNoticeQueueService = p3;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveTkNoticeHandler$onReceiveCommentNotice$1.class, "1")) {
          return;
       }
       a.p(p0, "tkItem");
       LiveTkNoticeHandler$onReceiveCommentNotice$1 tthis$0 = this.this$0;
       LiveTkNoticeHandler$onReceiveCommentNotice$1 t$notice = this.$notice;
       LiveTkNoticeHandler$onReceiveCommentNotice$1 t$tkBridge = this.$tkBridge;
       Objects.requireNonNull(tthis$0);
       j oj = PatchProxy.applyThreeRefs(t$notice, t$tkBridge, p0, tthis$0, LiveTkNoticeHandler.class, "3");
       if (oj != PatchProxyResult.class) {
       }else {
          j$a uoa = new j$a();
          uoa.e(new a(p0, t$tkBridge));
          uoa.c(t$notice.mDisplayDurationMs);
          uoa.j(t$notice.mDelayDisplayTimeMs);
          uoa.h(t$notice.mBizId);
          uoa.f(t$notice.mPriority);
          uoa.i(t$notice.mNoticeType);
          uoa.d(new b(tthis$0, t$notice, p0));
          oj = uoa.g();
       }
       if (oj != null) {
          this.$commentNoticeQueueService.Y9(oj);
          p0.b = oj;
       }
       return;
    }
}
