package com.yxcorp.gifshow.detail.fragments.milano.profile.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.fragments.milano.profile.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import z0a.b;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.Observer;
import zz5.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;

public class a extends PresenterV2	// class@001542
{
    public BaseFragment p;
    public QPhoto q;
    public MilanoContainerEventBus r;
    public SlidePlayViewModel s;
    public boolean t;
    public final a u;

    public void a(){
       super();
       this.u = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p.getParentFragment());
       this.s = slidePlayVie;
       slidePlayVie.P(this.p, this.u);
       d.b(this.q, this.p, new b(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_FRAGMENT");
       this.q = this.q8(QPhoto.class);
       this.r = this.q8(MilanoContainerEventBus.class);
       return;
    }
}
