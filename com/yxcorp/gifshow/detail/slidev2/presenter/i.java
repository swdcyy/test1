package com.yxcorp.gifshow.detail.slidev2.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.component.photofeatures.filter.info.BrowsePage;
import java.lang.Object;
import wkd.b;
import zy5.k;
import b8a.f0;
import com.yxcorp.gifshow.detail.slidev2.presenter.i$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.q;
import brd.t;
import zy5.d;
import b8a.c0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b8a.d0;
import com.trello.rxlifecycle3.components.support.RxFragment;
import b8a.e0;
import java.lang.Runnable;
import ekd.k1;
import uw9.o;
import q87.c;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.entity.QPhoto;
import f6a.c;
import java.util.ArrayList;
import zy5.i;

public class i extends PresenterV2	// class@0019be
{
    public final BrowsePage p;
    public BaseFragment q;
    public final k r;
    public SlidePlayViewModel s;
    public final Runnable t;
    public final q u;

    public void i(BrowsePage p0){
       super();
       this.r = b.a(-275376108);
       this.t = new f0(this);
       this.u = new i$a(this);
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.q);
       this.s = slidePlayVie;
       slidePlayVie.e(this.u);
       this.X7(this.r.b().subscribe(new c0(this)));
       this.X7(this.q.Vg().i().subscribe(new d0(this)));
       this.X7(this.q.m().subscribe(new e0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "4")) {
          return;
       }
       this.s.b(this.u);
       k1.m(this.t);
       return;
    }
    public final void P8(){
       int i;
       int i1;
       if (PatchProxy.applyVoid(null, this, i.class, "3")) {
          return;
       }
       i = 0;
       Object[] objArray = new Object[i];
       o.C().w("NasaQPhotoDuplicatedPresenter", "start filter", objArray);
       List list = this.s.i0();
       if (q.f(list)) {
          return;
       }
       if (this.s.r()) {
          i1 = c.c(this.s, this.s.getCurrentPhoto());
          if (i1 == -1) {
             i1 = 0;
          }
       }else {
          i1 = this.s.a0();
       }
       ArrayList uArrayList = new ArrayList();
       while (i1 < list.size()) {
          QPhoto qPhoto = list.get(i1);
          if (!qPhoto.isShowed() && (this.r.a(qPhoto, i.a(this.p, i)) && qPhoto != this.s.getCurrentPhoto())) {
             uArrayList.add(qPhoto);
          }
       label_0076 :
          i1 = i1 + 1;
       }
       if (q.f(uArrayList)) {
          return;
       }else {
          Object[] objArray1 = new Object[i];
          o.C().w("NasaQPhotoDuplicatedPresenter", "start remove", objArray1);
          this.s.J(uArrayList, null, "NasaQPhotoDuplicatedPresenter");
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
