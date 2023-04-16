package com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$d;
import oj0.a;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class MapBottomFeedPresenter$d implements a	// class@001c85
{
    public final MapBottomFeedPresenter b;

    public void MapBottomFeedPresenter$d(MapBottomFeedPresenter p0){
       this.b = p0;
       super();
    }
    public final void W(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapBottomFeedPresenter$d.class, "1")) {
          return;
       }
       Object obj = null;
       MapBottomFeedPresenter obj1 = (p0 != null)? p0.get("openPanel"): obj;
       if (!obj1 instanceof String) {
          obj1 = obj;
       }
       if (obj1 != null && a.g(obj1, "1")) {
          obj1 = this.b.w;
          if (obj1 != null && obj1.getState() == 4) {
             obj1 = this.b.w;
             if (obj1 != null) {
                obj1.setState(3);
             }
          }
       }
       p0 = (p0 != null)? p0.get("openGreet"): obj;
       if (p0 instanceof String) {
          obj = p0;
       }
       if (obj != null && a.g(obj, "1")) {
          p0.A = true;
       }
       return;
    }
}
