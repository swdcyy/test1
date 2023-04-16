package com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController;
import qs2.b;
import com.kuaishou.live.viewcontroller.ViewController;
import qu2.a;
import co2.f2;
import qs2.a;
import ts2.f;
import com.kuaishou.live.core.voiceparty.playway.video.camera.CameraRequestApi;
import ev2.k;
import msd.a;
import hf3.a;
import brd.t;
import androidx.fragment.app.c;
import w02.g;
import iv2.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$b;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$a;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceCameraLifecycleLogic;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import e17.s;
import ev2.n;
import dp1.d;
import ev2.b;
import ev2.l;
import qs2.d;
import com.kuaishou.livestream.message.nano.SCMicSeatsVideoOpenInvitation;
import lf3.g;
import java.util.Objects;
import androidx.fragment.app.KwaiDialogFragment;
import va1.m;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$closeVideo$1;
import msd.l;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$closeVideo$2;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import cjd.e;
import erd.o;
import ev2.d;
import ev2.e;
import crd.a;
import krd.a;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.List;
import java.util.Collection;
import ts2.d;
import ts2.e;
import xa1.f;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$openVideo$1;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$openVideo$2;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$openVideo$3;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$openVideo$4;
import ev2.f;
import ev2.g;
import com.kuaishou.live.core.voiceparty.playway.video.camera.AudienceVideoCameraControlViewController$refuseOpenCameraAsGuest$1;
import ev2.h;
import ev2.i;

public final class AudienceVideoCameraControlViewController extends ViewController implements b	// class@0018cb
{
    public final b A;
    public VoicePartyOpenVideoInvitationDialogFragment j;
    public final g k;
    public final b l;
    public boolean m;
    public n n;
    public final AudienceCameraLifecycleLogic o;
    public final a p;
    public final f2 q;
    public final a r;
    public final f s;
    public final CameraRequestApi t;
    public final k u;
    public final a v;
    public final a w;
    public final t x;
    public final c y;
    public final g z;

