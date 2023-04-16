package com.kwai.framework.krn.init.preload.a;
import zj0.v;
import com.kwai.sdk.switchconfig.a;
import java.lang.Float;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import a96.g;
import el.a;
import java.util.Collections;
import c96.a;
import java.lang.StringBuilder;
import java.lang.Exception;
import q87.c;
import com.kwai.framework.krn.init.preload.a$b;
import com.kwai.framework.krn.init.view.DebugOverlayController;
import com.kuaishou.krn.model.LaunchModel;
import com.kwai.framework.krn.init.preload.e;
import com.kwai.framework.krn.init.network.tcpproxy.b;
import java.util.Objects;
import com.kwai.framework.krn.init.preload.b;
import fg6.a;
import com.kwai.framework.krn.init.preload.a$a;
import com.google.gson.Gson;
import java.util.ArrayList;
import com.kwai.framework.krn.init.preload.e$h;
import com.kwai.framework.krn.init.preload.e$g;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.kwai.framework.krn.init.preload.d;
import java.util.TimerTask;
import java.util.Timer;
import java.util.Collection;
import ekd.q;
import com.kwai.framework.krn.init.preload.b$c;
import z86.e;
import jk0.b;
import jk0.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import hj0.c;
import com.kuaishou.krn.instance.JsFramework;
import gu6.b;
import iu6.a;
import com.yxcorp.utility.TextUtils;
import okhttp3.Request$Builder;
import okhttp3.Request;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.lang.Boolean;
import com.kuaishou.krn.c;
import java.util.concurrent.Executor;
import a96.b;
import a96.c;
import java.lang.Runnable;
import com.kwai.kxb.PlatformType;
import com.kwai.kxb.KxbManager;
import org.json.JSONObject;
import com.yxcorp.utility.SystemUtil;
import o56.c;
import o56.a;
import com.kuaishou.krn.utils.d;
import java.lang.Double;
import android.os.SystemClock;
import android.os.Parcelable;
import org.parceler.b;
import com.kwai.framework.krn.init.preload.c;
import android.os.Parcel;
import java.lang.ClassLoader;
import a96.f;
import a96.e;
import java.lang.Long;
import y86.g;
import k2b.u1;
import fk0.l;
import java.util.List;
import java.util.Iterator;
import com.kwai.framework.krn.init.preload.KrnPreRequestReportInfo;
import java.lang.Throwable;

public class a extends v	// class@0015fc
{
    public long c;
    public long d;
    public boolean e;
    public DebugOverlayController f;
    public e g;
    public final ConcurrentHashMap h;
    public static final float i;

