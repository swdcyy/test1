package com.kuaishou.live.lite.entrydetail.LiveLiteEntryDetailPresenter;
import b93.d;
import xp5.i;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import eq3.d;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController;
import z1.k;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import py1.a;
import e93.b;
import e93.a;
import v51.a;
import com.kuaishou.live.lite.sidebar.e;
import qa3.b;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.live.viewcontroller.ViewController;
import va3.c;
import vq5.d;
import com.kuaishou.live.lite.entrydetail.LiveLiteEntryDetailPresenter$onCreate$1;
import ec3.f;
import msd.a;
import com.kuaishou.live.lite.entrydetail.LiveLiteEntryDetailPresenter$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import ec3.d;
import c93.b;
import td3.o;
import d93.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;

public final class LiveLiteEntryDetailPresenter extends d	// class@0008e1
{
    public d A;
    public b B;
    public k C;
    public a D;
    public LiveLiteScatterLoadManager E;
    public a F;
    public o G;
    public LiveLiteGestureService v;
    public e w;
    public b x;
    public i y;
    public a z;

    public void LiveLiteEntryDetailPresenter(){
       super();
    }
    public static final i c9(LiveLiteEntryDetailPresenter p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("logPackageProvider");
       }
       return p0;
    }
    public void F8(){
       LiveLiteEntryDetailPresenter liveLiteEntr = LiveLiteEntryDetailPresenter.class;
       if (PatchProxy.applyVoid(null, this, liveLiteEntr, "3")) {
          return;
       }
       super.F8();
       d uod = this.P8();
       LiveLiteEntryDetailPresenter tx = this.x;
       if (tx == null) {
          a.S("liteEnterService");
       }
       LiveLiteEntryDetailPresenter tz = this.z;
       if (tz == null) {
          a.S("infoService");
       }
       LiveLiteEntryDetailPresenter tD = this.D;
       if (tD == null) {
          a.S("liveLongConnectManager");
       }
       LiveLiteEntryDetailPresenter ty = this.y;
       if (ty == null) {
          a.S("logPackageProvider");
       }
       LiveLiteEntryDetailPresenter tw = this.w;
       if (tw == null) {
          a.S("liteSideBarService");
       }
       LiveLiteEntryDetailPresenter tB = this.B;
       if (tB == null) {
          a.S("delayInfoManager");
       }
       LiveLiteEntryDetailPresenter tC = this.C;
       if (tC == null) {
          a.S("messageQueueService");
       }
       LiveLiteSideEntryDetailController obj = tC.get();
       a.o(obj, "messageQueueService.get\(\)");
       Object obj1 = obj;
       tC = this.F;
       if (tC == null) {
          a.S("actionTriggerManager");
       }
       LiveActionTrigger liveActionTr = tC.qe();
       LiveLiteEntryDetailPresenter tE = this.E;
       if (tE == null) {
          a.S("liveTaskQueue");
       }
       obj = new LiveLiteSideEntryDetailController(tx, tz, tD, ty, tw, tB, obj1, liveActionTr, tE);
       uod.xg(v12);
       tx = this.A;
       if (tx == null) {
          a.S("routerManager");
       }
       tz = this.x;
       if (tz == null) {
          a.S("liteEnterService");
       }
       uod.xg(new c(tx, tz));
       LiveLiteEntryDetailPresenter$onCreate$1 oonCreate$1 = new LiveLiteEntryDetailPresenter$onCreate$1(this, uod);
       if (!PatchProxy.applyVoidTwoRefs("addSingleTapEntryDetailController", oonCreate$1, this, liveLiteEntr, "4")) {
          if (f.h()) {
             liveLiteEntr = this.E;
             if (liveLiteEntr == null) {
                a.S("liveTaskQueue");
             }
             liveLiteEntr.W1("addSingleTapEntryDetailController", oonCreate$1);
          }else {
             oonCreate$1.invoke();
          }
       }
       d.a(new LiveLiteEntryDetailPresenter$a(this));
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEntryDetailPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.y = p0.a(i.class);
       this.z = p0.a(a.class);
       this.A = p0.a(d.class);
       this.B = p0.a(b.class);
       this.D = p0.a(a.class);
       this.F = p0.a(a.class);
       this.G = p0.a(o.class);
       this.E = p0.a(LiveLiteScatterLoadManager.class);
       this.C = p0.c(LiveLiteGuidanceMessageQueueManager.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEntryDetailPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(LiveLiteGestureService.class);
       this.w = p0.a(e.class);
       this.x = p0.a(b.class);
       return;
    }
}
