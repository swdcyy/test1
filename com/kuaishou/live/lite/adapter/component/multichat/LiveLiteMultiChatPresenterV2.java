package com.kuaishou.live.lite.adapter.component.multichat.LiveLiteMultiChatPresenterV2;
import b93.d;
import com.kuaishou.live.lite.sidebar.e;
import java.lang.String;
import kotlin.jvm.internal.a;
import xp5.g;
import xp5.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fq1.b;
import f83.b;
import com.kuaishou.live.lite.adapter.component.multichat.LiveLiteMultiChatPresenterV2$onCreate$1;
import vb3.m;
import msd.a;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import f83.e;
import lp1.e;
import hf3.a;
import v51.a;
import com.kwai.video.waynelive.LivePlayerController;
import ga1.e;
import lp1.c;
import sz1.e;
import ee1.a;
import op1.b;
import com.kuaishou.live.lite.adapter.component.multichat.LiveLiteMultiChatPresenterV2$onCreate$2;
import lp1.b;
import f83.c;
import msd.l;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import vb3.n;
import c93.b;
import o63.a;
import d93.a;
import rc3.d;
import sc3.a;
import jm1.a;

public final class LiveLiteMultiChatPresenterV2 extends d	// class@001df7
{
    public a A;
    public e B;
    public n C;
    public d D;
    public a E;
    public a F;
    public LiveLiteGestureService G;
    public e H;
    public m I;
    public a J;
    public e v;
    public b w;
    public a x;
    public i y;
    public g z;

    public void LiveLiteMultiChatPresenterV2(){
       super();
    }
    public static final e c9(LiveLiteMultiChatPresenterV2 p0){
       p0 = p0.H;
       if (p0 == null) {
          a.S("liteSideBarService");
       }
       return p0;
    }
    public static final g d9(LiveLiteMultiChatPresenterV2 p0){
       p0 = p0.z;
       if (p0 == null) {
          a.S("liveInfoManager");
       }
       return p0;
    }
    public static final i e9(LiveLiteMultiChatPresenterV2 p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("liveLogPackageProvider");
       }
       return p0;
    }
    public void F8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteMultiChatPresenterV2 liveLiteMult = LiveLiteMultiChatPresenterV2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteMult, "3")) {
          return;
       }
       super.F8();
       if (b.c()) {
          return;
       }
       LiveLiteMultiChatPresenterV2 tI = this.I;
       if (tI == null) {
          a.S("stageChangeService");
       }
       LiveLiteMultiChatPresenterV2 tz = this.z;
       if (tz == null) {
          a.S("liveInfoManager");
       }
       this.w = new b(tI, tz.d(), new LiveLiteMultiChatPresenterV2$onCreate$1(this));
       tI = this.w;
       a.m(tI);
       this.P8().xg(tI);
       e uoe = PatchProxy.apply(objArray, this, liveLiteMult, "4");
       if (uoe != patchProxyRe) {
       }else {
          tz = this.x;
          if (tz == null) {
             a.S("longConnectManager");
          }
          a uoa = tz.u();
          a.o(uoa, "longConnectManager.liveLongConnection");
          LiveLiteMultiChatPresenterV2 tB = this.B;
          if (tB == null) {
             a.S("liveMultiInteractManager");
          }
          LiveLiteMultiChatPresenterV2 tA = this.A;
          if (tA == null) {
             a.S("rtcManager");
          }
          tz = this.D;
          if (tz == null) {
             a.S("playerService");
          }
          LivePlayerController livePlayerCo = tz.Vc();
          a.o(livePlayerCo, "playerService.livePlayerController");
          e uoe1 = new e(uoa, tB, tA, livePlayerCo, new c(false, true), null);
       }
       LiveLiteMultiChatPresenterV2$onCreate$2 oonCreate$2 = new LiveLiteMultiChatPresenterV2$onCreate$2(this);
       c uoc = PatchProxy.apply(objArray, this, liveLiteMult, "5");
       if (uoc != patchProxyRe) {
       }else {
          uoc = new c(this);
       }
       LiveLiteMultiChatPresenterV2 tG = this.G;
       if (tG == null) {
          a.S("liteGestureService");
       }
       this.v = new e(uoe, oonCreate$2, uoc, tG);
       tG = this.C;
       if (tG == null) {
          a.S("viewProviderService");
       }
       tG.c(LayoutViewType.MultiChatV2, this.v);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatPresenterV2.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.x = p0.a(a.class);
       this.y = p0.a(i.class);
       this.z = p0.a(g.class);
       this.A = p0.a(a.class);
       this.B = p0.a(e.class);
       this.J = p0.a(a.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiChatPresenterV2.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.C = p0.a(n.class);
       this.D = p0.a(d.class);
       this.E = p0.a(a.class);
       this.F = p0.a(a.class);
       this.G = p0.a(LiveLiteGestureService.class);
       this.H = p0.a(e.class);
       this.I = p0.a(m.class);
       return;
    }
}