    static {
       a.i = a.t().getValue("KrnPreRequestLogRatio", Float.TYPE, Float.valueOf(0.00f)).floatValue();
    }
    public void a(){
       super();
       this.e = false;
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.h = uConcurrentH;
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
       }else {
          Type[] typeArray = new Type[]{String.class,new g(this).getType()};
          Type type = a.getParameterized(Map.class, typeArray).getType();
          try{
             uConcurrentH.clear();
             uConcurrentH.putAll(a.t().getValue("KRNOptimizeUseKswtichConfig", type, Collections.emptyMap()));
          }catch(java.lang.Exception e1){
             Object[] objArray = new Object[false];
             a.D().t("KrnNetwork", "KrnNetworkOptimizer parseConfig Exception: "+e1.toString(), objArray);
          }
       }
    }
    public void a(g p0){
       super();
       this.e = false;
       ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
       this.h = uConcurrentH;
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
       }else {
          Type[] typeArray = new Type[]{String.class,new g(this).getType()};
          Type type = a.getParameterized(Map.class, typeArray).getType();
          try{
             uConcurrentH.clear();
             uConcurrentH.putAll(a.t().getValue("KRNOptimizeUseKswtichConfig", type, Collections.emptyMap()));
          }catch(java.lang.Exception e0){
             Object[] objArray = new Object[false];
             a.D().t("KrnNetwork", "KrnNetworkOptimizer parseConfig Exception: "+e0.toString(), objArray);
          }
       }
    }
    public static a M(){
       return a$b.a;
    }
    public void E(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "29")) {
          return;
       }
       if (this.S()) {
          this.L().addLogError(p0);
       }
       return;
    }
    public void F(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "28")) {
          return;
       }
       if (this.S()) {
          this.L().addLogInfo(p0);
       }
       return;
    }
    public final void G(String p0,LaunchModel p1){
       Gson a;
       b uob;
       e uoe = this;
       Map obj = p0;
       e uoe1 = e.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(obj, p1, uoe, uoa, "8")) {
          return;
       }
       String str = p1.a();
       String str1 = null;
       if (!PatchProxy.applyVoidOneRefs(str, uoe, uoa, "14")) {
          uoe.g = str1;
          b.e().h = str1;
          b.e().g = str1;
          e uoe3 = e.b();
          Objects.requireNonNull(uoe3);
          if (!PatchProxy.applyVoidOneRefs(str, uoe3, uoe1, "2")) {
             uoe3.i.remove(str);
          }
          uob = b.a();
          Objects.requireNonNull(uob);
          if (!PatchProxy.applyVoidOneRefs(str, uob, b.class, "3")) {
             uob.b.remove(str);
          }
       }
       a = a.a;
       obj = a.i(obj, new a$a(uoe).getType());
       str = obj.get("max");
       String str2 = obj.get("min");
       String str3 = obj.get("klink_max");
       String str4 = obj.get("klink_min");
       String str5 = obj.get("pre_connect_max");
       Object obj1 = obj.get("pre_connect_min");
       ArrayList uArrayList = obj.get("preRequest");
       if (obj.get("preRequestMarkV2") != null) {
          str1 = a.h(obj.get("preRequestMarkV2").toString(), e$h.class);
       }
       String str6 = obj.get("preRequestTimeout");
       e uoe2 = e.b();
       String str7 = p1.a();
       Objects.requireNonNull(uoe2);
       if (PatchProxy.isSupport(uoe1)) {
          Object[] objArray = new Object[]{str7,uArrayList,str,str2,str1,str6};
          if (!PatchProxy.applyVoid(objArray, uoe2, uoe1, "1")) {
          label_00fd :
             e$g og = new e$g();
             og.b = str;
             og.c = str2;
             og.d = str1;
             og.a = uArrayList;
             if (!TextUtils.isEmpty(str6)) {
                int i = Integer.parseInt(str6);
                if (i > 0) {
                   uoe2.c = i;
                   uoe2.a.schedule(new d(uoe2), 0, (long)uoe2.c);
                }
             }
             if (q.f(uArrayList)) {
                uoe2.i.remove(str7);
             }else {
                uoe2.i.put(str7, og);
             }
          }
       }else {
          goto label_00fd ;
       }
       ArrayList uArrayList1 = obj.get("preConnect");
       uob = b.a();
       str = p1.a();
       Objects.requireNonNull(uob);
       Object obj2 = obj1;
       if (!PatchProxy.applyVoidFourRefs(str, uArrayList1, str5, obj1, uob, b.class, "2")) {
          b$c uoc = new b$c();
          uoc.b = str5;
          uoc.c = obj2;
          uoc.a = uArrayList1;
          if (q.f(uArrayList1)) {
             uob.b.remove(str);
          }else {
             uob.b.put(str, uoc);
          }
       }
       obj = obj.get("klink");
       if (!q.h(obj)) {
          _monitor_enter(this);
          if (PatchProxy.applyVoidThreeRefs(obj, str3, str4, this, a.class, "1")) {
             _monitor_exit(this);
          }else {
             uoe1 = new e();
             uoe.g = uoe1;
             uoe1.whiteList = obj;
             uoe1.a = str3;
             uoe1.b = str4;
             _monitor_exit(this);
          }
       }
       return;
    }
    public void H(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "19")) {
          return;
       }
       this.a0();
       this.e = false;
       if (!PatchProxy.applyVoid(null, this, uoa, "25")) {
          uoa = this.f;
          if (uoa != null) {
             uoa.clearLogMessage();
             this.f.setNetworkOPtDebugViewVisible(false);
          }
       }
       return;
    }
    public final void I(LaunchModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       try{
          b.e().g = p0;
          e.b().m(p0);
          b.a().b(p0);
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          a.D().t("KrnNetwork", "asyncDoPreConnectAndPrerequest Exception"+e4.toString(), objArray);
       }
       return;
    }
    public void J(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "16")) {
          return;
       }
       if (this.S()) {
          a uoa1 = a.M();
          Objects.requireNonNull(uoa1);
          if (!PatchProxy.applyVoid(objArray, uoa1, uoa, "23") && c.a().R()) {
             uoa1.L().setNetworkOPtDebugViewVisible(true);
          }
       }
       return;
    }
    public int K(LaunchModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a uoa = c.a.a(p0.d()).h(p0.a());
       if (uoa != null && uoa.h() > 0) {
          return uoa.h();
       }
       return -1;
    }
    public final DebugOverlayController L(){
       Object obj = PatchProxy.apply(null, this, a.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = new DebugOverlayController();
       }
       return this.f;
    }
    public final String N(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.O(p0, "optimize.config.android.json");
       if (!TextUtils.x(obj)) {
          return obj;
       }
       this.Z("没有optimize.config.android.json文件");
       p0 = this.O(p0, "optimize.config.json");
       TextUtils.x(p0);
       return p0;
    }
    public final String O(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          this.Z("访问本地代码仓库中"+p0+"的"+p1+"文件");
          Response response = new OkHttpClient().newCall(new Request$Builder().url("http://"+p0+"/"+p1).get().build()).execute();
          if (response.isSuccessful() && response.body() != null) {
             return response.body().string();
          }
       }catch(java.lang.Exception e0){
          this.Y("访问不到代码仓库中的配置，请检查摇一摇中的设置和本机网络，然后退出RN页面重进试试");
       }
       return "";
    }
    public final void P(LaunchModel p0){
       boolean b;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
          return;
       }
       a uoa1 = a.M();
       Objects.requireNonNull(uoa1);
       String obj = PatchProxy.applyOneRefs(p0, uoa1, uoa, "39");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(uoa1.V(p0) && (uoa1.W(p0) && uoa1.X(p0))){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          this.F("检测到需要优先使用KSwtich的网络优化配置");
          return;
       }else if(c.b().k()){
          b.a().execute(new c(p0));
       }else {
          try{
             uoa1 = a.M();
             Objects.requireNonNull(uoa1);
             obj = "optimize";
             if (!PatchProxy.applyVoidOneRefs(p0, uoa1, uoa, "7")) {
                uoa1.Z("\x27\x02 \x5f\x02\x52\x02\x4e\x02\x66\x02\x5f\x02\x53\x02\x80\x02\x6a\x02\x5f\x02\x00");
                uoa1.Z("尝试访问bundle中的网络优化配置文件");
                PlatformType platformType = null;
                if (p0.d() == JsFramework.REACT) {
                   platformType = PlatformType.KDS_REACT;
                }else if(p0.d() == JsFramework.VUE){
                   platformType = PlatformType.KDS_VUE;
                }
                if (platformType != null) {
                   uoa = KxbManager.g.f(platformType).h(p0.a());
                   if (uoa != null && uoa.d() != null) {
                      JSONObject jSONObject = uoa.d();
                      if (jSONObject.has(obj)) {
                         String str = jSONObject.get(obj).toString();
                         if (!TextUtils.x(str)) {
                            uoa1.Z("\x27\x02 \x5d\x02\x4f\x02\x75\x02bundle\x4e\x02\x76\x02\x7f\x02\x7e\x02\x4f\x02\x53\x02\x91\x02\x7f\x02:\x00"+str);
                            uoa1.G(str, p0);
                         }else {
                            uoa1.Y("\x27\x02 bundle\x4e\x02\x6c\x02\x67\x02\x7f\x02\x7e\x02\x4f\x02\x53\x02\x91\x02\x7f\x02\x00");
                         }
                      }else {
                         uoa1.Y("\x27\x02 bundle\x4e\x02\x6c\x02\x67\x02\x7f\x02\x7e\x02\x4f\x02\x53\x02\x91\x02\x7f\x02\x00");
                      }
                   }else {
                      uoa1.Y("\x27\x02 getConfigFromExtraInfo bundleInfo == null || bundleInfo.getExtraInfo\(\) == null\x00");
                   }
                }
             }
          }catch(java.lang.Exception e7){
             uoa1.Y("\x27\x02 bundle\x4e\x02\x6c\x02\x67\x02\x7f\x02\x7e\x02\x4f\x02\x53\x02\x91\x02\x7f\x02\x00");
             uoa1.Y("getConfigFromExtraInfo Exception"+e7.toString());
          }
       }
    }
    public final boolean Q(String p0,LaunchModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          this.G(p0, p1);
          this.I(p1);
          return true;
       }catch(java.lang.Exception e0){
          this.Y("开发者模式下处理配置文件失败");
          return false;
       }
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, a.class, "24")) {
          return;
       }
       a tf = this.f;
       if (tf != null) {
          tf.setNetworkOPtDebugViewVisible(false);
       }
       return;
    }
    public final boolean S(){
       Object obj = PatchProxy.apply(null, this, a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (SystemUtil.I() || a.a().c())? true: false;
       return b;
    }
    public boolean T(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          if (!TextUtils.x(p0) && d.b(a.m, p0) < 0) {
             a.M().E("\x27\x02 \x4e\x02\x57\x02\x72\x02\x67\x02\x63\x02\x52\x02\x83\x02\x56\x02\x51\x02\xff\x02\x8b\x02\x68\x02\x67\x02min\x62\x02max\x5b\x02\x6b\x02\x00");
             return false;
          }else if(!TextUtils.x(p1) && d.b(a.m, p1) > 0){
             a.M().E("\x27\x02 \x4e\x02\x57\x02\x72\x02\x67\x02\x63\x02\x52\x02\x83\x02\x56\x02\x51\x02\xff\x02\x8b\x02\x68\x02\x67\x02min\x62\x02max\x5b\x02\x6b\x02\x00");
             return false;
          }
       }catch(java.lang.Exception e0){
          a.M().c0(-1002, "total", "VersionCompareUtils.compareVersionWithException throw Exception");
       }
       return true;
    }
    public boolean U(LaunchModel p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       String str = p0.a();
       Map map = a.M().h.get(p1);
       boolean b = true;
       if (q.h(map) || (map.get(str) == null || (!map.get(str) instanceof Boolean || b != map.get(str).booleanValue()))) {
          b = false;
       }
       map = a.M().h.get("control");
       if (map != null) {
          map = map.get(p1);
          if (map != null) {
             Map map1 = map.get(str);
             if (map1 != null) {
                Double uDouble = map1.get("min");
                Double uDouble1 = map1.get("max");
                int i = this.K(p0);
                if (i != -1) {
                   if (uDouble != null && i < uDouble.intValue()) {
                      a.M().E("\x27\x02 \x00"+p1+"不在KSwtich版本控制范围内");
                      return false;
                   }else if(uDouble1 != null && i > uDouble1.intValue()){
                      a.M().E("\x27\x02 \x00"+p1+"不在KSwtich版本控制范围内");
                      return false;
                   }
                }
             }
          }
       }
       return b;
    }
    public boolean V(LaunchModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.U(p0, "klink");
    }
    public boolean W(LaunchModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.U(p0, "preConnect");
    }
    public boolean X(LaunchModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.U(p0, "preRequest");
    }
    public void Y(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "27")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().t("KrnNetwork", p0, objArray);
       this.E(p0);
       return;
    }
    public void Z(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "26")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("KrnNetwork", p0, objArray);
       this.F(p0);
       return;
    }
    public final void a0(){
       if (PatchProxy.applyVoid(null, this, a.class, "21")) {
          return;
       }
       this.d = SystemClock.elapsedRealtime();
       return;
    }
    public void b0(LaunchModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       int i = 0;
       if (p0 == null) {
          a.M().c0(-1002, "total", "onKrnStart launchModel=null");
          Object[] objArray = new Object[i];
          a.D().t("KrnNetwork", "onKrnEnter model=null", objArray);
          return;
       }else if(a.t().d("kdsEnableCopyLaunchModel", i)){
          Parcelable parcelable = b.c(p0);
          Parcelable parcelable1 = PatchProxy.applyOneRefs(parcelable, null, c.class, "1");
          if (parcelable1 == PatchProxyResult.class) {
             Parcel parcel = Parcel.obtain();
             parcel.writeParcelable(parcelable, i);
             parcel.setDataPosition(i);
             parcel.recycle();
             parcelable1 = parcel.readParcelable(parcelable.getClass().getClassLoader());
          }
          b.a().execute(new f(this, p0, b.a(parcelable1)));
       }else {
          b.a().execute(new e(this, p0));
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "18")) {
          return;
       }
       this.a0();
       return;
    }
    public void c0(long p0,String p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, a.class, "32")) {
          return;
       }
       this.d0(p0, p1, p2, null);
       return;
    }
    public void d0(long p0,String p1,String p2,String p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, p2, p3, this, a.class, "33")) {
          return;
       }
       g og = new g();
       og.mCode = p0;
       og.mErrorMessage = p2;
       og.mBundleId = p1;
       og.mStackTrack = p3;
       u1.Y("krn_network_optimizer_event", a.a.q(og), 20);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, a.class, "17")) {
          return;
       }
       if (this.S()) {
          this.R();
       }
       return;
    }
    public void o(l p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "22")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       long l = this.d - this.c;
       if (l - (long)0 < 0) {
          l = 0;
       }
       e uoe = e.b();
       Objects.requireNonNull(uoe);
       ArrayList uArrayList = PatchProxy.apply(null, uoe, e.class, "9");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          iterator = uoe.j.values().iterator();
          while (iterator.hasNext()) {
             KrnPreRequestReportInfo krnPreReques1 = iterator.next();
             krnPreReques1.calculate();
             uArrayList.add(krnPreReques1);
          }
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          KrnPreRequestReportInfo krnPreReques = iterator.next();
          krnPreReques.t1 = l;
          krnPreReques.t2 = p0.a;
          krnPreReques.t3 = p0.b;
       }
       return;
    }
    public void s(LaunchModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       this.b0(p0);
       this.c = SystemClock.elapsedRealtime();
       this.e = false;
       return;
    }
    public void v(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "20")) {
          return;
       }
       this.a0();
       return;
    }
}
