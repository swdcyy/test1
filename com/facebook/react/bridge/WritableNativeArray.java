package com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import od.a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;

public class WritableNativeArray extends ReadableNativeArray implements WritableArray	// class@001242
{

    static {
       ReactBridge.staticInit();
    }
    public void WritableNativeArray(){
       super(WritableNativeArray.initHybrid());
    }
    public static native HybridData initHybrid();
    public void pushArray(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WritableNativeArray.class, "1")) {
          return;
       }
       boolean b = (p0 == null || p0 instanceof WritableNativeArray)? true: false;
       a.b(b, "Illegal type provided");
       this.pushNativeArray(p0);
       return;
    }
    public native void pushBoolean(boolean p0);
    public native void pushDouble(double p0);
    public native void pushInt(int p0);
    public void pushMap(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WritableNativeArray.class, "2")) {
          return;
       }
       boolean b = (p0 == null || p0 instanceof WritableNativeMap)? true: false;
       a.b(b, "Illegal type provided");
       this.pushNativeMap(p0);
       return;
    }
    public native final void pushNativeArray(WritableNativeArray p0);
    public native final void pushNativeMap(WritableNativeMap p0);
    public native void pushNull();
    public native void pushString(String p0);
}
