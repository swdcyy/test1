package com.yxcorp.gifshow.ad.detail.presenter.log.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import y09.g;
import com.yxcorp.gifshow.ad.detail.presenter.log.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Set;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class c extends PresenterV2	// class@001661
{
    public QPhoto p;
    public List q;
    public Set r;
    public SlidePlayViewModel s;
    public BaseFragment t;
    public final k3 u;
    public final a v;

    public void c(){
       super();
       this.u = new g(this);
       this.v = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.t.getParentFragment());
       this.s = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.t, this.v);
       }else {
          c tq = this.q;
          if (tq != null) {
             tq.add(this.v);
          }
       }
       return;
    }
    public void J8(){
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.t8("DETAIL_ATTACH_LISTENERS");
       this.r = this.t8("DETAIL_SCREEN_TOUCH_LISTENER");
       this.t = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
