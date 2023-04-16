package bhc.a;
import ygc.b;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewGroup;
import y8c.f;
import ygc.d;
import ygc.c;
import android.view.View;
import ygc.a;
import ehc.e;

public final class a implements b	// class@000478
{

    public void a(){
       super();
    }
    public PresenterV2 a(){
       Object obj = PatchProxy.applyWithListener(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "1");
       return new PresenterV2();
    }
    public int b(){
       return 0x7f0d14c5;
    }
    public f c(ViewGroup p0){
       return c.b(this, p0);
    }
    public View d(ViewGroup p0){
       return a.a(this, p0);
    }
    public Class e(){
       return e.class;
    }
}
