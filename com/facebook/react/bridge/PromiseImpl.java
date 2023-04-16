package com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import com.facebook.react.bridge.WritableMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.ReadableMap;
import java.lang.StackTraceElement;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Boolean;

public class PromiseImpl implements Promise	// class@001216
{
    public Callback mReject;
    public Callback mResolve;

    public void PromiseImpl(Callback p0,Callback p1){
       super();
       this.mResolve = p0;
       this.mReject = p1;
    }
    public Callback getReject(){
       return this.mReject;
    }
    public Callback getResolve(){
       return this.mResolve;
    }
    public void reject(String p0){
       this.reject(null, p0, null, null);
    }
    public void reject(String p0,WritableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PromiseImpl.class, "8")) {
          return;
       }
       this.reject(p0, null, null, p1);
       return;
    }
    public void reject(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PromiseImpl.class, "3")) {
          return;
       }
       this.reject(p0, p1, null, null);
       return;
    }
    public void reject(String p0,String p1,WritableMap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PromiseImpl.class, "10")) {
          return;
       }
       this.reject(p0, p1, null, p2);
       return;
    }
    public void reject(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PromiseImpl.class, "5")) {
          return;
       }
       this.reject(p0, p1, p2, null);
       return;
    }
    public void reject(String p0,String p1,Throwable p2,WritableMap p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, PromiseImpl.class, "11")) {
          return;
       }
       if (this.mReject == null) {
          this.mResolve = null;
          return;
       }else {
          WritableNativeMap writableNati = new WritableNativeMap();
          String str = "code";
          if (p0 == null) {
             writableNati.putString(str, "EUNSPECIFIED");
          }else {
             writableNati.putString(str, p0);
          }
          p0 = "message";
          if (p1 != null) {
             writableNati.putString(p0, p1);
          }else if(p2 != null){
             writableNati.putString(p0, p2.getMessage());
          }else {
             writableNati.putString(p0, "Error not specified.");
          }
          p0 = "userInfo";
          if (p3 != null) {
             writableNati.putMap(p0, p3);
          }else {
             writableNati.putNull(p0);
          }
          p1 = "nativeStackAndroid";
          if (p2 != null) {
             StackTraceElement[] stackTrace = p2.getStackTrace();
             WritableNativeArray writableNati1 = new WritableNativeArray();
             for (int i = 0; i < stackTrace.length && i < 50; i = i + 1) {
                object oobject = stackTrace[i];
                super();
                this.putString("class", oobject.getClassName());
                this.putString("file", oobject.getFileName());
                this.putInt("lineNumber", oobject.getLineNumber());
                this.putString("methodName", oobject.getMethodName());
                writableNati1.pushMap(this);
             }
             writableNati.putArray(p1, writableNati1);
          }else {
             writableNati.putArray(p1, new WritableNativeArray());
          }
          Object[] objArray = new Object[]{writableNati};
          this.mReject.invoke(objArray);
          this.mResolve = null;
          this.mReject = null;
          return;
       }
    }
    public void reject(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PromiseImpl.class, "4")) {
          return;
       }
       this.reject(p0, null, p1, null);
       return;
    }
    public void reject(String p0,Throwable p1,WritableMap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PromiseImpl.class, "9")) {
          return;
       }
       this.reject(p0, null, p1, p2);
       return;
    }
    public void reject(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PromiseImpl.class, "6")) {
          return;
       }
       this.reject(null, null, p0, null);
       return;
    }
    public void reject(Throwable p0,WritableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PromiseImpl.class, "7")) {
          return;
       }
       this.reject(null, null, p0, p1);
       return;
    }
    public void resolve(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PromiseImpl.class, "1")) {
          return;
       }
       PromiseImpl tmResolve = this.mResolve;
       if (tmResolve != null) {
          Object[] objArray = new Object[]{p0};
          tmResolve.invoke(objArray);
          this.mResolve = null;
          this.mReject = null;
       }
       return;
    }
    public void resolveNew(String p0,Boolean p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PromiseImpl.class, "2")) {
          return;
       }
       PromiseImpl tmResolve = this.mResolve;
       if (tmResolve != null) {
          String[] stringArray = new String[]{p0};
          tmResolve.invokeNew(p1, stringArray);
          this.mResolve = null;
          this.mReject = null;
       }
       return;
    }
}
