package com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter$h;
import erd.g;
import com.yxcorp.gifshow.map.map.bottomFeed.presenter.MapBottomFeedPresenter;
import java.lang.Object;
import com.kuaishou.krn.event.KrnLifeCycleEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MapBottomFeedPresenter$h implements g	// class@001c89
{
    public final MapBottomFeedPresenter b;

    public void MapBottomFeedPresenter$h(MapBottomFeedPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapBottomFeedPresenter$h.class, "1")) {
       }else {
          this.b.onReceivedKrnLifeCycleEvent(p0);
       }
       return;
    }
}
