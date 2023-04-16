package ay3.a;
import qx3.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ez3.e;

public final class a extends d	// class@0002d5
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
       return new e();
    }
    public int n(){
       return 0x7f0d0f09;
    }
}
