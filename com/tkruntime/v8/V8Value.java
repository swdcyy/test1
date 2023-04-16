package com.tkruntime.v8.V8Value;
import com.tkruntime.v8.Releasable;
import java.lang.Object;
import com.tkruntime.v8.V8;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.IllegalStateException;
import com.tkruntime.v8.JsValueRef;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public abstract class V8Value implements Releasable	// class@000fd1
{
    public int mRefCnt;
    public long objectHandle;
    public boolean releaseCheck;
    public boolean released;
    public V8 v8;

    public void V8Value(){
       super();
       this.released = true;
       this.mRefCnt = 0;
       this.releaseCheck = false;
    }
    public void V8Value(V8 p0){
       super();
       this.released = true;
       this.mRefCnt = 0;
       this.releaseCheck = false;
       this.v8 = (p0 == null)? this: p0;
       return;
    }
    public void addObjectReference(long p0){
       if (PatchProxy.isSupport(V8Value.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, V8Value.class, "2")) {
          return;
       }
       this.objectHandle = p0;
       this.v8.addTrackedObj(p0, this);
       return;
    }
    public void addObjectReferenceAndTrackedObj(long p0){
       if (PatchProxy.isSupport(V8Value.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, V8Value.class, "3")) {
          return;
       }
       this.addObjectReference(p0);
       return;
    }
    public void addRef(){
       this.mRefCnt = this.mRefCnt + 1;
    }
    public void checkReleased(){
       if (PatchProxy.applyVoid(null, this, V8Value.class, "13")) {
          return;
       }
       if (this.released == null) {
          return;
       }
       throw new IllegalStateException("Object released");
    }
    public JsValueRef clearWeak(Object p0){
       V8Value obj = PatchProxy.applyOneRefs(p0, this, V8Value.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkThread();
       this.v8.checkReleased();
       obj = this.v8;
       obj.clearWeak(obj.getV8RuntimePtr(), this.getHandle());
       return new JsValueRef(this, p0);
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, V8Value.class, "7")) {
          return;
       }
       V8Value tv8 = this.v8;
       if (tv8.isPendingReleased != null) {
          return;
       }
       tv8.checkThread();
       tv8 = this.objectHandle;
       if (this.released == null) {
          this.released = true;
          if (this.v8.removeTrackedObj(tv8)) {
             V8Value tv81 = this.v8;
             tv81.release(tv81.getV8RuntimePtr(), tv8);
          }
          this.objectHandle = 0;
       }
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Value.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.strictEquals(p0);
    }
    public long getHandle(){
       Object obj = PatchProxy.apply(null, this, V8Value.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       this.checkReleased();
       return this.objectHandle;
    }
    public V8 getRuntime(){
       return this.v8;
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, V8Value.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.hashCode();
    }
    public void initialize(long p0,Object p1){
       if (PatchProxy.isSupport(V8Value.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, V8Value.class, "1")) {
          return;
       }
       this.released = false;
       this.addObjectReferenceAndTrackedObj(this.v8.initNewV8Object(p0, this));
       return;
    }
    public boolean isReleased(){
       return this.released;
    }
    public boolean isUndefined(){
       return false;
    }
    public boolean isWeak(){
       V8Value obj = PatchProxy.apply(null, this, V8Value.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.v8.checkThread();
       this.v8.checkReleased();
       obj = this.v8;
       return obj.isWeak(obj.getV8RuntimePtr(), this.getHandle());
    }
    public boolean jsEquals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Value.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
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
    public void onJsRefDestroy(){
    }
    public void release(){
       this.close();
    }
    public void releaseRef(){
       this.mRefCnt = this.mRefCnt - 1;
    }
    public V8Value setWeak(){
       V8Value obj = PatchProxy.apply(null, this, V8Value.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v8.checkReleased();
       if (this.mRefCnt <= null) {
          obj = this.v8;
          obj.setWeak(obj.getV8RuntimePtr(), this.getHandle());
       }
       return this;
    }
    public boolean strictEquals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, V8Value.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
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
}
