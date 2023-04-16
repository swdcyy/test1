package com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler$b;
import nsd.u;
import java.lang.String;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ja3.b;
import pg1.e;
import brd.t;
import java.lang.Object;
import kotlin.jvm.internal.a;
import crd.a;
import java.util.ArrayList;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler$c;
import erd.g;
import crd.b;
import krd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import java.lang.Class;
import t45.d;
import brd.z;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler$a;
import com.kuaishou.live.lite.delayinfo.LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig;
import java.util.List;
import com.kwai.robust.PatchProxy;
import v91.b;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.lang.Boolean;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteCommonGuideConfig;
import java.lang.reflect.Type;
import wg3.a;
import v91.d;
import v91.a;
import java.util.Map;
import com.kuaishou.livestream.message.nano.LiveCommonGuideConfig;
import v91.f;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.h;
import java.lang.StringBuilder;
import v91.j;
import com.kwai.framework.model.user.QCurrentUser;

public abstract class LiveLiteBaseFollowGuideNoticeHandler	// class@00086d
{
    public final a a;
    public final ArrayList b;
    public LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage c;
    public boolean d;
    public final g e;
    public final String f;
    public final LiveLiteGuidanceMessageQueueManager g;
    public final b h;
    public final e i;
    public static final LiveLiteBaseFollowGuideNoticeHandler$b j;

