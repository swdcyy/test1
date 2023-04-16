package au5.b;
import vt5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import wt5.b;
import wkd.b;
import vt5.e;
import wt5.d;
import wt5.g;
import wt5.j;

public final class b	// class@0003ac
{

    public static final a a(){
       b obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(0x24032e2d);
       a.o(obj, "PluginManager.get\(Active¡­endantPlugin::class.java\)");
       return obj;
    }
    public static final b b(){
       Object obj = PatchProxy.apply(null, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x132b1f9);
       a.o(obj, "Singleton.get\(GrowthPlayerManager::class.java\)");
       return obj;
    }
    public static final e c(){
       b obj = PatchProxy.apply(null, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a(-1094279325);
       a.o(obj, "PluginManager.get\(PendantCommonPlugin::class.java\)");
       return obj;
    }
    public static final d d(){
       Object obj = PatchProxy.apply(null, null, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x3982cd67);
       a.o(obj, "Singleton.get\(PendantVis¡­ityManagerV2::class.java\)");
       return obj;
    }
    public static final g e(){
       Object obj = PatchProxy.apply(null, null, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x2560f282);
       a.o(obj, "Singleton.get\(PlayerFeedManager::class.java\)");
       return obj;
    }
    public static final j f(){
       Object obj = PatchProxy.apply(null, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x46a6a305);
       a.o(obj, "Singleton.get\(WatchPhoto¡­pleteManager::class.java\)");
       return obj;
    }
}
