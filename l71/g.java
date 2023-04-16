package l71.g;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import l71.g$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import com.google.gson.JsonObject;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import lp3.e;
import xp5.g;
import lp3.c;
import kotlin.jvm.internal.a;
import gq1.r;
import o63.m;
import o63.m$a;

public final class g extends AbstractLiveJsCommand	// class@002e98
{

    public void g(){
       super();
    }
    public Class a(){
       return g$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, g.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (p0 instanceof g$a && (p0.b() == null || p0.a() == null)) {
          return m.g.c("invalid params");
       }
       b.Z(LiveLogTag.LIVE_LINE_PUZZLE, "puzzleShowAnim from js");
       c uoc = this.h().a(g.class);
       a.o(uoc, "serviceManager.getServic¡­eInfoManager::class.java\)");
       if (uoc.e()) {
          this.h().a(r.class).C5(p0.b().intValue(), p0.a());
       }
       return m$a.g(m.g, null, false, 3, null);
    }
}
