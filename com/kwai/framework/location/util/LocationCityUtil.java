package com.kwai.framework.location.util.LocationCityUtil;
import com.kwai.framework.location.util.LocationCityUtil$1;
import java.lang.Object;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import xf6.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import sid.e0;
import hyb.d;
import p96.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import android.content.Context;
import android.widget.Toast;
import java.util.Iterator;
import java.util.List;

public class LocationCityUtil	// class@000b87
{
    public static final List a;

    static {
       LocationCityUtil.a = new LocationCityUtil$1();
    }
    public void LocationCityUtil(){
       super();
    }
    public static LocationCityInfo a(LocationCityInfo p0){
       String obj = PatchProxy.applyOneRefs(p0, null, LocationCityUtil.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!SystemUtil.K()) {
          return p0;
       }
       obj = i.h("KEY_FAKE_LOCATION");
       if (!TextUtils.x(obj)) {
          e0.a(obj);
          p0 = LocationCityUtil.e(e0.d());
          a uoa = a.C();
          StringBuilder str = "[fakeLocationCheck] Mock Location : ";
          LocationCityInfo mCityName = (p0 != null)? p0.mCityName: "";
          Object[] objArray = new Object[0];
          uoa.w("ks.location.log:SDK", str+mCityName, objArray);
       }
       return p0;
    }
    public static String b(LocationCityInfo p0){
       LocationCityInfo obj = PatchProxy.applyOneRefs(p0, null, LocationCityUtil.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       obj = p0.mCityName;
       if (!LocationCityUtil.c(p0) && !TextUtils.x(p0.mProvince)) {
          obj = p0.mProvince;
       }
       return obj;
    }
    public static boolean c(LocationCityInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocationCityUtil.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (!TextUtils.x(p0.mCityName) && !("NULL").equals(p0.mCityName)))? true: false;
       return b;
    }
    public static boolean d(LocationCityInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LocationCityUtil.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (LocationCityUtil.c(p0) || (p0 != null && !TextUtils.x(p0.mProvince)))? true: false;
       return b;
    }
    public static LocationCityInfo e(d p0){
       Object obj = null;
       LocationCityInfo obj1 = PatchProxy.applyOneRefs(p0, obj, LocationCityUtil.class, "3");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new LocationCityInfo();
       obj1.mCityName = p0.mCity;
       obj1.mProvince = p0.mProvince;
       obj1.mLatitude = p0.getLatitude();
       obj1.mLongitude = p0.getLongitude();
       obj1.mAddress = p0.getAddress();
       obj1.mCountry = p0.mCountry;
       obj1.mStreet = p0.mStreet;
       obj1.mCounty = p0.mCounty;
       return obj1;
    }
    public static void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, LocationCityUtil.class, "2")) {
          return;
       }
       if (SystemUtil.K() && i.c("KEY_LOCAL_LOCATION_TOAST")) {
          Toast.makeText(a.b(), p0, 0).show();
       }
       return;
    }
    public static LocationCityInfo g(LocationCityInfo p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LocationCityUtil locationCity = LocationCityUtil.class;
       String obj = null;
       LocationCityInfo obj1 = PatchProxy.applyOneRefs(p0, obj, locationCity, "5");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = new LocationCityInfo();
       LocationCityInfo locationCity1 = PatchProxy.applyOneRefs(p0, obj, locationCity, "6");
       if (locationCity1 != patchProxyRe) {
       }else {
          String str1 = "NULL";
          if (TextUtils.x(p0.mCityName) || str1.equals(p0.mCityName)) {
             locationCity1 = (TextUtils.x(p0.mProvince) || str1.equals(p0.mProvince))? obj: p0.mProvince;
          }else {
             locationCity1 = p0.mCityName;
          }
          if (!TextUtils.x(locationCity1)) {
             if (locationCity1.endsWith("市")) {
                locationCity1 = locationCity1.substring(0, (locationCity1.length() - 1));
             }else if(locationCity1.endsWith("地区")){
                locationCity1 = locationCity1.substring(0, (locationCity1.length() - 2));
             }
          }else {
             locationCity1 = p0.mCityName;
          }
       }
       obj1.mCityName = locationCity1;
       obj1.mLatitude = p0.mLatitude;
       obj1.mLongitude = p0.mLongitude;
       String str = PatchProxy.applyOneRefs(p0, obj, locationCity, "7");
       if (str != patchProxyRe) {
       }else {
          LocationCityInfo mProvince = p0.mProvince;
          if (!TextUtils.x(mProvince)) {
             if (mProvince.endsWith("省") || mProvince.endsWith("市")) {
                mProvince = mProvince.substring(0, (mProvince.length() - 1));
             }else {
                Iterator iterator = LocationCityUtil.a.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj = iterator.next();
                      if (mProvince.contains(obj)) {
                         str = obj;
                         break ;
                      }
                   }
                }
             }
          }
          str = mProvince;
       }
       obj1.mProvince = str;
       obj1.mAddress = p0.mAddress;
       obj1.mCountry = p0.mCountry;
       obj1.mStreet = p0.mStreet;
       obj1.mCounty = p0.mCounty;
       return obj1;
    }
}
