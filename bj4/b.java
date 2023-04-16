package bj4.b;
import nd4.d;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bj4.c;

public class b extends d	// class@000385
{

    public void b(){
       super();
    }
    public int m(){
       return 0x7f0d0334;
    }
    public PresenterV2 q(Fragment p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(b.class, "1");
       return new c(p0);
    }
}
