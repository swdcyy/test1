package fw8.c;
import wo5.a;
import java.lang.Object;
import java.lang.String;
import wo5.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kx8.a;
import android.view.View;
import pr6.d;
import com.kwai.kcube.TabIdentifier;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jx8.c;

public class c implements a	// class@002359
{

    public void c(){
       super();
    }
    public b Oe(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activityId");
       return new a(p0);
    }
    public boolean isAvailable(){
       return true;
    }
    public PresenterV2 rp(View p0,d p1,TabIdentifier p2){
       Object obj = PatchProxy.applyThreeRefsWithListener(p0, p1, p2, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tabView");
       a.p(p1, "fragmentWrapper");
       a.p(p2, "identifier");
       PatchProxy.onMethodExit(c.class, "1");
       return new c(p0, p1, p2);
    }
}
