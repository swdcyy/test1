package com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import com.tkruntime.v8.V8Array;
import com.tkruntime.v8.V8ResultUndefined;
import java.util.Map;
import java.lang.Number;

public class V8Object extends V8Value	// class@000fc1
{
    public Object mObj;

    public void V8Object(){
       super();
       this.mObj = null;
    }
    public void V8Object(V8 p0){
       super(p0, null);
    }
    public void V8Object(V8 p0,long p1){
       super(p0);
       this.mObj = null;
       if (p0 != null) {
          this.objectHandle = p1;
          this.released = false;
          this.v8.checkThread();
          this.addObjectReference(this.objectHandle);
       }
       return;
    }
    public void V8Object(V8 p0,Object p1){
       super(p0);
       this.mObj = null;
       if (p0 != null) {
          this.v8.checkThread();
          this.initialize(this.v8.getV8RuntimePtr(), p1);
       }
       return;
    }
    public V8Object add(String p0,double p1){
       if (PatchProxy.isSupport(V8Object.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, V8Object.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.add(tv8.getV8RuntimePtr(), this.objectHandle, p0, p1);
       return this;
    }
    public V8Object add(String p0,int p1){
       if (PatchProxy.isSupport(V8Object.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, V8Object.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.add(tv8.getV8RuntimePtr(), this.objectHandle, p0, p1);
       return this;
    }
    public V8Object add(String p0,V8Value p1){
       V8Value tv8;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8Object.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p1);
       if (p1 == null) {
          tv8 = this.v8;
          tv8.addNull(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       }else if(p1.equals(V8.getUndefined())){
          tv8 = this.v8;
          tv8.addUndefined(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       }else {
          tv8 = this.v8;
          tv8.addObject(tv8.getV8RuntimePtr(), this.objectHandle, p0, p1.getHandle());
       }
       return this;
    }
    public V8Object add(String p0,String p1){
       V8Value tv8;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8Object.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       if (p1 == null) {
          tv8 = this.v8;
          tv8.addNull(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       }else if(p1.equals(V8.getUndefined())){
          tv8 = this.v8;
          tv8.addUndefined(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       }else {
          V8Value tv81 = this.v8;
          tv81.add(tv81.getV8RuntimePtr(), this.objectHandle, p0, p1);
       }
       return this;
    }
    public V8Object add(String p0,boolean p1){
       if (PatchProxy.isSupport(V8Object.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, V8Object.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.add(tv8.getV8RuntimePtr(), this.objectHandle, p0, p1);
       return this;
    }
    public V8Object addNull(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addNull(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       return this;
    }
    public V8Object addUndefined(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addUndefined(tv8.getV8RuntimePtr(), this.objectHandle, p0);
       return this;
    }
    public final void checkKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8Object.class, "25")) {
          return;
       }
       if (p0 != null) {
          return;
       }
       throw new IllegalArgumentException("Key cannot be null");
    }
    public boolean contains(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.contains(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public V8Array executeArrayFunction(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8Object.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       p0 = tv8.executeFunction(tv8.getV8RuntimePtr(), 5, this.objectHandle, p0, p1);
       if (p0 instanceof V8Array) {
          return p0;
       }
       throw new V8ResultUndefined();
    }
    public Object executeFunction(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8Object.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.executeFunction(tv8.getV8RuntimePtr(), 0, this.objectHandle, p0, p1);
    }
    public Object executeJSFunction(String p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[0];
       return this.executeFunction(p0, obj);
    }
    public Object executeJSFunction(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8Object.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null) {
          return this.executeFunction(p0, p1);
       }
       p1 = new Object[0];
       return this.executeFunction(p0, p1);
    }
    public V8Object executeObjectFunction(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8Object.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       p0 = tv8.executeFunction(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0, p1);
       if (p0 instanceof V8Object) {
          return p0;
       }
       throw new V8ResultUndefined();
    }
    public void executeVoidFunction(String p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, V8Object.class, "16")) {
          return;
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.executeVoidFunction(tv8.getV8RuntimePtr(), this.objectHandle, p0, p1);
       return;
    }
    public Object get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.get(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0);
    }
    public Map getAll(){
       Object obj = PatchProxy.apply(null, this, V8Object.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.v8.getAll(this.objectHandle);
    }
    public V8Array getArray(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       p0 = tv8.get(tv8.getV8RuntimePtr(), 5, this.objectHandle, p0);
       if (p0 == null || p0 instanceof V8Array) {
          return p0;
       }
       throw new V8ResultUndefined();
    }
    public boolean getBoolean(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.getBoolean(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public double getDouble(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.getDouble(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public int getInteger(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.getInteger(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public Object getNativeObject(){
       return this.mObj;
    }
    public V8Object getObject(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       p0 = tv8.get(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0);
       if (p0 == null || p0 instanceof V8Object) {
          return p0;
       }
       throw new V8ResultUndefined();
    }
    public String getString(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Object.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.checkKey(p0);
       V8Value tv8 = this.v8;
       return tv8.getString(tv8.getV8RuntimePtr(), this.objectHandle, p0);
    }
    public Object onPropCall(boolean p0,String p1,Object p2){
       if (PatchProxy.isSupport(V8Object.class)) {
          Object obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, V8Object.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.v8.onPropCall(this, null, null, p0, p1, p2);
    }
    public String[] onPropEnumerator(){
       return null;
    }
    public void setNativeObject(Object p0){
       this.mObj = p0;
    }
    public String toString(){
       V8Value obj = PatchProxy.apply(null, this, V8Object.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isReleased() || this.v8.isReleased()) {
          return "[Object released]";
       }
       this.v8.checkThread();
       obj = this.v8;
       return obj.toString(obj.getV8RuntimePtr(), this.getHandle());
    }
}
