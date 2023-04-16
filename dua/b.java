package dua.b;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.splash.c;
import java.lang.Object;
import gp5.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tra.b;
import q87.c;
import wkd.b;
import tjc.c;
import lnc.k4;
import eua.b;

public final class b implements g	// class@002561
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "15")) {
       }else {
          Object[] objArray = new Object[0];
          b.C().w("SplashPresenter", "NasaFeatureLaunchSelectEvent ", objArray);
          if (!b.a(-1608526086).X() && k4.d()) {
             tb.R8("LowPhone handleNasaFeatureLaunchSelectEvent");
             tb.Y8(0);
          }
       }
       return;
    }
}
