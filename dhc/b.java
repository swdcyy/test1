package dhc.b;
import ygc.b;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dhc.a;
import android.view.ViewGroup;
import y8c.f;
import ygc.d;
import ygc.c;
import android.view.View;
import ygc.a;
import ehc.f;

public final class b implements b	// class@0021ca
{

    public void b(){
       super();
    }
    public PresenterV2 a(){
       Object obj = PatchProxy.applyWithListener(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(b.class, "1");
       return new a();
    }
    public int b(){
       return 0x7f0d14c6;
    }
    public f c(ViewGroup p0){
       return c.b(this, p0);
    }
    public View d(ViewGroup p0){
       return a.a(this, p0);
    }
    public Class e(){
       return f.class;
    }
}
