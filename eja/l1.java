package eja.l1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.Object;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;

public final class l1 implements g	// class@0026d5
{
    public final HomeFollowRefreshPresenter b;
    public final RefreshType c;

    public void l1(HomeFollowRefreshPresenter p0,RefreshType p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.p.J3(this.c);
    }
}
