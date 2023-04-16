package eja.g1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Objects;
import kp.r1;

public final class g1 implements g	// class@0026c6
{
    public final HomeFollowRefreshPresenter b;

    public void g1(HomeFollowRefreshPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g1 tb = this.b;
       Objects.requireNonNull(tb);
       tb.L = r1.S2(p0);
    }
}
