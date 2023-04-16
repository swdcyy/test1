package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import yz6.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import k6b.i;
import com.yxcorp.gifshow.map.MapLogger$MapState;
import com.yxcorp.gifshow.map.MapLogger$CardStatus;
import android.view.ViewGroup;

public final class MapRolePresenter$b implements View$OnClickListener	// class@001ca8
{
    public final MapRolePresenter b;
    public final j c;

    public void MapRolePresenter$b(MapRolePresenter p0,j p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MapRolePresenter$b.class, "1")) {
          return;
       }
       MapRolePresenter$b tb = this.b;
       MapRolePresenter l = tb.L;
       if (l != null) {
          tb.a9(l);
          String str = i.a(l.mRole, l.mMoment);
          MapRolePresenter$b tb1 = this.b;
          MapLogger$MapState mAP_MY_HUMAN = MapLogger$MapState.MAP_MY_HUMANOID_UNSET;
          MapLogger$CardStatus vIRTUAL_IMAG = (l.mRole != null)? MapLogger$CardStatus.VIRTUAL_IMAGE: MapLogger$CardStatus.ONLINE;
          MapRolePresenter r = tb1.r;
          boolean b = (r != null && !r.getVisibility())? true: false;
          tb1.d9(mAP_MY_HUMAN, str, vIRTUAL_IMAG, b);
       }
       PatchProxy.onMethodExit(MapRolePresenter$b.class, "1");
       return;
    }
}
