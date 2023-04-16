package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$c;
import qvb.q;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import pia.d;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import com.yxcorp.gifshow.refresh.RefreshType;
import jb5.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class HomeFollowRefreshPresenter$c implements q	// class@0011fa
{
    public final HomeFollowRefreshPresenter b;

    public void HomeFollowRefreshPresenter$c(HomeFollowRefreshPresenter p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(HomeFollowRefreshPresenter$c.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, HomeFollowRefreshPresenter$c.class, "1")) {
          return;
       }
       RefreshType refreshType = (this.b.p.ii() != null)? this.b.p.ii().x2(): RefreshType.UNKNOWN;
       if (refreshType != RefreshType.BACK_CLICK) {
          HomeFollowRefreshPresenter$c tb = this.b;
          tb.P8(tb.getActivity());
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       p.b(this, p0, p1);
    }
}
