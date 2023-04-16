package com.kuaishou.live.core.show.closepage.audience.basicinfo.b;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Runnable;
import f52.h;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.b$a;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.b$b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import lnc.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import f12.d;
import f12.c;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import f52.e;
import erd.g;
import crd.b;
import f42.f;
import androidx.viewpager.widget.ViewPager$i;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import f52.c;
import erd.a;
import t02.a0;
import kq5.b;
import p91.m;
import androidx.fragment.app.c$b;
import lnc.b9;
import ekd.k1;
import com.yxcorp.gifshow.util.rx.RxBus;
import vs5.h;
import com.kwai.framework.model.user.User;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import f52.g;
import erd.o;
import f52.f;
import io.reactivex.internal.functions.Functions;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import m56.g;
import com.kwai.framework.activitycontext.ActivityContext;
import com.trello.rxlifecycle3.android.FragmentEvent;
import f52.d;

public class b extends c	// class@000a34
{
    public a0 A;
    public FragmentEvent B;
    public final Runnable C;
    public final ViewPager$i D;
    public final c$b E;
    public TextView p;
    public TextView q;
    public TextView r;
    public TextView s;
    public BaseFragment t;
    public LiveLottieAnimationView u;
    public b v;
    public d w;
    public LiveStreamFeed x;
    public boolean y;
    public long z;
    public static String sLivePresenterClassName = "LivePlayClosedAutoJumpPresenter";

    public void b(){
       super();
       this.y = false;
       h oh = PatchProxy.apply(null, this, b.class, "8");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h(this);
       }
       this.C = oh;
       this.D = new b$a(this);
       this.E = new b$b(this);
       return;
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_CLOSE;
       lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenter");
       b.P(lIVE_AUDIENC, " onBind");
       if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
          this.p.setVisibility(0);
          this.r.setVisibility(0);
          this.q.getLayoutParams().topMargin = a1.d(0x7f0708f1);
          this.u.getLayoutParams().topMargin = a1.d(0x7f0708f0);
          ConstraintLayout$LayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.i = 0x7f0a22d8;
          layoutParams.k = -1;
          this.p.setLayoutParams(layoutParams);
          this.s.getLayoutParams().topMargin = a1.d(0x7f0708f2);
       }
       u1.a(this);
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity);
       this.w = c.b(activity);
       this.X7(this.t.m().subscribe(new e(this)));
       this.z = 3;
       this.w.i(this.D);
       this.x = this.w.N();
       this.v = this.R8(this.z, this.r, new c(this));
       this.A.Z2.k().c(this.E);
       lIVE_AUDIENC.appendTag("LivePlayClosedAutoJumpPresenter");
       b.P(lIVE_AUDIENC, " onBind complete");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       u1.b(this);
       b9.a(this.v);
       k1.m(this.C);
       k1.n(this);
       b tw = this.w;
       if (tw != null) {
          tw.g(this.D);
       }
       this.A.Z2.k().a(this.E);
       b.P(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenter"), " onUnbind");
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b tx = this.x;
       if (tx != null) {
          RxBus.f.b(new h(tx.mUser.mId, tx.getId()));
       }
       return;
    }
    public final b R8(long p0,TextView p1,a p2){
       if (PatchProxy.isSupport(b.class)) {
          p1 = PatchProxy.applyThreeRefs(Long.valueOf(p0), p1, p2, this, b.class, "6");
          if (p1 != PatchProxyResult.class) {
             return p1;
          }
       }
       b.P(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenter"), " CountDown Start");
       return t.intervalRange(0, (1 + p0), 0, 1, TimeUnit.SECONDS, d.c).map(new g(this, p0)).observeOn(d.a).subscribe(new f(this), Functions.e, p2);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a22b0);
       this.r = m1.f(p0, 0x7f0a22b1);
       this.q = m1.f(p0, 0x7f0a22d8);
       this.s = m1.f(p0, 0x7f0a22ce);
       this.u = m1.f(p0, 0x7f0a22cd);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.A = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.t = this.r8("LIVE_PLAY_CLOSED_FRAGMENT");
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       if (ActivityContext.g().h()) {
          b tB = this.B;
          int i = 0;
          tB = (tB != null && tB == FragmentEvent.START)? 1: null;
          if (tB) {
             this.p.setVisibility(i);
             this.r.setVisibility(i);
             b.P(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenter"), " CountDown reStart");
             this.v = this.R8(this.z, this.r, new d(this));
          }
       }
       return;
    }
}
