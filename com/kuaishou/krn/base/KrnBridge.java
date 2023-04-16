package com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.kuaishou.krn.c;
import kj0.j;
import com.google.gson.Gson;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import java.util.Map;
import com.facebook.react.bridge.Arguments;
import ik0.m;
import com.facebook.react.bridge.ReactContext;
import lj0.c;
import lj0.d;
import java.lang.Integer;
import ri0.b;
import com.kuaishou.krn.NativeToJsKt;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Type;
import com.facebook.react.bridge.Promise;
import ri0.a;

public abstract class KrnBridge extends ReactContextBaseJavaModule	// class@000804
{
    public final Gson mGson;

    public void KrnBridge(ReactApplicationContext p0){
       super(p0);
       this.mGson = c.b().c().d();
    }
    public void callbackToJS(Callback p0,WritableNativeMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnBridge.class, "7")) {
          return;
       }
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = p0;
       if (!this.checkParamsValid(objArray)) {
          return;
       }
       Object[] objArray1 = new Object[i];
       objArray1[0] = p1;
       p0.invoke(objArray1);
       return;
    }
    public void callbackToJS(Callback p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnBridge.class, "6")) {
          return;
       }
       Object[] objArray = new Object[]{p0,p1};
       if (!this.checkParamsValid(objArray)) {
          return;
       }
       if (!p1 instanceof WritableMap) {
          p1 = this.convertObjToNativeMap(p1);
       }
       objArray = new Object[]{p1};
       p0.invoke(objArray);
       return;
    }
    public void callbackToJS(Callback p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnBridge.class, "8")) {
          return;
       }
       int i = 1;
       Object[] objArray = new Object[i];
       objArray[0] = p0;
       if (!this.checkParamsValid(objArray)) {
          return;
       }
       Object[] objArray1 = new Object[i];
       objArray1[0] = p1;
       p0.invoke(objArray1);
       return;
    }
    public boolean checkParamsValid(Object[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnBridge.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null && p0.length > 0) {
          int len = p0.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if (p0[i] == null) {
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
          return false;
       }
       Activity currentActiv = this.getCurrentActivity();
       if (currentActiv == null || currentActiv.isFinishing()) {
          return false;
       }else {
          return true;
       }
    }
    public String convertBeanToJson(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnBridge.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mGson.q(p0);
    }
    public Object convertJsonToBean(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnBridge.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mGson.h(p0, p1);
    }
    public WritableNativeMap convertObjToNativeMap(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnBridge.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Arguments.makeNativeMap(this.convertJsonToBean(this.convertBeanToJson(p0), Map.class));
    }
    public m getRNView(){
       c uoc = d.a(this.getReactApplicationContext());
       if (uoc != null) {
          return uoc.l();
       }
       return null;
    }
    public m getRNView(int p0){
       KrnBridge krnBridge = KrnBridge.class;
       if (PatchProxy.isSupport(krnBridge)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, krnBridge, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(this.getReactApplicationContext(), p0);
    }
    public void notifyEventToJS(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnBridge.class, "5")) {
          return;
       }
       NativeToJsKt.e(this.getReactApplicationContext(), p0, p1);
       return;
    }
    public Object parseParams(ReadableMap p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnBridge.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.parseParams(this.mGson.q(this.toHashMap(p0)), p1);
    }
    public Object parseParams(String p0,Class p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnBridge.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mGson.h(p0, p1);
    }
    public Object parseParams(String p0,Type p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnBridge.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mGson.i(p0, p1);
    }
    public void promiseToJS(Promise p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnBridge.class, "13")) {
          return;
       }
       Object[] objArray = new Object[]{p0,p1};
       if (!this.checkParamsValid(objArray)) {
          return;
       }
       if (!p1 instanceof WritableMap) {
          p1 = this.convertObjToNativeMap(p1);
       }
       p0.resolve(p1);
       return;
    }
    public Map toHashMap(ReadableMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KrnBridge.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b(p0);
    }
}
