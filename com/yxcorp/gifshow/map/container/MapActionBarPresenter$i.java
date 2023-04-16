package com.yxcorp.gifshow.map.container.MapActionBarPresenter$i;
import z1.a;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter;
import java.lang.Object;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tw5.d;
import g6b.c;
import bsb.a;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import com.kwai.framework.location.util.LocationCityUtil;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import kotlin.jvm.internal.a;
import u5b.d;
import u5b.a;
import q87.c;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import b6b.q;

public final class MapActionBarPresenter$i implements a	// class@001c6e
{
    public final MapActionBarPresenter a;

    public void MapActionBarPresenter$i(MapActionBarPresenter p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       CityInfo mCityName;
       if (PatchProxy.applyVoidOneRefs(p0, this, MapActionBarPresenter$i.class, "1")) {
       }else {
          MapActionBarPresenter$i ta = this.a;
          ta.w = true;
          ta.Z8();
          this.a.S8().b(p0);
          ta = this.a;
          CityInfo mRoamCityId = p0.mRoamCityId;
          ta.L = mRoamCityId;
          MapActionBarPresenter u = ta.u;
          if (u != null) {
             u.u = mRoamCityId;
          }
          if (a.i(p0)) {
             LocationCityInfo locationCity = LocationCityUtil.g(u.g("default"));
             if (locationCity != null) {
                p0.mCityName = locationCity.mCityName;
                p0.mLatitude = locationCity.mLatitude;
                p0.mLongitude = locationCity.mLongitude;
             }
          }
          String str = "";
          String str1 = (TextUtils.x(p0.mCityName))? str: p0.mCityName;
          a.o(str1, "if \(TextUtils.isEmpty\(ci¡­       cityInfo.mCityName");
          if (!TextUtils.x(p0.mProvince)) {
             str = p0.mProvince;
          }
          a.o(str, "if \(TextUtils.isEmpty\(ci¡­\" else cityInfo.mProvince");
          boolean b = false;
          d.b(str1, str, b, 4, null);
          Object[] objArray = new Object[b];
          a.c.w("cityPick", p0.toString(), objArray);
          MapLocationAddressResponse$LocationAddress locationAddr = new MapLocationAddressResponse$LocationAddress();
          mCityName = p0.mCityName;
          locationAddr.mCity = mCityName;
          locationAddr.mProvince = p0.mProvince;
          MapActionBarPresenter u1 = this.a.u;
          if (u1 != null) {
             MapCenterInfo mapCenterInf = new MapCenterInfo(p0.mLatitude, p0.mLongitude, a.h(p0, mCityName), locationAddr, q.d.b());
             u1.c(objArray, "CHANGE_CITY");
          }
       }
       return;
    }
}
