package com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$mKrnListener$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter$mKrnListener$1;
import java.util.Map;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import fg6.a;
import com.yxcorp.gifshow.map.data.model.MapRoleInfoResponse;
import com.google.gson.Gson;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role;
import com.yxcorp.gifshow.map.map.presenter.MapRolePresenter;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Moment;
import com.kwai.components.nearbymodel.model.NearbyMapFeed$RoleInfo$Role$Animation;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import j6b.g0;
import w4.j;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.view.View;
import com.yxcorp.utility.n;
import crd.b;
import g6b.c;
import mrd.a;

public final class MapRolePresenter$mKrnListener$1$1 extends Lambda implements a	// class@001cb3
{
    public final Map $value;
    public final MapRolePresenter$mKrnListener$1 this$0;

    public void MapRolePresenter$mKrnListener$1$1(MapRolePresenter$mKrnListener$1 p0,Map p1){
       this.this$0 = p0;
       this.$value = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       MapRoleInfoResponse mRole;
       NearbyMapFeed$RoleInfo$Role mId1;
       NearbyMapFeed$RoleInfo$Moment mType;
       MapRolePresenter l2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MapRolePresenter$mKrnListener$1$1.class, "1")) {
          return;
       }
       MapRolePresenter$mKrnListener$1$1 t$value = this.$value;
       Object[] objArray1 = (t$value != null)? t$value.get("roleModify"): objArray;
       if (!objArray1 instanceof Boolean) {
          objArray1 = objArray;
       }
       int i = 1;
       boolean b = (objArray1 != null)? objArray1.booleanValue(): true;
       MapRolePresenter$mKrnListener$1$1 t$value1 = this.$value;
       Object[] objArray2 = (t$value1 != null)? t$value1.get("roleInfo"): objArray;
       Objects.requireNonNull(objArray2, "null cannot be cast to non-null type kotlin.String");
       MapRoleInfoResponse mapRoleInfoR = a.a.h(objArray2, MapRoleInfoResponse.class);
       if (mapRoleInfoR != null) {
          if (b) {
             mRole = mapRoleInfoR.mRole;
             NearbyMapFeed$RoleInfo$Role mId = (mRole != null)? mRole.mId: null;
             MapRolePresenter l = this.this$0.b.L;
             if (l != null) {
                MapRoleInfoResponse mRole1 = l.mRole;
                if (mRole1 != null) {
                   mId1 = mRole1.mId;
                label_0062 :
                   if (mId != mId1) {
                      mRole = 1;
                   label_0067 :
                      mRole1 = mapRoleInfoR.mMoment;
                      NearbyMapFeed$RoleInfo$Moment mId2 = (mRole1 != null)? mRole1.mId: null;
                      MapRolePresenter$mKrnListener$1 b1 = this.this$0.b;
                      MapRolePresenter l1 = b1.L;
                      if (l1 != null) {
                         MapRoleInfoResponse mMoment = l1.mMoment;
                         if (mMoment != null) {
                            mType = mMoment.mType;
                         label_007f :
                            boolean b2 = (mId2 != mType)? true: false;
                            if (mRole || b2) {
                               if (mRole) {
                                  mRole = mapRoleInfoR.mRole;
                                  if (mRole != null) {
                                     mId = mRole.mAnimation;
                                     if (mId != null) {
                                        objArray = mId.mWalk;
                                     }
                                  }
                                  Objects.requireNonNull(b1);
                                  if (!PatchProxy.applyVoidOneRefs(objArray, b1, MapRolePresenter.class, "13") && objArray != null) {
                                     a.i(b1.getContext(), objArray).addListener(new g0(b1));
                                  }
                                  this.this$0.b.V8();
                                  MapRolePresenter.P8(this.this$0.b).setAlpha(100.00f);
                                  View[] viewArray = new View[i];
                                  viewArray[0] = this.this$0.b.H;
                                  n.Z(4, viewArray);
                                  l2 = this.this$0.b.L;
                                  if (l2 != null) {
                                     l2.mRole = mapRoleInfoR.mRole;
                                  }
                               }
                               if (b2) {
                                  l2 = this.this$0.b.S;
                                  if (l2 != null) {
                                     l2.dispose();
                                  }
                               }
                               this.this$0.b.e9(mapRoleInfoR, b2);
                               MapRolePresenter$mKrnListener$1 b3 = this.this$0.b;
                               MapRolePresenter l3 = b3.L;
                               if (l3 != null) {
                                  l2 = b3.K;
                                  if (l2 != null) {
                                     c v = l2.v;
                                     if (v != null) {
                                        v.onNext(l3);
                                     }
                                  }
                               }
                            }
                         }
                      }
                      mType = null;
                      goto label_007f ;
                   }
                }
             }
             mId1 = null;
             goto label_0062 ;
          }
          mRole = null;
          goto label_0067 ;
       }
    label_0109 :
       return;
    }
}
