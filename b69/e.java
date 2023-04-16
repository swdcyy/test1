package b69.e;
import h0c.b;
import java.lang.Object;
import com.yxcorp.gifshow.prefetch.preloader.TunaProphetPreLoader;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import b69.c;

public final class e implements b	// class@000378
{

    public void e(){
       super();
    }
    public TunaProphetPreLoader get(Object p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          a.p(p0, "value");
          uoc = (a.t().d("socialEcologyOthersProfilePymkPreRequestEnable", false))? new c(p0): null;
       }
       return uoc;
    }
}
