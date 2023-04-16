package com.kuaishou.krn.widget.react.KrnReactRootView;
import com.facebook.react.ReactRootView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.os.SystemClock;
import lj0.c;
import com.kuaishou.krn.delegate.KrnDelegate;
import mk0.f;
import java.lang.Throwable;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mk0.g;
import android.view.ViewGroup;
import ek0.d;
import com.facebook.react.bridge.CatalystInstance;
import sj0.b;
import com.facebook.react.a;
import android.os.Bundle;
import hi0.b;
import org.json.JSONObject;
import bk0.j;
import org.json.JSONException;
import com.facebook.react.bridge.ReactContext;
import android.view.ViewParent;
import ze.p;
import java.util.Objects;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler;
import com.kuaishou.krn.log.sample.KdsMemoryWarningSampler$a;
import java.lang.Number;
import java.lang.Runtime;
import java.lang.Exception;
import kotlin.Pair;
import java.lang.Long;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.List;
import java.lang.StringBuilder;
import com.kuaishou.krn.apm.MemoryMonitor;
import msd.l;
import android.app.ActivityManager$MemoryInfo;
import fk0.a;
import ck0.a;
import java.util.Arrays;
import gf.d;
import yd.e;
import java.util.ArrayList;
import java.util.Collection;
import mk0.c;
import android.app.Activity;
import ik0.m;
import android.view.Window;
import android.widget.PopupWindow;
import android.view.View;
import mk0.b;
import java.lang.Runnable;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.kuaishou.krn.c;
import java.util.HashMap;
import com.kuaishou.krn.apm.memory.KdsLeakDetector;
import ze.v;
import java.util.Map;
import jk0.b;
import jk0.c;
import ukd.a;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import ze.c;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.bridge.NativeModule;
import mk0.a;
import es6.a;
import java.util.WeakHashMap;
import qrd.p;
import mk0.d;
import com.kuaishou.krn.context.KrnViewTagManager;
import es6.d;

public class KrnReactRootView extends ReactRootView	// class@000927
{
    public String I;
    public KrnDelegate J;
    public boolean K;
    public boolean L;
    public long M;
    public f N;
    public g O;
    public c P;
    public a Q;
    public boolean R;
    public static final int S;

