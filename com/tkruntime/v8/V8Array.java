package com.tkruntime.v8.V8Array;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8ResultUndefined;
import java.lang.Boolean;
import java.lang.Number;
import java.util.List;
import java.lang.Long;
import java.lang.Double;
import java.lang.Float;
import java.lang.IllegalArgumentException;

public class V8Array extends V8Object	// class@000fb2
{

    public void V8Array(){
       super();
    }
    public void V8Array(V8 p0){
       super(p0);
       p0.checkThread();
    }
    public void V8Array(V8 p0,long p1){
       super(p0, p1);
    }
    public void V8Array(V8 p0,Object p1){
       super(p0, p1);
    }
    public Object get(int p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGet(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0);
    }
    public V8Array getArray(int p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       Object obj1 = tv8.arrayGet(tv8.getV8RuntimePtr(), 5, this.objectHandle, p0);
       if (obj1 == null || obj1 instanceof V8Array) {
          return obj1;
       }else {
          throw new V8ResultUndefined();
       }
    }
    public boolean getBoolean(int p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetBoolean(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public byte getByte(int p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.byteValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetByte(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public double getDouble(int p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetDouble(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public int getInteger(int p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetInteger(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public List getList(){
       Object obj = PatchProxy.apply(null, this, V8Array.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       return this.v8.getList(this.getHandle());
    }
    public V8Object getObject(int p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       Object obj1 = tv8.arrayGet(tv8.getV8RuntimePtr(), 6, this.objectHandle, p0);
       if (obj1 == null || obj1 instanceof V8Object) {
          return obj1;
       }else {
          throw new V8ResultUndefined();
       }
    }
    public String getString(int p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.arrayGetString(tv8.getV8RuntimePtr(), this.getHandle(), p0);
    }
    public int getType(){
       V8Value obj = PatchProxy.apply(null, this, V8Array.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       obj = this.v8;
       return obj.getArrayType(obj.getV8RuntimePtr(), this.getHandle());
    }
    public void initialize(long p0,Object p1){
       if (PatchProxy.isSupport(V8Array.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, V8Array.class, "2")) {
          return;
       }
       this.releaseCheck = false;
       this.released = false;
       this.addObjectReference(this.v8.initNewV8Array(p0));
       return;
    }
    public int length(){
       V8Value obj = PatchProxy.apply(null, this, V8Array.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       this.v8.checkThread();
       this.checkReleased();
       obj = this.v8;
       return obj.arrayGetSize(obj.getV8RuntimePtr(), this.getHandle());
    }
    public V8Array push(double p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, V8Array.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addArrayDoubleItem(tv8.getV8RuntimePtr(), this.getHandle(), p0);
       return this;
    }
    public V8Array push(int p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, V8Array.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addArrayIntItem(tv8.getV8RuntimePtr(), this.getHandle(), p0);
       return this;
    }
    public V8Array push(V8Value p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Array.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p0);
       if (p0 == null) {
          p0 = this.v8;
          p0.addArrayNullItem(p0.getV8RuntimePtr(), this.getHandle());
       }else if(p0.equals(V8.getUndefined())){
          p0 = this.v8;
          p0.addArrayUndefinedItem(p0.getV8RuntimePtr(), this.getHandle());
       }else {
          V8Value tv8 = this.v8;
          tv8.addArrayObjectItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.getHandle());
       }
       return this;
    }
    public V8Array push(Object p0){
       V8Value tv8;
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Array.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       if (p0 instanceof V8Value) {
          this.v8.checkRuntime(p0);
       }
       if (p0 == null) {
          p0 = this.v8;
          p0.addArrayNullItem(p0.getV8RuntimePtr(), this.getHandle());
       }else if(p0.equals(V8.getUndefined())){
          p0 = this.v8;
          p0.addArrayUndefinedItem(p0.getV8RuntimePtr(), this.getHandle());
       }else if(p0 instanceof Double){
          tv8 = this.v8;
          tv8.addArrayDoubleItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.doubleValue());
       }else if(p0 instanceof Integer){
          tv8 = this.v8;
          tv8.addArrayIntItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.intValue());
       }else if(p0 instanceof Float){
          tv8 = this.v8;
          tv8.addArrayDoubleItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.doubleValue());
       }else if(p0 instanceof Number){
          tv8 = this.v8;
          tv8.addArrayDoubleItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.doubleValue());
       }else if(p0 instanceof Boolean){
          tv8 = this.v8;
          tv8.addArrayBooleanItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.booleanValue());
       }else if(p0 instanceof String){
          tv8 = this.v8;
          tv8.addArrayStringItem(tv8.getV8RuntimePtr(), this.getHandle(), p0);
       }else if(p0 instanceof V8Value){
          tv8 = this.v8;
          tv8.addArrayObjectItem(tv8.getV8RuntimePtr(), this.getHandle(), p0.getHandle());
       }else {
          throw new IllegalArgumentException();
       }
       return this;
    }
    public V8Array push(String p0){
       V8Value tv8;
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Array.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       if (p0 == null) {
          tv8 = this.v8;
          tv8.addArrayNullItem(tv8.getV8RuntimePtr(), this.getHandle());
       }else if(p0.equals(V8.getUndefined())){
          tv8 = this.v8;
          tv8.addArrayUndefinedItem(tv8.getV8RuntimePtr(), this.getHandle());
       }else {
          V8Value tv81 = this.v8;
          tv81.addArrayStringItem(tv81.getV8RuntimePtr(), this.getHandle(), p0);
       }
       return this;
    }
    public V8Array push(boolean p0){
       if (PatchProxy.isSupport(V8Array.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, V8Array.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       tv8.addArrayBooleanItem(tv8.getV8RuntimePtr(), this.getHandle(), p0);
       return this;
    }
    public V8Array pushNull(){
       V8Value obj = PatchProxy.apply(null, this, V8Array.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       obj = this.v8;
       obj.addArrayNullItem(obj.getV8RuntimePtr(), this.getHandle());
       return this;
    }
    public V8Array pushUndefined(){
       V8Value obj = PatchProxy.apply(null, this, V8Array.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.checkReleased();
       obj = this.v8;
       obj.addArrayUndefinedItem(obj.getV8RuntimePtr(), this.getHandle());
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, V8Array.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.released != null || this.v8.isReleased()) {
          return "[Array released]";
       }
       return super.toString();
    }
}
