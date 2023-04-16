package ap2.h;
import java.lang.Object;
import com.kuaishou.aryainstance.config.SnowConfig;
import tr.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tr.a;
import tr.c;
import kotlin.jvm.internal.a;

public final class h	// class@0002ac
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final d a(SnowConfig p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d uod = c.b(a.e(), p0);
       a.o(uod, "CompatibleAryaConfig.cre¡­\),\n      snowConfig\n    \)");
       return uod;
    }
}
