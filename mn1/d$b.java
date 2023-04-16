package mn1.d$b;
import z0.a;
import mn1.d;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotNormalMediaAreaData;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Math;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class d$b implements a	// class@0031d1
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       d$b obj = PatchProxy.applyOneRefs(p0, this, d$b.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       List list = PatchProxy.applyOneRefs(p0, obj, d.class, str);
       if (list != patchProxyRe) {
       }else if(p0 != null){
          ArrayList uArrayList = new ArrayList();
          LiveHotSpotNormalMediaAreaData mLiveViews = p0.mLiveViews;
          if (mLiveViews != null) {
             uArrayList.addAll(mLiveViews);
          }
          p0 = p0.mPhotoViews;
          if (p0 != null) {
             uArrayList.addAll(p0);
          }
          p0 = (uArrayList.size() >= 3)? uArrayList.subList(0, Math.min(24, uArrayList.size())): CollectionsKt__CollectionsKt.E();
          list = p0;
       }else {
          list = CollectionsKt__CollectionsKt.E();
       }
       return list;
    }
}
