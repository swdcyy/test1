package com.yxcorp.gifshow.map.container.MapActionBarPresenter$c;
import erd.g;
import com.yxcorp.gifshow.map.container.MapActionBarPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import g6b.c;
import com.yxcorp.gifshow.map.map.model.MapCenterInfo;
import com.yxcorp.gifshow.map.data.model.MapLocationAddressResponse$LocationAddress;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import yz6.f;
import yz6.i;
import yz6.g;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import tw5.d;
import kotlin.jvm.internal.a;
import u5b.d;

public final class MapActionBarPresenter$c implements g	// class@001c68
{
    public final MapActionBarPresenter b;
    public final boolean c;

    public void MapActionBarPresenter$c(MapActionBarPresenter p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       c a;
       if (PatchProxy.applyVoidOneRefs(p0, this, MapActionBarPresenter$c.class, "1")) {
       }else {
          MapActionBarPresenter$c tb = this.b;
          MapActionBarPresenter$c tc = this.c;
          Objects.requireNonNull(tb);
          MapActionBarPresenter mapActionBar = MapActionBarPresenter.class;
          if (PatchProxy.isSupport(mapActionBar) && (!PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(tc), tb, mapActionBar, "15") && p0 != null)) {
             p0 = p0.mAddress;
             if (p0 != null) {
                mapActionBar = tb.u;
                if (mapActionBar != null) {
                   c f = mapActionBar.f;
                   if (f != null) {
                      String str = "";
                      if (tc != null) {
                         f.mDefaultTitle = str;
                      }
                      f.mAddress = p0;
                      String str1 = (TextUtils.x(p0.mCity))? str: p0.mCity;
                      String str2 = (TextUtils.x(p0.mProvince))? str: p0.mProvince;
                      MapActionBarPresenter u = tb.u;
                      if (u != null) {
                         a = u.a;
                         if (a != null) {
                            f map = a.getMap();
                            if (map != null) {
                               g mapStatus = map.getMapStatus();
                               if (mapStatus != null) {
                                  if (mapStatus.getZoom() - 0x41500000 < 0) {
                                     p0 = p0.mCity;
                                     if (p0 != null) {
                                     label_0080 :
                                        str = p0;
                                     }
                                  }else {
                                     p0 = p0.mDistrict;
                                     if (p0 != null) {
                                        goto label_0080 ;
                                     }
                                  }
                                  if (tc != null) {
                                     p0 = tb.X8(str);
                                     tb.z = p0;
                                     f.mRealDisplayTitle = p0;
                                  }else {
                                     p0 = tb.X8(f.mDefaultTitle);
                                  }
                                  tb.P8(p0, str1, str2);
                                  CityInfo uCityInfo = tb.B.d();
                                  if (uCityInfo != null) {
                                     uCityInfo.mCityName = p0;
                                  }
                                  tb.B.b(uCityInfo);
                               }
                            }
                         }
                      }
                      a.o(str1, "city");
                      a.o(str2, "province");
                      d.b(str1, str2, false, 4, null);
                   }
                }
             }
          }
       }
       return;
    }
}
