package com.facebook.react.uimanager.events.ReactEventEmitter;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import android.util.SparseArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import bf.a;
import cb.a;
import cb.c;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.ReadableArray;
import od.a;
import com.facebook.react.bridge.ReadableMap;

public class ReactEventEmitter implements RCTEventEmitter	// class@001342
{
    public final SparseArray mEventEmitters;
    public final ReactApplicationContext mReactContext;

    public void ReactEventEmitter(ReactApplicationContext p0){
       super();
       this.mEventEmitters = new SparseArray();
       this.mReactContext = p0;
    }
    public final RCTEventEmitter getEventEmitter(int p0){
       Integer obj;
       ReactEventEmitter reactEventEm = ReactEventEmitter.class;
       if (PatchProxy.isSupport(reactEventEm)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, reactEventEm, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = a.a(p0);
       RCTEventEmitter rCTEventEmit = this.mEventEmitters.get(i);
       if (rCTEventEmit == null) {
          Integer integer = Integer.valueOf(p0);
          obj = Integer.valueOf(i);
          if (a.a.d(4)) {
             Object[] objArray = new Object[]{integer,obj};
             a.a.i("ReactEventEmitter", a.i("Unable to find event emitter for reactTag: %d - uiManagerType: %d", objArray));
          }
          rCTEventEmit = this.mReactContext.getJSModule(RCTEventEmitter.class);
       }
       return rCTEventEmit;
    }
    public void receiveEvent(int p0,String p1,WritableMap p2){
       if (PatchProxy.isSupport(ReactEventEmitter.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, ReactEventEmitter.class, "3")) {
          return;
       }
       this.getEventEmitter(p0).receiveEvent(p0, p1, p2);
       return;
    }
    public void receiveTouches(String p0,WritableArray p1,WritableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactEventEmitter.class, "4")) {
          return;
       }
       int i = 0;
       boolean b = (p1.size() > 0)? true: false;
       a.a(b);
       this.getEventEmitter(p1.getMap(i).getInt("target")).receiveTouches(p0, p1, p2);
       return;
    }
    public void register(int p0,RCTEventEmitter p1){
       ReactEventEmitter reactEventEm = ReactEventEmitter.class;
       if (PatchProxy.isSupport(reactEventEm) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, reactEventEm, "1")) {
          return;
       }
       this.mEventEmitters.put(p0, p1);
       return;
    }
    public void unregister(int p0){
       ReactEventEmitter reactEventEm = ReactEventEmitter.class;
       if (PatchProxy.isSupport(reactEventEm) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, reactEventEm, "2")) {
          return;
       }
       this.mEventEmitters.remove(p0);
       return;
    }
}
