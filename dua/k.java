package dua.k;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter$PersonalizedTabState;
import tra.b;
import java.lang.String;
import q87.c;

public final class k implements Runnable	// class@00256a
{
    public final ThanosSplashPresenter b;

    public void k(ThanosSplashPresenter p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       ThanosSplashPresenter z = tb.z;
       if (z == ThanosSplashPresenter$PersonalizedTabState.NO_NEED || z == ThanosSplashPresenter$PersonalizedTabState.WAITING_TAB_SWITCH) {
          Object[] objArray = new Object[0];
          b.C().w("ThanosSplashPresenter", "delay run", objArray);
          tb.Y8(0);
       }
       return;
    }
}
