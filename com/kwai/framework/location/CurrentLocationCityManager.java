package com.kwai.framework.location.CurrentLocationCityManager;
import java.lang.Object;
import com.kwai.framework.location.CurrentLocationCityManager$a;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import e66.e;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import hyb.d;
import sid.e0;
import com.kwai.framework.location.model.LocationCityInfo;
import com.kwai.framework.location.util.LocationCityUtil;
import org.greenrobot.eventbus.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.kwai.framework.location.j;
import com.kwai.framework.location.k;
import q96.d;
import brd.v;
import tk7.b;
import v96.b;
import brd.g;
import java.lang.Throwable;
import android.app.Activity;
import zq8.a;
import brd.w;
import sid.j;
import p96.a;
import java.lang.StringBuilder;
import q87.c;
import s96.a;
import u07.t;
import android.view.View;
import java.lang.System;
import com.kwai.framework.location.util.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import tk7.j;
import com.kwai.framework.location.CurrentLocationCityManager$b;
import tk7.d;
import q96.a;
import xa7.b;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import kzc.d;
import u07.t$a;
import com.kwai.framework.location.a;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import o96.p;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import java.lang.Integer;
import o96.n;
import wk7.j;
import com.kwai.robust.PatchProxyResult;
import o96.f;
import sid.s;
import com.kwai.framework.location.CurrentLocationCityManager$c;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import q2b.h$b;
import k2b.e0;
import o96.k;
import io.reactivex.g;
import t45.d;
import brd.z;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import o96.b;
import com.yxcorp.plugin.tencent.map.MapLocationManager;
import o96.q;
import o96.d;
import o96.e;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.util.Collection;
import ekd.q;
import sid.g;
import com.yxcorp.plugin.tencent.map.KwaiMapLocation;
import xf6.i;
import o96.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import o96.a;
import p96.b;
import java.lang.Double;
import java.lang.Number;
import kotlin.jvm.internal.a;
import o96.h;
import java.util.concurrent.Future;
import t45.c;
import java.lang.Long;
import sid.e;
import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import q96.f;
import com.kwai.framework.location.locationupload.h;
import android.location.Location;
import m56.b;
import o56.f;
import o56.f$a;
import com.kwai.framework.location.b;
import m56.f;
import com.yxcorp.utility.SystemUtil;
import o96.i;
import e17.i;
import lnc.a1;
import o96.g;
import o96.j;
import java.util.UUID;
import o96.o;
import com.tbruyelle.rxpermissions2.g;
import o96.m;
import erd.o;
import o96.l;
import java.util.List;
import java.util.Objects;
import uk7.b;
import java.util.Map;

public class CurrentLocationCityManager	// class@000b7b
{
    public String mBizForSetting;
    public boolean mFirst;
    public boolean mGpsOn;
    public boolean mHasLocationPermission;
    public a mIKLocationStat;
    public boolean mIsLocationMigrate;
    public long mLocationEndTime;
    public long mLocationStartTime;
    public String[] mMigrateCityName;
    public final ConcurrentHashMap mMigrateObservers;
    public final ConcurrentHashMap mObservers;
    public String mPopSessionIdForSetting;
    public String mSceneForSetting;
    public final ConcurrentHashMap mSeqRequestTasks;
    public String mStatKeyForSetting;
    public LocationCityInfo mValidLocationCity;
    public static final int ERROR_MOCK = 64535;
    public static final int RES_CANCEL_ID = 2131767369;
    public static final int RES_SUB_TITLE_ID = 2131767380;
    public static final int RES_SURE_ID = 2131757026;
    public static final int RES_TITLE_ID = 2131774092;
    public static final String TAG = "ks.location.log:SDK";
    public static final String TENCENT = "Tencent";
    public static final CurrentLocationCityManager sInstance;

