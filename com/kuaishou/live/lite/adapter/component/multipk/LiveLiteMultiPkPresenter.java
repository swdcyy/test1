package com.kuaishou.live.lite.adapter.component.multipk.LiveLiteMultiPkPresenter;
import b93.d;
import com.kuaishou.live.lite.adapter.component.multipk.LiveLiteMultiPkPresenter$a;
import or5.d;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa3.b;
import xp5.i;
import k83.c;
import vq5.d;
import vb3.m;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rs1.j;
import k83.b;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import c93.b;
import sz1.e;
import v51.a;
import n91.f;
import d93.a;
import lq5.a;
import e93.b;
import sc3.a;
import cc3.a;
import d93.b;
import ic3.a;
import e83.c;

public final class LiveLiteMultiPkPresenter extends d	// class@001e14
{
    public m A;
    public f B;
    public a C;
    public b D;
    public d E;
    public e F;
    public a G;
    public LiveLiteGestureService H;
    public b I;
    public a J;
    public c K;
    public boolean L;
    public final a M;
    public n v;
    public d w;
    public i x;
    public e y;
    public a z;

    public void LiveLiteMultiPkPresenter(){
       super();
       this.M = new LiveLiteMultiPkPresenter$a(this);
    }
    public static final d c9(LiveLiteMultiPkPresenter p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("liveInfoManager");
       }
       return p0;
    }
    public static final b d9(LiveLiteMultiPkPresenter p0){
       p0 = p0.I;
       if (p0 == null) {
          a.S("liveInteractiveEffectService");
       }
       return p0;
    }
    public static final i e9(LiveLiteMultiPkPresenter p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("liveLogPackageProvider");
       }
       return p0;
    }
    public static final c h9(LiveLiteMultiPkPresenter p0){
       p0 = p0.K;
       if (p0 == null) {
          a.S("liveMultiPkController");
       }
       return p0;
    }
    public static final d j9(LiveLiteMultiPkPresenter p0){
       p0 = p0.E;
       if (p0 == null) {
          a.S("routerManager");
       }
       return p0;
    }
    public static final m k9(LiveLiteMultiPkPresenter p0){
       p0 = p0.A;
       if (p0 == null) {
          a.S("stageChangeNotifyService");
       }
       return p0;
    }
    public void F8(){
       LiveLiteMultiPkPresenter liveLiteMult = LiveLiteMultiPkPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteMult, "4")) {
          return;
       }
       super.F8();
       LiveLiteMultiPkPresenter tH = this.H;
       if (tH == null) {
          a.S("liteGestureService");
       }
       b uob = PatchProxy.apply(objArray, this, liveLiteMult, "5");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this);
       }
       this.K = new c(tH, uob);
       liveLiteMult = this.v;
       if (liveLiteMult == null) {
          a.S("viewProviderService");
       }
       LayoutViewType pK = LayoutViewType.PK;
       LiveLiteMultiPkPresenter tK = this.K;
       if (tK == null) {
          a.S("liveMultiPkController");
       }
       liveLiteMult.c(pK, tK);
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiPkPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       this.w = p0.a(d.class);
       this.x = p0.a(i.class);
       this.y = p0.a(e.class);
       this.z = p0.a(a.class);
       this.B = p0.a(f.class);
       this.E = p0.a(d.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiPkPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(n.class);
       this.A = p0.a(m.class);
       this.C = p0.a(a.class);
       this.D = p0.a(b.class);
       this.G = p0.a(a.class);
       this.H = p0.a(LiveLiteGestureService.class);
       this.I = p0.a(b.class);
       this.J = p0.a(a.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiPkPresenter.class, "3")) {
          return;
       }
       a.p(p0, "register");
       p0.d(a.class, this.M);
       p0.d(a.class, new c());
       return;
    }
}
