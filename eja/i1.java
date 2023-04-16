package eja.i1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;

public final class i1 implements g	// class@0026cc
{
    public final HomeFollowRefreshPresenter b;

    public void i1(HomeFollowRefreshPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.p.J3(RefreshType.FOLLOW_RETURN_REFRESH);
    }
}