    static {
       CurrentLocationCityManager.sInstance = new CurrentLocationCityManager();
    }
    public void CurrentLocationCityManager(){
       super();
       this.mIKLocationStat = new CurrentLocationCityManager$a(this);
       this.mObservers = new ConcurrentHashMap();
       this.mSeqRequestTasks = new ConcurrentHashMap();
       String[] stringArray = String[].class;
       String str = e.a.getString("last_migrate_info_array", "");
       stringArray = (str == null || str == "")? null: b.a(str, stringArray);
       this.mMigrateCityName = stringArray;
       this.mMigrateObservers = new ConcurrentHashMap();
       this.setMockLocation();
       this.mValidLocationCity = LocationCityUtil.e(e0.d());
       a.d().p(this);
       this.mHasLocationPermission = j.d(a.b());
       this.mGpsOn = k.f();
       return;
    }
    public static void a(CurrentLocationCityManager p0,String p1,d p2){
       p0.lambda$getLocationInfoFromCache$2(p1, p2);
    }
    public static void b(CurrentLocationCityManager p0,String p1,String p2,String p3,v p4){
       p0.lambda$requestLocation$11(p1, p2, p3, p4);
    }
    public static void c(CurrentLocationCityManager p0,String p1,String p2,String p3,String p4,String p5,boolean p6,String p7,b p8,d p9,boolean p10,String p11,v p12){
       p0.lambda$getLocation$1(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
    }
    public static void d(CurrentLocationCityManager p0,LocationCityInfo p1,String p2,String p3,String p4,d p5,boolean p6){
       p0.lambda$locationSuccess$16(p1, p2, p3, p4, p5, p6);
    }
    public static void e(CurrentLocationCityManager p0,b p1,String p2,String p3,String p4,g p5,d p6,Throwable p7){
       p0.lambda$requestSystemPermission$9(p1, p2, p3, p4, p5, p6, p7);
    }
    public static w f(CurrentLocationCityManager p0,b p1,String p2,String p3,boolean p4,g p5,String p6,d p7,Activity p8,String p9,a p10){
       return p0.lambda$requestSystemPermission$8(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }
    public static void g(CurrentLocationCityManager p0,Activity p1,String p2,String p3,String p4,String p5,String p6,String p7,b p8,boolean p9,b p10,String p11,String p12,String p13,boolean p14,g p15,d p16,boolean p17,String p18,boolean p19,boolean p20){
       p0.lambda$requestPermissionFromUser$5(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20);
    }
    public static CurrentLocationCityManager getInstance(){
       return CurrentLocationCityManager.sInstance;
    }
    public static void h(CurrentLocationCityManager p0,String p1,d p2,int p3,String p4){
       p0.lambda$handleRequestLocationError$13(p1, p2, p3, p4);
    }
    public static void i(CurrentLocationCityManager p0,String p1,d p2){
       p0.lambda$locationSuccess$15(p1, p2);
    }
    public static void j(CurrentLocationCityManager p0,String p1,String p2,boolean p3,g p4,String p5,String p6,d p7,b p8){
       p0.lambda$checkSystemPermission$6(p1, p2, p3, p4, p5, p6, p7, p8);
    }
    public static void k(CurrentLocationCityManager p0,d p1){
       p0.lambda$cancelSeqTask$14(p1);
    }
    public static void l(CurrentLocationCityManager p0,String p1,String p2,String p3,d p4,String p5,boolean p6,v p7){
       p0.lambda$requestLocationWithoutBusinessDialog$0(p1, p2, p3, p4, p5, p6, p7);
    }
    private void lambda$cancelSeqTask$14(d p0){
       j oj = this.mSeqRequestTasks.remove(p0);
       if (oj != null) {
          oj.d();
          p0.onFinish();
       }
       return;
    }
    public static void lambda$checkGPSSwitch$7(Activity p0,String p1,String p2,boolean p3,String p4,String p5,int p6){
       j.i(p0, p1, p2, p3, p4, p5, p6);
    }
    private void lambda$checkSystemPermission$6(String p0,String p1,boolean p2,g p3,String p4,String p5,d p6,b p7){
       this.handleSystemPermission(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    private void lambda$getLocation$1(String p0,String p1,String p2,String p3,String p4,boolean p5,String p6,b p7,d p8,boolean p9,String p10,v p11){
       this.requestPermissionFromUser(p0, p1, p2, p3, p4, (p5 ^ 0x01), p11, p6, p7, p8, p9, p10);
    }
    private void lambda$getLocationInfoFromCache$2(String p0,d p1){
       this.notifyStartLocation(p0, p1);
    }
    private void lambda$getLocationInfoFromCache$3(LocationCityInfo p0,d p1,boolean p2,String p3){
       this.notifySuccessLocation(true, LocationCityUtil.a(p0), p1, p2, p3);
    }
    private void lambda$getLocationInfoFromCache$4(String p0,d p1){
       this.notifyLocationError(p0, 0x271e, "no cache", p1);
    }
    private void lambda$handleRequestLocationError$13(String p0,d p1,int p2,String p3){
       this.notifyStartLocation(p0, p1);
       this.notifyLocationError(p0, p2, p3, p1);
    }
    private void lambda$locationSuccess$15(String p0,d p1){
       this.notifyLocationError(p0, -1001, "Mock Location Error", p1);
    }
    private void lambda$locationSuccess$16(LocationCityInfo p0,String p1,String p2,String p3,d p4,boolean p5){
       if (LocationCityUtil.d(p0)) {
          this.mValidLocationCity = p0;
          this.mIsLocationMigrate = this.checkMigrate(LocationCityUtil.b(p0));
          Object[] objArray = new Object[0];
          a.C().w("ks.location.log:SDK", "[locationSuccess] isLocationMigrate = "+this.mIsLocationMigrate, objArray);
       }
       Object[] objArray1 = new Object[0];
       a.C().w("ks.location.log:SDK", "[locationSuccess] : featureKey = "+p1+" statKey = "+p2+" scene = "+p3+"City = "+p0+" | mValidLocationCity City = "+this.mValidLocationCity, objArray1);
       this.notifySuccessLocation(false, p0, p4, p5, p3);
       this.disposeMigrate(this.mValidLocationCity);
       LocationCityUtil.f("定位成功 实时->"+p0.toString());
       return;
    }
    public static void lambda$logForPermissionSetting$17(String p0,String p1,String p2,String p3){
       boolean b = k.e(a.B);
       String str = (b)? "CONFIRM": "CANCAL";
       a.a(p0, str, "SETTINGS", p1, p2, p3, b, k.f());
       return;
    }
    public static void lambda$onActivityCreate$18(){
       a.g("LAUNCH");
    }
    public static void lambda$presentAlertAndExitForPermission$12(t p0,View p1){
       System.exit(0);
    }
    private void lambda$requestLocation$10(boolean p0,d p1,j p2,String p3){
       if (!p0 && p1 != null) {
          j oj = this.mSeqRequestTasks.put(p1, p2);
          if (oj != null) {
             oj.d();
             p1.onFinish();
          }
       }
       this.notifyStartLocation(p3, p1);
       return;
    }
    private void lambda$requestLocation$11(String p0,String p1,String p2,v p3){
       Object[] objArray = new Object[0];
       a.C().w("ks.location.log:SDK", "[requestLocationForYoda] scene = "+p0+" statKey = "+p1, objArray);
       a.e(p2, p0, p1);
       this.requestLocation(p2, p0, true, p3, p1, null);
    }
    private void lambda$requestLocationWithoutBusinessDialog$0(String p0,String p1,String p2,d p3,String p4,boolean p5,v p6){
       this.requestLocation(p0, p1, (TextUtils.isEmpty(p1) ^ 0x01), p6, p2, p3, true, p4, p5);
    }
    private void lambda$requestPermissionFromUser$5(Activity p0,String p1,String p2,String p3,String p4,String p5,String p6,b p7,boolean p8,b p9,String p10,String p11,String p12,boolean p13,g p14,d p15,boolean p16,String p17,boolean p18,boolean p19){
       CurrentLocationCityManager$b uob = new CurrentLocationCityManager$b(this, p7, p8, p9, p1, p10, p11, p12, p0, p13, p14, p15, p16, p17, p2, p18);
       j.g().p(p0, p1, p2, "location", p3, p4, p5, p6, v18, (p19 ^ 0x01), p11, p9);
    }
    private w lambda$requestSystemPermission$8(b p0,String p1,String p2,boolean p3,g p4,String p5,d p6,Activity p7,String p8,a p9){
       CurrentLocationCityManager uCurrentLoca;
       a uoa = p9;
       p0.b();
       boolean b = (uoa.b == null && uoa.c == null)? true: false;
       e.c(b);
       if (uoa.b != null) {
          uCurrentLoca = this;
          uCurrentLoca.requestLocation(p1, p2, p3, p4, p5, p6);
          this.checkGPSSwitch(p7, p1, true, p8, p5, p2, p0.c());
       }else {
          this.handleRequestLocationError(p1, 0x271d, p4, "reject locationPermission", p6);
          uCurrentLoca = this;
       }
       uCurrentLoca.mIKLocationStat.e(p1, p5, p2, uoa.b, p8, p0.c());
       return t.just(new b());
    }
    private void lambda$requestSystemPermission$9(b p0,String p1,String p2,String p3,g p4,d p5,Throwable p6){
       p0.b();
       this.mIKLocationStat.d(p1, p2, p3, 0x2720);
       a.C().e("ks.location.log:SDK", "getSystemPermission failed", p6);
       this.handleRequestLocationError(p1, 0x2720, p4, "getSystemPermission error", p5);
    }
    public static void m(CurrentLocationCityManager p0,String p1,d p2){
       p0.lambda$getLocationInfoFromCache$4(p1, p2);
    }
    public static void n(CurrentLocationCityManager p0,LocationCityInfo p1,d p2,boolean p3,String p4){
       p0.lambda$getLocationInfoFromCache$3(p1, p2, p3, p4);
    }
    public static void o(CurrentLocationCityManager p0,boolean p1,d p2,j p3,String p4){
       p0.lambda$requestLocation$10(p1, p2, p3, p4);
    }
    public static void presentAlertAndExitForPermission(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, CurrentLocationCityManager.class, "20")) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       if (uActivity == null) {
          return;
       }
       d uod = new d(uActivity);
       uod.X0("隐私合规 "+p0);
       uod.z0("您使用的Yoda SDK版本过低, 请更新; 或联系隐私合规团队@shaohua03, @tianying03进行隐私合规评估; 本弹窗不影响线上环境逻辑。\n点击我知道了后App将退出!");
       uod.x0(1);
       uod.T0("我知道了");
       uod.u0(a.b);
       uod.v(1);
       uod.z(false);
       f.e(uod).Y(PopupInterface.a);
       return;
    }
    public void cancelSeqTask(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CurrentLocationCityManager.class, "22")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       k1.o(new p(this, p0));
       return;
    }
    public final void checkGPSSwitch(Activity p0,String p1,boolean p2,String p3,String p4,String p5,int p6){
       CurrentLocationCityManager uCurrentLoca = this;
       object oobject = p1;
       object oobject1 = p4;
       object oobject2 = p5;
       CurrentLocationCityManager uCurrentLoca1 = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca1)) {
          Object[] objArray = new Object[]{p0,oobject,Boolean.valueOf(p2),p3,oobject1,oobject2,Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca1, "13")) {
             return;
          }
       }
       if (j.e()) {
          n on = new n(p0, p1, p3, p2, p4, p5, p6);
          k1.o(v9);
       }else {
          uCurrentLoca.mIKLocationStat.g(p1, p2, oobject1, oobject2);
          if (!k.f()) {
             j.f(p0);
             j.f("location", p1, p4, p5, true, 0x21ab7, "2", 0, 0);
          }
       }
       return;
    }
    public final boolean checkMigrate(String p0){
       CurrentLocationCityManager obj = PatchProxy.applyOneRefs(p0, this, CurrentLocationCityManager.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mMigrateCityName;
       int i = 2;
       int i1 = 0;
       if (obj == null || obj.length != i) {
          String[] stringArray = new String[i];
          stringArray[i1] = p0;
          stringArray[1] = p0;
          this.mMigrateCityName = stringArray;
          e.e(stringArray);
          return i1;
       }else {
          Object[] objArray = new Object[i1];
          a.C().w("ks.location.log:SDK", "[checkMigrate] curCityName = "+p0+" | LastCityName = "+this.mMigrateCityName[1], objArray);
          return (p0.equalsIgnoreCase(this.mMigrateCityName[1]) ^ 1);
       }
    }
    public void checkSystemPermission(Activity p0,String p1,String p2,boolean p3,g p4,String p5,String p6,d p7,boolean p8,String p9,b p10){
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[11];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = Boolean.valueOf(p8);
          objArray[9] = p9;
          objArray[10] = p10;
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "12")) {
             return;
          }
       }else {
          int i = this;
       }
       if (k.e(a.B)) {
          CurrentLocationCityManager uCurrentLoca1 = this;
          String str = p6;
          uCurrentLoca1.requestLocation(p1, p2, p3, p4, str, p7, p8, p9);
          uCurrentLoca1.checkGPSSwitch(p0, p1, false, p5, str, p2, p10.c());
       }else {
          f uof = new f(this, p1, p2, p3, p4, p5, p6, p7, p10);
          k1.o(uCurrentLoca);
       }
       return;
    }
    public final s createLocationCallbackAdapter(String p0,j p1,g p2,String p3,String p4,d p5,boolean p6){
       Object obj;
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, this, uCurrentLoca, "31");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       CurrentLocationCityManager$c uoc = new CurrentLocationCityManager$c(this, p0, p3, p4, p5, p6, p1, p2);
       return obj;
    }
    public final void disposeMigrate(LocationCityInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CurrentLocationCityManager.class, "35")) {
          return;
       }
       if (LocationCityUtil.d(p0) && this.mIsLocationMigrate != null) {
          String str = LocationCityUtil.b(p0);
          object oobject = this.mMigrateCityName[1];
          String[] stringArray = new String[]{oobject,str};
          e.e(stringArray);
          CurrentLocationCityManager tmMigrateCit = this.mMigrateCityName;
          tmMigrateCit[0] = oobject;
          tmMigrateCit[1] = str;
          String str1 = "ks.location.log:SDK";
          u1.Q(str1, "Migrate success from "+oobject+" to "+str);
          Object[] objArray = new Object[0];
          a.C().w(str1, "[disposeMigrate] success from "+oobject+" to "+str, objArray);
          this.notifyMigrate(p0);
          if (!PatchProxy.applyVoidOneRefs(str, null, a.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CITY_MOVE";
             i3 oi3 = i3.f();
             oi3.d("moved_city_name", str);
             uElementPack.params = oi3.e();
             h$b uob = h$b.e(0, "CITY_MOVE");
             uob.k(uElementPack);
             u1.p0("2883040", null, uob);
          }
       }
       return;
    }
    public String getLastMigrateCityName(){
       CurrentLocationCityManager tmMigrateCit = this.mMigrateCityName;
       if (tmMigrateCit == null || tmMigrateCit.length != 2) {
          return "";
       }
       return tmMigrateCit[0];
    }
    public final void getLocation(String p0,String p1,String p2,boolean p3,boolean p4,d p5,String p6,String p7,String p8,b p9,boolean p10,String p11){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p5;
       object oobject4 = p6;
       object oobject5 = p7;
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       int i = 0;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[12];
          objArray[i] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = oobject3;
          objArray[6] = oobject4;
          objArray[7] = oobject5;
          objArray[8] = p8;
          objArray[9] = p9;
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = p11;
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "9")) {
             return;
          }
       }else {
          int i1 = this;
       }
       a.e(oobject, oobject5, oobject4);
       Object[] objArray1 = new Object[i];
       a.C().w("ks.location.log:SDK", "[getLocation]: featureKey = "+oobject+" statKey = "+oobject5+" scene = "+oobject4+" | title = "+oobject1+" | subTitle = "+oobject2+"| enable location Interval = "+p3+" | enable dialog Time Limit = "+p4+" | One to one listener = "+oobject3, objArray1);
       Object[] objArray2 = new Object[i];
       a.C().w("ks.location.log:SDK", "[getLocation] permission: mGpsOn = "+k.f()+" | system_permission =  "+j.d(a.b())+" | "+oobject+" : Key_permission = "+j.c(p0), objArray2);
       k ok = new k(this, p0, p6, p7, p1, p2, p3, p8, p9, p5, p10, p11);
       t.create(v14).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), Functions.e);
       return;
    }
    public LocationCityInfo getLocationCityInfo(){
       Object obj = PatchProxy.apply(null, this, CurrentLocationCityManager.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LocationCityUtil.e(e0.d());
    }
    public final int getLocationErrorCode(int p0){
       if (!p0) {
          return 0;
       }
       if (p0 != 0x21ab6) {
          return 0x2720;
       }
       return 0x271e;
    }
    public final void getLocationInfoFromCache(String p0,String p1,d p2,boolean p3){
       if (PatchProxy.isSupport(CurrentLocationCityManager.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, CurrentLocationCityManager.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("ks.location.log:SDK", "getLocationInfoFromCache biz = "+p0, objArray);
       k1.o(new b(this, p0, p2));
       if (MapLocationManager.getInstance().isLastLocationRequestSuccess()) {
          LocationCityInfo locationCity = this.getLocationCityInfo();
          if (LocationCityUtil.d(locationCity)) {
             q oq = new q(this, locationCity, p2, p3, p1);
             k1.o(p0);
             return;
          }
       }
       k1.o(new d(this, p0, p2));
       return;
    }
    public LocationCityInfo getValidLocationCity(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CurrentLocationCityManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          p0 = "IGNORE_FEATURE_KEY";
       }
       if (k.c(p0) || "IGNORE_FEATURE_KEY".equals(p0)) {
          if (this.mValidLocationCity == null) {
             this.mValidLocationCity = LocationCityUtil.e(e0.d());
          }
          return this.mValidLocationCity;
       }else {
          return null;
       }
    }
    public void handleRequestLocationError(String p0,int p1,g p2,String p3,d p4){
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "21")) {
             return;
          }
       }
       e uoe = new e(this, p0, p4, p1, p3);
       k1.o(uCurrentLoca);
       p2.onComplete();
       return;
    }
    public final void handleSystemPermission(String p0,String p1,boolean p2,g p3,String p4,String p5,d p6,b p7){
       Object[] objArray;
       CurrentLocationCityManager uCurrentLoca = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       object oobject3 = p5;
       CurrentLocationCityManager uCurrentLoca1 = CurrentLocationCityManager.class;
       int i = 0;
       if (PatchProxy.isSupport(uCurrentLoca1)) {
          objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),p3,oobject2,oobject3,p6,p7};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca1, "14")) {
             return;
          }
       }
       Activity uActivity = ActivityContext.g().e();
       if (uActivity != null && (uActivity.isDestroyed() || uActivity.isFinishing())) {
          uCurrentLoca.mIKLocationStat.d(p0, oobject3, p1, 0x2720);
          p3.onComplete();
          p7.b();
          return;
       }else if(e.a()){
          objArray = new Object[i];
          a.C().s("ks.location.log:SDK", "alwaysRejectLocationPermission go setting", objArray);
          this.handleRequestLocationError(p0, 0x2721, p3, "always rejectLocationPermission", p6);
          if (PermissionUtils.s(uActivity)) {
             uCurrentLoca.mBizForSetting = oobject;
             uCurrentLoca.mSceneForSetting = oobject1;
             uCurrentLoca.mStatKeyForSetting = oobject3;
             uCurrentLoca.mPopSessionIdForSetting = oobject2;
          }
          a.d(p0, "SETTINGS", p4, p5, p1, p7.c());
          uCurrentLoca.mIKLocationStat.b(p0, oobject3, p1);
       }else {
          this.requestSystemPermission(uActivity, p0, p1, p2, p3, p4, p5, p6, p7);
       }
       return;
    }
    public final boolean isBreakNotify(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CurrentLocationCityManager.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (TextUtils.isEmpty(p0) || q.f(this.mObservers.get(p0)))? true: false;
       return b;
    }
    public boolean isLocationMigrate(){
       return this.mIsLocationMigrate;
    }
    public void locationSuccess(String p0,g p1,String p2,String p3,d p4,boolean p5){
       Object[] objArray;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       int i = 0;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          objArray = new Object[]{oobject,oobject1,p2,p3,oobject2,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "28")) {
             return;
          }
       }
       LocationCityInfo locationCity = PatchProxy.applyOneRefs(p1, null, LocationCityUtil.class, "4");
       if (locationCity != PatchProxyResult.class) {
       }else {
          locationCity = LocationCityUtil.e(KwaiMapLocation.from(p1));
          if (locationCity != null) {
             locationCity.speed = p1.getSpeed();
             locationCity.altitude = p1.getAltitude();
             locationCity.mAccuracy = p1.getAccuracy();
             locationCity.sdkType = p1.a();
          }
       }
       Object obj = locationCity;
       this.logLocation(p0, p1, p2, p3, obj);
       if (i.c("KEY_FAKE_LOCATION_NULL")) {
          objArray = new Object[i];
          a.C().w("ks.location.log:SDK", "Mock Location Error ", objArray);
          k1.o(new c(this, p0, oobject2));
       }else {
          SharedPreferences$Editor uEditor = e.a.edit();
          uEditor.putLong("local_last_location_success_date_time", System.currentTimeMillis());
          g.a(uEditor);
          LocationCityInfo locationCity1 = LocationCityUtil.a(obj);
          a uoa = new a(this, locationCity1, p0, p2, p3, p4, p5);
          k1.o(obj);
          if (!PatchProxy.applyVoidOneRefs(locationCity1, null, b.class, "2") && locationCity1 != null) {
             String i3 uoa1 = i3.f();
             uoa1.d("gpsCity", locationCity1.mCityName);
             uoa1.c("latitude", Double.valueOf(locationCity1.mLatitude));
             uoa1.c("longitude", Double.valueOf(locationCity1.mLongitude));
             uoa1 = uoa1.e();
             a.o(uoa1, "msg");
             b.b.a("1.onUpdateLocation", uoa1);
          }
       }
       return;
    }
    public void logForPermissionSetting(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CurrentLocationCityManager.class, "40")) {
          return;
       }
       CurrentLocationCityManager tmBizForSett = this.mBizForSetting;
       if (tmBizForSett == null) {
          return;
       }
       CurrentLocationCityManager tmSceneForSe = this.mSceneForSetting;
       CurrentLocationCityManager tmStatKeyFor = this.mStatKeyForSetting;
       CurrentLocationCityManager tmPopSession = this.mPopSessionIdForSetting;
       this.mBizForSetting = objArray;
       this.mSceneForSetting = objArray;
       this.mStatKeyForSetting = objArray;
       this.mPopSessionIdForSetting = objArray;
       c.k(new h(tmBizForSett, tmPopSession, tmStatKeyFor, tmSceneForSe));
       return;
    }
    public void logLocation(String p0,g p1,String p2,String p3,LocationCityInfo p4){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       int i = 0;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, obj, uCurrentLoca, "29")) {
             return;
          }
       }
       int i1 = 0;
       Long longx = Long.valueOf(obj.mLocationStartTime);
       Long longx1 = Long.valueOf((obj.mLocationEndTime - obj.mLocationStartTime));
       LocationCityInfo mLatitude = oobject3.mLatitude;
       LocationCityInfo mLongitude = oobject3.mLongitude;
       String str = "TRUE";
       String str1 = "FALSE";
       String str2 = (LocationCityUtil.d(p4))? str: str1;
       LocationCityInfo mAccuracy = oobject3.mAccuracy;
       String str3 = p1.a();
       String streetNo = p1.getStreetNo();
       String str4 = p1.b();
       String town = p1.getTown();
       String str5 = (!TextUtils.isEmpty(p1.getIndoorBuildingId()))? str: str1;
       a.f(i1, longx, longx1, mLatitude, mLongitude, "TRUE", str2, mAccuracy, p0, p2, p3, str3, streetNo, str4, town, str5);
       Object[] objArray1 = new Object[0];
       a.C().s("ks.location.log:SDK", "[locationSuccess] key = "+p0+" statKey = "+p2+" scene = "+p3+" | original location city :{ "+p1.getCity()+" , Province= "+p1.getProvince()+" , Latitude= "+p1.getLatitude()+" , Longitude= "+p1.getLongitude()+", Accuracy = "+p1.getAccuracy()+" , Address= "+p1.getAddress()+" | after parse Location city : "+p4+", location vendor: "+p1.a(), objArray1);
       return;
    }
    public void notifyLocationError(String p0,int p1,String p2,d p3){
       if (PatchProxy.isSupport(CurrentLocationCityManager.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, CurrentLocationCityManager.class, "27")) {
          return;
       }
       LocationCityUtil.f("定位失败 errorCode："+p1+",reason: "+p2);
       Object[] objArray = new Object[0];
       a.C().w("ks.location.log:SDK", "[notifyLocationError] key = "+p0+" | errorCode = "+p1+" | reason =  "+p2, objArray);
       if (p3 != null) {
          p3.onError(p1, p2);
          p3.onFinish();
       }
       Iterator iterator = this.mObservers.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!str.equals(p0) && this.isBreakNotify(str)) {
             continue ;
          }else {
             CopyOnWriteArrayList uCopyOnWrite = this.mObservers.get(p0);
             if (uCopyOnWrite != null) {
                Iterator iterator1 = uCopyOnWrite.iterator();
                while (iterator1.hasNext()) {
                   d uod = iterator1.next();
                   uod.onError(p1, p2);
                   uod.onFinish();
                }
             }
          }
       }
       return;
    }
    public final void notifyMigrate(LocationCityInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CurrentLocationCityManager.class, "36")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ks.location.log:SDK", "[notifyMigrate]", objArray);
       Iterator iterator = this.mMigrateObservers.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (TextUtils.isEmpty(str) || (k.c(str) || (!("IGNORE_FEATURE_KEY").equals(str) || q.f(this.mMigrateObservers.get(str))))) {
             break ;
          }else {
             CopyOnWriteArrayList uCopyOnWrite = this.mMigrateObservers.get(str);
             if (uCopyOnWrite != null) {
                Iterator iterator1 = uCopyOnWrite.iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().a(p0);
                }
             }
          }
       }
    label_0070 :
       return;
    }
    public final void notifyStartLocation(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CurrentLocationCityManager.class, "26")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("ks.location.log:SDK", "[notifyStartLocation] : key = "+p0, objArray);
       LocationCityUtil.f("定位中");
       if (p1 != null) {
          p1.onStart();
       }
       Iterator iterator = this.mObservers.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!str.equals(p0) && this.isBreakNotify(str)) {
             continue ;
          }else {
             CopyOnWriteArrayList uCopyOnWrite = this.mObservers.get(p0);
             if (uCopyOnWrite != null) {
                Iterator iterator1 = uCopyOnWrite.iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().onStart();
                }
             }
          }
       }
       return;
    }
    public final void notifySuccessLocation(boolean p0,LocationCityInfo p1,d p2,boolean p3,String p4){
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       int i = 0;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),p1,p2,Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "25")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       a.C().w("ks.location.log:SDK", "[notifySuccessLocation] city = "+p1+" | isCache = "+p0, objArray1);
       if (!("location_upload").equals(p4)) {
          h.b().a(p1, null, 2);
       }
       if (p2 != null) {
          p2.a(p0, p1);
          if (p3) {
             p2.onFinish();
          }
       }
       Iterator iterator = this.mObservers.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (this.isBreakNotify(str)) {
             continue ;
          }else {
             CopyOnWriteArrayList uCopyOnWrite = this.mObservers.get(str);
             if (uCopyOnWrite != null) {
                Iterator iterator1 = uCopyOnWrite.iterator();
                while (iterator1.hasNext()) {
                   d uod = iterator1.next();
                   uod.a(p0, p1);
                   uod.onFinish();
                }
             }
          }
       }
       return;
    }
    public void onActivityCreate(b p0){
       boolean b;
       f$a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, CurrentLocationCityManager.class, "42")) {
          return;
       }
       if (f.b(p0.a)) {
          p0 = PatchProxy.apply(null, null, f.class, "8");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else {
             a = f.a;
             b = (a != null)? a.e(): false;
          }
          if (b) {
             c.k(b.b);
          }else {
             a.g("LAUNCH");
          }
       }
       return;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CurrentLocationCityManager.class, "41")) {
          return;
       }
       a.g("QUIT");
       if (this.mFirst != null && (this.mHasLocationPermission != j.d(a.b()) || this.mGpsOn != k.f())) {
          if (this.mFirst == null) {
             this.mFirst = true;
          }
          this.mGpsOn = k.f();
          this.mHasLocationPermission = j.d(a.b());
       }
       Object[] objArray = new Object[0];
       a.C().w("ks.location.log:SDK", "[onBackground] mGpsOn = "+k.f()+" | system_permission =  "+j.d(a.b()), objArray);
       return;
    }
    public void onForeground(){
       if (PatchProxy.applyVoid(null, this, CurrentLocationCityManager.class, "39")) {
          return;
       }
       this.logForPermissionSetting();
       return;
    }
    public void registerMigrateObserver(f p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CurrentLocationCityManager.class, "33")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          p1 = "IGNORE_FEATURE_KEY";
       }
       CopyOnWriteArrayList uCopyOnWrite = this.mMigrateObservers.get(p1);
       if (uCopyOnWrite == null) {
          uCopyOnWrite = new CopyOnWriteArrayList();
       }
       if (!uCopyOnWrite.contains(p0)) {
          uCopyOnWrite.add(p0);
       }
       this.mMigrateObservers.put(p1, uCopyOnWrite);
       return;
    }
    public void registerObserver(d p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CurrentLocationCityManager.class, "23")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          p1 = "IGNORE_FEATURE_KEY";
       }
       CopyOnWriteArrayList uCopyOnWrite = this.mObservers.get(p1);
       if (uCopyOnWrite == null) {
          uCopyOnWrite = new CopyOnWriteArrayList();
       }
       if (!uCopyOnWrite.contains(p0)) {
          uCopyOnWrite.add(p0);
       }
       this.mObservers.put(p1, uCopyOnWrite);
       return;
    }
    public void requestLocation(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CurrentLocationCityManager.class, "19")) {
          return;
       }
       if (SystemUtil.I()) {
          CurrentLocationCityManager.presentAlertAndExitForPermission("yoda bridge requestLocation");
       }
       t.create(new i(this, p1, p2, p0)).subscribeOn(d.c).subscribe(Functions.d(), Functions.e);
       return;
    }
    public void requestLocation(String p0,String p1,String p2,boolean p3,boolean p4,d p5,String p6,String p7,String p8){
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "2")) {
             return;
          }
       }else {
          int i = this;
       }
       this.requestLocation(p0, p1, p2, p3, p4, p5, p6, p7, p8, true);
       return;
    }
    public void requestLocation(String p0,String p1,String p2,boolean p3,boolean p4,d p5,String p6,String p7,String p8,boolean p9){
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[10];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = p8;
          objArray[9] = Boolean.valueOf(p9);
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "3")) {
             return;
          }
       }else {
          int i = this;
       }
       this.requestLocation(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, "amap");
       return;
    }
    public void requestLocation(String p0,String p1,String p2,boolean p3,boolean p4,d p5,String p6,String p7,String p8,boolean p9,String p10){
       Object[] objArray;
       String str;
       object oobject = p2;
       object oobject1 = p7;
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       int i = 0;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          objArray = new Object[11];
          objArray[i] = p0;
          objArray[1] = p1;
          objArray[2] = oobject;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          objArray[7] = oobject1;
          objArray[8] = p8;
          objArray[9] = Boolean.valueOf(p9);
          objArray[10] = p10;
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "4")) {
             return;
          }
       }else {
          int i1 = this;
       }
       if (TextUtils.isEmpty(p0)) {
          objArray = new Object[i];
          a.C().t("ks.location.log:SDK", "requestLocation featureKey is empty", objArray);
          str = "IGNORE_FEATURE_KEY";
       }else {
          str = p0;
       }
       if (SystemUtil.K()) {
          i = 0x7f110668;
          if (TextUtils.isEmpty(str)) {
             i.d(i, "featureKey不能为空");
          }
          if (!TextUtils.isEmpty(p2) && (a1.p(CurrentLocationCityManager.RES_SUB_TITLE_ID)).equals(oobject)) {
             i.d(i, "弹窗子标题不能与默认弹窗相同");
          }
          String str1 = "default";
          if (str1.equals(str) && (TextUtils.isEmpty(p7) || str1.equals(oobject1))) {
             i.d(i, "featureKey为default，statKey不能为空");
             j.d("location", "requestLocation");
          }
          if (!p3 && TextUtils.isEmpty(p6)) {
             i.d(i, "不受频控状态下scene不能为空");
          }
       }
    label_00bb :
       this.getLocation(str, p1, p2, p3, p4, p5, p6, p7, p8, null, p9, p10);
       return;
    }
    public final void requestLocation(String p0,String p1,boolean p2,g p3,String p4,d p5){
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "16")) {
             return;
          }
       }else {
          int i = this;
       }
       this.requestLocation(p0, p1, p2, p3, p4, p5, true, "amap");
       return;
    }
    public final void requestLocation(String p0,String p1,boolean p2,g p3,String p4,d p5,boolean p6,String p7){
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4,p5,Boolean.valueOf(p6),p7};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "17")) {
             return;
          }
       }else {
          int i = this;
       }
       this.requestLocation(p0, p1, p2, p3, p4, p5, p6, p7, true);
       return;
    }
    public final void requestLocation(String p0,String p1,boolean p2,g p3,String p4,d p5,boolean p6,String p7,boolean p8){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       boolean b = p2;
       object oobject2 = p4;
       object oobject3 = p5;
       boolean b1 = p6;
       object oobject4 = p7;
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       int i = 0;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[9];
          objArray[i] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = p3;
          objArray[4] = oobject2;
          objArray[5] = oobject3;
          objArray[6] = Boolean.valueOf(p6);
          objArray[7] = oobject4;
          objArray[8] = Boolean.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, obj, uCurrentLoca, "18")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i];
       String str = "ks.location.log:SDK";
       a.C().w(str, "requestLocation: biz = "+oobject+" statKey = "+oobject2+" scene = "+oobject1, objArray1);
       String str1 = "location";
       boolean b2 = j.g().n(str1, oobject, oobject1, b);
       objArray1 = new Object[i];
       a.C().s(str, "requestLocation validVisit = "+b2, objArray1);
       boolean b3 = k.e(a.B);
       int i1 = (b2)? 0: 0x21ab6;
       String str2 = str1;
       int i2 = 0x21ab6;
       a.h(p0, p1, p4, b3, i1, k.f());
       if (!b2) {
          obj.getLocationInfoFromCache(oobject, oobject1, oobject3, b1);
          obj.mIKLocationStat.d(oobject, oobject2, oobject1, i2);
          p3.onComplete();
          return;
       }else {
          j oj = MapLocationManager.getInstance().createRequestTask(oobject4, p8, b1);
          g og = new g(this, p6, p5, oj, p0);
          k1.o(i2);
          obj.mLocationStartTime = System.currentTimeMillis();
          oj.c(this.createLocationCallbackAdapter(p0, oj, p3, p4, p1, p5, p6));
          if (!b) {
             j.g().a(str2);
          }
          return;
       }
    }
    public void requestLocationWithCustomDialog(String p0,String p1,String p2,String p3,d p4,b p5){
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "8")) {
             return;
          }
       }else {
          int i = this;
       }
       this.getLocation(p0, null, null, TextUtils.isEmpty(p1), false, p4, p1, p3, p2, p5, true, "amap");
       return;
    }
    public void requestLocationWithoutBusinessDialog(String p0,String p1,String p2,d p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, CurrentLocationCityManager.class, "5")) {
          return;
       }
       this.requestLocationWithoutBusinessDialog(p0, p1, p2, p3, "amap");
       return;
    }
    public void requestLocationWithoutBusinessDialog(String p0,String p1,String p2,d p3,String p4){
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca, "6")) {
             return;
          }
       }
       this.requestLocationWithoutBusinessDialog(p0, p1, p2, p3, p4, true);
       return;
    }
    public void requestLocationWithoutBusinessDialog(String p0,String p1,String p2,d p3,String p4,boolean p5){
       CurrentLocationCityManager uCurrentLoca = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       CurrentLocationCityManager uCurrentLoca1 = CurrentLocationCityManager.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uCurrentLoca1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,p4,Boolean.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uCurrentLoca1, "7")) {
             return;
          }
       }
       Object[] objArray1 = new Object[i1];
       a.C().w("ks.location.log:SDK", "requestLocationWithoutBusinessDialog: biz = "+p0+" statKey = "+oobject2+" scene = "+oobject1, objArray1);
       a.e(p0, p1, p2);
       int i2 = j.g().c("location", p0, oobject1, (TextUtils.isEmpty(p1) ^ i));
       if (!i2) {
          j oj = new j(this, p0, p1, p2, p3, p4, p5);
          t.create(i1).subscribeOn(d.c).subscribe(Functions.d(), Functions.e);
       }else {
          a.h(p0, p1, p2, k.e(a.B), i2, k.f());
          uCurrentLoca.mIKLocationStat.d(p0, oobject2, oobject1, i2);
          if (oobject3 != null) {
             oobject3.onError(this.getLocationErrorCode(i2), "requestLocationWithoutBusinessDialog failed");
          }
          Object[] objArray2 = new Object[i1];
          a.C().w("ks.location.log:SDK", "requestLocationWithoutBusinessDialog failed, resultType = "+i2, objArray2);
       }
       return;
    }
    public final void requestPermissionFromUser(String p0,String p1,String p2,String p3,String p4,boolean p5,g p6,String p7,b p8,d p9,boolean p10,String p11){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p8;
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[12];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = Boolean.valueOf(p5);
          objArray[6] = p6;
          objArray[7] = p7;
          objArray[8] = oobject3;
          objArray[9] = p9;
          objArray[10] = Boolean.valueOf(p10);
          objArray[11] = p11;
          if (PatchProxy.applyVoid(objArray, obj, uCurrentLoca, "11")) {
             return;
          }
       }
       Activity uActivity = ActivityContext.g().e();
       if (uActivity != null && !uActivity.isDestroyed()) {
          if (uActivity.isFinishing()) {
             uCurrentLoca = obj;
          }else {
             String str = UUID.randomUUID().toString()+"."+System.currentTimeMillis();
             boolean b = k.e(a.B);
             boolean b1 = k.f();
             String str1 = (TextUtils.isEmpty(p3))? a1.p(CurrentLocationCityManager.RES_TITLE_ID): p3;
             String str2 = (TextUtils.isEmpty(p4))? a1.p(CurrentLocationCityManager.RES_SUB_TITLE_ID): p4;
             b uob = uCurrentLoca;
             b uob1 = new b(oobject3);
             o oo = new o(this, uActivity, p0, p7, str1, str2, a1.p(CurrentLocationCityManager.RES_SURE_ID), a1.p(CurrentLocationCityManager.RES_CANCEL_ID), p8, b, uob, str, p2, p1, p5, p6, p9, p10, p11, b1, TextUtils.isEmpty(p7));
             k1.o(v22);
             return;
          }
       }else {
          uCurrentLoca = this;
       }
       uCurrentLoca.mIKLocationStat.d(oobject, oobject2, oobject1, 0x2720);
       p6.onComplete();
       return;
    }
    public final void requestSystemPermission(Activity p0,String p1,String p2,boolean p3,g p4,String p5,String p6,d p7,b p8){
       m obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p6;
       CurrentLocationCityManager uCurrentLoca = CurrentLocationCityManager.class;
       if (PatchProxy.isSupport(uCurrentLoca)) {
          Object[] objArray = new Object[9];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = oobject2;
          objArray[3] = Boolean.valueOf(p3);
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = oobject3;
          objArray[7] = p7;
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, obj, uCurrentLoca, "15")) {
             return;
          }
       }
       obj.mIKLocationStat.a(p1, "SYSTEM", p5, p6, p2, p8.c());
       j.g("location", oobject1, oobject3, oobject2, "1");
       String[] stringArray = new String[]{"android.permission.ACCESS_FINE_LOCATION","android.permission.ACCESS_COARSE_LOCATION"};
       m om = v10;
       b uob = p8;
       String str = p1;
       g og = p4;
       obj = v10;
       om = new m(this, uob, str, p2, p3, og, p6, p7, p0, p5);
       l ol = new l(this, uob, str, p6, p2, og, p7);
       new g(oobject).f(stringArray).flatMap(obj).subscribeOn(d.c).observeOn(d.a).subscribe(Functions.d(), v10);
       return;
    }
    public final void setMockLocation(){
       if (PatchProxy.applyVoid(null, this, CurrentLocationCityManager.class, "43")) {
          return;
       }
       if (SystemUtil.K()) {
          String str = i.h("KEY_FAKE_LOCATION");
          if (!TextUtils.isEmpty(str)) {
             e0.a(str);
          }
       }
       return;
    }
    public void unregisterMigrateObserver(f p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CurrentLocationCityManager.class, "34")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          p1 = "IGNORE_FEATURE_KEY";
       }
       List list = this.mMigrateObservers.get(p1);
       if (!q.f(list)) {
          list.remove(p0);
       }
       return;
    }
    public void unregisterObserver(d p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CurrentLocationCityManager.class, "24")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          p1 = "IGNORE_FEATURE_KEY";
       }
       List list = this.mObservers.get(p1);
       if (!q.f(list)) {
          list.remove(p0);
       }
       return;
    }
    public void updateMigrate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CurrentLocationCityManager.class, "38")) {
          return;
       }
       LocationCityInfo validLocatio = CurrentLocationCityManager.getInstance().getValidLocationCity(objArray);
       if (LocationCityUtil.d(validLocatio)) {
          String[] stringArray = new String[]{this.getLastMigrateCityName(),LocationCityUtil.b(validLocatio)};
          e.e(stringArray);
       }
       return;
    }
    public void updateUserPermissionStatus(String p0,String p1,String p2,boolean p3){
       if (PatchProxy.isSupport(CurrentLocationCityManager.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, CurrentLocationCityManager.class, "44")) {
          return;
       }
       j oj = j.g();
       String str = "location";
       Objects.requireNonNull(oj);
       if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidThreeRefs(p0, str, Boolean.valueOf(p3), oj, j.class, "41")) {
          if (!b.b(str, p0)) {
             b.f(str, System.currentTimeMillis(), p0);
          }
          oj.s(str, p0, p3);
       }
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), null, a.class, "1")) {
          Map map = a.a();
          map.put("biz_code", p0);
          map.put("stat_key", p1);
          map.put("scene", p2);
          map.put("is_agreed", Boolean.valueOf(p3));
          a.b(map, "LOCATION_BUSINESS_UPDATE_PERMISSION");
       }
       return;
    }
}
