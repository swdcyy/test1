package com.facebook.react.modules.storage.AsyncStorageModule$f;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.modules.storage.AsyncStorageModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableMap;
import re.a;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import android.database.sqlite.SQLiteDatabase;
import re.b;
import android.database.Cursor;
import java.lang.Exception;
import java.lang.Throwable;
import cb.a;

public class AsyncStorageModule$f extends GuardedAsyncTask	// class@0012ec
{
    public final Callback a;
    public final AsyncStorageModule b;

    public void AsyncStorageModule$f(AsyncStorageModule p0,ReactContext p1,Callback p2){
       this.b = p0;
       this.a = p2;
       super(p1);
    }
    public void doInBackgroundGuarded(Object[] p0){
       int i;
       Object[] objArray;
       Cursor uCursor;
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStorageModule$f.class, "1")) {
       }else {
          try{
             i = 2;
             if (!this.b.ensureDatabase()) {
                objArray = new Object[i];
                objArray[0] = a.a(null);
                objArray[1] = null;
                this.a.invoke(objArray);
             }else {
                WritableArray writableArra = Arguments.createArray();
                String[] stringArray = new String[]{"key"};
                uCursor = this.b.mReactDatabaseSupplier.g().query("catalystLocalStorage", stringArray, null, null, null, null, null);
                if (uCursor.moveToFirst()) {
                   do {
                      writableArra.pushString(uCursor.getString(0));
                   } while (!uCursor.moveToNext());
                }
                uCursor.close();
                objArray = new Object[i];
                objArray[0] = null;
                objArray[1] = writableArra;
                this.a.invoke(objArray);
             }
          }catch(java.lang.Exception e14){
             a.y("ReactNative", e14.getMessage(), e14);
             objArray = new Object[i];
             objArray[0] = a.b(null, e14.getMessage());
             objArray[1] = null;
             this.a.invoke(objArray);
             uCursor.close();
          }
       }
    }
}
