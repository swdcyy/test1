package com.yxcorp.gifshow.map.map.presenter.MapMarkerPresenter$c;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MapMarkerPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yz6.j;

public final class MapMarkerPresenter$c implements g	// class@001ca0
{
    public final MapMarkerPresenter b;

    public void MapMarkerPresenter$c(MapMarkerPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapMarkerPresenter$c.class, "1")) {
       }else if(p0 == FragmentEvent.RESUME){
          p0 = this.b;
          p0.S8(p0.G);
          p0.G = null;
       }else if(p0 == FragmentEvent.DETACH){
          p0.H = true;
       }
       return;
    }
}
