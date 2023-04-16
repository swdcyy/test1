package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$a;
import nsd.u;
import um1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ha1.b;
import androidx.lifecycle.LifecycleOwner;
import v51.a;
import or5.d;
import hx1.a;
import td3.o;
import rd3.b;
import aq5.d;
import qx1.a;
import xp5.i;
import sz1.e;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import vq5.d;
import vb3.n;
import vb3.g;
import vb3.d;
import e93.c;
import z1.k;
import ug1.u0;
import com.kuaishou.live.lite.sidebar.e;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import vb3.e;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import ic3.a;
import sc3.a;
import ip3.a;
import h03.a;
import kg1.h;
import xa3.a;
import jm1.a;
import om1.e;
import fi1.a;
import mi1.a;
import ni1.d;
import msd.a;
import kotlin.jvm.internal.a;
import ih1.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import ah1.c;
import wi1.c;
import wi1.b;
import qh1.a;
import rh1.a;
import vh1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.logger.LiveGiftSendResultObserverForLogger;
import om1.a;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$d;
import z73.e;
import z73.d;
import z73.f;
import z73.g;
import z73.b;
import z73.h;
import yi1.a;
import zg1.l;
import gm1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import l73.p;
import l73.q;
import l73.r;
import l73.s;
import l73.t;
import l73.u;
import xh1.a;
import xh1.b;
import zg1.f;
import nj1.a;
import com.kuaishou.live.common.core.component.gift.giftNaming.springNaming.LiveGiftSpringNamingModel;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import q73.a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import l73.a;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$b;
import o73.b;
import o73.c;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLitGiftBoxBottomBarEntryManager;
import l73.b;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initManager$1;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.router.LiveGiftSendRouterManager;
import l73.h;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager;
import hf3.a;
import l73.i;
import l73.j;
import l73.k;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager;
import l73.l;
import l73.m;
import l73.n;
import com.kuaishou.live.lite.adapter.component.gift.popularity.LiveLitePopularityTicketManager;
import l73.o;
import l73.c;
import l73.d;
import l73.e;
import l73.f;
import l73.g;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initManager$15;
import com.kuaishou.live.common.core.component.gift.domain.effect.LiveGiftEffectManager;
import bi1.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initManager$16;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initManager$17;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initManager$18;
import ec3.f;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initVC$1;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftPresenter$d;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$initVC$2;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.log.LiveGiftBoxLogger;
import zg1.g;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import com.kuaishou.live.common.core.component.gift.domain.recharge.LiveGiftRechargeManager;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.slotqueue.LiveGiftSlotQueueConfig$SlotMsgTrimStrategy;
import tj1.f;
import vj1.a;
import com.kuaishou.live.service.ServiceProvider;
import com.kuaishou.live.common.core.component.gift.domain.slot.logger.LiveGiftSlotLogger;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$e;
import java.util.Objects;
import lf3.g;
import com.kuaishou.live.common.core.component.gift.domain.combo.LiveComboManager;
import oh1.a;
import xg1.a;

public final class LiveLiteGiftManager extends LifecycleManager	// class@001dab
{
    public LiveGiftRechargeManager A;
    public LiveLiteGiftMessageManager B;
    public LiveVipGradeNavigationManager C;
    public LiveGiftSendRouterManager D;
    public f E;
    public final a F;
    public final LiveGiftSendResultObserverForLogger G;
    public final k H;
    public final a I;
    public final d J;
    public final a K;
    public final o L;
    public final b M;
    public final d N;
    public final a O;
    public final i P;
    public final e Q;
    public final LiveActionTrigger R;
    public final d S;
    public final n T;
    public final g U;
    public final LiveLiteBottomBarService U0;
    public final d V;
    public final e V0;
    public final c W;
    public final LiveLiteGestureService W0;
    public final k X;
    public final a X0;
    public final u0 Y;
    public final a Y0;
    public final e Z;
    public final a Z0;
    public final a a1;
    public final h b1;
    public e c;
    public final a c1;
    public d d;
    public final a d1;
    public f e;
    public final e e1;
    public g f;
    public final a f1;
    public b g;
    public final a g1;
    public l h;
    public final d h1;
    public a i;
    public final a i1;
    public LiveGiftSendModel j;
    public c k;
    public LiveGiftSpringNamingModel l;
    public final l m;
    public final c n;
    public final c o;
    public final b p;
    public LiveGiftBoxManager q;
    public LiveLiteGiftBoxSideBarEntryManager r;
    public LiveLitGiftBoxBottomBarEntryManager s;
    public LiveLiteGiftGuideManager t;
    public LiveLiteViceGiftGuideManager u;
    public LiveLitePopularityTicketManager v;
    public LiveComboManager w;
    public final a x;
    public final a y;
    public LiveGiftEffectManager z;
    public static final LiveLiteGiftManager$a j1;

