package eja.j1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import java.lang.Object;
import m56.g;

public final class j1 implements g	// class@0026cf
{
    public final HomeFollowRefreshPresenter b;

    public void j1(HomeFollowRefreshPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j1 tb = this.b;
       boolean b = true;
       tb.z = b;
       if (tb.y == null) {
          if (p0.a() - tb.A < 0) {
             b = false;
          }
          tb.y = b;
       }
       return;
    }
}
