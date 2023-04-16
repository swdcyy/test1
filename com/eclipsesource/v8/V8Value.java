package com.eclipsesource.v8.V8Value;
import com.eclipsesource.v8.Releasable;
import java.lang.Object;
import com.eclipsesource.v8.V8;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.lang.Long;
import java.util.Map;

public abstract class V8Value implements Releasable	// class@000fec
{
    public long objectHandle;
    public boolean released;
    public V8 v8;

    public void V8Value(){
       super();
       this.released = true;
    }
    public void V8Value(V8 p0){
       super();
       this.released = true;
       this.v8 = (p0 == null)? this: p0;
       return;
    }
    public static String getStringRepresentaion(int p0){
       return V8Value.getStringRepresentation(p0);
    }
    public static String getStringRepresentation(int p0){
       if (p0 == 99) {
          return "Undefined";
       }
       switch (p0){
           case 0:
             return "Null";
           case 1:
             return "Integer";
           case 2:
             return "Double";
           case 3:
             return "Boolean";
           case 4:
             return "String";
           case 5:
             return "V8Array";
           case 6:
             return "V8Object";
           case 7:
             return "V8Function";
           case 8:
             return "V8TypedArray";
           case 9:
             return "Byte";
           case 10:
             return "V8ArrayBuffer";
           case 11:
             return "UInt8Array";
           case 12:
             return "UInt8ClampedArray";
           case 13:
             return "Int16Array";
           case 14:
             return "UInt16Array";
           case 15:
             return "UInt32Array";
           case 16:
             return "Float32Array";
           default:
             throw new IllegalArgumentException("Invalid V8 type: "+p0);
       }
    }
    public void addObjectReference(long p0){
       this.objectHandle = p0;
       try{
          this.v8.addObjRef(this);
          return;
       }catch(java.lang.Error e1){
          this.release();
          throw e1;
       }catch(java.lang.RuntimeException e1){
          this.release();
          throw e1;
       }
    }
    public void checkReleased(){
       if (this.released == null) {
          return;
       }
       throw new IllegalStateException("Object released");
    }
    public V8Value clearWeak(){
       this.v8.checkThread();
       this.v8.checkReleased();
       this.v8.v8WeakReferences.remove(Long.valueOf(this.getHandle()));
       V8Value tv8 = this.v8;
       tv8.clearWeak(tv8.getV8RuntimePtr(), this.getHandle());
       return this;
    }
    public void close(){
       this.v8.checkThread();
       if (this.released == null) {
          this.v8.releaseObjRef(this);
          this.released = true;
          V8Value tv8 = this.v8;
          tv8.release(tv8.getV8RuntimePtr(), this.objectHandle);
       }
       return;
    }
    public abstract V8Value createTwin();
    public boolean equals(Object p0){
       return this.strictEquals(p0);
    }
    public String getConstructorName(){
       this.v8.checkThread();
       this.v8.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.getConstructorName(tv8.getV8RuntimePtr(), this.objectHandle);
    }
    public long getHandle(){
       this.checkReleased();
       return this.objectHandle;
    }
    public V8 getRuntime(){
       return this.v8;
    }
    public int getV8Type(){
       if (this.isUndefined()) {
          return 99;
       }
       this.v8.checkThread();
       this.v8.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.getType(tv8.getV8RuntimePtr(), this.objectHandle);
    }
    public int hashCode(){
       this.v8.checkThread();
       this.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.identityHash(tv8.getV8RuntimePtr(), this.getHandle());
    }
    public void initialize(long p0,Object p1){
       this.released = false;
       this.addObjectReference(this.v8.initNewV8Object(p0));
    }
    public boolean isReleased(){
       return this.released;
    }
    public boolean isUndefined(){
       return false;
    }
    public boolean isWeak(){
       this.v8.checkThread();
       this.v8.checkReleased();
       V8Value tv8 = this.v8;
       return tv8.isWeak(tv8.getV8RuntimePtr(), this.getHandle());
    }
    public boolean jsEquals(Object p0){
       this.v8.checkThread();
       this.checkReleased();
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (!p0 instanceof V8Value) {
          return false;
       }
       if (this.isUndefined() && p0.isUndefined()) {
          return b;
       }
       if (p0.isUndefined()) {
          return false;
       }
       V8Value tv8 = this.v8;
       return tv8.equals(tv8.getV8RuntimePtr(), this.getHandle(), p0.getHandle());
    }
    public void release(){
       this.close();
    }
    public V8Value setWeak(){
       this.v8.checkThread();
       this.v8.checkReleased();
       this.v8.v8WeakReferences.put(Long.valueOf(this.getHandle()), this);
       V8Value tv8 = this.v8;
       tv8.setWeak(tv8.getV8RuntimePtr(), this.getHandle());
       return this;
    }
    public boolean strictEquals(Object p0){
       this.v8.checkThread();
       this.checkReleased();
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (!p0 instanceof V8Value) {
          return false;
       }
       if (this.isUndefined() && p0.isUndefined()) {
          return b;
       }
       if (p0.isUndefined()) {
          return false;
       }
       V8Value tv8 = this.v8;
       return tv8.strictEquals(tv8.getV8RuntimePtr(), this.getHandle(), p0.getHandle());
    }
    public V8Value twin(){
       if (this.isUndefined()) {
          return this;
       }
       this.v8.checkThread();
       this.v8.checkReleased();
       V8Value v8Value = this.createTwin();
       this.v8.createTwin(this, v8Value);
       return v8Value;
    }
}
