package dua.j;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter;
import java.lang.Object;
import java.util.Objects;
import tra.b;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter$PersonalizedTabState;

public final class j implements Runnable	// class@002569
{
    public final ThanosSplashPresenter b;

    public void j(ThanosSplashPresenter p0){
       this.b = p0;
    }
    public final void run(){
       j tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       b.C().w("ThanosSplashPresenter", "mExitSplashLogoRunnable", objArray);
       tb.z = ThanosSplashPresenter$PersonalizedTabState.NO_NEED;
       tb.b9(0);
    }
}
