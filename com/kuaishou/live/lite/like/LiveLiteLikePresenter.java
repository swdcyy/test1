package com.kuaishou.live.lite.like.LiveLiteLikePresenter;
import b93.d;
import crd.a;
import java.lang.Boolean;
import java.lang.Object;
import mrd.a;
import wb3.m;
import com.kuaishou.live.lite.like.LiveLiteLikePresenter$a;
import com.kuaishou.live.lite.like.LiveLiteLikePresenter$b;
import java.lang.Void;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import xp5.i;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import com.kuaishou.live.lite.like.c;
import or5.d;
import v51.a;
import ds5.a;
import ga1.d;
import la3.a;
import com.kuaishou.live.lite.like.h;
import wb3.l;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import py1.a;
import com.kuaishou.live.lite.sidebar.e;
import ok.o;
import wb3.c;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.like.j;
import ec3.f;
import msd.a;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import brd.t;
import td3.o;
import wb3.n;
import com.kuaishou.live.lite.like.i;
import erd.g;
import crd.b;
import c93.b;
import d93.a;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import vb3.n;
import d93.b;
import lq5.a;

public class LiveLiteLikePresenter extends d	// class@0009e9
{
    public LiveLiteGestureService A;
    public e B;
    public a C;
    public n D;
    public d E;
    public a F;
    public LiveLiteScatterLoadManager G;
    public b H;
    public j I;
    public h J;
    public final a K;
    public final a L;
    public final a M;
    public final c N;
    public final d O;
    public d v;
    public o w;
    public i x;
    public a y;
    public a z;

    public void LiveLiteLikePresenter(){
       super();
       this.K = new a();
       this.L = a.h(Boolean.FALSE);
       this.M = new m(this);
       this.N = new LiveLiteLikePresenter$a(this);
       this.O = new LiveLiteLikePresenter$b(this);
    }
    public static boolean c9(LiveLiteLikePresenter p0,Void p1){
       boolean b;
       Objects.requireNonNull(p0);
       p1 = PatchProxy.applyOneRefs(p1, p0, LiveLiteLikePresenter.class, "10");
       if (p1 != PatchProxyResult.class) {
          b = p1.booleanValue();
       }else if(!QCurrentUser.ME.isLogined()){
          y.a(p0.getContext(), p0.x.getUrl(), "live_like", 39, a.a().a().getString(R.string.arg_RES_7f103079), p0.v.j0(), null, null, null);
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public void F8(){
       LiveLiteLikePresenter liveLiteLike = LiveLiteLikePresenter.class;
       if (PatchProxy.applyVoid(null, this, liveLiteLike, "4")) {
          return;
       }
       super.F8();
       c uoc = new c(this.v, this.C, this.y, this.x, this.E, this.F);
       if (!PatchProxy.applyVoidOneRefs(v1, this, liveLiteLike, "9") && !this.L.i().booleanValue()) {
          h oh = new h(v1, this.B, this.E, new l(this), this.N, this.z.qe(), this.L);
          this.J = liveLiteLike;
          this.P8().xg(this.J);
       }
       j oj = new j(this, v1);
       if (f.h()) {
          this.G.W1("LiveLiteLikePresenter::initController", oj);
       }else {
          oj.invoke();
       }
       this.K.c(this.w.T3().subscribe(new n(this), i.b));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteLikePresenter.class, "6")) {
          return;
       }
       this.K.dispose();
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLikePresenter.class, "2")) {
          return;
       }
       this.C = p0.a(a.class);
       this.w = p0.a(o.class);
       this.y = p0.a(a.class);
       this.v = p0.a(d.class);
       this.x = p0.a(i.class);
       this.z = p0.a(a.class);
       this.G = p0.a(LiveLiteScatterLoadManager.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLikePresenter.class, "3")) {
          return;
       }
       this.A = p0.a(LiveLiteGestureService.class);
       this.B = p0.a(e.class);
       this.D = p0.a(n.class);
       this.E = p0.a(d.class);
       this.F = p0.a(a.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteLikePresenter.class, "1")) {
          return;
       }
       p0.d(a.class, this.M);
       return;
    }
}
