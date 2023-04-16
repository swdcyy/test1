package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$e;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;
import com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import j6b.i0;
import w4.j;
import w4.e;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role$Animation;
import j6b.j0;

public final class MapRolePresenter$e implements g	// class@001cab
{
    public final MapRolePresenter b;

    public void MapRolePresenter$e(MapRolePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MapRolePresenter$e.class, "1")) {
       }else {
          MapRolePresenter$e tb = this.b;
          a.o(p0, "integer");
          int i = p0.intValue();
          Objects.requireNonNull(tb);
          MapRolePresenter mapRolePrese = MapRolePresenter.class;
          if (!PatchProxy.isSupport(mapRolePrese) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, mapRolePrese, "4")) {
             Object[] objArray = null;
             if (i != 1) {
                if (i != 2) {
                   if (i != 3) {
                      if (i == 4 && !MapExperimentUtils.g.e()) {
                         tb.S8();
                      }
                   }else if(MapExperimentUtils.g.e() || PatchProxy.applyVoid(objArray, tb, mapRolePrese, "14")){
                      i = tb.L;
                      if (i != null) {
                         i = i.mRole;
                         if (i != null) {
                            objArray = i.mImage;
                         }
                         if (!TextUtils.x(objArray)) {
                            a.i(tb.getContext(), "https://static.yximgs.com/udata/pkg/kwai-client-image/nearby_map/lottie_role_halo.zip").addListener(new i0(tb));
                         }
                      }
                   }
                }else {
                   tb.V8();
                }
             }else if(PatchProxy.applyVoid(objArray, tb, mapRolePrese, "12")){
                i = tb.R;
                if (i != null) {
                   tb.b9(i);
                }else {
                   i = tb.L;
                   if (i != null) {
                      i = i.mRole;
                      if (i != null) {
                         i = i.mAnimation;
                         if (i != null) {
                            i = i.mWalk;
                            if (i != null) {
                               a.i(tb.getContext(), i).addListener(new j0(tb));
                            }
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
