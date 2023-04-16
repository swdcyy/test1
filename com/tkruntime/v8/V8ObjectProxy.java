package com.tkruntime.v8.V8ObjectProxy;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8;
import java.nio.ByteBuffer;
import com.tkruntime.v8.V8MemBufferFromJS;
import com.tkruntime.v8.V8Value;
import java.lang.Object;
import java.lang.String;
import java.lang.Long;
import java.util.Map;
import java.lang.Integer;
import com.tkruntime.v8.V8Array;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;

public class V8ObjectProxy extends V8Object	// class@000fc3
{
    public int mCliValue;
    public Object[] mConstructArgs;
    public Object mNativeObject;
    public String mOriginClzzName;
    public static Object PROP_SET_HANDLED;
    public static Object PROP_SET_IGNORE;
    public static V8ObjectProxy$BindingObjectCreator sCreator;

    static {
       V8ObjectProxy.PROP_SET_IGNORE = V8.sPropUnSupported;
    }
    public void V8ObjectProxy(V8 p0,long p1,long p2,int p3,ByteBuffer p4){
       super();
       this.mConstructArgs = null;
       this.mOriginClzzName = null;
       this.mNativeObject = null;
       this.mCliValue = 0;
       this.mCliValue = 0;
       V8MemBufferFromJS v8MemBufferF = V8MemBufferFromJS.obtain(p4, p0);
       this.objectHandle = p1;
       this.v8 = p0;
       this.released = false;
       this.mOriginClzzName = p0.v8ExportDescriptorIndex[(int)p2];
       this.mConstructArgs = v8MemBufferF.getAllObjects();
       v8MemBufferF.recycle();
       this.addObjectReferenceAndTrackedObj(this.objectHandle);
       this.mNativeObject = this.v8.constructRealObject(this, this.mOriginClzzName, this.mConstructArgs);
    }
    public void V8ObjectProxy(V8 p0,long p1,long p2,Object[] p3){
       super();
       this.mConstructArgs = null;
       this.mOriginClzzName = null;
       this.mNativeObject = null;
       this.mCliValue = 0;
       this.objectHandle = p1;
       this.v8 = p0;
       this.mConstructArgs = p3;
       this.released = false;
       this.mOriginClzzName = p0.v8ExportDescriptorIndex[(int)p2];
       this.addObjectReferenceAndTrackedObj(p1);
       this.mNativeObject = this.v8.constructRealObject(this, this.mOriginClzzName, this.mConstructArgs);
    }
    public void V8ObjectProxy(V8 p0,String p1){
       super(p0, p1, false);
    }
    public void V8ObjectProxy(V8 p0,String p1,boolean p2){
       super();
       this.mConstructArgs = null;
       this.mOriginClzzName = null;
       this.mNativeObject = null;
       this.mCliValue = 0;
       this.v8 = p0;
       this.mOriginClzzName = p1;
       Long longx = Long.valueOf(0);
       Integer integer = p0.sV8ExportDescriptor.get(p1);
       if (integer != null) {
          longx = Long.valueOf(p0.v8ExportDescriptor[integer.intValue()]);
       }
       this.released = false;
       this.addObjectReferenceAndTrackedObj(p0.initNewV8ObjectProxy(p0.getV8RuntimePtr(), this, longx.longValue(), p2));
       return;
    }
    public static String flatString(V8Array p0){
       Object obj = null;
       StringBuilder obj1 = PatchProxy.applyOneRefs(p0, obj, V8ObjectProxy.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = "";
       for (int i = 0; i < p0.length(); i = i + 1) {
          obj1 = obj1+i+" = "+p0.get(i)+" , ";
       }
       return obj1;
    }
    public static String flatString(Object[] p0){
       Object obj = null;
       StringBuilder obj1 = PatchProxy.applyOneRefs(p0, obj, V8ObjectProxy.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = "";
       for (int i = 0; i < p0.length; i = i + 1) {
          obj1 = obj1+i+" = "+p0[i]+" , ";
       }
       return obj1;
    }
    public static void newInstance(V8 p0,long p1,long p2,int p3,ByteBuffer p4){
       Object[] objArray2;
       int i = 0;
       Object obj = null;
       if (PatchProxy.isSupport(V8ObjectProxy.class)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Long.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, obj, V8ObjectProxy.class, "1")) {
             return;
          }
       }
       V8MemBufferFromJS v8MemBufferF = V8MemBufferFromJS.obtain(p4, p0);
       if (p3 > 0) {
          Object[] objArray1 = new Object[p3];
          for (; i < p3; i = i + 1) {
             objArray1[i] = v8MemBufferF.readObject();
          }
          objArray2 = objArray1;
       }else {
          objArray2 = obj;
       }
       V8ObjectProxy v8ObjectProx = new V8ObjectProxy(p0, p1, p2, objArray2);
       while (v8MemBufferF.hasRemaining()) {
          v8ObjectProx = new V8ObjectProxy(p0, v8MemBufferF.readObject().longValue(), v8MemBufferF.readObject().longValue(), V8MemBufferFromJS.EMPTY_OBJECT_ARRAY);
       }
       v8MemBufferF.recycle();
       return;
    }
    public int getCliValue(){
       return this.mCliValue;
    }
    public Object getNativeObject(){
       return this.mNativeObject;
    }
    public String getOriginClzzName(){
       return this.mOriginClzzName;
    }
    public void onJsRefDestroy(){
       if (PatchProxy.applyVoid(null, this, V8ObjectProxy.class, "7")) {
          return;
       }
       super.onJsRefDestroy();
       V8Value tv8 = this.v8;
       if (tv8 != null) {
          tv8.onJsRefDestroy(this.mNativeObject);
       }
       return;
    }
    public Object onPropCall(boolean p0,String p1,Object p2){
       if (PatchProxy.isSupport(V8ObjectProxy.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, V8ObjectProxy.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       V8Value tv8 = this.v8;
       if (tv8 == null) {
          return null;
       }else {
          return tv8.onPropCall(this, this.mNativeObject, this.mOriginClzzName, p0, p1, p2);
       }
    }
    public String[] onPropEnumerator(){
       V8Value obj = PatchProxy.apply(null, this, V8ObjectProxy.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v8;
       if (obj == null) {
          return null;
       }
       return obj.onPropEnumerator(this);
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, V8ObjectProxy.class, "6")) {
          return;
       }
       super.release();
       return;
    }
    public void setNativeObject(Object p0){
       this.mNativeObject = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, V8ObjectProxy.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.toString();
    }
}
