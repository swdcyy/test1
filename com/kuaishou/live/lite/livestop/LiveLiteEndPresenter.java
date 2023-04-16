package com.kuaishou.live.lite.livestop.LiveLiteEndPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import java.util.Objects;
import yb3.b;
import sj3.b;
import sj3.l;
import ac3.l;
import ac3.k;
import com.yxcorp.gifshow.util.rx.RxBus;
import vs5.a;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import yb3.a;
import erd.g;
import crd.b;
import c93.b;
import s91.g;
import z1.k;
import d93.a;
import ga1.e;
import com.kwai.video.waynelive.LivePlayerController;

public final class LiveLiteEndPresenter extends d	// class@0009f9
{
    public LivePlayerController v;
    public l w;
    public b x;

    public void LiveLiteEndPresenter(){
       super();
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEndPresenter.class, "3")) {
          return;
       }
       super.F8();
       LiveLiteEndPresenter tx = this.x;
       if (tx == null) {
          a.S("liveLiteServerExceptionService");
       }
       Activity activity = this.getActivity();
       a.o(activity, "activity");
       LiveLiteEndPresenter tv = this.v;
       if (tv == null) {
          a.S("livePlayerController");
       }
       LiveLiteEndPresenter tw = this.w;
       if (tw == null) {
          a.S("livePlayerReconnectService");
       }
       Objects.requireNonNull(tx);
       if (!PatchProxy.applyVoidThreeRefs(activity, tv, tw, tx, b.class, "1")) {
          a.p(activity, "activity");
          a.p(tv, "livePlayerController");
          a.p(tw, "livePlayerReconnectService");
          tx.d = activity;
          tx.e = tv;
          tx.f = tw;
          tw.b(tx.h);
          b l = tx.l;
          if (l != null) {
             l.sb(tx.i);
          }
          tx.g = RxBus.f.g(a.class, RxBus$ThreadMode.MAIN).subscribe(new a(tx));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveLiteEndPresenter.class, "4")) {
          return;
       }
       LiveLiteEndPresenter tx = this.x;
       if (tx == null) {
          a.S("liveLiteServerExceptionService");
       }
       tx.destroy();
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndPresenter.class, "1")) {
          return;
       }
       a.p(p0, "provider");
       p0 = p0.c(g.class).get();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.kuaishou.live.lite.livestop.LiveLiteServerExceptionManagerImpl");
       this.x = p0;
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteEndPresenter.class, "2")) {
          return;
       }
       a.p(p0, "provider");
       LivePlayerController livePlayerCo = p0.a(e.class).Vc();
       a.o(livePlayerCo, "provider.get\(LivePlayerS¡­ava\).livePlayerController");
       this.v = livePlayerCo;
       this.w = p0.a(l.class);
       return;
    }
}