    static {
       LiveLiteBaseFollowGuideNoticeHandler.j = new LiveLiteBaseFollowGuideNoticeHandler$b(null);
    }
    public void LiveLiteBaseFollowGuideNoticeHandler(String p0,String p1,LiveLiteGuidanceMessageQueueManager p2,b p3,e p4,t p5){
       a.p(p0, "anchorId");
       a.p(p2, "guideQueueService");
       a.p(p3, "liveLiteFollowGuideConsumer");
       a.p(p4, "followManager");
       a.p(p5, "disableCommentNoticeStatus");
       super();
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       a uoa = new a();
       this.a = uoa;
       this.b = new ArrayList();
       LiveLiteBaseFollowGuideNoticeHandler$c uoc = new LiveLiteBaseFollowGuideNoticeHandler$c(this);
       this.e = uoc;
       b uob = p5.subscribe(uoc);
       a.o(uob, "disableCommentNoticeStat¡­be\(shrinkChangedListener\)");
       a.b(uoa, uob);
       b uob1 = RxBus.f.f(n.class).observeOn(d.a).subscribe(new LiveLiteBaseFollowGuideNoticeHandler$a(this, p0));
       a.o(uob1, "RxBus.INSTANCE.toObserva¡­clear\(\)\n        }\n      }");
       a.b(uoa, uob1);
    }
    public final void a(LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteBaseFollowGuideNoticeHandler.class, "2")) {
          return;
       }
       a.p(p0, "followGuideConfig");
       b uob = this.c(p0, p1);
       if (!uob.b()) {
          b.P(LiveLiteLogTag.LIVE_FOLLOW_GUIDE.appendTag("LiveLiteBaseFollowGuideNoticeHandler"), "addMessageToCommonGuideQueue can not consume");
          this.b.clear();
          return;
       }else {
          LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1 uoaddMessage = new LiveLiteBaseFollowGuideNoticeHandler$addMessageToCommonGuideQueue$followGuideMessage$1(this, p0, uob);
          this.b.add(uoaddMessage);
          if (this.d == null) {
             this.g.d(uoaddMessage);
          }
          LiveLiteLogTag lIVE_FOLLOW_ = LiveLiteLogTag.LIVE_FOLLOW_GUIDE;
          lIVE_FOLLOW_.appendTag("LiveLiteBaseFollowGuideNoticeHandler");
          LiveLiteLogTag liveLiteLogT = lIVE_FOLLOW_;
          b.T(liveLiteLogT, "addMessageToCommonGuideQueue", "ILiveLiteGuidanceMessage", uoaddMessage.a(), "isDisable", Boolean.valueOf(this.d));
          return;
       }
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveLiteBaseFollowGuideNoticeHandler.class, "1")) {
          return;
       }
       this.a.dispose();
       k1.n(this);
       return;
    }
    public final b c(LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig p0,List p1){
       LiveCommonGuideConfig liveCommonGu1;
       LiveConfigStartupResponse$LiveLiteCommonGuideConfig obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteBaseFollowGuideNoticeHandler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.v(LiveConfigStartupResponse$LiveLiteCommonGuideConfig.class);
       d uod = a.b();
       LiveCommonGuideConfig liveCommonGu = null;
       if (obj != null) {
          LiveConfigStartupResponse$LiveLiteCommonGuideConfig mCommonGuide = obj.mCommonGuideConfig;
          if (mCommonGuide != null) {
             liveCommonGu1 = mCommonGuide.get(p0.mCommonGuideSubBizType);
             if (liveCommonGu1 != null) {
                liveCommonGu1 = liveCommonGu1.subBizFrequencyKey;
             label_002e :
                LiveLiteLogTag lIVE_FOLLOW_ = LiveLiteLogTag.LIVE_FOLLOW_GUIDE;
                String str = "LiveLiteBaseFollowGuideNoticeHandler";
                lIVE_FOLLOW_.appendTag(str);
                String str1 = "getSubBizFrequencyConsumer";
                b.S(lIVE_FOLLOW_, str1, "subBizFrequencyKey", liveCommonGu1);
                if (obj != null) {
                   obj = obj.mCommonGuideConfig;
                   if (obj != null) {
                      LiveCommonGuideConfig liveCommonGu2 = obj.get(p0.mCommonGuideSubBizType);
                      if (liveCommonGu2 != null) {
                         liveCommonGu = liveCommonGu2.bizFrequencyKey;
                      }
                   }
                }
                lIVE_FOLLOW_.appendTag(str);
                b.S(lIVE_FOLLOW_, str1, "globalSubBizFrequencyKey", liveCommonGu);
                if (liveCommonGu1 == null && liveCommonGu == null) {
                   lIVE_FOLLOW_.appendTag(str);
                   b.S(lIVE_FOLLOW_, str1, "LiveFrequencyAlwaysCanNotConsumeConsumer", "cannotConsume");
                   uod.c(new f());
                   a.o(uod, "consumer");
                   return uod;
                }else if(p1 != null){
                   Iterator iterator = p1.iterator();
                   while (iterator.hasNext()) {
                      LiveMessageFrequencyConfig$FrequencyConfig uFrequencyCo = iterator.next();
                      if (a.g(uFrequencyCo.mConfigBizId, liveCommonGu1) || a.g(uFrequencyCo.mConfigBizId, liveCommonGu)) {
                         uod.c(new h(uFrequencyCo.mConfigBizId+"_"+this.f, uFrequencyCo.mAppearTimesByLiveStream));
                         QCurrentUser qCurrentUser = QCurrentUser.me();
                         a.o(qCurrentUser, "QCurrentUser.me\(\)");
                         uod.c(new j(uFrequencyCo.mConfigBizId+"_"+qCurrentUser.getId(), -1, uFrequencyCo.mAppearTimesByColdTime));
                      }
                   }
                }
                a.o(uod, "consumer");
                return uod;
             }
          }
       }
       liveCommonGu1 = liveCommonGu;
       goto label_002e ;
    }
    public abstract void d(LiveLiteDelayInfoResponse$LiveLiteFollowGuideConfig p0,List p1);
    public final void e(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBaseFollowGuideNoticeHandler.class, "4")) {
          return;
       }
       b.S(LiveLiteLogTag.LIVE_FOLLOW_GUIDE.appendTag("LiveLiteBaseFollowGuideNoticeHandler"), "removeMessageIfInMessageQueue", "ILiveLiteGuidanceMessage", p0.a());
       this.g.c(p0);
       return;
    }
}
