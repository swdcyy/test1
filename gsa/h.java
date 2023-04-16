package gsa.h;
import vo5.d;
import java.lang.Object;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.homepage.BottomFeatureGuideInitModule;

public class h implements d	// class@002bee
{

    public void h(){
       super();
    }
    public a O2(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BottomFeatureGuideInitModule();
    }
    public boolean isAvailable(){
       return true;
    }
}
