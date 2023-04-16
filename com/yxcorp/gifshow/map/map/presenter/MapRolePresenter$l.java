package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$l;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;
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
import kotlin.jvm.internal.a;
import android.view.ViewGroup;

public final class MapRolePresenter$l implements View$OnClickListener	// class@001cb2
{
    public final MapRolePresenter b;
    public final MapRoleInfoResponse c;

    public void MapRolePresenter$l(MapRolePresenter p0,MapRoleInfoResponse p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter$l.class, "1")) {
          return;
       }
       this.b.a9(this.c);
       MapRolePresenter$l tc = this.c;
       String str = i.a(tc.mRole, tc.mMoment);
       MapRolePresenter$l tb = this.b;
       MapLogger$MapState mAP_MY_HUMAN = MapLogger$MapState.MAP_MY_HUMANOID;
       MapLogger$CardStatus vIRTUAL_IMAG = MapLogger$CardStatus.VIRTUAL_IMAGE;
       MapRolePresenter q = tb.q;
       if (q == null) {
          a.S("mBubbleView");
       }
       boolean b = (!q.getVisibility())? true: false;
       tb.d9(mAP_MY_HUMAN, str, vIRTUAL_IMAG, b);
       return;
    }
}
