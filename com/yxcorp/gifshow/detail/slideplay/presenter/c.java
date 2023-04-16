package com.yxcorp.gifshow.detail.slideplay.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e7a.m;
import com.yxcorp.gifshow.detail.slideplay.presenter.c$a;
import com.yxcorp.gifshow.detail.slideplay.presenter.c$b;
import com.yxcorp.gifshow.detail.slideplay.presenter.c$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import com.kwai.framework.player.multisource.e;
import p5a.c;
import gc6.k;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import io.reactivex.subjects.PublishSubject;
import e7a.n;
import java.lang.Runnable;
import ekd.s1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c extends PresenterV2	// class@001844
{
    public a p;
    public QPhoto q;
    public BaseFragment r;
    public SlidePlayViewModel s;
    public String t;
    public MilanoContainerEventBus u;
    public final IMediaPlayer$OnInfoListener v;
    public final e w;
    public final k x;
    public final a y;

    public void c(){
       super();
       this.v = new m(this);
       this.w = new c$a(this);
       this.x = new c$b(this);
       this.y = new c$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c tp = this.p;
       if (tp != null) {
          tp.getPlayer().addOnInfoListener(this.v);
          this.p.getPlayer().d(this.w);
          this.p.getPlayer().c(this.x);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.s = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.r, this.y);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       c tp = this.p;
       if (tp != null) {
          tp.getPlayer().removeOnInfoListener(this.v);
          this.p.getPlayer().e(this.w);
          this.p.getPlayer().f(this.x);
       }
       tp = this.s;
       if (tp != null) {
          tp.D(this.r, this.y);
       }
       return;
    }
    public void P8(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       this.u.B.onNext(this.q);
       s1.d(new n(this, p0, p1));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.s8(a.class);
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.u = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
