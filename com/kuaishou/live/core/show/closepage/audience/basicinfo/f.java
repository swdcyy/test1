package com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Runnable;
import f52.p;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f$a;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f$b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.c;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.d;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import f12.d;
import f12.c;
import androidx.viewpager.widget.ViewPager$i;
import e12.a;
import brd.t;
import xl8.b;
import f52.k;
import erd.g;
import crd.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import f52.l;
import lnc.b9;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Set;
import java.lang.Boolean;
import o02.f;
import o02.e;
import cjd.e;
import erd.o;
import f52.m;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.e;
import lnc.a1;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import f52.j;
import java.lang.Long;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import f52.o;
import f52.n;
import io.reactivex.internal.functions.Functions;
import erd.a;
import ekd.k1;
import java.lang.CharSequence;
import ekd.m1;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class f extends c	// class@000a3a
{
    public boolean A;
    public b B;
    public b C;
    public List D;
    public final Runnable E;
    public final a F;
    public final ViewPager$i G;
    public BaseFragment p;
    public a0 q;
    public d r;
    public b s;
    public TextView t;
    public TextView u;
    public TextView v;
    public TextView w;
    public LiveLottieAnimationView x;
    public long y;
    public boolean z;
    public static String sLivePresenterClassName = "LivePlayClosedAutoJumpPresenterV2";

    public void f(){
       super();
       p op = PatchProxy.apply(null, this, f.class, "8");
       if (op != PatchProxyResult.class) {
       }else {
          op = new p(this);
       }
       this.E = op;
       this.F = new f$a(this);
       this.G = new f$b(this);
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       LiveLogTag lIVE_AUDIENC = LiveLogTag.LIVE_AUDIENCE_CLOSE;
       String str = "LivePlayClosedAutoJumpPresenterV2";
       lIVE_AUDIENC.appendTag(str);
       b.P(lIVE_AUDIENC, " onBind");
       long l = (long)k0.b(this.q.c.mEntity, c.a, d.a).or(Integer.valueOf(0)).intValue();
       this.y = l;
       if (l <= 0) {
          b.P(lIVE_AUDIENC.appendTag(str), "countDownTimeSecond == 0, onBind finished");
          return;
       }else {
          Activity activity = this.getActivity();
          Objects.requireNonNull(activity);
          d uod = c.b(activity);
          this.r = uod;
          uod.i(this.G);
          this.r.O(this.F);
          this.X7(this.s.observable().subscribe(new k(this)));
          this.X7(this.p.m().subscribe(new l(this)));
          this.P8();
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f tr = this.r;
       if (tr != null) {
          tr.B(this.F);
          this.r.g(this.G);
       }
       this.S8();
       b9.a(this.C);
       b.P(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenterV2"), " onUnbind");
       return;
    }
    public void P8(){
       b uob;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "10")) {
          return;
       }
       boolean b = true;
       if (this.r.f() > b && this.z == null) {
          f tq = this.q;
          if (!tq.p.mInterceptAutoJumpFeedSet.contains(tq.c.mEntity.getGrootId()) && !this.s.a().booleanValue()) {
             if (!PatchProxy.applyVoid(objArray, this, uof, "14")) {
                tq = this.C;
                if (tq == null || tq.isDisposed()) {
                   this.C = e.a().r(this.q.c.getExpTag(), this.q.c.getLiveStreamId(), this.q.c.getUserId()).map(new e()).subscribe(new m(this), e.b);
                }
             }
             this.z = b;
             if (!PatchProxy.applyVoid(objArray, this, uof, "11") && this.A == null) {
                this.A = b;
                if (!PatchProxy.applyVoid(objArray, this, uof, "6")) {
                   this.R8(this.v, a1.d(R.dimen.arg_RES_7f0708f1));
                   this.R8(this.x, a1.d(R.dimen.arg_RES_7f0708f0));
                   this.R8(this.w, a1.d(R.dimen.arg_RES_7f0708f2));
                   ConstraintLayout$LayoutParams layoutParams1 = this.t.getLayoutParams();
                   layoutParams1.i = 0x7f0a22d8;
                   layoutParams1.k = -1;
                   this.t.setLayoutParams(layoutParams1);
                }
                if (!PatchProxy.applyVoid(objArray, this, uof, "12")) {
                   this.t.setTextColor(a1.a(R.color.arg_RES_7f0607d6));
                   this.t.setTextSize(b, 13.00f);
                   this.u.setTextColor(a1.a(R.color.arg_RES_7f0607c5));
                   this.u.setTextSize(b, 13.00f);
                   ViewGroup$LayoutParams layoutParams = this.u.getLayoutParams();
                   if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                      layoutParams.rightMargin = a1.d(0x7f07031b);
                   }
                   this.u.setLayoutParams(layoutParams);
                }
             }
          label_0123 :
             this.V8(this.y);
             View[] viewArray = new View[]{this.t,this.u};
             n.Z(0, viewArray);
             f ty = this.y;
             j oj = new j(this);
             if (PatchProxy.isSupport(uof)) {
                uob = PatchProxy.applyTwoRefs(Long.valueOf(ty), oj, this, uof, "5");
                if (uob != PatchProxyResult.class) {
                label_018d :
                   this.B = uob;
                }
             }
             b.P(LiveLogTag.LIVE_AUDIENCE_CLOSE.appendTag("LivePlayClosedAutoJumpPresenterV2"), " CountDown Start");
             uob = t.intervalRange(0, (1 + ty), 0, 1, TimeUnit.SECONDS, d.c).map(new o(ty)).observeOn(d.a).subscribe(new n(this), Functions.e, oj);
             goto label_018d ;
          }
       }
       return;
    }
    public final void R8(View p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "7")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
          layoutParams.topMargin = p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, f.class, "9")) {
          return;
       }
       this.z = false;
       View[] viewArray = new View[]{this.t,this.u};
       n.Z(4, viewArray);
       b9.a(this.B);
       k1.m(this.E);
       return;
    }
    public final void V8(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uof, "13")) {
          return;
       }
       Object[] objArray = new Object[]{Long.valueOf(p0)};
       this.u.setText(String.format("%ds", objArray));
       this.t.setText(a1.p(R.string.arg_RES_7f1020aa));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a22b0);
       this.u = m1.f(p0, 0x7f0a22b1);
       this.v = m1.f(p0, 0x7f0a22d8);
       this.w = m1.f(p0, 0x7f0a22ce);
       this.x = m1.f(p0, 0x7f0a22cd);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.p = this.r8("LIVE_PLAY_CLOSED_FRAGMENT");
       this.q = this.q8(a0.class);
       this.s = this.r8("LIVE_SIDE_BAR_OPEN_STATUS");
       return;
    }
}
