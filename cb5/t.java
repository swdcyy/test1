package cb5.t;
import hka.b;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.f;
import java.lang.Object;
import android.content.res.Configuration;
import ma5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class t implements b	// class@000458
{
    public final f a;

    public void t(f p0){
       this.a = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       f p = this.a.p;
       if (p != null && !PatchProxy.applyVoid(null, p, a.class, "3")) {
          p.d = p.f();
       }
       return;
    }
}
