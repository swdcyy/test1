package com.yxcorp.gifshow.ad.detail.presenter.log.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y09.r;
import com.yxcorp.gifshow.ad.detail.presenter.log.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import im8.f;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wd5.s;

public class e extends PresenterV2	// class@001665
{
    public f p;
    public List q;
    public BaseFragment r;
    public QPhoto s;
    public boolean t;
    public SlidePlayViewModel u;
    public int v;
    public boolean w;
    public final Runnable x;
    public final a y;

    public void e(){
       super();
       this.x = new r(this);
       this.y = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.u = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.r, this.y);
       }else {
          e tq = this.q;
          if (tq != null) {
             tq.add(this.y);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tu = this.u;
       if (tu != null) {
          tu.D(this.r, this.y);
       }else {
          tu = this.q;
          if (tu != null) {
             tu.remove(this.y);
          }
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, e.class, "4")) {
          return;
       }
       if (this.p.get() != null && this.t == null) {
          s.b(this.s, this.p.get().getPlayerEventSessionId(), this.r, this.v, this.w);
          this.t = true;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.x8("DETAIL_LOGGER");
       this.q = this.t8("DETAIL_ATTACH_LISTENERS");
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.q8(QPhoto.class);
       return;
    }
}
