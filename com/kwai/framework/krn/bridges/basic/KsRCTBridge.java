package com.kwai.framework.krn.bridges.basic.KsRCTBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Promise;
import com.kwai.framework.krn.bridges.model.calendar.JsCalendarParams;
import java.lang.String;
import java.util.Map;
import java.lang.Boolean;
import android.app.Activity;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import android.content.Context;
import com.kwai.framework.krn.bridges.model.calendar.JsCalendarParams$CalendarEvent;
import com.kwai.framework.krn.bridges.model.calendar.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.krn.bridges.model.calendar.JsCalendarResult;
import java.lang.Object;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.Class;
import com.kwai.framework.krn.bridges.basic.KsRCTBridge$b;
import java.lang.Enum;
import java.lang.Long;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import java.util.HashMap;
import brd.t;
import f86.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.robust.PatchProxy;
import f86.b;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.krn.bridges.model.KrnBasicInfo;
import java.lang.Integer;
import ik0.m;
import android.view.Window;
import ik0.g;
import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.os.IBinder;
import c96.a;
import com.facebook.react.bridge.ReadableArray;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.krn.bridges.basic.KsRCTBridge$a;
import java.lang.reflect.Type;
import el.a;
import java.util.List;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import k86.a;
import k86.b;
import com.kwai.framework.krn.bridges.model.KrnDeviceInfo;
import o56.a;
import android.os.Build;
import h30.a;
import oe6.a;
import java.util.Locale;
import ra6.a;
import ekd.p0;
import com.yxcorp.utility.SystemUtil;
import qe6.b;
import com.yxcorp.utility.n;
import lnc.a1;
import com.kwai.framework.krn.bridges.model.KrnInfo;
import lk0.l;
import com.facebook.react.bridge.Callback;
import jk0.b;
import jk0.c;
import com.kuaishou.krn.env.KrnDevEnv;
import java.lang.Number;
import android.text.TextUtils;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.ComponentName;
import com.yxcorp.gifshow.webview.c;
import java.lang.Exception;
import android.content.ClipboardManager;
import android.content.ClipData;
import com.kuaishou.krn.page.KrnFragment;
import androidx.fragment.app.Fragment;
import ps6.h;
import e17.i;

public class KsRCTBridge extends KrnBridge	// class@0015a9
{

