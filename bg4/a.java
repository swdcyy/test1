package bg4.a;
import bg4.b;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tg4.a;

public class a extends b	// class@0003b0
{

    public void a(){
       super();
    }
    public PresenterV2 q(Fragment p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(a.class, "1");
       return new a(p0);
    }
}
