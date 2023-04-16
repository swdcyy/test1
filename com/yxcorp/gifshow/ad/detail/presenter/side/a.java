package com.yxcorp.gifshow.ad.detail.presenter.side.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.side.a$a;
import com.yxcorp.gifshow.ad.detail.presenter.side.a$b;
import com.yxcorp.gifshow.ad.detail.presenter.side.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import g19.c;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import io.reactivex.subjects.PublishSubject;

public class a extends PresenterV2	// class@0016a6
{
    public QPhoto p;
    public BaseFragment q;
    public a r;
    public MilanoContainerEventBus s;
    public SlidePlayViewModel t;
    public boolean u;
    public PhotoDetailLogger v;
    public PublishSubject w;
    public final p x;
    public final a y;
    public final b$b z;

    public void a(){
       super();
       this.x = new a$a(this);
       this.y = new a$b(this);
       this.z = new a$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q.getParentFragment());
       this.t = slidePlayVie;
       slidePlayVie.P(this.q, this.y);
       if (this.r.getPlayer() != null) {
          this.r.getPlayer().w(this.z);
       }
       this.X7(this.w.subscribe(new c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.r.getPlayer() != null) {
          this.r.getPlayer().O(this.z);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.q8(a.class);
       this.s = this.q8(MilanoContainerEventBus.class);
       this.v = this.r8("DETAIL_LOGGER");
       this.w = this.r8("DETAIL_SLIDE_PHOTO_LIST_PAUSE_VIEW_CLICK");
       return;
    }
}
