package com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$a;
import nsd.u;
import e93.b;
import e93.a;
import v51.a;
import xp5.i;
import com.kuaishou.live.lite.sidebar.e;
import qa3.b;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$delayInfoFetchedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$scMessageListener$2;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$entryDetailItem$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.sidebar.c;
import va3.e;
import android.view.View$OnClickListener;
import va3.f;
import com.kuaishou.live.lite.sidebar.e$a;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$onCreate$registerListener$1;
import ec3.f;
import qa3.a;
import hf3.a;
import lf3.g;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.lang.Long;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$b;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import v91.d;
import v91.a;
import com.kuaishou.android.live.model.QLivePlayConfig;
import or5.d;
import v91.h;
import java.lang.StringBuilder;
import v91.j;
import com.kwai.framework.model.user.QCurrentUser;

public final class LiveLiteSideEntryDetailController extends ViewController	// class@0008ee
{
    public final p j;
    public final p k;
    public final p l;
    public ObjectAnimator m;
    public LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage n;
    public final b o;
    public final a p;
    public final a q;
    public final i r;
    public final e s;
    public final b t;
    public final LiveLiteGuidanceMessageQueueManager u;
    public final LiveActionTrigger v;
    public final LiveLiteScatterLoadManager w;
    public static final LiveLiteSideEntryDetailController$a x;

    static {
       LiveLiteSideEntryDetailController.x = new LiveLiteSideEntryDetailController$a(null);
    }
    public void LiveLiteSideEntryDetailController(b p0,a p1,a p2,i p3,e p4,b p5,LiveLiteGuidanceMessageQueueManager p6,LiveActionTrigger p7,LiveLiteScatterLoadManager p8){
       a.p(p0, "liveLiteEnterService");
       a.p(p1, "liteAudienceInfoManager");
       a.p(p2, "longConnectManager");
       a.p(p3, "logPackageProvider");
       a.p(p4, "sideBarService");
       a.p(p5, "liveLiteDelayInfoManager");
       a.p(p6, "guidanceMessageQueueService");
       a.p(p7, "actionTrigger");
       a.p(p8, "liveTaskQueue");
       super();
       this.o = p0;
       this.p = p1;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       this.t = p5;
       this.u = p6;
       this.v = p7;
       this.w = p8;
       this.j = s.c(new LiveLiteSideEntryDetailController$delayInfoFetchedListener$2(this));
       this.k = s.c(new LiveLiteSideEntryDetailController$scMessageListener$2(this));
       this.l = s.c(LiveLiteSideEntryDetailController$entryDetailItem$2.INSTANCE);
    }
    public void F2(){
       LiveLiteSideEntryDetailController liveLiteSide = LiveLiteSideEntryDetailController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteSide, "8")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveLiteSide, "10")) {
          this.X2().n(new e(this));
          this.X2().e = new f(this);
          this.s.b(this.X2());
       }
       LiveLiteSideEntryDetailController$onCreate$registerListener$1 oonCreate$re = new LiveLiteSideEntryDetailController$onCreate$registerListener$1(this);
       if (f.h()) {
          this.w.W1("LiveLiteSideEntryDetailController::registerListener", oonCreate$re);
       }else {
          oonCreate$re.invoke();
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteSideEntryDetailController.class, "12")) {
          return;
       }
       this.t.b(this.W2());
       this.q.u().o(1069, this.Y2());
       LiveLiteSideEntryDetailController tn = this.n;
       if (tn != null) {
          this.u.c(tn);
       }
       this.X2().m();
       return;
    }
    public final void V2(String p0,String p1,long p2){
       if (PatchProxy.isSupport(LiveLiteSideEntryDetailController.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), this, LiveLiteSideEntryDetailController.class, "4")) {
          return;
       }
       LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1 uoaddMessage = new LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1(this, p0, p1, p2, new LiveLiteSideEntryDetailController$b(this));
       this.n = v0;
       Objects.requireNonNull(v0, "null cannot be cast to non-null type com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager.ILiveLiteGuidanceMessage");
       this.u.d(v0);
       return;
    }
    public final a W2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideEntryDetailController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final c X2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideEntryDetailController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public final g Y2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideEntryDetailController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.getValue();
    }
    public final b Z2(LiveMessageFrequencyConfig$FrequencyConfig p0){
       d obj = PatchProxy.applyOneRefs(p0, this, LiveLiteSideEntryDetailController.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b();
       if (p0 != null) {
          QLivePlayConfig qLivePlayCon = this.p.C0();
          a.o(qLivePlayCon, "liteAudienceInfoManager.livePlayConfig");
          String liveStreamId = qLivePlayCon.getLiveStreamId();
          String str = "LiveLiteSideEntryDetailController_";
          if (liveStreamId != null) {
             obj.c(new h(str+liveStreamId, p0.mAppearTimesByLiveStream));
          }
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          obj.c(new j(str+qCurrentUser.getId(), -1, p0.mAppearTimesByColdTime));
       }
       a.o(obj, "consumer");
       return obj;
    }
}
