package bsb.a;
import java.lang.Object;
import java.lang.AssertionError;
import com.kwai.feature.api.social.nearby.model.CityInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import lrb.a;
import ok.k;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import tkd.b;
import tkd.d;
import vw5.d;
import com.kwai.framework.location.k;
import tw5.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.location.model.LocationCityInfo;
import com.kwai.framework.location.util.LocationCityUtil;

public final class a	// class@00045f
{

    public void a(){
       super();
       throw new AssertionError("no instance");
    }
    public static boolean a(CityInfo p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = null;
       CityInfo obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, "6");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       obj1 = a.d();
       Object obj2 = PatchProxy.applyTwoRefs(p0, obj1, obj, uoa, "4");
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else if(p0 != null && (obj1 != null && (k.a(p0.mCityName, obj1.mCityName) && k.a(p0.mDistrict, obj1.mDistrict)))){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public static CityInfo b(){
       Object obj = PatchProxy.apply(null, null, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CityInfo(true);
    }
    public static String c(LocalDelegateType p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.d(d.a(0x574d23bb).sW(p0));
    }
    public static String d(CityInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.i(p0) || (!k.c("default") || (a.a(p0) || !a.k(p0)))) {
          return "";
       }
       return p0.mRoamCityId;
    }
    public static CityInfo e(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CityInfo uCityInfo = p0.d();
       if (uCityInfo != null && !TextUtils.x(uCityInfo.mCityName)) {
          return uCityInfo;
       }
       uCityInfo = a.h();
       if (!a.k(uCityInfo)) {
          uCityInfo = a.d();
       }
       return uCityInfo;
    }
    public static String f(d p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = p0.c();
       if (!TextUtils.x(str)) {
          return str;
       }
       CityInfo uCityInfo = a.h();
       if (!a.k(uCityInfo)) {
          uCityInfo = a.d();
       }
       return a.g(uCityInfo);
    }
    public static String g(CityInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!a.k(p0)) {
          return "";
       }
       if (TextUtils.x(p0.mDistrict)) {
          return p0.mCityName;
       }
       return p0.mDistrict;
    }
    public static String h(CityInfo p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = a.g(p0);
       if (!TextUtils.x(str)) {
          p1 = str;
       }
       return p1;
    }
    public static boolean i(CityInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.isLocal() || (TextUtils.x(p0.mCityName) && TextUtils.x(p0.mDistrict))))? true: false;
       return b;
    }
    public static boolean j(LocalDelegateType p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoa, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       CityInfo uCityInfo = d.a(0x574d23bb).sW(p0);
       boolean b = false;
       if (uCityInfo != null && !a.i(uCityInfo)) {
          Object obj1 = PatchProxy.applyOneRefs(uCityInfo, null, uoa, "3");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(a.i(uCityInfo) || a.i(a.d())){
             b1 = false;
          }else {
             b1 = a.a(uCityInfo);
          }
          if (!b1) {
          label_0053 :
             return b;
          }
       }
    label_0052 :
       b = true;
       goto label_0053 ;
    }
    public static boolean k(CityInfo p0){
       boolean b1;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoa, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.i(p0)) {
          return b;
       }
       if (!TextUtils.x(p0.mCityName) && !("NULL").equalsIgnoreCase(p0.mCityName)) {
          return true;
       }
       Object obj1 = PatchProxy.applyOneRefs(p0, null, uoa, "16");
       if (obj1 != PatchProxyResult.class) {
          b1 = obj1.booleanValue();
       }else if(!TextUtils.x(p0.mDistrict)){
          b = 1;
       }
       b1 = b;
       return b1;
    }
    public static CityInfo l(LocationCityInfo p0){
       CityInfo obj = PatchProxy.applyOneRefs(p0, null, a.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = LocationCityUtil.g(p0);
       if (p0 == null || TextUtils.x(p0.mCityName)) {
          return a.b();
       }
       obj = new CityInfo();
       obj.mCityName = p0.mCityName;
       obj.mLatitude = p0.mLatitude;
       obj.mLongitude = p0.mLongitude;
       obj.mProvince = p0.mProvince;
       return obj;
    }
}
