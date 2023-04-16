package com.kuaishou.merchant.anim.KwaishopAnimationModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$a;
import nsd.u;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.HashMap;
import com.yxcorp.utility.Log;
import java.lang.Double;
import java.util.ArrayList;
import android.app.Activity;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$b;
import la4.b;
import crd.b;
import la4.l;
import com.facebook.react.bridge.ReactContext;
import android.view.View;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$c;
import hf.a;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$d;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$e;
import java.util.List;
import java.util.Objects;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$f;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Boolean;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$g;
import com.facebook.react.bridge.ReadableArray;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$h;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$i;
import com.kuaishou.merchant.anim.KwaishopAnimationModule$j;

public final class KwaishopAnimationModule extends ReactContextBaseJavaModule	// class@0014ef
{
    public final ReactApplicationContext reactContext;
    public static final KwaishopAnimationModule$a Companion;

    static {
       KwaishopAnimationModule.Companion = new KwaishopAnimationModule$a(null);
    }
    public void KwaishopAnimationModule(ReactApplicationContext p0){
       super(p0);
       this.reactContext = p0;
    }
    public final void cancelAnimation(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaishopAnimationModule.class, "7")) {
          return;
       }
       Log.g("KwaishopAnimationModule", " actionProps = "+p0.toHashMap());
       HashMap hashMap = p0.toHashMap();
       Object obj = hashMap.get("rootTag");
       ArrayList uArrayList = null;
       if (!obj instanceof Double) {
          obj = uArrayList;
       }
       if (obj != null) {
          double d = obj.doubleValue();
          hashMap = hashMap.get("viewTagList");
          if (hashMap instanceof ArrayList) {
             uArrayList = hashMap;
          }
          l.a(this.getCurrentActivity(), new KwaishopAnimationModule$b(uArrayList, d), false);
       }
       return;
    }
    public String getName(){
       return "KwaishopAnimationRN";
    }
    public final View getRNRootView(ReactContext p0,int p1){
       KwaishopAnimationModule kwaishopAnim = KwaishopAnimationModule.class;
       if (PatchProxy.isSupport(kwaishopAnim)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, kwaishopAnim, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          a.m(p0);
          UIManagerModule nativeModule = p0.getNativeModule(UIManagerModule.class);
          return nativeModule.resolveView(nativeModule.resolveRootTagFromReactTag(p1));
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public final View getTargetView(ReactContext p0,int p1){
       View obj;
       KwaishopAnimationModule kwaishopAnim = KwaishopAnimationModule.class;
       if (PatchProxy.isSupport(kwaishopAnim)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, kwaishopAnim, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       UIManagerModule nativeModule = (p0 != null)? p0.getNativeModule(UIManagerModule.class): obj;
       try{
          if (nativeModule != null) {
             obj = nativeModule.resolveView(p1);
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public final void pauseAnimation(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaishopAnimationModule.class, "5")) {
          return;
       }
       Log.g("KwaishopAnimationModule", " actionProps = "+p0.toHashMap());
       HashMap hashMap = p0.toHashMap();
       Object obj = hashMap.get("rootTag");
       ArrayList uArrayList = null;
       if (!obj instanceof Double) {
          obj = uArrayList;
       }
       if (obj != null) {
          double d = obj.doubleValue();
          hashMap = hashMap.get("viewTagList");
          if (hashMap instanceof ArrayList) {
             uArrayList = hashMap;
          }
          l.a(this.getCurrentActivity(), new KwaishopAnimationModule$c(uArrayList, d), false);
       }
       return;
    }
    public final void playAnimInner(int p0,String p1,String p2,String p3){
       if (PatchProxy.isSupport(KwaishopAnimationModule.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, KwaishopAnimationModule.class, "1")) {
          return;
       }
       Log.g("KwaishopAnimationRN", "rootTag = "+p0+" url = "+p1+" nativeId = "+p2+" animation ="+p3);
       View rNRootView = this.getRNRootView(this.reactContext, p0);
       if (rNRootView != null && (p1 != null && p2 != null)) {
          rNRootView = a.a(rNRootView, p2);
          if (rNRootView != null) {
             l.a(this.getCurrentActivity(), new KwaishopAnimationModule$d(rNRootView, p3, p1), false);
          }else {
             KwaishopAnimationModule$e uoe = new KwaishopAnimationModule$e(this, p2, p3, p1);
             if (!PatchProxy.applyVoidOneRefs(uoe, null, a.class, "3")) {
                a.a.add(uoe);
             }
          }
       }
       return;
    }
    public final void playAnimation(ReadableMap p0){
       KwaishopAnimationModule$f uof;
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaishopAnimationModule.class, "3")) {
          return;
       }
       Log.g("KwaishopAnimationRN", " kwaiAnimationProps = "+p0.toHashMap());
       HashMap hashMap = p0.toHashMap();
       Object obj = hashMap.get("rootTag");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Double");
       double d = obj.doubleValue();
       obj = hashMap.get("source");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
       Object obj1 = obj;
       hashMap = hashMap.get("animations");
       if (!hashMap instanceof List) {
          uof = null;
       }
       KwaishopAnimationModule$f uof1 = new KwaishopAnimationModule$f(this, uof, d, obj1);
       k1.o(uof);
       return;
    }
    public final void playAnimationInnerV2(int p0,String p1,Integer p2,String p3,HashMap p4,Boolean p5){
       KwaishopAnimationModule kwaishopAnim = this;
       KwaishopAnimationModule kwaishopAnim1 = KwaishopAnimationModule.class;
       if (PatchProxy.isSupport(kwaishopAnim1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, kwaishopAnim1, "2")) {
             return;
          }
       }
       if (this.getRNRootView(kwaishopAnim.reactContext, p0) != null && (p1 != null && p2 != null)) {
          p2.intValue();
          boolean b = (p5 != null)? p5.booleanValue(): false;
          KwaishopAnimationModule$g og = new KwaishopAnimationModule$g(this.getTargetView(kwaishopAnim.reactContext, p2.intValue()), p4, p1, p3, p0, p2, b);
          l.a(this.getCurrentActivity(), v11, 0);
       }
    label_0062 :
       return;
    }
    public final void preload(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaishopAnimationModule.class, "4")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = (p0 != null)? p0.toArrayList(): null;
       Objects.requireNonNull(uArrayList1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */>");
       Iterator iterator = uArrayList1.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next().get("uri");
          if (str != null) {
             uArrayList.add(str);
          }
       }
       Log.g("KwaishopAnimationRN", uArrayList.toString());
       l.a(this.getCurrentActivity(), new KwaishopAnimationModule$h(this, uArrayList), false);
       return;
    }
    public final void release(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaishopAnimationModule.class, "8")) {
          return;
       }
       Log.g("KwaishopAnimationModule", " actionProps = "+p0.toHashMap());
       p0 = p0.toHashMap().get("rootTag");
       if (!p0 instanceof Double) {
          p0 = null;
       }
       if (p0 != null) {
          l.a(this.getCurrentActivity(), new KwaishopAnimationModule$i(p0.doubleValue()), false);
       }
       return;
    }
    public final void resumeAnimation(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaishopAnimationModule.class, "6")) {
          return;
       }
       Log.g("KwaishopAnimationModule", " actionProps = "+p0.toHashMap());
       HashMap hashMap = p0.toHashMap();
       Object obj = hashMap.get("rootTag");
       ArrayList uArrayList = null;
       if (!obj instanceof Double) {
          obj = uArrayList;
       }
       if (obj != null) {
          double d = obj.doubleValue();
          hashMap = hashMap.get("viewTagList");
          if (hashMap instanceof ArrayList) {
             uArrayList = hashMap;
          }
          l.a(this.getCurrentActivity(), new KwaishopAnimationModule$j(uArrayList, d), false);
       }
       return;
    }
}
