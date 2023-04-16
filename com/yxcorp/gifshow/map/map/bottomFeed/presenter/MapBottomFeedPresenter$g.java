package com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$g;
import erd.g;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class MapBottomFeedPresenter$g implements g	// class@001c88
{
    public final MapBottomFeedPresenter b;

    public void MapBottomFeedPresenter$g(MapBottomFeedPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapBottomFeedPresenter$g.class, "1")) {
       }else {
          MapBottomFeedPresenter s = this.b.s;
          if (s == null) {
             a.S("mBottomSheetContainer");
          }
          a.o(p0, "hide");
          int i = (p0.booleanValue())? 8: 0;
          s.setVisibility(i);
          if (p0.booleanValue()) {
             MapBottomFeedPresenter.P8(this.b).setVisibility(8);
          }else {
             p0 = this.b.w;
             if (p0 != null && p0.getState() == 3) {
                MapBottomFeedPresenter.P8(this.b).setVisibility(0);
             }
          }
       }
       return;
    }
}
