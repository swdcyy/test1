package kd1.b;
import lc1.b;
import lp3.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xp5.i;
import java.lang.Class;
import lp3.c;
import om1.a;
import yc1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftInfo;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import ad5.a;
import tkd.b;
import tkd.d;
import ad5.b;
import com.kwai.robust.PatchProxyResult;
import nc1.j;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import java.lang.Number;
import n91.a;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfo;
import kd1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.sendgift.LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1;
import msd.a;
import nc1.j$a;
import bq5.f$a;
import kd1.a;
import bq5.d;
import nc1.k;
import java.util.List;
import lc1.a;
import lc1.f;
import lc1.e;
import lc1.d;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import lnc.i3;
import mm1.c;
import mm1.e;
import mm1.g;
import km1.b;

public final class b implements b	// class@002cf7
{
    public final i b;
    public final a c;
    public final b d;
    public final e e;

    public void b(e p0){
       a.p(p0, "serviceManager");
       super();
       this.e = p0;
       c uoc = p0.a(i.class);
       a.o(uoc, "serviceManager.getServic…kageProvider::class.java\)");
       this.b = uoc;
       uoc = p0.a(a.class);
       a.o(uoc, "serviceManager.getServic…TraceService::class.java\)");
       this.c = uoc;
       this.d = new b(p0);
    }
    public void a(LiveCommentNoticeChannelType p0,LiveCommentNoticeBaseInfo p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "1")) {
       }else {
          a.p(p0, "channelType");
          a.p(p1, "notice");
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, uob, "3")) {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             if (qCurrentUser.isLogined()) {
                b.a(0x4c90014d).l();
                b uob1 = d.a(0x630bc993);
                a.o(uob1, "PluginManager.get\(PaymentPlugin::class.java\)");
                uob1.d1().f();
             }
          }
          Integer obj = PatchProxy.applyOneRefs(p1, this, uob, "4");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             b.c0(LiveLogTag.LIVE_BUBBLE_NOTICE, "[LiveAudienceSendGiftHandler][createBubbleItem]：创建 SEND_GIFT 强提醒 ", "info", p1.toString());
             obj = p1.getGiftId();
             if (obj != null) {
                Gift gift = this.e.a(a.class).l0(obj.intValue());
                if (gift != null) {
                   p1.mContentIconUrls = gift.mImageUrl;
                   j$a uoa = new j$a();
                   uoa.e(new c(p1, new LiveAudienceSendGiftHandler$createBubbleItem$commonBubbleWidget$1(this, p1, gift)));
                   uoa.c(p1.mDisplayDurationMs);
                   uoa.f(p1.mPriority);
                   uoa.h(p1.mBizId);
                   uoa.j(p1.mDelayDisplayTimeMs);
                   uoa.i(p1.mNoticeType);
                   uoa.d(new a(this, p1, gift));
                   objArray = uoa.g();
                }
             }
          }
          if (objArray != null) {
             this.e.a(k.class).Y9(objArray);
          }
       }
       return;
    }
    public List b(){
       return a.c(this);
    }
    public f c(){
       f obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       obj = f.b(202, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveAudienceSendGiftInfo.class));
       a.o(obj, "LiveCommentNoticeType.ge…lass.java\n        \)\n    \)");
       return obj;
    }
    public final i d(Gift p0){
       i obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new i(this.c.o6());
       LiveSendGiftBaseTraceInfo liveSendGift = obj.e();
       a.o(liveSendGift, "context.traceInfo");
       liveSendGift.z(1);
       liveSendGift.j(p0);
       liveSendGift.t(14);
       liveSendGift.s(10);
       return obj;
    }
    public void dispose(){
       a.a(this);
    }
    public final String e(LiveAudienceSendGiftInfo p0){
       i3 obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       a.o(obj, "JsonStringBuilder.newInstance\(\)");
       obj.d("extra_info", p0.mExtraInfoStr);
       String str = obj.e();
       a.o(str, "builder.build\(\)");
       return str;
    }
    public final void f(i p0,String p1,String p2,String p3,int p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob, "7")) {
             return;
          }
       }
       if (!this.e.b()) {
          this.c.yk(p0.e()).d(p2).f(p1).g(p4).e(p3).a();
       }else {
          b.P(b.a, "[LiveJsCmdSendGiftToAnchor][logTraceInfo]service manager cleared");
       }
       return;
    }
}
