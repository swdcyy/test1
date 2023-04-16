package on1.c$a;
import z0.a;
import on1.c;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailItemData;
import java.util.Objects;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailRelatedAnchorData;
import kotlin.Result;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import qrd.j0;

public final class c$a implements a	// class@003544
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c$a obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       p0 = p0.content;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          p0 = Result.constructor-impl(a.a.h(p0, LiveHotSpotDetailRelatedAnchorData.class));
          if (Result.isFailure-impl(p0)) {
             i = 0;
          }
          obj1 = i;
       }
       return obj1;
    }
}