    public void KsRCTBridge(ReactApplicationContext p0){
       super(p0);
    }
    public static void a(KsRCTBridge p0,ReadableMap p1,Promise p2){
       p0.lambda$changeEventForCalendar$1(p1, p2);
    }
    public static void b(KsRCTBridge p0,JsCalendarParams p1,String p2,Promise p3,Map p4,Boolean p5){
       p0.lambda$changeEventForCalendar$0(p1, p2, p3, p4, p5);
    }
    private void lambda$changeEventForCalendar$0(JsCalendarParams p0,String p1,Promise p2,Map p3,Boolean p4){
       if (p4.booleanValue()) {
          String str = a.a(this.getCurrentActivity(), p0.mEvent, p1);
          if (!TextUtils.x(str)) {
             JsCalendarResult jsCalendarRe = new JsCalendarResult();
             jsCalendarRe.mEventId = str;
             this.promiseToJS(p2, jsCalendarRe);
          }else {
             this.promiseToJS(p2, new JsErrorResult(401, ""));
          }
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p3.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (!uEntry.getValue().booleanValue() && !PermissionUtils.l(this.getCurrentActivity(), uEntry.getKey())) {
                uArrayList.add(uEntry.getKey());
             }
          }
          if (uArrayList.size() > 0) {
             PermissionUtils.o(this.getCurrentActivity(), this.getCurrentActivity().getString(R.string.arg_RES_7f10047a));
          }
          this.promiseToJS(p2, new JsErrorResult(412, ""));
       }
       return;
    }
    private void lambda$changeEventForCalendar$1(ReadableMap p0,Promise p1){
       JsSuccessResult jsSuccessRes;
       Object obj = this.parseParams(p0, JsCalendarParams.class);
       int i = KsRCTBridge$b.a[obj.mMethod.ordinal()];
       JsCalendarParams jsCalendarPa = 2;
       String str = "android.permission.READ_CALENDAR";
       String str1 = "android.permission.WRITE_CALENDAR";
       if (i != 1) {
          if (i != jsCalendarPa) {
             if (i == 3) {
                if (PermissionUtils.a(this.getCurrentActivity(), str1) && PermissionUtils.a(this.getCurrentActivity(), str)) {
                   JsCalendarParams mEvent = obj.mEvent;
                   if (mEvent != null && !TextUtils.x(mEvent.mEventId)) {
                      i = (!TextUtils.x(obj.mEvent.mEndDay))? a.e(this.getCurrentActivity(), Long.parseLong(obj.mEvent.mEventId), Long.parseLong(obj.mEvent.mEndDay), "content://com.android.calendar/events"): a.c(this.getCurrentActivity(), Long.parseLong(obj.mEvent.mEventId));
                      jsSuccessRes = (i > 0)? new JsSuccessResult(): new JsErrorResult(412, "");
                      this.promiseToJS(p1, jsSuccessRes);
                   }
                }
                this.promiseToJS(p1, new JsErrorResult(412, ""));
                return;
             }
          }else if(PermissionUtils.a(this.getCurrentActivity(), str1) && PermissionUtils.a(this.getCurrentActivity(), str)){
             jsCalendarPa = obj.mEvent;
             if (a.d(this.getCurrentActivity(), jsCalendarPa.mEventId, "content://com.android.calendar/events", Long.parseLong(jsCalendarPa.mEndDay))) {
                jsSuccessRes = new JsSuccessResult();
             label_00ca :
                this.promiseToJS(p1, jsSuccessRes);
             }
          }
          JsErrorResult jsErrorResul = new JsErrorResult(412, "");
          goto label_00ca ;
       }else {
          String[] stringArray = new String[]{str1,str};
          HashMap hashMap = new HashMap();
          for (int i1 = 0; i1 < jsCalendarPa; i1 = i1 + 1) {
             object oobject = stringArray[i1];
             boolean b = PermissionUtils.l(this.getCurrentActivity(), oobject);
             if (!b && PermissionUtils.a(this.getCurrentActivity(), oobject)) {
                b = true;
             }
             hashMap.put(oobject, Boolean.valueOf(b));
          }
          String[] stringArray1 = new String[]{str1,str};
          a uoa = new a(this, obj, "content://com.android.calendar/events", p1, hashMap);
          PermissionUtils.j(this.getCurrentActivity(), stringArray1).subscribe(i1, Functions.d());
       }
       return;
    }
    public void changeEventForCalendar(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsRCTBridge.class, "9")) {
          return;
       }
       if (p0 == null) {
          p1.reject(new JSApplicationIllegalArgumentException("params must not be null"));
          return;
       }else {
          UiThreadUtil.runOnUiThread(new b(this, p0, p1));
          return;
       }
    }
    public final Map convertToConstantsValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KsRCTBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.convertJsonToBean(this.convertBeanToJson(new KrnBasicInfo(p0)), Map.class);
    }
    public void dismissKeyboard(int p0){
       KsRCTBridge ksRCTBridge = KsRCTBridge.class;
       if (PatchProxy.isSupport(ksRCTBridge) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ksRCTBridge, "11")) {
          return;
       }
       try{
          m rNView = this.getRNView(p0);
          if (rNView != null) {
             Window attachedWind = rNView.getAttachedWindow();
             if (attachedWind == null) {
                attachedWind = rNView.getActivity().getWindow();
             }
             if (attachedWind != null) {
                InputMethodManager systemServic = rNView.getActivity().getSystemService("input_method");
                if (systemServic != null && systemServic.isActive()) {
                   systemServic.hideSoftInputFromWindow(attachedWind.getDecorView().getWindowToken(), 0);
                   Object[] objArray = new Object[0];
                   a.D().E("hideSoftInputFromWindow success", objArray);
                }
             }
          }
       }catch(java.lang.Exception e4){
          a.D().C("dismissKeyboard error", e4);
       }
    label_0061 :
       return;
    }
    public void fetchStartupConfig(ReadableArray p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsRCTBridge.class, "8")) {
          return;
       }
       if (p0 == null) {
          p1.reject(new JSApplicationIllegalArgumentException("params must not be null"));
          return;
       }else {
          try{
             ArrayList uArrayList = new ArrayList();
             Gson a = a.a;
             List list = a.i(a.q(p0.toArrayList()), new KsRCTBridge$a(this).getType());
             WritableMap writableMap = Arguments.createMap();
             if (e0 != null && e0.size() > 0) {
                Iterator iterator = e0.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   if (uoa == null) {
                      continue ;
                   }
                   uoa.a(writableMap);
                }
             }
             p1.resolve(writableMap);
             return;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public Map getConstants(){
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       HashMap obj = PatchProxy.apply(null, this, KsRCTBridge.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       KrnDeviceInfo krnDeviceInf = PatchProxy.apply(null, null, uob, str);
       if (krnDeviceInf != patchProxyRe) {
       }else {
          krnDeviceInf = b.a;
          if (krnDeviceInf == null) {
             krnDeviceInf = new KrnDeviceInfo();
             krnDeviceInf.mProductName = a.x;
             krnDeviceInf.mAppVersion = a.m;
             krnDeviceInf.mManufacturer = a.j;
             krnDeviceInf.mModel = Build.MODEL;
             krnDeviceInf.mSystemVersion = a.p;
             krnDeviceInf.mUUID = a.a;
             krnDeviceInf.mOaid = TextUtils.k(a.d());
             krnDeviceInf.mGlobalId = a.j();
             krnDeviceInf.mLocale = String.valueOf(a.c());
             krnDeviceInf.mNetworkType = p0.g(a.B);
             krnDeviceInf.mImei = TextUtils.I(SystemUtil.m(a.B));
             krnDeviceInf.mMac = TextUtils.I(SystemUtil.o(a.B, b.a()));
             krnDeviceInf.mAndroidId = SystemUtil.d(a.B, "");
             krnDeviceInf.mScreenWidth = n.y(a.B);
             krnDeviceInf.mScreenHeight = n.u(a.B);
             krnDeviceInf.mStatusBarHeight = n.A(a.B);
             krnDeviceInf.mTitleBarHeight = a1.d(0x7f070fdf);
             b.a = krnDeviceInf;
          }
       }
       obj.put("deviceInfo", this.convertToConstantsValue(krnDeviceInf));
       KrnInfo krnInfo = PatchProxy.apply(null, null, uob, "2");
       if (krnInfo != patchProxyRe) {
       }else {
          krnInfo = b.b;
          if (krnInfo == null) {
             krnInfo = new KrnInfo();
             krnInfo.mBasicBundleVersion = 0;
             krnInfo.mKrnSdkVersion = l.b();
             b.b = krnInfo;
          }
       }
       obj.put("krnInfo", this.convertToConstantsValue(krnInfo));
       return obj;
    }
    public void getEnv(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsRCTBridge.class, "3")) {
          return;
       }
       Object[] objArray = new Object[]{c.a().L().name()};
       p0.invoke(objArray);
       return;
    }
    public String getEnvSync(){
       Object obj = PatchProxy.apply(null, this, KsRCTBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.a().L().name();
    }
    public int getKeyboardHeight(){
       Object obj = PatchProxy.apply(null, this, KsRCTBridge.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return n.n(this.getReactApplicationContext());
    }
    public String getName(){
       return "KSRCTBridge";
    }
    public void loadUrlOnNewPage(ReadableMap p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsRCTBridge.class, "7")) {
          return;
       }
       if (p0 == null) {
          p1.reject(new JSApplicationIllegalArgumentException("Invalid params: "+p0));
          return;
       }else {
          String str = p0.getString("url");
          if (TextUtils.isEmpty(str)) {
             p1.reject(new JSApplicationIllegalArgumentException("Invalid URL: "+str));
             return;
          }else {
             String str1 = p0.getString("leftTopBtnType");
             if (TextUtils.isEmpty(str1)) {
                str1 = "back";
             }
             try{
                Activity currentActiv = this.getCurrentActivity();
                if (currentActiv == null) {
                   currentActiv = ActivityContext.g().e();
                }
                Intent intent = KwaiWebViewActivity.N3(currentActiv, str).n(str1).a();
                String packageName = this.getReactApplicationContext().getPackageName();
                ComponentName uComponentNa = intent.resolveActivity(this.getReactApplicationContext().getPackageManager());
                String packageName1 = (uComponentNa != null)? uComponentNa.getPackageName(): "";
                if (currentActiv == null || !packageName.equals(packageName1)) {
                   intent.addFlags(0x10000000);
                }
                if (currentActiv != null) {
                   c.i(currentActiv, intent);
                }else {
                   c.i(this.getReactApplicationContext(), intent);
                }
                p1.resolve(Boolean.TRUE);
             }catch(java.lang.Exception e5){
                p1.reject(new JSApplicationIllegalArgumentException("Could not open URL \'"+str+"\': "+e5.getMessage()));
             }
             return;
          }
       }
    }
    public void setClipBoard(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsRCTBridge.class, "5")) {
          return;
       }
       ClipboardManager systemServic = this.getCurrentActivity().getSystemService("clipboard");
       if (systemServic != null) {
          systemServic.setPrimaryClip(ClipData.newPlainText("", p0));
       }
       return;
    }
    public void setScreenShotReportEnable(int p0,ReadableMap p1){
       KsRCTBridge ksRCTBridge = KsRCTBridge.class;
       if (PatchProxy.isSupport(ksRCTBridge) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, ksRCTBridge, "10")) {
          return;
       }
       if (p1 != null && p1.hasKey("trace")) {
          m rNView = this.getRNView(p0);
          if (rNView == null) {
             return;
          }else if(rNView instanceof KrnFragment){
             Fragment parentFragme = rNView.getParentFragment();
             if (parentFragme instanceof h) {
                parentFragme.L4(p1.getBoolean("trace"));
             }
          }
       }
       return;
    }
    public void toast(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsRCTBridge.class, "6")) {
          return;
       }
       i.f(R.style.arg_RES_7f11066a, p0, true);
       return;
    }
}
