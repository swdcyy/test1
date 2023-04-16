package ag1.d;
import pz2.j;
import java.lang.String;
import ag1.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import fg6.a;
import ag1.r;
import com.kuaishou.live.common.core.component.effect.renderer.LiveEffectBridge;
import java.util.Objects;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;

public final class d	// class@000085
{

    public static final void a(j p0,int p1,String p2,q p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, d.class, "1")) {
          return;
       }
       Gson a = a.a;
       int i = (p3 != null)? p3.b(): -1;
       Objects.requireNonNull(LiveEffectBridge.e);
       r or = new r(i, p0.a(), p1, LiveEffectBridge.c, p2);
       String str = a.q(v7);
       b.c0(LiveLogTag.LIVE_ABILITY, "Promise.reject", "ret", str);
       a.o(str, "ret");
       p0.c(str);
       return;
    }
}
