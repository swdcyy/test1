package com.yxcorp.gifshow.featured.detail.featured.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.detail.featured.presenter.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import lnc.r3;
import hka.f;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import zda.j;
import z99.b;
import erd.g;
import crd.b;

public class f extends PresenterV2	// class@000f74
{
    public BaseFragment p;
    public QPhoto q;
    public SlidePlayViewModel r;
    public boolean s;
    public final f t;

    public void f(){
       super();
       this.s = true;
       this.t = new f$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       if (this.getActivity() != null && this.getActivity() instanceof r3) {
          this.getActivity().R(this.t);
       }
       this.r = SlidePlayViewModel.B0(this.p);
       this.X7(this.p.Vg().g().subscribe(new j(this), new b()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if (this.getActivity() != null && this.getActivity() instanceof r3) {
          this.getActivity().G1(this.t);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
