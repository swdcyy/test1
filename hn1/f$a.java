package hn1.f$a;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailItemData;
import fg6.a;
import kotlin.Result;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaData;
import com.google.gson.Gson;
import java.lang.Throwable;
import qrd.j0;

public final class f$a implements a	// class@002729
{

    public void f$a(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = Result.constructor-impl(a.a.h(p0.content, LiveHotSpotDetailCoreMediaData.class));
       if (Result.isFailure-impl(p0)) {
          p0 = null;
       }
       return p0;
    }
}
