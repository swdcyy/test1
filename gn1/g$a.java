package gn1.g$a;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailItemData;
import kotlin.Result;
import fg6.a;
import com.kuaishou.live.common.core.component.hotspot.detail.baseinfo.LiveHotSpotDetailBaseInfoModel;
import com.google.gson.Gson;
import java.lang.Throwable;
import qrd.j0;

public final class g$a implements a	// class@002525
{

    public void g$a(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = Result.constructor-impl(a.a.h(p0.content, LiveHotSpotDetailBaseInfoModel.class));
       if (Result.isFailure-impl(p0)) {
          p0 = null;
       }
       return p0;
    }
}