    public void KrnReactRootView(Context p0){
       super(p0);
       this.K = false;
       this.L = false;
       this.M = 0;
       this.R = false;
    }
    public void KrnReactRootView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.K = false;
       this.L = false;
       this.M = 0;
       this.R = false;
    }
    public void KrnReactRootView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.K = false;
       this.L = false;
       this.M = 0;
       this.R = false;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactRootView.class, "7")) {
          return;
       }
       try{
          super.dispatchDraw(p0);
          if (this.J != null && (!TextUtils.isEmpty(this.I) && (this.getChildCount() > 0 && this.L != null))) {
             KrnReactRootView tM = this.M;
             long l = SystemClock.elapsedRealtime() - tM;
             tM = (tM > 0 && l >= 0)? 1: null;
             if (tM) {
                this.N.a(this.J.e(), l);
             }
             this.L = false;
          }
       }catch(java.lang.Exception e8){
          this.C(e8);
       }
    label_004d :
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       KrnReactRootView obj = PatchProxy.applyOneRefs(p0, this, KrnReactRootView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.O;
       if (obj != null && obj.dispatchTouchEvent(p0)) {
          return true;
       }
       try{
          return super.dispatchTouchEvent(p0);
       }catch(java.lang.Exception e3){
          d.b("ReactNative", "dispatchTouchEvent ", e3);
          return false;
       }
    }
    public String getBundleId(){
       return this.I;
    }
    public final CatalystInstance getCurrentCatalystInstance(){
       c obj = PatchProxy.apply(null, this, KrnReactRootView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getKrnDelegate().e();
       if (obj != null) {
          b uob = obj.i();
          if (uob != null) {
             return uob.b();
          }
       }
       return null;
    }
    public KrnDelegate getKrnDelegate(){
       return this.J;
    }
    public void l(a p0,String p1,Bundle p2){
       b c;
       KrnReactRootView j;
       KdsMemoryWarningSampler kdsMemoryWar;
       String this;
       String[] obj1;
       String str;
       l ol;
       String str1;
       List list;
       Bundle obj3;
       boolean b;
       c obj4;
       c obj5;
       boolean b1;
       HashMap hashMap;
       View decorView;
       int i;
       Activity uActivity;
       boolean this1;
       Bundle this1;
       MemoryMonitor m;
       ActivityManager$MemoryInfo memoryInfo;
       double d;
       double d1;
       String str3;
       Bundle uBundle;
       a uoa;
       a uoa1;
       l l1;
       KdsMemoryWarningSampler d2;
       Object obj6;
       Bundle obj7;
       double d3;
       Integer obj8;
       List a;
       Pair obj9;
       int i1;
       int i2;
       boolean b2;
       Long second;
       long l2;
       Pair b3;
       l ol1;
       long l = this;
       Object obj = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, KrnReactRootView.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(obj, l, KrnReactRootView.class, "18")) {
          String str2 = "bundleId";
          String str4 = obj.getString(str2, "");
          String obj2 = "componentName";
          String str5 = obj.getString(obj2, "");
          this = "krnUri";
          this = (obj.containsKey(this))? obj.getString(this): p2.toString();
          try{
             JSONObject jSONObject = new JSONObject();
             jSONObject.put(str2, str4);
             jSONObject.put(obj2, str5);
             jSONObject.put("schemeFiled", this);
             j.b.b("krn_scheme_report", jSONObject.toString());
          }catch(org.json.JSONException e0){
             d.a(e0.getLocalizedMessage());
          }
       }
    }
    public void m(){
       c c;
       if (PatchProxy.applyVoid(null, this, KrnReactRootView.class, "10")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, KrnReactRootView.class, "11") && c.a().H()) {
          int i = 0;
          Object[] objArray = new Object[i];
          Object obj = a.b("com.kuaishou.krn.debug.devtools.KdsDevtoolsManager", "getInstance", objArray);
          if (obj != null) {
             Object[] objArray1 = new Object[]{this.getJSModuleName()};
             a.a(obj, "removeInspectors", objArray1);
          }
       }
       super.m();
       if (this.N != null) {
          this.N = null;
       }
       this.M = 0;
       if (!PatchProxy.applyVoid(null, this, KrnReactRootView.class, "12")) {
          KrnReactRootView tP = this.P;
          if (tP != null) {
             if (!PatchProxy.applyVoid(null, tP, c.class, "2")) {
                tP.dismiss();
                c d = tP.d;
                if (d != null) {
                   d.getViewTreeObserver().removeOnGlobalLayoutListener(tP);
                   tP.d = null;
                }
                StringBuilder str = "execute stopListening,parent window: ";
                c = tP.c;
                String str1 = (c != null)? c.toString(): "";
                d.e(str+str1+" and popupWindow: "+tP.hashCode());
             }
             this.P = null;
          }
       }
       return;
    }
    public void o(ReactContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnReactRootView.class, "1")) {
          return;
       }
       c.f(this.getContext());
       if (p0 != null && p0.hasActiveCatalystInstance()) {
          p0.getNativeModule(DeviceInfoModule.class).emitUpdateDimensionsEvent();
       }
    label_002c :
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, KrnReactRootView.class, "15")) {
          return;
       }
       super.onAttachedToWindow();
       this.R = true;
       KrnReactRootView tQ = this.Q;
       if (tQ != null) {
          tQ.onAttachedToWindow();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, KrnReactRootView.class, "16")) {
          return;
       }
       super.onDetachedFromWindow();
       KrnReactRootView tQ = this.Q;
       if (tQ != null) {
          tQ.onDetachedFromWindow();
       }
       this.R = false;
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(KrnReactRootView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, KrnReactRootView.class, "6")) {
          return;
       }
       try{
          this.setMeasuredDimension(p0, p1);
          super.onMeasure(p0, p1);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public boolean p(){
       return this.K;
    }
    public void q(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KrnReactRootView.class, "14")) {
          return;
       }
       a uoa = a.c();
       CatalystInstance currentCatal = this.getCurrentCatalystInstance();
       Integer integer = Integer.valueOf(this.getRootViewTag());
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidTwoRefs(currentCatal, integer, uoa, a.class, "5") && uoa.a.containsKey(currentCatal)) {
          WeakHashMap weakHashMap = uoa.a.get(currentCatal);
          if (weakHashMap != null && weakHashMap.containsKey(integer)) {
             weakHashMap.remove(integer);
             if (weakHashMap.isEmpty()) {
                uoa.a.remove(currentCatal);
             }
          }
       }
       uoa = this.getReactInstanceManager();
       if (uoa == null) {
          return;
       }else {
          ReactContext reactContext = uoa.n();
          if (reactContext == null) {
             return;
          }else if(!ExpConfigKt.b()){
             Boolean uBoolean = PatchProxy.apply(objArray, objArray, ExpConfigKt.class, "36");
             if (uBoolean == PatchProxyResult.class) {
                uBoolean = ExpConfigKt.I.getValue();
             }
             if (!uBoolean.booleanValue()) {
                reactContext.runOnNativeModulesQueueThread(new d(this, reactContext));
             }
          }
          return;
       }
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       if (PatchProxy.isSupport(KrnReactRootView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KrnReactRootView.class, "8")) {
          return;
       }
       KrnReactRootView tO = this.O;
       if (tO != null) {
          tO.requestDisallowInterceptTouchEvent(p0);
       }
       super.requestDisallowInterceptTouchEvent(p0);
       return;
    }
    public void setBundleId(String p0){
       this.I = p0;
       this.L = true;
    }
    public void setKdsAttachWindowCallback(a p0){
       this.Q = p0;
    }
    public void setKrnDelegate(KrnDelegate p0){
       this.J = p0;
    }
    public void setPreload(boolean p0){
       this.K = p0;
    }
    public void setReactRootViewDisplayCallback(f p0){
       this.N = p0;
    }
    public void setReactRootViewGestureHandler(g p0){
       this.O = p0;
    }
    public void setRootViewTag(int p0){
       String str1;
       if (PatchProxy.isSupport(KrnReactRootView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KrnReactRootView.class, "2")) {
          return;
       }
       d.e("setRootViewTag with old: "+this.getRootViewTag()+" new: "+p0);
       KrnViewTagManager iNSTANCE = KrnViewTagManager.INSTANCE;
       iNSTANCE.remove(this.getRootViewTag());
       if (!this.p()) {
          iNSTANCE.put(p0, this.getKrnDelegate().e());
       }
       c uoc = this.getKrnDelegate().e();
       String str = "";
       if (uoc != null) {
          str = String.valueOf(uoc.e());
          str1 = uoc.d();
       }else {
          str1 = str;
       }
       d uod = new d();
       uod.a = this.I;
       uod.b = this.getJSModuleName();
       uod.d = str;
       uod.c = str1;
       a.c().a(this.getCurrentCatalystInstance(), Integer.valueOf(p0), uod);
       super.setRootViewTag(p0);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, KrnReactRootView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "KrnReactRootView{mBundleId=\'"+this.I+'''+", mKrnDelegate="+this.J+", mIsPreload="+this.K+'}';
    }
}
