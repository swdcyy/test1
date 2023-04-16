package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$f;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import java.lang.Object;
import f07.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.gifshow.map.MapLogger$MapState;
import com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;

public final class MapRolePresenter$f implements g	// class@001cac
{
    public final MapRolePresenter b;

    public void MapRolePresenter$f(MapRolePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter$f.class, "1")) {
       }else {
          MapRolePresenter$f tb = this.b;
          tb.Z0 = p0;
          if (tb.X0 != null) {
             tb.X0 = false;
             a.m(p0);
             View view = MapRolePresenter.R8(this.b);
             int i = (this.b.c1 == MapLogger$MapState.MAP_MY_HUMANOID)? 2: 1;
             tb.W8(p0, view, i);
             p0 = this.b;
             p0.W0 = true;
             if (p0.Y0 != null) {
                p0.Y0 = false;
                MapRolePresenter l = p0.L;
                if (l != null) {
                   MapRoleInfoResponse mMoment = l.mMoment;
                   if (mMoment != null) {
                      p0.j9(mMoment.mMessage);
                      this.b.X8();
                   }
                }
             }
          }
       }
       return;
    }
}
