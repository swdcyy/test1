package com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReadableMap;
import od.a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeArray;

public class WritableNativeMap extends ReadableNativeMap implements WritableMap	// class@001243
{

    static {
       ReactBridge.staticInit();
    }
    public void WritableNativeMap(){
       super(WritableNativeMap.initHybrid());
    }
    public static native HybridData initHybrid();
    public WritableMap copy(){
       WritableNativeMap obj = PatchProxy.apply(null, this, WritableNativeMap.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new WritableNativeMap();
       obj.merge(this);
       return obj;
    }
    public void merge(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WritableNativeMap.class, "3")) {
          return;
       }
       a.b(p0 instanceof ReadableNativeMap, "Illegal type provided");
       this.mergeNativeMap(p0);
       return;
    }
    public native final void mergeNativeMap(ReadableNativeMap p0);
    public void putArray(String p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WritableNativeMap.class, "2")) {
          return;
       }
       boolean b = (p1 == null || p1 instanceof WritableNativeArray)? true: false;
       a.b(b, "Illegal type provided");
       this.putNativeArray(p0, p1);
       return;
    }
    public native void putBoolean(String p0,boolean p1);
    public native void putDouble(String p0,double p1);
    public native void putInt(String p0,int p1);
    public void putMap(String p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WritableNativeMap.class, "1")) {
          return;
       }
       boolean b = (p1 == null || p1 instanceof WritableNativeMap)? true: false;
       a.b(b, "Illegal type provided");
       this.putNativeMap(p0, p1);
       return;
    }
    public native final void putNativeArray(String p0,WritableNativeArray p1);
    public native final void putNativeMap(String p0,WritableNativeMap p1);
    public native void putNull(String p0);
    public native void putString(String p0,String p1);
}
