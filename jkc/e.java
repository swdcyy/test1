package jkc.e;
import jkc.d;
import java.lang.Object;
import com.kwai.framework.init.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.third.init.ThirdMatrixInitModuleForSubProcess;

public class e implements d	// class@001b6b
{

    public void e(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public a qH(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ThirdMatrixInitModuleForSubProcess();
    }
}
