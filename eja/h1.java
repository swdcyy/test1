package eja.h1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import java.lang.Object;
import wca.n;
import java.util.Objects;

public final class h1 implements g	// class@0026c9
{
    public final HomeFollowRefreshPresenter b;

    public void h1(HomeFollowRefreshPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.c != null) {
          tb.J = true;
       }
       return;
    }
}
