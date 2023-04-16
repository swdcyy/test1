package h71.e;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import java.lang.Object;
import o63.j$a;
import asd.c;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lp3.e;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService;
import lp3.c;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo;
import o63.m;
import o63.m$a;

public final class e extends AbstractLiveJsCommand	// class@002632
{

    public void e(){
       super();
    }
    public Class a(){
       return null;
    }
    public Object l(Object p0,j$a p1,c p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       p0 = this.h().a(LiveSceneInfoService.class);
       a.o(p0, "serviceManager.getServic¡­eInfoService::class.java\)");
       return m$a.g(m.g, p0.Me(), false, 2, null);
    }
}
