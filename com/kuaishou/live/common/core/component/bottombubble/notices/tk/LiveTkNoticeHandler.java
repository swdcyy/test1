package com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler;
import lc1.b;
import lp3.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.basic.tk.LiveTkItemManager;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$TkCommentNoticeInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import z51.g;
import z51.c;
import pp.c;
import z51.c$b;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import o63.a;
import lp3.c;
import nc1.k;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$onReceiveCommentNotice$tkBridge$1;
import msd.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$onReceiveCommentNotice$1;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$onReceiveCommentNotice$2;
import msd.l;
import java.util.List;
import lc1.a;
import lc1.f;
import com.kwai.robust.PatchProxyResult;
import lc1.e;
import lc1.d;

public final class LiveTkNoticeHandler implements b	// class@001018
{
    public j b;
    public final LiveTkItemManager c;
    public final e d;

    public void LiveTkNoticeHandler(e p0){
       a.p(p0, "serviceManager");
       super();
       this.d = p0;
       this.c = new LiveTkItemManager();
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveTkNoticeHandler.class, "2")) {
       }else {
          a.p(p0, "channelType");
          a.p(p1, "notice");
          if (p1.getTkItemInfo() == null) {
             b.B(c.i.a(), "bundleId is required: "+p1);
          }else {
             c uoc = this.d.a(a.class);
             a.o(uoc, "serviceManager.getServic¡­ridgeService::class.java\)");
             c uoc1 = this.d.a(k.class);
             a.o(uoc1, "serviceManager.getServic¡­QueueService::class.java\)");
             g tkItemInfo = p1.getTkItemInfo();
             if (tkItemInfo != null) {
                this.c.b(tkItemInfo, new LiveTkNoticeHandler$onReceiveCommentNotice$1(this, p1, new LiveTkBridge(uoc, new LiveTkNoticeHandler$onReceiveCommentNotice$tkBridge$1(this)), uoc1), LiveTkNoticeHandler$onReceiveCommentNotice$2.INSTANCE);
             }
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       f obj = PatchProxy.apply(null, this, LiveTkNoticeHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       obj = f.b(201, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveTkNoticeHandler$TkCommentNoticeInfo.class));
       a.o(obj, "LiveCommentNoticeType.ge¡­lass.java\n        \)\n    \)");
       return obj;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, LiveTkNoticeHandler.class, "4")) {
          return;
       }
       this.c.a();
       return;
    }
}
