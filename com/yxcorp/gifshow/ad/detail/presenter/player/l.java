package com.yxcorp.gifshow.ad.detail.presenter.player.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.player.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.util.rx.RxBus;
import h46.q;
import brd.t;
import t45.d;
import brd.z;
import d19.m;
import erd.g;
import crd.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import hn6.c;
import lnc.x6;
import lnc.y6;
import lnc.b9;
import java.lang.StringBuilder;
import yx.j0;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import d19.n;
import com.yxcorp.gifshow.ad.detail.presenter.player.k;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.ad.detail.presenter.player.l$b;
import r16.d;
import com.yxcorp.gifshow.entity.QPhoto;
import nm6.d;
import android.os.Bundle;
import jkd.c;
import om6.f;
import com.yxcorp.gifshow.entity.QPreInfo;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import de5.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class l extends PresenterV2	// class@001688
{
    public QPhoto p;
    public PhotoDetailParam q;
    public QPreInfo r;
    public a s;
    public GifshowActivity t;
    public BaseFragment u;
    public SlidePlayViewModel v;
    public b w;
    public boolean x;
    public final a y;
    public static long z;

    public void l(){
       super();
       this.x = false;
       this.y = new l$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       this.t = this.getActivity();
       this.X7(RxBus.f.f(q.class).observeOn(d.a).subscribe(new m(this)));
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.u.getParentFragment());
       this.v = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.u, this.y);
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, l.class, "8")) {
          return;
       }
       c uoc = y6.r(c.class);
       if (uoc != null) {
          uoc.Ts();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "7")) {
          return;
       }
       l tv = this.v;
       if (tv != null) {
          tv.D(this.u, this.y);
       }
       b9.a(this.w);
       return;
    }
    public final void P8(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SourcePhotoDownload", "开始触发下载 "+p0, objArray);
       l tw = this.w;
       if (tw != null) {
          b9.a(tw);
       }
       this.w = y6.s(c.class, LoadPolicy.DIALOG).K().R(new n(this, p0), k.b);
       return;
    }
    public final void R8(q p0){
       d uod;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("SourcePhotoDownload", "开始执行 "+p0+"，mIsAttached = "+this.x, objArray);
       if (this.x != null && ActivityContext.g().e() == this.t) {
          l$b uob = new l$b(this);
          int i = p0.a();
          if (i != 1) {
             if (i != 2) {
                if (i == 6) {
                   uod = new d();
                   uod.p(true);
                   uod.m(true);
                   uod.n(p0.c());
                   uod.l(uob);
                   y6.r(d.class).md(this.t, p0.d(), uod);
                }
             }else {
                uod = new d();
                uod.p(true);
                uod.t(this.r);
                uod.m(true);
                uod.n(p0.c());
                uod.l(uob);
                y6.r(f.class).uI(this.t, this.p, uod);
             }
          }else {
             uod = new d();
             uod.p(true);
             uod.t(this.r);
             uod.m(true);
             uod.n(p0.c());
             uod.l(uob);
             y6.r(c.class).vd(this.t, this.p, uod);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.s8(QPreInfo.class);
       this.s = this.s8(a.class);
       this.u = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
