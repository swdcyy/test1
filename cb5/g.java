package cb5.g;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.a;
import android.view.View;
import lnc.a1;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uh5.e;
import wq6.d;
import as6.a;
import com.kwai.kcube.TabIdentifier;
import wq6.h;
import on5.n;
import xa5.a;
import on5.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class g extends a	// class@00044a
{
    public Fragment s;

    public void g(View p0){
       super(p0, a1.d(0x7f070fdf));
    }
    public void g(View p0,int p1){
       super(p0, p1);
    }
    public void g(Fragment p0){
       super(p0.getView(), a1.d(0x7f070fdf));
    }
    public boolean W8(){
       d obj = PatchProxy.apply(null, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!e.f()) {
          return b;
       }
       obj = a.e(this.s);
       if (obj != null && n.b(obj.M2())) {
          return b;
       }
       if (a.e(this.s)) {
          return b;
       }
       return a.c(this.s, b.C);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.s = this.r8("FRAGMENT");
       return;
    }
}
