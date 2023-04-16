package com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$c;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class MapBottomFeedPresenter$c implements View$OnTouchListener	// class@001c84
{
    public final MapBottomFeedPresenter b;

    public void MapBottomFeedPresenter$c(MapBottomFeedPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, MapBottomFeedPresenter$c.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       MapBottomFeedPresenter$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, MapBottomFeedPresenter.class, "6")) {
          MapBottomFeedPresenter w = tb.w;
          if (w != null && w.getState() == 3) {
             MapBottomFeedPresenter w1 = tb.w;
             if (w1 != null) {
                w1.setState(4);
             }
          }
       }
       return false;
    }
}
