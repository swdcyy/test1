package com.kuaishou.live.lite.comment.LiveLiteCommentPresenter;
import b93.d;
import com.kuaishou.live.service.ServiceProvider;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$c;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$b;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$a;
import z1.k;
import java.lang.String;
import kotlin.jvm.internal.a;
import ip3.a;
import vb3.n;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import s93.l;
import e93.c;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import ga1.d;
import la3.a;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$onCreate$1;
import msd.a;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$onCreate$2;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import com.kuaishou.live.lite.bottombubble.LiveLiteBottomBubbleViewController;
import vb3.p;
import fa3.a;
import v51.a;
import or5.d;
import xp5.i;
import td3.o;
import qa3.b;
import py1.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import e93.b;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$onCreate$3;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$onCreate$4;
import h93.a;
import e93.a;
import vq5.d;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pg1.e;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import com.kuaishou.live.lite.comment.LiveLiteCommentPresenter$d;
import androidx.lifecycle.LifecycleOwner;
import ja3.a;
import qa3.a;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kuaishou.live.lite.commentnotice.handler.follow.guide.LiveLiteBaseFollowGuideNoticeHandler;
import java.util.Objects;
import com.kuaishou.live.lite.commentnotice.handler.follow.LiveLiteFollowGuideConsumerImpl;
import ja3.d;
import c93.b;
import n91.f;
import wa3.c;
import ds5.a;
import hx1.a;
import x83.a;
import uf1.a;
import d93.a;
import sc3.a;
import vb3.d;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import vb3.f;
import com.kuaishou.live.lite.sidebar.e;
import v63.b;
import jm1.b;
import kg1.h;
import xa3.a;
import d93.b;
import s93.s;
import f93.c;
import n93.b;

public final class LiveLiteCommentPresenter extends d	// class@0007ed
{
    public LiveLiteFollowGuideManager A;
    public final ServiceProvider B;
    public final ServiceProvider C;
    public final LiveLiteCommentPresenter$a D;
    public k E;
    public k F;
    public k G;
    public k H;
    public k I;
    public k J;
    public k K;
    public k L;
    public k M;
    public k N;
    public k O;
    public k P;
    public k Q;
    public k R;
    public k S;
    public k T;
    public c U;
    public a U0;
    public n V;
    public a V0;
    public LiveLiteGestureService W;
    public a W0;
    public d X;
    public a X0;
    public a Y;
    public a Y0;
    public b Z;
    public a Z0;
    public a a1;
    public a b1;
    public a c1;
    public final ServiceProvider v;
    public final LiveLiteCommentPresenter$c w;
    public final ServiceProvider x;
    public final ServiceProvider y;
    public final LiveLiteCommentPresenter$b z;

