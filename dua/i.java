package dua.i;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter;
import java.lang.Object;
import jsa.h;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import q87.c;
import com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter$PersonalizedTabState;
import wkd.b;
import tjc.c;

public final class i implements g	// class@002568
{
    public final ThanosSplashPresenter b;

    public void i(ThanosSplashPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ThanosSplashPresenter.class, "12")) {
       }else {
          int i = 0;
          Object[] objArray = new Object[i];
          b.C().s("ThanosSplashPresenter", "HomeLoadDataEvent", objArray);
          tb.z = ThanosSplashPresenter$PersonalizedTabState.WAITING_TAB_SWITCH;
          if (b.a(-1608526086).S()) {
             Object[] objArray1 = new Object[i];
             b.C().s("ThanosSplashPresenter", "has splash, return", objArray1);
          }else {
             tb.Y8(i);
          }
       }
       return;
    }
}
