package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$a;
import java.lang.Object;
import nsd.u;
import wq6.f;
import com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import wq6.h;

public final class KCubeILogPage$a	// class@000f21
{

    public void KCubeILogPage$a(){
       super();
    }
    public void KCubeILogPage$a(u p0){
       super();
    }
    public synchronized final KCubeILogPage a(f p0){
       KCubeILogPage obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "containerController");
       obj = p0.F("KCubeILogPage");
       if (obj == null) {
          obj = new KCubeILogPage(p0);
          p0.r("KCubeILogPage", obj);
       }
       return obj;
    }
}
