package com.kuaishou.live.preview.item.presenter.c0;
import k51.c;
import dl3.y0;
import com.kuaishou.live.preview.item.presenter.c0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import vs5.h;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.preview.item.presenter.b0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jl3.b;
import dl3.v0;
import io.reactivex.internal.functions.Functions;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import lnc.b9;
import java.lang.Runnable;
import ekd.k1;
import ll3.o;
import com.yxcorp.gifshow.entity.QPhoto;
import mk3.b;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import k2b.u1;
import android.view.View;
import com.yxcorp.utility.n;
import java.util.concurrent.TimeUnit;
import dl3.w0;
import erd.o;
import dl3.u0;
import dl3.t0;
import erd.a;
import java.lang.Long;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import ekd.m1;
import android.view.ViewStub;
import im8.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rf5.m;
import wk3.f;

public class c0 extends c	// class@000e18
{
    public long A;
    public int B;
    public SlidePlayViewModel C;
    public boolean D;
    public final Runnable E;
    public final a F;
    public b p;
    public QPhoto q;
    public f r;
    public BaseFragment s;
    public LiveStreamModel t;
    public f u;
    public ViewStub v;
    public b w;
    public View x;
    public TextView y;
    public m z;

    public void c0(){
       super();
       this.E = new y0(this);
       this.F = new c0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "3")) {
          return;
       }
       LiveStreamModel mPreviewLive = this.t.mPreviewLiveEndCountDownSeconds;
       if (mPreviewLive - 1 <= 0) {
          mPreviewLive = 10;
       }
       this.A = mPreviewLive;
       this.X7(RxBus.f.f(h.class).observeOn(d.a).subscribe(new b0(this)));
       this.X7(this.p.c().distinctUntilChanged().subscribe(new v0(this), Functions.e));
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.s.getParentFragment());
       this.C = slidePlayVie;
       slidePlayVie.P(this.s, this.F);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "6")) {
          return;
       }
       this.P8();
       c0 tC = this.C;
       if (tC != null) {
          tC.D(this.s, this.F);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "13")) {
          return;
       }
       b9.a(this.w);
       k1.m(this.E);
       return;
    }
    public final void R8(){
       c0 ts;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c0.class, "10")) {
          return;
       }
       boolean b = true;
       if (this.D == null) {
          ts = this.s;
          c0 tq = this.q;
          if (!PatchProxy.applyVoidTwoRefs(ts, tq, objArray, o.class, "1")) {
             u1.B0(new ShowMetaData().setType(b).setElementPackage(o.b(tq, objArray, objArray, objArray, objArray)).setFeedLogCtx(tq.getFeedLogCtx()).setContentPackage(o.d(tq)).setLogPage(ts));
          }
       }
       this.D = b;
       ts = this.x;
       if (ts != null) {
          View[] viewArray = new View[b];
          viewArray[0] = ts;
          n.Z(8, viewArray);
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "7")) {
          return;
       }
       if (this.y != null && this.w == null) {
          this.w = t.intervalRange(0, (this.A + 1), 0, 1, TimeUnit.SECONDS, d.c).map(new w0(this)).observeOn(d.a).subscribe(new u0(this), Functions.e, new t0(this));
       }
       return;
    }
    public final void V8(long p0){
       c0 uoc0 = c0.class;
       if (PatchProxy.isSupport(uoc0) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc0, "14")) {
          return;
       }
       uoc0 = this.y;
       if (uoc0 != null && p0 > 0) {
          Object[] objArray = new Object[]{Long.valueOf(p0)};
          uoc0.setText(String.format(a1.p(R.string.arg_RES_7f1038c1), objArray));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a25a6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_PLAY_STATE");
       this.q = this.q8(QPhoto.class);
       this.r = this.x8("LIVE_ANCHOR_END");
       this.s = this.r8("DETAIL_FRAGMENT");
       this.z = this.t8("SLIDE_PLAY_DETAIL_PROFILE_PAGE_SWIPE_SWITCH");
       this.t = this.q8(LiveStreamModel.class);
       this.u = this.r8("LIVE_PREVIEW_LIFECYCLE_SERVICE");
       return;
    }
}