    static {
       LiveLiteGiftManager.j1 = new LiveLiteGiftManager$a(null);
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
       }else {
          b.f(new int[3]{R.layout.live_lite_gift_guide_side_bar_item_layout,0x7f0d0b45,R.layout.live_gift_side_bar_layout});
          b.g(new int[5]{R.layout.live_lite_gift_guide_side_bar_item_layout,0x7f0d0b45,R.layout.live_gift_side_bar_layout,0x7f0d0b40,R.layout.live_lite_gift_guide_side_bar_item_small_layout});
       }
    }
    public void LiveLiteGiftManager(LifecycleOwner p0,a p1,d p2,a p3,o p4,b p5,d p6,a p7,i p8,e p9,LiveActionTrigger p10,d p11,n p12,g p13,d p14,c p15,k p16,u0 p17,e p18,LiveLiteBottomBarService p19,e p20,LiveLiteGestureService p21,a p22,a p23,a p24,a p25,h p26,a p27,a p28,e p29,a p30,a p31,d p32,a p33){
       LiveLiteGiftManager liveLiteGift;
       LiveLiteGiftManager liveLiteGift1;
       l ol1;
       LiveLiteGiftManager k;
       boolean b2;
       LiveLiteGiftManager i;
       LiveLiteGiftGuideManager obj = p1;
       LifecycleManager obj1 = p2;
       e obj2 = p3;
       Object obj3 = p4;
       h obj4 = p5;
       l obj5 = p6;
       a obj6 = p7;
       k obj7 = p8;
       c obj8 = p10;
       LiveLiteGiftManager obj9 = p11;
       b obj10 = p12;
       l obj11 = p13;
       m obj12 = p14;
       i obj13 = p15;
       a.p(p0, "lifecycleOwner");
       a.p(obj, "longConnectManager");
       a.p(obj1, "audienceInfoManager");
       a.p(obj2, "liveAudienceRoleInfoManager");
       a.p(obj3, "liteUserStatusManager");
       a.p(obj4, "liteApiTrafficManager");
       a.p(obj5, "bizManager");
       a.p(obj6, "serverSignalBlockManager");
       a.p(obj7, "logPackageProvider");
       a.p(obj8, "liveActionTrigger");
       a.p(obj9, "routerManager");
       a.p(obj10, "viewProviderService");
       a.p(obj11, "liteDialogService");
       a.p(obj12, "dialogNotifyService");
       a.p(obj13, "liteFragmentService");
       a.p(p16, "guideMessageManager");
       a.p(p17, "liveGiftTaskQueueDelegate");
       a.p(p18, "liteSideBarService");
       a.p(p19, "liteBottomBarService");
       a.p(p20, "liteBackPressedService");
       a.p(p21, "gestureService");
       a.p(p23, "liteProfileCardService");
       a.p(p24, "commentService");
       a.p(p25, "effectEngineService");
       a.p(p26, "fansGroupJoinService");
       a.p(p27, "liteFansGroupService");
       a.p(p28, "giftBoxService");
       a.p(p29, "sendGiftTracer");
       a.p(p30, "effectGiftMessageChecker");
       a.p(p31, "giftMessageTransformer");
       a.p(p32, "giftBoxEventHub");
       a.p(p33, "giftBoxConfigSupplier");
       super(p0);
       LifecycleManager lifecycleMan = this;
       lifecycleMan.I = obj;
       lifecycleMan.J = obj1;
       lifecycleMan.K = obj2;
       lifecycleMan.L = obj3;
       lifecycleMan.M = obj4;
       lifecycleMan.N = obj5;
       lifecycleMan.O = obj6;
       lifecycleMan.P = obj7;
       lifecycleMan.Q = p9;
       lifecycleMan.R = obj8;
       lifecycleMan.S = obj9;
       lifecycleMan.T = obj10;
       lifecycleMan.U = obj11;
       lifecycleMan.V = obj12;
       lifecycleMan.W = obj13;
       lifecycleMan.X = p16;
       lifecycleMan.Y = p17;
       lifecycleMan.Z = p18;
       lifecycleMan.U0 = p19;
       obj2 = p20;
       lifecycleMan.V0 = obj2;
       lifecycleMan.W0 = p21;
       lifecycleMan.X0 = p22;
       lifecycleMan.Y0 = p23;
       lifecycleMan.Z0 = p24;
       obj4 = p26;
       lifecycleMan.a1 = p25;
       lifecycleMan.b1 = obj4;
       lifecycleMan.c1 = p27;
       lifecycleMan.d1 = p28;
       e uoe = p29;
       lifecycleMan.e1 = uoe;
       lifecycleMan.f1 = p30;
       lifecycleMan.g1 = p31;
       lifecycleMan.h1 = p32;
       lifecycleMan.i1 = p33;
       obj9 = LiveLiteGiftManager.class;
       obj8 = PatchProxy.apply(null, lifecycleMan, obj9, "23");
       obj10 = null;
       boolean b = (obj8 != PatchProxyResult.class)? obj8.booleanValue(): a.t().u("SOURCE_LIVE").d("enableGiftStoreRepoLoadGiftImagesOnWorkerThread", obj10);
       obj5 = new l(b);
       lifecycleMan.m = obj5;
       c uoc = new c("giftMockMessageModel", null, true, false, 10, null);
       lifecycleMan.n = obj6;
       obj8 = new c(obj3);
       lifecycleMan.o = obj8;
       obj10 = new b();
       lifecycleMan.p = obj10;
       l ol = obj5;
       a uoa = new a();
       lifecycleMan.x = uoa;
       c uoc1 = obj6;
       obj6 = new a();
       lifecycleMan.y = obj6;
       b uob = obj10;
       lifecycleMan.F = new a(obj7, uoe);
       LiveGiftSendResultObserverForLogger liveGiftSend = new LiveGiftSendResultObserverForLogger(uoe, obj7);
       lifecycleMan.G = liveGiftSend;
       LiveLiteGiftManager$d uod = new LiveLiteGiftManager$d(lifecycleMan);
       lifecycleMan.H = uod;
       c uoc2 = obj8;
       if (!PatchProxy.applyVoid(null, lifecycleMan, obj9, "2")) {
          lifecycleMan.c = new e(obj11);
          lifecycleMan.d = new d(obj12);
          lifecycleMan.e = new f(obj4);
          lifecycleMan.f = new g(obj13);
          lifecycleMan.g = new b(obj2);
          lifecycleMan.h = new h(obj3);
       }
       if (!PatchProxy.applyVoid(null, lifecycleMan, obj9, "3")) {
          i = lifecycleMan.h;
          if (i == null) {
             a.S("userStatusServiceAdapter");
          }
          lifecycleMan.i = new a(i);
          lifecycleMan.k = new c(obj);
          p op = new p(lifecycleMan);
          q oq = new q(lifecycleMan);
          k = lifecycleMan.e;
          if (k == null) {
             a.S("fansGroupJoinServiceAdapter");
          }
          LiveGiftSendModel liveGiftSend2 = new LiveGiftSendModel(uoa, obj6, op, uod, p8, p11, oq, k, new r(lifecycleMan), new s(lifecycleMan), t.b, u.b);
          lifecycleMan.j = obj2;
          lifecycleMan.l = new LiveGiftSpringNamingModel(obj1, obj3, obj);
          liveLiteGift1 = lifecycleMan.j;
          if (liveLiteGift1 == null) {
             a.S("giftSendModel");
          }
          liveLiteGift1.b(this.a(), liveGiftSend);
       }
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, lifecycleMan, obj9, "4")) {
          liveLiteGift = obj9;
       }else if(PatchProxy.applyVoid(objArray, lifecycleMan, obj9, "6")){
          ol1 = ol;
          liveLiteGift = obj9;
       }else {
          uoa = new a();
          LifecycleOwner lifecycleOwn1 = this.a();
          i = lifecycleMan.i;
          String str = "giftBoxDisableModel";
          if (i == null) {
             a.S(str);
          }
          LiveLiteGiftBoxSideBarEntryManager liveLiteGift2 = new LiveLiteGiftBoxSideBarEntryManager(lifecycleOwn1, uoa, uoc2, i, uob, p8, this.d(), p18, new a(lifecycleMan), new LiveLiteGiftManager$b(lifecycleMan), p17);
          lifecycleMan.r = obj2;
          LifecycleOwner lifecycleOwn2 = this.a();
          LiveLiteGiftManager i1 = lifecycleMan.i;
          if (i1 == null) {
             a.S(str);
          }
          ol1 = ol;
          liveLiteGift = obj9;
          LiveLitGiftBoxBottomBarEntryManager liveLitGiftB = new LiveLitGiftBoxBottomBarEntryManager(lifecycleOwn2, uoa, uoc2, i1, p8, this.d(), p18, p19, new b(lifecycleMan), new LiveLiteGiftManager$b(lifecycleMan));
          lifecycleMan.s = obj7;
       }
       lifecycleMan.c("LiveGiftBoxManager::init", new LiveLiteGiftManager$initManager$1(lifecycleMan));
       LiveGiftSendRouterManager liveGiftSend1 = new LiveGiftSendRouterManager(this.a(), p11, new h(lifecycleMan), ol1, uoc1);
       lifecycleMan.D = obj12;
       LifecycleOwner lifecycleOwn = this.a();
       a uoa1 = p1.u();
       a.o(uoa1, "longConnectManager.liveLongConnection");
       obj13 = new i(lifecycleMan);
       j oj = new j(lifecycleMan);
       obj7 = new k(lifecycleMan);
       LiveLiteGiftManager j = lifecycleMan.j;
       if (j == null) {
          a.S("giftSendModel");
       }
       obj = new LiveLiteGiftGuideManager(lifecycleOwn, uoa1, p4, p2, p18, p19, p16, p17, obj13, oj, obj7, j, ol1, p29, this.d(), this.f());
       obj1 = this;
       obj1.t = objArray;
       lifecycleOwn = this.a();
       obj11 = new l(obj1);
       obj12 = new m(obj1);
       n on = new n(obj1);
       LiveLiteGiftManager j1 = obj1.j;
       if (j1 == null) {
          a.S("giftSendModel");
       }
       LiveLiteViceGiftGuideManager liveLiteVice = new LiveLiteViceGiftGuideManager(lifecycleOwn, p4, p2, p18, p19, obj11, obj12, on, j1, ol1, p29, this.d(), this.f());
       obj1.u = obj3;
       lifecycleOwn = this.a();
       o oo = new o(obj1);
       c uoc3 = new c(obj1);
       d uod1 = new d(obj1);
       uoe = new e(obj1);
       f uof = new f(obj1);
       g og = new g(obj1);
       LiveLiteGiftManager j2 = obj1.j;
       if (j2 == null) {
          a.S("giftSendModel");
       }
       lifecycleMan = obj1;
       LiveLitePopularityTicketManager liveLitePopu = new LiveLitePopularityTicketManager(lifecycleOwn, p4, p18, p19, oo, uoc3, uod1, uoe, uof, p27, og, j2, ol1, p29, this.d());
       lifecycleMan.v = obj3;
       lifecycleMan.c("LiveComboManager::init", new LiveLiteGiftManager$initManager$15(lifecycleMan));
       lifecycleOwn = this.a();
       k = lifecycleMan.k;
       if (k == null) {
          a.S("giftFeedPushModel");
       }
       LiveLiteGiftManager j3 = lifecycleMan.j;
       if (j3 == null) {
          a.S("giftSendModel");
       }
       LiveStreamFeed liveStreamFe = p2.j0();
       boolean b1 = true;
       if (liveStreamFe != null) {
          liveStreamFe = liveStreamFe.mLiveLiteElementsSwitch;
          if (liveStreamFe != null && liveStreamFe.mEnableGuestGiftEffect == b1) {
             b2 = false;
             b1 = false;
          label_042d :
             LiveGiftEffectManager liveGiftEffe = new LiveGiftEffectManager(lifecycleOwn, p8, p2, p7, p25, k, j3, p29, p30, p31, new a(b2, b1));
             lifecycleMan.z = j2;
             lifecycleMan.c("LiveRechargeManager::init", new LiveLiteGiftManager$initManager$16(lifecycleMan));
             lifecycleMan.c("LiveGiftMessageManager::init", new LiveLiteGiftManager$initManager$17(lifecycleMan));
             lifecycleMan.c("LiveVipGradeNavigationManager::init", new LiveLiteGiftManager$initManager$18(lifecycleMan));
          }
       }
       b2 = false;
       goto label_042d ;
       liveLiteGift1 = liveLiteGift;
       if (!PatchProxy.applyVoid(null, lifecycleMan, liveLiteGift1, "13")) {
          if (f.h()) {
             p17.W1("initGiftSlotVC", new LiveLiteGiftManager$initVC$1(lifecycleMan));
          }else {
             this.h();
          }
          lifecycleMan.c("intTopBarChildVC", new LiveLiteGiftManager$initVC$2(lifecycleMan));
       }
       if (!PatchProxy.applyVoid(null, lifecycleMan, liveLiteGift1, "14")) {
          LiveGiftBoxLogger liveGiftBoxL = new LiveGiftBoxLogger(this.a(), p8, p15, p29, p28, this.d());
       }
       return;
    }
    public static final g b(LiveLiteGiftManager p0){
       p0 = p0.f;
       if (p0 == null) {
          a.S("fragmentServiceAdapter");
       }
       return p0;
    }
    public final void c(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftManager.class, "7")) {
          return;
       }
       if (f.h() && f.d()) {
          this.Y.W1(p0, p1);
       }else {
          p1.invoke();
       }
       return;
    }
    public final k d(){
       Object obj = PatchProxy.apply(null, this, LiveLiteGiftManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteGiftManager$c(this);
    }
    public final LiveGiftBoxManager e(){
       return this.q;
    }
    public final boolean f(){
       boolean b;
       LiveStreamFeed obj = PatchProxy.apply(null, this, LiveLiteGiftManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.J.j0();
       if (obj != null) {
          obj = obj.mLiveLiteElementsSwitch;
          if (obj != null && obj.mEnableLiteAttachGift == null) {
             b = false;
          label_0028 :
             return b;
          }
       }
       b = true;
       goto label_0028 ;
    }
    public final LiveGiftRechargeManager g(){
       LiveLiteGiftManager obj = PatchProxy.apply(null, this, LiveLiteGiftManager.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.A == null) {
          this.i();
       }
       obj = this.A;
       a.m(obj);
       return obj;
    }
    public final void h(){
       f uof = this;
       LiveLiteGiftManager liveLiteGift = LiveLiteGiftManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uof, liveLiteGift, "20")) {
          return;
       }
       int i = 0;
       LiveGiftSlotQueueConfig$SlotMsgTrimStrategy slotMsgTrimS = PatchProxy.apply(objArray, uof, liveLiteGift, "22");
       if (slotMsgTrimS != PatchProxyResult.class) {
       }else if(a.t().u("SOURCE_LIVE").d("disableLiteGiftSlotMessageTrim", false)){
          slotMsgTrimS = LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.NONE;
       }else {
          slotMsgTrimS = LiveGiftSlotQueueConfig$SlotMsgTrimStrategy.DELETE;
       }
       LiveLiteGiftManager obj = slotMsgTrimS;
       LiveGiftSlotQueueConfig liveGiftSlot = new LiveGiftSlotQueueConfig(i, obj, 0, 0, 0, 0, 0, 125, null);
       a uoa = new a(v3);
       LiveLiteGiftManager k = uof.K;
       LiveLiteGiftManager j = uof.J;
       LiveLiteGiftManager o = uof.O;
       LiveLiteGiftManager l = uof.L;
       obj = uof.j;
       if (obj == null) {
          a.S("giftSendModel");
       }
       LiveLiteGiftManager k1 = uof.k;
       if (k1 == null) {
          a.S("giftFeedPushModel");
       }
       LiveLiteGiftManager n = uof.n;
       LiveLiteGiftManager d1 = uof.d1;
       LiveLiteGiftManager y0 = uof.Y0;
       LiveLiteGiftManager e1 = uof.e1;
       LiveLiteGiftManager w0 = uof.W0;
       LiveLiteGiftManager l1 = uof.l;
       if (l1 == null) {
          a.S("giftSpringNamingModel");
       }
       f uof1 = new f(uoa, k, j, d1, y0, w0, o, l, e1, obj, k1, n, l1, null);
       uof.E = slotMsgTrimS;
       LiveGiftSlotLogger liveGiftSlot1 = new LiveGiftSlotLogger(this.a(), slotMsgTrimS, uof.P, 3);
       uof.T.c(LayoutViewType.GiftSlot, slotMsgTrimS);
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftManager.class, "8")) {
          return;
       }
       if (this.A == null) {
          LifecycleOwner lifecycleOwn = this.a();
          LiveLiteGiftManager tP = this.P;
          LiveLiteGiftManager tJ = this.J;
          LiveLiteGiftManager tf = this.f;
          if (tf == null) {
             a.S("fragmentServiceAdapter");
          }
          LiveLiteGiftManager td1 = this.d1;
          LiveLiteGiftManager tj = this.j;
          if (tj == null) {
             a.S("giftSendModel");
          }
          LiveGiftRechargeManager liveGiftRech = new LiveGiftRechargeManager(lifecycleOwn, tP, tJ, tf, td1, tj, LiveLiteGiftManager$e.b, this.d());
          this.A = v0;
       }
       return;
    }
    public void onDestroy(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftManager.class, "21")) {
          return;
       }
       a.p(p0, "owner");
       super.onDestroy(p0);
       LiveLiteGiftManager tk = this.k;
       if (tk == null) {
          a.S("giftFeedPushModel");
       }
       Objects.requireNonNull(tk);
       c uoc = c.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tk, uoc, "1") && !PatchProxy.applyVoid(objArray, tk, uoc, "4")) {
          tk.i.u().o(310, tk.j);
       }
       tk = this.w;
       if (tk != null) {
          LiveLiteGiftManager tF = this.F;
          if (!PatchProxy.applyVoidOneRefs(tF, tk, LiveComboManager.class, "12")) {
             a.p(tF, "listener");
             LiveComboManager b = tk.b;
             Objects.requireNonNull(b);
             if (!PatchProxy.applyVoidOneRefs(tF, b, a.class, "8")) {
                a.p(tF, "listener");
                b.a.c(tF);
             }
          }
       }
       tk = this.l;
       if (tk == null) {
          a.S("giftSpringNamingModel");
       }
       Objects.requireNonNull(tk);
       if (!PatchProxy.applyVoid(objArray, tk, LiveGiftSpringNamingModel.class, "1")) {
          a uoa = tk.l.u();
          if (uoa != null) {
             uoa.o(1083, tk.i);
          }
       }
       return;
    }
}
