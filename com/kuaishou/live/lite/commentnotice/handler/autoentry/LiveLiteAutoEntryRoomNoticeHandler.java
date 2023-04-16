package com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler;
import ia3.a;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$b;
import nsd.u;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$a;
import java.lang.String;
import wa1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import xp5.i;
import la3.a;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import or5.d;
import e93.b;
import ip3.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import xp5.g;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$liveStreamId$2;
import msd.a;
import qrd.p;
import qrd.s;
import brd.t;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$c;
import erd.g;
import crd.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfoWithBaseExtra;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.commentnotice.handler.autoentry.LiveLiteAutoEntryRoomNoticeHandler$onReceiveCommentNotice$1;
import x51.b;
import java.lang.Long;
import com.kuaishou.live.lite.commentnotice.handler.base.LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1;
import msd.l;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.lang.StringBuilder;
import py1.b;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger$UserAction;
import py1.b$a;
import ha3.c;
import lc1.f;
import com.kwai.robust.PatchProxyResult;
import lc1.e;
import lc1.d;
import lc1.b;
import lc1.a;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import v91.e;

public final class LiveLiteAutoEntryRoomNoticeHandler extends a	// class@000859
{
    public final p f;
    public b g;
    public final b h;
    public long i;
    public final i j;
    public final a k;
    public final LiveActionTrigger l;
    public final d m;
    public final b n;
    public final a o;
    public static final c p;
    public static final c q;
    public static final LiveLiteAutoEntryRoomNoticeHandler$b r;

    static {
       LiveLiteAutoEntryRoomNoticeHandler.r = new LiveLiteAutoEntryRoomNoticeHandler$b(null);
       LiveLiteAutoEntryRoomNoticeHandler.p = LiveLiteAutoEntryRoomNoticeHandler$a.b;
       LiveLiteAutoEntryRoomNoticeHandler.q = c.b("lite-auto-enter-detail");
    }
    public void LiveLiteAutoEntryRoomNoticeHandler(i p0,LiveLiteGuidanceMessageQueueManager p1,i p2,a p3,LiveActionTrigger p4,d p5,b p6,a p7){
       a.p(p0, "receiveCommentNoticeService");
       a.p(p1, "guideQueueService");
       a.p(p2, "logPackageProvider");
       a.p(p3, "liveLiteAdLogService");
       a.p(p4, "liveActionTrigger");
       a.p(p5, "liveAudienceInfoManager");
       a.p(p6, "liteEnterService");
       a.p(p7, "liteBottomBubbleService");
       super(p5.getLiveStreamId(), p0, p1);
       this.j = p2;
       this.k = p3;
       this.l = p4;
       this.m = p5;
       this.n = p6;
       this.o = p7;
       this.f = s.c(new LiveLiteAutoEntryRoomNoticeHandler$liveStreamId$2(this));
       this.h = p6.D9().subscribe(new LiveLiteAutoEntryRoomNoticeHandler$c(this));
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       b$a a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteAutoEntryRoomNoticeHandler.class, "2")) {
       }else {
          a.p(p0, "channelType");
          String str = "notice";
          a.p(p1, str);
          String str1 = this.f();
          a.o(str1, "liveStreamId");
          if (LiveLiteAutoEntryRoomNoticeHandler.r.b(str1)) {
             b.Z(LiveLiteAutoEntryRoomNoticeHandler.p, "onReceiveCommentNotice - has entry detail");
          }else {
             LiveLiteAutoEntryRoomNoticeHandler$onReceiveCommentNotice$1 oonReceiveCo = new LiveLiteAutoEntryRoomNoticeHandler$onReceiveCommentNotice$1(this, p1);
             LiveCommentNoticeBaseInfo mDisplayDura = p1.mDisplayDurationMs;
             long l = (p1.mDelayDisplayTimeMs + p1.mDelayDisplayTimeMs) + b.b().a();
             long l1 = p1.mDelayDisplayTimeMs + b.b().a();
             a uoa = a.class;
             if (PatchProxy.isSupport(uoa)) {
                Object[] objArray = new Object[]{p1,oonReceiveCo,Long.valueOf(mDisplayDura),Long.valueOf(l1),Long.valueOf(l)};
                if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
                label_0096 :
                   this.i = p1.mDisplayDurationMs + p1.mDelayDisplayTimeMs;
                   b.Z(LiveLiteAutoEntryRoomNoticeHandler.p, "onReceiveCommentNotice - enable auto enter detail, time: "+this.i);
                   if (!PatchProxy.applyVoid(null, this, LiveLiteAutoEntryRoomNoticeHandler.class, "4")) {
                      LiveLiteAutoEntryRoomNoticeHandler ti = this.i;
                      if (ti > 0) {
                         a = b.a;
                         this.g = this.l.c(a.a(a.b(LiveActionTrigger$UserAction.ForegroundWatchLite1Sec), (int)(ti / (long)1000))).subscribe(new c(this));
                      }
                   }
                }
             }
             a.p(p1, str);
             a.p(oonReceiveCo, "messageConsumerProvider");
             LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1 uoaddMessage = new LiveLiteBaseCommentNoticeHandler$addMessageToCommonGuideQueue$message$1(this, p1, l1, l, oonReceiveCo, mDisplayDura);
             this.d.d("messageConsumerProvider");
             goto label_0096 ;
          }
       }
       return;
    }
    public f c(){
       f obj = PatchProxy.apply(null, this, LiveLiteAutoEntryRoomNoticeHandler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.API_USER_IO_STATUS};
       obj = f.b(56, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveGenericCommentNoticeInfoWithBaseExtra.class));
       a.o(obj, "LiveCommentNoticeType.ge¡­eExtra::class.java\)\n    \)");
       return obj;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAutoEntryRoomNoticeHandler.class, "7")) {
          return;
       }
       a.a(this);
       LiveLiteAutoEntryRoomNoticeHandler tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       this.h.dispose();
       return;
    }
    public b e(LiveMessageFrequencyConfig$FrequencyConfig p0,LiveCommentNoticeBaseInfo p1){
       e uoe = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteAutoEntryRoomNoticeHandler.class, "8");
       if (uoe != PatchProxyResult.class) {
       }else {
          a.p(p1, "notice");
          uoe = new e();
       }
       return uoe;
    }
    public final String f(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAutoEntryRoomNoticeHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
}
