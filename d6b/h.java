package d6b.h;
import com.yxcorp.gifshow.widget.m;
import d6b.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import vw5.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.yxcorp.gifshow.map.MapLogger;
import vw5.d;
import tw5.d;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import fm7.d;
import jrb.d;
import java.lang.Boolean;
import bsb.a;
import lrb.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nearby.common.model.PhotoMapPreLoadData$CenterLocationLatLng;
import com.kwai.nearby.startup.local.model.NearbyMapConfig;
import java.lang.reflect.Type;
import kn4.a;
import com.yxcorp.gifshow.nearby.common.model.PhotoMapPreLoadData;
import vw5.f;
import java.lang.Double;
import u5b.d;

public final class h extends m	// class@002463
{
    public final d c;

    public void h(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       CityInfo mRoamCityId;
       CityInfo mCityName;
       PhotoMapPreLoadData$CenterLocationLatLng mLatitude;
       PhotoMapPreLoadData$CenterLocationLatLng mLongitude;
       CityInfo uCityInfo2;
       CityInfo uCityInfo3;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       String str = "";
       if (!TextUtils.x(this.c.B)) {
          d.a(-2129868272).I1(this.c.B);
          h tc = this.c;
          tc.B = str;
          MapLogger.g(d.P8(tc), this.c.D);
          tc.D = false;
          return;
       }else {
          CityInfo uCityInfo = d.a(0x574d23bb).sW(d.R8(this.c).getType());
          int i = d.d(d.R8(this.c).getTypeValue()) ^ 0x01;
          d uod = d.class;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidThreeRefs(uCityInfo, Boolean.valueOf(i), Boolean.TRUE, null, d.class, "2")) {
             if (a.i(uCityInfo)) {
                mRoamCityId = a.h();
                if (mRoamCityId != null) {
                label_008d :
                   Object[] objArray = null;
                   PhotoMapPreLoadData$CenterLocationLatLng uCenterLocat = PatchProxy.apply(objArray, objArray, uod, "3");
                   if (uCenterLocat != PatchProxyResult.class) {
                   }else {
                      NearbyMapConfig nearbyMapCon = a.d(NearbyMapConfig.class);
                      if (nearbyMapCon == null || nearbyMapCon.mEnablePreload == null) {
                         d.b = objArray;
                      }
                      uCenterLocat = d.b;
                   }
                   CityInfo uCityInfo1 = null;
                   if (uCenterLocat != null) {
                      mLatitude = uCenterLocat.mLatitude;
                      mLongitude = uCenterLocat.mLongitude;
                   }else {
                      mLatitude = uCityInfo1;
                      mLongitude = mLatitude;
                   }
                   if (!mLatitude - uCityInfo1 && (!mLongitude - uCityInfo1 && mRoamCityId != null)) {
                      mLatitude = mRoamCityId.mLatitude;
                      mLongitude = mRoamCityId.mLongitude;
                   }
                label_00c4 :
                   if (!mLatitude - uCityInfo1 && !mLongitude - uCityInfo1) {
                      PhotoMapPreLoadData photoMapPreL = d.a();
                      if (photoMapPreL != null) {
                         photoMapPreL = photoMapPreL.mCenterLocationLatLng;
                         if (photoMapPreL != null) {
                            mLatitude = photoMapPreL.mLatitude;
                            mLongitude = photoMapPreL.mLongitude;
                         }
                      }
                   }
                   if (mRoamCityId != null) {
                      mCityName = mRoamCityId.mCityName;
                      uCityInfo2 = mRoamCityId.mProvince;
                      uCityInfo3 = mRoamCityId.mRoamCityId;
                   }else {
                      String str1 = str;
                      uCityInfo2 = str1;
                      uCityInfo3 = uCityInfo2;
                   }
                   d.a(0x54358588).Zk(Double.valueOf(mLatitude), Double.valueOf(mLongitude), a.g(mRoamCityId), mCityName, uCityInfo2, i, a.i(mRoamCityId), uCityInfo3, "1");
                }
             }
             mRoamCityId = uCityInfo;
             goto label_008d ;
          }
          h tc1 = this.c;
          if (uCityInfo != null) {
             mRoamCityId = uCityInfo.mRoamCityId;
             if (mRoamCityId != null) {
             label_0117 :
                tc1.A = mRoamCityId;
                if (uCityInfo != null) {
                   mCityName = uCityInfo.mCityName;
                   if (mCityName != null) {
                   label_0121 :
                      if (uCityInfo != null) {
                         uCityInfo = uCityInfo.mProvince;
                         if (uCityInfo != null) {
                            str = uCityInfo;
                         }
                      }
                      d.a(mCityName, str, false);
                      MapLogger.g(d.P8(this.c), this.c.D);
                      uCityInfo.D = false;
                      return;
                   }
                }
                mCityName = str;
                goto label_0121 ;
             }
          }
          mRoamCityId = str;
          goto label_0117 ;
       }
    }
}
