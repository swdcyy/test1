package com.yxcorp.gifshow.featured.detail.featured.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.detail.featured.presenter.a;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import zda.a;
import uw9.l0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends PresenterV2	// class@000f6c
{
    public BaseFragment p;
    public l0 q;
    public SlidePlayViewModel r;
    public static final x s;

    static {
       b.s = Suppliers.a(a.b);
    }
    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.r = SlidePlayViewModel.B0(this.p);
       this.q.N1 = new a(this);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(l0.class);
       this.p = this.r8("FRAGMENT");
       return;
    }
}
