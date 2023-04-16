package o96.u;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import tk7.j;
import java.util.Objects;
import wk7.f;
import wk7.j;
import wk7.c;
import com.kwai.framework.location.k;
import sid.e0;
import java.lang.Number;
import com.kwai.framework.location.model.LocationCityInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.location.CurrentLocationCityManager;
import xf6.d;
import xf6.l;
import q96.d;
import com.yxcorp.utility.SystemUtil;
import e17.i;
import tk7.b;
import e66.b;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import p96.a;
import java.lang.StringBuilder;
import q87.c;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class u	// class@001fdc
{

    public void u(){
       super();
    }
    public static boolean a(String p0,String p1,String p2){
       object oobject = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, u.class, "43");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       j oj = j.g();
       Objects.requireNonNull(oj);
       obj = PatchProxy.applyFourRefs("location", p0, p1, p2, oj, j.class, "46");
       boolean b = false;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = new Object[]{oobject,p2,p1};
          f.a("PrivacyManager", String.format("needShowRequestPermissionDialog biz = %s, scene =%s statKey = %s", obj));
          boolean b1 = oj.j("location", p0);
          if (!b1 && oj.m("location")) {
             j.f("location", p0, p1, p2, true, 0x21ab8, "2", false, true);
             oj.s("location", p0, true);
             b1 = true;
          }
          if (b1 && c.b("location")) {
             b = true;
          }
       }
       if (b) {
          k.g(p0, true);
       }
       return b;
    }
    public static void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, u.class, "32")) {
          return;
       }
       e0.a(p0);
       return;
    }
    public static long c(){
       Object obj = PatchProxy.apply(null, null, u.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return e0.c();
    }
    public static LocationCityInfo d(){
       Object obj = PatchProxy.apply(null, null, u.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u.e(null);
    }
    public static LocationCityInfo e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = "IGNORE_FEATURE_KEY";
       }
       if ("IGNORE_FEATURE_KEY".equals(p0)) {
          return CurrentLocationCityManager.getInstance().getLocationCityInfo();
       }else if(k.c(p0)){
          return CurrentLocationCityManager.getInstance().getLocationCityInfo();
       }else {
          return null;
       }
    }
    public static LocationCityInfo f(){
       Object obj = PatchProxy.apply(null, null, u.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u.g(null);
    }
    public static LocationCityInfo g(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, u.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = l.g("key_last_migrate_city", "");
       LocationCityInfo locationCity = (!TextUtils.isEmpty(obj))? new LocationCityInfo(obj): CurrentLocationCityManager.getInstance().getValidLocationCity(p0);
       return locationCity;
    }
    public static boolean h(){
       Object obj = PatchProxy.apply(null, null, u.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return CurrentLocationCityManager.getInstance().isLocationMigrate();
    }
    public static void i(d p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, u.class, "17")) {
          return;
       }
       CurrentLocationCityManager.getInstance().registerObserver(p0, p1);
       return;
    }
    public static void j(boolean p0,String p1,String p2,String p3){
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, null, u.class, "5")) {
          return;
       }
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[]{p1,Boolean.valueOf(p0),Boolean.FALSE,p2,p3};
          if (PatchProxy.applyVoid(objArray, null, ou, "8")) {
          label_0063 :
             return;
          }
       }
       CurrentLocationCityManager instance = CurrentLocationCityManager.getInstance();
       String str = (p0)? "": p2;
       instance.requestLocation(p1, "", "", p0, false, null, p2, p3, str, true, "amap");
       goto label_0063 ;
    }
    public static void k(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, u.class, "36")) {
          return;
       }
       CurrentLocationCityManager.getInstance().requestLocation(p0, p1, p2);
       return;
    }
    public static void l(String p0,String p1,String p2,String p3,d p4){
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, ou, "15")) {
             return;
          }
       }
       CurrentLocationCityManager.getInstance().requestLocation(p0, "", "", TextUtils.isEmpty(p1), false, p4, p1, p3, p2);
       return;
    }
    public static void m(String p0,String p1,String p2,boolean p3,boolean p4,d p5,String p6,String p7,String p8){
       object oobject = p0;
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, null, ou, "14")) {
             return;
          }
       }
       int i = 0x7f110668;
       if (TextUtils.isEmpty(p0) || p0.equals("default")) {
          if (SystemUtil.K()) {
             i.d(i, "key不能为空，也不能使用默认key");
          }
          return;
       }else if(TextUtils.isEmpty(p2)){
          if (SystemUtil.K()) {
             i.d(i, "副标题不能为空");
          }
          return;
       }else {
          CurrentLocationCityManager.getInstance().requestLocation(p0, p1, p2, p3, p4, p5, p6, p7, p8);
          return;
       }
    }
    public static void n(String p0,boolean p1,boolean p2,d p3,String p4,String p5,String p6){
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Boolean.valueOf(p2),p3,p4,p5,p6};
          if (PatchProxy.applyVoid(objArray, null, ou, "13")) {
             return;
          }
       }
       CurrentLocationCityManager.getInstance().requestLocation(p0, "", "", p1, p2, p3, p4, p5, p6);
       return;
    }
    public static void o(boolean p0,d p1,String p2,String p3,String p4){
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, ou, "6")) {
             return;
          }
       }
       String str = (p0)? "": p3;
       u.n(p2, p0, false, p1, p3, p4, str);
       return;
    }
    public static void p(String p0,String p1,String p2,String p3,d p4,b p5){
       u ou = u.class;
       if (PatchProxy.isSupport(ou)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, ou, "37")) {
             return;
          }
       }
       CurrentLocationCityManager.getInstance().requestLocationWithCustomDialog(p0, p1, p2, p3, p4, p5);
       return;
    }
    public static void q(d p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, u.class, "18")) {
          return;
       }
       CurrentLocationCityManager.getInstance().unregisterObserver(p0, p1);
       return;
    }
    public static void r(){
       boolean b;
       if (PatchProxy.applyVoid(null, null, u.class, "3")) {
          return;
       }
       if (b.a.getBoolean("hasUpdatedUserPermission", false)) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.add("default");
       uArrayList.add("IGNORE_FEATURE_KEY");
       uArrayList.add("post_dynamic_avatar");
       uArrayList.add("live_author");
       uArrayList.add("live_square");
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          b = k.a(str);
          Object[] objArray = new Object[false];
          a.C().w("updateBizUserPermissionInfo", str+" isHavePermission = "+b, objArray);
          if (b) {
             j.g().s("location", str, true);
          }
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("hasUpdatedUserPermission", true);
       g.a(uEditor);
       return;
    }
    public static void s(){
       if (PatchProxy.applyVoid(null, null, u.class, "25")) {
          return;
       }
       CurrentLocationCityManager.getInstance().updateMigrate();
       return;
    }
    public static void t(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(u.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, u.class, "35")) {
          return;
       }
       CurrentLocationCityManager.getInstance().updateUserPermissionStatus(p0, p1, p2, p3);
       return;
    }
}
