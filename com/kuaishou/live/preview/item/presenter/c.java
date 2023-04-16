package com.kuaishou.live.preview.item.presenter.c;
import k51.c;
import com.kuaishou.live.preview.item.presenter.c$a;
import com.kuaishou.live.preview.item.presenter.c$b;
import dl3.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import vy6.a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$a;
import com.yxcorp.gifshow.autoplay.live.g;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import dl3.f;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import w41.a;
import dl3.e;
import eoc.f;
import dl3.b;
import dl3.d;
import com.kuaishou.live.preview.item.presenter.b;
import mk3.a;
import dl3.c;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import ul3.a;
import ekd.k1;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ll3.k;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.android.live.model.LivePreviewModel;
import com.kuaishou.android.live.model.LivePreviewAutoEnterModel;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.preview.item.presenter.a;
import dl3.h;
import java.lang.Math;
import java.lang.Runnable;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import dl3.g;
import rk3.h$b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hl3.b;
import io.reactivex.subjects.PublishSubject;

public class c extends c	// class@000e19
{
    public SlidePlayViewModel A;
    public long B;
    public b C;
    public final a D;
    public final ViewPager$i E;
    public final LiveAutoPlay$a F;
    public BaseFragment p;
    public b q;
    public QPhoto r;
    public g s;
    public PublishSubject t;
    public PublishSubject u;
    public a v;
    public h$b w;
    public boolean x;
    public boolean y;
    public b z;

    public void c(){
       super();
       this.B = -1;
       this.D = new c$a(this);
       this.E = new c$b(this);
       this.F = new a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.p.getParentFragment());
       this.A = slidePlayVie;
       if (slidePlayVie == null) {
          return;
       }
       slidePlayVie.i(this.E);
       this.A.P(this.p, this.D);
       this.s.N(this.F);
       this.X7(this.p.m().subscribe(new f(this), Functions.e));
       this.X7(f.a(a.class, new e(this)));
       c tt = this.t;
       if (tt != null) {
          this.X7(tt.subscribe(new b(this)));
       }
       this.X7(this.v.a(new d(this), b.b));
       this.X7(this.u.subscribe(new c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (this.A == null) {
          return;
       }
       this.P8(true);
       this.A.g(this.E);
       this.A.D(this.p, this.D);
       this.s.W(this.F);
       return;
    }
    public void P8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "6")) {
          return;
       }
       if (p0) {
          this.Y8(a.b(this.r));
          this.B = -1;
       }
       k1.n(this);
       b9.a(this.z);
       this.z = null;
       return;
    }
    public final int R8(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "11");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.r;
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, k.class, "2");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else if(!k.d(obj)){
          l = 0x7fffffff;
       }else {
          l = obj.mEntity.mLiveStreamModel.mLivePreviewModel.mLivePreviewAutoEnterModel.mDelayedAutoEnterMs;
       }
       return (int)(l / 1000);
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       if (this.r.isAd()) {
          i0.a().e(283, this.r.mEntity).d(a.b).a();
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.P8(true);
       if (!this.W8()) {
          return;
       }
       k1.s(new h(this), this, Math.max(k.b(this.r), 0));
       return;
    }
    public final boolean W8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, c.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.x != null && this.y != null) {
          obj = this.r.getLiveStreamId();
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, k.class, "7");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): k.a.contains(obj);
          if (!b && this.s.isPlaying()) {
             b = true;
          label_0048 :
             return b;
          }
       }
    label_0047 :
       b = false;
       goto label_0048 ;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       b9.a(this.z);
       if (!this.W8()) {
          return;
       }
       long l = k.b(this.r) / 1000;
       this.B = l;
       c uoc = null;
       long l1 = (l - uoc > 0)? l: uoc;
       this.z = t.intervalRange(l1, (((long)this.R8() - this.B) + 1), 0, 1, TimeUnit.SECONDS).observeOn(d.a).subscribe(new g(this));
       return;
    }
    public final void Y8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       this.w.a(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_SIMPLE_PLAY_MODULE");
       this.r = this.q8(QPhoto.class);
       this.p = this.r8("DETAIL_FRAGMENT");
       this.q = this.r8("LIVE_SIMPLE_ENTER_LIVE_SERVICE");
       this.t = this.t8("LIVE_SIMPLE_NEGATIVE_FEEDBACK_DIALOG_PUBLISHER");
       this.v = this.r8("LIVE_SIMPLE_PLAY_BOTTOM_CARD_OBSERVER");
       this.u = this.t8("Live_SIMPLE_ENTER_ACTION_PUBLISHER");
       this.w = this.r8("LIVE_SIMPLE_PLAY_ENTER_GUIDE_SERVICE");
       return;
    }
}
