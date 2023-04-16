package ffd.b;
import ec6.g;
import java.lang.Object;
import ec6.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ec6.i;
import com.yxcorp.gifshow.log.model.FeedLogCtx;

public class b implements g	// class@000e17
{

    public void b(){
       super();
    }
    public f build(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(2, 0, null);
    }
}
