package fs2.g;
import yx2.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveMusicPackage;
import yx2.n;

public final class g	// class@0029ae
{

    public static final d a(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$musicPackageFromVoicePartyContext");
       p0.c().liveMusicPackage = n.e(p0.e);
       return p0;
    }
}
