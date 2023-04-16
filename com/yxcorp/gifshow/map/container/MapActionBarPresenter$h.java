package com.yxcorp.gifshow.map.container.MapActionBarPresenter$h;
import com.yxcorp.gifshow.map.search.SearchFragment$b;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g6b.c;

public final class MapActionBarPresenter$h implements SearchFragment$b	// class@001c6d
{
    public final MapActionBarPresenter a;

    public void MapActionBarPresenter$h(MapActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void onClose(){
       if (PatchProxy.applyVoid(null, this, MapActionBarPresenter$h.class, "1")) {
          return;
       }
       MapActionBarPresenter u = this.a.u;
       if (u != null) {
          u.b(false);
       }
       this.a.Z8();
       return;
    }
}
