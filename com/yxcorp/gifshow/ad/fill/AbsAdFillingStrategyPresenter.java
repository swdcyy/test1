package com.yxcorp.gifshow.ad.fill.AbsAdFillingStrategyPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.fill.AbsAdFillingStrategyPresenter$mObserver$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qvb.i;
import qvb.q;
import qvb.j;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class AbsAdFillingStrategyPresenter extends PresenterV2	// class@00176e
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public final q r;

    public void AbsAdFillingStrategyPresenter(){
       super();
       this.r = new AbsAdFillingStrategyPresenter$mObserver$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, AbsAdFillingStrategyPresenter.class, "2")) {
          return;
       }
       this.q = SlidePlayViewModel.S0(this.p);
       i oi = this.q();
       if (oi != null) {
          oi.h(this.r);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, AbsAdFillingStrategyPresenter.class, "3")) {
          return;
       }
       i oi = this.q();
       if (oi != null) {
          oi.f(this.r);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AbsAdFillingStrategyPresenter.class, "1")) {
          return;
       }
       this.p = this.t8("FRAGMENT");
       return;
    }
    public i q(){
       return null;
    }
}
