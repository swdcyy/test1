package com.facebook.react.modules.storage.AsyncStorageModule;
import ie.a;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import android.os.AsyncTask;
import java.util.concurrent.Executor;
import com.facebook.react.modules.storage.AsyncStorageModule$g;
import re.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.storage.AsyncStorageModule$e;
import com.facebook.react.bridge.ReactContext;
import java.lang.Void;
import cb.a;
import java.lang.RuntimeException;
import java.lang.Boolean;
import com.facebook.react.modules.storage.AsyncStorageModule$f;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import re.a;
import com.facebook.react.modules.storage.AsyncStorageModule$a;
import com.facebook.react.modules.storage.AsyncStorageModule$d;
import com.facebook.react.modules.storage.AsyncStorageModule$c;
import com.facebook.react.modules.storage.AsyncStorageModule$b;

public final class AsyncStorageModule extends ReactContextBaseJavaModule implements a	// class@0012ef
{
    public final AsyncStorageModule$g executor;
    public b mReactDatabaseSupplier;
    public boolean mShuttingDown;

    public void AsyncStorageModule(ReactApplicationContext p0){
       super(p0, AsyncTask.THREAD_POOL_EXECUTOR);
    }
    public void AsyncStorageModule(ReactApplicationContext p0,Executor p1){
       super(p0);
       this.mShuttingDown = false;
       this.executor = new AsyncStorageModule$g(this, p1);
       b uob = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else if(b.e == null){
          b.e = new b(p0.getApplicationContext());
       }
       uob = b.e;
       this.mReactDatabaseSupplier = uob;
       return;
    }
    public void clear(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStorageModule.class, "7")) {
          return;
       }
       Void[] voidArray = new Void[0];
       new AsyncStorageModule$e(this, this.getReactApplicationContext(), p0).executeOnExecutor(this.executor, voidArray);
       return;
    }
    public void clearSensitiveData(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AsyncStorageModule.class, "2")) {
          return;
       }
       AsyncStorageModule tmReactDatab = this.mReactDatabaseSupplier;
       _monitor_enter(tmReactDatab);
       if (PatchProxy.applyVoid(objArray, tmReactDatab, b.class, "6")) {
          _monitor_exit(tmReactDatab);
       }else {
          try{
             tmReactDatab.a();
             tmReactDatab.c();
             a.a("ReactNative", "Cleaned RKStorage");
             _monitor_exit(tmReactDatab);
          }catch(java.lang.Exception e0){
             if (e0.e()) {
                a.a("ReactNative", "Deleted Local Database RKStorage");
                _monitor_exit(e0);
             }else {
                throw new RuntimeException("Clearing and deleting database RKStorage failed");
             }
          }
       }
    }
    public boolean ensureDatabase(){
       Object obj = PatchProxy.apply(null, this, AsyncStorageModule.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.mShuttingDown == null && this.mReactDatabaseSupplier.f())? true: false;
       return b;
    }
    public void getAllKeys(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStorageModule.class, "8")) {
          return;
       }
       Void[] voidArray = new Void[0];
       new AsyncStorageModule$f(this, this.getReactApplicationContext(), p0).executeOnExecutor(this.executor, voidArray);
       return;
    }
    public String getName(){
       return "AsyncSQLiteDBStorage";
    }
    public void initialize(){
       if (PatchProxy.applyVoid(null, this, AsyncStorageModule.class, "1")) {
          return;
       }
       super.initialize();
       this.mShuttingDown = false;
       return;
    }
    public void multiGet(ReadableArray p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AsyncStorageModule.class, "3")) {
          return;
       }
       int i = 0;
       if (p0 == null) {
          Object[] objArray = new Object[]{a.c(null),null};
          p1.invoke(objArray);
          return;
       }else {
          Void[] voidArray = new Void[i];
          new AsyncStorageModule$a(this, this.getReactApplicationContext(), p1, p0).executeOnExecutor(this.executor, voidArray);
          return;
       }
    }
    public void multiMerge(ReadableArray p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AsyncStorageModule.class, "6")) {
          return;
       }
       Void[] voidArray = new Void[0];
       new AsyncStorageModule$d(this, this.getReactApplicationContext(), p1, p0).executeOnExecutor(this.executor, voidArray);
       return;
    }
    public void multiRemove(ReadableArray p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AsyncStorageModule.class, "5")) {
          return;
       }
       if (!p0.size()) {
          Object[] objArray = new Object[]{a.c(null)};
          p1.invoke(objArray);
          return;
       }else {
          Void[] voidArray = new Void[0];
          new AsyncStorageModule$c(this, this.getReactApplicationContext(), p1, p0).executeOnExecutor(this.executor, voidArray);
          return;
       }
    }
    public void multiSet(ReadableArray p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AsyncStorageModule.class, "4")) {
          return;
       }
       if (!p0.size()) {
          Object[] objArray = new Object[]{a.c(null)};
          p1.invoke(objArray);
          return;
       }else {
          Void[] voidArray = new Void[0];
          new AsyncStorageModule$b(this, this.getReactApplicationContext(), p1, p0).executeOnExecutor(this.executor, voidArray);
          return;
       }
    }
    public void onCatalystInstanceDestroy(){
       this.mShuttingDown = true;
    }
}