    public void AudienceVideoCameraControlViewController(a p0,f2 p1,a p2,f p3,CameraRequestApi p4,k p5,a p6,a p7,t p8,c p9,g p10,b p11){
       a.p(p0, "liveBasicContext");
       a.p(p1, "voicePartyContext");
       a.p(p2, "micManageService");
       a.p(p3, "micSeatStateService");
       a.p(p4, "cameraRequestApi");
       a.p(p5, "cameraController");
       a.p(p6, "prettifyLoggerManagerGetter");
       a.p(p7, "liveLongConnection");
       a.p(p8, "selfOpenVideoInfo");
       a.p(p9, "fragmentManager");
       a.p(p10, "eventBusService");
       a.p(p11, "logger");
       super();
       this.p = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.v = p6;
       this.w = p7;
       this.x = p8;
       this.y = p9;
       this.z = p10;
       this.A = p11;
       this.k = new AudienceVideoCameraControlViewController$b(this);
       this.l = p8.subscribe(new AudienceVideoCameraControlViewController$a(this));
       this.o = new AudienceCameraLifecycleLogic(p8, p3, p4, p10);
    }
    public boolean F1(int p0,VoicePartyMicSeatData p1){
       String userId;
       AudienceVideoCameraControlViewController uAudienceVid = AudienceVideoCameraControlViewController.class;
       if (PatchProxy.isSupport(uAudienceVid)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uAudienceVid, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p1, "micSeatData");
       boolean b = false;
       String str = "it";
       if (p0 != 31) {
          switch (p0){
              case 23:
                userId = p1.getUserId();
                if (userId != null) {
                   a.o(userId, str);
                   this.Y2(userId, b);
                }
                break;
              case 24:
                userId = p1.getUserId();
                if (userId != null) {
                   a.o(userId, str);
                   this.V2(userId);
                }
                break;
              case 25:
                userId = p1.getUserId();
                if (userId != null) {
                   a.o(userId, str);
                   if (!PatchProxy.applyVoidOneRefs(userId, this, uAudienceVid, "6") && (this.W2(userId) && this.X2(userId))) {
                      this.u.switchCamera();
                   }
                }
                break;
              default:
          }
          return b;
       }else {
          userId = p1.getUserId();
          if (userId != null) {
             a.o(userId, str);
             if (PatchProxy.applyVoidOneRefs(userId, this, uAudienceVid, "5") || (this.W2(userId) && this.X2(userId))) {
                AudienceVideoCameraControlViewController tm = this.m;
                boolean b1 = this.u.d();
                if (tm != null) {
                   this.V2(userId);
                   s.h(a1.p(R.string.arg_RES_7f1050f5));
                }
                AudienceVideoCameraControlViewController tn = this.n;
                if (tn != null) {
                   tn.b();
                }
                n on = new n(this.p, this.q, this.u, this.v.invoke(), this.y, new b(this, tm));
                this.n = tn;
                a.m(tn);
                tn.c(tm, b1);
             }
          }
       }
    label_006c :
       b = true;
       goto label_00d0 ;
    }
    public void F2(){
       AudienceVideoCameraControlViewController uAudienceVid = AudienceVideoCameraControlViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAudienceVid, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uAudienceVid, "3")) {
          this.r.y(this);
       }
       this.w.u0(861, SCMicSeatsVideoOpenInvitation.class, this.k);
       uAudienceVid = this.o;
       Objects.requireNonNull(uAudienceVid);
       if (!PatchProxy.applyVoid(objArray, uAudienceVid, AudienceCameraLifecycleLogic.class, "1")) {
          uAudienceVid.g.a(uAudienceVid);
       }
       return;
    }
    public void J2(){
       AudienceVideoCameraControlViewController uAudienceVid = AudienceVideoCameraControlViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAudienceVid, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uAudienceVid, "4")) {
          this.r.G(this);
       }
       this.w.o(861, this.k);
       m.b(this.j);
       this.l.dispose();
       uAudienceVid = this.n;
       if (uAudienceVid != null) {
          uAudienceVid.b();
       }
       this.n = objArray;
       uAudienceVid = this.o;
       Objects.requireNonNull(uAudienceVid);
       if (!PatchProxy.applyVoid(objArray, uAudienceVid, AudienceCameraLifecycleLogic.class, "2")) {
          uAudienceVid.g.b(uAudienceVid);
          uAudienceVid.c = false;
          uAudienceVid.d.dispose();
       }
       return;
    }
    public final void V2(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVideoCameraControlViewController.class, "7")) {
          return;
       }
       boolean b = this.W2(p0);
       if (b && this.X2(p0)) {
          this.u.b();
          this.t.b(AudienceVideoCameraControlViewController$closeVideo$1.INSTANCE);
       }else if(!b && this.r.b()){
          AudienceVideoCameraControlViewController tt = this.t;
          AudienceVideoCameraControlViewController$closeVideo$2 iNSTANCE = AudienceVideoCameraControlViewController$closeVideo$2.INSTANCE;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoidTwoRefs(p0, iNSTANCE, tt, CameraRequestApi.class, "2")) {
             a.p(p0, "userId");
             a.p(iNSTANCE, "callback");
             b uob = LiveVoicePartyApi.b().l(tt.d.invoke(), tt.e, p0).map(new e()).subscribe(new d(iNSTANCE), new e(iNSTANCE));
             a.o(uob, "LiveVoicePartyApi\n      ¡­ult.failure\(it\)\)\n      }\)");
             a.b(tt.a, uob);
          }
       }
       return;
    }
    public final boolean W2(String p0){
       QCurrentUser obj = PatchProxy.applyOneRefs(p0, this, AudienceVideoCameraControlViewController.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = QCurrentUser.me();
       a.o(obj, "QCurrentUser.me\(\)");
       return a.g(obj.getId(), p0);
    }
    public final boolean X2(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AudienceVideoCameraControlViewController.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.a(this.s.b(), p0) != null)? true: false;
       return b;
    }
    public final void Y2(String p0,boolean p1){
       AudienceVideoCameraControlViewController uAudienceVid = AudienceVideoCameraControlViewController.class;
       if (PatchProxy.isSupport(uAudienceVid) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uAudienceVid, "8")) {
          return;
       }
       boolean b = this.W2(p0);
       if (b && this.X2(p0)) {
          this.u.a();
          this.t.e(new f(true, new AudienceVideoCameraControlViewController$openVideo$1(this), new AudienceVideoCameraControlViewController$openVideo$2(this)), new AudienceVideoCameraControlViewController$openVideo$3(this, p1));
       }else if(!b && this.r.b()){
          AudienceVideoCameraControlViewController tt = this.t;
          AudienceVideoCameraControlViewController$openVideo$4 iNSTANCE = AudienceVideoCameraControlViewController$openVideo$4.INSTANCE;
          Objects.requireNonNull(tt);
          if (!PatchProxy.applyVoidTwoRefs(p0, iNSTANCE, tt, CameraRequestApi.class, "3")) {
             a.p(p0, "userId");
             a.p(iNSTANCE, "callback");
             b uob = LiveVoicePartyApi.b().G0(tt.d.invoke(), tt.e, p0).map(new e()).subscribe(new f(iNSTANCE), new g(iNSTANCE));
             a.o(uob, "LiveVoicePartyApi\n      ¡­ult.failure\(it\)\)\n      }\)");
             a.b(tt.a, uob);
          }
       }
       return;
    }
    public final void Z2(){
       if (PatchProxy.applyVoid(null, this, AudienceVideoCameraControlViewController.class, "9")) {
          return;
       }
       AudienceVideoCameraControlViewController tt = this.t;
       boolean b = false;
       AudienceVideoCameraControlViewController$refuseOpenCameraAsGuest$1 iNSTANCE = AudienceVideoCameraControlViewController$refuseOpenCameraAsGuest$1.INSTANCE;
       Objects.requireNonNull(tt);
       CameraRequestApi uCameraReque = CameraRequestApi.class;
       if (!PatchProxy.isSupport(uCameraReque) || !PatchProxy.applyVoidTwoRefs(Boolean.FALSE, iNSTANCE, tt, uCameraReque, "4")) {
          a.p(iNSTANCE, "callback");
          b uob = LiveVoicePartyApi.b().h0(tt.d.invoke(), tt.e, b).map(new e()).subscribe(new h(iNSTANCE), new i(iNSTANCE));
          a.o(uob, "LiveVoicePartyApi.voiceP¡­ult.failure\(it\)\)\n      }\)");
          a.b(tt.a, uob);
       }
       return;
    }
}
