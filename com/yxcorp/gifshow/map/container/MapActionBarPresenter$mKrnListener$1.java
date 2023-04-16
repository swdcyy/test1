package com.yxcorp.gifshow.map.container.MapActionBarPresenter$mKrnListener$1;
import oj0.a;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mrd.a;
import com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter$mKrnListener$1$2;
import msd.a;
import tb7.b;

public final class MapActionBarPresenter$mKrnListener$1 implements a	// class@001c70
{
    public final MapActionBarPresenter b;

    public void MapActionBarPresenter$mKrnListener$1(MapActionBarPresenter p0){
       this.b = p0;
       super();
    }
    public final void W(Map p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MapActionBarPresenter$mKrnListener$1.class, str)) {
          return;
       }
       Object obj = null;
       Object obj1 = (p0 != null)? p0.get("openPanel"): obj;
       if (obj1 instanceof String) {
          obj = obj1;
       }
       if (obj != null && a.g(obj, str)) {
          this.b.V8().onNext(RoamPanelAction.SMOOTH_EXPAND);
       }
       b.j(new MapActionBarPresenter$mKrnListener$1$2(this, p0));
       return;
    }
}
