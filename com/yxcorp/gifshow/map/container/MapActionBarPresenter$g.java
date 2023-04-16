package com.yxcorp.gifshow.map.container.MapActionBarPresenter$g;
import hka.a;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xl8.b;
import kotlin.jvm.internal.a;
import mrd.a;
import com.kwai.feature.api.social.nearby.model.roampanel.RoamPanelAction;

public final class MapActionBarPresenter$g implements a	// class@001c6c
{
    public final MapActionBarPresenter b;

    public void MapActionBarPresenter$g(MapActionBarPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       MapActionBarPresenter$g og = MapActionBarPresenter$g.class;
       Object obj = PatchProxy.applyWithListener(null, this, og, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.W8().a();
       a.o(obj, "mPanelOpenStatus.value");
       if (obj.booleanValue()) {
          this.b.V8().onNext(RoamPanelAction.SMOOTH_EXPAND);
          PatchProxy.onMethodExit(og, "1");
          return true;
       }else {
          PatchProxy.onMethodExit(og, "1");
          return false;
       }
    }
}
