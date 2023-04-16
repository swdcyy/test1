package e11.b;
import a71.a;
import e11.d;
import e11.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e11.b$a;
import java.lang.Runnable;
import d61.y;

public final class b implements a	// class@002083
{
    public final d a;
    public final a b;

    public void b(d p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final boolean a(int p0){
       if (PatchProxy.isSupport2(b.class, "1")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       y.a(this.b.getActivity(), new b$a(this), this.a, 300);
       PatchProxy.onMethodExit(b.class, "1");
       return false;
    }
}