    public void LiveLiteCommentPresenter(){
       super();
       this.v = new ServiceProvider();
       this.w = new LiveLiteCommentPresenter$c(this);
       this.x = new ServiceProvider();
       this.y = new ServiceProvider();
       this.z = new LiveLiteCommentPresenter$b(this);
       this.B = new ServiceProvider();
       this.C = new ServiceProvider();
       this.D = new LiveLiteCommentPresenter$a(this);
    }
    public static final k c9(LiveLiteCommentPresenter p0){
       p0 = p0.F;
       if (p0 == null) {
          a.S("audienceInfoManager");
       }
       return p0;
    }
    public static final k d9(LiveLiteCommentPresenter p0){
       p0 = p0.P;
       if (p0 == null) {
          a.S("delayInfoManager");
       }
       return p0;
    }
    public static final a e9(LiveLiteCommentPresenter p0){
       p0 = p0.Z0;
       if (p0 == null) {
          a.S("giftService");
       }
       return p0;
    }
    public static final k h9(LiveLiteCommentPresenter p0){
       p0 = p0.T;
       if (p0 == null) {
          a.S("guidanceMessageQueueManager");
       }
       return p0;
    }
    public static final a j9(LiveLiteCommentPresenter p0){
       p0 = p0.a1;
       if (p0 == null) {
          a.S("liveGiftSendService");
       }
       return p0;
    }
    public static final k k9(LiveLiteCommentPresenter p0){
       p0 = p0.G;
       if (p0 == null) {
          a.S("liveLogPackageProvider");
       }
       return p0;
    }
    public static final k l9(LiveLiteCommentPresenter p0){
       p0 = p0.E;
       if (p0 == null) {
          a.S("longConnectionManager");
       }
       return p0;
    }
    public static final k m9(LiveLiteCommentPresenter p0){
       p0 = p0.I;
       if (p0 == null) {
          a.S("userStatusManager");
       }
       return p0;
    }
    public static final n n9(LiveLiteCommentPresenter p0){
       p0 = p0.V;
       if (p0 == null) {
          a.S("viewProviderService");
       }
       return p0;
    }
    public void F8(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, LiveLiteCommentPresenter.class, "4")) {
          return;
       }
       super.F8();
       LiveLiteCommentPresenter v = obj.v;
       LiveLiteCommentPresenter x = obj.x;
       LiveLiteCommentPresenter e = obj.E;
       String str = "longConnectionManager";
       if (e == null) {
          a.S(str);
       }
       LiveLiteCommentPresenter f = obj.F;
       String str1 = "audienceInfoManager";
       if (f == null) {
          a.S(str1);
       }
       LiveLiteCommentPresenter g = obj.G;
       String str2 = "liveLogPackageProvider";
       if (g == null) {
          a.S(str2);
       }
       LiveLiteCommentPresenter h = obj.H;
       if (h == null) {
          a.S("serverTimeProvider");
       }
       LiveLiteCommentPresenter i = obj.I;
       String str3 = "userStatusManager";
       if (i == null) {
          a.S(str3);
       }
       LiveLiteCommentPresenter j = obj.J;
       if (j == null) {
          a.S("anonymityManager");
       }
       LiveLiteCommentPresenter k = obj.K;
       if (k == null) {
          a.S("roleInfoManager");
       }
       LiveLiteCommentPresenter l = obj.L;
       if (l == null) {
          a.S("playConfigManager");
       }
       String str4 = str3;
       LiveLiteCommentPresenter m = obj.M;
       if (m == null) {
          a.S("liteEventCenter");
       }
       String str5 = str2;
       LiveLiteCommentPresenter n = obj.N;
       if (n == null) {
          a.S("routerManager");
       }
       String str6 = str1;
       LiveLiteCommentPresenter o = obj.O;
       if (o == null) {
          a.S("liveActionTrigger");
       }
       String str7 = str;
       LiveLiteCommentPresenter u = obj.U;
       if (u == null) {
          a.S("liteFragmentService");
       }
       LiveLiteCommentPresenter liveLiteComm = u;
       u = obj.V;
       if (u == null) {
          a.S("viewProviderService");
       }
       LiveLiteCommentPresenter liveLiteComm1 = u;
       u = obj.W;
       if (u == null) {
          a.S("gestureService");
       }
       LiveLiteCommentPresenter liveLiteComm2 = u;
       u = obj.X;
       if (u == null) {
          a.S("logReporterService");
       }
       LiveLiteCommentPresenter liveLiteComm3 = u;
       u = obj.Y;
       if (u == null) {
          a.S("liveLiteAdLogService");
       }
       LiveLiteCommentPresenter liveLiteComm4 = u;
       u = obj.U0;
       if (u == null) {
          a.S("profileCardService");
       }
       LiveLiteCommentPresenter liveLiteComm5 = u;
       u = obj.V0;
       if (u == null) {
          a.S("liveDialogNotifyService");
       }
       LiveLiteCommentPresenter liveLiteComm6 = u;
       u = obj.X0;
       if (u == null) {
          a.S("bottomBarService");
       }
       l ol = new l(v, x, e, f, g, h, i, j, k, l, m, n, o, liveLiteComm, liveLiteComm1, liveLiteComm2, liveLiteComm3, liveLiteComm4, liveLiteComm5, liveLiteComm6, u);
       this.P8().xg(v0);
       x = obj.R;
       String str8 = "scatterLoadManager";
       if (x == null) {
          a.S(str8);
       }
       x.get().W1("LiveLiteInteractiveMessage::Init", new LiveLiteCommentPresenter$onCreate$1(obj));
       x = obj.R;
       if (x == null) {
          a.S(str8);
       }
       x.get().W1("LiveLiteComboComment::Init", new LiveLiteCommentPresenter$onCreate$2(obj));
       x = obj.V;
       if (x == null) {
          a.S("viewProviderService");
       }
       LayoutViewType bottomBubble = LayoutViewType.BottomBubble;
       o = obj.W;
       if (o == null) {
          a.S("gestureService");
       }
       g = obj.y;
       n = obj.W0;
       if (n == null) {
          a.S("bottomBubbleHeightNotifierService");
       }
       x.c(bottomBubble, new LiveLiteBottomBubbleViewController(o, g, n));
       d uod = this.P8();
       f = obj.E;
       if (f == null) {
          a.S(str7);
       }
       Object obj1 = f.get();
       a.o(obj1, "longConnectionManager.get\(\)");
       Object obj2 = obj1;
       f = obj.F;
       if (f == null) {
          a.S(str6);
       }
       obj1 = f.get();
       str1 = "audienceInfoManager.get\(\)";
       a.o(obj1, str1);
       Object obj3 = obj1;
       f = obj.G;
       if (f == null) {
          a.S(str5);
       }
       obj1 = f.get();
       String str9 = "liveLogPackageProvider.get\(\)";
       a.o(obj1, str9);
       Object obj4 = obj1;
       f = obj.I;
       if (f == null) {
          a.S(str4);
       }
       obj1 = f.get();
       a.o(obj1, "userStatusManager.get\(\)");
       Object obj5 = obj1;
       f = obj.P;
       str2 = "delayInfoManager";
       if (f == null) {
          a.S(str2);
       }
       obj1 = f.get();
       String str10 = "delayInfoManager.get\(\)";
       a.o(obj1, str10);
       Object obj6 = obj1;
       f = obj.O;
       if (f == null) {
          a.S("liveActionTrigger");
       }
       obj1 = f.get();
       a.o(obj1, "liveActionTrigger.get\(\)");
       Object obj7 = obj1;
       f = obj.B;
       i = obj.T;
       str3 = "guidanceMessageQueueManager";
       if (i == null) {
          a.S(str3);
       }
       Object obj8 = i.get();
       String str11 = "guidanceMessageQueueManager.get\(\)";
       a.o(obj8, str11);
       Object obj9 = obj8;
       i = obj.Y;
       if (i == null) {
          a.S("liveLiteAdLogService");
       }
       k = obj.Z;
       if (k == null) {
          a.S("liveLiteEnterService");
       }
       a uoa = obj.y.a();
       l = obj.R;
       if (l == null) {
          a.S(str8);
       }
       a obj10 = l.get();
       l ol1 = v0;
       a.o(obj10, "scatterLoadManager.get\(\)");
       Object obj11 = obj10;
       obj10 = new a(obj2, obj3, obj4, obj5, obj6, obj7, f, obj9, i, k, uoa, obj11);
       uod.xg(bottomBubble);
       LiveLiteCommentPresenter r = obj.R;
       if (r == null) {
          a.S(str8);
       }
       r.get().W1("LiveLiteHighFrequencyGuide::Init", new LiveLiteCommentPresenter$onCreate$3(obj));
       r = obj.R;
       if (r == null) {
          a.S(str8);
       }
       r.get().W1("LiveLiteQuickInteractive::Init", new LiveLiteCommentPresenter$onCreate$4(obj));
       d uod1 = this.P8();
       v = obj.C;
       e = obj.G;
       if (e == null) {
          a.S(str5);
       }
       Object obj12 = e.get();
       a.o(obj12, str9);
       obj3 = obj12;
       e = obj.F;
       if (e == null) {
          a.S(str6);
       }
       obj12 = e.get();
       a.o(obj12, str1);
       obj4 = obj12;
       e = obj.N;
       if (e == null) {
          a.S("routerManager");
       }
       obj12 = e.get();
       a.o(obj12, "routerManager.get\(\)");
       obj5 = obj12;
       e = obj.T;
       if (e == null) {
          a.S(str3);
       }
       obj12 = e.get();
       a.o(obj12, str11);
       obj6 = obj12;
       obj10 = new a(v, obj3, obj4, obj5, obj6, obj.B.a(), obj.y.a());
       uod1.xg(uod);
       Context context = this.getContext();
       a.m(context);
       a.o(context, "context!!");
       r = obj.T;
       if (r == null) {
          a.S(str3);
       }
       LiveLiteFollowGuideManager obj13 = r.get();
       a.o(obj13, str11);
       Object obj14 = obj13;
       r = obj.F;
       if (r == null) {
          a.S(str6);
       }
       obj13 = r.get();
       a.o(obj13, str1);
       obj1 = obj13;
       r = obj.Q;
       if (r == null) {
          a.S("followManager");
       }
       obj13 = r.get();
       a.o(obj13, "followManager.get\(\)");
       Object obj15 = obj13;
       g = obj.Y0;
       if (g == null) {
          a.S("liveLiteSideBarService");
       }
       i = obj.X0;
       if (i == null) {
          a.S("bottomBarService");
       }
       r = obj.O;
       if (r == null) {
          a.S("liveActionTrigger");
       }
       LiveActionTrigger liveActionTr = r.get().qe();
       r = obj.P;
       if (r == null) {
          a.S(str2);
       }
       obj13 = r.get();
       a.o(obj13, str10);
       Object obj16 = obj13;
       k = obj.G;
       if (k == null) {
          a.S(str5);
       }
       obj13 = new LiveLiteFollowGuideManager(context, this, obj14, obj1, obj15, g, i, liveActionTr, obj16, k, obj.x.a(), new LiveLiteCommentPresenter$d(ol1));
       obj.A = obj10;
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteCommentPresenter.class, "5")) {
          return;
       }
       LiveLiteCommentPresenter tA = this.A;
       if (tA != null && !PatchProxy.applyVoid(null, tA, LiveLiteFollowGuideManager.class, "8")) {
          tA.l.b(tA.c);
          Iterator iterator = tA.c().entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().b();
          }
          LiveLiteFollowGuideManager a = tA.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(null, a, LiveLiteFollowGuideConsumerImpl.class, "3")) {
             LiveLiteFollowGuideConsumerImpl a1 = a.a;
             if (a1 != null) {
                a1.e();
             }
             a.a = null;
          }
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommentPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.E = p0.c(a.class);
       this.F = p0.c(a.class);
       this.G = p0.c(i.class);
       this.H = p0.c(f.class);
       this.N = p0.c(d.class);
       this.M = p0.c(c.class);
       this.O = p0.c(a.class);
       this.L = p0.c(a.class);
       this.I = p0.c(o.class);
       this.K = p0.c(a.class);
       this.J = p0.c(a.class);
       this.P = p0.c(b.class);
       this.Q = p0.c(e.class);
       this.R = p0.c(LiveLiteScatterLoadManager.class);
       this.S = p0.c(a.class);
       this.T = p0.c(LiveLiteGuidanceMessageQueueManager.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommentPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.V = p0.a(n.class);
       this.U = p0.a(c.class);
       this.W = p0.a(LiveLiteGestureService.class);
       this.X = p0.a(d.class);
       this.Y = p0.a(a.class);
       this.Z = p0.a(b.class);
       this.U0 = p0.e(a.class);
       this.V0 = p0.e(d.class);
       this.X0 = p0.e(LiveLiteBottomBarService.class);
       this.W0 = p0.e(f.class);
       this.Y0 = p0.e(e.class);
       this.Z0 = p0.e(b.class);
       this.a1 = p0.e(b.class);
       this.c1 = p0.e(h.class);
       this.b1 = p0.e(a.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteCommentPresenter.class, "1")) {
          return;
       }
       a.p(p0, "register");
       p0.d(s.class, this.w);
       p0.d(c.class, this.D);
       p0.d(b.class, this.z);
       return;
    }
}
