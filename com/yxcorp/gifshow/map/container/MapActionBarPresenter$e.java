package com.yxcorp.gifshow.map.container.MapActionBarPresenter$e;
import erd.g;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import g6b.c;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f07.b;
import tw5.d;
import qrd.l1;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import kotlin.jvm.internal.a;
import u5b.d;

public final class MapActionBarPresenter$e implements g	// class@001c6a
{
    public final MapActionBarPresenter b;

    public void MapActionBarPresenter$e(MapActionBarPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       MapCenterInfo mCurrentCent;
       String str2;
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, MapActionBarPresenter$e.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          MapActionBarPresenter mapActionBar = MapActionBarPresenter.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, mapActionBar, "12")) {
             MapActionBarPresenter u = p0.u;
             if (u != null) {
                c f = u.f;
                if (f != null) {
                   u = p0.B;
                   CityInfo uCityInfo = PatchProxy.applyOneRefs(f, p0, mapActionBar, "13");
                   if (uCityInfo != PatchProxyResult.class) {
                   }else {
                      uCityInfo = new CityInfo();
                      uCityInfo.mCityName = p0.X8(f.mDefaultTitle);
                      if (!TextUtils.x(p0.L)) {
                         uCityInfo.mRoamCityId = p0.L;
                      }
                      MapCenterInfo mCurrentCent1 = f.mCurrentCenterLatLng;
                      b uob = 0x404145fd7a13c255;
                      b b = (mCurrentCent1 != null)? mCurrentCent1.b: uob;
                      uCityInfo.mLongitude = b;
                      if (mCurrentCent1 != null) {
                         uob = mCurrentCent1.a;
                      }
                      uCityInfo.mLatitude = uob;
                   }
                   u.b(uCityInfo);
                   if (TextUtils.x(f.mDefaultTitle)) {
                      mCurrentCent = f.mCurrentCenterLatLng;
                      if (mCurrentCent != null) {
                         p0.R8(mCurrentCent.a, mCurrentCent.b, true);
                         p0 = l1.a;
                      }
                   }else {
                      String str = p0.X8(f.mDefaultTitle);
                      p0.z = str;
                      f.mRealDisplayTitle = str;
                      MapCenterInfo mAddress = f.mAddress;
                      if (mAddress != null) {
                         String str1 = "";
                         if (TextUtils.x(mAddress.mCity)) {
                            str2 = str1;
                         }else {
                            str2 = mAddress.mCity;
                            a.o(str2, "address.mCity");
                         }
                         if (!TextUtils.x(mAddress.mProvince)) {
                            str1 = mAddress.mProvince;
                            a.o(str1, "address.mProvince");
                         }
                         int i = 1;
                         int i1 = (str2.length() > 0)? 1: 0;
                         if (i1) {
                            if (str1.length() <= 0) {
                               i = 0;
                            }
                            if (i) {
                               d.b(str2, str1, false, 4, objArray);
                               p0.P8(str, str2, str1);
                               a = l1.a;
                            label_00e3 :
                               if (a == null) {
                               label_00e6 :
                                  mCurrentCent = f.mCurrentCenterLatLng;
                                  if (mCurrentCent != null) {
                                     p0.R8(mCurrentCent.a, mCurrentCent.b, false);
                                     p0 = l1.a;
                                  }
                               }
                            }
                         }
                         mCurrentCent = f.mCurrentCenterLatLng;
                         if (mCurrentCent != null) {
                            p0.R8(mCurrentCent.a, mCurrentCent.b, false);
                            objArray = l1.a;
                         }
                         a = objArray;
                         goto label_00e3 ;
                      }else {
                         goto label_00e6 ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
