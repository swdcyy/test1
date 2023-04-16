package com.kuaishou.krn.bridges.basic.KrnBasicBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import ik0.m;
import com.kuaishou.krn.title.ButtonParams;
import kk0.c;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.bridges.model.KrnBasicInfo;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableMap;
import lk0.b;
import ik0.g;
import com.facebook.react.bridge.WritableMap;
import java.lang.Integer;
import lj0.c;
import com.facebook.react.bridge.Arguments;
import java.util.HashMap;
import com.kuaishou.krn.bridges.model.KrnDeviceInfo;
import bj0.d;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import android.content.Context;
import ekd.p0;
import com.kuaishou.krn.c;
import kj0.j;
import java.lang.Boolean;
import lj0.d;
import ik0.o;
import java.lang.Throwable;
import ek0.d;
import com.yxcorp.utility.SystemUtil;
import bj0.b;
import bj0.a;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lk0.a;
import android.content.Intent;
import android.net.Uri;
import android.content.ContextWrapper;
import java.lang.Exception;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.kuaishou.krn.KrnInternalManager;
import kotlin.jvm.internal.a;
import kj0.l;
import com.kuaishou.krn.title.ButtonParams$PositionId;
import ti0.a;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.gson.Gson;
import bj0.c;

public class KrnBasicBridge extends KrnBridge	// class@00080b
{

