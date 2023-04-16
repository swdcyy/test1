package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$g;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;

public final class MapRolePresenter$g implements g	// class@001cad
{
    public final MapRolePresenter b;

    public void MapRolePresenter$g(MapRolePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter$g.class, "1")) {
       }else {
          a.o(p0, "isClick");
          this.b.a1 = p0.booleanValue();
          p0 = this.b;
          if (p0.W0 != null) {
             p0 = p0.b1;
             MapRolePresenter mapRolePrese = 2;
             if (p0 != null && p0.intValue() == mapRolePrese) {
                p0 = this.b;
                mapRolePrese = p0.L;
                if (mapRolePrese != null) {
                   p0.h9(mapRolePrese);
                   p0 = this.b;
                   p0.W0 = false;
                   p0.X0 = false;
                   p0.b1 = Integer.valueOf(false);
                   this.b.c9();
                   this.b.Y8();
                }
             }
          }
       }
       return;
    }
}
