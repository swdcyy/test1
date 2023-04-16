package com.facebook.react.modules.storage.AsyncStorageModule$a;
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
import java.util.HashSet;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import java.lang.Math;
import android.database.sqlite.SQLiteDatabase;
import re.b;
import com.facebook.react.modules.storage.a;
import android.database.Cursor;
import java.util.Iterator;
import java.lang.Exception;
import java.lang.Throwable;
import cb.a;

public class AsyncStorageModule$a extends GuardedAsyncTask	// class@0012e7
{
    public final Callback a;
    public final ReadableArray b;
    public final AsyncStorageModule c;

    public void AsyncStorageModule$a(AsyncStorageModule p0,ReactContext p1,Callback p2,ReadableArray p3){
       this.c = p0;
       this.a = p2;
       this.b = p3;
       super(p1);
    }
    public void doInBackgroundGuarded(Object[] p0){
       int i;
       Object[] objArray;
       Cursor uCursor;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, AsyncStorageModule$a.class, "1")) {
       }else {
          try{
             i = 2;
             String str = null;
             if (!obj.c.ensureDatabase()) {
                objArray = new Object[i];
                objArray[0] = a.a(str);
                objArray[1] = str;
                obj.a.invoke(objArray);
             }else {
                String[] stringArray = new String[]{"key","value"};
                HashSet hashSet = new HashSet();
                WritableArray writableArra = Arguments.createArray();
                int i1 = 0;
                while (i1 < obj.b.size()) {
                   int i2 = obj.b.size() - i1;
                   int i3 = Math.min(i2, 999);
                   String str1 = a.a(i3);
                   String[] stringArray1 = a.b(obj.b, i1, i3);
                   int i4 = i3;
                   int i5 = i1;
                   uCursor = obj.c.mReactDatabaseSupplier.g().query("catalystLocalStorage", stringArray, str1, stringArray1, null, 0, 0);
                   hashSet.clear();
                   if (uCursor.getCount() != obj.b.size()) {
                      i1 = i5;
                      int i6 = i5 + i4;
                      while (i1 < i6) {
                         hashSet.add(obj.b.getString(i1));
                         i1 = i1 + 1;
                      }
                   }
                   if (uCursor.moveToFirst()) {
                      do {
                         WritableArray writableArra1 = Arguments.createArray();
                         writableArra1.pushString(uCursor.getString(0));
                         writableArra1.pushString(uCursor.getString(1));
                         writableArra.pushArray(writableArra1);
                         hashSet.remove(uCursor.getString(0));
                      } while (!uCursor.moveToNext());
                   }
                   uCursor.close();
                   Iterator iterator = hashSet.iterator();
                   while (iterator.hasNext()) {
                      WritableArray writableArra2 = Arguments.createArray();
                      writableArra2.pushString(iterator.next());
                      writableArra2.pushNull();
                      writableArra.pushArray(writableArra2);
                   }
                   hashSet.clear();
                   i1 = i5 + 999;
                   i5 = 0;
                }
                objArray = new Object[i];
                objArray[0] = null;
                objArray[1] = writableArra;
                obj.a.invoke(objArray);
             }
          }catch(java.lang.Exception e0){
             a.y("ReactNative", e0.getMessage(), e0);
             objArray = new Object[i];
             objArray[0] = a.b(null, e0.getMessage());
             objArray[1] = null;
             obj.a.invoke(objArray);
             uCursor.close();
          }
       }
    }
}
