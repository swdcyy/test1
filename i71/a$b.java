package i71.a$b;
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
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import eg1.a;
import lp3.c;
import kz2.a;
import dg1.a;
import g03.a;
import sz2.c;
import java.util.Map;

public final class a$b implements a$c	// class@002845
{
    public final e a;

    public void a$b(e p0){
       a.p(p0, "serviceManager");
       super();
       this.a = p0;
    }
    public c a(a$e p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       LiveCommonEffectInfo liveCommonEf = LiveCommonEffectInfo.parseFrom(b.a().a(p0.b()));
       c uoc = this.a.a(a.class);
       a.o(uoc, "serviceManager.getServic¡­ourceService::class.java\)");
       a uoa = new a(liveCommonEf, this.a.a(a.class).Un(liveCommonEf.effectiveKey, 0), p0.bizExtraMap, uoc.Bl());
       return obj;
    }
}