    public void KrnBasicBridge(ReactApplicationContext p0){
       super(p0);
    }
    public static void lambda$setPageTitle$0(m p0,ButtonParams p1){
       c uoc = p0.m1();
       if (uoc != null) {
          uoc.b(p1);
       }
       return;
    }
    public final Map convertToConstantsValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnBasicBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.convertJsonToBean(this.convertBeanToJson(new KrnBasicInfo(p0)), Map.class);
    }
    public void exitPage(){
       if (PatchProxy.applyVoid(null, this, KrnBasicBridge.class, "12")) {
          return;
       }
       if (this.getCurrentActivity() != null) {
          this.getCurrentActivity().finish();
       }
       return;
    }
    public void exitPageWithInfo(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnBasicBridge.class, "13")) {
          return;
       }
       boolean b = true;
       if (p0 == null) {
          b.a(this.getCurrentActivity(), b);
          return;
       }else {
          String str = "animate";
          if (p0.hasKey(str) && p0.getInt(str) != b) {
             b = false;
          }
          if (p0.hasKey("viewTag")) {
             m rNView = this.getRNView(p0.getInt("viewTag"));
             if (rNView != null) {
                rNView.D2(b);
                return;
             }
          }
          b.a(this.getCurrentActivity(), b);
          return;
       }
    }
    public WritableMap getBundleInfo(int p0){
       WritableMap obj;
       KrnBasicBridge krnBasicBrid = KrnBasicBridge.class;
       if (PatchProxy.isSupport(krnBasicBrid)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, krnBasicBrid, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       m rNView = this.getRNView(p0);
       if (rNView != null) {
          c krnContext = rNView.getKrnContext();
          if (krnContext != null) {
             obj = Arguments.createMap();
             obj.putString("bundleId", krnContext.b());
             obj.putString("componentName", krnContext.f());
             obj.putInt("versionCode", krnContext.e());
             obj.putString("version", krnContext.d());
             obj.putInt("taskId", krnContext.v());
             return obj;
          }
       }
       return Arguments.createMap();
    }
    public Map getConstants(){
       HashMap obj = PatchProxy.apply(null, this, KrnBasicBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("deviceInfo", this.convertToConstantsValue(d.a()));
       return obj;
    }
    public void getDeviceInfo(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnBasicBridge.class, "2")) {
          return;
       }
       this.callbackToJS(p0, this.convertToConstantsValue(d.a()));
       return;
    }
    public WritableMap getDeviceInfoSync(){
       Object obj = PatchProxy.apply(null, this, KrnBasicBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.convertObjToNativeMap(this.convertToConstantsValue(d.a()));
    }
    public String getIsp(){
       Object obj = PatchProxy.apply(null, this, KrnBasicBridge.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.p(this.getReactApplicationContext());
    }
    public String getLocale(){
       Object obj = PatchProxy.apply(null, this, KrnBasicBridge.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.b().c().getLocale();
    }
    public String getName(){
       return "KRNBasic";
    }
    public String getNetworkType(){
       Object obj = PatchProxy.apply(null, this, KrnBasicBridge.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.g(this.getReactApplicationContext());
    }
    public boolean getSlideBack(ReadableMap p0){
       String str = "rootTag";
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnBasicBridge.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return true;
       }
       m om = null;
       if (p0.hasKey(str)) {
          om = d.c(p0.getInt(str));
       }
       Activity activity = (om != null)? om.getActivity(): this.getCurrentActivity();
       if (activity instanceof o) {
          return activity.x0();
       }else {
          return true;
       }
    }
    public void hasInstalledApp(String p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnBasicBridge.class, "5")) {
          return;
       }
       if (SystemUtil.M(this.getReactApplicationContext(), p0)) {
          this.callbackToJS(p1, b.a);
       }else {
          this.callbackToJS(p1, new a("InstalledApp check failed."));
       }
       return;
    }
    public void log(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnBasicBridge.class, "14")) {
          return;
       }
       this.logOnRootView(-1, p0);
       return;
    }
    public void logOnRootView(int p0,String p1){
       KrnBasicBridge krnBasicBrid = KrnBasicBridge.class;
       if (PatchProxy.isSupport(krnBasicBrid) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, krnBasicBrid, "15")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("message", p1);
       Map map = d.d(p0);
       if (map != null) {
          hashMap.putAll(map);
       }
       d.e("logOnRootView, "+this.convertBeanToJson(hashMap));
       return;
    }
    public void open(String p0,Callback p1){
       a uoa;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnBasicBridge.class, "9")) {
          return;
       }
       try{
          Activity currentActiv = this.getCurrentActivity();
          if (!TextUtils.x(p0) && (p0.startsWith("market://") && (currentActiv != null && a.a(currentActiv, p0, true)))) {
             this.callbackToJS(p1, b.a);
             return;
          }else {
             Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(p0));
             intent.addFlags(0x10000000);
             if (currentActiv != null) {
                currentActiv.startActivity(intent);
             }else {
                this.getReactApplicationContext().startActivity(intent);
             }
             uoa = b.a;
          }
       }catch(java.lang.Exception e4){
          uoa = new a("Open failed:"+e4.toString());
       }
       this.callbackToJS(p1, uoa);
       return;
    }
    public void openWithInfo(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnBasicBridge.class, "10")) {
          return;
       }
       if (p0 == null) {
          p1.resolve(new JSApplicationIllegalArgumentException("Invalid params: "+p0));
          return;
       }else {
          String str = p0.getString("url");
          String str1 = "animate";
          boolean b = true;
          if (p0.hasKey(str1) && p0.getInt(str1) != b) {
             b = false;
          }
          Activity currentActiv = this.getCurrentActivity();
          if (!TextUtils.x(str) && (str.startsWith("market://") && (currentActiv != null && a.a(currentActiv, str, b)))) {
             p1.resolve(Boolean.TRUE);
             return;
          }else {
             Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
             intent.addFlags(0x10000000);
             if (currentActiv != null) {
                currentActiv.startActivity(intent);
                if (!b) {
                   currentActiv.overridePendingTransition(0, 0);
                }
             }else {
                this.getReactApplicationContext().startActivity(intent);
             }
             p1.resolve(Boolean.TRUE);
             return;
          }
       }
    }
    public void report(String p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnBasicBridge.class, "18")) {
          return;
       }
       if (p0 == null || p0.isEmpty()) {
          d.i("report error eventId id null or empty");
          return;
       }else {
          c obj = null;
          HashMap hashMap = (p1 != null)? p1.toHashMap(): obj;
          if (hashMap == null) {
             hashMap = new HashMap();
          }
          String str = this.convertBeanToJson(hashMap);
          if (!PatchProxy.applyVoidTwoRefs(p0, str, obj, KrnInternalManager.class, "6")) {
             a.p(p0, "key");
             a.p(str, "value");
             if (!KrnInternalManager.c.d()) {
                obj = c.b();
                a.o(obj, "KrnManager.get\(\)");
                obj.g().I(p0, str);
             }
          }
          return;
       }
    }
    public void setPageTitle(int p0,String p1){
       KrnBasicBridge krnBasicBrid = KrnBasicBridge.class;
       if (PatchProxy.isSupport(krnBasicBrid) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, krnBasicBrid, "11")) {
          return;
       }
       m om = d.c(p0);
       if (om != null) {
          ButtonParams uButtonParam = new ButtonParams();
          uButtonParam.buttonId = ButtonParams$PositionId.CENTER;
          uButtonParam.title = p1;
          UiThreadUtil.runOnUiThread(new a(om, uButtonParam));
       }
       return;
    }
    public void setSlideBack(ReadableMap p0){
       Activity activity;
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnBasicBridge.class, "17")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c uoc = this.convertJsonToBean(this.mGson.q(p0.toHashMap()), c.class);
       if (uoc == null) {
          return;
       }
       m om = d.c(uoc.rootTag);
       if (om != null) {
          activity = om.getActivity();
          if (activity instanceof o) {
             activity.U0(uoc.enabled);
             return;
          }
       }
       activity = this.getCurrentActivity();
       if (activity instanceof o) {
          activity.U0(uoc.enabled);
       }
       return;
    }
}
