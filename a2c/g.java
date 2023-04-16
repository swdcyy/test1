package a2c.g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.kslog.KsLogProfileTag;
import java.util.List;
import v2c.e;
import v2c.g;

public final class g implements g	// class@000042
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          a.p(p0, "error");
          g.d(KsLogProfileTag.BG_VIDEO.appendTag("ProfileBackgroundFeedClickHelper"), "get plugin error: ", p0);
       }
       return;
    }
}
