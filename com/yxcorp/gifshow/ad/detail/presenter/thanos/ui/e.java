package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import android.view.View;
import ekd.m1;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class e extends PresenterV2	// class@0016dd
{
    public FrameLayout p;
    public FrameLayout q;
    public QPhoto r;
    public t s;
    public a t;
    public List u;
    public BaseFragment v;
    public a w;

    public void e(){
       super();
       this.w = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.v.getParentFragment());
       if (slidePlayVie != null) {
          slidePlayVie.P(this.v, this.w);
       }else {
          e tu = this.u;
          if (tu != null) {
             tu.add(this.w);
          }
       }
       return;
    }
    public void J8(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a30f6);
       this.q = m1.f(p0, 0x7f0a3e7f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("DETAIL_PROCESS_EVENT");
       this.u = this.t8("DETAIL_ATTACH_LISTENERS");
       this.v = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
