package com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$b;
import hka.a;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class MapBottomFeedPresenter$b implements a	// class@001c83
{
    public final MapBottomFeedPresenter b;

    public void MapBottomFeedPresenter$b(MapBottomFeedPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       MapBottomFeedPresenter obj = PatchProxy.apply(null, this, MapBottomFeedPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.w;
       if (obj == null || obj.getState() != 3) {
          return false;
       }
       obj = this.b.w;
       if (obj != null) {
          obj.setState(4);
       }
       return true;
    }
}
