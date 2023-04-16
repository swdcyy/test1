package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$k;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import k6b.i;
import com.yxcorp.gifshow.map.MapLogger$MapState;
import com.yxcorp.gifshow.map.MapLogger$CardStatus;

public final class MapRolePresenter$k implements View$OnClickListener	// class@001cb1
{
    public final MapRoleInfoResponse b;
    public final MapRolePresenter c;
    public final boolean d;

    public void MapRolePresenter$k(MapRoleInfoResponse p0,MapRolePresenter p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MapRolePresenter$k.class, "1")) {
          return;
       }
       this.c.a9(this.b);
       MapRolePresenter$k tb = this.b;
       this.c.d9(MapLogger$MapState.MAP_MY_HUMANOID_UNSET, i.a(tb.mRole, tb.mMoment), MapLogger$CardStatus.ONLINE, false);
       PatchProxy.onMethodExit(MapRolePresenter$k.class, "1");
       return;
    }
}
