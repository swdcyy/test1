package ajc.o$c;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.kwaitoken.model.ShareToken;
import kotlin.jvm.internal.a;

public final class o$c implements o	// class@000145
{
    public static final o$c b;

    static {
       o$c.b = new o$c();
    }
    public void o$c(){
       super();
    }
    public Object apply(Object p0){
       ShareToken shareToken = PatchProxy.applyOneRefs(p0, this, o$c.class, "1");
       if (shareToken != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          shareToken = new ShareToken();
       }
       return shareToken;
    }
}
