package com.yxcorp.gifshow.profile.presenter.profile.MyProfileKMoviePosterStatusTipPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.profile.presenter.profile.MyProfileKMoviePosterStatusTipPresenter$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;

public class MyProfileKMoviePosterStatusTipPresenter extends PresenterV2	// class@001452
{
    public BaseFragment p;
    public RxPageBus q;
    public DefaultLifecycleObserver r;

    public void MyProfileKMoviePosterStatusTipPresenter(){
       super();
       this.r = new MyProfileKMoviePosterStatusTipPresenter$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MyProfileKMoviePosterStatusTipPresenter.class, "2")) {
          return;
       }
       this.p.getActivity().getLifecycle().addObserver(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MyProfileKMoviePosterStatusTipPresenter.class, "3")) {
          return;
       }
       this.p.getActivity().getLifecycle().removeObserver(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MyProfileKMoviePosterStatusTipPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("PROFILE_FRAGMENT");
       this.q = this.r8("PROFILE_PAGE_RXBUS");
       return;
    }
}
