package com.facebook.react.modules.storage.AsyncStorageModule$e;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import re.b;
import com.facebook.react.bridge.WritableMap;
import re.a;
import java.lang.Exception;
import java.lang.Throwable;
import cb.a;

public class AsyncStorageModule$e extends GuardedAsyncTask	// class@0012eb
{
    public final Callback a;
    public final AsyncStorageModule b;

    public void AsyncStorageModule$e(AsyncStorageModule p0,ReactContext p1,Callback p2){
       this.b = p0;
       this.a = p2;
       super(p1);
    }
    public void doInBackgroundGuarded(Object[] p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStorageModule$e.class, "1")) {
       }else {
          String str = null;
          int i = 1;
          if (!this.b.mReactDatabaseSupplier.f()) {
             objArray = new Object[i];
             objArray[0] = a.a(str);
             this.a.invoke(objArray);
          }else {
             try{
                this.b.mReactDatabaseSupplier.a();
                Object[] objArray1 = new Object[0];
                this.a.invoke(objArray1);
             }catch(java.lang.Exception e6){
                a.y("ReactNative", e6.getMessage(), e6);
                objArray = new Object[i];
                objArray[0] = a.b(str, e6.getMessage());
                this.a.invoke(objArray);
             }
          }
       }
    }
}
