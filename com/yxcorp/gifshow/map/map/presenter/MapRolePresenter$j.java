package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$j;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import k6b.i;
import com.yxcorp.gifshow.map.MapLogger$MapState;
import com.yxcorp.gifshow.map.MapLogger$CardStatus;

public final class MapRolePresenter$j extends m	// class@001cb0
{
    public final MapRoleInfoResponse c;
    public final MapRolePresenter d;
    public final boolean e;

    public void MapRolePresenter$j(MapRoleInfoResponse p0,MapRolePresenter p1,boolean p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MapRolePresenter$j.class, "1")) {
          return;
       }
       this.d.Z8();
       MapRolePresenter$j tc = this.c;
       String str = i.a(tc.mRole, tc.mMoment);
       MapRoleInfoResponse mRole = this.c.mRole;
       MapLogger$MapState mAP_MY_HUMAN = (mRole != null)? MapLogger$MapState.MAP_MY_HUMANOID: MapLogger$MapState.MAP_MY_HUMANOID_UNSET;
       MapRolePresenter$j td = this.d;
       MapLogger$CardStatus vIRTUAL_IMAG = (mRole != null)? MapLogger$CardStatus.VIRTUAL_IMAGE: MapLogger$CardStatus.ONLINE;
       td.d9(mAP_MY_HUMAN, str, vIRTUAL_IMAG, true);
       PatchProxy.onMethodExit(MapRolePresenter$j.class, "1");
       return;
    }
}
