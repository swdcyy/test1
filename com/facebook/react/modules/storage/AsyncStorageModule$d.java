package com.facebook.react.modules.storage.AsyncStorageModule$d;
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
import java.lang.Exception;
import java.lang.Throwable;
import cb.a;
import com.facebook.react.modules.storage.a;

public class AsyncStorageModule$d extends GuardedAsyncTask	// class@0012ea
{
    public final Callback a;
    public final ReadableArray b;
    public final AsyncStorageModule c;

    public void AsyncStorageModule$d(AsyncStorageModule p0,ReactContext p1,Callback p2,ReadableArray p3){
       this.c = p0;
       this.a = p2;
       this.b = p3;
       super(p1);
    }
    public void doInBackgroundGuarded(Object[] p0){
       Object[] objArray;
       String str = "ReactNative";
       if (PatchProxy.applyVoidOneRefs(p0, this, AsyncStorageModule$d.class, "1")) {
       }else {
          String str1 = null;
          int i = 0;
          if (!this.c.ensureDatabase()) {
             objArray = new Object[]{a.a(str1)};
             this.a.invoke(objArray);
          }else {
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
                                  if (!i1) {
                                  }
                               }
                            label_0066 :
                               a.b(str1, e2.getMessage());
                               break ;
                            }else if(this.b.getArray(i1).getString(i) == null){
                               a.c(str1);
                               this.c.mReactDatabaseSupplier.g().endTransaction();
                               break ;
                            }else if(this.b.getArray(i1).getString(1) == null){
                               a.d(str1);
                               this.c.mReactDatabaseSupplier.g().endTransaction();
                               break ;
                            }else if(!a.d(this.c.mReactDatabaseSupplier.g(), this.b.getArray(i1).getString(i), this.b.getArray(i1).getString(1))){
                               a.a(str1);
                               this.c.mReactDatabaseSupplier.g().endTransaction();
                               break ;
                            }else {
                               i1++;
                            }
                         }catch(java.lang.Exception e2){
                            a.y(str, e2.getMessage(), e2);
                            if (!i1) {
                               goto label_0066 ;
                            }
                         }catch(java.lang.Exception e2){
                            a.y(str, e2.getMessage(), e2);
                            if (!i1) {
                               goto label_0066 ;
                            }
                         }catch(java.lang.Exception e2){
                            a.y(str, e2.getMessage(), e2);
                            if (!i1) {
                               goto label_0066 ;
                            }
                         }
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
                objArray = new Object[]{str1};
                this.a.invoke(objArray);
             }else {
                objArray = new Object[i];
                this.a.invoke(objArray);
             }
          }
       }
    }
}
