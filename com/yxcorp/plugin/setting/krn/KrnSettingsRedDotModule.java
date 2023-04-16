package com.yxcorp.plugin.setting.krn.KrnSettingsRedDotModule;
import nc5.c;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.Throwable;
import com.facebook.react.bridge.WritableMap;
import java.lang.Integer;
import java.lang.Boolean;
import com.facebook.react.bridge.Arguments;
import k2b.e0;
import nc5.i;
import rgd.a;
import q87.c;
import com.facebook.react.bridge.WritableArray;
import wkd.b;
import com.kwai.component.menudot.b;
import com.facebook.react.bridge.ReadableMap;

public class KrnSettingsRedDotModule extends KrnBridge implements c	// class@0008cb
{

    public void KrnSettingsRedDotModule(ReactApplicationContext p0){
       super(p0);
    }
    public final ReadableArray checkRedDotTypes(ReadableArray p0,Promise p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, KrnSettingsRedDotModule.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          p1.reject(new JSApplicationIllegalArgumentException("redDotTypes must not be null"));
          return null;
       }else if(!p0.size()){
          p1.reject(new JSApplicationIllegalArgumentException("redDotTypes must not be empty"));
          return null;
       }else {
          return p0;
       }
    }
    public final WritableMap createRedDotParams(int p0,boolean p1){
       WritableMap obj;
       KrnSettingsRedDotModule krnSettingsR = KrnSettingsRedDotModule.class;
       if (PatchProxy.isSupport(krnSettingsR)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, krnSettingsR, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Arguments.createMap();
       obj.putInt("type", p0);
       obj.putBoolean("hasRodDot", p1);
       return obj;
    }
    public String getName(){
       return "SettingsRedDot";
    }
    public void onRedDotClick(int p0){
       KrnSettingsRedDotModule krnSettingsR = KrnSettingsRedDotModule.class;
       if (PatchProxy.isSupport(krnSettingsR) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, krnSettingsR, "1")) {
          return;
       }
       i.b(p0, null);
       return;
    }
    public void onRedDotShow(int p0){
       KrnSettingsRedDotModule krnSettingsR = KrnSettingsRedDotModule.class;
       if (PatchProxy.isSupport(krnSettingsR) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, krnSettingsR, "2")) {
          return;
       }
       i.e(p0, null);
       return;
    }
    public void onRedDotsShow(ReadableArray p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnSettingsRedDotModule.class, "3")) {
          return;
       }
       p0 = this.checkRedDotTypes(p0, p1);
       if (p0 == null) {
          return;
       }
       int i = 0;
       try{
          int i1 = p0.size();
          for (; i < i1; i = i + 1) {
             i.e(p0.getInt(i), null);
          }
          WritableMap writableMap = Arguments.createMap();
          writableMap.putBoolean("result", true);
          p1.resolve(writableMap);
       }catch(java.lang.Exception e5){
          a.C().e("ReactNative", "SettingsRedDot#onRedDotsShow:", e5);
          p1.reject(e5);
       }
       return;
    }
    public void onUpdate(int p0,int p1){
       KrnSettingsRedDotModule krnSettingsR = KrnSettingsRedDotModule.class;
       if (PatchProxy.isSupport(krnSettingsR) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, krnSettingsR, "6")) {
          return;
       }
       boolean b = (p1 > 0)? true: false;
       this.notifyEventToJS("CALLBACK_SETTINGS_RED_DOT", this.createRedDotParams(p0, b));
       return;
    }
    public void registerRedDotListener(ReadableArray p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnSettingsRedDotModule.class, "4")) {
          return;
       }
       p0 = this.checkRedDotTypes(p0, p1);
       if (p0 == null) {
          return;
       }
       try{
          WritableArray writableArra = Arguments.createArray();
          int i1 = p0.size();
          for (int i = 0; i < i1; i = i + 1) {
             int intx = p0.getInt(i);
             b.a(0x34c80eb4).r(intx, this);
             writableArra.pushMap(this.createRedDotParams(intx, i.c(intx)));
          }
          p1.resolve(writableArra);
       }catch(java.lang.Exception e6){
          a.C().e("ReactNative", "SettingsRedDot#registerRedDotListener:", e6);
          p1.reject(e6);
       }
       return;
    }
    public void unregisterRedDotListener(ReadableArray p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KrnSettingsRedDotModule.class, "5")) {
          return;
       }
       p0 = this.checkRedDotTypes(p0, p1);
       if (p0 == null) {
          return;
       }
       int i = 0;
       try{
          int i1 = p0.size();
          for (; i < i1; i = i + 1) {
             b.a(0x34c80eb4).s(p0.getInt(i), this);
          }
          WritableMap writableMap = Arguments.createMap();
          writableMap.putBoolean("result", true);
          p1.resolve(writableMap);
       }catch(java.lang.Exception e5){
          a.C().e("ReactNative", "SettingsRedDot#unregisterRedDotListener:", e5);
          p1.reject(e5);
       }
       return;
    }
}
