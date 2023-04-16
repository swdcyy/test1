package com.kuaishou.live.preview.item.presenter.ad.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mxb.h;
import com.kuaishou.live.preview.item.presenter.ad.g$a;
import com.kuaishou.live.preview.item.presenter.ad.g$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import wkd.b;
import mxb.f0;
import com.kwai.framework.model.feed.BaseFeed;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import wk3.b;
import wk3.f;
import ekd.y0;
import el3.n;
import java.lang.Runnable;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlay$b;
import com.yxcorp.gifshow.autoplay.live.g;
import brd.t;
import jl3.b;
import com.kuaishou.live.preview.item.presenter.ad.e;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class g extends PresenterV2	// class@000e12
{
    public final LiveAutoPlay$b A;
    public QPhoto p;
    public b q;
    public BaseFragment r;
    public g s;
    public f t;
    public SlidePlayViewModel u;
    public final h v;
    public int w;
    public int x;
    public y0 y;
    public final b z;
    public static final String B = "g";

    public void g(){
       super();
       this.v = new h();
       this.x = 0;
       this.z = new g$a(this);
       this.A = new g$b(this);
    }
    public void E8(){
       g og = g.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, og, "2")) {
          return;
       }
       this.v.c();
       if (k.B(this.p) == null) {
          return;
       }
       b.a(-762347696).r1(this.p.mEntity, "key_ad_live_watching_monitor", this.v);
       this.u = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.t.f3(this.z);
       if (this.y == null && !PatchProxy.applyVoid(objArray, this, og, "5")) {
          this.y = new y0(500, new n(this));
       }
       if (a.t().d("adSimplePlayNewReport", false)) {
          this.s.P(this.A);
       }else if(PatchProxy.applyVoid(objArray, this, og, "3")){
          this.X7(this.q.c().distinctUntilChanged().subscribe(new e(this), Functions.e));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.s.Z(this.A);
       this.t.I1(this.z);
       this.R8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       this.v.d();
       g ty = this.y;
       if (ty != null) {
          ty.d();
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       this.v.e();
       g ty = this.y;
       if (ty != null) {
          ty.e();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("LIVE_PLAY_STATE");
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.r8("LIVE_SIMPLE_PLAY_MODULE");
       this.t = this.r8("LIVE_PREVIEW_LIFECYCLE_SERVICE");
       return;
    }
}
