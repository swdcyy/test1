package b69.d;
import erd.o;
import java.lang.Object;
import com.kwai.tuna_preloader.preload_wrapper.ResultWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.pymk.net.RecommendUserResponseV2;
import kotlin.jvm.internal.a;

public final class d implements o	// class@000377
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          obj = p0.getResult();
       }
       return obj;
    }
}
