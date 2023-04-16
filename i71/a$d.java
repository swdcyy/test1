package i71.a$d;
import i71.a$c;
import lp3.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import i71.a$e;
import pz2.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import s00.b$a;
import s00.b;
import com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import xy2.a;
import dg1.a;
import lp3.c;
import g03.a;
import sz2.c;
import nsd.u;

public final class a$d implements a$c	// class@002847
{
    public final e a;

    public void a$d(e p0){
       a.p(p0, "serviceManager");
       super();
       this.a = p0;
    }
    public c a(a$e p0){
       c obj = PatchProxy.applyOneRefs(p0, this, a$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       LiveMultiMagicEffectInfo liveMultiMag = LiveMultiMagicEffectInfo.parseFrom(b.a().a(p0.b()));
       a.o(liveMultiMag, "effectInfo");
       obj = this.a.a(a.class);
       a.o(obj, "serviceManager.getServic¡­ourceService::class.java\)");
       a uoa = obj.Bl();
       a.o(uoa, "serviceManager.getServic¡­iveEffectResourceProvider");
       a uoa1 = new a(null, liveMultiMag, uoa, 1, null);
       return b.a().a(p0.b());
    }
}
