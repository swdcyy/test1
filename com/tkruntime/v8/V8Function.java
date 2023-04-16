package com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8;
import com.tkruntime.v8.JavaCallback;
import com.tkruntime.v8.V8Value;
import java.lang.Object;
import com.tkruntime.v8.JavaVoidCallback;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.BuildConfig;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8Trace;
import java.lang.Long;
import java.lang.CharSequence;
import android.text.TextUtils;

public class V8Function extends V8Object	// class@000fb5
{
    public Object mCallback;
    public String mFunctionName;
    public boolean mVoidFunction;

    public void V8Function(V8 p0){
       super(p0, null);
    }
    public void V8Function(V8 p0,long p1){
       super(p0, p1);
       this.mFunctionName = null;
       this.mVoidFunction = false;
       this.mCallback = null;
    }
    public void V8Function(V8 p0,JavaCallback p1){
       super();
       String str = null;
       this.mFunctionName = str;
       this.mVoidFunction = false;
       this.mCallback = str;
       this.v8 = p0;
       this.mVoidFunction = false;
       if (p0 != null) {
          p0.checkThread();
          this.initialize(p0.getV8RuntimePtr(), p1);
       }
       return;
    }
    public void V8Function(V8 p0,JavaVoidCallback p1){
       super();
       this.mFunctionName = null;
       this.mVoidFunction = false;
       this.mCallback = null;
       this.v8 = p0;
       this.mVoidFunction = true;
       if (p0 != null) {
          p0.checkThread();
          this.initialize(p0.getV8RuntimePtr(), p1);
       }
       return;
    }
    public void V8Function(V8 p0,String p1,JavaCallback p2){
       super();
       this.mFunctionName = null;
       this.mVoidFunction = false;
       this.mCallback = null;
       this.v8 = p0;
       this.mFunctionName = p1;
       if (p0 != null) {
          p0.checkThread();
          this.initialize(p0.getV8RuntimePtr(), p2);
       }
       return;
    }
    public Object call(V8Object p0,Object[] p1){
       V8Value tv81;
       V8Value tv82;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, V8Function.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = 0;
       Boolean eNABLE_ANALY = BuildConfig.ENABLE_ANALYZE_PERFORMANCE;
       if (eNABLE_ANALY.booleanValue()) {
          V8Value tv8 = this.v8;
          if (!(tv8.currentState % 2)) {
             obj = 1;
             tv8.currentState = 9;
             tv81 = this.v8;
             V8 jsCallbackIn = tv81.jsCallbackIndex;
             tv81.jsCallbackIndex = 1 + jsCallbackIn;
             V8Trace.beginSection(tv8, "", "jsCallback_"+this.mFunctionName+"_"+jsCallbackIn);
          }
       }
       this.v8.checkThread();
       this.checkReleased();
       this.v8.checkRuntime(p0);
       if (p0 == null) {
          tv82 = this.v8;
       }
       if (p0.isUndefined()) {
          tv82 = this.v8;
       }
       tv81 = this.v8;
       tv82 = tv81.executeFunction(tv81.getV8RuntimePtr(), tv82.getHandle(), this.objectHandle, p1);
       if (eNABLE_ANALY.booleanValue() && obj) {
          V8Trace.endSection(this.v8);
          p1.currentState = 10;
       }
       return tv82;
    }
    public void initialize(long p0,Object p1){
       if (PatchProxy.isSupport(V8Function.class) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, V8Function.class, "3")) {
          return;
       }
       this.releaseCheck = false;
       if (p1 == null) {
          super.initialize(p0, null);
          return;
       }else {
          long[] olongArray = this.v8.initNewV8Function(p0, this.mFunctionName, (this.mVoidFunction ^ 1));
          if (this.mVoidFunction != null) {
             this.mCallback = p1;
             this.v8.createAndRegisterVoidMethodDescriptor(p1, olongArray[1], this.mFunctionName);
          }else {
             this.mCallback = p1;
             this.v8.createAndRegisterMethodDescriptor(p1, olongArray[1], this.mFunctionName);
          }
          this.released = false;
          this.objectHandle = olongArray[0];
          this.addObjectReference(olongArray[0]);
          return;
       }
    }
    public void setFunctionName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, V8Function.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          this.mFunctionName = p0;
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, V8Function.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.released != null || this.v8.isReleased()) {
          return "[Function released]";
       }
       return super.toString()+",callback = "+this.mCallback;
    }
}
