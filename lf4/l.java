package lf4.l;
import gf4.a;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ei4.c;
import com.kuaishou.bowl.core.component.a;
import nh4.a;
import eg4.a;
import nh4.b;

public class l extends a	// class@0032a4
{

    public void l(){
       super();
    }
    public int m(){
       return 0x7f0d0f2e;
    }
    public PresenterV2 q(Fragment p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(l.class, "2");
       return new c(p0);
    }
    public a v(a p0,Object p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, l.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       b uob = null;
       if (p1 instanceof a) {
          p0 = p1.mDescription;
          if (p0 != null) {
             uob = new b(p0);
          }
       }
       return uob;
    }
}
