package e8a.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;

public class f extends g	// class@0020a5
{

    public void f(){
       super();
    }
    public int W8(){
       Object obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public int Y8(){
       Object obj = PatchProxy.apply(null, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public boolean Z8(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.Z8();
    }
}
