package dua.h;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.splash.ThanosSplashPresenter;
import java.lang.Object;
import ujc.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eua.b;

public final class h implements g	// class@002567
{
    public final ThanosSplashPresenter b;

    public void h(ThanosSplashPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, ThanosSplashPresenter.class, "5")) {
       }else if(p0.a == 4 && tb.W8()){
          tb.A = false;
          tb.Y8(1);
       }
       return;
    }
}
