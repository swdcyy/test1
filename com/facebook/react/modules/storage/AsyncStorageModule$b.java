package com.facebook.react.modules.storage.AsyncStorageModule$b;
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
import android.database.sqlite.SQLiteStatement;
import java.lang.Exception;
import java.lang.Throwable;
import cb.a;

public class AsyncStorageModule$b extends GuardedAsyncTask	// class@0012e8
{
    public final Callback a;
    public final ReadableArray b;
    public final AsyncStorageModule c;

    public void AsyncStorageModule$b(AsyncStorageModule p0,ReactContext p1,Callback p2,ReadableArray p3){
       this.c = p0;
       this.a = p2;
       this.b = p3;
       super(p1);
    }
    public void doInBackgroundGuarded(Object[] p0){
       Object[] objArray;
       String str = "ReactNative";
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStorageModule$b.class, "1")) {
       }else {
          String str1 = null;
          int i = 1;
          if (!this.c.ensureDatabase()) {
             objArray = new Object[i];
             objArray[0] = a.a(str1);
             this.a.invoke(objArray);
          }else {
             SQLiteStatement sQLiteStatem = this.c.mReactDatabaseSupplier.g().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES \(?, ?\);");
             try{
                this.c.mReactDatabaseSupplier.g().beginTransaction();
                int i1 = 0;
                try{
                   while (true) {
                      if (i1 < this.b.size()) {
                         try{
                            if (this.b.getArray(i1).size() != 2) {
                               a.d(str1);
                               try{
                                  this.c.mReactDatabaseSupplier.g().endTransaction();
                                  break ;
                               }catch(java.lang.Exception e2){
                                  a.y(str, e2.getMessage(), e2);
                                  if (sQLiteStatem) {
                                     break ;
                                  }
                               }
                            }else if(this.b.getArray(i1).getString(0) == null){
                               a.c(str1);
                               this.c.mReactDatabaseSupplier.g().endTransaction();
                               break ;
                            }else if(this.b.getArray(i1).getString(i) == null){
                               a.d(str1);
                               try{
                                  this.c.mReactDatabaseSupplier.g().endTransaction();
                                  break ;
                               }catch(java.lang.Exception e2){
                                  a.y(str, e2.getMessage(), e2);
                                  if (sQLiteStatem) {
                                     break ;
                                  }
                               }
                            }else {
                               sQLiteStatem.clearBindings();
                               sQLiteStatem.bindString(i, this.b.getArray(i1).getString(0));
                               sQLiteStatem.bindString(2, this.b.getArray(i1).getString(i));
                               sQLiteStatem.execute();
                               i1 = i1 + 1;
                            }
                         }catch(java.lang.Exception e2){
                            a.y(str, e2.getMessage(), e2);
                            if (sQLiteStatem) {
                            }
                         }
                         a.b(str1, e2.getMessage());
                      }else {
                         SQLiteDatabase sQLiteDataba = this.c.mReactDatabaseSupplier.g();
                         sQLiteDataba.setTransactionSuccessful();
                         this.c.mReactDatabaseSupplier.g().endTransaction();
                      }
                   }
                }catch(java.lang.Exception e8){
                   a.y(str, e8.getMessage(), e8);
                   WritableMap writableMap = a.b(str1, e8.getMessage());
                   try{
                      this.c.mReactDatabaseSupplier.g().endTransaction();
                   }catch(java.lang.Exception e4){
                      a.y(str, e4.getMessage(), e4);
                      if (!writableMap) {
                         writableMap = a.b(str1, e4.getMessage());
                      }
                   }
                   str1 = writableMap;
                }catch(java.lang.Exception e8){
                   a.y(str, e8.getMessage(), e8);
                   str1 = a.b(str1, e8.getMessage());
                }
             }catch(java.lang.Exception e8){
             }
             if (str1 != null) {
                objArray = new Object[i];
                objArray[0] = str1;
                this.a.invoke(objArray);
             }else {
                objArray = new Object[0];
                this.a.invoke(objArray);
             }
          }
       }
    }
}
