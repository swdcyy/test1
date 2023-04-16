package com.facebook.react.modules.storage.AsyncStorageModule$c;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import re.a;
import android.database.sqlite.SQLiteDatabase;
import re.b;
import java.lang.Math;
import com.facebook.react.modules.storage.a;
import java.lang.Exception;
import java.lang.Throwable;
import cb.a;

public class AsyncStorageModule$c extends GuardedAsyncTask	// class@0012e9
{
    public final Callback a;
    public final ReadableArray b;
    public final AsyncStorageModule c;

    public void AsyncStorageModule$c(AsyncStorageModule p0,ReactContext p1,Callback p2,ReadableArray p3){
       this.c = p0;
       this.a = p2;
       this.b = p3;
       super(p1);
    }
    public void doInBackgroundGuarded(Object[] p0){
       Object[] objArray;
       WritableMap writableMap1;
       String str = "ReactNative";
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStorageModule$c.class, "1")) {
       }else {
          int i = 1;
          if (!this.c.ensureDatabase()) {
             objArray = new Object[i];
             objArray[0] = a.a(null);
             this.a.invoke(objArray);
          }else {
             try{
                this.c.mReactDatabaseSupplier.g().beginTransaction();
                for (int i1 = 0; i1 < this.b.size(); i1 = i1 + 999) {
                   int i2 = this.b.size() - i1;
                   i2 = Math.min(i2, 999);
                   String str1 = a.a(i2);
                   this.c.mReactDatabaseSupplier.g().delete("catalystLocalStorage", str1, a.b(this.b, i1, i2));
                }
                SQLiteDatabase sQLiteDataba = this.c.mReactDatabaseSupplier.g();
                try{
                   sQLiteDataba.setTransactionSuccessful();
                   this.c.mReactDatabaseSupplier.g().endTransaction();
                }catch(java.lang.Exception e10){
                   a.y(str, e10.getMessage(), e10);
                   writableMap1 = a.b(null, e10.getMessage());
                }
             }catch(java.lang.Exception e10){
                a.y(str, e10.getMessage(), e10);
                WritableMap writableMap = a.b(null, e10.getMessage());
                try{
                   this.c.mReactDatabaseSupplier.g().endTransaction();
                }catch(java.lang.Exception e4){
                   a.y(str, e4.getMessage(), e4);
                   if (!writableMap) {
                      writableMap = a.b(null, e4.getMessage());
                   }
                }
                writableMap1 = writableMap;
             }
             if (writableMap1 != null) {
                objArray = new Object[i];
                objArray[0] = writableMap1;
                this.a.invoke(objArray);
             }else {
                objArray = new Object[0];
                this.a.invoke(objArray);
             }
          }
       }
       return;
    }
}
